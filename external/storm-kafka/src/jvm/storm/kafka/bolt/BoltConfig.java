package storm.kafka.bolt;

import java.util.Map;

public class BoltConfig {
    public String topic;

    public Map properties;

    public BoltConfig(String topic, Map properties) {
        this.topic = topic;
        this.properties = properties;
    }
}