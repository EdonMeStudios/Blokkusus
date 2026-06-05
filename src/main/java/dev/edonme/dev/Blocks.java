package dev.edonme.blokkusus;

import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.RedstoneLampBlock;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.registry.RegistryKey;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;

public class Blocks {

    // ==========================================
    // 1. IDENTIFIERS AND REGISTRY KEYS
    // ==========================================

    public static final Identifier WHITE_AND_BLACK_TILE_ID = Identifier.of(
        Blokkusus.MOD_ID,
        "white_and_black_tile"
    );
    public static final RegistryKey<Block> WHITE_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, WHITE_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> WHITE_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, WHITE_AND_BLACK_TILE_ID);

    public static final Identifier LIGHT_GRAY_AND_BLACK_TILE_ID = Identifier.of(
        Blokkusus.MOD_ID,
        "light_gray_and_black_tile"
    );
    public static final RegistryKey<Block> LIGHT_GRAY_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, LIGHT_GRAY_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> LIGHT_GRAY_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, LIGHT_GRAY_AND_BLACK_TILE_ID);

    public static final Identifier GRAY_AND_BLACK_TILE_ID = Identifier.of(
        Blokkusus.MOD_ID,
        "gray_and_black_tile"
    );
    public static final RegistryKey<Block> GRAY_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, GRAY_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> GRAY_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, GRAY_AND_BLACK_TILE_ID);

    public static final Identifier OAK_PLANKS_TABLE_ID = Identifier.of(
        Blokkusus.MOD_ID,
        "oak_planks_table"
    );
    public static final RegistryKey<Block> OAK_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, OAK_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> OAK_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, OAK_PLANKS_TABLE_ID);

    public static final Identifier DARK_OAK_PLANKS_TABLE_ID = Identifier.of(
        Blokkusus.MOD_ID,
        "dark_oak_planks_table"
    );
    public static final RegistryKey<Block> DARK_OAK_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, DARK_OAK_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> DARK_OAK_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, DARK_OAK_PLANKS_TABLE_ID);

    // ==========================================
    // 2. SOME STUFF
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

    public static final Identifier ORANGE_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "orange_and_black_tile"
    );
    public static final RegistryKey<Block> ORANGE_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, ORANGE_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> ORANGE_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, ORANGE_AND_BLACK_TILE_ID);

    public static final Identifier MAGENTA_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "magenta_and_black_tile"
    );
    public static final RegistryKey<Block> MAGENTA_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, MAGENTA_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> MAGENTA_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, MAGENTA_AND_BLACK_TILE_ID);

    public static final Identifier LIGHT_BLUE_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "light_blue_and_black_tile"
    );
    public static final RegistryKey<Block> LIGHT_BLUE_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, LIGHT_BLUE_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> LIGHT_BLUE_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, LIGHT_BLUE_AND_BLACK_TILE_ID);

    public static final Identifier YELLOW_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "yellow_and_black_tile"
    );
    public static final RegistryKey<Block> YELLOW_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, YELLOW_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> YELLOW_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, YELLOW_AND_BLACK_TILE_ID);

    public static final Identifier LIME_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "lime_and_black_tile"
    );
    public static final RegistryKey<Block> LIME_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, LIME_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> LIME_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, LIME_AND_BLACK_TILE_ID);

    public static final Identifier PINK_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "pink_and_black_tile"
    );
    public static final RegistryKey<Block> PINK_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, PINK_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> PINK_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, PINK_AND_BLACK_TILE_ID);

    public static final Identifier CYAN_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "cyan_and_black_tile"
    );
    public static final RegistryKey<Block> CYAN_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, CYAN_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> CYAN_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, CYAN_AND_BLACK_TILE_ID);

    public static final Identifier PURPLE_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "purple_and_black_tile"
    );
    public static final RegistryKey<Block> PURPLE_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, PURPLE_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> PURPLE_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, PURPLE_AND_BLACK_TILE_ID);

    public static final Identifier BLUE_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "blue_and_black_tile"
    );
    public static final RegistryKey<Block> BLUE_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, BLUE_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> BLUE_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, BLUE_AND_BLACK_TILE_ID);

    public static final Identifier BROWN_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "brown_and_black_tile"
    );
    public static final RegistryKey<Block> BROWN_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, BROWN_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> BROWN_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, BROWN_AND_BLACK_TILE_ID);

    public static final Identifier GREEN_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "green_and_black_tile"
    );
    public static final RegistryKey<Block> GREEN_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, GREEN_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> GREEN_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, GREEN_AND_BLACK_TILE_ID);

    public static final Identifier RED_AND_BLACK_TILE_ID = Identifier.of(
        "blokkusus",
        "red_and_black_tile"
    );
    public static final RegistryKey<Block> RED_AND_BLACK_TILE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, RED_AND_BLACK_TILE_ID);
    public static final RegistryKey<Item> RED_AND_BLACK_TILE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, RED_AND_BLACK_TILE_ID);

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

    public static final Identifier BLUE_CHROMA_KEY_ID = Identifier.of(
        "blokkusus",
        "blue_chroma_key"
    );
    public static final RegistryKey<Block> BLUE_CHROMA_KEY_KEY = RegistryKey.of(
        RegistryKeys.BLOCK,
        BLUE_CHROMA_KEY_ID
    );
    public static final RegistryKey<Item> BLUE_CHROMA_KEY_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, BLUE_CHROMA_KEY_ID);

    public static final Identifier GREEN_CHROMA_KEY_ID = Identifier.of(
        "blokkusus",
        "green_chroma_key"
    );
    public static final RegistryKey<Block> GREEN_CHROMA_KEY_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, GREEN_CHROMA_KEY_ID);
    public static final RegistryKey<Item> GREEN_CHROMA_KEY_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, GREEN_CHROMA_KEY_ID);

    public static final Identifier RED_CHROMA_KEY_ID = Identifier.of(
        "blokkusus",
        "red_chroma_key"
    );
    public static final RegistryKey<Block> RED_CHROMA_KEY_KEY = RegistryKey.of(
        RegistryKeys.BLOCK,
        RED_CHROMA_KEY_ID
    );
    public static final RegistryKey<Item> RED_CHROMA_KEY_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, RED_CHROMA_KEY_ID);

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

    public static final Identifier SPRUCE_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "spruce_planks_table"
    );
    public static final RegistryKey<Block> SPRUCE_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, SPRUCE_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> SPRUCE_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, SPRUCE_PLANKS_TABLE_ID);

    public static final Identifier BIRCH_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "birch_planks_table"
    );
    public static final RegistryKey<Block> BIRCH_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, BIRCH_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> BIRCH_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, BIRCH_PLANKS_TABLE_ID);

    public static final Identifier JUNGLE_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "jungle_planks_table"
    );
    public static final RegistryKey<Block> JUNGLE_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, JUNGLE_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> JUNGLE_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, JUNGLE_PLANKS_TABLE_ID);

    public static final Identifier ACACIA_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "acacia_planks_table"
    );
    public static final RegistryKey<Block> ACACIA_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, ACACIA_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> ACACIA_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, ACACIA_PLANKS_TABLE_ID);

    public static final Identifier MANGROVE_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "mangrove_planks_table"
    );
    public static final RegistryKey<Block> MANGROVE_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, MANGROVE_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> MANGROVE_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, MANGROVE_PLANKS_TABLE_ID);

    public static final Identifier CHERRY_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "cherry_planks_table"
    );
    public static final RegistryKey<Block> CHERRY_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, CHERRY_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> CHERRY_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, CHERRY_PLANKS_TABLE_ID);

    public static final Identifier BAMBOO_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "bamboo_planks_table"
    );
    public static final RegistryKey<Block> BAMBOO_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, BAMBOO_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> BAMBOO_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, BAMBOO_PLANKS_TABLE_ID);

    public static final Identifier CRIMSON_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "crimson_planks_table"
    );
    public static final RegistryKey<Block> CRIMSON_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, CRIMSON_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> CRIMSON_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, CRIMSON_PLANKS_TABLE_ID);

    public static final Identifier WARPED_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "warped_planks_table"
    );
    public static final RegistryKey<Block> WARPED_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, WARPED_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> WARPED_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, WARPED_PLANKS_TABLE_ID);

    public static final Identifier PALE_OAK_PLANKS_TABLE_ID = Identifier.of(
        "blokkusus",
        "pale_oak_planks_table"
    );
    public static final RegistryKey<Block> PALE_OAK_PLANKS_TABLE_KEY =
        RegistryKey.of(RegistryKeys.BLOCK, PALE_OAK_PLANKS_TABLE_ID);
    public static final RegistryKey<Item> PALE_OAK_PLANKS_TABLE_ITEM_KEY =
        RegistryKey.of(RegistryKeys.ITEM, PALE_OAK_PLANKS_TABLE_ID);

    public static final Block PALE_OAK_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(PALE_OAK_PLANKS_TABLE_KEY)
    );

    public static final Block SPRUCE_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(SPRUCE_PLANKS_TABLE_KEY)
    );

    public static final Block BIRCH_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(BIRCH_PLANKS_TABLE_KEY)
    );

    public static final Block JUNGLE_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(JUNGLE_PLANKS_TABLE_KEY)
    );

    public static final Block ACACIA_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(ACACIA_PLANKS_TABLE_KEY)
    );

    public static final Block MANGROVE_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(MANGROVE_PLANKS_TABLE_KEY)
    );

    public static final Block CHERRY_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(CHERRY_PLANKS_TABLE_KEY)
    );

    public static final Block BAMBOO_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(BAMBOO_PLANKS_TABLE_KEY)
    );

    public static final Block CRIMSON_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(CRIMSON_PLANKS_TABLE_KEY)
    );

    public static final Block WARPED_PLANKS_TABLE = new Block(
        AbstractBlock.Settings.create()
            .strength(1.75f)
            .sounds(BlockSoundGroup.WOOD)
            .nonOpaque()
            .registryKey(WARPED_PLANKS_TABLE_KEY)
    );

    public static void registerModBlocks() {
        Registry.register(
            Registries.BLOCK,
            SPRUCE_PLANKS_TABLE_KEY,
            SPRUCE_PLANKS_TABLE
        );
        BlockItem sprucePlanksTableItem = new BlockItem(
            SPRUCE_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(SPRUCE_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            SPRUCE_PLANKS_TABLE_ITEM_KEY,
            sprucePlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(sprucePlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            BIRCH_PLANKS_TABLE_KEY,
            BIRCH_PLANKS_TABLE
        );
        BlockItem birchPlanksTableItem = new BlockItem(
            BIRCH_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(BIRCH_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            BIRCH_PLANKS_TABLE_ITEM_KEY,
            birchPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(birchPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            JUNGLE_PLANKS_TABLE_KEY,
            JUNGLE_PLANKS_TABLE
        );
        BlockItem junglePlanksTableItem = new BlockItem(
            JUNGLE_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(JUNGLE_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            JUNGLE_PLANKS_TABLE_ITEM_KEY,
            junglePlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(junglePlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            ACACIA_PLANKS_TABLE_KEY,
            ACACIA_PLANKS_TABLE
        );
        BlockItem acaciaPlanksTableItem = new BlockItem(
            ACACIA_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(ACACIA_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            ACACIA_PLANKS_TABLE_ITEM_KEY,
            acaciaPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(acaciaPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            MANGROVE_PLANKS_TABLE_KEY,
            MANGROVE_PLANKS_TABLE
        );
        BlockItem mangrovePlanksTableItem = new BlockItem(
            MANGROVE_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(MANGROVE_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            MANGROVE_PLANKS_TABLE_ITEM_KEY,
            mangrovePlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(mangrovePlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            CHERRY_PLANKS_TABLE_KEY,
            CHERRY_PLANKS_TABLE
        );
        BlockItem cherryPlanksTableItem = new BlockItem(
            CHERRY_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(CHERRY_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            CHERRY_PLANKS_TABLE_ITEM_KEY,
            cherryPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(cherryPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            BAMBOO_PLANKS_TABLE_KEY,
            BAMBOO_PLANKS_TABLE
        );
        BlockItem bambooPlanksTableItem = new BlockItem(
            BAMBOO_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(BAMBOO_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            BAMBOO_PLANKS_TABLE_ITEM_KEY,
            bambooPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(bambooPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            CRIMSON_PLANKS_TABLE_KEY,
            CRIMSON_PLANKS_TABLE
        );
        BlockItem crimsonPlanksTableItem = new BlockItem(
            CRIMSON_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(CRIMSON_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            CRIMSON_PLANKS_TABLE_ITEM_KEY,
            crimsonPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(crimsonPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            WARPED_PLANKS_TABLE_KEY,
            WARPED_PLANKS_TABLE
        );
        BlockItem warpedPlanksTableItem = new BlockItem(
            WARPED_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(WARPED_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            WARPED_PLANKS_TABLE_ITEM_KEY,
            warpedPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(warpedPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            PALE_OAK_PLANKS_TABLE_KEY,
            PALE_OAK_PLANKS_TABLE
        );
        BlockItem paleOakPlanksTableItem = new BlockItem(
            PALE_OAK_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(PALE_OAK_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            PALE_OAK_PLANKS_TABLE_ITEM_KEY,
            paleOakPlanksTableItem
        );
        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> entries.add(paleOakPlanksTableItem)
        );

        Registry.register(
            Registries.BLOCK,
            BLUE_CHROMA_KEY_KEY,
            BLUE_CHROMA_KEY
        );
        BlockItem blueChromaKeyItem = new BlockItem(
            BLUE_CHROMA_KEY,
            new Item.Settings()
                .registryKey(BLUE_CHROMA_KEY_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            BLUE_CHROMA_KEY_ITEM_KEY,
            blueChromaKeyItem
        );

        Registry.register(
            Registries.BLOCK,
            GREEN_CHROMA_KEY_KEY,
            GREEN_CHROMA_KEY
        );
        BlockItem greenChromaKeyItem = new BlockItem(
            GREEN_CHROMA_KEY,
            new Item.Settings()
                .registryKey(GREEN_CHROMA_KEY_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            GREEN_CHROMA_KEY_ITEM_KEY,
            greenChromaKeyItem
        );

        Registry.register(Registries.BLOCK, RED_CHROMA_KEY_KEY, RED_CHROMA_KEY);
        BlockItem redChromaKeyItem = new BlockItem(
            RED_CHROMA_KEY,
            new Item.Settings()
                .registryKey(RED_CHROMA_KEY_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            RED_CHROMA_KEY_ITEM_KEY,
            redChromaKeyItem
        );

        Registry.register(
            Registries.BLOCK,
            ORANGE_AND_BLACK_TILE_KEY,
            ORANGE_AND_BLACK_TILE
        );
        BlockItem orangeAndBlackTileItem = new BlockItem(
            ORANGE_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(ORANGE_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            ORANGE_AND_BLACK_TILE_ITEM_KEY,
            orangeAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            MAGENTA_AND_BLACK_TILE_KEY,
            MAGENTA_AND_BLACK_TILE
        );
        BlockItem magentaAndBlackTileItem = new BlockItem(
            MAGENTA_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(MAGENTA_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            MAGENTA_AND_BLACK_TILE_ITEM_KEY,
            magentaAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            LIGHT_BLUE_AND_BLACK_TILE_KEY,
            LIGHT_BLUE_AND_BLACK_TILE
        );
        BlockItem lightBlueAndBlackTileItem = new BlockItem(
            LIGHT_BLUE_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(LIGHT_BLUE_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            LIGHT_BLUE_AND_BLACK_TILE_ITEM_KEY,
            lightBlueAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            YELLOW_AND_BLACK_TILE_KEY,
            YELLOW_AND_BLACK_TILE
        );
        BlockItem yellowAndBlackTileItem = new BlockItem(
            YELLOW_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(YELLOW_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            YELLOW_AND_BLACK_TILE_ITEM_KEY,
            yellowAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            LIME_AND_BLACK_TILE_KEY,
            LIME_AND_BLACK_TILE
        );
        BlockItem limeAndBlackTileItem = new BlockItem(
            LIME_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(LIME_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            LIME_AND_BLACK_TILE_ITEM_KEY,
            limeAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            PINK_AND_BLACK_TILE_KEY,
            PINK_AND_BLACK_TILE
        );
        BlockItem pinkAndBlackTileItem = new BlockItem(
            PINK_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(PINK_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            PINK_AND_BLACK_TILE_ITEM_KEY,
            pinkAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            CYAN_AND_BLACK_TILE_KEY,
            CYAN_AND_BLACK_TILE
        );
        BlockItem cyanAndBlackTileItem = new BlockItem(
            CYAN_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(CYAN_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            CYAN_AND_BLACK_TILE_ITEM_KEY,
            cyanAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            PURPLE_AND_BLACK_TILE_KEY,
            PURPLE_AND_BLACK_TILE
        );
        BlockItem purpleAndBlackTileItem = new BlockItem(
            PURPLE_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(PURPLE_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            PURPLE_AND_BLACK_TILE_ITEM_KEY,
            purpleAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            BLUE_AND_BLACK_TILE_KEY,
            BLUE_AND_BLACK_TILE
        );
        BlockItem blueAndBlackTileItem = new BlockItem(
            BLUE_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(BLUE_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            BLUE_AND_BLACK_TILE_ITEM_KEY,
            blueAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            BROWN_AND_BLACK_TILE_KEY,
            BROWN_AND_BLACK_TILE
        );
        BlockItem brownAndBlackTileItem = new BlockItem(
            BROWN_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(BROWN_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            BROWN_AND_BLACK_TILE_ITEM_KEY,
            brownAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            GREEN_AND_BLACK_TILE_KEY,
            GREEN_AND_BLACK_TILE
        );
        BlockItem greenAndBlackTileItem = new BlockItem(
            GREEN_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(GREEN_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            GREEN_AND_BLACK_TILE_ITEM_KEY,
            greenAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            RED_AND_BLACK_TILE_KEY,
            RED_AND_BLACK_TILE
        );
        BlockItem redAndBlackTileItem = new BlockItem(
            RED_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(RED_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            RED_AND_BLACK_TILE_ITEM_KEY,
            redAndBlackTileItem
        );

        Registry.register(
            Registries.BLOCK,
            WHITE_AND_BLACK_TILE_KEY,
            WHITE_AND_BLACK_TILE
        );
        Registry.register(
            Registries.BLOCK,
            LIGHT_GRAY_AND_BLACK_TILE_KEY,
            LIGHT_GRAY_AND_BLACK_TILE
        );
        Registry.register(
            Registries.BLOCK,
            OAK_PLANKS_TABLE_KEY,
            OAK_PLANKS_TABLE
        );
        Registry.register(
            Registries.BLOCK,
            DARK_OAK_PLANKS_TABLE_KEY,
            DARK_OAK_PLANKS_TABLE
        );
        Registry.register(
            Registries.BLOCK,
            GRAY_AND_BLACK_TILE_KEY,
            GRAY_AND_BLACK_TILE
        );

        BlockItem whiteAndBlackTileItem = new BlockItem(
            WHITE_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(WHITE_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            WHITE_AND_BLACK_TILE_ITEM_KEY,
            whiteAndBlackTileItem
        );

        BlockItem lightGrayAndBlackTileItem = new BlockItem(
            LIGHT_GRAY_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(LIGHT_GRAY_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            LIGHT_GRAY_AND_BLACK_TILE_ITEM_KEY,
            lightGrayAndBlackTileItem
        );

        BlockItem grayAndBlackTileItem = new BlockItem(
            GRAY_AND_BLACK_TILE,
            new Item.Settings()
                .registryKey(GRAY_AND_BLACK_TILE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            GRAY_AND_BLACK_TILE_ITEM_KEY,
            grayAndBlackTileItem
        );

        BlockItem oakPlanksTableItem = new BlockItem(
            OAK_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(OAK_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            OAK_PLANKS_TABLE_ITEM_KEY,
            oakPlanksTableItem
        );

        BlockItem darkOakPlanksTableItem = new BlockItem(
            DARK_OAK_PLANKS_TABLE,
            new Item.Settings()
                .registryKey(DARK_OAK_PLANKS_TABLE_ITEM_KEY)
                .useBlockPrefixedTranslationKey()
        );
        Registry.register(
            Registries.ITEM,
            DARK_OAK_PLANKS_TABLE_ITEM_KEY,
            darkOakPlanksTableItem
        );

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.BUILDING_BLOCKS).register(
            entries -> {
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
                entries.add(blueChromaKeyItem);
                entries.add(greenChromaKeyItem);
                entries.add(redChromaKeyItem);
            }
        );
    }
}
