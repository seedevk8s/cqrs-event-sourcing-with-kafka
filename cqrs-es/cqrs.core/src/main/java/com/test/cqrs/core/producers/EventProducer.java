package com.test.cqrs.core.producers;

import com.test.cqrs.core.events.BaseEvent;

public interface EventProducer {
    void produce(String topic, BaseEvent event);
}
