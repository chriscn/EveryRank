package io.github.chriscn;

import io.github.chriscn.commands.AllRanks;
import io.github.chriscn.commands.RankMessage;
import io.github.chriscn.util.RankUtil;
import org.bukkit.plugin.java.JavaPlugin;

public class EveryRank extends JavaPlugin {

    RankUtil r = new RankUtil();

    @Override
    public void onEnable() {
        getLogger().info(getDescription().getName() + " has been enabled!");
        getCommand("everyrank").setExecutor(new AllRanks());
        getCommand("rankmessage").setExecutor(new RankMessage());
    }

    @Override
    public void onDisable() {
        getLogger().info(getDescription().getName() + " has been disabled!");

    }
}
