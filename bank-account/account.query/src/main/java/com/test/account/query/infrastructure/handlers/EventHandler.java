package com.test.account.query.infrastructure.handlers;

import com.test.account.common.events.AccountClosedEvent;
import com.test.account.common.events.AccountOpenedEvent;
import com.test.account.common.events.FundsDepositedEvent;
import com.test.account.common.events.FundsWithdrawnEvent;

public interface EventHandler {
    void on(AccountOpenedEvent event);

    void on(FundsDepositedEvent event);

    void on(FundsWithdrawnEvent event);

    void on(AccountClosedEvent event);
}
