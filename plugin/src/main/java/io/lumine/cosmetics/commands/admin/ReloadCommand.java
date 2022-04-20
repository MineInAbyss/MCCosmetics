package io.lumine.cosmetics.commands.admin;

import io.lumine.cosmetics.MCCosmeticsPlugin;
import io.lumine.cosmetics.commands.CommandHelper;
import io.lumine.cosmetics.constants.Permissions;
import io.lumine.utils.commands.Command;
import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public class ReloadCommand extends Command<MCCosmeticsPlugin> {

    public ReloadCommand(AdminCommand plugin) {
        super(plugin);
    }

    @Override
    public boolean onCommand(CommandSender sender, String[] args) {
        getPlugin().reloadConfiguration();

        getPlugin().getMenuManager().reload();
        
        getPlugin().getProfiles().reloadAllCosmetics();

        CommandHelper.sendSuccess(sender, "MCCosmetics has been reloaded.");
        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, String[] args) {
        return Collections.emptyList();
    }

    @Override
    public String getPermissionNode() {
        return Permissions.COMMAND_RELOAD;
    }

    @Override
    public boolean isConsoleFriendly() {
        return true;
    }

    @Override
    public String getName() {
        return "reload";
    }
}