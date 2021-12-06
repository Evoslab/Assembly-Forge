package com.evoslab.assembly.core.datagen.provider;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.core.registry.AssemblyBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.LanguageProvider;

public class AssemblyLangProvider extends LanguageProvider {

    public AssemblyLangProvider(DataGenerator gen) {
        super(gen, Assembly.MOD_ID, "en_us");
    }

    @Override
    protected void addTranslations() {
        this.addBlock(AssemblyBlocks.DRIPSTONE_SLAB, "Dripstone Slab");
        this.addBlock(AssemblyBlocks.DRIPSTONE_STAIRS, "Dripstone Stairs");

        this.addBlock(AssemblyBlocks.DRIPPING_AMETHYST, "Dripping Amethyst");
        this.addBlock(AssemblyBlocks.CHISELED_AMETHYST, "Chiseled Amethyst");
        this.addBlock(AssemblyBlocks.AMETHYST_PILLAR, "Amethyst Pillar");

        this.addBlock(AssemblyBlocks.AMETHYST_BRICKS, "Amethyst Bricks");
        this.addBlock(AssemblyBlocks.AMETHYST_BRICK_SLAB, "Amethyst Brick Slab");
        this.addBlock(AssemblyBlocks.AMETHYST_BRICK_STAIRS, "Amethyst Brick Stairs");
        this.addBlock(AssemblyBlocks.AMETHYST_BRICK_WALL, "Amethyst Brick Wall");

        this.addBlock(AssemblyBlocks.CHISELED_DRIPSTONE, "Chiseled Dripstone");

        this.addBlock(AssemblyBlocks.DRIPSTONE_BRICKS, "Dripstone Bricks");
        this.addBlock(AssemblyBlocks.DRIPSTONE_BRICK_SLAB, "Dripstone Brick Slab");
        this.addBlock(AssemblyBlocks.DRIPSTONE_BRICK_STAIRS, "Dripstone Brick Stairs");
        this.addBlock(AssemblyBlocks.DRIPSTONE_BRICK_WALL, "Dripstone Brick Wall");

        this.addBlock(AssemblyBlocks.POLISHED_DRIPSTONE, "Polished Dripstone");
        this.addBlock(AssemblyBlocks.POLISHED_DRIPSTONE_SLAB, "Polished Dripstone Slab");
        this.addBlock(AssemblyBlocks.POLISHED_DRIPSTONE_STAIRS, "Polished Dripstone Stairs");

        this.addBlock(AssemblyBlocks.CRYING_OBSIDIAN_TILES, "Crying Obsidian Tiles");
        this.addBlock(AssemblyBlocks.CHISELED_OBSIDIAN, "Chiseled Obsidian");
        this.addBlock(AssemblyBlocks.OBSIDIAN_BRICKS, "Obsidian Bricks");
        this.addBlock(AssemblyBlocks.OBSIDIAN_PILLAR, "Obsidian Pillar");
        this.addBlock(AssemblyBlocks.OBSIDIAN_TILES, "Obsidian Tiles");
        this.addBlock(AssemblyBlocks.POLISHED_OBSIDIAN, "Polished Obsidian");

        this.addBlock(AssemblyBlocks.DIRT_BRICKS, "Dirt Bricks");
        this.addBlock(AssemblyBlocks.DIRT_BRICK_SLAB, "Dirt Brick Slab");
        this.addBlock(AssemblyBlocks.DIRT_BRICK_STAIRS, "Dirt Brick Stairs");
        this.addBlock(AssemblyBlocks.DIRT_BRICK_WALL, "Dirt Brick Wall");
        this.addBlock(AssemblyBlocks.DIRT_BRICK_VERTICAL_SLAB, "Dirt Brick Vertical Slab");

        this.addBlock(AssemblyBlocks.MOSSY_DIRT_BRICKS, "Mossy Dirt Bricks");
        this.addBlock(AssemblyBlocks.MOSSY_DIRT_BRICK_SLAB, "Mossy Dirt Brick Slab");
        this.addBlock(AssemblyBlocks.MOSSY_DIRT_BRICK_STAIRS, "Mossy Dirt Brick Stairs");
        this.addBlock(AssemblyBlocks.MOSSY_DIRT_BRICK_WALL, "Mossy Dirt Brick Wall");
        this.addBlock(AssemblyBlocks.MOSSY_DIRT_BRICK_VERTICAL_SLAB, "Mossy Dirt Brick Vertical Slab");

        this.addBlock(AssemblyBlocks.DIRT_TILES, "Dirt Tiles");
        this.addBlock(AssemblyBlocks.CHISELED_DIRT, "Chiseled Dirt");
        this.addBlock(AssemblyBlocks.POLISHED_DIRT, "Polished Dirt");

        this.addBlock(AssemblyBlocks.CHISELED_BASALT, "Chiseled Basalt");
        this.addBlock(AssemblyBlocks.BASALT_SHINGLES, "Basalt Shingles");

        this.addBlock(AssemblyBlocks.BASALT_TILES, "Basalt Tiles");
        this.addBlock(AssemblyBlocks.BASALT_TILE_SLAB, "Basalt Tile Slab");
        this.addBlock(AssemblyBlocks.BASALT_TILE_STAIRS, "Basalt Tile Stairs");
        this.addBlock(AssemblyBlocks.BASALT_TILE_WALL, "Basalt Tile Wall");
    }
}
