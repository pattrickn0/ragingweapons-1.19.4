package ragingweapons;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ragingweapons.block.ModBlocks;
import ragingweapons.item.ModItemGroup;
import ragingweapons.item.ModItems;

public class RagingWeapons implements ModInitializer {
    public static final String MOD_ID = "ragingweapons";
    public static final Logger LOGGER = LoggerFactory.getLogger("ragingweapons");

    @Override
    public void onInitialize() {
        ModBlocks.registerModBlocks();
        ModItemGroup.registerItemGroups();
        ModItems.registerModItems();
        LOGGER.info("Hello Fabric world!");
    }
}