package ragingweapons;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import ragingweapons.data.ModLootTableGenerator;
import ragingweapons.data.ModModelProvider;
import ragingweapons.data.ModRecipeGenerator;
import ragingweapons.data.ModWorldGeneration;

public class RagingWeaponsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider((ModLootTableGenerator::new));
        pack.addProvider((ModRecipeGenerator::new));
        pack.addProvider((ModModelProvider::new));
        pack.addProvider((ModWorldGeneration::new));

    }
}
