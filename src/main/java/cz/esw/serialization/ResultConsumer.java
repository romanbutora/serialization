package cz.esw.serialization;

import cz.esw.serialization.json.DataType;

/**
 * @author Marek Cuchý (CVUT)
 */
public interface ResultConsumer {

	public void acceptMeasurementInfo(int resultId, long timestamp, String measurerName);

	public void acceptResult(DataType type, double result);
}
