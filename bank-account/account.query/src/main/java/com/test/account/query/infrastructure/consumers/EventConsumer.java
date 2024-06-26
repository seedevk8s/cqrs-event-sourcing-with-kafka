package com.test.account.query.infrastructure.consumers;

import org.springframework.kafka.support.Acknowledgment;
import org.springframework.messaging.handler.annotation.Payload;

import com.test.account.common.events.AccountClosedEvent;
import com.test.account.common.events.AccountOpenedEvent;
import com.test.account.common.events.FundsDepositedEvent;
import com.test.account.common.events.FundsWithdrawnEvent;

public interface EventConsumer {
    void consume(@Payload AccountOpenedEvent event, Acknowledgment ack);

    void consume(@Payload FundsDepositedEvent event, Acknowledgment ack);

    void consume(@Payload FundsWithdrawnEvent event, Acknowledgment ack);

    void consume(@Payload AccountClosedEvent event, Acknowledgment ack);

}
