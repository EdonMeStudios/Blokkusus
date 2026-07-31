package dev.edonme.blokkusus;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.registries.Registries;
import net.minecraft.resources.Identifier;
import net.minecraft.resources.ResourceKey;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.block.RedstoneLampBlock;
import net.minecraft.world.level.block.SlabBlock;
import net.minecraft.world.level.block.SoundType;
import net.minecraft.world.level.block.StairBlock;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

public class ModBlocks {

    // ==========================================
    // HELPER
    // ==========================================
    private static Identifier id(String path) {
        return Identifier.fromNamespaceAndPath(Blokkusus.MOD_ID, path);
    }

    private static ResourceKey<Block> blockKey(String path) {
        return ResourceKey.create(Registries.BLOCK, id(path));
    }

    private static ResourceKey<Item> itemKey(String path) {
        return ResourceKey.create(Registries.ITEM, id(path));
    }

    // ==========================================
    // TILES - IDs / KEYS
    // ==========================================
    public static final ResourceKey<Block> WHITE_AND_BLACK_TILE_KEY = blockKey(
        "white_and_black_tile"
    );
    public static final ResourceKey<Item> WHITE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("white_and_black_tile");
    public static final ResourceKey<Block> LIGHT_GRAY_AND_BLACK_TILE_KEY =
        blockKey("light_gray_and_black_tile");
    public static final ResourceKey<Item> LIGHT_GRAY_AND_BLACK_TILE_ITEM_KEY =
        itemKey("light_gray_and_black_tile");
    public static final ResourceKey<Block> GRAY_AND_BLACK_TILE_KEY = blockKey(
        "gray_and_black_tile"
    );
    public static final ResourceKey<Item> GRAY_AND_BLACK_TILE_ITEM_KEY =
        itemKey("gray_and_black_tile");
    public static final ResourceKey<Block> ORANGE_AND_BLACK_TILE_KEY = blockKey(
        "orange_and_black_tile"
    );
    public static final ResourceKey<Item> ORANGE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("orange_and_black_tile");
    public static final ResourceKey<Block> MAGENTA_AND_BLACK_TILE_KEY =
        blockKey("magenta_and_black_tile");
    public static final ResourceKey<Item> MAGENTA_AND_BLACK_TILE_ITEM_KEY =
        itemKey("magenta_and_black_tile");
    public static final ResourceKey<Block> LIGHT_BLUE_AND_BLACK_TILE_KEY =
        blockKey("light_blue_and_black_tile");
    public static final ResourceKey<Item> LIGHT_BLUE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("light_blue_and_black_tile");
    public static final ResourceKey<Block> YELLOW_AND_BLACK_TILE_KEY = blockKey(
        "yellow_and_black_tile"
    );
    public static final ResourceKey<Item> YELLOW_AND_BLACK_TILE_ITEM_KEY =
        itemKey("yellow_and_black_tile");
    public static final ResourceKey<Block> LIME_AND_BLACK_TILE_KEY = blockKey(
        "lime_and_black_tile"
    );
    public static final ResourceKey<Item> LIME_AND_BLACK_TILE_ITEM_KEY =
        itemKey("lime_and_black_tile");
    public static final ResourceKey<Block> PINK_AND_BLACK_TILE_KEY = blockKey(
        "pink_and_black_tile"
    );
    public static final ResourceKey<Item> PINK_AND_BLACK_TILE_ITEM_KEY =
        itemKey("pink_and_black_tile");
    public static final ResourceKey<Block> CYAN_AND_BLACK_TILE_KEY = blockKey(
        "cyan_and_black_tile"
    );
    public static final ResourceKey<Item> CYAN_AND_BLACK_TILE_ITEM_KEY =
        itemKey("cyan_and_black_tile");
    public static final ResourceKey<Block> PURPLE_AND_BLACK_TILE_KEY = blockKey(
        "purple_and_black_tile"
    );
    public static final ResourceKey<Item> PURPLE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("purple_and_black_tile");
    public static final ResourceKey<Block> BLUE_AND_BLACK_TILE_KEY = blockKey(
        "blue_and_black_tile"
    );
    public static final ResourceKey<Item> BLUE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("blue_and_black_tile");
    public static final ResourceKey<Block> BROWN_AND_BLACK_TILE_KEY = blockKey(
        "brown_and_black_tile"
    );
    public static final ResourceKey<Item> BROWN_AND_BLACK_TILE_ITEM_KEY =
        itemKey("brown_and_black_tile");
    public static final ResourceKey<Block> GREEN_AND_BLACK_TILE_KEY = blockKey(
        "green_and_black_tile"
    );
    public static final ResourceKey<Item> GREEN_AND_BLACK_TILE_ITEM_KEY =
        itemKey("green_and_black_tile");
    public static final ResourceKey<Block> RED_AND_BLACK_TILE_KEY = blockKey(
        "red_and_black_tile"
    );
    public static final ResourceKey<Item> RED_AND_BLACK_TILE_ITEM_KEY = itemKey(
        "red_and_black_tile"
    );

    // ==========================================
    // CHROMA KEYS - IDs / KEYS
    // ==========================================
    public static final ResourceKey<Block> BLUE_CHROMA_KEY_KEY = blockKey(
        "blue_chroma_key"
    );
    public static final ResourceKey<Item> BLUE_CHROMA_KEY_ITEM_KEY = itemKey(
        "blue_chroma_key"
    );
    public static final ResourceKey<Block> GREEN_CHROMA_KEY_KEY = blockKey(
        "green_chroma_key"
    );
    public static final ResourceKey<Item> GREEN_CHROMA_KEY_ITEM_KEY = itemKey(
        "green_chroma_key"
    );
    public static final ResourceKey<Block> RED_CHROMA_KEY_KEY = blockKey(
        "red_chroma_key"
    );
    public static final ResourceKey<Item> RED_CHROMA_KEY_ITEM_KEY = itemKey(
        "red_chroma_key"
    );

    // ==========================================
    // TABLES - IDs / KEYS
    // ==========================================
    public static final ResourceKey<Block> OAK_PLANKS_TABLE_KEY = blockKey(
        "oak_planks_table"
    );
    public static final ResourceKey<Item> OAK_PLANKS_TABLE_ITEM_KEY = itemKey(
        "oak_planks_table"
    );
    public static final ResourceKey<Block> DARK_OAK_PLANKS_TABLE_KEY = blockKey(
        "dark_oak_planks_table"
    );
    public static final ResourceKey<Item> DARK_OAK_PLANKS_TABLE_ITEM_KEY =
        itemKey("dark_oak_planks_table");
    public static final ResourceKey<Block> SPRUCE_PLANKS_TABLE_KEY = blockKey(
        "spruce_planks_table"
    );
    public static final ResourceKey<Item> SPRUCE_PLANKS_TABLE_ITEM_KEY =
        itemKey("spruce_planks_table");
    public static final ResourceKey<Block> BIRCH_PLANKS_TABLE_KEY = blockKey(
        "birch_planks_table"
    );
    public static final ResourceKey<Item> BIRCH_PLANKS_TABLE_ITEM_KEY = itemKey(
        "birch_planks_table"
    );
    public static final ResourceKey<Block> JUNGLE_PLANKS_TABLE_KEY = blockKey(
        "jungle_planks_table"
    );
    public static final ResourceKey<Item> JUNGLE_PLANKS_TABLE_ITEM_KEY =
        itemKey("jungle_planks_table");
    public static final ResourceKey<Block> ACACIA_PLANKS_TABLE_KEY = blockKey(
        "acacia_planks_table"
    );
    public static final ResourceKey<Item> ACACIA_PLANKS_TABLE_ITEM_KEY =
        itemKey("acacia_planks_table");
    public static final ResourceKey<Block> MANGROVE_PLANKS_TABLE_KEY = blockKey(
        "mangrove_planks_table"
    );
    public static final ResourceKey<Item> MANGROVE_PLANKS_TABLE_ITEM_KEY =
        itemKey("mangrove_planks_table");
    public static final ResourceKey<Block> CHERRY_PLANKS_TABLE_KEY = blockKey(
        "cherry_planks_table"
    );
    public static final ResourceKey<Item> CHERRY_PLANKS_TABLE_ITEM_KEY =
        itemKey("cherry_planks_table");
    public static final ResourceKey<Block> BAMBOO_PLANKS_TABLE_KEY = blockKey(
        "bamboo_planks_table"
    );
    public static final ResourceKey<Item> BAMBOO_PLANKS_TABLE_ITEM_KEY =
        itemKey("bamboo_planks_table");
    public static final ResourceKey<Block> CRIMSON_PLANKS_TABLE_KEY = blockKey(
        "crimson_planks_table"
    );
    public static final ResourceKey<Item> CRIMSON_PLANKS_TABLE_ITEM_KEY =
        itemKey("crimson_planks_table");
    public static final ResourceKey<Block> WARPED_PLANKS_TABLE_KEY = blockKey(
        "warped_planks_table"
    );
    public static final ResourceKey<Item> WARPED_PLANKS_TABLE_ITEM_KEY =
        itemKey("warped_planks_table");
    public static final ResourceKey<Block> PALE_OAK_PLANKS_TABLE_KEY = blockKey(
        "pale_oak_planks_table"
    );
    public static final ResourceKey<Item> PALE_OAK_PLANKS_TABLE_ITEM_KEY =
        itemKey("pale_oak_planks_table");

    // ==========================================
    // BRICKS - IDs / KEYS  (base + stairs + slab + wall)
    // ==========================================

    // WHITE
    public static final ResourceKey<Block> WHITE_BRICK_KEY = blockKey(
        "white_brick"
    );
    public static final ResourceKey<Item> WHITE_BRICK_ITEM_KEY = itemKey(
        "white_brick"
    );
    public static final ResourceKey<Block> WHITE_BRICK_STAIRS_KEY = blockKey(
        "white_brick_stairs"
    );
    public static final ResourceKey<Item> WHITE_BRICK_STAIRS_ITEM_KEY = itemKey(
        "white_brick_stairs"
    );
    public static final ResourceKey<Block> WHITE_BRICK_SLAB_KEY = blockKey(
        "white_brick_slab"
    );
    public static final ResourceKey<Item> WHITE_BRICK_SLAB_ITEM_KEY = itemKey(
        "white_brick_slab"
    );
    public static final ResourceKey<Block> WHITE_BRICK_WALL_KEY = blockKey(
        "white_brick_wall"
    );
    public static final ResourceKey<Item> WHITE_BRICK_WALL_ITEM_KEY = itemKey(
        "white_brick_wall"
    );

    // LIGHT_GRAY
    public static final ResourceKey<Block> LIGHT_GRAY_BRICK_KEY = blockKey(
        "light_gray_brick"
    );
    public static final ResourceKey<Item> LIGHT_GRAY_BRICK_ITEM_KEY = itemKey(
        "light_gray_brick"
    );
    public static final ResourceKey<Block> LIGHT_GRAY_BRICK_STAIRS_KEY =
        blockKey("light_gray_brick_stairs");
    public static final ResourceKey<Item> LIGHT_GRAY_BRICK_STAIRS_ITEM_KEY =
        itemKey("light_gray_brick_stairs");
    public static final ResourceKey<Block> LIGHT_GRAY_BRICK_SLAB_KEY = blockKey(
        "light_gray_brick_slab"
    );
    public static final ResourceKey<Item> LIGHT_GRAY_BRICK_SLAB_ITEM_KEY =
        itemKey("light_gray_brick_slab");
    public static final ResourceKey<Block> LIGHT_GRAY_BRICK_WALL_KEY = blockKey(
        "light_gray_brick_wall"
    );
    public static final ResourceKey<Item> LIGHT_GRAY_BRICK_WALL_ITEM_KEY =
        itemKey("light_gray_brick_wall");

