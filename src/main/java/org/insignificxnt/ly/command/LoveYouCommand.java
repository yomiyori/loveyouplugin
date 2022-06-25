package org.insignificxnt.ly.command;

import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.insignificxnt.ly.LoveYou;

public class LoveYouCommand implements CommandExecutor {

    private LoveYou plugin;

    public LoveYouCommand(LoveYou plugin) {
        this.plugin = plugin;
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        String messageToSend = plugin.getConfig().getString("message");
        sender.sendMessage(messageToSend);
        return true;
    }
}
