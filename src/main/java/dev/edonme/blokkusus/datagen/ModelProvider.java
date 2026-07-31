package dev.edonme.blokkusus.datagen;

import dev.edonme.blokkusus.ModBlocks;
import net.fabricmc.fabric.api.client.datagen.v1.provider.FabricModelProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.world.level.block.Blocks;

public class ModelProvider extends FabricModelProvider {

    public ModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(
        BlockModelGenerators blockStateModelGen
    ) {
        blockStateModelGen.createTrivialCube(ModBlocks.GREEN_CHROMA_KEY);
        blockStateModelGen.createTrivialCube(ModBlocks.RED_CHROMA_KEY);
        blockStateModelGen.createTrivialCube(ModBlocks.BLUE_CHROMA_KEY);
        blockStateModelGen.createTrivialCube(
            ModBlocks.WHITE_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(
            ModBlocks.LIGHT_GRAY_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(ModBlocks.GRAY_AND_BLACK_TILE);
        blockStateModelGen.createTrivialCube(ModBlocks.RED_AND_BLACK_TILE);
        blockStateModelGen.createTrivialCube(
            ModBlocks.ORANGE_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(
            ModBlocks.BROWN_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(
            ModBlocks.YELLOW_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(ModBlocks.LIME_AND_BLACK_TILE);
        blockStateModelGen.createTrivialCube(
            ModBlocks.GREEN_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(ModBlocks.CYAN_AND_BLACK_TILE);
        blockStateModelGen.createTrivialCube(
            ModBlocks.LIGHT_BLUE_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(ModBlocks.BLUE_AND_BLACK_TILE);
        blockStateModelGen.createTrivialCube(
            ModBlocks.PURPLE_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(
            ModBlocks.MAGENTA_AND_BLACK_TILE
        );
        blockStateModelGen.createTrivialCube(ModBlocks.PINK_AND_BLACK_TILE);
        BlockModelGenerators.BlockFamilyProvider whiteBrickPool =
            blockStateModelGen.family(
                ModBlocks.WHITE_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider lightGrayBrickPool =
            blockStateModelGen.family(
                ModBlocks.LIGHT_GRAY_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider grayBrickPool =
            blockStateModelGen.family(
                ModBlocks.GRAY_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider blackBrickPool =
            blockStateModelGen.family(
                ModBlocks.BLACK_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider orangeBrickPool =
            blockStateModelGen.family(
                ModBlocks.ORANGE_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider brownBrickPool =
            blockStateModelGen.family(
                ModBlocks.BROWN_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider yellowBrickPool =
            blockStateModelGen.family(
                ModBlocks.YELLOW_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider limeBrickPool =
            blockStateModelGen.family(
                ModBlocks.LIME_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider greenBrickPool =
            blockStateModelGen.family(
                ModBlocks.GREEN_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider cyanBrickPool =
            blockStateModelGen.family(
                ModBlocks.CYAN_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider lightBlueBrickPool =
            blockStateModelGen.family(
                ModBlocks.LIGHT_BLUE_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider blueBrickPool =
            blockStateModelGen.family(
                ModBlocks.BLUE_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider purpleBrickPool =
            blockStateModelGen.family(
                ModBlocks.PURPLE_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider magentaBrickPool =
            blockStateModelGen.family(
                ModBlocks.MAGENTA_BRICK
            );
        BlockModelGenerators.BlockFamilyProvider pinkBrickPool =
            blockStateModelGen.family(
                ModBlocks.PINK_BRICK
            );

        BlockModelGenerators.BlockFamilyProvider mossyStonePool =
            blockStateModelGen.family(
                ModBlocks.MOSSY_STONE
            );

        BlockModelGenerators.BlockFamilyProvider andesiteBricksPool =
            blockStateModelGen.family(
                ModBlocks.ANDESITE_BRICKS
            );

        BlockModelGenerators.BlockFamilyProvider polishedAndesitePool =
            blockStateModelGen.family(
                Blocks.POLISHED_ANDESITE
            );

        BlockModelGenerators.BlockFamilyProvider whiteWoolPool =
            blockStateModelGen.family(
                Blocks.WHITE_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider lightGrayWoolPool =
            blockStateModelGen.family(
                Blocks.LIGHT_GRAY_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider grayWoolPool =
            blockStateModelGen.family(
                Blocks.GRAY_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider blackWoolPool =
            blockStateModelGen.family(
                Blocks.BLACK_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider redWoolPool =
            blockStateModelGen.family(Blocks.RED_WOOL);

        BlockModelGenerators.BlockFamilyProvider orangeWoolPool =
            blockStateModelGen.family(
                Blocks.ORANGE_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider brownWoolPool =
            blockStateModelGen.family(
                Blocks.BROWN_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider yellowWoolPool =
            blockStateModelGen.family(
                Blocks.YELLOW_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider limeWoolPool =
            blockStateModelGen.family(
                Blocks.LIME_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider greenWoolPool =
            blockStateModelGen.family(
                Blocks.GREEN_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider cyanWoolPool =
            blockStateModelGen.family(
                Blocks.CYAN_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider lightBlueWoolPool =
            blockStateModelGen.family(
                Blocks.LIGHT_BLUE_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider blueWoolPool =
            blockStateModelGen.family(
                Blocks.BLUE_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider purpleWoolPool =
            blockStateModelGen.family(
                Blocks.PURPLE_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider magentaWoolPool =
            blockStateModelGen.family(
                Blocks.MAGENTA_WOOL
            );

        BlockModelGenerators.BlockFamilyProvider pinkWoolPool =
            blockStateModelGen.family(
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

    public void generateItemModels(ItemModelGenerators itemModelGenerator) {}
}
