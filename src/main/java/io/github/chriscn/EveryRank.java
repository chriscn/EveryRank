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

        }
    }

}
