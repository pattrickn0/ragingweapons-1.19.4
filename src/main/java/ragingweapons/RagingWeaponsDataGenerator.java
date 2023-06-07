package ragingweapons;

import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;
import net.minecraft.registry.RegistryBuilder;
import net.minecraft.registry.RegistryKeys;
import ragingweapons.data.ModLootTableGenerator;
import ragingweapons.data.ModModelProvider;
import ragingweapons.data.ModRecipeGenerator;
import ragingweapons.data.ModWorldGeneration;
import ragingweapons.world.ModConfiguredFeatures;
import ragingweapons.world.ModPlacedFeatures;

public class RagingWeaponsDataGenerator implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator fabricDataGenerator) {
        FabricDataGenerator.Pack pack = fabricDataGenerator.createPack();

        pack.addProvider((ModLootTableGenerator::new));
        pack.addProvider((ModRecipeGenerator::new));
        pack.addProvider((ModModelProvider::new));
        pack.addProvider((ModWorldGeneration::new));
    }
    @Override
    public void buildRegistry(RegistryBuilder registryBuilder) {
        registryBuilder.addRegistry(RegistryKeys.CONFIGURED_FEATURE, ModConfiguredFeatures::bootstrap);
        registryBuilder.addRegistry(RegistryKeys.PLACED_FEATURE, ModPlacedFeatures::bootstrap);
    }
}
