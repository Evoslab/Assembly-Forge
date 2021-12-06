package com.evoslab.assembly.core.datagen.provider;

import com.evoslab.assembly.core.registry.AssemblyBlocks;
import net.minecraft.data.DataGenerator;
import net.minecraft.data.recipes.FinishedRecipe;
import net.minecraft.data.recipes.RecipeProvider;
import net.minecraft.data.recipes.ShapedRecipeBuilder;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Blocks;

import java.util.Objects;
import java.util.function.Consumer;

public class AssemblyRecipeProvider extends RecipeProvider {

    public AssemblyRecipeProvider(DataGenerator dataGenerator) {
        super(dataGenerator);
    }

    @Override
    protected void buildCraftingRecipes(Consumer<FinishedRecipe> consumer) {

//        this.shapedRecipeWithCriterion(AssemblyBlocks.DIRT_BRICKS.get(), Blocks.REDSTONE_LAMP, 4)
//                .pattern("###")
//                .pattern("###")
//                .define('#', Blocks.REDSTONE_LAMP)
//                .save(consumer);
    }

    private ShapedRecipeBuilder shapedRecipeWithCriterion(ItemLike result, ItemLike criterionItem, int count) {
        String criterionName = Objects.requireNonNull(result.asItem().getRegistryName()).getPath();
        return new ShapedRecipeBuilder(result, count).unlockedBy("has_" + criterionName, has(criterionItem));
    }
}
