package cn.edu.thu;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class Query {

  public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("org.apache.iotdb.jdbc.IoTDBDriver");
    try (Connection connection = DriverManager
        .getConnection("jdbc:iotdb://127.0.0.1:6667/", "root", "root");
        Statement statement = connection.createStatement()) {

      ResultSet resultSet = statement.executeQuery("select s1,s2,s3,s4,s5,s6,s7,s8,s9,s10 from root.juanbao.d1 where time >= 980 and time < 1000");
      outputResult(resultSet);
      resultSet = statement.executeQuery("select d100.s1,d2.s1,d3.d1,d4.s1,d5.s1 from root.juanbao where time >= 980 and time < 1000");
      outputResult(resultSet);
      resultSet = statement.executeQuery("select count(s1),count(s2),count(s3) from root.juanbao.d1");
      outputResult(resultSet);
      resultSet = statement.executeQuery("select mean(s1),sum(s2),count(s3) from root.juanbao.d1 where time >= 1 and time <= 1000 group by (100ms, 0, [0, 999])");
      outputResult(resultSet);
    }
  }

  private static void outputResult(ResultSet resultSet) throws SQLException {
    if (resultSet != null) {
      System.out.println("--------------------------");
      final ResultSetMetaData metaData = resultSet.getMetaData();
      final int columnCount = metaData.getColumnCount();
      for (int i = 0; i < columnCount; i++) {
        System.out.print(metaData.getColumnLabel(i + 1) + " ");
      }
      System.out.println();
      while (resultSet.next()) {
        for (int i = 1; ; i++) {
          System.out.print(resultSet.getString(i));
          if (i < columnCount) {
            System.out.print(", ");
          } else {
            System.out.println();
            break;
          }
        }
      }
      System.out.println("--------------------------\n");
    }
  }

}
