package io.github.chriscn;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

public class EveryRank extends JavaPlugin {

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
            if(!(sender instanceof Player)) {
                sender.sendMessage(ChatColor.RED + "You must be a player to use this command!");
                return true;
            } else {
                Player p = (Player) sender;
                String pN = p.getDisplayName();

                if(args.length == 0) {
                    p.sendMessage(ChatColor.GRAY + pN);
                    p.sendMessage(ChatColor.GREEN + "[VIP] " + pN);
                    p.sendMessage(ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + pN);
                    p.sendMessage(ChatColor.GREEN + "[LOL] " + pN);
                    p.sendMessage(ChatColor.GREEN + "[LOL" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + pN);
                    p.sendMessage(ChatColor.AQUA + "[MVP] " + pN);
                    p.sendMessage(ChatColor.AQUA + "[MVP" + ChatColor.RED + ChatColor.RED + "+" + ChatColor.AQUA + "] " + pN);
                    p.sendMessage(ChatColor.BLUE + "[JR HELPER] " + pN);
                    p.sendMessage(ChatColor.BLUE + "[HELPER] " + pN);
                    p.sendMessage(ChatColor.DARK_GREEN + "[MOD] " + pN);
                    p.sendMessage(ChatColor.RED + "[ADMIN] " + pN);
                    p.sendMessage(ChatColor.RED + "[OWNER] " + pN);
                    p.sendMessage(ChatColor.RED + "[SLOTH] " + pN);
                    p.sendMessage(ChatColor.RED + "[ANGUS] " + pN);
                    p.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM] " + pN);
                    p.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM" + ChatColor.RED + "+" + ChatColor.DARK_AQUA + "] " + pN);
                    p.sendMessage(ChatColor.GOLD + "[MOJANG] " + pN);
                    p.sendMessage(ChatColor.GOLD + "[YT] " + pN);
                    p.sendMessage(ChatColor.GOLD + "[APPLE] " + pN);
                    p.sendMessage(ChatColor.RED + "[" + ChatColor.GREEN + "MC" + ChatColor.GRAY + "ProHosting" + ChatColor.RED + "] " + pN);
                    return true;
                }
            }

            return false;
        } else {
            return false;
        }
    }
}