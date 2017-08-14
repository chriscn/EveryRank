package io.github.chriscn;

import io.github.chriscn.commands.AllRanks;
import org.bukkit.plugin.java.JavaPlugin;

public class EveryRank extends JavaPlugin {

    RankUtil r = new RankUtil();

    @Override
    public void onEnable() {
        getLogger().info(getDescription().getName() + " has been enabled!");
        getCommand("everyrank").setExecutor(new AllRanks());
    }

    @Override
    public void onDisable() {
        getLogger().info(getDescription().getName() + " has been disabled!");

    }


}