    // GRAY
    public static final ResourceKey<Block> GRAY_BRICK_KEY = blockKey(
        "gray_brick"
    );
    public static final ResourceKey<Item> GRAY_BRICK_ITEM_KEY = itemKey(
        "gray_brick"
    );
    public static final ResourceKey<Block> GRAY_BRICK_STAIRS_KEY = blockKey(
        "gray_brick_stairs"
    );
    public static final ResourceKey<Item> GRAY_BRICK_STAIRS_ITEM_KEY = itemKey(
        "gray_brick_stairs"
    );
    public static final ResourceKey<Block> GRAY_BRICK_SLAB_KEY = blockKey(
        "gray_brick_slab"
    );
    public static final ResourceKey<Item> GRAY_BRICK_SLAB_ITEM_KEY = itemKey(
        "gray_brick_slab"
    );
    public static final ResourceKey<Block> GRAY_BRICK_WALL_KEY = blockKey(
        "gray_brick_wall"
    );
    public static final ResourceKey<Item> GRAY_BRICK_WALL_ITEM_KEY = itemKey(
        "gray_brick_wall"
    );

    // BLACK
    public static final ResourceKey<Block> BLACK_BRICK_KEY = blockKey(
        "black_brick"
    );
    public static final ResourceKey<Item> BLACK_BRICK_ITEM_KEY = itemKey(
        "black_brick"
    );
    public static final ResourceKey<Block> BLACK_BRICK_STAIRS_KEY = blockKey(
        "black_brick_stairs"
    );
    public static final ResourceKey<Item> BLACK_BRICK_STAIRS_ITEM_KEY = itemKey(
        "black_brick_stairs"
    );
    public static final ResourceKey<Block> BLACK_BRICK_SLAB_KEY = blockKey(
        "black_brick_slab"
    );
    public static final ResourceKey<Item> BLACK_BRICK_SLAB_ITEM_KEY = itemKey(
        "black_brick_slab"
    );
    public static final ResourceKey<Block> BLACK_BRICK_WALL_KEY = blockKey(
        "black_brick_wall"
    );
    public static final ResourceKey<Item> BLACK_BRICK_WALL_ITEM_KEY = itemKey(
        "black_brick_wall"
    );

    // ORANGE
    public static final ResourceKey<Block> ORANGE_BRICK_KEY = blockKey(
        "orange_brick"
    );
    public static final ResourceKey<Item> ORANGE_BRICK_ITEM_KEY = itemKey(
        "orange_brick"
    );
    public static final ResourceKey<Block> ORANGE_BRICK_STAIRS_KEY = blockKey(
        "orange_brick_stairs"
    );
    public static final ResourceKey<Item> ORANGE_BRICK_STAIRS_ITEM_KEY =
        itemKey("orange_brick_stairs");
    public static final ResourceKey<Block> ORANGE_BRICK_SLAB_KEY = blockKey(
        "orange_brick_slab"
    );
    public static final ResourceKey<Item> ORANGE_BRICK_SLAB_ITEM_KEY = itemKey(
        "orange_brick_slab"
    );
    public static final ResourceKey<Block> ORANGE_BRICK_WALL_KEY = blockKey(
        "orange_brick_wall"
    );
    public static final ResourceKey<Item> ORANGE_BRICK_WALL_ITEM_KEY = itemKey(
        "orange_brick_wall"
    );

    // BROWN
    public static final ResourceKey<Block> BROWN_BRICK_KEY = blockKey(
        "brown_brick"
    );
    public static final ResourceKey<Item> BROWN_BRICK_ITEM_KEY = itemKey(
        "brown_brick"
    );
    public static final ResourceKey<Block> BROWN_BRICK_STAIRS_KEY = blockKey(
        "brown_brick_stairs"
    );
    public static final ResourceKey<Item> BROWN_BRICK_STAIRS_ITEM_KEY = itemKey(
        "brown_brick_stairs"
    );
    public static final ResourceKey<Block> BROWN_BRICK_SLAB_KEY = blockKey(
        "brown_brick_slab"
    );
    public static final ResourceKey<Item> BROWN_BRICK_SLAB_ITEM_KEY = itemKey(
        "brown_brick_slab"
    );
    public static final ResourceKey<Block> BROWN_BRICK_WALL_KEY = blockKey(
        "brown_brick_wall"
    );
    public static final ResourceKey<Item> BROWN_BRICK_WALL_ITEM_KEY = itemKey(
        "brown_brick_wall"
    );

    // YELLOW
    public static final ResourceKey<Block> YELLOW_BRICK_KEY = blockKey(
        "yellow_brick"
    );
    public static final ResourceKey<Item> YELLOW_BRICK_ITEM_KEY = itemKey(
        "yellow_brick"
    );
    public static final ResourceKey<Block> YELLOW_BRICK_STAIRS_KEY = blockKey(
        "yellow_brick_stairs"
    );
    public static final ResourceKey<Item> YELLOW_BRICK_STAIRS_ITEM_KEY =
        itemKey("yellow_brick_stairs");
    public static final ResourceKey<Block> YELLOW_BRICK_SLAB_KEY = blockKey(
        "yellow_brick_slab"
    );
    public static final ResourceKey<Item> YELLOW_BRICK_SLAB_ITEM_KEY = itemKey(
        "yellow_brick_slab"
    );
    public static final ResourceKey<Block> YELLOW_BRICK_WALL_KEY = blockKey(
        "yellow_brick_wall"
    );
    public static final ResourceKey<Item> YELLOW_BRICK_WALL_ITEM_KEY = itemKey(
        "yellow_brick_wall"
    );

    // LIME
    public static final ResourceKey<Block> LIME_BRICK_KEY = blockKey(
        "lime_brick"
    );
    public static final ResourceKey<Item> LIME_BRICK_ITEM_KEY = itemKey(
        "lime_brick"
    );
    public static final ResourceKey<Block> LIME_BRICK_STAIRS_KEY = blockKey(
        "lime_brick_stairs"
    );
    public static final ResourceKey<Item> LIME_BRICK_STAIRS_ITEM_KEY = itemKey(
        "lime_brick_stairs"
    );
    public static final ResourceKey<Block> LIME_BRICK_SLAB_KEY = blockKey(
        "lime_brick_slab"
    );
    public static final ResourceKey<Item> LIME_BRICK_SLAB_ITEM_KEY = itemKey(
        "lime_brick_slab"
    );
    public static final ResourceKey<Block> LIME_BRICK_WALL_KEY = blockKey(
        "lime_brick_wall"
    );
    public static final ResourceKey<Item> LIME_BRICK_WALL_ITEM_KEY = itemKey(
        "lime_brick_wall"
    );

    // GREEN
    public static final ResourceKey<Block> GREEN_BRICK_KEY = blockKey(
        "green_brick"
    );
    public static final ResourceKey<Item> GREEN_BRICK_ITEM_KEY = itemKey(
        "green_brick"
    );
    public static final ResourceKey<Block> GREEN_BRICK_STAIRS_KEY = blockKey(
        "green_brick_stairs"
    );
    public static final ResourceKey<Item> GREEN_BRICK_STAIRS_ITEM_KEY = itemKey(
        "green_brick_stairs"
    );
    public static final ResourceKey<Block> GREEN_BRICK_SLAB_KEY = blockKey(
        "green_brick_slab"
    );
    public static final ResourceKey<Item> GREEN_BRICK_SLAB_ITEM_KEY = itemKey(
        "green_brick_slab"
    );
    public static final ResourceKey<Block> GREEN_BRICK_WALL_KEY = blockKey(
        "green_brick_wall"
    );
    public static final ResourceKey<Item> GREEN_BRICK_WALL_ITEM_KEY = itemKey(
        "green_brick_wall"
    );

    // CYAN
    public static final ResourceKey<Block> CYAN_BRICK_KEY = blockKey(
        "cyan_brick"
    );
    public static final ResourceKey<Item> CYAN_BRICK_ITEM_KEY = itemKey(
        "cyan_brick"
    );
    public static final ResourceKey<Block> CYAN_BRICK_STAIRS_KEY = blockKey(
        "cyan_brick_stairs"
    );
    public static final ResourceKey<Item> CYAN_BRICK_STAIRS_ITEM_KEY = itemKey(
        "cyan_brick_stairs"
    );
    public static final ResourceKey<Block> CYAN_BRICK_SLAB_KEY = blockKey(
        "cyan_brick_slab"
    );
    public static final ResourceKey<Item> CYAN_BRICK_SLAB_ITEM_KEY = itemKey(
        "cyan_brick_slab"
    );
    public static final ResourceKey<Block> CYAN_BRICK_WALL_KEY = blockKey(
        "cyan_brick_wall"
    );
    public static final ResourceKey<Item> CYAN_BRICK_WALL_ITEM_KEY = itemKey(
        "cyan_brick_wall"
    );

    // LIGHT_BLUE
    public static final ResourceKey<Block> LIGHT_BLUE_BRICK_KEY = blockKey(
        "light_blue_brick"
    );
    public static final ResourceKey<Item> LIGHT_BLUE_BRICK_ITEM_KEY = itemKey(
        "light_blue_brick"
    );
    public static final ResourceKey<Block> LIGHT_BLUE_BRICK_STAIRS_KEY =
        blockKey("light_blue_brick_stairs");
    public static final ResourceKey<Item> LIGHT_BLUE_BRICK_STAIRS_ITEM_KEY =
        itemKey("light_blue_brick_stairs");
    public static final ResourceKey<Block> LIGHT_BLUE_BRICK_SLAB_KEY = blockKey(
        "light_blue_brick_slab"
    );
    public static final ResourceKey<Item> LIGHT_BLUE_BRICK_SLAB_ITEM_KEY =
        itemKey("light_blue_brick_slab");
    public static final ResourceKey<Block> LIGHT_BLUE_BRICK_WALL_KEY = blockKey(
        "light_blue_brick_wall"
    );
    public static final ResourceKey<Item> LIGHT_BLUE_BRICK_WALL_ITEM_KEY =
        itemKey("light_blue_brick_wall");

    // BLUE
    public static final ResourceKey<Block> BLUE_BRICK_KEY = blockKey(
        "blue_brick"
    );
    public static final ResourceKey<Item> BLUE_BRICK_ITEM_KEY = itemKey(
        "blue_brick"
    );
    public static final ResourceKey<Block> BLUE_BRICK_STAIRS_KEY = blockKey(
        "blue_brick_stairs"
    );
    public static final ResourceKey<Item> BLUE_BRICK_STAIRS_ITEM_KEY = itemKey(
        "blue_brick_stairs"
    );
    public static final ResourceKey<Block> BLUE_BRICK_SLAB_KEY = blockKey(
        "blue_brick_slab"
    );
    public static final ResourceKey<Item> BLUE_BRICK_SLAB_ITEM_KEY = itemKey(
        "blue_brick_slab"
    );
    public static final ResourceKey<Block> BLUE_BRICK_WALL_KEY = blockKey(
        "blue_brick_wall"
    );
    public static final ResourceKey<Item> BLUE_BRICK_WALL_ITEM_KEY = itemKey(
        "blue_brick_wall"
    );

