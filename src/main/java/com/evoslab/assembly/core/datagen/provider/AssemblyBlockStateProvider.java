package com.evoslab.assembly.core.datagen.provider;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.core.registry.AssemblyBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;

public class AssemblyBlockStateProvider extends BlockStateProvider {

    public AssemblyBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Assembly.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.simpleBlock(AssemblyBlocks.DIRT_BRICKS.get());
        this.simpleBlock(AssemblyBlocks.MOSSY_DIRT_BRICKS.get());
        this.simpleBlock(AssemblyBlocks.AMETHYST_BRICK_SLAB.get());
    }
}
