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
                .icon(() -> new ItemStack(Blocks.WHITE_AND_BLACK_TILE))
                .displayName(Text.translatable("itemgroup.blokkusus.building"))
                .entries((displayContext, entries) -> {
                    entries.add(Blocks.WHITE_AND_BLACK_TILE);
                    entries.add(Blocks.LIGHT_GRAY_AND_BLACK_TILE);
                    entries.add(Blocks.GRAY_AND_BLACK_TILE);
                    entries.add(Blocks.RED_AND_BLACK_TILE);
                    entries.add(Blocks.ORANGE_AND_BLACK_TILE);
                    entries.add(Blocks.BROWN_AND_BLACK_TILE);
                    entries.add(Blocks.YELLOW_AND_BLACK_TILE);
                    entries.add(Blocks.LIME_AND_BLACK_TILE);
                    entries.add(Blocks.GREEN_AND_BLACK_TILE);
                    entries.add(Blocks.CYAN_AND_BLACK_TILE);
                    entries.add(Blocks.LIGHT_BLUE_AND_BLACK_TILE);
                    entries.add(Blocks.BLUE_AND_BLACK_TILE);
                    entries.add(Blocks.PURPLE_AND_BLACK_TILE);
                    entries.add(Blocks.MAGENTA_AND_BLACK_TILE);
                    entries.add(Blocks.PINK_AND_BLACK_TILE);
                    entries.add(Blocks.RED_CHROMA_KEY);
                    entries.add(Blocks.GREEN_CHROMA_KEY);
                    entries.add(Blocks.BLUE_CHROMA_KEY);
                })
                .build()
        );

    public static final net.minecraft.item.ItemGroup BLOKKUSUS_DECORATION_GROUP =
        Registry.register(
            Registries.ITEM_GROUP,
            Identifier.of(Blokkusus.MOD_ID, "blokkusus_deco"),
            FabricItemGroup.builder()
                .icon(() -> new ItemStack(Blocks.OAK_PLANKS_TABLE))
                .displayName(Text.translatable("itemgroup.blokkusus.deco"))
                .entries((displayContext, entries) -> {
                    entries.add(Blocks.OAK_PLANKS_TABLE);
                    entries.add(Blocks.DARK_OAK_PLANKS_TABLE);
                    entries.add(Blocks.ACACIA_PLANKS_TABLE);
                    entries.add(Blocks.BAMBOO_PLANKS_TABLE);
                    entries.add(Blocks.BIRCH_PLANKS_TABLE);
                    entries.add(Blocks.CHERRY_PLANKS_TABLE);
                    entries.add(Blocks.CRIMSON_PLANKS_TABLE);
                    entries.add(Blocks.JUNGLE_PLANKS_TABLE);
                    entries.add(Blocks.PALE_OAK_PLANKS_TABLE);
                    entries.add(Blocks.SPRUCE_PLANKS_TABLE);
                    entries.add(Blocks.WARPED_PLANKS_TABLE);
                })
                .build()
        );

    public static void registerItemGroups() {
        Blokkusus.LOGGER.info("Registering Blocks...");
    }
}
