package ragingweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ragingweapons.RagingWeapons;

public class ModItems {
    public static final Item TITANIUM_RAW = registerItem("titanium_raw",
            new Item(new FabricItemSettings().group(ModItemGroup.RAGING_WEAPONS)));

    public static final Item TITANIUM = registerItem("titanium",
            new Item(new FabricItemSettings().group(ModItemGroup.RAGING_WEAPONS)));

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RagingWeapons.MOD_ID))
    }

    public static void registerItems() {
        RagingWeapons.LOGGER.info("Registering Mod Items for " + RagingWeapons.MOD_ID);
    }
}
