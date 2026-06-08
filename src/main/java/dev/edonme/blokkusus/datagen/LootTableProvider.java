package dev.edonme.blokkusus.datagen;

import dev.edonme.blokkusus.ModBlocks;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import net.minecraft.registry.RegistryWrapper;

public class LootTableProvider extends FabricBlockLootTableProvider {

    public LootTableProvider(
        FabricDataOutput dataOutput,
        CompletableFuture<RegistryWrapper.WrapperLookup> registryLookup
    ) {
        super(dataOutput, registryLookup);
    }

    @Override
    public void generate() {
        addDrop(ModBlocks.RED_CHROMA_KEY);
        addDrop(ModBlocks.GREEN_CHROMA_KEY);
        addDrop(ModBlocks.BLUE_CHROMA_KEY);
        addDrop(ModBlocks.WHITE_AND_BLACK_TILE);
        addDrop(ModBlocks.LIGHT_GRAY_AND_BLACK_TILE);
        addDrop(ModBlocks.GRAY_AND_BLACK_TILE);
        addDrop(ModBlocks.RED_AND_BLACK_TILE);
        addDrop(ModBlocks.ORANGE_AND_BLACK_TILE);
        addDrop(ModBlocks.BROWN_AND_BLACK_TILE);
        addDrop(ModBlocks.YELLOW_AND_BLACK_TILE);
        addDrop(ModBlocks.LIME_AND_BLACK_TILE);
        addDrop(ModBlocks.GREEN_AND_BLACK_TILE);
        addDrop(ModBlocks.CYAN_AND_BLACK_TILE);
        addDrop(ModBlocks.LIGHT_BLUE_AND_BLACK_TILE);
        addDrop(ModBlocks.BLUE_AND_BLACK_TILE);
        addDrop(ModBlocks.PURPLE_AND_BLACK_TILE);
        addDrop(ModBlocks.MAGENTA_AND_BLACK_TILE);
        addDrop(ModBlocks.PINK_AND_BLACK_TILE);
        addDrop(ModBlocks.OAK_PLANKS_TABLE);
        addDrop(ModBlocks.BIRCH_PLANKS_TABLE);
        addDrop(ModBlocks.BAMBOO_PLANKS_TABLE);
        addDrop(ModBlocks.CHERRY_PLANKS_TABLE);
        addDrop(ModBlocks.CRIMSON_PLANKS_TABLE);
        addDrop(ModBlocks.JUNGLE_PLANKS_TABLE);
        addDrop(ModBlocks.MANGROVE_PLANKS_TABLE);
        addDrop(ModBlocks.PALE_OAK_PLANKS_TABLE);
        addDrop(ModBlocks.SPRUCE_PLANKS_TABLE);
        addDrop(ModBlocks.WARPED_PLANKS_TABLE);
        addDrop(ModBlocks.ACACIA_PLANKS_TABLE);
        addDrop(ModBlocks.DARK_OAK_PLANKS_TABLE);
        addDrop(ModBlocks.WHITE_BRICK);
        addDrop(ModBlocks.LIGHT_GRAY_BRICK);
        addDrop(ModBlocks.GRAY_BRICK);
        addDrop(ModBlocks.BLACK_BRICK);
        addDrop(ModBlocks.ORANGE_BRICK);
        addDrop(ModBlocks.BROWN_BRICK);
        addDrop(ModBlocks.YELLOW_BRICK);
        addDrop(ModBlocks.LIME_BRICK);
        addDrop(ModBlocks.GREEN_BRICK);
        addDrop(ModBlocks.LIGHT_BLUE_BRICK);
        addDrop(ModBlocks.CYAN_BRICK);
        addDrop(ModBlocks.BLUE_BRICK);
        addDrop(ModBlocks.PURPLE_BRICK);
        addDrop(ModBlocks.MAGENTA_BRICK);
        addDrop(ModBlocks.PINK_BRICK);

        addDrop(ModBlocks.WHITE_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_GRAY_BRICK_STAIRS);
        addDrop(ModBlocks.GRAY_BRICK_STAIRS);
        addDrop(ModBlocks.BLACK_BRICK_STAIRS);
        addDrop(ModBlocks.ORANGE_BRICK_STAIRS);
        addDrop(ModBlocks.BROWN_BRICK_STAIRS);
        addDrop(ModBlocks.YELLOW_BRICK_STAIRS);
        addDrop(ModBlocks.LIME_BRICK_STAIRS);
        addDrop(ModBlocks.GREEN_BRICK_STAIRS);
        addDrop(ModBlocks.CYAN_BRICK_STAIRS);
        addDrop(ModBlocks.LIGHT_BLUE_BRICK_STAIRS);
        addDrop(ModBlocks.BLUE_BRICK_STAIRS);
        addDrop(ModBlocks.PURPLE_BRICK_STAIRS);
        addDrop(ModBlocks.MAGENTA_BRICK_STAIRS);
        addDrop(ModBlocks.PINK_BRICK_STAIRS);

        addDrop(
            ModBlocks.WHITE_BRICK_SLAB,
            slabDrops(ModBlocks.WHITE_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.LIGHT_GRAY_BRICK_SLAB,
            slabDrops(ModBlocks.LIGHT_GRAY_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.GRAY_BRICK_SLAB,
            slabDrops(ModBlocks.GRAY_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.BLACK_BRICK_SLAB,
            slabDrops(ModBlocks.BLACK_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.ORANGE_BRICK_SLAB,
            slabDrops(ModBlocks.ORANGE_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.BROWN_BRICK_SLAB,
            slabDrops(ModBlocks.BROWN_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.YELLOW_BRICK_SLAB,
            slabDrops(ModBlocks.YELLOW_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.LIME_BRICK_SLAB,
            slabDrops(ModBlocks.LIME_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.GREEN_BRICK_SLAB,
            slabDrops(ModBlocks.GREEN_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.CYAN_BRICK_SLAB,
            slabDrops(ModBlocks.CYAN_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.LIGHT_BLUE_BRICK_SLAB,
            slabDrops(ModBlocks.LIGHT_BLUE_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.BLUE_BRICK_SLAB,
            slabDrops(ModBlocks.BLUE_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.PURPLE_BRICK_SLAB,
            slabDrops(ModBlocks.PURPLE_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.WHITE_BRICK_SLAB,
            slabDrops(ModBlocks.MAGENTA_BRICK_SLAB)
        );
        addDrop(
            ModBlocks.WHITE_BRICK_SLAB,
            slabDrops(ModBlocks.PINK_BRICK_SLAB)
        );

        addDrop(ModBlocks.WHITE_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_GRAY_BRICK_WALL);
        addDrop(ModBlocks.GRAY_BRICK_WALL);
        addDrop(ModBlocks.BLACK_BRICK_WALL);
        addDrop(ModBlocks.ORANGE_BRICK_WALL);
        addDrop(ModBlocks.BROWN_BRICK_WALL);
        addDrop(ModBlocks.YELLOW_BRICK_WALL);
        addDrop(ModBlocks.LIME_BRICK_WALL);
        addDrop(ModBlocks.GREEN_BRICK_WALL);
        addDrop(ModBlocks.CYAN_BRICK_WALL);
        addDrop(ModBlocks.LIGHT_BLUE_BRICK_WALL);
        addDrop(ModBlocks.BLUE_BRICK_WALL);
        addDrop(ModBlocks.PURPLE_BRICK_WALL);
        addDrop(ModBlocks.MAGENTA_BRICK_WALL);
        addDrop(ModBlocks.PINK_BRICK_WALL);

        addDrop(ModBlocks.MOSSY_STONE);
        addDrop(
            ModBlocks.MOSSY_STONE_SLAB,
            slabDrops(ModBlocks.MOSSY_STONE_SLAB)
        );
    }
}
