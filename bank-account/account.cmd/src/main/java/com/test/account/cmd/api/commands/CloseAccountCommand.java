package com.test.account.cmd.api.commands;

import com.test.cqrs.core.commands.BaseCommand;

public class CloseAccountCommand extends BaseCommand {
    public CloseAccountCommand(String id) {
        super(id);
    }
}
