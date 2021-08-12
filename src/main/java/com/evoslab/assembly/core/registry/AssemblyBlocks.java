package com.evoslab.assembly.core.registry;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.common.block.VerticalSlabBlock;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.material.Material;
import net.minecraft.world.level.material.MaterialColor;
import net.minecraftforge.fml.ModList;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber.Bus;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

import javax.annotation.Nullable;
import java.util.function.Supplier;

@Mod.EventBusSubscriber(modid = Assembly.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class AssemblyBlocks {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, Assembly.MOD_ID);
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, Assembly.MOD_ID);

	public static final RegistryObject<Block> DRIPSTONE_SLAB = registerBlock("dripstone_slab", () -> new SlabBlock(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIPSTONE_STAIRS = registerBlock("dripstone_stairs", () -> new StairBlock(Blocks.DRIPSTONE_BLOCK.defaultBlockState(), Block.Properties.copy(Blocks.DRIPSTONE_BLOCK)), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> DRIPPING_AMETHYST = registerBlock("dripping_amethyst", () -> new Block(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_AMETHYST = registerBlock("chiseled_amethyst", () -> new Block(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_PILLAR = registerBlock("amethyst_pillar", () -> new RotatedPillarBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> AMETHYST_BRICKS = registerBlock("amethyst_bricks", () -> new Block(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_BRICK_SLAB = registerBlock("amethyst_brick_slab", () -> new SlabBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> AMETHYST_BRICK_STAIRS = registerBlock("amethyst_brick_stairs", () -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Block.Properties.copy(AMETHYST_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> CHISELED_DRIPSTONE = registerBlock("chiseled_dripstone", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DRIPSTONE_BRICKS = registerBlock("dripstone_bricks", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);

	public static final RegistryObject<Block> POLISHED_DRIPSTONE = registerBlock("polished_dripstone", () -> new Block(Properties.DRIPSTONE), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_SLAB = registerBlock("polished_dripstone_slab", () -> new SlabBlock(Properties.AMETHYST), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_DRIPSTONE_STAIRS = registerBlock("polished_dripstone_stairs", () -> new StairBlock(Blocks.AMETHYST_BLOCK.defaultBlockState(), Block.Properties.copy(AMETHYST_BRICKS.get())), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CRYING_OBSIDIAN_TILES = registerBlock("crying_obsidian_tiles", () -> new CryingObsidianBlock(Block.Properties.copy(Blocks.CRYING_OBSIDIAN)), CreativeModeTab.TAB_DECORATIONS);
	
	public static final RegistryObject<Block> DIRT_BRICKS = registerBlock("dirt_bricks", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_SLAB = registerBlock("dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_STAIRS = registerBlock("dirt_brick_stairs", () -> new StairBlock(DIRT_BRICKS.get()::defaultBlockState, Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> DIRT_BRICK_WALL = registerBlock("dirt_brick_wall", () -> new WallBlock(Properties.DIRT), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> DIRT_BRICK_VERTICAL_SLAB = createCompatBlock("quark", "dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> MOSSY_DIRT_BRICKS = registerBlock("mossy_dirt_bricks", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_SLAB = registerBlock("mossy_dirt_brick_slab", () -> new SlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_STAIRS = registerBlock("mossy_dirt_brick_stairs", () -> new StairBlock(DIRT_BRICKS.get()::defaultBlockState, Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_WALL = registerBlock("mossy_dirt_brick_wall", () -> new WallBlock(Properties.DIRT), CreativeModeTab.TAB_DECORATIONS);
	public static final RegistryObject<Block> MOSSY_DIRT_BRICK_VERTICAL_SLAB = createCompatBlock("quark", "mossy_dirt_vertical_slab", () -> new VerticalSlabBlock(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> DIRT_TILES = registerBlock("dirt_tiles", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> CHISELED_DIRT = registerBlock("chiseled_dirt", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> POLISHED_DIRT = registerBlock("polished_dirt", () -> new Block(Properties.DIRT), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static final RegistryObject<Block> CHISELED_BASALT = registerBlock("chiseled_basalt", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	public static final RegistryObject<Block> BASALT_TILES = registerBlock("basalt_tiles", () -> new Block(Block.Properties.copy(Blocks.POLISHED_BASALT)), CreativeModeTab.TAB_BUILDING_BLOCKS);
	
	public static class Properties {
		
		public static final Block.Properties DIRT = Block.Properties.copy(Blocks.DIRT).strength(2.0F, 6.0F);

		public static final Block.Properties DRIPSTONE = Block.Properties.copy(Blocks.DRIPSTONE_BLOCK).sound(SoundType.DRIPSTONE_BLOCK);

		public static final Block.Properties AMETHYST = Block.Properties.of(Material.AMETHYST, MaterialColor.COLOR_PURPLE).strength(1.5F).sound(SoundType.AMETHYST).requiresCorrectToolForDrops();
		
	}

	private static RegistryObject<Block> registerBlock(String name, Supplier<Block> blockSupplier, CreativeModeTab creativeModeTab) {
		RegistryObject<Block> block = BLOCKS.register(name, blockSupplier);
		ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties().tab(creativeModeTab)));
		return block;
	}

	private static <B extends Block> RegistryObject<B> createCompatBlock(String modId, String name, Supplier<? extends B> supplier, @Nullable CreativeModeTab group) {
		RegistryObject<B> block = BLOCKS.register(name, supplier);
		ITEMS.register(name, () -> {
			return new BlockItem((Block)block.get(), (new Item.Properties()).tab(!ModList.get().isLoaded(modId) && modId != "indev" ? null : group));
		});
		return block;
	}
}