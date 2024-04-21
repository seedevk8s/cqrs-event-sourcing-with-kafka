package com.test.account.cmd.api.commands;

import com.test.cqrs.core.commands.BaseCommand;

import lombok.Data;

@Data
public class DepositFundsCommand extends BaseCommand {
    private double amount;
}
