package ragingweapons.item;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import ragingweapons.RagingWeapons;
import ragingweapons.modid.RagingWeapons;

public class ModItemGroup {
    public static final ItemGroup RAGING_WEAPONS = FabricItemGroupBuilder.build
            (new Identifier(RagingWeapons.MOD_ID,"raging_weapons_group"), () -> new ItemStack(ModItems.TITANIUM));

}
