package dev.edonme.blokkusus.datagen;

import dev.edonme.blokkusus.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.block.Blocks;
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

        BlockStateModelGenerator.BlockTexturePool mossyStonePool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.MOSSY_STONE
            );

        BlockStateModelGenerator.BlockTexturePool andesiteBricksPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                ModBlocks.ANDESITE_BRICKS
            );

        BlockStateModelGenerator.BlockTexturePool polishedAndesitePool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.POLISHED_ANDESITE
            );

        BlockStateModelGenerator.BlockTexturePool whiteWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.WHITE_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool lightGrayWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.LIGHT_GRAY_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool grayWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.GRAY_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool blackWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.BLACK_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool redWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(Blocks.RED_WOOL);

        BlockStateModelGenerator.BlockTexturePool orangeWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.ORANGE_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool brownWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.BROWN_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool yellowWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.YELLOW_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool limeWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.LIME_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool greenWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.GREEN_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool cyanWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.CYAN_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool lightBlueWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.LIGHT_BLUE_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool blueWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.BLUE_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool purpleWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.PURPLE_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool magentaWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.MAGENTA_WOOL
            );

        BlockStateModelGenerator.BlockTexturePool pinkWoolPool =
            blockStateModelGen.registerCubeAllModelTexturePool(
                Blocks.PINK_WOOL
            );

        polishedAndesitePool.wall(ModBlocks.POLISHED_ANDESITE_WALL);

        andesiteBricksPool.stairs(ModBlocks.ANDESITE_BRICKS_STAIRS);
        andesiteBricksPool.slab(ModBlocks.ANDESITE_BRICKS_SLAB);
        andesiteBricksPool.wall(ModBlocks.ANDESITE_BRICKS_WALL);

        mossyStonePool.stairs(ModBlocks.MOSSY_STONE_STAIRS);
        mossyStonePool.slab(ModBlocks.MOSSY_STONE_SLAB);
        mossyStonePool.wall(ModBlocks.MOSSY_STONE_WALL);

        whiteWoolPool.stairs(ModBlocks.WHITE_WOOL_STAIRS);
        lightGrayWoolPool.stairs(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        grayWoolPool.stairs(ModBlocks.GRAY_WOOL_STAIRS);
        blackWoolPool.stairs(ModBlocks.BLACK_WOOL_STAIRS);
        redWoolPool.stairs(ModBlocks.RED_WOOL_STAIRS);
        orangeWoolPool.stairs(ModBlocks.ORANGE_WOOL_STAIRS);
        brownWoolPool.stairs(ModBlocks.BROWN_WOOL_STAIRS);
        yellowWoolPool.stairs(ModBlocks.YELLOW_WOOL_STAIRS);
        limeWoolPool.stairs(ModBlocks.LIME_WOOL_STAIRS);
        greenWoolPool.stairs(ModBlocks.GREEN_WOOL_STAIRS);
        cyanWoolPool.stairs(ModBlocks.CYAN_WOOL_STAIRS);
        lightBlueWoolPool.stairs(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        blueWoolPool.stairs(ModBlocks.BLUE_WOOL_STAIRS);
        purpleWoolPool.stairs(ModBlocks.PURPLE_WOOL_STAIRS);
        magentaWoolPool.stairs(ModBlocks.MAGENTA_WOOL_STAIRS);
        pinkWoolPool.stairs(ModBlocks.PINK_WOOL_STAIRS);
        whiteWoolPool.slab(ModBlocks.WHITE_WOOL_SLAB);
        lightGrayWoolPool.slab(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
        grayWoolPool.slab(ModBlocks.GRAY_WOOL_SLAB);
        blackWoolPool.slab(ModBlocks.BLACK_WOOL_SLAB);
        redWoolPool.slab(ModBlocks.RED_WOOL_SLAB);
        orangeWoolPool.slab(ModBlocks.ORANGE_WOOL_SLAB);
        brownWoolPool.slab(ModBlocks.BROWN_WOOL_SLAB);
        yellowWoolPool.slab(ModBlocks.YELLOW_WOOL_SLAB);
        limeWoolPool.slab(ModBlocks.LIME_WOOL_SLAB);
        greenWoolPool.slab(ModBlocks.GREEN_WOOL_SLAB);
        cyanWoolPool.slab(ModBlocks.CYAN_WOOL_SLAB);
        lightBlueWoolPool.slab(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
        blueWoolPool.slab(ModBlocks.BLUE_WOOL_SLAB);
        purpleWoolPool.slab(ModBlocks.PURPLE_WOOL_SLAB);
        magentaWoolPool.slab(ModBlocks.MAGENTA_WOOL_SLAB);
        pinkWoolPool.slab(ModBlocks.PINK_WOOL_SLAB);

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
