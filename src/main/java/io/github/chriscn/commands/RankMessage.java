package io.github.chriscn.commands;

import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class RankMessage implements CommandExecutor {
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
            return true;
        } else {
            Player p = (Player) sender;
            String pN = args[0];
            //rankmessage <RANK> <PLAYERNAME> <MESSAGE>



            return true;
        }
    }

}
