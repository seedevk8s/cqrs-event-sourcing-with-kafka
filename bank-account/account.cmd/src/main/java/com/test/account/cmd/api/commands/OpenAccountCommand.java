package com.test.account.cmd.api.commands;

import com.test.account.common.dto.AccountType;
import com.test.cqrs.core.commands.BaseCommand;

import lombok.Data;

@Data
public class OpenAccountCommand extends BaseCommand {
    private String accountHolder;
    private AccountType accountType;
    private double openingBalance;
}
