package cn.edu.thu;

//import org.apache.iotdb.session.IoTDBSessionException;
//import org.apache.iotdb.session.Session;
//import org.apache.iotdb.tsfile.file.metadata.enums.CompressionType;
//import org.apache.iotdb.tsfile.file.metadata.enums.TSDataType;
//import org.apache.iotdb.tsfile.file.metadata.enums.TSEncoding;
//import org.apache.iotdb.tsfile.write.record.RowBatch;
//import org.apache.iotdb.tsfile.write.schema.MeasurementSchema;
//import org.apache.iotdb.tsfile.write.schema.Schema;

public class SessionInsert {

  public static long count = 1000;
  public static int deviceNum = 100;
  public static int sensorNum = 600;

  public static void main(String[] args) {

//    long totalPoints = deviceNum * sensorNum * count;
//    System.out.println("total insert data points: " + totalPoints);
//
//    Session session = new Session("127.0.0.1", 6667, "root", "root");
//    session.open();
//
//    // create storage group
//    session.setStorageGroup("root.juanbao");
//
//    System.out.println("start to create tieseries");
//
//    // create timeseries
//    for (int deviceId = 1; deviceId <= deviceNum; deviceId++) {
//      for (int sensorId = 1; sensorId <= sensorNum; sensorId++) {
//        String path = String.format("root.juanbao.d%s.s%s", deviceId, sensorId);
//        session.createTimeseries(path, TSDataType.INT64, TSEncoding.RLE, CompressionType.SNAPPY);
//      }
//    }
//
//    System.out.println("create tieseries ok");
//
//    // example of text and float datatype
////    session.createTimeseries("root.sg1.d1.s1", TSDataType.TEXT, TSEncoding.PLAIN, CompressionType.SNAPPY);
////    session.createTimeseries("root.sg1.d1.s2", TSDataType.FLOAT, TSEncoding.PLAIN, CompressionType.SNAPPY);
//
//    // used to create row batch
//    Schema schema = new Schema();
//    for (int sensorId = 1; sensorId <= sensorNum; sensorId++) {
//      schema.registerMeasurement(
//          new MeasurementSchema("s" + sensorId, TSDataType.INT64, TSEncoding.RLE));
//    }
//
//    System.out.println("start to insert data");
//
//    long start = System.currentTimeMillis();
//
//    for (int deviceId = 1; deviceId <= deviceNum; deviceId++) {
//      String devicePath = String.format("root.juanbao.d%s", deviceId);
//
//      // set maxBatchSize to 1000 could reach 13500000 points/s
//      RowBatch rowBatch = schema.createRowBatch(devicePath, 1);
//
//      long[] timestamps = rowBatch.timestamps;
//      Object[] values = rowBatch.values;
//
//      for (long time = 0; time < count; time++) {
//        int row = rowBatch.batchSize++;
//        timestamps[row] = time;
//        for (int i = 0; i < sensorNum; i++) {
//          long[] sensor = (long[]) values[i];
//          sensor[row] = time;
//        }
//        if (rowBatch.batchSize == rowBatch.getMaxBatchSize()) {
//          session.insertBatch(rowBatch);
//          rowBatch.reset();
//        }
//      }
//
//      if (rowBatch.batchSize != 0) {
//        session.insertBatch(rowBatch);
//        rowBatch.reset();
//      }
//    }
//
//    start = System.currentTimeMillis() - start;
//    long speed = totalPoints / start * 1000;
//    System.out.println("total cost " + start + "ms");
//    System.out.println("insert speed " + speed + "points/s");
//
//    session.close();
  }
}