    // PURPLE
    public static final ResourceKey<Block> PURPLE_BRICK_KEY = blockKey(
        "purple_brick"
    );
    public static final ResourceKey<Item> PURPLE_BRICK_ITEM_KEY = itemKey(
        "purple_brick"
    );
    public static final ResourceKey<Block> PURPLE_BRICK_STAIRS_KEY = blockKey(
        "purple_brick_stairs"
    );
    public static final ResourceKey<Item> PURPLE_BRICK_STAIRS_ITEM_KEY =
        itemKey("purple_brick_stairs");
    public static final ResourceKey<Block> PURPLE_BRICK_SLAB_KEY = blockKey(
        "purple_brick_slab"
    );
    public static final ResourceKey<Item> PURPLE_BRICK_SLAB_ITEM_KEY = itemKey(
        "purple_brick_slab"
    );
    public static final ResourceKey<Block> PURPLE_BRICK_WALL_KEY = blockKey(
        "purple_brick_wall"
    );
    public static final ResourceKey<Item> PURPLE_BRICK_WALL_ITEM_KEY = itemKey(
        "purple_brick_wall"
    );

    // MAGENTA
    public static final ResourceKey<Block> MAGENTA_BRICK_KEY = blockKey(
        "magenta_brick"
    );
    public static final ResourceKey<Item> MAGENTA_BRICK_ITEM_KEY = itemKey(
        "magenta_brick"
    );
    public static final ResourceKey<Block> MAGENTA_BRICK_STAIRS_KEY = blockKey(
        "magenta_brick_stairs"
    );
    public static final ResourceKey<Item> MAGENTA_BRICK_STAIRS_ITEM_KEY =
        itemKey("magenta_brick_stairs");
    public static final ResourceKey<Block> MAGENTA_BRICK_SLAB_KEY = blockKey(
        "magenta_brick_slab"
    );
    public static final ResourceKey<Item> MAGENTA_BRICK_SLAB_ITEM_KEY = itemKey(
        "magenta_brick_slab"
    );
    public static final ResourceKey<Block> MAGENTA_BRICK_WALL_KEY = blockKey(
        "magenta_brick_wall"
    );
    public static final ResourceKey<Item> MAGENTA_BRICK_WALL_ITEM_KEY = itemKey(
        "magenta_brick_wall"
    );

    // PINK
    public static final ResourceKey<Block> PINK_BRICK_KEY = blockKey(
        "pink_brick"
    );
    public static final ResourceKey<Item> PINK_BRICK_ITEM_KEY = itemKey(
        "pink_brick"
    );
    public static final ResourceKey<Block> PINK_BRICK_STAIRS_KEY = blockKey(
        "pink_brick_stairs"
    );
    public static final ResourceKey<Item> PINK_BRICK_STAIRS_ITEM_KEY = itemKey(
        "pink_brick_stairs"
    );
    public static final ResourceKey<Block> PINK_BRICK_SLAB_KEY = blockKey(
        "pink_brick_slab"
    );
    public static final ResourceKey<Item> PINK_BRICK_SLAB_ITEM_KEY = itemKey(
        "pink_brick_slab"
    );
    public static final ResourceKey<Block> PINK_BRICK_WALL_KEY = blockKey(
        "pink_brick_wall"
    );
    public static final ResourceKey<Item> PINK_BRICK_WALL_ITEM_KEY = itemKey(
        "pink_brick_wall"
    );

    // ==========================================
    // MOSSY STONES - IDs / KEYS  (base + stairs + slab + wall)
    // ==========================================
    public static final ResourceKey<Block> MOSSY_STONE_KEY = blockKey(
        "mossy_stone"
    );
    public static final ResourceKey<Item> MOSSY_STONE_ITEM_KEY = itemKey(
        "mossy_stone"
    );

    public static final ResourceKey<Block> MOSSY_STONE_STAIRS_KEY = blockKey(
        "mossy_stone_stairs"
    );
    public static final ResourceKey<Item> MOSSY_STONE_STAIRS_ITEM_KEY = itemKey(
        "mossy_stone_stairs"
    );

    public static final ResourceKey<Block> MOSSY_STONE_SLAB_KEY = blockKey(
        "mossy_stone_slab"
    );

    public static final ResourceKey<Item> MOSSY_STONE_SLAB_ITEM_KEY = itemKey(
        "mossy_stone_slab"
    );

    public static final ResourceKey<Block> MOSSY_STONE_WALL_KEY = blockKey(
        "mossy_stone_wall"
    );
    public static final ResourceKey<Item> MOSSY_STONE_WALL_ITEM_KEY = itemKey(
        "mossy_stone_wall"
    );
    // ==========================================
    // NEW BRICKS - IDs / KEYS  (base + stairs + slab + wall)
    // ==========================================
    public static final ResourceKey<Block> ANDESITE_BRICKS_KEY = blockKey(
        "andesite_bricks"
    );
    public static final ResourceKey<Item> ANDESITE_BRICKS_ITEM_KEY = itemKey(
        "andesite_bricks"
    );
    public static final ResourceKey<Block> ANDESITE_BRICKS_STAIRS_KEY =
        blockKey("andesite_bricks_stairs");
    public static final ResourceKey<Item> ANDESITE_BRICKS_STAIRS_ITEM_KEY =
        itemKey("andesite_bricks_stairs");
    public static final ResourceKey<Block> ANDESITE_BRICKS_SLAB_KEY = blockKey(
        "andesite_bricks_slab"
    );
    public static final ResourceKey<Item> ANDESITE_BRICKS_SLAB_ITEM_KEY =
        itemKey("andesite_bricks_slab");
    public static final ResourceKey<Block> ANDESITE_BRICKS_WALL_KEY = blockKey(
        "andesite_bricks_wall"
    );
    public static final ResourceKey<Item> ANDESITE_BRICKS_WALL_ITEM_KEY =
        itemKey("andesite_bricks_wall");
    public static final ResourceKey<Block> POLISHED_ANDESITE_WALL_KEY =
        blockKey("polished_andesite_wall");
    public static final ResourceKey<Item> POLISHED_ANDESITE_WALL_ITEM_KEY =
        itemKey("polished_andesite_wall");

    // ==========================================
    // BACKPORT - IDs / KEYS
    // ==========================================

    public static final ResourceKey<Block> WHITE_WOOL_STAIRS_KEY = blockKey(
        "white_wool_stairs"
    );
    public static final ResourceKey<Item> WHITE_WOOL_STAIRS_ITEM_KEY = itemKey(
        "white_wool_stairs"
    );

    public static final ResourceKey<Block> LIGHT_GRAY_WOOL_STAIRS_KEY =
        blockKey("light_gray_wool_stairs");
    public static final ResourceKey<Item> LIGHT_GRAY_WOOL_STAIRS_ITEM_KEY =
        itemKey("light_gray_wool_stairs");

    public static final ResourceKey<Block> GRAY_WOOL_STAIRS_KEY = blockKey(
        "gray_wool_stairs"
    );
    public static final ResourceKey<Item> GRAY_WOOL_STAIRS_ITEM_KEY = itemKey(
        "gray_wool_stairs"
    );

    public static final ResourceKey<Block> BLACK_WOOL_STAIRS_KEY = blockKey(
        "black_wool_stairs"
    );
    public static final ResourceKey<Item> BLACK_WOOL_STAIRS_ITEM_KEY = itemKey(
        "black_wool_stairs"
    );

    public static final ResourceKey<Block> RED_WOOL_STAIRS_KEY = blockKey(
        "red_wool_stairs"
    );
    public static final ResourceKey<Item> RED_WOOL_STAIRS_ITEM_KEY = itemKey(
        "red_wool_stairs"
    );

    public static final ResourceKey<Block> ORANGE_WOOL_STAIRS_KEY = blockKey(
        "orange_wool_stairs"
    );
    public static final ResourceKey<Item> ORANGE_WOOL_STAIRS_ITEM_KEY = itemKey(
        "orange_wool_stairs"
    );

    public static final ResourceKey<Block> BROWN_WOOL_STAIRS_KEY = blockKey(
        "brown_wool_stairs"
    );
    public static final ResourceKey<Item> BROWN_WOOL_STAIRS_ITEM_KEY = itemKey(
        "brown_wool_stairs"
    );

    public static final ResourceKey<Block> YELLOW_WOOL_STAIRS_KEY = blockKey(
        "yellow_wool_stairs"
    );
    public static final ResourceKey<Item> YELLOW_WOOL_STAIRS_ITEM_KEY = itemKey(
        "yellow_wool_stairs"
    );

    public static final ResourceKey<Block> LIME_WOOL_STAIRS_KEY = blockKey(
        "lime_wool_stairs"
    );
    public static final ResourceKey<Item> LIME_WOOL_STAIRS_ITEM_KEY = itemKey(
        "lime_wool_stairs"
    );

    public static final ResourceKey<Block> GREEN_WOOL_STAIRS_KEY = blockKey(
        "green_wool_stairs"
    );
    public static final ResourceKey<Item> GREEN_WOOL_STAIRS_ITEM_KEY = itemKey(
        "green_wool_stairs"
    );

    public static final ResourceKey<Block> CYAN_WOOL_STAIRS_KEY = blockKey(
        "cyan_wool_stairs"
    );
    public static final ResourceKey<Item> CYAN_WOOL_STAIRS_ITEM_KEY = itemKey(
        "cyan_wool_stairs"
    );

    public static final ResourceKey<Block> LIGHT_BLUE_WOOL_STAIRS_KEY =
        blockKey("light_blue_wool_stairs");
    public static final ResourceKey<Item> LIGHT_BLUE_WOOL_STAIRS_ITEM_KEY =
        itemKey("light_blue_wool_stairs");

    public static final ResourceKey<Block> BLUE_WOOL_STAIRS_KEY = blockKey(
        "blue_wool_stairs"
    );
    public static final ResourceKey<Item> BLUE_WOOL_STAIRS_ITEM_KEY = itemKey(
        "blue_wool_stairs"
    );

    public static final ResourceKey<Block> PURPLE_WOOL_STAIRS_KEY = blockKey(
        "purple_wool_stairs"
    );
    public static final ResourceKey<Item> PURPLE_WOOL_STAIRS_ITEM_KEY = itemKey(
        "purple_wool_stairs"
    );

    public static final ResourceKey<Block> MAGENTA_WOOL_STAIRS_KEY = blockKey(
        "magenta_wool_stairs"
    );
    public static final ResourceKey<Item> MAGENTA_WOOL_STAIRS_ITEM_KEY =
        itemKey("magenta_wool_stairs");

    public static final ResourceKey<Block> PINK_WOOL_STAIRS_KEY = blockKey(
        "pink_wool_stairs"
    );
    public static final ResourceKey<Item> PINK_WOOL_STAIRS_ITEM_KEY = itemKey(
        "pink_wool_stairs"
    );

    public static final ResourceKey<Block> WHITE_WOOL_SLAB_KEY = blockKey(
        "white_wool_slab"
    );
    public static final ResourceKey<Item> WHITE_WOOL_SLAB_ITEM_KEY = itemKey(
        "white_wool_slab"
    );

    public static final ResourceKey<Block> LIGHT_GRAY_WOOL_SLAB_KEY = blockKey(
        "light_gray_wool_slab"
    );
    public static final ResourceKey<Item> LIGHT_GRAY_WOOL_SLAB_ITEM_KEY =
        itemKey("light_gray_wool_slab");

    public static final ResourceKey<Block> GRAY_WOOL_SLAB_KEY = blockKey(
        "gray_wool_slab"
    );
    public static final ResourceKey<Item> GRAY_WOOL_SLAB_ITEM_KEY = itemKey(
        "gray_wool_slab"
    );

    public static final ResourceKey<Block> BLACK_WOOL_SLAB_KEY = blockKey(
        "black_wool_slab"
    );
    public static final ResourceKey<Item> BLACK_WOOL_SLAB_ITEM_KEY = itemKey(
        "black_wool_slab"
    );

    public static final ResourceKey<Block> RED_WOOL_SLAB_KEY = blockKey(
        "red_wool_slab"
    );
    public static final ResourceKey<Item> RED_WOOL_SLAB_ITEM_KEY = itemKey(
        "red_wool_slab"
    );

