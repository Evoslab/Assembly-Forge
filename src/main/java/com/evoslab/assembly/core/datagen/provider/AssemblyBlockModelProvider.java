package com.evoslab.assembly.core.datagen.provider;

import com.evoslab.assembly.Assembly;
import com.teamabnormals.blueprint.common.block.VerticalSlabBlock;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.HashCache;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.*;
import net.minecraftforge.common.data.ExistingFileHelper;

import java.io.IOException;


//Shamelessly stolen by differentiate
public abstract class AssemblyBlockModelProvider extends BlockStateProvider {

    private final AssemblyModelProvider provider;

    public AssemblyBlockModelProvider(DataGenerator gen, String modid, ExistingFileHelper exFileHelper) {
        super(gen, modid, exFileHelper);
        this.provider = new AssemblyModelProvider(gen, modid, exFileHelper) {
            @Override protected void registerModels() {}
        };
    }

    @Override
    public void run(HashCache cache) throws IOException {
        super.run(cache);
        provider.run(cache);
    }

    public void verticalSlabBlock(VerticalSlabBlock block, ResourceLocation texture, ResourceLocation doubleslab) {
        this.verticalSlabBlock(block, this.provider.verticalSlab(block.getRegistryName().getPath(), texture), this.models().getExistingFile(doubleslab));
    }

    public void verticalSlabBlock(VerticalSlabBlock block, ModelFile model, ModelFile doubleslab) {
        this.getVariantBuilder(block)
                .partialState().with(VerticalSlabBlock.TYPE, VerticalSlabBlock.VerticalSlabType.NORTH).addModels(ConfiguredModel.builder().modelFile(model).rotationY(0).uvLock(true).build())
                .partialState().with(VerticalSlabBlock.TYPE, VerticalSlabBlock.VerticalSlabType.SOUTH).addModels(ConfiguredModel.builder().modelFile(model).rotationY(180).uvLock(true).build())
                .partialState().with(VerticalSlabBlock.TYPE, VerticalSlabBlock.VerticalSlabType.EAST).addModels(ConfiguredModel.builder().modelFile(model).rotationY(90).uvLock(true).build())
                .partialState().with(VerticalSlabBlock.TYPE, VerticalSlabBlock.VerticalSlabType.WEST).addModels(ConfiguredModel.builder().modelFile(model).rotationY(270).uvLock(true).build())
                .partialState().with(VerticalSlabBlock.TYPE, VerticalSlabBlock.VerticalSlabType.DOUBLE).addModels(new ConfiguredModel(doubleslab));
    }

    public abstract class AssemblyModelProvider extends BlockModelProvider {

        public AssemblyModelProvider(DataGenerator generator, String modid, ExistingFileHelper existingFileHelper) {
            super(generator, modid, existingFileHelper);
        }

        public BlockModelBuilder verticalSlab(String name, ResourceLocation model) {
            return this.getBuilder(name)
                    .parent(new ModelFile.UncheckedModelFile(new ResourceLocation(Assembly.MOD_ID, "block/vertical_slab")))
                    .texture("side", model)
                    .texture("bottom", model)
                    .texture("top", model);
        }

    }

}
