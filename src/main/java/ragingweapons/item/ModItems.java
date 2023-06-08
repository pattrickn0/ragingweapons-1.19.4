package ragingweapons.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ragingweapons.RagingWeapons;
import ragingweapons.item.custom.TitaniumArmorItem;

public class ModItems {
    public static final Item TITANIUM_RAW = registerItem("titanium_raw",
            new Item(new FabricItemSettings()));
    public static final Item TITANIUM = registerItem("titanium_ingot",
            new Item(new FabricItemSettings()));
    public static final Item TITANIUM_NUGGET = registerItem("titanium_nugget",
            new Item(new FabricItemSettings()));

    public static final Item TITANIUM_SWORD = registerItem("titanium_sword",
            new SwordItem(ModToolMaterials.TITANIUM,-1, -2.4f, new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM_AXE = registerItem("titanium_axe",
            new AxeItem(ModToolMaterials.TITANIUM,2, -3.1f, new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM_PICKAXE = registerItem("titanium_pickaxe",
            new PickaxeItem(ModToolMaterials.TITANIUM,-3, -2.8f, new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM_SHOVEL = registerItem("titanium_shovel",
            new ShovelItem(ModToolMaterials.TITANIUM,-2, -3f, new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM_HOE = registerItem("titanium_hoe",
            new HoeItem(ModToolMaterials.TITANIUM,-7, -1f, new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM_BOOTS = registerItem("titanium_boots",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.BOOTS, new FabricItemSettings().maxCount(1)));
    public static final Item TITANIUM_LEGGINGS = registerItem("titanium_leggings",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.LEGGINGS, new FabricItemSettings().maxCount(1)));
    public static final Item TITANIUM_CHESTPLATE = registerItem("titanium_chestplate",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.CHESTPLATE, new FabricItemSettings().maxCount(1)));
    public static final Item TITANIUM_HELMET = registerItem("titanium_helmet",
            new TitaniumArmorItem(ModArmorMaterials.TITANIUM, ArmorItem.Type.HELMET, new FabricItemSettings().maxCount(1)));

    public static final Item TITANIUM2 = registerItem("titanium2",
            new Item(new FabricItemSettings()));



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(RagingWeapons.MOD_ID, name), item);
    }

    public static void addItemsToItemGroup() {
        addToItemGroup(ItemGroups.INGREDIENTS, TITANIUM);
        addToItemGroup(ItemGroups.INGREDIENTS, TITANIUM_RAW);
        addToItemGroup(ItemGroups.INGREDIENTS, TITANIUM_NUGGET);

        addToItemGroup(ItemGroups.COMBAT, TITANIUM_SWORD);
        addToItemGroup(ItemGroups.TOOLS, TITANIUM_AXE);
        addToItemGroup(ItemGroups.TOOLS, TITANIUM_PICKAXE);
        addToItemGroup(ItemGroups.TOOLS, TITANIUM_SHOVEL);
        addToItemGroup(ItemGroups.TOOLS, TITANIUM_HOE);

        addToItemGroup(ItemGroups.COMBAT, TITANIUM_BOOTS);
        addToItemGroup(ItemGroups.COMBAT, TITANIUM_LEGGINGS);
        addToItemGroup(ItemGroups.COMBAT, TITANIUM_CHESTPLATE);
        addToItemGroup(ItemGroups.COMBAT, TITANIUM_HELMET);

        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_RAW);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_NUGGET);

        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_SWORD);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_AXE);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_PICKAXE);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_SHOVEL);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_HOE);

        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_BOOTS);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_LEGGINGS);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_CHESTPLATE);
        addToItemGroup(ModItemGroup.RagingGroup, TITANIUM_HELMET);


    }

    private static void addToItemGroup(ItemGroup group, Item item) {
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
    }

    public static void registerModItems() {
        RagingWeapons.LOGGER.info("Registering Mod Items for " + RagingWeapons.MOD_ID);

        addItemsToItemGroup();
    }


}
