## An example of Using IoTDB

## Install maven dependency

```
git clone https://github.com/apache/incubator-iotdb.git
cd incubator-iotdb
mvn clean install -DskipTests
```

## deploy IoTDB

```
cd incubator-iotdb
mvn clean package -DskipTests

unzip distribution/target/apache-iotdb-0.9.0-SNAPSHOT-incubating-bin.zip

./sbin/start-server.sh
```

## Run Insert

## Run Query