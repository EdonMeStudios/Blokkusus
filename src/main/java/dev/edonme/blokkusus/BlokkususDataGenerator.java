package dev.edonme.blokkusus;

import dev.edonme.blokkusus.datagen.BlockTagProvider;
import dev.edonme.blokkusus.datagen.LootTableProvider;
import dev.edonme.blokkusus.datagen.ModelProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class BlokkususDataGenerator implements DataGeneratorEntrypoint {

    @Override
    public void onInitializeDataGenerator(
        FabricDataGenerator fabricDataGenerator
    ) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider(BlockTagProvider::new);
        pack.addProvider(ModelProvider::new);
        pack.addProvider(LootTableProvider::new);
    }
}
