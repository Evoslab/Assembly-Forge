package com.evoslab.assembly.core.registry;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.common.block.RotatedPillarAmethystBlock;
import com.teamabnormals.blueprint.common.block.VerticalSlabBlock;
import com.teamabnormals.blueprint.core.util.registry.BlockSubRegistryHelper;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

@Mod.EventBusSubscriber(modid = Assembly.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
@SuppressWarnings({"deprecation"})
public class AssemblyBlocks {
	public static final BlockSubRegistryHelper HELPER = Assembly.REGISTRY_HELPER.getBlockSubHelper();

	public static final RegistryObject<Block> DRIPSTONE_SLAB = HELPER.createBlock("dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIPSTONE_STAIRS = HELPER.createBlock("dripstone_stairs", () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> DRIPPING_AMETHYST = HELPER.createBlock("dripping_amethyst", () -> new AmethystBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_AMETHYST = HELPER.createBlock("chiseled_amethyst", () -> new AmethystBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_PILLAR = HELPER.createBlock("amethyst_pillar", () -> new RotatedPillarAmethystBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> AMETHYST_BRICKS = HELPER.createBlock("amethyst_bricks", () -> new AmethystBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_BRICK_SLAB = HELPER.createBlock("amethyst_brick_slab", () -> new SlabBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_BRICK_STAIRS = HELPER.createBlock("amethyst_brick_stairs", () -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Block.Properties.copy(AMETHYST_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_BRICK_WALL = HELPER.createBlock("amethyst_brick_wall", () -> new WallBlock(Properties.AMETHYST), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> CHISELED_DRIPSTONE = HELPER.createBlock("chiseled_dripstone", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> DRIPSTONE_BRICKS = HELPER.createBlock("dripstone_bricks", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIPSTONE_BRICK_SLAB = HELPER.createBlock("dripstone_brick_slab", () -> new SlabBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIPSTONE_BRICK_STAIRS = HELPER.createBlock("dripstone_brick_stairs", () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(DRIPSTONE_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIPSTONE_BRICK_WALL = HELPER.createBlock("dripstone_brick_wall", () -> new WallBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> POLISHED_DRIPSTONE = HELPER.createBlock("polished_dripstone", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = HELPER.createBlock("polished_dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = HELPER.createBlock("polished_dripstone_stairs", () -> new StairBlock(POLISHED_DRIPSTONE.get()::defaultBlockState, Block.Properties.copy(POLISHED_DRIPSTONE.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRYING_OBSIDIAN_TILES = HELPER.createBlock("crying_obsidian_tiles", () -> new CryingObsidianBlock(Block.Properties.copy(Blocks.CRYING_OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> CHISELED_OBSIDIAN = HELPER.createBlock("chiseled_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> OBSIDIAN_BRICKS = HELPER.createBlock("obsidian_bricks", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> OBSIDIAN_PILLAR = HELPER.createBlock("obsidian_pillar", () -> new RotatedPillarBlock(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> OBSIDIAN_TILES = HELPER.createBlock("obsidian_tiles", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> POLISHED_OBSIDIAN = HELPER.createBlock("polished_obsidian", () -> new Block(Block.Properties.copy(Blocks.OBSIDIAN).requiresCorrectToolForDrops()), CreativeModeTab.TAB_DECORATIONS);

	public static final RegistryObject<Block> DIRT_BRICKS = HELPER.createBlock("dirt_bricks", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_SLAB = HELPER.createBlock("dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_STAIRS = HELPER.createBlock("dirt_brick_stairs", () -> new StairBlock(DIRT_BRICKS.get()::defaultBlockState, Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_WALL = HELPER.createBlock("dirt_brick_wall", () -> new WallBlock(Properties.DIRT), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> MOSSY_DIRT_BRICKS = HELPER.createBlock("mossy_dirt_bricks", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_SLAB = HELPER.createBlock("mossy_dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_STAIRS = HELPER.createBlock("mossy_dirt_brick_stairs", () -> new StairBlock(DIRT_BRICKS.get()::defaultBlockState, Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_WALL = HELPER.createBlock("mossy_dirt_brick_wall", () -> new WallBlock(Properties.DIRT), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_VERTICAL_SLAB = HELPER.createCompatBlock("quark", "mossy_dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> DIRT_TILES = HELPER.createBlock("dirt_tiles", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_DIRT = HELPER.createBlock("chiseled_dirt", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_DIRT = HELPER.createBlock("polished_dirt", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHISELED_BASALT = HELPER.createBlock("chiseled_basalt", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> BASALT_SHINGLES = HELPER.createBlock("basalt_shingles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> BASALT_TILES = HELPER.createBlock("basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> BASALT_TILE_SLAB = HELPER.createBlock("basalt_tile_slab", () -> new SlabBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> BASALT_TILE_STAIRS = HELPER.createBlock("basalt_tile_stairs", () -> new StairBlock(BASALT_TILES.get()::defaultBlockState, Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> BASALT_TILE_WALL = HELPER.createBlock("basalt_tile_wall", () -> new WallBlock(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_DECORATIONS);

	public static class Properties {
		public static final Block.Properties DIRT = Block.Properties.copy(Blocks.DIRT).strength(2.0F, 6.0F);
		public static final Block.Properties DRIPSTONE = Block.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK);
		public static final Block.Properties AMETHYST = Block.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
	}
}