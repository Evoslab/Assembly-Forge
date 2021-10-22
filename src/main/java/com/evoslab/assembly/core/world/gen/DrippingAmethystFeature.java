package com.evoslab.assembly.core.world.gen;

import com.evoslab.assembly.core.registry.AssemblyBlocks;
import com.mojang.serialization.Codec;
import net.minecraft.core.BlockPos;
import net.minecraft.world.level.LevelReader;
import net.minecraft.world.level.WorldGenLevel;
import net.minecraft.world.level.block.AmethystBlock;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.chunk.ChunkGenerator;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.FeaturePlaceContext;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;

import java.util.Random;

public class DrippingAmethystFeature extends Feature<BlockStateConfiguration> {
    private static final BlockState BLOCK = AssemblyBlocks.CHISELED_DIRT.get().defaultBlockState();

    public DrippingAmethystFeature(Codec<BlockStateConfiguration> codec) {
        super(codec);
    }

    @Override
    public boolean place(FeaturePlaceContext<BlockStateConfiguration> context) {
        WorldGenLevel world = context.level();
        BlockPos pos = context.origin();
        Random random = context.random();

        if (world.getBlockState(pos.below()).getBlock() == Blocks.AMETHYST_BLOCK) {
            for (int y = 1; y < 2; y++) {
                world.setBlock(new BlockPos(pos.getX(), pos.getY() + y, pos.getZ()), BLOCK, 2);
            }
        } else if (world.getBlockState(pos.above()).getBlock() == Blocks.AMETHYST_BLOCK && world.getBlockState(pos.below(2)).getBlock() == Blocks.AIR) {
            for (int y = 1; y < 2; y++) {
                world.setBlock(new BlockPos(pos.getX(), pos.getY() - y, pos.getZ()), BLOCK, 2);
            }
        }

        return true;
    }
}
