package ragingweapons.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.ExperienceDroppingBlock;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import ragingweapons.RagingWeapons;
import ragingweapons.item.ModItemGroup;

public class ModBlocks {

    public static final Block TITANIUM_ORE = registerBlock("titanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).hardness(5).resistance(6).requiresTool()), ModItemGroup.RagingGroup);
    public static final Block DEEPSLATE_TITANIUM_ORE = registerBlock("deepslate_titanium_ore",
            new ExperienceDroppingBlock(FabricBlockSettings.of(Material.STONE).hardness(6).resistance(6).requiresTool()), ModItemGroup.RagingGroup);
    public static final Block TITANIUM_BLOCK = registerBlock("titanium_block",
            new Block(FabricBlockSettings.of(Material.METAL).hardness(5).resistance(8).requiresTool()), ModItemGroup.RagingGroup);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registries.BLOCK, new Identifier(RagingWeapons.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group) {
        Item item = Registry.register(Registries.ITEM, new Identifier(RagingWeapons.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings()));
        ItemGroupEvents.modifyEntriesEvent(group).register(entries -> entries.add(item));
        return item;
    }

    public static void registerModBlocks() {
        RagingWeapons.LOGGER.info("Registering ModBlocks for " + RagingWeapons.MOD_ID);
    }
}
