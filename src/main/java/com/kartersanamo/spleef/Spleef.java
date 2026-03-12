package com.kartersanamo.spleef;

import org.bukkit.plugin.java.JavaPlugin;

public final class Spleef extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}



/*

    /spleef (opens gui)
    /spleef join (auto matchmakes into a game, if none, create one)
    /spleef join [id] (joins a game based on id)
    /spleef list (list all current games)
    /spleef leave (leaves current game)
    /spleef admin (opens admin gui- later implementation)
    /spleef admin forceend [id] (force ends a spleef game)
    /spleef admin forcestart [id] (force starts a spleef game)
    /spleef admin kick [player] [id] (kicks a player from a spleef game)
    /spleef admin createmap [id] [display-name] [world] [min-players] [max-players]
    /spleef admin setlayer [id]
    /spleef admin reload
    /spleef admin savemaps
    /spleef admin setbounds [id] [min|max]

 */