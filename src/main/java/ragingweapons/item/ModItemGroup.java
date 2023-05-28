package ragingweapons.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;
import ragingweapons.RagingWeapons;

public class ModItemGroup {
    public static ItemGroup RagingGroup;

    public static  void registerItemGroups() {
        RagingGroup = FabricItemGroup.builder(new Identifier((RagingWeapons.MOD_ID),"titanium"))
                .displayName(Text.literal("Raging Weapons"))
                .icon(() -> new ItemStack(ModItems.TITANIUM))
                .build();
    }
}
