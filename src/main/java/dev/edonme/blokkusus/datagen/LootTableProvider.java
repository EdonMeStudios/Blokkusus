package dev.edonme.blokkusus.datagen;

import dev.edonme.blokkusus.ModBlocks;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.core.HolderLookup;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(
        FabricDataOutput dataOutput,
        CompletableFuture<HolderLookup.Provider> registryLookup
    ) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        dropSelf(ModBlocks.RED_CHROMA_KEY);
        dropSelf(ModBlocks.GREEN_CHROMA_KEY);
        dropSelf(ModBlocks.BLUE_CHROMA_KEY);
        dropSelf(ModBlocks.WHITE_AND_BLACK_TILE);
        dropSelf(ModBlocks.LIGHT_GRAY_AND_BLACK_TILE);
        dropSelf(ModBlocks.GRAY_AND_BLACK_TILE);
        dropSelf(ModBlocks.RED_AND_BLACK_TILE);
        dropSelf(ModBlocks.ORANGE_AND_BLACK_TILE);
        dropSelf(ModBlocks.BROWN_AND_BLACK_TILE);
        dropSelf(ModBlocks.YELLOW_AND_BLACK_TILE);
        dropSelf(ModBlocks.LIME_AND_BLACK_TILE);
        dropSelf(ModBlocks.GREEN_AND_BLACK_TILE);
        dropSelf(ModBlocks.CYAN_AND_BLACK_TILE);
        dropSelf(ModBlocks.LIGHT_BLUE_AND_BLACK_TILE);
        dropSelf(ModBlocks.BLUE_AND_BLACK_TILE);
        dropSelf(ModBlocks.PURPLE_AND_BLACK_TILE);
        dropSelf(ModBlocks.MAGENTA_AND_BLACK_TILE);
        dropSelf(ModBlocks.PINK_AND_BLACK_TILE);
        dropSelf(ModBlocks.OAK_PLANKS_TABLE);
        dropSelf(ModBlocks.BIRCH_PLANKS_TABLE);
        dropSelf(ModBlocks.BAMBOO_PLANKS_TABLE);
        dropSelf(ModBlocks.CHERRY_PLANKS_TABLE);
        dropSelf(ModBlocks.CRIMSON_PLANKS_TABLE);
        dropSelf(ModBlocks.JUNGLE_PLANKS_TABLE);
        dropSelf(ModBlocks.MANGROVE_PLANKS_TABLE);
        dropSelf(ModBlocks.PALE_OAK_PLANKS_TABLE);
        dropSelf(ModBlocks.SPRUCE_PLANKS_TABLE);
        dropSelf(ModBlocks.WARPED_PLANKS_TABLE);
        dropSelf(ModBlocks.ACACIA_PLANKS_TABLE);
        dropSelf(ModBlocks.DARK_OAK_PLANKS_TABLE);
        dropSelf(ModBlocks.WHITE_BRICK);
        dropSelf(ModBlocks.LIGHT_GRAY_BRICK);
        dropSelf(ModBlocks.GRAY_BRICK);
        dropSelf(ModBlocks.BLACK_BRICK);
        dropSelf(ModBlocks.ORANGE_BRICK);
        dropSelf(ModBlocks.BROWN_BRICK);
        dropSelf(ModBlocks.YELLOW_BRICK);
        dropSelf(ModBlocks.LIME_BRICK);
        dropSelf(ModBlocks.GREEN_BRICK);
        dropSelf(ModBlocks.LIGHT_BLUE_BRICK);
        dropSelf(ModBlocks.CYAN_BRICK);
        dropSelf(ModBlocks.BLUE_BRICK);
        dropSelf(ModBlocks.PURPLE_BRICK);
        dropSelf(ModBlocks.MAGENTA_BRICK);
        dropSelf(ModBlocks.PINK_BRICK);

        dropSelf(ModBlocks.WHITE_BRICK_STAIRS);
        dropSelf(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        dropSelf(ModBlocks.GRAY_BRICK_STAIRS);
        dropSelf(ModBlocks.BLACK_BRICK_STAIRS);
        dropSelf(ModBlocks.ORANGE_BRICK_STAIRS);
        dropSelf(ModBlocks.BROWN_BRICK_STAIRS);
        dropSelf(ModBlocks.YELLOW_BRICK_STAIRS);
        dropSelf(ModBlocks.LIME_BRICK_STAIRS);
        dropSelf(ModBlocks.GREEN_BRICK_STAIRS);
        dropSelf(ModBlocks.CYAN_BRICK_STAIRS);
        dropSelf(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        dropSelf(ModBlocks.BLUE_BRICK_STAIRS);
        dropSelf(ModBlocks.PURPLE_BRICK_STAIRS);
        dropSelf(ModBlocks.MAGENTA_BRICK_STAIRS);
        dropSelf(ModBlocks.PINK_BRICK_STAIRS);

        add(
            ModBlocks.WHITE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.WHITE_BRICK_SLAB)
        );
        add(
            ModBlocks.LIGHT_GRAY_BRICK_SLAB,
            createSlabItemTable(ModBlocks.LIGHT_GRAY_BRICK_SLAB)
        );
        add(
            ModBlocks.GRAY_BRICK_SLAB,
            createSlabItemTable(ModBlocks.GRAY_BRICK_SLAB)
        );
        add(
            ModBlocks.BLACK_BRICK_SLAB,
            createSlabItemTable(ModBlocks.BLACK_BRICK_SLAB)
        );
        add(
            ModBlocks.ORANGE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.ORANGE_BRICK_SLAB)
        );
        add(
            ModBlocks.BROWN_BRICK_SLAB,
            createSlabItemTable(ModBlocks.BROWN_BRICK_SLAB)
        );
        add(
            ModBlocks.YELLOW_BRICK_SLAB,
            createSlabItemTable(ModBlocks.YELLOW_BRICK_SLAB)
        );
        add(
            ModBlocks.LIME_BRICK_SLAB,
            createSlabItemTable(ModBlocks.LIME_BRICK_SLAB)
        );
        add(
            ModBlocks.GREEN_BRICK_SLAB,
            createSlabItemTable(ModBlocks.GREEN_BRICK_SLAB)
        );
        add(
            ModBlocks.CYAN_BRICK_SLAB,
            createSlabItemTable(ModBlocks.CYAN_BRICK_SLAB)
        );
        add(
            ModBlocks.LIGHT_BLUE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.LIGHT_BLUE_BRICK_SLAB)
        );
        add(
            ModBlocks.BLUE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.BLUE_BRICK_SLAB)
        );
        add(
            ModBlocks.PURPLE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.PURPLE_BRICK_SLAB)
        );
        add(
            ModBlocks.WHITE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.MAGENTA_BRICK_SLAB)
        );
        add(
            ModBlocks.WHITE_BRICK_SLAB,
            createSlabItemTable(ModBlocks.PINK_BRICK_SLAB)
        );

        dropSelf(ModBlocks.WHITE_BRICK_WALL);
        dropSelf(ModBlocks.LIGHT_GRAY_BRICK_WALL);
        dropSelf(ModBlocks.GRAY_BRICK_WALL);
        dropSelf(ModBlocks.BLACK_BRICK_WALL);
        dropSelf(ModBlocks.ORANGE_BRICK_WALL);
        dropSelf(ModBlocks.BROWN_BRICK_WALL);
        dropSelf(ModBlocks.YELLOW_BRICK_WALL);
        dropSelf(ModBlocks.LIME_BRICK_WALL);
        dropSelf(ModBlocks.GREEN_BRICK_WALL);
        dropSelf(ModBlocks.CYAN_BRICK_WALL);
        dropSelf(ModBlocks.LIGHT_BLUE_BRICK_WALL);
        dropSelf(ModBlocks.BLUE_BRICK_WALL);
        dropSelf(ModBlocks.PURPLE_BRICK_WALL);
        dropSelf(ModBlocks.MAGENTA_BRICK_WALL);
        dropSelf(ModBlocks.PINK_BRICK_WALL);

        dropSelf(ModBlocks.MOSSY_STONE);
        add(
            ModBlocks.MOSSY_STONE_SLAB,
            createSlabItemTable(ModBlocks.MOSSY_STONE_SLAB)
        );

        dropSelf(ModBlocks.ANDESITE_BRICKS);
        add(
            ModBlocks.ANDESITE_BRICKS_SLAB,
            createSlabItemTable(ModBlocks.ANDESITE_BRICKS_SLAB)
        );
        dropSelf(ModBlocks.ANDESITE_BRICKS_STAIRS);
        dropSelf(ModBlocks.ANDESITE_BRICKS_WALL);
        dropSelf(ModBlocks.POLISHED_ANDESITE_WALL);

        dropSelf(ModBlocks.WHITE_WOOL_STAIRS);
        dropSelf(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
        dropSelf(ModBlocks.GRAY_WOOL_STAIRS);
        dropSelf(ModBlocks.BLACK_WOOL_STAIRS);
        dropSelf(ModBlocks.RED_WOOL_STAIRS);
        dropSelf(ModBlocks.ORANGE_WOOL_STAIRS);
        dropSelf(ModBlocks.BROWN_WOOL_STAIRS);
        dropSelf(ModBlocks.YELLOW_WOOL_STAIRS);
        dropSelf(ModBlocks.LIME_WOOL_STAIRS);
        dropSelf(ModBlocks.GREEN_WOOL_STAIRS);
        dropSelf(ModBlocks.CYAN_WOOL_STAIRS);
        dropSelf(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
        dropSelf(ModBlocks.BLUE_WOOL_STAIRS);
        dropSelf(ModBlocks.PURPLE_WOOL_STAIRS);
        dropSelf(ModBlocks.MAGENTA_WOOL_STAIRS);
        dropSelf(ModBlocks.PINK_WOOL_STAIRS);
        add(
            ModBlocks.WHITE_WOOL_SLAB,
            createSlabItemTable(ModBlocks.WHITE_WOOL_SLAB)
        );
        add(
            ModBlocks.LIGHT_GRAY_WOOL_SLAB,
            createSlabItemTable(ModBlocks.LIGHT_GRAY_WOOL_SLAB)
        );
        add(ModBlocks.GRAY_WOOL_SLAB, createSlabItemTable(ModBlocks.GRAY_WOOL_SLAB));
        add(
            ModBlocks.BLACK_WOOL_SLAB,
            createSlabItemTable(ModBlocks.BLACK_WOOL_SLAB)
        );
        add(ModBlocks.RED_WOOL_SLAB, createSlabItemTable(ModBlocks.RED_WOOL_SLAB));
        add(
            ModBlocks.ORANGE_WOOL_SLAB,
            createSlabItemTable(ModBlocks.ORANGE_WOOL_SLAB)
        );
        add(
            ModBlocks.BROWN_WOOL_SLAB,
            createSlabItemTable(ModBlocks.BROWN_WOOL_SLAB)
        );
        add(
            ModBlocks.YELLOW_WOOL_SLAB,
            createSlabItemTable(ModBlocks.YELLOW_WOOL_SLAB)
        );
        add(ModBlocks.LIME_WOOL_SLAB, createSlabItemTable(ModBlocks.LIME_WOOL_SLAB));
        add(
            ModBlocks.GREEN_WOOL_SLAB,
            createSlabItemTable(ModBlocks.GREEN_WOOL_SLAB)
        );
        add(ModBlocks.CYAN_WOOL_SLAB, createSlabItemTable(ModBlocks.CYAN_WOOL_SLAB));
        add(
            ModBlocks.LIGHT_BLUE_WOOL_SLAB,
            createSlabItemTable(ModBlocks.LIGHT_BLUE_WOOL_SLAB)
        );
        add(ModBlocks.BLUE_WOOL_SLAB, createSlabItemTable(ModBlocks.BLUE_WOOL_SLAB));
        add(
            ModBlocks.PURPLE_WOOL_SLAB,
            createSlabItemTable(ModBlocks.PURPLE_WOOL_SLAB)
        );
        add(
            ModBlocks.MAGENTA_WOOL_SLAB,
            createSlabItemTable(ModBlocks.MAGENTA_WOOL_SLAB)
        );
        add(ModBlocks.PINK_WOOL_SLAB, createSlabItemTable(ModBlocks.PINK_WOOL_SLAB));

        dropSelf(ModBlocks.GLOBE);
    }
}
