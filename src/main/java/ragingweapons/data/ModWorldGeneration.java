package ragingweapons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricDynamicRegistryProvider;
import net.minecraft.registry.RegistryWrapper;
import ragingweapons.RagingWeapons;

import java.util.concurrent.CompletableFuture;

public class ModWorldGeneration extends FabricDynamicRegistryProvider {
    public ModWorldGeneration(FabricDataOutput output, CompletableFuture<RegistryWrapper.WrapperLookup> registriesFuture) {
        super(output, registriesFuture);
    }

    @Override
    protected void configure(RegistryWrapper.WrapperLookup registries, Entries entries) {
          //WORLD GENERATION
    }

    @Override
    public String getName() {
        return RagingWeapons.MOD_ID;
    }
}