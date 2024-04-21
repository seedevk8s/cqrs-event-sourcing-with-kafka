package com.test.cqrs.core.queries;

import java.util.List;

import com.test.cqrs.core.domain.BaseEntity;

@FunctionalInterface
public interface QueryHandlerMethod<T extends BaseQuery> {
    List<BaseEntity> handle(T query);
}
