package dev.edonme.blokkusus;

import net.fabricmc.api.ModInitializer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Blokkusus implements ModInitializer {

    public static final String MOD_ID = "blokkusus";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
        ItemGroup.registerItemGroups();

        LOGGER.info("====Blokkusus====");
        LOGGER.info("Hello Everynyan! Im Blokynyansus! ");
        LOGGER.info("=================");
    }
}
