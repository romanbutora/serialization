package cz.esw.serialization;

import cz.esw.serialization.handler.DataHandler;
import cz.esw.serialization.json.DataType;
import org.apache.commons.lang.time.StopWatch;

import java.io.IOException;
import java.util.Random;

/**
 * @author Marek Cuchý (CVUT)
 */
public class DataProducer {

	private static final String[] NAMES = {"honza", "petr", "michal", "jirka"};

	private final Random rnd;
	private final int numberOfDatasets;
	private final int datasetSize;

	/**
	 * @param rnd
	 * @param numberOfDatasets total number of datasets that will be generated
	 * @param datasetSize      number of values per value type to be generated
	 */
	public DataProducer(Random rnd, int numberOfDatasets, int datasetSize) {
		this.rnd = rnd;
		this.numberOfDatasets = numberOfDatasets;
		this.datasetSize = datasetSize;
	}

	public void generateDataAndCheckResults(DataHandler handler) throws IOException {
		StopWatch watch = new StopWatch();
		ResultChecker checker = new ResultChecker();
		watch.start();
		handler.start();
		checker.start();
		int[] ids = rnd.ints(0, Integer.MAX_VALUE).distinct().limit(numberOfDatasets).toArray();
		for (int id : ids) {
			String name = NAMES[rnd.nextInt(NAMES.length)];
			long timestamp = System.currentTimeMillis();
			handler.handleNewDataset(id, timestamp, name);
			checker.handleNewDataset(id, timestamp, name);
			for (int i = 0; i < datasetSize; i++) {
				for (DataType dataType : DataType.values()) {
					double value = generateValue(dataType);
					handler.handleValue(id, dataType, value);
					checker.handleValue(id, dataType, value);
				}
			}
		}
		StopWatch resultWatch = new StopWatch();
		resultWatch.start();
		handler.getResults(checker);
		resultWatch.split();
		System.out.println("Time needed to send and receive data: " + resultWatch.getSplitTime() + "ms");
		checker.checkResults();
		watch.stop();
		System.out.println("Total time: " + watch.getTime() + "ms");
		System.out.println("Data are correct.");

	}

	private double generateValue(DataType dataType) {
		switch (dataType) {
			case DOWNLOAD:
				return rnd.nextInt(90000) + 10000;
			case UPLOAD:
				return rnd.nextInt(9000) + 1000;
			case PING:
				return rnd.nextInt(1000);
		}
		throw new IllegalStateException("Unreachable code.");
	}

}
