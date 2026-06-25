package dev.edonme.blokkusus;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ItemGroup {

    public static final net.minecraft.item.ItemGroup BLOKKUSUS_BUILDING_GROUP =
        Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Blokkusus.MOD_ID, "blokkusus_building"),
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.WHITE_AND_BLACK_TILE))
                .displayName(Text.translatable("itemgroup.blokkusus.building"))
                .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.WHITE_AND_BLACK_TILE);
                    entries.add(ModBlocks.LIGHT_GRAY_AND_BLACK_TILE);
                    entries.add(ModBlocks.GRAY_AND_BLACK_TILE);
                    entries.add(ModBlocks.RED_AND_BLACK_TILE);
                    entries.add(ModBlocks.ORANGE_AND_BLACK_TILE);
                    entries.add(ModBlocks.BROWN_AND_BLACK_TILE);
                    entries.add(ModBlocks.YELLOW_AND_BLACK_TILE);
                    entries.add(ModBlocks.LIME_AND_BLACK_TILE);
                    entries.add(ModBlocks.GREEN_AND_BLACK_TILE);
                    entries.add(ModBlocks.CYAN_AND_BLACK_TILE);
                    entries.add(ModBlocks.LIGHT_BLUE_AND_BLACK_TILE);
                    entries.add(ModBlocks.BLUE_AND_BLACK_TILE);
                    entries.add(ModBlocks.PURPLE_AND_BLACK_TILE);
                    entries.add(ModBlocks.MAGENTA_AND_BLACK_TILE);
                    entries.add(ModBlocks.PINK_AND_BLACK_TILE);
                    entries.add(ModBlocks.RED_CHROMA_KEY);
                    entries.add(ModBlocks.GREEN_CHROMA_KEY);
                    entries.add(ModBlocks.BLUE_CHROMA_KEY);
                    entries.add(ModBlocks.WHITE_BRICK_STAIRS);
                    entries.add(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
                    entries.add(ModBlocks.GRAY_BRICK_STAIRS);
                    entries.add(ModBlocks.BLACK_BRICK_STAIRS);
                    entries.add(ModBlocks.ORANGE_BRICK_STAIRS);
                    entries.add(ModBlocks.BROWN_BRICK_STAIRS);
                    entries.add(ModBlocks.YELLOW_BRICK_STAIRS);
                    entries.add(ModBlocks.LIME_BRICK_STAIRS);
                    entries.add(ModBlocks.GREEN_BRICK_STAIRS);
                    entries.add(ModBlocks.CYAN_BRICK_STAIRS);
                    entries.add(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
                    entries.add(ModBlocks.BLUE_BRICK_STAIRS);
                    entries.add(ModBlocks.PURPLE_BRICK_STAIRS);
                    entries.add(ModBlocks.MAGENTA_BRICK_STAIRS);
                    entries.add(ModBlocks.PINK_BRICK_STAIRS);
                    entries.add(ModBlocks.WHITE_BRICK_SLAB);
                    entries.add(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
                    entries.add(ModBlocks.GRAY_BRICK_SLAB);
                    entries.add(ModBlocks.BLACK_BRICK_SLAB);
                    entries.add(ModBlocks.ORANGE_BRICK_SLAB);
                    entries.add(ModBlocks.BROWN_BRICK_SLAB);
                    entries.add(ModBlocks.YELLOW_BRICK_SLAB);
                    entries.add(ModBlocks.LIME_BRICK_SLAB);
                    entries.add(ModBlocks.GREEN_BRICK_SLAB);
                    entries.add(ModBlocks.CYAN_BRICK_SLAB);
                    entries.add(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
                    entries.add(ModBlocks.BLUE_BRICK_SLAB);
                    entries.add(ModBlocks.PURPLE_BRICK_SLAB);
                    entries.add(ModBlocks.MAGENTA_BRICK_SLAB);
                    entries.add(ModBlocks.PINK_BRICK_SLAB);
                    entries.add(ModBlocks.WHITE_BRICK_WALL);
                    entries.add(ModBlocks.LIGHT_GRAY_BRICK_WALL);
                    entries.add(ModBlocks.GRAY_BRICK_WALL);
                    entries.add(ModBlocks.BLACK_BRICK_WALL);
                    entries.add(ModBlocks.ORANGE_BRICK_WALL);
                    entries.add(ModBlocks.BROWN_BRICK_WALL);
                    entries.add(ModBlocks.YELLOW_BRICK_WALL);
                    entries.add(ModBlocks.LIME_BRICK_WALL);
                    entries.add(ModBlocks.GREEN_BRICK_WALL);
                    entries.add(ModBlocks.CYAN_BRICK_WALL);
                    entries.add(ModBlocks.LIGHT_BLUE_BRICK_WALL);
                    entries.add(ModBlocks.BLUE_BRICK_WALL);
                    entries.add(ModBlocks.PURPLE_BRICK_WALL);
                    entries.add(ModBlocks.MAGENTA_BRICK_WALL);
                    entries.add(ModBlocks.PINK_BRICK_WALL);
                    entries.add(ModBlocks.WHITE_BRICK);
                    entries.add(ModBlocks.LIGHT_GRAY_BRICK);
                    entries.add(ModBlocks.GRAY_BRICK);
                    entries.add(ModBlocks.BLACK_BRICK);
                    entries.add(ModBlocks.ORANGE_BRICK);
                    entries.add(ModBlocks.BROWN_BRICK);
                    entries.add(ModBlocks.YELLOW_BRICK);
                    entries.add(ModBlocks.LIME_BRICK);
                    entries.add(ModBlocks.GREEN_BRICK);
                    entries.add(ModBlocks.CYAN_BRICK);
                    entries.add(ModBlocks.LIGHT_BLUE_BRICK);
                    entries.add(ModBlocks.BLUE_BRICK);
                    entries.add(ModBlocks.PURPLE_BRICK);
                    entries.add(ModBlocks.MAGENTA_BRICK);
                    entries.add(ModBlocks.PINK_BRICK);
                    entries.add(ModBlocks.MOSSY_STONE);
                    entries.add(ModBlocks.MOSSY_STONE_SLAB);
                    entries.add(ModBlocks.MOSSY_STONE_STAIRS);
                    entries.add(ModBlocks.MOSSY_STONE_WALL);
                })
                .build()
        );

    public static final net.minecraft.item.ItemGroup BLOKKUSUS_DECORATION_GROUP =
        Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Blokkusus.MOD_ID, "blokkusus_deco"),
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.OAK_PLANKS_TABLE))
                .displayName(Text.translatable("itemgroup.blokkusus.deco"))
                .entries((displayContext, entries) -> {
                    entries.add(ModBlocks.OAK_PLANKS_TABLE);
                    entries.add(ModBlocks.DARK_OAK_PLANKS_TABLE);
                    entries.add(ModBlocks.ACACIA_PLANKS_TABLE);
                    entries.add(ModBlocks.BAMBOO_PLANKS_TABLE);
                    entries.add(ModBlocks.BIRCH_PLANKS_TABLE);
                    entries.add(ModBlocks.CHERRY_PLANKS_TABLE);
                    entries.add(ModBlocks.CRIMSON_PLANKS_TABLE);
                    entries.add(ModBlocks.JUNGLE_PLANKS_TABLE);
                    entries.add(ModBlocks.PALE_OAK_PLANKS_TABLE);
                    entries.add(ModBlocks.SPRUCE_PLANKS_TABLE);
                    entries.add(ModBlocks.WARPED_PLANKS_TABLE);
                    entries.add(ModBlocks.WHITE_WOOL_STAIRS);
                    entries.add(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                    entries.add(ModBlocks.GRAY_WOOL_STAIRS);
                    entries.add(ModBlocks.BLACK_WOOL_STAIRS);
                    entries.add(ModBlocks.BROWN_WOOL_STAIRS);
                    entries.add(ModBlocks.RED_WOOL_STAIRS);
                    entries.add(ModBlocks.ORANGE_WOOL_STAIRS);
                    entries.add(ModBlocks.YELLOW_WOOL_STAIRS);
                    entries.add(ModBlocks.LIME_WOOL_STAIRS);
                    entries.add(ModBlocks.GREEN_WOOL_STAIRS);
                    entries.add(ModBlocks.CYAN_WOOL_STAIRS);
                    entries.add(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                    entries.add(ModBlocks.BLUE_WOOL_STAIRS);
                    entries.add(ModBlocks.PURPLE_WOOL_STAIRS);
                    entries.add(ModBlocks.MAGENTA_WOOL_STAIRS);
                    entries.add(ModBlocks.PINK_WOOL_STAIRS);
                    entries.add(ModBlocks.WHITE_WOOL_SLAB);
                    entries.add(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                    entries.add(ModBlocks.GRAY_WOOL_SLAB);
                    entries.add(ModBlocks.BLACK_WOOL_SLAB);
                    entries.add(ModBlocks.BROWN_WOOL_SLAB);
                    entries.add(ModBlocks.RED_WOOL_SLAB);
                    entries.add(ModBlocks.ORANGE_WOOL_SLAB);
                    entries.add(ModBlocks.YELLOW_WOOL_SLAB);
                    entries.add(ModBlocks.LIME_WOOL_SLAB);
                    entries.add(ModBlocks.GREEN_WOOL_SLAB);
                    entries.add(ModBlocks.CYAN_WOOL_SLAB);
                    entries.add(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                    entries.add(ModBlocks.BLUE_WOOL_SLAB);
                    entries.add(ModBlocks.PURPLE_WOOL_SLAB);
                    entries.add(ModBlocks.MAGENTA_WOOL_SLAB);
                    entries.add(ModBlocks.PINK_WOOL_SLAB);
                })
                .build()
        );

    public static void registerItemGroups() {
        Blokkusus.LOGGER.info("Registering Blocks...");
    }
}
