package com.starmediadev.plugins.voidgenerator;

import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class VoidGeneratorPlugin extends JavaPlugin implements Listener {

    public void onEnable() {
        getServer().getPluginManager().registerEvents(this, this);
    }
    
    @EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        if (Bukkit.getPluginManager().getPlugin("StarEssentials") == null) {
            var world = Bukkit.getWorld("world");
            var block = world.getBlockAt(0, 60, 0);
            block.setType(Material.BEDROCK);
            e.getPlayer().teleport(new Location(world, 0, 61, 0));
        }
    }

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        return new VoidChunkGenerator();
        //return new WaterChunkGenerator();
    }
}