package cz.esw.serialization.handler;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import cz.esw.serialization.ResultConsumer;
import cz.esw.serialization.json.DataType;
import cz.esw.serialization.json.Dataset;
import cz.esw.serialization.json.MeasurementInfo;
import cz.esw.serialization.json.Result;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Map;

/**
 * @author Marek Cuchý (CVUT)
 */
public class JsonDataHandler implements DataHandler {


	private static final ObjectMapper MAPPER;

	static{
		//prevent socket from closing on write and read JSON
		JsonFactory factory = new JsonFactory();
		factory.disable(JsonGenerator.Feature.AUTO_CLOSE_TARGET);
		factory.disable(JsonParser.Feature.AUTO_CLOSE_SOURCE);
		MAPPER = new ObjectMapper(factory);
	}

	private final InputStream is;
	private final OutputStream os;

	protected Map<Integer, Dataset> datasets;

	/**
	 * @param is
	 * 		input stream from which the results will be read
	 * @param os
	 * 		output stream to which the data have to written
	 */
	public JsonDataHandler(InputStream is, OutputStream os) {
		this.is = is;
		this.os = os;
	}

	@Override
	public void start() {
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
		MAPPER.writeValue(os, datasets.values().toArray());
		os.write(0); //write end
		Result[] results = MAPPER.readValue(is, Result[].class);
		for (Result result : results) {
			MeasurementInfo info = result.getInfo();
			consumer.acceptMeasurementInfo(info.getId(), info.getTimestamp(), info.getMeasurerName());
			result.getAverages().forEach(consumer::acceptResult);
		}
	}
}
