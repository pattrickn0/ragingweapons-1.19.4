package ragingweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ragingweapons.RagingWeapons;

public class ModItems {
    public static final Item TITANIUM_RAW = registerItem("titanium_raw",
            new Item(new FabricItemSettings()));

    public static final Item TITANIUM = registerItem("titanium_ingot",
            new Item(new FabricItemSettings()));

    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings()));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RagingWeapons.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, TITANIUM);
        addToItemGroup(ItemGroups.INGREDIENTS, TITANIUM_RAW);
        addToItemGroup(ItemGroups.INGREDIENTS, TITANIUM_NUGGET);

        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_RAW);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_NUGGET);

    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        RagingWeapons.LOGGER.info("Registering Mod Items for " + RagingWeapons.MOD_ID);

        addItemsToItemGroup();
    }


}
