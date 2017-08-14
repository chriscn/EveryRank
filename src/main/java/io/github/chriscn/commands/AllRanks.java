package io.github.chriscn.commands;

import io.github.chriscn.util.RankUtil;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class AllRanks implements CommandExecutor {

    RankUtil r = new RankUtil();

    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(!(sender instanceof Player)) {
            sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
            return true;
        } else {
            Player p = (Player) sender;
            String pN = args[0];

            if(args.length == 0) { //no argument
                p.sendMessage(ChatColor.GRAY + pN);
                for(String rank : r.ranks) {
                    p.sendMessage(rank + " " + pN);
                }
            } else {
                String msg = buildString(args);
                p.sendMessage(ChatColor.GRAY + pN + ": " + msg);
                for(String rank : r.ranks) {
                    p.sendMessage(rank + " " + pN + ChatColor.WHITE + ": " + msg);
                }
            }
            return true;
        }
    }

    private String buildString(String[] args) {
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < args.length; i++) {
            sb.append(args[i]).append(" ");
        }
        return sb.toString().trim();
    }

}
