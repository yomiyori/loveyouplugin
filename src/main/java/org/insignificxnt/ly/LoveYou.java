package org.insignificxnt.ly;

import org.bukkit.configuration.file.FileConfiguration;
import org.bukkit.plugin.java.JavaPlugin;
import org.insignificxnt.ly.command.LoveYouCommand;

public final class LoveYou extends JavaPlugin {

    FileConfiguration config = this.getConfig();

    @Override
    public void onEnable() {
        getCommand("/nina").setExecutor(new LoveYouCommand(this));
        config.addDefault("message", "nina i love you");
        saveConfig();


    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}

