package cz.esw.serialization.json;

/**
 * @author Marek Cuchý
 */
public record MeasurementInfo(int id, long timestamp, String measurerName) {


    public MeasurementInfo(int id, long timestamp, String measurerName) {
        this.id = id;
        this.timestamp = timestamp;
        this.measurerName = measurerName;
    }

    public int getId() {
        return  id;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public String getMeasurerName() {
        return measurerName;
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






