package cz.esw.serialization.handler;

import cz.esw.serialization.ResultConsumer;
import cz.esw.serialization.json.DataType;
import cz.esw.serialization.json.Dataset;
import cz.esw.serialization.json.MeasurementInfo;
import cz.esw.serialization.json.Result;
import cz.esw.serialization.*;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.*;

/**
 * @author Marek Cuchý (CVUT)
 */
public class ProtoDataHandler implements DataHandler {
	private final InputStream is;
	private final OutputStream os;

	protected Map<Integer, Dataset> datasets;

	public ProtoDataHandler(InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
	}

	@Override
	public void initialize() {
		datasets = new HashMap<>();
	}

	@Override
	public void handleNewDataset(int datasetId, long timestamp, String measurerName) {
		Dataset dataset = new Dataset();
		dataset.setInfo(new MeasurementInfo(datasetId, timestamp, measurerName));
		dataset.setRecords(new EnumMap<>(DataType.class));
		datasets.put(datasetId, dataset);
	}

	@Override
	public void handleValue(int datasetId, DataType type, double value) {
		Dataset dataset = datasets.get(datasetId);
		if (dataset == null) {
			throw new IllegalArgumentException("Dataset with id " + datasetId + " not initialized.");
		}
		dataset.getRecords().computeIfAbsent(type, t -> new ArrayList<>()).add(value);
	}

	@Override
	public void getResults(ResultConsumer consumer) throws IOException {
		//convert datasets to JSON and write them to the output stream

		cz.esw.serialization.proto.PDatasets.Builder pDatasets = cz.esw.serialization.proto.PDatasets.newBuilder();
		for (Dataset dataset : datasets.values()){
			cz.esw.serialization.proto.PDataset.Builder pdataset = cz.esw.serialization.proto.PDataset.newBuilder();
			cz.esw.serialization.proto.PMeasurementInfo.Builder pMeasurementInfo = cz.esw.serialization.proto.PMeasurementInfo.newBuilder()
					.setId(dataset.getInfo().getId())
					.setTimestamp(dataset.getInfo().getTimestamp())
					.setMeasurerName(dataset.getInfo().getMeasurerName());
			pdataset.setInfo(pMeasurementInfo.build());
			for (Map.Entry<DataType, List<Double>> entry : dataset.getRecords().entrySet()){
				cz.esw.serialization.proto.Doubles.Builder doubles = cz.esw.serialization.proto.Doubles.newBuilder();
				doubles.addAllValue(entry.getValue());
				pdataset.putRecords(entry.getKey().name(),doubles.build());
			}
			pDatasets.addPdataset(pdataset.build());
		}
		System.out.println(pDatasets.build().getSerializedSize());
		String s = String.valueOf(pDatasets.build().getSerializedSize()) + '\n';
		os.write(s.getBytes());
		pDatasets.build().writeTo(os);

		cz.esw.serialization.proto.PResults pResults = cz.esw.serialization.proto.PResults.parseFrom(is);
		for (cz.esw.serialization.proto.PResult result: pResults.getResultsList()){
			cz.esw.serialization.proto.PMeasurementInfo measurementInfo = result.getInfo();
			consumer.acceptMeasurementInfo(measurementInfo.getId(),measurementInfo.getTimestamp(),measurementInfo.getMeasurerName());
			result.getAveragesMap().forEach((k,v) -> consumer.acceptResult(DataType.valueOf(k),v));
		}
	}
}