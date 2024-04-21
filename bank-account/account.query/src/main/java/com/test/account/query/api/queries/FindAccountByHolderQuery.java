package com.test.account.query.api.queries;

import com.test.cqrs.core.queries.BaseQuery;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountByHolderQuery extends BaseQuery {
    private String accountHolder;
}
