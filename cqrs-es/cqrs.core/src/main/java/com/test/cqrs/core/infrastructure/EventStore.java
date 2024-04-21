package com.test.cqrs.core.infrastructure;

import java.util.List;

import com.test.cqrs.core.events.BaseEvent;

public interface EventStore {
    void saveEvents(String aggregateId, Iterable<BaseEvent> events, int expectedVersion);

    List<BaseEvent> getEvents(String aggregateId);

    List<String> getAggregateIds();
}
