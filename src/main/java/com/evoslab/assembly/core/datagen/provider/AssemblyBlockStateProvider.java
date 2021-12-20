package com.evoslab.assembly.core.datagen.provider;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.core.registry.AssemblyBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

import java.util.Objects;

public class AssemblyBlockStateProvider extends BlockStateProvider {

    public AssemblyBlockStateProvider(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, Assembly.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        this.slabBlock((SlabBlock) AssemblyBlocks.DRIPSTONE_SLAB.get(), getMCTexture(Blocks.DRIPSTONE_BLOCK), getMCTexture(Blocks.DRIPSTONE_BLOCK));
        this.stairsBlock((StairBlock) AssemblyBlocks.DRIPSTONE_STAIRS.get(), getMCTexture(Blocks.DRIPSTONE_BLOCK));

        this.simpleBlock(AssemblyBlocks.DRIPPING_AMETHYST.get());
        this.simpleBlock(AssemblyBlocks.CHISELED_AMETHYST.get());
        this.axisBlock((RotatedPillarBlock) AssemblyBlocks.AMETHYST_PILLAR.get(), getTexture(AssemblyBlocks.AMETHYST_PILLAR), getExtendedTexture(AssemblyBlocks.AMETHYST_PILLAR, "_top"));

        this.simpleBlock(AssemblyBlocks.AMETHYST_BRICKS.get());
        this.slabBlock((SlabBlock) AssemblyBlocks.AMETHYST_BRICK_SLAB.get(), getTexture(AssemblyBlocks.AMETHYST_BRICKS), getTexture(AssemblyBlocks.AMETHYST_BRICKS));
        this.stairsBlock((StairBlock) AssemblyBlocks.AMETHYST_BRICK_STAIRS.get(), getTexture(AssemblyBlocks.AMETHYST_BRICKS));
        this.simpleWallBlock((WallBlock) AssemblyBlocks.AMETHYST_BRICK_WALL.get(), getTexture(AssemblyBlocks.AMETHYST_BRICKS));

        this.simpleBlock(AssemblyBlocks.CHISELED_DRIPSTONE.get());

        this.simpleBlock(AssemblyBlocks.DRIPSTONE_BRICKS.get());
        this.slabBlock((SlabBlock) AssemblyBlocks.DRIPSTONE_BRICK_SLAB.get(), getTexture(AssemblyBlocks.DRIPSTONE_BRICKS), getTexture(AssemblyBlocks.DRIPSTONE_BRICKS));
        this.stairsBlock((StairBlock) AssemblyBlocks.DRIPSTONE_BRICK_STAIRS.get(), getTexture(AssemblyBlocks.DRIPSTONE_BRICKS));
        this.simpleWallBlock((WallBlock) AssemblyBlocks.DRIPSTONE_BRICK_WALL.get(), getTexture(AssemblyBlocks.DRIPSTONE_BRICKS));

        this.simpleBlock(AssemblyBlocks.POLISHED_DRIPSTONE.get());
        this.slabBlock((SlabBlock) AssemblyBlocks.POLISHED_DRIPSTONE_SLAB.get(), getTexture(AssemblyBlocks.POLISHED_DRIPSTONE), getTexture(AssemblyBlocks.POLISHED_DRIPSTONE));
        this.stairsBlock((StairBlock) AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS.get(), getTexture(AssemblyBlocks.POLISHED_DRIPSTONE));

        this.simpleBlock(AssemblyBlocks.CRYING_OBSIDIAN_TILES.get());
        this.simpleBlock(AssemblyBlocks.CHISELED_OBSIDIAN.get());
        this.simpleBlock(AssemblyBlocks.OBSIDIAN_BRICKS.get());
        this.simpleBlock(AssemblyBlocks.OBSIDIAN_PILLAR.get());
        this.simpleBlock(AssemblyBlocks.OBSIDIAN_TILES.get());
        this.simpleBlock(AssemblyBlocks.POLISHED_OBSIDIAN.get());

        this.simpleBlock(AssemblyBlocks.DIRT_BRICKS.get());
        this.slabBlock((SlabBlock) AssemblyBlocks.DIRT_BRICK_SLAB.get(), getTexture(AssemblyBlocks.DIRT_BRICKS), getTexture(AssemblyBlocks.DIRT_BRICKS));
        this.stairsBlock((StairBlock) AssemblyBlocks.DIRT_BRICK_STAIRS.get(), getTexture(AssemblyBlocks.DIRT_BRICKS));
        this.simpleWallBlock((WallBlock) AssemblyBlocks.DIRT_BRICK_WALL.get(), getTexture(AssemblyBlocks.DIRT_BRICKS));
        //this.verticalSlabBlock((VerticalSlabBlock)AssemblyBlocks.DIRT_BRICK_VERTICAL_SLAB.get(), getTexture(AssemblyBlocks.DIRT_BRICKS), getTexture(AssemblyBlocks.DIRT_BRICKS));

        this.simpleBlock(AssemblyBlocks.MOSSY_DIRT_BRICKS.get());
        this.slabBlock((SlabBlock) AssemblyBlocks.MOSSY_DIRT_BRICK_SLAB.get(), getTexture(AssemblyBlocks.MOSSY_DIRT_BRICKS), getTexture(AssemblyBlocks.MOSSY_DIRT_BRICKS));
        this.stairsBlock((StairBlock) AssemblyBlocks.MOSSY_DIRT_BRICK_STAIRS.get(), getTexture(AssemblyBlocks.MOSSY_DIRT_BRICKS));
        this.simpleWallBlock((WallBlock) AssemblyBlocks.MOSSY_DIRT_BRICK_WALL.get(), getTexture(AssemblyBlocks.MOSSY_DIRT_BRICKS));
        //this.verticalSlabBlock((VerticalSlabBlock)AssemblyBlocks.MOSSY_DIRT_BRICK_VERTICAL_SLAB.get(), getTexture(AssemblyBlocks.MOSSY_DIRT_BRICKS), getTexture(AssemblyBlocks.MOSSY_DIRT_BRICKS));

        this.simpleBlock(AssemblyBlocks.DIRT_TILES.get());
        this.simpleBlock(AssemblyBlocks.CHISELED_DIRT.get());
        this.simpleBlock(AssemblyBlocks.POLISHED_DIRT.get());

        this.simpleBlock(AssemblyBlocks.CHISELED_BASALT.get());
        this.simpleBlock(AssemblyBlocks.BASALT_SHINGLES.get());

        this.simpleBlock(AssemblyBlocks.BASALT_TILES.get());
        this.slabBlock((SlabBlock) AssemblyBlocks.BASALT_TILE_SLAB.get(), getTexture(AssemblyBlocks.BASALT_TILES), getTexture(AssemblyBlocks.BASALT_TILES));
        this.stairsBlock((StairBlock) AssemblyBlocks.BASALT_TILE_STAIRS.get(), getTexture(AssemblyBlocks.BASALT_TILES));
        this.simpleWallBlock((WallBlock) AssemblyBlocks.BASALT_TILE_WALL.get(), getTexture(AssemblyBlocks.BASALT_TILES));
    }

    public String getBlockName(RegistryObject<Block> ro) {
        return Objects.requireNonNull(ro.get().getRegistryName()).getPath();
    }

    private String getMCBlockName(Block ro) {
        return Objects.requireNonNull(ro.getRegistryName()).getPath();
    }

    private ResourceLocation getTexture(RegistryObject<Block> ro) {
        return new ResourceLocation(Assembly.MOD_ID, "block/" + getBlockName(ro));
    }

    private ResourceLocation getMCTexture(Block ro) {
        return new ResourceLocation("block/" + getMCBlockName(ro));
    }

    private ResourceLocation getExtendedTexture(RegistryObject<Block> ro, String suffix) {
        return new ResourceLocation(Assembly.MOD_ID, "block/" + getBlockName(ro) + suffix);
    }

    private void simpleWallBlock(WallBlock block, ResourceLocation texture) {
        this.wallBlock(block, texture);
        this.itemModels().wallInventory(block.getRegistryName().getPath(), texture);
    }
}