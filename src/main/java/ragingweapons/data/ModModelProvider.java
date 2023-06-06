package ragingweapons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;
import ragingweapons.block.ModBlocks;
import ragingweapons.item.ModItems;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_BLOCK);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.TITANIUM_ORE);
        blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.DEEPSLATE_TITANIUM_ORE);

    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.TITANIUM, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_RAW, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_NUGGET, Models.GENERATED);
        itemModelGenerator.register(ModItems.TITANIUM_SWORD, Models.HANDHELD);
        itemModelGenerator.register(ModItems.TITANIUM_PICKAXE, Models.HANDHELD);


    }
}
