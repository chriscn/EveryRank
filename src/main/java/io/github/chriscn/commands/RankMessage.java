package io.github.chriscn.commands;

import io.github.chriscn.util.RANKS;
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
            String rank = args[0].toLowerCase();
            String pN = args[1];

            StringBuilder sb = new StringBuilder();
            for(int i = 2; i < args.length; i++) {
                sb.append(args[i]).append(" ");
            }

            String msg = ChatColor.translateAlternateColorCodes('&', sb.toString().trim());

            switch(rank) {
                default:
                    printHelp(p);
                    break;
                case "":
                    printHelp(p);
                    break;
                case "default":
                    p.sendMessage(ChatColor.GRAY + pN + ": " + msg);
                    break;
                case "vip":
                    printMessage(p, pN, RANKS.VIP, msg);
                    break;
                case "vip_plus":
                    printMessage(p, pN, RANKS.VIP_PLUS, msg);
                    break;
                case "lol":
                    printMessage(p, pN, RANKS.LOL, msg);
                    break;
                case "lol_plus":
                    printMessage(p, pN, RANKS.LOL_PLUS, msg);
                    break;
                case "mvp":
                    printMessage(p, pN, RANKS.MVP, msg);
                    break;
                case "mvp_plus":
                    printMessage(p, pN, RANKS.MVP_PLUS, msg);
                    break;
                case "jrhelper":
                    printMessage(p, pN, RANKS.JR_HELPER, msg);
                    break;
                case "helper":
                    printMessage(p, pN, RANKS.HELPER, msg);
                    break;
                case "mod":
                    printMessage(p, pN, RANKS.MOD, msg);
                    break;
                case "admin":
                    printMessage(p, pN, RANKS.ADMIN, msg);
                    break;
                case "owner":
                    printMessage(p, pN, RANKS.OWNER, msg);
                    break;
                case "sloth":
                    printMessage(p, pN, RANKS.SLOTH, msg);
                    break;
                case "angus":
                    printMessage(p, pN, RANKS.ANGUS, msg);
                    break;
                case "buildteam":
                    printMessage(p, pN, RANKS.BUILD_TEAM, msg);
                    break;
                case "buildteam_plus":
                    printMessage(p, pN, RANKS.BUILD_TEAM_PLUS, msg);
                    break;
                case "mojang":
                    printMessage(p, pN, RANKS.MOJANG, msg);
                    break;
                case "youtube":
                    printMessage(p, pN, RANKS.YOUTUBE, msg);
                    break;
                case "apple":
                    printMessage(p, pN, RANKS.APPLE, msg);
                    break;
                case "mcprohosting":
                    printMessage(p, pN, RANKS.MCPROHOSTING, msg);
                    break;
            }

            //rankmessage <RANK> <PLAYERNAME> <MESSAGE>



            return true;
        }
    }


    private void printMessage(Player p, String pN, RANKS rank, String msg) {
        p.sendMessage(rank.getRank() + " " + pN + ChatColor.WHITE + ": " + msg);
    }

    private void printHelp(Player p) {
        p.sendMessage(ChatColor.RED + "I couldn't find the rank that you wanted the please use one of these instead.");
        p.sendMessage(ChatColor.GREEN + "The availiable ranks are:");
        p.sendMessage(ChatColor.GREEN + "default, vip, vip_plus, lol, lol_plus, mvp, mvp_plus, jrhelper, helper, mod, admin, owner, sloth, angus, buildteam, buildteam_plus, mojang, youtube, apple, mcprohosting");
    }
}
