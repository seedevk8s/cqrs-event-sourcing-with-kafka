package com.test.account.query.api.queries;

import com.test.account.query.api.dto.EqualityType;
import com.test.cqrs.core.queries.BaseQuery;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class FindAccountWithBalanceQuery extends BaseQuery {
    private EqualityType equalityType;
    private double balance;
}
