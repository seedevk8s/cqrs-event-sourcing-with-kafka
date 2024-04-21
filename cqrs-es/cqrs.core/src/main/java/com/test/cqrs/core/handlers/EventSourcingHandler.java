package com.test.cqrs.core.handlers;

import com.test.cqrs.core.domain.AggregateRoot;

public interface EventSourcingHandler<T> {
    void save(AggregateRoot aggregateRoot);

    T getById(String id);

    void republishEvents();
}
