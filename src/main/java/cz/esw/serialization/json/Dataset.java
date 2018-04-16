package cz.esw.serialization.json;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Marek Cuchý
 */
public class Dataset {

	private MeasurementInfo info;
	private Map<DataType, List<Double>> records;

	public Dataset() {
	}

	public MeasurementInfo getInfo() {
		return info;
	}

	public void setInfo(MeasurementInfo info) {
		this.info = info;
	}

	public Map<DataType, List<Double>> getRecords() {
		return records;
	}

	public void setRecords(Map<DataType, List<Double>> records) {
		this.records = records;
	}

	//	public void addRecord(DataType type, double value) {
//		records.computeIfAbsent(type, t -> new ArrayList<>()).add(value);
//	}
//
//	public void addRecords(DataType type, List<Double > values){
//		records.computeIfAbsent(type, t->new ArrayList<>()).addAll(values);
//	}

}
