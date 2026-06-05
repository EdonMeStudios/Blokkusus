package dev.edonme.blokkusus.datagen;

import dev.edonme.blokkusus.ModBlocks;
import java.util.concurrent.CompletableFuture;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricTagProvider;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryWrapper;
import net.minecraft.registry.tag.BlockTags;

public class BlockTagProvider extends FabricTagProvider.BlockTagProvider {

    public BlockTagProvider(
        FabricDataOutput output,
        CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture
    ) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup wrapperLookup) {
        var builder = getTagBuilder(BlockTags.PICKAXE_MINEABLE);

        // Lista os blocos e converte cada um para o Identifier aceito pelo builder
        java.util.List.of(
            ModBlocks.WHITE_AND_BLACK_TILE,
            ModBlocks.LIGHT_GRAY_AND_BLACK_TILE,
            ModBlocks.GRAY_AND_BLACK_TILE,
            ModBlocks.RED_AND_BLACK_TILE,
            ModBlocks.ORANGE_AND_BLACK_TILE,
            ModBlocks.BROWN_AND_BLACK_TILE,
            ModBlocks.YELLOW_AND_BLACK_TILE,
            ModBlocks.LIME_AND_BLACK_TILE,
            ModBlocks.GREEN_AND_BLACK_TILE,
            ModBlocks.CYAN_AND_BLACK_TILE,
            ModBlocks.LIGHT_BLUE_AND_BLACK_TILE,
            ModBlocks.BLUE_AND_BLACK_TILE,
            ModBlocks.PURPLE_AND_BLACK_TILE,
            ModBlocks.MAGENTA_AND_BLACK_TILE,
            ModBlocks.PINK_AND_BLACK_TILE,
            ModBlocks.GREEN_CHROMA_KEY,
            ModBlocks.BLUE_CHROMA_KEY,
            ModBlocks.RED_CHROMA_KEY,
            ModBlocks.WHITE_BRICK,
            ModBlocks.LIGHT_GRAY_BRICK,
            ModBlocks.GRAY_BRICK,
            ModBlocks.BLACK_BRICK,
            ModBlocks.ORANGE_BRICK,
            ModBlocks.BROWN_BRICK,
            ModBlocks.YELLOW_BRICK,
            ModBlocks.LIME_BRICK,
            ModBlocks.GREEN_BRICK,
            ModBlocks.CYAN_BRICK,
            ModBlocks.LIGHT_BLUE_BRICK,
            ModBlocks.BLUE_BRICK,
            ModBlocks.PURPLE_BRICK,
            ModBlocks.MAGENTA_BRICK,
            ModBlocks.PINK_BRICK
        ).forEach(block -> builder.add(Registries.BLOCK.getId(block)));

        var Axebuilder = getTagBuilder(BlockTags.AXE_MINEABLE);

        java.util.List.of(
            ModBlocks.OAK_PLANKS_TABLE,
            ModBlocks.BIRCH_PLANKS_TABLE,
            ModBlocks.BAMBOO_PLANKS_TABLE,
            ModBlocks.CHERRY_PLANKS_TABLE,
            ModBlocks.CRIMSON_PLANKS_TABLE,
            ModBlocks.JUNGLE_PLANKS_TABLE,
            ModBlocks.MANGROVE_PLANKS_TABLE,
            ModBlocks.PALE_OAK_PLANKS_TABLE,
            ModBlocks.SPRUCE_PLANKS_TABLE,
            ModBlocks.WARPED_PLANKS_TABLE,
            ModBlocks.ACACIA_PLANKS_TABLE,
            ModBlocks.DARK_OAK_PLANKS_TABLE
        ).forEach(block -> Axebuilder.add(Registries.BLOCK.getId(block)));
    }
}
