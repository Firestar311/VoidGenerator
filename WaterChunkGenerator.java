package com.starmediadev.plugins.voidgenerator;

import org.bukkit.Material;
import org.bukkit.block.Biome;
import org.bukkit.generator.BiomeProvider;
import org.bukkit.generator.ChunkGenerator;
import org.bukkit.generator.WorldInfo;

import java.util.List;
import java.util.Random;

public class WaterChunkGenerator extends ChunkGenerator {
    
    @Override
    public void generateSurface(WorldInfo worldInfo, Random random, int xe, int ze, ChunkData chunkData) {
        for (int x = 0; x < 16; x++) {
            for (int y = -64; y < 321; y++) {
                for (int z = 0; z < 16; z++) {
                    if (y > -64) {
                        chunkData.setBlock(x, y, z, Material.WATER);
                    } else {
                        chunkData.setBlock(x, y, z, Material.BEDROCK);
                    }
                }
            }
        }
    }
    
    @Override
    public BiomeProvider getDefaultBiomeProvider(WorldInfo worldInfo) {
        return new BiomeProvider() {
            @Override
            public Biome getBiome(WorldInfo worldInfo, int i, int i1, int i2) {
                return Biome.WARM_OCEAN;
            }
    
            @Override
            public List<Biome> getBiomes(WorldInfo worldInfo) {
                return List.of(Biome.WARM_OCEAN);
            }
        };
    }
    
    @Override
    public boolean shouldGenerateMobs() {
        return false;
    }
    
    @Override
    public boolean shouldGenerateSurface() {
        return true;
    }
}
