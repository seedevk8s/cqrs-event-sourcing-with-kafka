package com.test.account.common.events;

import com.test.cqrs.core.events.BaseEvent;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
public class AccountClosedEvent extends BaseEvent {
}