    public static final ResourceKey<Block> ORANGE_WOOL_SLAB_KEY = blockKey(
        "orange_wool_slab"
    );
    public static final ResourceKey<Item> ORANGE_WOOL_SLAB_ITEM_KEY = itemKey(
        "orange_wool_slab"
    );

    public static final ResourceKey<Block> BROWN_WOOL_SLAB_KEY = blockKey(
        "brown_wool_slab"
    );
    public static final ResourceKey<Item> BROWN_WOOL_SLAB_ITEM_KEY = itemKey(
        "brown_wool_slab"
    );

    public static final ResourceKey<Block> YELLOW_WOOL_SLAB_KEY = blockKey(
        "yellow_wool_slab"
    );
    public static final ResourceKey<Item> YELLOW_WOOL_SLAB_ITEM_KEY = itemKey(
        "yellow_wool_slab"
    );

    public static final ResourceKey<Block> LIME_WOOL_SLAB_KEY = blockKey(
        "lime_wool_slab"
    );
    public static final ResourceKey<Item> LIME_WOOL_SLAB_ITEM_KEY = itemKey(
        "lime_wool_slab"
    );

    public static final ResourceKey<Block> GREEN_WOOL_SLAB_KEY = blockKey(
        "green_wool_slab"
    );
    public static final ResourceKey<Item> GREEN_WOOL_SLAB_ITEM_KEY = itemKey(
        "green_wool_slab"
    );

    public static final ResourceKey<Block> CYAN_WOOL_SLAB_KEY = blockKey(
        "cyan_wool_slab"
    );
    public static final ResourceKey<Item> CYAN_WOOL_SLAB_ITEM_KEY = itemKey(
        "cyan_wool_slab"
    );

    public static final ResourceKey<Block> LIGHT_BLUE_WOOL_SLAB_KEY = blockKey(
        "light_blue_wool_slab"
    );
    public static final ResourceKey<Item> LIGHT_BLUE_WOOL_SLAB_ITEM_KEY =
        itemKey("light_blue_wool_slab");

    public static final ResourceKey<Block> BLUE_WOOL_SLAB_KEY = blockKey(
        "blue_wool_slab"
    );
    public static final ResourceKey<Item> BLUE_WOOL_SLAB_ITEM_KEY = itemKey(
        "blue_wool_slab"
    );

    public static final ResourceKey<Block> PURPLE_WOOL_SLAB_KEY = blockKey(
        "purple_wool_slab"
    );
    public static final ResourceKey<Item> PURPLE_WOOL_SLAB_ITEM_KEY = itemKey(
        "purple_wool_slab"
    );

    public static final ResourceKey<Block> MAGENTA_WOOL_SLAB_KEY = blockKey(
        "magenta_wool_slab"
    );
    public static final ResourceKey<Item> MAGENTA_WOOL_SLAB_ITEM_KEY = itemKey(
        "magenta_wool_slab"
    );

    public static final ResourceKey<Block> PINK_WOOL_SLAB_KEY = blockKey(
        "pink_wool_slab"
    );
    public static final ResourceKey<Item> PINK_WOOL_SLAB_ITEM_KEY = itemKey(
        "pink_wool_slab"
    );

