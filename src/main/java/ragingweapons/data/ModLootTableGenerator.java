package ragingweapons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricBlockLootTableProvider;
import ragingweapons.block.ModBlocks;
import ragingweapons.item.ModItems;

public class ModLootTableGenerator extends FabricBlockLootTableProvider {
    public ModLootTableGenerator(FabricDataOutput dataOutput) {
        super(dataOutput);
    }

    @Override
    public void generate() {
        oreDrops(ModBlocks.TITANIUM_ORE, ModItems.TITANIUM_RAW);
        oreDrops(ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.TITANIUM_RAW);

        addDrop(ModBlocks.TITANIUM_BLOCK);
    }
}
