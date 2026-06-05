package dev.edonme.blokkusus;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.block.SlabBlock;
import net.minecraft.block.StairsBlock;
import net.minecraft.block.WallBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class ModBlocks {

    // ==========================================
    // HELPER: cria Identifier com o MOD_ID
    // ==========================================
    private static Identifier id(String path) {
        return Identifier.of(Blokkusus.MOD_ID, path);
    }

    private static RegistryKey<Block> blockKey(String path) {
        return RegistryKey.of(RegistryKeys.BLOCK, id(path));
    }

    private static RegistryKey<Item> itemKey(String path) {
        return RegistryKey.of(RegistryKeys.ITEM, id(path));
    }

    // ==========================================
    // TILES - IDs / KEYS
    // ==========================================
    public static final RegistryKey<Block> WHITE_AND_BLACK_TILE_KEY = blockKey(
        "white_and_black_tile"
    );
    public static final RegistryKey<Item> WHITE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("white_and_black_tile");
    public static final RegistryKey<Block> LIGHT_GRAY_AND_BLACK_TILE_KEY =
        blockKey("light_gray_and_black_tile");
    public static final RegistryKey<Item> LIGHT_GRAY_AND_BLACK_TILE_ITEM_KEY =
        itemKey("light_gray_and_black_tile");
    public static final RegistryKey<Block> GRAY_AND_BLACK_TILE_KEY = blockKey(
        "gray_and_black_tile"
    );
    public static final RegistryKey<Item> GRAY_AND_BLACK_TILE_ITEM_KEY =
        itemKey("gray_and_black_tile");
    public static final RegistryKey<Block> ORANGE_AND_BLACK_TILE_KEY = blockKey(
        "orange_and_black_tile"
    );
    public static final RegistryKey<Item> ORANGE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("orange_and_black_tile");
    public static final RegistryKey<Block> MAGENTA_AND_BLACK_TILE_KEY =
        blockKey("magenta_and_black_tile");
    public static final RegistryKey<Item> MAGENTA_AND_BLACK_TILE_ITEM_KEY =
        itemKey("magenta_and_black_tile");
    public static final RegistryKey<Block> LIGHT_BLUE_AND_BLACK_TILE_KEY =
        blockKey("light_blue_and_black_tile");
    public static final RegistryKey<Item> LIGHT_BLUE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("light_blue_and_black_tile");
    public static final RegistryKey<Block> YELLOW_AND_BLACK_TILE_KEY = blockKey(
        "yellow_and_black_tile"
    );
    public static final RegistryKey<Item> YELLOW_AND_BLACK_TILE_ITEM_KEY =
        itemKey("yellow_and_black_tile");
    public static final RegistryKey<Block> LIME_AND_BLACK_TILE_KEY = blockKey(
        "lime_and_black_tile"
    );
    public static final RegistryKey<Item> LIME_AND_BLACK_TILE_ITEM_KEY =
        itemKey("lime_and_black_tile");
    public static final RegistryKey<Block> PINK_AND_BLACK_TILE_KEY = blockKey(
        "pink_and_black_tile"
    );
    public static final RegistryKey<Item> PINK_AND_BLACK_TILE_ITEM_KEY =
        itemKey("pink_and_black_tile");
    public static final RegistryKey<Block> CYAN_AND_BLACK_TILE_KEY = blockKey(
        "cyan_and_black_tile"
    );
    public static final RegistryKey<Item> CYAN_AND_BLACK_TILE_ITEM_KEY =
        itemKey("cyan_and_black_tile");
    public static final RegistryKey<Block> PURPLE_AND_BLACK_TILE_KEY = blockKey(
        "purple_and_black_tile"
    );
    public static final RegistryKey<Item> PURPLE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("purple_and_black_tile");
    public static final RegistryKey<Block> BLUE_AND_BLACK_TILE_KEY = blockKey(
        "blue_and_black_tile"
    );
    public static final RegistryKey<Item> BLUE_AND_BLACK_TILE_ITEM_KEY =
        itemKey("blue_and_black_tile");
    public static final RegistryKey<Block> BROWN_AND_BLACK_TILE_KEY = blockKey(
        "brown_and_black_tile"
    );
    public static final RegistryKey<Item> BROWN_AND_BLACK_TILE_ITEM_KEY =
        itemKey("brown_and_black_tile");
    public static final RegistryKey<Block> GREEN_AND_BLACK_TILE_KEY = blockKey(
        "green_and_black_tile"
    );
    public static final RegistryKey<Item> GREEN_AND_BLACK_TILE_ITEM_KEY =
        itemKey("green_and_black_tile");
    public static final RegistryKey<Block> RED_AND_BLACK_TILE_KEY = blockKey(
        "red_and_black_tile"
    );
    public static final RegistryKey<Item> RED_AND_BLACK_TILE_ITEM_KEY = itemKey(
        "red_and_black_tile"
    );

    // ==========================================
    // CHROMA KEYS - IDs / KEYS
    // ==========================================
    public static final RegistryKey<Block> BLUE_CHROMA_KEY_KEY = blockKey(
        "blue_chroma_key"
    );
    public static final RegistryKey<Item> BLUE_CHROMA_KEY_ITEM_KEY = itemKey(
        "blue_chroma_key"
    );
    public static final RegistryKey<Block> GREEN_CHROMA_KEY_KEY = blockKey(
        "green_chroma_key"
    );
    public static final RegistryKey<Item> GREEN_CHROMA_KEY_ITEM_KEY = itemKey(
        "green_chroma_key"
    );
    public static final RegistryKey<Block> RED_CHROMA_KEY_KEY = blockKey(
        "red_chroma_key"
    );
    public static final RegistryKey<Item> RED_CHROMA_KEY_ITEM_KEY = itemKey(
        "red_chroma_key"
    );

    // ==========================================
    // TABLES - IDs / KEYS
    // ==========================================
    public static final RegistryKey<Block> OAK_PLANKS_TABLE_KEY = blockKey(
        "oak_planks_table"
    );
    public static final RegistryKey<Item> OAK_PLANKS_TABLE_ITEM_KEY = itemKey(
        "oak_planks_table"
    );
    public static final RegistryKey<Block> DARK_OAK_PLANKS_TABLE_KEY = blockKey(
        "dark_oak_planks_table"
    );
    public static final RegistryKey<Item> DARK_OAK_PLANKS_TABLE_ITEM_KEY =
        itemKey("dark_oak_planks_table");
    public static final RegistryKey<Block> SPRUCE_PLANKS_TABLE_KEY = blockKey(
        "spruce_planks_table"
    );
    public static final RegistryKey<Item> SPRUCE_PLANKS_TABLE_ITEM_KEY =
        itemKey("spruce_planks_table");
    public static final RegistryKey<Block> BIRCH_PLANKS_TABLE_KEY = blockKey(
        "birch_planks_table"
    );
    public static final RegistryKey<Item> BIRCH_PLANKS_TABLE_ITEM_KEY = itemKey(
        "birch_planks_table"
    );
    public static final RegistryKey<Block> JUNGLE_PLANKS_TABLE_KEY = blockKey(
        "jungle_planks_table"
    );
    public static final RegistryKey<Item> JUNGLE_PLANKS_TABLE_ITEM_KEY =
        itemKey("jungle_planks_table");
    public static final RegistryKey<Block> ACACIA_PLANKS_TABLE_KEY = blockKey(
        "acacia_planks_table"
    );
    public static final RegistryKey<Item> ACACIA_PLANKS_TABLE_ITEM_KEY =
        itemKey("acacia_planks_table");
    public static final RegistryKey<Block> MANGROVE_PLANKS_TABLE_KEY = blockKey(
        "mangrove_planks_table"
    );
    public static final RegistryKey<Item> MANGROVE_PLANKS_TABLE_ITEM_KEY =
        itemKey("mangrove_planks_table");
    public static final RegistryKey<Block> CHERRY_PLANKS_TABLE_KEY = blockKey(
        "cherry_planks_table"
    );
    public static final RegistryKey<Item> CHERRY_PLANKS_TABLE_ITEM_KEY =
        itemKey("cherry_planks_table");
    public static final RegistryKey<Block> BAMBOO_PLANKS_TABLE_KEY = blockKey(
        "bamboo_planks_table"
    );
    public static final RegistryKey<Item> BAMBOO_PLANKS_TABLE_ITEM_KEY =
        itemKey("bamboo_planks_table");
    public static final RegistryKey<Block> CRIMSON_PLANKS_TABLE_KEY = blockKey(
        "crimson_planks_table"
    );
    public static final RegistryKey<Item> CRIMSON_PLANKS_TABLE_ITEM_KEY =
        itemKey("crimson_planks_table");
    public static final RegistryKey<Block> WARPED_PLANKS_TABLE_KEY = blockKey(
        "warped_planks_table"
    );
    public static final RegistryKey<Item> WARPED_PLANKS_TABLE_ITEM_KEY =
        itemKey("warped_planks_table");
    public static final RegistryKey<Block> PALE_OAK_PLANKS_TABLE_KEY = blockKey(
        "pale_oak_planks_table"
    );
    public static final RegistryKey<Item> PALE_OAK_PLANKS_TABLE_ITEM_KEY =
        itemKey("pale_oak_planks_table");

    // ==========================================
    // BRICKS - IDs / KEYS  (base + stairs + slab + wall)
    // ==========================================

    // WHITE
    public static final RegistryKey<Block> WHITE_BRICK_KEY = blockKey(
        "white_brick"
    );
    public static final RegistryKey<Item> WHITE_BRICK_ITEM_KEY = itemKey(
        "white_brick"
    );
    public static final RegistryKey<Block> WHITE_BRICK_STAIRS_KEY = blockKey(
        "white_brick_stairs"
    );
    public static final RegistryKey<Item> WHITE_BRICK_STAIRS_ITEM_KEY = itemKey(
        "white_brick_stairs"
    );
    public static final RegistryKey<Block> WHITE_BRICK_SLAB_KEY = blockKey(
        "white_brick_slab"
    );
    public static final RegistryKey<Item> WHITE_BRICK_SLAB_ITEM_KEY = itemKey(
        "white_brick_slab"
    );
    public static final RegistryKey<Block> WHITE_BRICK_WALL_KEY = blockKey(
        "white_brick_wall"
    );
    public static final RegistryKey<Item> WHITE_BRICK_WALL_ITEM_KEY = itemKey(
        "white_brick_wall"
    );

    // LIGHT_GRAY
    public static final RegistryKey<Block> LIGHT_GRAY_BRICK_KEY = blockKey(
        "light_gray_brick"
    );
    public static final RegistryKey<Item> LIGHT_GRAY_BRICK_ITEM_KEY = itemKey(
        "light_gray_brick"
    );
    public static final RegistryKey<Block> LIGHT_GRAY_BRICK_STAIRS_KEY =
        blockKey("light_gray_brick_stairs");
    public static final RegistryKey<Item> LIGHT_GRAY_BRICK_STAIRS_ITEM_KEY =
        itemKey("light_gray_brick_stairs");
    public static final RegistryKey<Block> LIGHT_GRAY_BRICK_SLAB_KEY = blockKey(
        "light_gray_brick_slab"
    );
    public static final RegistryKey<Item> LIGHT_GRAY_BRICK_SLAB_ITEM_KEY =
        itemKey("light_gray_brick_slab");
    public static final RegistryKey<Block> LIGHT_GRAY_BRICK_WALL_KEY = blockKey(
        "light_gray_brick_wall"
    );
    public static final RegistryKey<Item> LIGHT_GRAY_BRICK_WALL_ITEM_KEY =
        itemKey("light_gray_brick_wall");

    // GRAY
    public static final RegistryKey<Block> GRAY_BRICK_KEY = blockKey(
        "gray_brick"
    );
    public static final RegistryKey<Item> GRAY_BRICK_ITEM_KEY = itemKey(
        "gray_brick"
    );
    public static final RegistryKey<Block> GRAY_BRICK_STAIRS_KEY = blockKey(
        "gray_brick_stairs"
    );
    public static final RegistryKey<Item> GRAY_BRICK_STAIRS_ITEM_KEY = itemKey(
        "gray_brick_stairs"
    );
    public static final RegistryKey<Block> GRAY_BRICK_SLAB_KEY = blockKey(
        "gray_brick_slab"
    );
    public static final RegistryKey<Item> GRAY_BRICK_SLAB_ITEM_KEY = itemKey(
        "gray_brick_slab"
    );
    public static final RegistryKey<Block> GRAY_BRICK_WALL_KEY = blockKey(
        "gray_brick_wall"
    );
    public static final RegistryKey<Item> GRAY_BRICK_WALL_ITEM_KEY = itemKey(
        "gray_brick_wall"
    );

    // BLACK
    public static final RegistryKey<Block> BLACK_BRICK_KEY = blockKey(
        "black_brick"
    );
    public static final RegistryKey<Item> BLACK_BRICK_ITEM_KEY = itemKey(
        "black_brick"
    );
    public static final RegistryKey<Block> BLACK_BRICK_STAIRS_KEY = blockKey(
        "black_brick_stairs"
    );
    public static final RegistryKey<Item> BLACK_BRICK_STAIRS_ITEM_KEY = itemKey(
        "black_brick_stairs"
    );
    public static final RegistryKey<Block> BLACK_BRICK_SLAB_KEY = blockKey(
        "black_brick_slab"
    );
    public static final RegistryKey<Item> BLACK_BRICK_SLAB_ITEM_KEY = itemKey(
        "black_brick_slab"
    );
    public static final RegistryKey<Block> BLACK_BRICK_WALL_KEY = blockKey(
        "black_brick_wall"
    );
    public static final RegistryKey<Item> BLACK_BRICK_WALL_ITEM_KEY = itemKey(
        "black_brick_wall"
    );

    // ORANGE
    public static final RegistryKey<Block> ORANGE_BRICK_KEY = blockKey(
        "orange_brick"
    );
    public static final RegistryKey<Item> ORANGE_BRICK_ITEM_KEY = itemKey(
        "orange_brick"
    );
    public static final RegistryKey<Block> ORANGE_BRICK_STAIRS_KEY = blockKey(
        "orange_brick_stairs"
    );
    public static final RegistryKey<Item> ORANGE_BRICK_STAIRS_ITEM_KEY =
        itemKey("orange_brick_stairs");
    public static final RegistryKey<Block> ORANGE_BRICK_SLAB_KEY = blockKey(
        "orange_brick_slab"
    );
    public static final RegistryKey<Item> ORANGE_BRICK_SLAB_ITEM_KEY = itemKey(
        "orange_brick_slab"
    );
    public static final RegistryKey<Block> ORANGE_BRICK_WALL_KEY = blockKey(
        "orange_brick_wall"
    );
    public static final RegistryKey<Item> ORANGE_BRICK_WALL_ITEM_KEY = itemKey(
        "orange_brick_wall"
    );

    // BROWN
    public static final RegistryKey<Block> BROWN_BRICK_KEY = blockKey(
        "brown_brick"
    );
    public static final RegistryKey<Item> BROWN_BRICK_ITEM_KEY = itemKey(
        "brown_brick"
    );
    public static final RegistryKey<Block> BROWN_BRICK_STAIRS_KEY = blockKey(
        "brown_brick_stairs"
    );
    public static final RegistryKey<Item> BROWN_BRICK_STAIRS_ITEM_KEY = itemKey(
        "brown_brick_stairs"
    );
    public static final RegistryKey<Block> BROWN_BRICK_SLAB_KEY = blockKey(
        "brown_brick_slab"
    );
    public static final RegistryKey<Item> BROWN_BRICK_SLAB_ITEM_KEY = itemKey(
        "brown_brick_slab"
    );
    public static final RegistryKey<Block> BROWN_BRICK_WALL_KEY = blockKey(
        "brown_brick_wall"
    );
    public static final RegistryKey<Item> BROWN_BRICK_WALL_ITEM_KEY = itemKey(
        "brown_brick_wall"
    );

    // YELLOW
    public static final RegistryKey<Block> YELLOW_BRICK_KEY = blockKey(
        "yellow_brick"
    );
    public static final RegistryKey<Item> YELLOW_BRICK_ITEM_KEY = itemKey(
        "yellow_brick"
    );
    public static final RegistryKey<Block> YELLOW_BRICK_STAIRS_KEY = blockKey(
        "yellow_brick_stairs"
    );
    public static final RegistryKey<Item> YELLOW_BRICK_STAIRS_ITEM_KEY =
        itemKey("yellow_brick_stairs");
    public static final RegistryKey<Block> YELLOW_BRICK_SLAB_KEY = blockKey(
        "yellow_brick_slab"
    );
    public static final RegistryKey<Item> YELLOW_BRICK_SLAB_ITEM_KEY = itemKey(
        "yellow_brick_slab"
    );
    public static final RegistryKey<Block> YELLOW_BRICK_WALL_KEY = blockKey(
        "yellow_brick_wall"
    );
    public static final RegistryKey<Item> YELLOW_BRICK_WALL_ITEM_KEY = itemKey(
        "yellow_brick_wall"
    );

    // LIME
    public static final RegistryKey<Block> LIME_BRICK_KEY = blockKey(
        "lime_brick"
    );
    public static final RegistryKey<Item> LIME_BRICK_ITEM_KEY = itemKey(
        "lime_brick"
    );
    public static final RegistryKey<Block> LIME_BRICK_STAIRS_KEY = blockKey(
        "lime_brick_stairs"
    );
    public static final RegistryKey<Item> LIME_BRICK_STAIRS_ITEM_KEY = itemKey(
        "lime_brick_stairs"
    );
    public static final RegistryKey<Block> LIME_BRICK_SLAB_KEY = blockKey(
        "lime_brick_slab"
    );
    public static final RegistryKey<Item> LIME_BRICK_SLAB_ITEM_KEY = itemKey(
        "lime_brick_slab"
    );
    public static final RegistryKey<Block> LIME_BRICK_WALL_KEY = blockKey(
        "lime_brick_wall"
    );
    public static final RegistryKey<Item> LIME_BRICK_WALL_ITEM_KEY = itemKey(
        "lime_brick_wall"
    );

    // GREEN
    public static final RegistryKey<Block> GREEN_BRICK_KEY = blockKey(
        "green_brick"
    );
    public static final RegistryKey<Item> GREEN_BRICK_ITEM_KEY = itemKey(
        "green_brick"
    );
    public static final RegistryKey<Block> GREEN_BRICK_STAIRS_KEY = blockKey(
        "green_brick_stairs"
    );
    public static final RegistryKey<Item> GREEN_BRICK_STAIRS_ITEM_KEY = itemKey(
        "green_brick_stairs"
    );
    public static final RegistryKey<Block> GREEN_BRICK_SLAB_KEY = blockKey(
        "green_brick_slab"
    );
    public static final RegistryKey<Item> GREEN_BRICK_SLAB_ITEM_KEY = itemKey(
        "green_brick_slab"
    );
    public static final RegistryKey<Block> GREEN_BRICK_WALL_KEY = blockKey(
        "green_brick_wall"
    );
    public static final RegistryKey<Item> GREEN_BRICK_WALL_ITEM_KEY = itemKey(
        "green_brick_wall"
    );

    // CYAN
    public static final RegistryKey<Block> CYAN_BRICK_KEY = blockKey(
        "cyan_brick"
    );
    public static final RegistryKey<Item> CYAN_BRICK_ITEM_KEY = itemKey(
        "cyan_brick"
    );
    public static final RegistryKey<Block> CYAN_BRICK_STAIRS_KEY = blockKey(
        "cyan_brick_stairs"
    );
    public static final RegistryKey<Item> CYAN_BRICK_STAIRS_ITEM_KEY = itemKey(
        "cyan_brick_stairs"
    );
    public static final RegistryKey<Block> CYAN_BRICK_SLAB_KEY = blockKey(
        "cyan_brick_slab"
    );
    public static final RegistryKey<Item> CYAN_BRICK_SLAB_ITEM_KEY = itemKey(
        "cyan_brick_slab"
    );
    public static final RegistryKey<Block> CYAN_BRICK_WALL_KEY = blockKey(
        "cyan_brick_wall"
    );
    public static final RegistryKey<Item> CYAN_BRICK_WALL_ITEM_KEY = itemKey(
        "cyan_brick_wall"
    );

    // LIGHT_BLUE
    public static final RegistryKey<Block> LIGHT_BLUE_BRICK_KEY = blockKey(
        "light_blue_brick"
    );
    public static final RegistryKey<Item> LIGHT_BLUE_BRICK_ITEM_KEY = itemKey(
        "light_blue_brick"
    );
    public static final RegistryKey<Block> LIGHT_BLUE_BRICK_STAIRS_KEY =
        blockKey("light_blue_brick_stairs");
    public static final RegistryKey<Item> LIGHT_BLUE_BRICK_STAIRS_ITEM_KEY =
        itemKey("light_blue_brick_stairs");
    public static final RegistryKey<Block> LIGHT_BLUE_BRICK_SLAB_KEY = blockKey(
        "light_blue_brick_slab"
    );
    public static final RegistryKey<Item> LIGHT_BLUE_BRICK_SLAB_ITEM_KEY =
        itemKey("light_blue_brick_slab");
    public static final RegistryKey<Block> LIGHT_BLUE_BRICK_WALL_KEY = blockKey(
        "light_blue_brick_wall"
    );
    public static final RegistryKey<Item> LIGHT_BLUE_BRICK_WALL_ITEM_KEY =
        itemKey("light_blue_brick_wall");

    // BLUE
    public static final RegistryKey<Block> BLUE_BRICK_KEY = blockKey(
        "blue_brick"
    );
    public static final RegistryKey<Item> BLUE_BRICK_ITEM_KEY = itemKey(
        "blue_brick"
    );
    public static final RegistryKey<Block> BLUE_BRICK_STAIRS_KEY = blockKey(
        "blue_brick_stairs"
    );
    public static final RegistryKey<Item> BLUE_BRICK_STAIRS_ITEM_KEY = itemKey(
        "blue_brick_stairs"
    );
    public static final RegistryKey<Block> BLUE_BRICK_SLAB_KEY = blockKey(
        "blue_brick_slab"
    );
    public static final RegistryKey<Item> BLUE_BRICK_SLAB_ITEM_KEY = itemKey(
        "blue_brick_slab"
    );
    public static final RegistryKey<Block> BLUE_BRICK_WALL_KEY = blockKey(
        "blue_brick_wall"
    );
    public static final RegistryKey<Item> BLUE_BRICK_WALL_ITEM_KEY = itemKey(
        "blue_brick_wall"
    );

    // PURPLE
    public static final RegistryKey<Block> PURPLE_BRICK_KEY = blockKey(
        "purple_brick"
    );
    public static final RegistryKey<Item> PURPLE_BRICK_ITEM_KEY = itemKey(
        "purple_brick"
    );
    public static final RegistryKey<Block> PURPLE_BRICK_STAIRS_KEY = blockKey(
        "purple_brick_stairs"
    );
    public static final RegistryKey<Item> PURPLE_BRICK_STAIRS_ITEM_KEY =
        itemKey("purple_brick_stairs");
    public static final RegistryKey<Block> PURPLE_BRICK_SLAB_KEY = blockKey(
        "purple_brick_slab"
    );
    public static final RegistryKey<Item> PURPLE_BRICK_SLAB_ITEM_KEY = itemKey(
        "purple_brick_slab"
    );
    public static final RegistryKey<Block> PURPLE_BRICK_WALL_KEY = blockKey(
        "purple_brick_wall"
    );
    public static final RegistryKey<Item> PURPLE_BRICK_WALL_ITEM_KEY = itemKey(
        "purple_brick_wall"
    );

    // MAGENTA
    public static final RegistryKey<Block> MAGENTA_BRICK_KEY = blockKey(
        "magenta_brick"
    );
    public static final RegistryKey<Item> MAGENTA_BRICK_ITEM_KEY = itemKey(
        "magenta_brick"
    );
    public static final RegistryKey<Block> MAGENTA_BRICK_STAIRS_KEY = blockKey(
        "magenta_brick_stairs"
    );
    public static final RegistryKey<Item> MAGENTA_BRICK_STAIRS_ITEM_KEY =
        itemKey("magenta_brick_stairs");
    public static final RegistryKey<Block> MAGENTA_BRICK_SLAB_KEY = blockKey(
        "magenta_brick_slab"
    );
    public static final RegistryKey<Item> MAGENTA_BRICK_SLAB_ITEM_KEY = itemKey(
        "magenta_brick_slab"
    );
    public static final RegistryKey<Block> MAGENTA_BRICK_WALL_KEY = blockKey(
        "magenta_brick_wall"
    );
    public static final RegistryKey<Item> MAGENTA_BRICK_WALL_ITEM_KEY = itemKey(
        "magenta_brick_wall"
    );

    // PINK
    public static final RegistryKey<Block> PINK_BRICK_KEY = blockKey(
        "pink_brick"
    );
    public static final RegistryKey<Item> PINK_BRICK_ITEM_KEY = itemKey(
        "pink_brick"
    );
    public static final RegistryKey<Block> PINK_BRICK_STAIRS_KEY = blockKey(
        "pink_brick_stairs"
    );
    public static final RegistryKey<Item> PINK_BRICK_STAIRS_ITEM_KEY = itemKey(
        "pink_brick_stairs"
    );
    public static final RegistryKey<Block> PINK_BRICK_SLAB_KEY = blockKey(
        "pink_brick_slab"
    );
    public static final RegistryKey<Item> PINK_BRICK_SLAB_ITEM_KEY = itemKey(
        "pink_brick_slab"
    );
    public static final RegistryKey<Block> PINK_BRICK_WALL_KEY = blockKey(
        "pink_brick_wall"
    );
    public static final RegistryKey<Item> PINK_BRICK_WALL_ITEM_KEY = itemKey(
        "pink_brick_wall"
    );

    // ==========================================
    // TILE BLOCK INSTANCES
    // ==========================================
    public static final Block WHITE_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(4.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .registryKey(WHITE_AND_BLACK_TILE_KEY)
    );
    public static final Block LIGHT_GRAY_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(4.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .registryKey(LIGHT_GRAY_AND_BLACK_TILE_KEY)
    );
    public static final Block GRAY_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(4.0f)
            .requiresTool()
            .sounds(BlockSoundGroup.STONE)
            .registryKey(GRAY_AND_BLACK_TILE_KEY)
    );
    public static final Block ORANGE_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(ORANGE_AND_BLACK_TILE_KEY)
    );
    public static final Block MAGENTA_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(MAGENTA_AND_BLACK_TILE_KEY)
    );
    public static final Block LIGHT_BLUE_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(LIGHT_BLUE_AND_BLACK_TILE_KEY)
    );
    public static final Block YELLOW_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(YELLOW_AND_BLACK_TILE_KEY)
    );
    public static final Block LIME_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(LIME_AND_BLACK_TILE_KEY)
    );
    public static final Block PINK_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(PINK_AND_BLACK_TILE_KEY)
    );
    public static final Block CYAN_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(CYAN_AND_BLACK_TILE_KEY)
    );
    public static final Block PURPLE_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(PURPLE_AND_BLACK_TILE_KEY)
    );
    public static final Block BLUE_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(BLUE_AND_BLACK_TILE_KEY)
    );
    public static final Block BROWN_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(BROWN_AND_BLACK_TILE_KEY)
    );
    public static final Block GREEN_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(GREEN_AND_BLACK_TILE_KEY)
    );
    public static final Block RED_AND_BLACK_TILE = new Block(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .registryKey(RED_AND_BLACK_TILE_KEY)
    );

    // ==========================================
    // CHROMA KEY BLOCK INSTANCES
    // ==========================================
    public static final Block BLUE_CHROMA_KEY = new RedstoneLampBlock(
        AbstractBlock.Settings.create()
            .nonOpaque()
            .strength(2.0f)
            .requiresTool()
            .luminance(state -> 15)
            .registryKey(BLUE_CHROMA_KEY_KEY)
    );
    public static final Block GREEN_CHROMA_KEY = new RedstoneLampBlock(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .luminance(state -> 15)
            .registryKey(GREEN_CHROMA_KEY_KEY)
    );
    public static final Block RED_CHROMA_KEY = new RedstoneLampBlock(
        AbstractBlock.Settings.create()
            .strength(2.0f)
            .requiresTool()
            .luminance(state -> 15)
            .registryKey(RED_CHROMA_KEY_KEY)
    );

    // ==========================================
    // TABLE BLOCK INSTANCES
    // ==========================================
    public static final Block OAK_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(OAK_PLANKS_TABLE_KEY)
    );
    public static final Block DARK_OAK_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(DARK_OAK_PLANKS_TABLE_KEY)
    );
    public static final Block SPRUCE_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(SPRUCE_PLANKS_TABLE_KEY)
    );
    public static final Block BIRCH_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(BIRCH_PLANKS_TABLE_KEY)
    );
    public static final Block JUNGLE_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(JUNGLE_PLANKS_TABLE_KEY)
    );
    public static final Block ACACIA_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(ACACIA_PLANKS_TABLE_KEY)
    );
    public static final Block MANGROVE_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(MANGROVE_PLANKS_TABLE_KEY)
    );
    public static final Block CHERRY_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(CHERRY_PLANKS_TABLE_KEY)
    );
    public static final Block BAMBOO_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(BAMBOO_PLANKS_TABLE_KEY)
    );
    public static final Block CRIMSON_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(CRIMSON_PLANKS_TABLE_KEY)
    );
    public static final Block WARPED_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(WARPED_PLANKS_TABLE_KEY)
    );
    public static final Block PALE_OAK_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .nonOpaque()
            .sounds(BlockSoundGroup.WOOD)
            .registryKey(PALE_OAK_PLANKS_TABLE_KEY)
    );

    // ==========================================
    // BRICK BLOCK INSTANCES  (base + stairs + slab + wall)
    // ==========================================
    private static AbstractBlock.Settings brickSettings(
        RegistryKey<Block> key
    ) {
        return AbstractBlock.Settings.create()
            .strength(2.0f, 6.0f)
            .sounds(BlockSoundGroup.STONE)
            .registryKey(key);
    }

    // WHITE
    public static final Block WHITE_BRICK = new Block(
        brickSettings(WHITE_BRICK_KEY)
    );
    public static final Block WHITE_BRICK_STAIRS = new StairsBlock(
        WHITE_BRICK.getDefaultState(),
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
    public static final Block LIGHT_GRAY_BRICK_STAIRS = new StairsBlock(
        LIGHT_GRAY_BRICK.getDefaultState(),
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
    public static final Block GRAY_BRICK_STAIRS = new StairsBlock(
        GRAY_BRICK.getDefaultState(),
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
    public static final Block BLACK_BRICK_STAIRS = new StairsBlock(
        BLACK_BRICK.getDefaultState(),
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
    public static final Block ORANGE_BRICK_STAIRS = new StairsBlock(
        ORANGE_BRICK.getDefaultState(),
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
    public static final Block BROWN_BRICK_STAIRS = new StairsBlock(
        BROWN_BRICK.getDefaultState(),
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
    public static final Block YELLOW_BRICK_STAIRS = new StairsBlock(
        YELLOW_BRICK.getDefaultState(),
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
    public static final Block LIME_BRICK_STAIRS = new StairsBlock(
        LIME_BRICK.getDefaultState(),
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
    public static final Block GREEN_BRICK_STAIRS = new StairsBlock(
        GREEN_BRICK.getDefaultState(),
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
    public static final Block CYAN_BRICK_STAIRS = new StairsBlock(
        CYAN_BRICK.getDefaultState(),
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
    public static final Block LIGHT_BLUE_BRICK_STAIRS = new StairsBlock(
        LIGHT_BLUE_BRICK.getDefaultState(),
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
    public static final Block BLUE_BRICK_STAIRS = new StairsBlock(
        BLUE_BRICK.getDefaultState(),
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
    public static final Block PURPLE_BRICK_STAIRS = new StairsBlock(
        PURPLE_BRICK.getDefaultState(),
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
    public static final Block MAGENTA_BRICK_STAIRS = new StairsBlock(
        MAGENTA_BRICK.getDefaultState(),
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
    public static final Block PINK_BRICK_STAIRS = new StairsBlock(
        PINK_BRICK.getDefaultState(),
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
        RegistryKey<Block> blockKey,
        Block block,
        RegistryKey<Item> itemKey
    ) {
        Registry.register(Registries.BLOCK, blockKey, block);
        BlockItem item = new BlockItem(
            block,
            new Item.Settings()
                .registryKey(itemKey)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(Registries.ITEM, itemKey, item);
        return item;
    }

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

        // --- CREATIVE TAB ---
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> {
                // Tiles
                entries.add(whiteAndBlackTileItem);
                entries.add(lightGrayAndBlackTileItem);
                entries.add(grayAndBlackTileItem);
                entries.add(orangeAndBlackTileItem);
                entries.add(magentaAndBlackTileItem);
                entries.add(yellowAndBlackTileItem);
                entries.add(lightBlueAndBlackTileItem);
                entries.add(blueAndBlackTileItem);
                entries.add(limeAndBlackTileItem);
                entries.add(pinkAndBlackTileItem);
                entries.add(cyanAndBlackTileItem);
                entries.add(purpleAndBlackTileItem);
                entries.add(brownAndBlackTileItem);
                entries.add(greenAndBlackTileItem);
                entries.add(redAndBlackTileItem);
                // Chroma Keys
                entries.add(blueChromaKeyItem);
                entries.add(greenChromaKeyItem);
                entries.add(redChromaKeyItem);
                // Tables
                entries.add(oakPlanksTableItem);
                entries.add(darkOakPlanksTableItem);
                entries.add(sprucePlanksTableItem);
                entries.add(birchPlanksTableItem);
                entries.add(junglePlanksTableItem);
                entries.add(acaciaPlanksTableItem);
                entries.add(mangrovePlanksTableItem);
                entries.add(cherryPlanksTableItem);
                entries.add(bambooPlanksTableItem);
                entries.add(crimsonPlanksTableItem);
                entries.add(warpedPlanksTableItem);
                entries.add(paleOakPlanksTableItem);
                // Bricks: base → stairs → slab → wall, por cor
                entries.add(whiteBrickItem);
                entries.add(whiteBrickStairsItem);
                entries.add(whiteBrickSlabItem);
                entries.add(whiteBrickWallItem);
                entries.add(lightGrayBrickItem);
                entries.add(lightGrayBrickStairsItem);
                entries.add(lightGrayBrickSlabItem);
                entries.add(lightGrayBrickWallItem);
                entries.add(grayBrickItem);
                entries.add(grayBrickStairsItem);
                entries.add(grayBrickSlabItem);
                entries.add(grayBrickWallItem);
                entries.add(blackBrickItem);
                entries.add(blackBrickStairsItem);
                entries.add(blackBrickSlabItem);
                entries.add(blackBrickWallItem);
                entries.add(orangeBrickItem);
                entries.add(orangeBrickStairsItem);
                entries.add(orangeBrickSlabItem);
                entries.add(orangeBrickWallItem);
                entries.add(brownBrickItem);
                entries.add(brownBrickStairsItem);
                entries.add(brownBrickSlabItem);
                entries.add(brownBrickWallItem);
                entries.add(yellowBrickItem);
                entries.add(yellowBrickStairsItem);
                entries.add(yellowBrickSlabItem);
                entries.add(yellowBrickWallItem);
                entries.add(limeBrickItem);
                entries.add(limeBrickStairsItem);
                entries.add(limeBrickSlabItem);
                entries.add(limeBrickWallItem);
                entries.add(greenBrickItem);
                entries.add(greenBrickStairsItem);
                entries.add(greenBrickSlabItem);
                entries.add(greenBrickWallItem);
                entries.add(cyanBrickItem);
                entries.add(cyanBrickStairsItem);
                entries.add(cyanBrickSlabItem);
                entries.add(cyanBrickWallItem);
                entries.add(lightBlueBrickItem);
                entries.add(lightBlueBrickStairsItem);
                entries.add(lightBlueBrickSlabItem);
                entries.add(lightBlueBrickWallItem);
                entries.add(blueBrickItem);
                entries.add(blueBrickStairsItem);
                entries.add(blueBrickSlabItem);
                entries.add(blueBrickWallItem);
                entries.add(purpleBrickItem);
                entries.add(purpleBrickStairsItem);
                entries.add(purpleBrickSlabItem);
                entries.add(purpleBrickWallItem);
                entries.add(magentaBrickItem);
                entries.add(magentaBrickStairsItem);
                entries.add(magentaBrickSlabItem);
                entries.add(magentaBrickWallItem);
                entries.add(pinkBrickItem);
                entries.add(pinkBrickStairsItem);
                entries.add(pinkBrickSlabItem);
                entries.add(pinkBrickWallItem);
            }
        );
    }
}
