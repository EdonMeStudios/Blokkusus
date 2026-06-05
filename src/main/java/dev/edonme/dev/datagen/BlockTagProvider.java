package dev.edonme.dev.datagen;

import dev.edonme.dev.Blocks;
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
        getTagBuilder(BlockTags.PICKAXE_MINEABLE)
            .add(Registries.BLOCK.getId(Blocks.WHITE_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.LIGHT_GRAY_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.GRAY_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.RED_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.ORANGE_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.BROWN_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.YELLOW_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.LIME_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.GREEN_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.LIGHT_BLUE_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.BLUE_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.PURPLE_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.MAGENTA_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.PINK_AND_BLACK_TILE))
            .add(Registries.BLOCK.getId(Blocks.GREEN_CHROMA_KEY))
            .add(Registries.BLOCK.getId(Blocks.BLUE_CHROMA_KEY))
            .add(Registries.BLOCK.getId(Blocks.RED_CHROMA_KEY));
    }
}
