package dev.edonme.blokkusus.datagen;

import dev.edonme.blokkusus.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.BlockStateModelGenerator;
import net.minecraft.client.data.ItemModelGenerator;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(
        BlockStateModelGenerator blockStateModelGen
    ) {
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.GREEN_CHROMA_KEY);
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.RED_CHROMA_KEY);
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.BLUE_CHROMA_KEY);
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.WHITE_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.LIGHT_GRAY_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.GRAY_AND_BLACK_TILE);
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.RED_AND_BLACK_TILE);
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.ORANGE_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.BROWN_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.YELLOW_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.LIME_AND_BLACK_TILE);
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.GREEN_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.CYAN_AND_BLACK_TILE);
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.LIGHT_BLUE_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.BLUE_AND_BLACK_TILE);
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.PURPLE_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(
            ModBlocks.MAGENTA_AND_BLACK_TILE
        );
        blockStateModelGen.registerSimpleCubeAll(ModBlocks.PINK_AND_BLACK_TILE);
        BlockStateModelGenerator.BlockTexturePool whiteBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.WHITE_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool lightGrayBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_GRAY_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool grayBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.GRAY_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool blackBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.BLACK_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool orangeBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.ORANGE_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool brownBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.BROWN_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool yellowBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.YELLOW_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool limeBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.LIME_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool greenBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.GREEN_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool cyanBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.CYAN_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool lightBlueBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.LIGHT_BLUE_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool blueBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.BLUE_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool purpleBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.PURPLE_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool magentaBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.MAGENTA_BRICK
            );
        BlockStateModelGenerator.BlockTexturePool pinkBrickPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.PINK_BRICK
            );

        whiteBrickPool.stairs(ModBlocks.WHITE_BRICK_STAIRS);
        whiteBrickPool.slab(ModBlocks.WHITE_BRICK_SLAB);
        whiteBrickPool.wall(ModBlocks.WHITE_BRICK_WALL);
        lightGrayBrickPool.stairs(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        lightGrayBrickPool.slab(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
        lightGrayBrickPool.wall(ModBlocks.LIGHT_GRAY_BRICK_WALL);
        grayBrickPool.stairs(ModBlocks.GRAY_BRICK_STAIRS);
        grayBrickPool.slab(ModBlocks.GRAY_BRICK_SLAB);
        grayBrickPool.wall(ModBlocks.GRAY_BRICK_WALL);
        blackBrickPool.stairs(ModBlocks.BLACK_BRICK_STAIRS);
        blackBrickPool.slab(ModBlocks.BLACK_BRICK_SLAB);
        blackBrickPool.wall(ModBlocks.BLACK_BRICK_WALL);
        orangeBrickPool.stairs(ModBlocks.ORANGE_BRICK_STAIRS);
        orangeBrickPool.slab(ModBlocks.ORANGE_BRICK_SLAB);
        orangeBrickPool.wall(ModBlocks.ORANGE_BRICK_WALL);
        brownBrickPool.stairs(ModBlocks.BROWN_BRICK_STAIRS);
        brownBrickPool.slab(ModBlocks.BROWN_BRICK_SLAB);
        brownBrickPool.wall(ModBlocks.BROWN_BRICK_WALL);
        yellowBrickPool.stairs(ModBlocks.YELLOW_BRICK_STAIRS);
        yellowBrickPool.slab(ModBlocks.YELLOW_BRICK_SLAB);
        yellowBrickPool.wall(ModBlocks.YELLOW_BRICK_WALL);
        limeBrickPool.stairs(ModBlocks.LIME_BRICK_STAIRS);
        limeBrickPool.slab(ModBlocks.LIME_BRICK_SLAB);
        limeBrickPool.wall(ModBlocks.LIME_BRICK_WALL);
        greenBrickPool.stairs(ModBlocks.GREEN_BRICK_STAIRS);
        greenBrickPool.slab(ModBlocks.GREEN_BRICK_SLAB);
        greenBrickPool.wall(ModBlocks.GREEN_BRICK_WALL);
        cyanBrickPool.stairs(ModBlocks.CYAN_BRICK_STAIRS);
        cyanBrickPool.slab(ModBlocks.CYAN_BRICK_SLAB);
        cyanBrickPool.wall(ModBlocks.CYAN_BRICK_WALL);
        lightBlueBrickPool.stairs(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        lightBlueBrickPool.slab(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
        lightBlueBrickPool.wall(ModBlocks.LIGHT_BLUE_BRICK_WALL);
        blueBrickPool.stairs(ModBlocks.BLUE_BRICK_STAIRS);
        blueBrickPool.slab(ModBlocks.BLUE_BRICK_SLAB);
        blueBrickPool.wall(ModBlocks.BLUE_BRICK_WALL);
        purpleBrickPool.stairs(ModBlocks.PURPLE_BRICK_STAIRS);
        purpleBrickPool.slab(ModBlocks.PURPLE_BRICK_SLAB);
        purpleBrickPool.wall(ModBlocks.PURPLE_BRICK_WALL);
        magentaBrickPool.stairs(ModBlocks.MAGENTA_BRICK_STAIRS);
        magentaBrickPool.slab(ModBlocks.MAGENTA_BRICK_SLAB);
        magentaBrickPool.wall(ModBlocks.MAGENTA_BRICK_WALL);
        pinkBrickPool.stairs(ModBlocks.PINK_BRICK_STAIRS);
        pinkBrickPool.slab(ModBlocks.PINK_BRICK_SLAB);
        pinkBrickPool.wall(ModBlocks.PINK_BRICK_WALL);
    }

    public void generateItemModels(ItemModelGenerator itemModelGenerator) {}
}
