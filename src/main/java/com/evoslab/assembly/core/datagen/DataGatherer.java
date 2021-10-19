package com.evoslab.assembly.core.datagen;

import com.evoslab.assembly.Assembly;
import com.evoslab.assembly.core.datagen.provider.AssemblyBlockStateProvider;
import com.evoslab.assembly.core.datagen.provider.AssemblyLangProvider;
import com.evoslab.assembly.core.datagen.provider.AssemblyRecipeProvider;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.forge.event.lifecycle.GatherDataEvent;

@Mod.EventBusSubscriber(modid = Assembly.MOD_ID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class DataGatherer {

    @SubscribeEvent
    public static void onGatherData(GatherDataEvent event) {
        DataGenerator dataGen = event.getGenerator();
        ExistingFileHelper fileHelper = event.getExistingFileHelper();

        if (event.includeServer()) {
            dataGen.addProvider(new AssemblyRecipeProvider(dataGen));
        }
        if (event.includeClient()) {
            dataGen.addProvider(new AssemblyBlockStateProvider(dataGen, fileHelper));
            dataGen.addProvider(new AssemblyLangProvider(dataGen));
        }
    }
}
