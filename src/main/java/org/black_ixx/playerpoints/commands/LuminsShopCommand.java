package org.black_ixx.playerpoints.commands;

import org.black_ixx.playerpoints.PlayerPoints;
import org.black_ixx.playerpoints.manager.CommandManager;
import org.bukkit.Bukkit;
import org.bukkit.command.CommandSender;

import java.util.Collections;
import java.util.List;

public class LuminsShopCommand extends PointsCommand{
    public LuminsShopCommand() {
        super("shop", CommandManager.CommandAliases.SHOP);
    }

    @Override
    public void execute(PlayerPoints plugin, CommandSender sender, String[] args) {
        Bukkit.dispatchCommand(sender, "luminshop");
    }

    @Override
    public List<String> tabComplete(PlayerPoints plugin, CommandSender sender, String[] args) {
        return Collections.emptyList();
    }
}
