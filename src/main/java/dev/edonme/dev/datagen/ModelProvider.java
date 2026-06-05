package dev.edonme.dev.datagen;

import dev.edonme.blokkusus.Blocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(
        BlockStateModelGenerator blockStateModelGen
    ) {
        blockStateModelGen.generateSimpleCubeAll(Blocks.GREEN_CHROMA_KEY);
        blockStateModelGen.generateSimpleCubeAll(Blocks.RED_CHROMA_KEY);
        blockStateModelGen.generateSimpleCubeAll(Blocks.BLUE_CHROMA_KEY);
        blockStateModelGen.generateSimpleCubeAll(Blocks.WHITE_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(
            Blocks.LIGHT_GRAY_AND_BLACK_TILE
        );
        blockStateModelGen.generateSimpleCubeAll(Blocks.GRAY_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.RED_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.ORANGE_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.BROWN_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.YELLOW_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.LIME_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.GREEN_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(
            Blocks.LIGHT_BLUE_AND_BLACK_TILE
        );
        blockStateModelGen.generateSimpleCubeAll(Blocks.BLUE_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.PURPLE_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.MAGENTA_AND_BLACK_TILE);
        blockStateModelGen.generateSimpleCubeAll(Blocks.PINK_AND_BLACK_TILE);
    }
}
