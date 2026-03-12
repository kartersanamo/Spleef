package com.kartersanamo.spleef.api.commands;

import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public abstract class SubCommand {

    public abstract String getName();

    public abstract String getDescription();

    public abstract String getUsage();

    public abstract String getPermission();

    public boolean canExecute(final CommandSender sender) {
        final String permission = getPermission();
        return permission == null || permission.isEmpty() || sender.hasPermission(permission);
    }

    public abstract boolean execute(CommandSender sender, String[] args);

    public List<String> tabComplete(final CommandSender sender, final String[] args) {
        return Collections.emptyList();
    }
}
