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

	// <command> < >
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
				String Message  = args[0].toString();
				
				player.sendMessage(ChatColor.GRAY + player.getDisplayName() + ChatColor.WHITE +  ": " + Message);
				player.sendMessage(ChatColor.GREEN + "[VIP] "+ player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.AQUA + "[MVP] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.AQUA + "[MVP" + ChatColor.RED + ChatColor.RED + "+" + ChatColor.AQUA + "] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.BLUE + "[JR HELPER] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.BLUE + "[HELPER] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.DARK_GREEN + "[MOD] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.RED + "[ADMIN] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.RED + "[OWNER] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.RED + "[SLOTH] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM" + ChatColor.RED + "+" + ChatColor.DARK_AQUA + "] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message);
				player.sendMessage(ChatColor.GOLD + "[MOJANG] " + player.getDisplayName() + ": " + ChatColor.WHITE + Message);
				return true;
			}
			else if(args.length == 2) {
				String Message  = args[0].toString();
				String Message2 = args[1].toString();
				
				player.sendMessage(ChatColor.GRAY + player.getDisplayName() + ChatColor.WHITE +  ": " + Message + Message2);
				player.sendMessage(ChatColor.GREEN + "[VIP] "+ player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.AQUA + "[MVP] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.AQUA + "[MVP" + ChatColor.RED + ChatColor.RED + "+" + ChatColor.AQUA + "] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.BLUE + "[JR HELPER] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.BLUE + "[HELPER] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.DARK_GREEN + "[MOD] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.RED + "[ADMIN] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.RED + "[OWNER] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.RED + "[SLOTH] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.DARK_AQUA + "[BUILD TEAM" + ChatColor.RED + "+" + ChatColor.DARK_AQUA + "] " + player.getDisplayName() + ChatColor.WHITE + ": " + Message + Message2);
				player.sendMessage(ChatColor.GOLD + "[MOJANG] " + player.getDisplayName() + ": " + ChatColor.WHITE + Message + Message2);
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
