package cz.esw.serialization.handler;

import cz.esw.serialization.ResultConsumer;
import cz.esw.serialization.json.DataType;

import java.io.IOException;

/**
 * @author Marek Cuchý (CVUT)
 */
public interface DataHandler {

	public void start();

	public void handleNewDataset(int datasetId, long timestamp, String measurerName);

	public void handleValue(int datasetId, DataType type, double value);

	public void getResults(ResultConsumer consumer) throws IOException;

}
