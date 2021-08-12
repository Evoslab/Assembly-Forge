package com.evoslab.assembly;

import com.evoslab.assembly.core.registry.AssemblyBlocks;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLLoadCompleteEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod("assembly")
@Mod.EventBusSubscriber(modid = "assembly", bus = Mod.EventBusSubscriber.Bus.MOD)
public class Assembly {
    public static final String MOD_ID = "assembly";
    public static Assembly instance;

    public Assembly() {
        IEventBus eventBus = FMLJavaModLoadingContext.get().getModEventBus();

        eventBus.addListener(this::doCommonStuff);
        eventBus.addListener(this::doClientStuff);
        instance = this;

        AssemblyBlocks.BLOCKS.register(eventBus);
        AssemblyBlocks.ITEMS.register(eventBus);

        MinecraftForge.EVENT_BUS.register(this);

    }

    @SubscribeEvent
    public static void loadCompleteEvent(FMLLoadCompleteEvent event) {
    }

    private void doCommonStuff(final FMLCommonSetupEvent event) {
    }

    private void doClientStuff(final FMLClientSetupEvent event) {
    }
}
