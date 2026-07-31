package dev.edonme.blokkusus;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.core.Registry;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.network.chat.Component;
import net.minecraft.resources.Identifier;
import net.minecraft.world.item.ItemStack;

public class ItemGroup {

    public static final net.minecraft.world.item.CreativeModeTab BLOKKUSUS_BUILDING_GROUP =
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Blokkusus.MOD_ID, "blokkusus_building"),
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.WHITE_AND_BLACK_TILE))
                .title(Component.translatable("itemgroup.blokkusus.building"))
                .displayItems((displayContext, entries) -> {
                    entries.accept(ModBlocks.WHITE_AND_BLACK_TILE);
                    entries.accept(ModBlocks.LIGHT_GRAY_AND_BLACK_TILE);
                    entries.accept(ModBlocks.GRAY_AND_BLACK_TILE);
                    entries.accept(ModBlocks.RED_AND_BLACK_TILE);
                    entries.accept(ModBlocks.ORANGE_AND_BLACK_TILE);
                    entries.accept(ModBlocks.BROWN_AND_BLACK_TILE);
                    entries.accept(ModBlocks.YELLOW_AND_BLACK_TILE);
                    entries.accept(ModBlocks.LIME_AND_BLACK_TILE);
                    entries.accept(ModBlocks.GREEN_AND_BLACK_TILE);
                    entries.accept(ModBlocks.CYAN_AND_BLACK_TILE);
                    entries.accept(ModBlocks.LIGHT_BLUE_AND_BLACK_TILE);
                    entries.accept(ModBlocks.BLUE_AND_BLACK_TILE);
                    entries.accept(ModBlocks.PURPLE_AND_BLACK_TILE);
                    entries.accept(ModBlocks.MAGENTA_AND_BLACK_TILE);
                    entries.accept(ModBlocks.PINK_AND_BLACK_TILE);
                    entries.accept(ModBlocks.RED_CHROMA_KEY);
                    entries.accept(ModBlocks.GREEN_CHROMA_KEY);
                    entries.accept(ModBlocks.BLUE_CHROMA_KEY);
                    entries.accept(ModBlocks.WHITE_BRICK_STAIRS);
                    entries.accept(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
                    entries.accept(ModBlocks.GRAY_BRICK_STAIRS);
                    entries.accept(ModBlocks.BLACK_BRICK_STAIRS);
                    entries.accept(ModBlocks.ORANGE_BRICK_STAIRS);
                    entries.accept(ModBlocks.BROWN_BRICK_STAIRS);
                    entries.accept(ModBlocks.YELLOW_BRICK_STAIRS);
                    entries.accept(ModBlocks.LIME_BRICK_STAIRS);
                    entries.accept(ModBlocks.GREEN_BRICK_STAIRS);
                    entries.accept(ModBlocks.CYAN_BRICK_STAIRS);
                    entries.accept(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
                    entries.accept(ModBlocks.BLUE_BRICK_STAIRS);
                    entries.accept(ModBlocks.PURPLE_BRICK_STAIRS);
                    entries.accept(ModBlocks.MAGENTA_BRICK_STAIRS);
                    entries.accept(ModBlocks.PINK_BRICK_STAIRS);
                    entries.accept(ModBlocks.WHITE_BRICK_SLAB);
                    entries.accept(ModBlocks.LIGHT_GRAY_BRICK_SLAB);
                    entries.accept(ModBlocks.GRAY_BRICK_SLAB);
                    entries.accept(ModBlocks.BLACK_BRICK_SLAB);
                    entries.accept(ModBlocks.ORANGE_BRICK_SLAB);
                    entries.accept(ModBlocks.BROWN_BRICK_SLAB);
                    entries.accept(ModBlocks.YELLOW_BRICK_SLAB);
                    entries.accept(ModBlocks.LIME_BRICK_SLAB);
                    entries.accept(ModBlocks.GREEN_BRICK_SLAB);
                    entries.accept(ModBlocks.CYAN_BRICK_SLAB);
                    entries.accept(ModBlocks.LIGHT_BLUE_BRICK_SLAB);
                    entries.accept(ModBlocks.BLUE_BRICK_SLAB);
                    entries.accept(ModBlocks.PURPLE_BRICK_SLAB);
                    entries.accept(ModBlocks.MAGENTA_BRICK_SLAB);
                    entries.accept(ModBlocks.PINK_BRICK_SLAB);
                    entries.accept(ModBlocks.WHITE_BRICK_WALL);
                    entries.accept(ModBlocks.LIGHT_GRAY_BRICK_WALL);
                    entries.accept(ModBlocks.GRAY_BRICK_WALL);
                    entries.accept(ModBlocks.BLACK_BRICK_WALL);
                    entries.accept(ModBlocks.ORANGE_BRICK_WALL);
                    entries.accept(ModBlocks.BROWN_BRICK_WALL);
                    entries.accept(ModBlocks.YELLOW_BRICK_WALL);
                    entries.accept(ModBlocks.LIME_BRICK_WALL);
                    entries.accept(ModBlocks.GREEN_BRICK_WALL);
                    entries.accept(ModBlocks.CYAN_BRICK_WALL);
                    entries.accept(ModBlocks.LIGHT_BLUE_BRICK_WALL);
                    entries.accept(ModBlocks.BLUE_BRICK_WALL);
                    entries.accept(ModBlocks.PURPLE_BRICK_WALL);
                    entries.accept(ModBlocks.MAGENTA_BRICK_WALL);
                    entries.accept(ModBlocks.PINK_BRICK_WALL);
                    entries.accept(ModBlocks.WHITE_BRICK);
                    entries.accept(ModBlocks.LIGHT_GRAY_BRICK);
                    entries.accept(ModBlocks.GRAY_BRICK);
                    entries.accept(ModBlocks.BLACK_BRICK);
                    entries.accept(ModBlocks.ORANGE_BRICK);
                    entries.accept(ModBlocks.BROWN_BRICK);
                    entries.accept(ModBlocks.YELLOW_BRICK);
                    entries.accept(ModBlocks.LIME_BRICK);
                    entries.accept(ModBlocks.GREEN_BRICK);
                    entries.accept(ModBlocks.CYAN_BRICK);
                    entries.accept(ModBlocks.LIGHT_BLUE_BRICK);
                    entries.accept(ModBlocks.BLUE_BRICK);
                    entries.accept(ModBlocks.PURPLE_BRICK);
                    entries.accept(ModBlocks.MAGENTA_BRICK);
                    entries.accept(ModBlocks.PINK_BRICK);
                    entries.accept(ModBlocks.MOSSY_STONE);
                    entries.accept(ModBlocks.MOSSY_STONE_SLAB);
                    entries.accept(ModBlocks.MOSSY_STONE_STAIRS);
                    entries.accept(ModBlocks.MOSSY_STONE_WALL);
                })
                .build()
        );

    public static final net.minecraft.world.item.CreativeModeTab BLOKKUSUS_DECORATION_GROUP =
        Registry.register(
            BuiltInRegistries.CREATIVE_MODE_TAB,
            Identifier.fromNamespaceAndPath(Blokkusus.MOD_ID, "blokkusus_deco"),
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(ModBlocks.OAK_PLANKS_TABLE))
                .title(Component.translatable("itemgroup.blokkusus.deco"))
                .displayItems((displayContext, entries) -> {
                    entries.accept(ModBlocks.OAK_PLANKS_TABLE);
                    entries.accept(ModBlocks.DARK_OAK_PLANKS_TABLE);
                    entries.accept(ModBlocks.ACACIA_PLANKS_TABLE);
                    entries.accept(ModBlocks.BAMBOO_PLANKS_TABLE);
                    entries.accept(ModBlocks.BIRCH_PLANKS_TABLE);
                    entries.accept(ModBlocks.CHERRY_PLANKS_TABLE);
                    entries.accept(ModBlocks.CRIMSON_PLANKS_TABLE);
                    entries.accept(ModBlocks.JUNGLE_PLANKS_TABLE);
                    entries.accept(ModBlocks.PALE_OAK_PLANKS_TABLE);
                    entries.accept(ModBlocks.SPRUCE_PLANKS_TABLE);
                    entries.accept(ModBlocks.WARPED_PLANKS_TABLE);
                    entries.accept(ModBlocks.WHITE_WOOL_STAIRS);
                    entries.accept(ModBlocks.LIGHT_GRAY_WOOL_STAIRS);
                    entries.accept(ModBlocks.GRAY_WOOL_STAIRS);
                    entries.accept(ModBlocks.BLACK_WOOL_STAIRS);
                    entries.accept(ModBlocks.BROWN_WOOL_STAIRS);
                    entries.accept(ModBlocks.RED_WOOL_STAIRS);
                    entries.accept(ModBlocks.ORANGE_WOOL_STAIRS);
                    entries.accept(ModBlocks.YELLOW_WOOL_STAIRS);
                    entries.accept(ModBlocks.LIME_WOOL_STAIRS);
                    entries.accept(ModBlocks.GREEN_WOOL_STAIRS);
                    entries.accept(ModBlocks.CYAN_WOOL_STAIRS);
                    entries.accept(ModBlocks.LIGHT_BLUE_WOOL_STAIRS);
                    entries.accept(ModBlocks.BLUE_WOOL_STAIRS);
                    entries.accept(ModBlocks.PURPLE_WOOL_STAIRS);
                    entries.accept(ModBlocks.MAGENTA_WOOL_STAIRS);
                    entries.accept(ModBlocks.PINK_WOOL_STAIRS);
                    entries.accept(ModBlocks.WHITE_WOOL_SLAB);
                    entries.accept(ModBlocks.LIGHT_GRAY_WOOL_SLAB);
                    entries.accept(ModBlocks.GRAY_WOOL_SLAB);
                    entries.accept(ModBlocks.BLACK_WOOL_SLAB);
                    entries.accept(ModBlocks.BROWN_WOOL_SLAB);
                    entries.accept(ModBlocks.RED_WOOL_SLAB);
                    entries.accept(ModBlocks.ORANGE_WOOL_SLAB);
                    entries.accept(ModBlocks.YELLOW_WOOL_SLAB);
                    entries.accept(ModBlocks.LIME_WOOL_SLAB);
                    entries.accept(ModBlocks.GREEN_WOOL_SLAB);
                    entries.accept(ModBlocks.CYAN_WOOL_SLAB);
                    entries.accept(ModBlocks.LIGHT_BLUE_WOOL_SLAB);
                    entries.accept(ModBlocks.BLUE_WOOL_SLAB);
                    entries.accept(ModBlocks.PURPLE_WOOL_SLAB);
                    entries.accept(ModBlocks.MAGENTA_WOOL_SLAB);
                    entries.accept(ModBlocks.PINK_WOOL_SLAB);
                    entries.accept(ModBlocks.GLOBE);
                })
                .build()
        );

    public static void registerItemGroups() {
        Blokkusus.LOGGER.info("Registering Blocks...");
    }
}
