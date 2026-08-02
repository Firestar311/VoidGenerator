package com.starmediadev.plugins.voidgenerator;

import org.bukkit.generator.ChunkGenerator;
import org.bukkit.plugin.java.JavaPlugin;

public class VoidGeneratorPlugin extends JavaPlugin {

    public ChunkGenerator getDefaultWorldGenerator(String worldName, String id) {
        getLogger().info("getDefaultWorldGenerator");
        return new VoidChunkGenerator();
    }
}