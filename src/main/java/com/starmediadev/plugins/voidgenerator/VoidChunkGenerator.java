package com.starmediadev.plugins.voidgenerator;

import org.bukkit.Location;
import org.bukkit.World;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class VoidChunkGenerator extends ChunkGenerator {

    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        return createChunkData(world);
    }

    public Location getFixedSpawnLocation(World world, Random random) {
        return new Location(world, 0, 61, 0);
    }
}
