package io.github.chriscn;

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

}
