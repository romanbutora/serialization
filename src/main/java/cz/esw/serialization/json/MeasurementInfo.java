package cz.esw.serialization.json;

/**
 * @author Marek Cuchý
 */
public class MeasurementInfo {

	private int id;
	private long timestamp;
	private String measurerName;

	public MeasurementInfo() {
	}

	public MeasurementInfo(int id, long timestamp, String measurerName) {
		this.id = id;
		this.timestamp = timestamp;
		this.measurerName = measurerName;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

	public String getMeasurerName() {
		return measurerName;
	}

	public void setMeasurerName(String measurerName) {
		this.measurerName = measurerName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}


	@Override
	public String toString() {
		return "{" +
				"id=" + id +
				", timestamp=" + timestamp +
				", measurerName='" + measurerName + '\'' +
				'}';
	}
}
