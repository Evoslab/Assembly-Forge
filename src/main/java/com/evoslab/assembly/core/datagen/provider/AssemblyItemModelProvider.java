package com.evoslab.assembly.core.datagen.provider;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.core.registry.AssemblyBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class AssemblyItemModelProvider extends ItemModelProvider {

    public AssemblyItemModelProvider(DataGenerator generator, ExistingFileHelper existingFileHelper) {
        super(generator, Assembly.MOD_ID, existingFileHelper);
    }

    @Override
    @SuppressWarnings({"All"})
    protected void registerModels() {
        this.createSimpleBlockItem(AssemblyBlocks.DRIPSTONE_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.DRIPSTONE_STAIRS.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.DRIPPING_AMETHYST.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.CHISELED_AMETHYST.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.AMETHYST_PILLAR.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.AMETHYST_BRICKS.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.AMETHYST_BRICK_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.AMETHYST_BRICK_STAIRS.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.CHISELED_DRIPSTONE.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.DRIPSTONE_BRICKS.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.DRIPSTONE_BRICK_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.DRIPSTONE_BRICK_STAIRS.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.POLISHED_DRIPSTONE.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.CRYING_OBSIDIAN_TILES.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.CHISELED_OBSIDIAN.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.OBSIDIAN_BRICKS.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.OBSIDIAN_PILLAR.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.OBSIDIAN_TILES.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.POLISHED_OBSIDIAN.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.DIRT_BRICKS.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.DIRT_BRICK_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.DIRT_BRICK_STAIRS.get().getRegistryName().getPath());
//        this.createSimpleBlockItem(AssemblyBlocks.DIRT_BRICK_VERTICAL_SLAB.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.MOSSY_DIRT_BRICKS.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_STAIRS.get().getRegistryName().getPath());
//        this.createSimpleBlockItem(AssemblyBlocks.MOSSY_DIRT_BRICK_VERTICAL_SLAB.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.DIRT_TILES.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.CHISELED_DIRT.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.POLISHED_DIRT.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.CHISELED_BASALT.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.BASALT_SHINGLES.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.BASALT_TILES.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.BASALT_TILE_SLAB.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.BASALT_TILE_STAIRS.get().getRegistryName().getPath());

        this.createSimpleBlockItem(AssemblyBlocks.WAX_BLOCK.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.WAX_BRICKS.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.POLISHED_WAX.get().getRegistryName().getPath());
        this.createSimpleBlockItem(AssemblyBlocks.CARVED_WAX.get().getRegistryName().getPath());
    }

    private void createSimpleBlockItem(String name) {
        this.withExistingParent(name, Assembly.id("block/" + name));
    }
}