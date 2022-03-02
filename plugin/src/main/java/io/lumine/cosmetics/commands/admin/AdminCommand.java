package io.lumine.cosmetics.commands.admin;

import java.util.Collections;
import java.util.List;

import org.bukkit.command.CommandSender;

import io.lumine.cosmetics.MCCosmeticsPlugin;
import io.lumine.cosmetics.commands.CommandHelper;
import io.lumine.cosmetics.constants.Permissions;
import io.lumine.utils.commands.Command;

public class AdminCommand extends Command<MCCosmeticsPlugin> {

    public AdminCommand(MCCosmeticsPlugin plugin) {
        super(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        CommandHelper.sendSuccess(sender, "MCCosmetics has been reloaded.");
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return Collections.emptyList();
    }

    @Override
    public String getPermissionNode() {
        return Permissions.COMMAND_ADMIN;
    }

    @Override
    public boolean isConsoleFriendly() {
        return true;
    }

    @Override
    public String getName() {
        return null;
    }
}