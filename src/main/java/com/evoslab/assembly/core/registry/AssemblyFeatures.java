package com.evoslab.assembly.core.registry;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.core.world.gen.DrippingAmethystFeature;
import net.minecraft.core.Registry;
import net.minecraft.data.BuiltinRegistries;
import net.minecraft.data.worldgen.Features;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.level.levelgen.GenerationStep;
import net.minecraft.world.level.levelgen.VerticalAnchor;
import net.minecraft.world.level.levelgen.feature.ConfiguredFeature;
import net.minecraft.world.level.levelgen.feature.Feature;
import net.minecraft.world.level.levelgen.feature.configurations.BlockStateConfiguration;
import net.minecraft.world.level.levelgen.feature.configurations.FeatureConfiguration;
import net.minecraftforge.common.world.BiomeGenerationSettingsBuilder;
import net.minecraftforge.event.world.BiomeLoadingEvent;
import net.minecraftforge.fmllegacy.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class AssemblyFeatures {
    public static final DeferredRegister<Feature<?>> FEATURES = DeferredRegister.create(ForgeRegistries.FEATURES, Assembly.MOD_ID);

    public static final RegistryObject<Feature<BlockStateConfiguration>> DRIPPING_AMETHYST_FEATURE = FEATURES.register("dripping_amethyst_feature",
            () -> new DrippingAmethystFeature(BlockStateConfiguration.CODEC));


    public static final class ConfiguredFeatures {
        public static final ConfiguredFeature<?, ?> DRIPPING_AMETHYST_CONFIG = AssemblyFeatures.DRIPPING_AMETHYST_FEATURE.get()
                .configured(new BlockStateConfiguration(AssemblyBlocks.DRIPPING_AMETHYST.get().defaultBlockState()))
                .rangeUniform(VerticalAnchor.aboveBottom(5), VerticalAnchor.absolute(50)).squared().rarity(40);

        public static void onBiomeLoad(BiomeLoadingEvent event) {
            BiomeGenerationSettingsBuilder generation = event.getGeneration();
            generation.addFeature(GenerationStep.Decoration.UNDERGROUND_DECORATION, DRIPPING_AMETHYST_CONFIG);
        }

        private static <FC extends FeatureConfiguration> void register(String name, ConfiguredFeature<FC, ?> configuredFeature) {
            Registry.register(BuiltinRegistries.CONFIGURED_FEATURE, new ResourceLocation(Assembly.MOD_ID, name), configuredFeature);
        }

        public static void registerFeatures() {
            register("dripping_amethyst_feature", DRIPPING_AMETHYST_CONFIG);
        }




    }




}
