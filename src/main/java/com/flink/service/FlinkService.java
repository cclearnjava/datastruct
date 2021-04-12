package com.flink.service;

import com.alibaba.fastjson.JSONObject;
import org.apache.commons.lang3.StringUtils;
import org.apache.flink.api.common.functions.MapFunction;
import org.apache.flink.api.common.serialization.SimpleStringSchema;
import org.apache.flink.streaming.api.TimeCharacteristic;
import org.apache.flink.streaming.api.datastream.DataStream;
import org.apache.flink.streaming.api.environment.StreamExecutionEnvironment;
import org.apache.flink.streaming.api.functions.sink.SinkFunction;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaConsumer010;
import org.apache.flink.streaming.connectors.kafka.FlinkKafkaProducer010;

import java.util.Properties;

public class FlinkService {

    public static void main(String[] args) throws Exception {
        final StreamExecutionEnvironment env = StreamExecutionEnvironment.getExecutionEnvironment();
        env.setStreamTimeCharacteristic(TimeCharacteristic.EventTime);

        env.enableCheckpointing(5000);

        FlinkKafkaConsumer010<String> myConsumer = createKafkaConsumer();


        DataStream<String> stream = env.addSource(myConsumer);

        DataStream<String> counts = stream.map(new MapFunction<String, JSONObject>() {
            @Override
            public JSONObject map(String s) throws Exception {
                if (StringUtils.isEmpty(s)) {
                    return new JSONObject();
                }
                return JSONObject.parseObject(s);
            }
        }).map(new MapFunction<JSONObject, String>() {
            @Override
            public String map(JSONObject value) throws Exception {
                value.put("result", "world");
                value.put("response_timestamp", System.currentTimeMillis());
                return JSONObject.toJSONString(value);
            }
        });

        counts.addSink(createKafkaProducer()).name("flink-connectors-kafka").setParallelism(4);
        env.execute("FLinkService");
    }

    private static SinkFunction<String> createKafkaProducer() {
        Properties properties = new Properties();
        properties.setProperty("bootstrap.servers", "localhost:9092");

        return new FlinkKafkaProducer010<>("response",
                new SimpleStringSchema(), properties);
    }

    private static FlinkKafkaConsumer010<String> createKafkaConsumer() {
        Properties properties = new Properties();
        properties.setProperty("zookeeper.connect", "localhost:2181");
        properties.setProperty("bootstrap.servers", "localhost:9092");
        properties.setProperty("group.id", "test");
        properties.setProperty("enable.auto.commit", "true");
        properties.setProperty("auto.commit.interval.ms", "1000");
        properties.setProperty("auto.offset.reset", "earliest");
        properties.setProperty("session.timeout.ms", "30000");

        FlinkKafkaConsumer010<String> consumer010 = new FlinkKafkaConsumer010<String>("request",
                new SimpleStringSchema(), properties);
        consumer010.setStartFromLatest();
        return consumer010;
    }
}