    // ==========================================
    // MOSSY BLOCK INSTANCES
    // ==========================================
    public static final Block MOSSY_STONE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(MOSSY_STONE_KEY)
    );
    public static final Block MOSSY_STONE_STAIRS = new StairBlock(
        MOSSY_STONE.defaultBlockState(),
        BlockBehaviour.Properties.of()
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(MOSSY_STONE_STAIRS_KEY)
    );
    public static final Block MOSSY_STONE_SLAB = new SlabBlock(
        BlockBehaviour.Properties.of()
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(MOSSY_STONE_SLAB_KEY)
    );
    public static final Block MOSSY_STONE_WALL = new WallBlock(
        BlockBehaviour.Properties.of()
            .strength(1.5f, 6.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(MOSSY_STONE_WALL_KEY)
    );

    // ==========================================
    // NEW BRICKS BLOCK INSTANCES
    // ==========================================
    public static final Block ANDESITE_BRICKS = new Block(
        BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE).setId(
            ANDESITE_BRICKS_KEY
        )
    );
    public static final Block ANDESITE_BRICKS_STAIRS = new StairBlock(
        ANDESITE_BRICKS.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_STAIRS).setId(
            ANDESITE_BRICKS_STAIRS_KEY
        )
    );
    public static final Block ANDESITE_BRICKS_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_SLAB).setId(
            ANDESITE_BRICKS_SLAB_KEY
        )
    );
    public static final Block ANDESITE_BRICKS_WALL = new WallBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_WALL).setId(
            ANDESITE_BRICKS_WALL_KEY
        )
    );
    public static final Block POLISHED_ANDESITE_WALL = new WallBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.ANDESITE_WALL).setId(
            POLISHED_ANDESITE_WALL_KEY
        )
    );

    // ==========================================
    // TILE BLOCK INSTANCES
    // ==========================================
    public static final Block WHITE_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(WHITE_AND_BLACK_TILE_KEY)
    );
    public static final Block LIGHT_GRAY_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(LIGHT_GRAY_AND_BLACK_TILE_KEY)
    );
    public static final Block GRAY_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(4.0f)
            .requiresCorrectToolForDrops()
            .sound(SoundType.STONE)
            .setId(GRAY_AND_BLACK_TILE_KEY)
    );
    public static final Block ORANGE_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(ORANGE_AND_BLACK_TILE_KEY)
    );
    public static final Block MAGENTA_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(MAGENTA_AND_BLACK_TILE_KEY)
    );
    public static final Block LIGHT_BLUE_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(LIGHT_BLUE_AND_BLACK_TILE_KEY)
    );
    public static final Block YELLOW_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(YELLOW_AND_BLACK_TILE_KEY)
    );
    public static final Block LIME_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(LIME_AND_BLACK_TILE_KEY)
    );
    public static final Block PINK_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(PINK_AND_BLACK_TILE_KEY)
    );
    public static final Block CYAN_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(CYAN_AND_BLACK_TILE_KEY)
    );
    public static final Block PURPLE_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(PURPLE_AND_BLACK_TILE_KEY)
    );
    public static final Block BLUE_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(BLUE_AND_BLACK_TILE_KEY)
    );
    public static final Block BROWN_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(BROWN_AND_BLACK_TILE_KEY)
    );
    public static final Block GREEN_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(GREEN_AND_BLACK_TILE_KEY)
    );
    public static final Block RED_AND_BLACK_TILE = new Block(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .setId(RED_AND_BLACK_TILE_KEY)
    );

    // ==========================================
    // CHROMA KEY BLOCK INSTANCES
    // ==========================================
    public static final Block BLUE_CHROMA_KEY = new RedstoneLampBlock(
        BlockBehaviour.Properties.of()
            .noOcclusion()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .lightLevel(state -> 15)
            .setId(BLUE_CHROMA_KEY_KEY)
    );
    public static final Block GREEN_CHROMA_KEY = new RedstoneLampBlock(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .lightLevel(state -> 15)
            .setId(GREEN_CHROMA_KEY_KEY)
    );
    public static final Block RED_CHROMA_KEY = new RedstoneLampBlock(
        BlockBehaviour.Properties.of()
            .strength(2.0f)
            .requiresCorrectToolForDrops()
            .lightLevel(state -> 15)
            .setId(RED_CHROMA_KEY_KEY)
    );

    // ==========================================
    // TABLE BLOCK INSTANCES
    // ==========================================
    public static final Block OAK_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(OAK_PLANKS_TABLE_KEY)
    );
    public static final Block DARK_OAK_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(DARK_OAK_PLANKS_TABLE_KEY)
    );
    public static final Block SPRUCE_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(SPRUCE_PLANKS_TABLE_KEY)
    );
    public static final Block BIRCH_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(BIRCH_PLANKS_TABLE_KEY)
    );
    public static final Block JUNGLE_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(JUNGLE_PLANKS_TABLE_KEY)
    );
    public static final Block ACACIA_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(ACACIA_PLANKS_TABLE_KEY)
    );
    public static final Block MANGROVE_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(MANGROVE_PLANKS_TABLE_KEY)
    );
    public static final Block CHERRY_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(CHERRY_PLANKS_TABLE_KEY)
    );
    public static final Block BAMBOO_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.BAMBOO_WOOD)
            .setId(BAMBOO_PLANKS_TABLE_KEY)
    );
    public static final Block CRIMSON_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(CRIMSON_PLANKS_TABLE_KEY)
    );
    public static final Block WARPED_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(WARPED_PLANKS_TABLE_KEY)
    );
    public static final Block PALE_OAK_PLANKS_TABLE = new Block(
        BlockBehaviour.Properties.of()
            .strength(1.75f)
            .noOcclusion()
            .sound(SoundType.WOOD)
            .setId(PALE_OAK_PLANKS_TABLE_KEY)
    );

    // ==========================================
    // BRICK BLOCK INSTANCES  (base + stairs + slab + wall)
    // ==========================================
    private static BlockBehaviour.Properties brickSettings(
        ResourceKey<Block> key
    ) {
        return BlockBehaviour.Properties.of()
            .strength(2.0f, 6.0f)
            .sound(SoundType.STONE)
            .setId(key);
    }

    // WHITE
    public static final Block WHITE_BRICK = new Block(
        brickSettings(WHITE_BRICK_KEY)
    );
    public static final Block WHITE_BRICK_STAIRS = new StairBlock(
        WHITE_BRICK.defaultBlockState(),
        brickSettings(WHITE_BRICK_STAIRS_KEY)
    );
    public static final Block WHITE_BRICK_SLAB = new SlabBlock(
        brickSettings(WHITE_BRICK_SLAB_KEY)
    );
    public static final Block WHITE_BRICK_WALL = new WallBlock(
        brickSettings(WHITE_BRICK_WALL_KEY)
    );

    // LIGHT_GRAY
    public static final Block LIGHT_GRAY_BRICK = new Block(
        brickSettings(LIGHT_GRAY_BRICK_KEY)
    );
    public static final Block LIGHT_GRAY_BRICK_STAIRS = new StairBlock(
        LIGHT_GRAY_BRICK.defaultBlockState(),
        brickSettings(LIGHT_GRAY_BRICK_STAIRS_KEY)
    );
    public static final Block LIGHT_GRAY_BRICK_SLAB = new SlabBlock(
        brickSettings(LIGHT_GRAY_BRICK_SLAB_KEY)
    );
    public static final Block LIGHT_GRAY_BRICK_WALL = new WallBlock(
        brickSettings(LIGHT_GRAY_BRICK_WALL_KEY)
    );

    // GRAY
    public static final Block GRAY_BRICK = new Block(
        brickSettings(GRAY_BRICK_KEY)
    );
    public static final Block GRAY_BRICK_STAIRS = new StairBlock(
        GRAY_BRICK.defaultBlockState(),
        brickSettings(GRAY_BRICK_STAIRS_KEY)
    );
    public static final Block GRAY_BRICK_SLAB = new SlabBlock(
        brickSettings(GRAY_BRICK_SLAB_KEY)
    );
    public static final Block GRAY_BRICK_WALL = new WallBlock(
        brickSettings(GRAY_BRICK_WALL_KEY)
    );

    // BLACK
    public static final Block BLACK_BRICK = new Block(
        brickSettings(BLACK_BRICK_KEY)
    );
    public static final Block BLACK_BRICK_STAIRS = new StairBlock(
        BLACK_BRICK.defaultBlockState(),
        brickSettings(BLACK_BRICK_STAIRS_KEY)
    );
    public static final Block BLACK_BRICK_SLAB = new SlabBlock(
        brickSettings(BLACK_BRICK_SLAB_KEY)
    );
    public static final Block BLACK_BRICK_WALL = new WallBlock(
        brickSettings(BLACK_BRICK_WALL_KEY)
    );

    // ORANGE
    public static final Block ORANGE_BRICK = new Block(
        brickSettings(ORANGE_BRICK_KEY)
    );
    public static final Block ORANGE_BRICK_STAIRS = new StairBlock(
        ORANGE_BRICK.defaultBlockState(),
        brickSettings(ORANGE_BRICK_STAIRS_KEY)
    );
    public static final Block ORANGE_BRICK_SLAB = new SlabBlock(
        brickSettings(ORANGE_BRICK_SLAB_KEY)
    );
    public static final Block ORANGE_BRICK_WALL = new WallBlock(
        brickSettings(ORANGE_BRICK_WALL_KEY)
    );

    // BROWN
    public static final Block BROWN_BRICK = new Block(
        brickSettings(BROWN_BRICK_KEY)
    );
    public static final Block BROWN_BRICK_STAIRS = new StairBlock(
        BROWN_BRICK.defaultBlockState(),
        brickSettings(BROWN_BRICK_STAIRS_KEY)
    );
    public static final Block BROWN_BRICK_SLAB = new SlabBlock(
        brickSettings(BROWN_BRICK_SLAB_KEY)
    );
    public static final Block BROWN_BRICK_WALL = new WallBlock(
        brickSettings(BROWN_BRICK_WALL_KEY)
    );

    // YELLOW
    public static final Block YELLOW_BRICK = new Block(
        brickSettings(YELLOW_BRICK_KEY)
    );
    public static final Block YELLOW_BRICK_STAIRS = new StairBlock(
        YELLOW_BRICK.defaultBlockState(),
        brickSettings(YELLOW_BRICK_STAIRS_KEY)
    );
    public static final Block YELLOW_BRICK_SLAB = new SlabBlock(
        brickSettings(YELLOW_BRICK_SLAB_KEY)
    );
    public static final Block YELLOW_BRICK_WALL = new WallBlock(
        brickSettings(YELLOW_BRICK_WALL_KEY)
    );

    // LIME
    public static final Block LIME_BRICK = new Block(
        brickSettings(LIME_BRICK_KEY)
    );
    public static final Block LIME_BRICK_STAIRS = new StairBlock(
        LIME_BRICK.defaultBlockState(),
        brickSettings(LIME_BRICK_STAIRS_KEY)
    );
    public static final Block LIME_BRICK_SLAB = new SlabBlock(
        brickSettings(LIME_BRICK_SLAB_KEY)
    );
    public static final Block LIME_BRICK_WALL = new WallBlock(
        brickSettings(LIME_BRICK_WALL_KEY)
    );

    // GREEN
    public static final Block GREEN_BRICK = new Block(
        brickSettings(GREEN_BRICK_KEY)
    );
    public static final Block GREEN_BRICK_STAIRS = new StairBlock(
        GREEN_BRICK.defaultBlockState(),
        brickSettings(GREEN_BRICK_STAIRS_KEY)
    );
    public static final Block GREEN_BRICK_SLAB = new SlabBlock(
        brickSettings(GREEN_BRICK_SLAB_KEY)
    );
    public static final Block GREEN_BRICK_WALL = new WallBlock(
        brickSettings(GREEN_BRICK_WALL_KEY)
    );

    // CYAN
    public static final Block CYAN_BRICK = new Block(
        brickSettings(CYAN_BRICK_KEY)
    );
    public static final Block CYAN_BRICK_STAIRS = new StairBlock(
        CYAN_BRICK.defaultBlockState(),
        brickSettings(CYAN_BRICK_STAIRS_KEY)
    );
    public static final Block CYAN_BRICK_SLAB = new SlabBlock(
        brickSettings(CYAN_BRICK_SLAB_KEY)
    );
    public static final Block CYAN_BRICK_WALL = new WallBlock(
        brickSettings(CYAN_BRICK_WALL_KEY)
    );

    // LIGHT_BLUE
    public static final Block LIGHT_BLUE_BRICK = new Block(
        brickSettings(LIGHT_BLUE_BRICK_KEY)
    );
    public static final Block LIGHT_BLUE_BRICK_STAIRS = new StairBlock(
        LIGHT_BLUE_BRICK.defaultBlockState(),
        brickSettings(LIGHT_BLUE_BRICK_STAIRS_KEY)
    );
    public static final Block LIGHT_BLUE_BRICK_SLAB = new SlabBlock(
        brickSettings(LIGHT_BLUE_BRICK_SLAB_KEY)
    );
    public static final Block LIGHT_BLUE_BRICK_WALL = new WallBlock(
        brickSettings(LIGHT_BLUE_BRICK_WALL_KEY)
    );

    // BLUE
    public static final Block BLUE_BRICK = new Block(
        brickSettings(BLUE_BRICK_KEY)
    );
    public static final Block BLUE_BRICK_STAIRS = new StairBlock(
        BLUE_BRICK.defaultBlockState(),
        brickSettings(BLUE_BRICK_STAIRS_KEY)
    );
    public static final Block BLUE_BRICK_SLAB = new SlabBlock(
        brickSettings(BLUE_BRICK_SLAB_KEY)
    );
    public static final Block BLUE_BRICK_WALL = new WallBlock(
        brickSettings(BLUE_BRICK_WALL_KEY)
    );

    // PURPLE
    public static final Block PURPLE_BRICK = new Block(
        brickSettings(PURPLE_BRICK_KEY)
    );
    public static final Block PURPLE_BRICK_STAIRS = new StairBlock(
        PURPLE_BRICK.defaultBlockState(),
        brickSettings(PURPLE_BRICK_STAIRS_KEY)
    );
    public static final Block PURPLE_BRICK_SLAB = new SlabBlock(
        brickSettings(PURPLE_BRICK_SLAB_KEY)
    );
    public static final Block PURPLE_BRICK_WALL = new WallBlock(
        brickSettings(PURPLE_BRICK_WALL_KEY)
    );

    // MAGENTA
    public static final Block MAGENTA_BRICK = new Block(
        brickSettings(MAGENTA_BRICK_KEY)
    );
    public static final Block MAGENTA_BRICK_STAIRS = new StairBlock(
        MAGENTA_BRICK.defaultBlockState(),
        brickSettings(MAGENTA_BRICK_STAIRS_KEY)
    );
    public static final Block MAGENTA_BRICK_SLAB = new SlabBlock(
        brickSettings(MAGENTA_BRICK_SLAB_KEY)
    );
    public static final Block MAGENTA_BRICK_WALL = new WallBlock(
        brickSettings(MAGENTA_BRICK_WALL_KEY)
    );

    // PINK
    public static final Block PINK_BRICK = new Block(
        brickSettings(PINK_BRICK_KEY)
    );
    public static final Block PINK_BRICK_STAIRS = new StairBlock(
        PINK_BRICK.defaultBlockState(),
        brickSettings(PINK_BRICK_STAIRS_KEY)
    );
    public static final Block PINK_BRICK_SLAB = new SlabBlock(
        brickSettings(PINK_BRICK_SLAB_KEY)
    );
    public static final Block PINK_BRICK_WALL = new WallBlock(
        brickSettings(PINK_BRICK_WALL_KEY)
    );

    // ==========================================
    // HELPER: registra bloco + BlockItem de uma vez
    // ==========================================
    private static BlockItem registerBlock(
        ResourceKey<Block> blockKey,
        Block block,
        ResourceKey<Item> itemKey
    ) {
        Registry.register(BuiltInRegistries.BLOCK, blockKey, block);
        BlockItem item = new BlockItem(
            block,
            new Item.Properties()
                .setId(itemKey)
                .useBlockDescriptionPrefix()
        );
        Registry.register(BuiltInRegistries.ITEM, itemKey, item);
        return item;
    }

    // ==========================================
    // BACKPORT INSTANCES
    // ==========================================
    public static final Block WHITE_WOOL_STAIRS = new StairBlock(
        Blocks.WHITE_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(
            WHITE_WOOL_STAIRS_KEY
        )
    );
    public static final Block LIGHT_GRAY_WOOL_STAIRS = new StairBlock(
        Blocks.LIGHT_GRAY_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL).setId(
            LIGHT_GRAY_WOOL_STAIRS_KEY
        )
    );
    public static final Block GRAY_WOOL_STAIRS = new StairBlock(
        Blocks.GRAY_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL).setId(
            GRAY_WOOL_STAIRS_KEY
        )
    );
    public static final Block BLACK_WOOL_STAIRS = new StairBlock(
        Blocks.BLACK_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL).setId(
            BLACK_WOOL_STAIRS_KEY
        )
    );
    public static final Block RED_WOOL_STAIRS = new StairBlock(
        Blocks.RED_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL).setId(
            RED_WOOL_STAIRS_KEY
        )
    );
    public static final Block ORANGE_WOOL_STAIRS = new StairBlock(
        Blocks.ORANGE_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL).setId(
            ORANGE_WOOL_STAIRS_KEY
        )
    );
    public static final Block BROWN_WOOL_STAIRS = new StairBlock(
        Blocks.BROWN_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).setId(
            BROWN_WOOL_STAIRS_KEY
        )
    );
    public static final Block YELLOW_WOOL_STAIRS = new StairBlock(
        Blocks.YELLOW_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL).setId(
            YELLOW_WOOL_STAIRS_KEY
        )
    );
    public static final Block LIME_WOOL_STAIRS = new StairBlock(
        Blocks.LIME_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL).setId(
            LIME_WOOL_STAIRS_KEY
        )
    );
    public static final Block GREEN_WOOL_STAIRS = new StairBlock(
        Blocks.GREEN_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL).setId(
            GREEN_WOOL_STAIRS_KEY
        )
    );
    public static final Block CYAN_WOOL_STAIRS = new StairBlock(
        Blocks.CYAN_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL).setId(
            CYAN_WOOL_STAIRS_KEY
        )
    );
    public static final Block LIGHT_BLUE_WOOL_STAIRS = new StairBlock(
        Blocks.LIGHT_BLUE_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL).setId(
            LIGHT_BLUE_WOOL_STAIRS_KEY
        )
    );
    public static final Block BLUE_WOOL_STAIRS = new StairBlock(
        Blocks.BLUE_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).setId(
            BLUE_WOOL_STAIRS_KEY
        )
    );
    public static final Block PURPLE_WOOL_STAIRS = new StairBlock(
        Blocks.PURPLE_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL).setId(
            PURPLE_WOOL_STAIRS_KEY
        )
    );
    public static final Block MAGENTA_WOOL_STAIRS = new StairBlock(
        Blocks.MAGENTA_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL).setId(
            MAGENTA_WOOL_STAIRS_KEY
        )
    );
    public static final Block PINK_WOOL_STAIRS = new StairBlock(
        Blocks.PINK_WOOL.defaultBlockState(),
        BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL).setId(
            PINK_WOOL_STAIRS_KEY
        )
    );

    public static final Block WHITE_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.WHITE_WOOL).setId(
            WHITE_WOOL_SLAB_KEY
        )
    );
    public static final Block LIGHT_GRAY_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_GRAY_WOOL).setId(
            LIGHT_GRAY_WOOL_SLAB_KEY
        )
    );
    public static final Block GRAY_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.GRAY_WOOL).setId(
            GRAY_WOOL_SLAB_KEY
        )
    );
    public static final Block BLACK_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.BLACK_WOOL).setId(
            BLACK_WOOL_SLAB_KEY
        )
    );
    public static final Block RED_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.RED_WOOL).setId(
            RED_WOOL_SLAB_KEY
        )
    );
    public static final Block ORANGE_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.ORANGE_WOOL).setId(
            ORANGE_WOOL_SLAB_KEY
        )
    );
    public static final Block BROWN_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.BROWN_WOOL).setId(
            BROWN_WOOL_SLAB_KEY
        )
    );
    public static final Block YELLOW_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.YELLOW_WOOL).setId(
            YELLOW_WOOL_SLAB_KEY
        )
    );
    public static final Block LIME_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.LIME_WOOL).setId(
            LIME_WOOL_SLAB_KEY
        )
    );
    public static final Block GREEN_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.GREEN_WOOL).setId(
            GREEN_WOOL_SLAB_KEY
        )
    );
    public static final Block CYAN_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.CYAN_WOOL).setId(
            CYAN_WOOL_SLAB_KEY
        )
    );
    public static final Block LIGHT_BLUE_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.LIGHT_BLUE_WOOL).setId(
            LIGHT_BLUE_WOOL_SLAB_KEY
        )
    );
    public static final Block BLUE_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.BLUE_WOOL).setId(
            BLUE_WOOL_SLAB_KEY
        )
    );
    public static final Block PURPLE_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.PURPLE_WOOL).setId(
            PURPLE_WOOL_SLAB_KEY
        )
    );
    public static final Block MAGENTA_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.MAGENTA_WOOL).setId(
            MAGENTA_WOOL_SLAB_KEY
        )
    );
    public static final Block PINK_WOOL_SLAB = new SlabBlock(
        BlockBehaviour.Properties.ofFullCopy(Blocks.PINK_WOOL).setId(
            PINK_WOOL_SLAB_KEY
        )
    );

    // ==========================================
    // REGISTRATION
    // ==========================================
    public static void registerModBlocks() {
        // --- TILES ---
        BlockItem whiteAndBlackTileItem = registerBlock(
            WHITE_AND_BLACK_TILE_KEY,
            WHITE_AND_BLACK_TILE,
            WHITE_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem lightGrayAndBlackTileItem = registerBlock(
            LIGHT_GRAY_AND_BLACK_TILE_KEY,
            LIGHT_GRAY_AND_BLACK_TILE,
            LIGHT_GRAY_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem grayAndBlackTileItem = registerBlock(
            GRAY_AND_BLACK_TILE_KEY,
            GRAY_AND_BLACK_TILE,
            GRAY_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem orangeAndBlackTileItem = registerBlock(
            ORANGE_AND_BLACK_TILE_KEY,
            ORANGE_AND_BLACK_TILE,
            ORANGE_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem magentaAndBlackTileItem = registerBlock(
            MAGENTA_AND_BLACK_TILE_KEY,
            MAGENTA_AND_BLACK_TILE,
            MAGENTA_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem lightBlueAndBlackTileItem = registerBlock(
            LIGHT_BLUE_AND_BLACK_TILE_KEY,
            LIGHT_BLUE_AND_BLACK_TILE,
            LIGHT_BLUE_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem yellowAndBlackTileItem = registerBlock(
            YELLOW_AND_BLACK_TILE_KEY,
            YELLOW_AND_BLACK_TILE,
            YELLOW_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem limeAndBlackTileItem = registerBlock(
            LIME_AND_BLACK_TILE_KEY,
            LIME_AND_BLACK_TILE,
            LIME_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem pinkAndBlackTileItem = registerBlock(
            PINK_AND_BLACK_TILE_KEY,
            PINK_AND_BLACK_TILE,
            PINK_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem cyanAndBlackTileItem = registerBlock(
            CYAN_AND_BLACK_TILE_KEY,
            CYAN_AND_BLACK_TILE,
            CYAN_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem purpleAndBlackTileItem = registerBlock(
            PURPLE_AND_BLACK_TILE_KEY,
            PURPLE_AND_BLACK_TILE,
            PURPLE_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem blueAndBlackTileItem = registerBlock(
            BLUE_AND_BLACK_TILE_KEY,
            BLUE_AND_BLACK_TILE,
            BLUE_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem brownAndBlackTileItem = registerBlock(
            BROWN_AND_BLACK_TILE_KEY,
            BROWN_AND_BLACK_TILE,
            BROWN_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem greenAndBlackTileItem = registerBlock(
            GREEN_AND_BLACK_TILE_KEY,
            GREEN_AND_BLACK_TILE,
            GREEN_AND_BLACK_TILE_ITEM_KEY
        );
        BlockItem redAndBlackTileItem = registerBlock(
            RED_AND_BLACK_TILE_KEY,
            RED_AND_BLACK_TILE,
            RED_AND_BLACK_TILE_ITEM_KEY
        );

        // --- CHROMA KEYS ---
        BlockItem blueChromaKeyItem = registerBlock(
            BLUE_CHROMA_KEY_KEY,
            BLUE_CHROMA_KEY,
            BLUE_CHROMA_KEY_ITEM_KEY
        );
        BlockItem greenChromaKeyItem = registerBlock(
            GREEN_CHROMA_KEY_KEY,
            GREEN_CHROMA_KEY,
            GREEN_CHROMA_KEY_ITEM_KEY
        );
        BlockItem redChromaKeyItem = registerBlock(
            RED_CHROMA_KEY_KEY,
            RED_CHROMA_KEY,
            RED_CHROMA_KEY_ITEM_KEY
        );

        // --- TABLES ---
        BlockItem oakPlanksTableItem = registerBlock(
            OAK_PLANKS_TABLE_KEY,
            OAK_PLANKS_TABLE,
            OAK_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem darkOakPlanksTableItem = registerBlock(
            DARK_OAK_PLANKS_TABLE_KEY,
            DARK_OAK_PLANKS_TABLE,
            DARK_OAK_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem sprucePlanksTableItem = registerBlock(
            SPRUCE_PLANKS_TABLE_KEY,
            SPRUCE_PLANKS_TABLE,
            SPRUCE_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem birchPlanksTableItem = registerBlock(
            BIRCH_PLANKS_TABLE_KEY,
            BIRCH_PLANKS_TABLE,
            BIRCH_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem junglePlanksTableItem = registerBlock(
            JUNGLE_PLANKS_TABLE_KEY,
            JUNGLE_PLANKS_TABLE,
            JUNGLE_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem acaciaPlanksTableItem = registerBlock(
            ACACIA_PLANKS_TABLE_KEY,
            ACACIA_PLANKS_TABLE,
            ACACIA_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem mangrovePlanksTableItem = registerBlock(
            MANGROVE_PLANKS_TABLE_KEY,
            MANGROVE_PLANKS_TABLE,
            MANGROVE_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem cherryPlanksTableItem = registerBlock(
            CHERRY_PLANKS_TABLE_KEY,
            CHERRY_PLANKS_TABLE,
            CHERRY_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem bambooPlanksTableItem = registerBlock(
            BAMBOO_PLANKS_TABLE_KEY,
            BAMBOO_PLANKS_TABLE,
            BAMBOO_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem crimsonPlanksTableItem = registerBlock(
            CRIMSON_PLANKS_TABLE_KEY,
            CRIMSON_PLANKS_TABLE,
            CRIMSON_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem warpedPlanksTableItem = registerBlock(
            WARPED_PLANKS_TABLE_KEY,
            WARPED_PLANKS_TABLE,
            WARPED_PLANKS_TABLE_ITEM_KEY
        );
        BlockItem paleOakPlanksTableItem = registerBlock(
            PALE_OAK_PLANKS_TABLE_KEY,
            PALE_OAK_PLANKS_TABLE,
            PALE_OAK_PLANKS_TABLE_ITEM_KEY
        );

        // --- BRICKS ---
        BlockItem whiteBrickItem = registerBlock(
            WHITE_BRICK_KEY,
            WHITE_BRICK,
            WHITE_BRICK_ITEM_KEY
        );
        BlockItem whiteBrickStairsItem = registerBlock(
            WHITE_BRICK_STAIRS_KEY,
            WHITE_BRICK_STAIRS,
            WHITE_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem whiteBrickSlabItem = registerBlock(
            WHITE_BRICK_SLAB_KEY,
            WHITE_BRICK_SLAB,
            WHITE_BRICK_SLAB_ITEM_KEY
        );
        BlockItem whiteBrickWallItem = registerBlock(
            WHITE_BRICK_WALL_KEY,
            WHITE_BRICK_WALL,
            WHITE_BRICK_WALL_ITEM_KEY
        );

        BlockItem lightGrayBrickItem = registerBlock(
            LIGHT_GRAY_BRICK_KEY,
            LIGHT_GRAY_BRICK,
            LIGHT_GRAY_BRICK_ITEM_KEY
        );
        BlockItem lightGrayBrickStairsItem = registerBlock(
            LIGHT_GRAY_BRICK_STAIRS_KEY,
            LIGHT_GRAY_BRICK_STAIRS,
            LIGHT_GRAY_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem lightGrayBrickSlabItem = registerBlock(
            LIGHT_GRAY_BRICK_SLAB_KEY,
            LIGHT_GRAY_BRICK_SLAB,
            LIGHT_GRAY_BRICK_SLAB_ITEM_KEY
        );
        BlockItem lightGrayBrickWallItem = registerBlock(
            LIGHT_GRAY_BRICK_WALL_KEY,
            LIGHT_GRAY_BRICK_WALL,
            LIGHT_GRAY_BRICK_WALL_ITEM_KEY
        );

        BlockItem grayBrickItem = registerBlock(
            GRAY_BRICK_KEY,
            GRAY_BRICK,
            GRAY_BRICK_ITEM_KEY
        );
        BlockItem grayBrickStairsItem = registerBlock(
            GRAY_BRICK_STAIRS_KEY,
            GRAY_BRICK_STAIRS,
            GRAY_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem grayBrickSlabItem = registerBlock(
            GRAY_BRICK_SLAB_KEY,
            GRAY_BRICK_SLAB,
            GRAY_BRICK_SLAB_ITEM_KEY
        );
        BlockItem grayBrickWallItem = registerBlock(
            GRAY_BRICK_WALL_KEY,
            GRAY_BRICK_WALL,
            GRAY_BRICK_WALL_ITEM_KEY
        );

        BlockItem blackBrickItem = registerBlock(
            BLACK_BRICK_KEY,
            BLACK_BRICK,
            BLACK_BRICK_ITEM_KEY
        );
        BlockItem blackBrickStairsItem = registerBlock(
            BLACK_BRICK_STAIRS_KEY,
            BLACK_BRICK_STAIRS,
            BLACK_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem blackBrickSlabItem = registerBlock(
            BLACK_BRICK_SLAB_KEY,
            BLACK_BRICK_SLAB,
            BLACK_BRICK_SLAB_ITEM_KEY
        );
        BlockItem blackBrickWallItem = registerBlock(
            BLACK_BRICK_WALL_KEY,
            BLACK_BRICK_WALL,
            BLACK_BRICK_WALL_ITEM_KEY
        );

        BlockItem orangeBrickItem = registerBlock(
            ORANGE_BRICK_KEY,
            ORANGE_BRICK,
            ORANGE_BRICK_ITEM_KEY
        );
        BlockItem orangeBrickStairsItem = registerBlock(
            ORANGE_BRICK_STAIRS_KEY,
            ORANGE_BRICK_STAIRS,
            ORANGE_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem orangeBrickSlabItem = registerBlock(
            ORANGE_BRICK_SLAB_KEY,
            ORANGE_BRICK_SLAB,
            ORANGE_BRICK_SLAB_ITEM_KEY
        );
        BlockItem orangeBrickWallItem = registerBlock(
            ORANGE_BRICK_WALL_KEY,
            ORANGE_BRICK_WALL,
            ORANGE_BRICK_WALL_ITEM_KEY
        );

        BlockItem brownBrickItem = registerBlock(
            BROWN_BRICK_KEY,
            BROWN_BRICK,
            BROWN_BRICK_ITEM_KEY
        );
        BlockItem brownBrickStairsItem = registerBlock(
            BROWN_BRICK_STAIRS_KEY,
            BROWN_BRICK_STAIRS,
            BROWN_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem brownBrickSlabItem = registerBlock(
            BROWN_BRICK_SLAB_KEY,
            BROWN_BRICK_SLAB,
            BROWN_BRICK_SLAB_ITEM_KEY
        );
        BlockItem brownBrickWallItem = registerBlock(
            BROWN_BRICK_WALL_KEY,
            BROWN_BRICK_WALL,
            BROWN_BRICK_WALL_ITEM_KEY
        );

        BlockItem yellowBrickItem = registerBlock(
            YELLOW_BRICK_KEY,
            YELLOW_BRICK,
            YELLOW_BRICK_ITEM_KEY
        );
        BlockItem yellowBrickStairsItem = registerBlock(
            YELLOW_BRICK_STAIRS_KEY,
            YELLOW_BRICK_STAIRS,
            YELLOW_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem yellowBrickSlabItem = registerBlock(
            YELLOW_BRICK_SLAB_KEY,
            YELLOW_BRICK_SLAB,
            YELLOW_BRICK_SLAB_ITEM_KEY
        );
        BlockItem yellowBrickWallItem = registerBlock(
            YELLOW_BRICK_WALL_KEY,
            YELLOW_BRICK_WALL,
            YELLOW_BRICK_WALL_ITEM_KEY
        );

        BlockItem limeBrickItem = registerBlock(
            LIME_BRICK_KEY,
            LIME_BRICK,
            LIME_BRICK_ITEM_KEY
        );
        BlockItem limeBrickStairsItem = registerBlock(
            LIME_BRICK_STAIRS_KEY,
            LIME_BRICK_STAIRS,
            LIME_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem limeBrickSlabItem = registerBlock(
            LIME_BRICK_SLAB_KEY,
            LIME_BRICK_SLAB,
            LIME_BRICK_SLAB_ITEM_KEY
        );
        BlockItem limeBrickWallItem = registerBlock(
            LIME_BRICK_WALL_KEY,
            LIME_BRICK_WALL,
            LIME_BRICK_WALL_ITEM_KEY
        );

        BlockItem greenBrickItem = registerBlock(
            GREEN_BRICK_KEY,
            GREEN_BRICK,
            GREEN_BRICK_ITEM_KEY
        );
        BlockItem greenBrickStairsItem = registerBlock(
            GREEN_BRICK_STAIRS_KEY,
            GREEN_BRICK_STAIRS,
            GREEN_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem greenBrickSlabItem = registerBlock(
            GREEN_BRICK_SLAB_KEY,
            GREEN_BRICK_SLAB,
            GREEN_BRICK_SLAB_ITEM_KEY
        );
        BlockItem greenBrickWallItem = registerBlock(
            GREEN_BRICK_WALL_KEY,
            GREEN_BRICK_WALL,
            GREEN_BRICK_WALL_ITEM_KEY
        );

        BlockItem cyanBrickItem = registerBlock(
            CYAN_BRICK_KEY,
            CYAN_BRICK,
            CYAN_BRICK_ITEM_KEY
        );
        BlockItem cyanBrickStairsItem = registerBlock(
            CYAN_BRICK_STAIRS_KEY,
            CYAN_BRICK_STAIRS,
            CYAN_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem cyanBrickSlabItem = registerBlock(
            CYAN_BRICK_SLAB_KEY,
            CYAN_BRICK_SLAB,
            CYAN_BRICK_SLAB_ITEM_KEY
        );
        BlockItem cyanBrickWallItem = registerBlock(
            CYAN_BRICK_WALL_KEY,
            CYAN_BRICK_WALL,
            CYAN_BRICK_WALL_ITEM_KEY
        );

        BlockItem lightBlueBrickItem = registerBlock(
            LIGHT_BLUE_BRICK_KEY,
            LIGHT_BLUE_BRICK,
            LIGHT_BLUE_BRICK_ITEM_KEY
        );
        BlockItem lightBlueBrickStairsItem = registerBlock(
            LIGHT_BLUE_BRICK_STAIRS_KEY,
            LIGHT_BLUE_BRICK_STAIRS,
            LIGHT_BLUE_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem lightBlueBrickSlabItem = registerBlock(
            LIGHT_BLUE_BRICK_SLAB_KEY,
            LIGHT_BLUE_BRICK_SLAB,
            LIGHT_BLUE_BRICK_SLAB_ITEM_KEY
        );
        BlockItem lightBlueBrickWallItem = registerBlock(
            LIGHT_BLUE_BRICK_WALL_KEY,
            LIGHT_BLUE_BRICK_WALL,
            LIGHT_BLUE_BRICK_WALL_ITEM_KEY
        );

        BlockItem blueBrickItem = registerBlock(
            BLUE_BRICK_KEY,
            BLUE_BRICK,
            BLUE_BRICK_ITEM_KEY
        );
        BlockItem blueBrickStairsItem = registerBlock(
            BLUE_BRICK_STAIRS_KEY,
            BLUE_BRICK_STAIRS,
            BLUE_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem blueBrickSlabItem = registerBlock(
            BLUE_BRICK_SLAB_KEY,
            BLUE_BRICK_SLAB,
            BLUE_BRICK_SLAB_ITEM_KEY
        );
        BlockItem blueBrickWallItem = registerBlock(
            BLUE_BRICK_WALL_KEY,
            BLUE_BRICK_WALL,
            BLUE_BRICK_WALL_ITEM_KEY
        );

        BlockItem purpleBrickItem = registerBlock(
            PURPLE_BRICK_KEY,
            PURPLE_BRICK,
            PURPLE_BRICK_ITEM_KEY
        );
        BlockItem purpleBrickStairsItem = registerBlock(
            PURPLE_BRICK_STAIRS_KEY,
            PURPLE_BRICK_STAIRS,
            PURPLE_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem purpleBrickSlabItem = registerBlock(
            PURPLE_BRICK_SLAB_KEY,
            PURPLE_BRICK_SLAB,
            PURPLE_BRICK_SLAB_ITEM_KEY
        );
        BlockItem purpleBrickWallItem = registerBlock(
            PURPLE_BRICK_WALL_KEY,
            PURPLE_BRICK_WALL,
            PURPLE_BRICK_WALL_ITEM_KEY
        );

        BlockItem magentaBrickItem = registerBlock(
            MAGENTA_BRICK_KEY,
            MAGENTA_BRICK,
            MAGENTA_BRICK_ITEM_KEY
        );
        BlockItem magentaBrickStairsItem = registerBlock(
            MAGENTA_BRICK_STAIRS_KEY,
            MAGENTA_BRICK_STAIRS,
            MAGENTA_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem magentaBrickSlabItem = registerBlock(
            MAGENTA_BRICK_SLAB_KEY,
            MAGENTA_BRICK_SLAB,
            MAGENTA_BRICK_SLAB_ITEM_KEY
        );
        BlockItem magentaBrickWallItem = registerBlock(
            MAGENTA_BRICK_WALL_KEY,
            MAGENTA_BRICK_WALL,
            MAGENTA_BRICK_WALL_ITEM_KEY
        );

        BlockItem pinkBrickItem = registerBlock(
            PINK_BRICK_KEY,
            PINK_BRICK,
            PINK_BRICK_ITEM_KEY
        );
        BlockItem pinkBrickStairsItem = registerBlock(
            PINK_BRICK_STAIRS_KEY,
            PINK_BRICK_STAIRS,
            PINK_BRICK_STAIRS_ITEM_KEY
        );
        BlockItem pinkBrickSlabItem = registerBlock(
            PINK_BRICK_SLAB_KEY,
            PINK_BRICK_SLAB,
            PINK_BRICK_SLAB_ITEM_KEY
        );
        BlockItem pinkBrickWallItem = registerBlock(
            PINK_BRICK_WALL_KEY,
            PINK_BRICK_WALL,
            PINK_BRICK_WALL_ITEM_KEY
        );
        BlockItem mossyStoneItem = registerBlock(
            MOSSY_STONE_KEY,
            MOSSY_STONE,
            MOSSY_STONE_ITEM_KEY
        );
        BlockItem mossyStoneSlabItem = registerBlock(
            MOSSY_STONE_SLAB_KEY,
            MOSSY_STONE_SLAB,
            MOSSY_STONE_SLAB_ITEM_KEY
        );
        BlockItem mossyStoneStairItem = registerBlock(
            MOSSY_STONE_STAIRS_KEY,
            MOSSY_STONE_STAIRS,
            MOSSY_STONE_STAIRS_ITEM_KEY
        );
        BlockItem mossyStoneWallItem = registerBlock(
            MOSSY_STONE_WALL_KEY,
            MOSSY_STONE_WALL,
            MOSSY_STONE_WALL_ITEM_KEY
        );
        BlockItem andesiteBricksItem = registerBlock(
            ANDESITE_BRICKS_KEY,
            ANDESITE_BRICKS,
            ANDESITE_BRICKS_ITEM_KEY
        );
        BlockItem andesiteBricksSlabItem = registerBlock(
            ANDESITE_BRICKS_SLAB_KEY,
            ANDESITE_BRICKS_SLAB,
            ANDESITE_BRICKS_SLAB_ITEM_KEY
        );
        BlockItem andesiteBricksStairItem = registerBlock(
            ANDESITE_BRICKS_STAIRS_KEY,
            ANDESITE_BRICKS_STAIRS,
            ANDESITE_BRICKS_STAIRS_ITEM_KEY
        );
        BlockItem andesiteBricksWallItem = registerBlock(
            ANDESITE_BRICKS_WALL_KEY,
            ANDESITE_BRICKS_WALL,
            ANDESITE_BRICKS_WALL_ITEM_KEY
        );
        BlockItem polishedAndesiteWallItem = registerBlock(
            POLISHED_ANDESITE_WALL_KEY,
            POLISHED_ANDESITE_WALL,
            POLISHED_ANDESITE_WALL_ITEM_KEY
        );
        BlockItem whiteWoolStairsItem = registerBlock(
            WHITE_WOOL_STAIRS_KEY,
            WHITE_WOOL_STAIRS,
            WHITE_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem lightGrayWoolStairsItem = registerBlock(
            LIGHT_GRAY_WOOL_STAIRS_KEY,
            LIGHT_GRAY_WOOL_STAIRS,
            LIGHT_GRAY_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem grayWoolStairsItem = registerBlock(
            GRAY_WOOL_STAIRS_KEY,
            GRAY_WOOL_STAIRS,
            GRAY_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem blackWoolStairsItem = registerBlock(
            BLACK_WOOL_STAIRS_KEY,
            BLACK_WOOL_STAIRS,
            BLACK_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem redWoolStairsItem = registerBlock(
            RED_WOOL_STAIRS_KEY,
            RED_WOOL_STAIRS,
            RED_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem orangeWoolStairsItem = registerBlock(
            ORANGE_WOOL_STAIRS_KEY,
            ORANGE_WOOL_STAIRS,
            ORANGE_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem brownWoolStairsItem = registerBlock(
            BROWN_WOOL_STAIRS_KEY,
            BROWN_WOOL_STAIRS,
            BROWN_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem yellowWoolStairsItem = registerBlock(
            YELLOW_WOOL_STAIRS_KEY,
            YELLOW_WOOL_STAIRS,
            YELLOW_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem limeWoolStairsItem = registerBlock(
            LIME_WOOL_STAIRS_KEY,
            LIME_WOOL_STAIRS,
            LIME_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem greenWoolStairsItem = registerBlock(
            GREEN_WOOL_STAIRS_KEY,
            GREEN_WOOL_STAIRS,
            GREEN_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem cyanWoolStairsItem = registerBlock(
            CYAN_WOOL_STAIRS_KEY,
            CYAN_WOOL_STAIRS,
            CYAN_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem lightBlueWoolStairsItem = registerBlock(
            LIGHT_BLUE_WOOL_STAIRS_KEY,
            LIGHT_BLUE_WOOL_STAIRS,
            LIGHT_BLUE_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem blueWoolStairsItem = registerBlock(
            BLUE_WOOL_STAIRS_KEY,
            BLUE_WOOL_STAIRS,
            BLUE_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem purpleWoolStairsItem = registerBlock(
            PURPLE_WOOL_STAIRS_KEY,
            PURPLE_WOOL_STAIRS,
            PURPLE_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem magentaWoolStairsItem = registerBlock(
            MAGENTA_WOOL_STAIRS_KEY,
            MAGENTA_WOOL_STAIRS,
            MAGENTA_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem pinkWoolStairsItem = registerBlock(
            PINK_WOOL_STAIRS_KEY,
            PINK_WOOL_STAIRS,
            PINK_WOOL_STAIRS_ITEM_KEY
        );
        BlockItem whiteWoolSlabItem = registerBlock(
            WHITE_WOOL_SLAB_KEY,
            WHITE_WOOL_SLAB,
            WHITE_WOOL_SLAB_ITEM_KEY
        );
        BlockItem lightGrayWoolSlabItem = registerBlock(
            LIGHT_GRAY_WOOL_SLAB_KEY,
            LIGHT_GRAY_WOOL_SLAB,
            LIGHT_GRAY_WOOL_SLAB_ITEM_KEY
        );
        BlockItem grayWoolSlabItem = registerBlock(
            GRAY_WOOL_SLAB_KEY,
            GRAY_WOOL_SLAB,
            GRAY_WOOL_SLAB_ITEM_KEY
        );
        BlockItem blackWoolSlabItem = registerBlock(
            BLACK_WOOL_SLAB_KEY,
            BLACK_WOOL_SLAB,
            BLACK_WOOL_SLAB_ITEM_KEY
        );
        BlockItem redWoolSlabItem = registerBlock(
            RED_WOOL_SLAB_KEY,
            RED_WOOL_SLAB,
            RED_WOOL_SLAB_ITEM_KEY
        );
        BlockItem orangeWoolSlabItem = registerBlock(
            ORANGE_WOOL_SLAB_KEY,
            ORANGE_WOOL_SLAB,
            ORANGE_WOOL_SLAB_ITEM_KEY
        );
        BlockItem brownWoolSlabItem = registerBlock(
            BROWN_WOOL_SLAB_KEY,
            BROWN_WOOL_SLAB,
            BROWN_WOOL_SLAB_ITEM_KEY
        );
        BlockItem yellowWoolSlabItem = registerBlock(
            YELLOW_WOOL_SLAB_KEY,
            YELLOW_WOOL_SLAB,
            YELLOW_WOOL_SLAB_ITEM_KEY
        );
        BlockItem limeWoolSlabItem = registerBlock(
            LIME_WOOL_SLAB_KEY,
            LIME_WOOL_SLAB,
            LIME_WOOL_SLAB_ITEM_KEY
        );
        BlockItem greenWoolSlabItem = registerBlock(
            GREEN_WOOL_SLAB_KEY,
            GREEN_WOOL_SLAB,
            GREEN_WOOL_SLAB_ITEM_KEY
        );
        BlockItem cyanWoolSlabItem = registerBlock(
            CYAN_WOOL_SLAB_KEY,
            CYAN_WOOL_SLAB,
            CYAN_WOOL_SLAB_ITEM_KEY
        );
        BlockItem lightBlueWoolSlabItem = registerBlock(
            LIGHT_BLUE_WOOL_SLAB_KEY,
            LIGHT_BLUE_WOOL_SLAB,
            LIGHT_BLUE_WOOL_SLAB_ITEM_KEY
        );
        BlockItem blueWoolSlabItem = registerBlock(
            BLUE_WOOL_SLAB_KEY,
            BLUE_WOOL_SLAB,
            BLUE_WOOL_SLAB_ITEM_KEY
        );
        BlockItem purpleWoolSlabItem = registerBlock(
            PURPLE_WOOL_SLAB_KEY,
            PURPLE_WOOL_SLAB,
            PURPLE_WOOL_SLAB_ITEM_KEY
        );
        BlockItem magentaWoolSlabItem = registerBlock(
            MAGENTA_WOOL_SLAB_KEY,
            MAGENTA_WOOL_SLAB,
            MAGENTA_WOOL_SLAB_ITEM_KEY
        );
        BlockItem pinkWoolSlabItem = registerBlock(
            PINK_WOOL_SLAB_KEY,
            PINK_WOOL_SLAB,
            PINK_WOOL_SLAB_ITEM_KEY
        );

        // --- CREATIVE TAB ---
        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.COLORED_BLOCKS).register(
            entries -> {
                entries.accept(whiteWoolStairsItem);
                entries.accept(lightGrayWoolStairsItem);
                entries.accept(grayWoolStairsItem);
                entries.accept(blackWoolStairsItem);
                entries.accept(brownWoolStairsItem);
                entries.accept(redWoolStairsItem);
                entries.accept(orangeWoolStairsItem);
                entries.accept(yellowWoolStairsItem);
                entries.accept(limeWoolStairsItem);
                entries.accept(greenWoolStairsItem);
                entries.accept(cyanWoolStairsItem);
                entries.accept(lightBlueWoolStairsItem);
                entries.accept(blueWoolStairsItem);
                entries.accept(purpleWoolStairsItem);
                entries.accept(magentaWoolStairsItem);
                entries.accept(pinkWoolStairsItem);
                entries.accept(whiteWoolSlabItem);
                entries.accept(lightGrayWoolSlabItem);
                entries.accept(grayWoolSlabItem);
                entries.accept(blackWoolSlabItem);
                entries.accept(brownWoolSlabItem);
                entries.accept(redWoolSlabItem);
                entries.accept(orangeWoolSlabItem);
                entries.accept(yellowWoolSlabItem);
                entries.accept(limeWoolSlabItem);
                entries.accept(greenWoolSlabItem);
                entries.accept(cyanWoolSlabItem);
                entries.accept(lightBlueWoolSlabItem);
                entries.accept(blueWoolSlabItem);
                entries.accept(purpleWoolSlabItem);
                entries.accept(magentaWoolSlabItem);
                entries.accept(pinkWoolSlabItem);
            }
        );

        ItemGroupEvents.modifyEntriesEvent(CreativeModeTabs.BUILDING_BLOCKS).register(
            entries -> {
                // Tiles
                entries.accept(whiteAndBlackTileItem);
                entries.accept(lightGrayAndBlackTileItem);
                entries.accept(grayAndBlackTileItem);
                entries.accept(orangeAndBlackTileItem);
                entries.accept(magentaAndBlackTileItem);
                entries.accept(yellowAndBlackTileItem);
                entries.accept(lightBlueAndBlackTileItem);
                entries.accept(blueAndBlackTileItem);
                entries.accept(limeAndBlackTileItem);
                entries.accept(pinkAndBlackTileItem);
                entries.accept(cyanAndBlackTileItem);
                entries.accept(purpleAndBlackTileItem);
                entries.accept(brownAndBlackTileItem);
                entries.accept(greenAndBlackTileItem);
                entries.accept(redAndBlackTileItem);
                // Chroma Keys
                entries.accept(blueChromaKeyItem);
                entries.accept(greenChromaKeyItem);
                entries.accept(redChromaKeyItem);
                // Tables
                entries.accept(oakPlanksTableItem);
                entries.accept(darkOakPlanksTableItem);
                entries.accept(sprucePlanksTableItem);
                entries.accept(birchPlanksTableItem);
                entries.accept(junglePlanksTableItem);
                entries.accept(acaciaPlanksTableItem);
                entries.accept(mangrovePlanksTableItem);
                entries.accept(cherryPlanksTableItem);
                entries.accept(bambooPlanksTableItem);
                entries.accept(crimsonPlanksTableItem);
                entries.accept(warpedPlanksTableItem);
                entries.accept(paleOakPlanksTableItem);
                // Bricks
                entries.accept(whiteBrickItem);
                entries.accept(whiteBrickStairsItem);
                entries.accept(whiteBrickSlabItem);
                entries.accept(whiteBrickWallItem);
                entries.accept(lightGrayBrickItem);
                entries.accept(lightGrayBrickStairsItem);
                entries.accept(lightGrayBrickSlabItem);
                entries.accept(lightGrayBrickWallItem);
                entries.accept(grayBrickItem);
                entries.accept(grayBrickStairsItem);
                entries.accept(grayBrickSlabItem);
                entries.accept(grayBrickWallItem);
                entries.accept(blackBrickItem);
                entries.accept(blackBrickStairsItem);
                entries.accept(blackBrickSlabItem);
                entries.accept(blackBrickWallItem);
                entries.accept(orangeBrickItem);
                entries.accept(orangeBrickStairsItem);
                entries.accept(orangeBrickSlabItem);
                entries.accept(orangeBrickWallItem);
                entries.accept(brownBrickItem);
                entries.accept(brownBrickStairsItem);
                entries.accept(brownBrickSlabItem);
                entries.accept(brownBrickWallItem);
                entries.accept(yellowBrickItem);
                entries.accept(yellowBrickStairsItem);
                entries.accept(yellowBrickSlabItem);
                entries.accept(yellowBrickWallItem);
                entries.accept(limeBrickItem);
                entries.accept(limeBrickStairsItem);
                entries.accept(limeBrickSlabItem);
                entries.accept(limeBrickWallItem);
                entries.accept(greenBrickItem);
                entries.accept(greenBrickStairsItem);
                entries.accept(greenBrickSlabItem);
                entries.accept(greenBrickWallItem);
                entries.accept(cyanBrickItem);
                entries.accept(cyanBrickStairsItem);
                entries.accept(cyanBrickSlabItem);
                entries.accept(cyanBrickWallItem);
                entries.accept(lightBlueBrickItem);
                entries.accept(lightBlueBrickStairsItem);
                entries.accept(lightBlueBrickSlabItem);
                entries.accept(lightBlueBrickWallItem);
                entries.accept(blueBrickItem);
                entries.accept(blueBrickStairsItem);
                entries.accept(blueBrickSlabItem);
                entries.accept(blueBrickWallItem);
                entries.accept(purpleBrickItem);
                entries.accept(purpleBrickStairsItem);
                entries.accept(purpleBrickSlabItem);
                entries.accept(purpleBrickWallItem);
                entries.accept(magentaBrickItem);
                entries.accept(magentaBrickStairsItem);
                entries.accept(magentaBrickSlabItem);
                entries.accept(magentaBrickWallItem);
                entries.accept(pinkBrickItem);
                entries.accept(pinkBrickStairsItem);
                entries.accept(pinkBrickSlabItem);
                entries.accept(pinkBrickWallItem);
                //Mossy Stones
                entries.accept(mossyStoneItem);
                entries.accept(mossyStoneSlabItem);
                entries.accept(mossyStoneStairItem);
                entries.accept(mossyStoneWallItem);
                //New Bricks
                entries.accept(andesiteBricksItem);
                entries.accept(andesiteBricksSlabItem);
                entries.accept(andesiteBricksStairItem);
                entries.accept(andesiteBricksWallItem);
                entries.accept(polishedAndesiteWallItem);
            }
        );
    }
}
