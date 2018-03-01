package io.github.chriscn.util;

import net.md_5.bungee.api.ChatColor;

import java.util.Arrays;
import java.util.List;


public class RankUtil {
    public List<String> ranks;

    public RankUtil() {
        this.ranks = Arrays.asList(
                ChatColor.GREEN + "[VIP]",
                ChatColor.GREEN + "[VIP" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]",
                ChatColor.GREEN + "[LOL]",
                ChatColor.GREEN + "[LOL" + ChatColor.GOLD + "+" + ChatColor.GREEN + "]",
                ChatColor.AQUA + "[MVP]", ChatColor.AQUA + "[MVP" + ChatColor.RED + "+" + ChatColor.AQUA + "]",
                ChatColor.BLUE + "[JR HELPER]",
                ChatColor.BLUE + "[HELPER]",
                ChatColor.DARK_GREEN + "[MOD]",
                ChatColor.RED + "[ADMIN]",
                ChatColor.RED + "[OWNER]",
                ChatColor.RED + "[SLOTH]",
                ChatColor.RED + "[ANGUS]",
                ChatColor.DARK_AQUA + "[BUILD TEAM]",
                ChatColor.DARK_AQUA + "[BUILD TEAM" + ChatColor.RED + "+" + ChatColor.DARK_AQUA + "]",
                ChatColor.GOLD + "[MOJANG]",
                ChatColor.GOLD + "[YT]",
                ChatColor.GOLD + "[APPLE]",
                ChatColor.RED + "[" + ChatColor.GREEN + "MC" + ChatColor.GRAY + "ProHosting" + ChatColor.RED + "]"
        );
    }
}
