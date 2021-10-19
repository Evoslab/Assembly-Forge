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
        //this.addBlock(AssemblyBlocks.AMETHYST_BRICK_SLAB, "Amethyst Brick Slab");
    }
}
