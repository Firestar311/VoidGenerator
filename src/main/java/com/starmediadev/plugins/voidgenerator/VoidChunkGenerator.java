package com.starmediadev.plugins.voidgenerator;

import org.bukkit.*;
import org.bukkit.generator.ChunkGenerator;

import java.util.Random;

public class VoidChunkGenerator extends ChunkGenerator {
    
    @Override
    public ChunkData generateChunkData(World world, Random random, int x, int z, BiomeGrid biome) {
        ChunkData chunkData = createChunkData(world);
        
        for (int y = 0; y < 256; y++) {
            chunkData.setBlock(x, y, z, Material.AIR);
        }
        
        return chunkData;
    }
    
    public Location getFixedSpawnLocation(World world, Random random) {
        return new Location(world, 0, 61, 0);
    }
}
