package io.github.chriscn;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class EveryRank extends JavaPlugin {

    RankUtil r = new RankUtil();

    @Override
    public void onEnable() {
        getLogger().info(getDescription().getName() + " has been enabled!");
    }

    @Override
    public void onDisable() {
        getLogger().info(getDescription().getName() + " has been disabled!");

    }

    @Override
    public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
        if(cmd.getName().equalsIgnoreCase("everyrank")) {
            // everyrank <CUSTOMNAME/playersname> <IF ARGS MESSAGE>

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
            }
            return false;
        } else {
            return false;
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