package com.thorindev;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.plugin.java.JavaPlugin;

import net.md_5.bungee.api.ChatColor;

public class EveryRank extends JavaPlugin {

	@Override
	public void onEnable() {
		getLogger().info("Enabling EveryRank");
	}
	@Override
	public void onDisable() {
		getLogger().info("Disabling EveryRank");
	}

	// <command> <message>
	public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
		Player player = (Player) sender;
		
		if(cmd.getName().equalsIgnoreCase("everyrank")) {
			if(args.length == 0) {
				player.sendMessage(ChatColor.GRAY + player.getDisplayName());
				player.sendMessage(ChatColor.GREEN + "[VIP] "+ player.getDisplayName());
				player.sendMessage(ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + player.getDisplayName());
				player.sendMessage(ChatColor.AQUA + "[MVP] " + player.getDisplayName());
				player.sendMessage(ChatColor.AQUA + "[MVP" + ChatColor.RED + ChatColor.RED + "+" + ChatColor.AQUA + "] " + player.getDisplayName());
				player.sendMessage(ChatColor.BLUE + "[JR HELPER] " + player.getDisplayName());
				player.sendMessage(ChatColor.BLUE + "[HELPER] " + player.getDisplayName());
				player.sendMessage(ChatColor.DARK_GREEN + "[MOD] " + player.getDisplayName());
				player.sendMessage(ChatColor.RED + "[ADMIN] " + player.getDisplayName());
				player.sendMessage(ChatColor.RED + "[OWNER] " + player.getDisplayName());
				player.sendMessage(ChatColor.RED + "[SLOTH] " + player.getDisplayName());
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM] " + player.getDisplayName());
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM" + ChatColor.RED + "+" + ChatColor.DARK_AQUA + "] " + player.getDisplayName());
				player.sendMessage(ChatColor.GOLD + "[MOJANG] " + player.getDisplayName());
				player.sendMessage(ChatColor.GOLD + "[YT] " + player.getDisplayName());
				return true;
			}
			else if(args.length == 1) {
				String Message = args[1];
				player.sendMessage(ChatColor.GRAY + player.getDisplayName() + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.GREEN + "[VIP] "+ ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.AQUA + "[MVP] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.AQUA + "[MVP" + ChatColor.RED + ChatColor.RED + "+" + ChatColor.AQUA + "] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.BLUE + "[JR HELPER] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.BLUE + "[HELPER] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.DARK_GREEN + "[MOD] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.RED + "[ADMIN] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.RED + "[OWNER] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.RED + "[SLOTH] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM" + ChatColor.RED + "+" + ChatColor.DARK_AQUA + "] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.GOLD + "[MOJANG] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				player.sendMessage(ChatColor.GOLD + "[YT] " + ChatColor.WHITE + player.getDisplayName() + ": " +  Message);
				return true;
			}
			else { 
				player.sendMessage(ChatColor.RED + "You can only have a one-or-two word message.");
				return true;
			}
		}
		
		return false;
	}
}
