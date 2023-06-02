package ragingweapons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.recipe.book.RecipeCategory;
import ragingweapons.block.ModBlocks;
import ragingweapons.item.ModItems;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeGenerator extends FabricRecipeProvider {
    public ModRecipeGenerator(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, List.of(ModItems.TITANIUM_RAW), RecipeCategory.MISC, ModItems.TITANIUM, 0.8f, 300, "titanium");
        offerSmelting(exporter, List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), RecipeCategory.MISC, ModItems.TITANIUM, 0.8f, 300, "titanium");
        offerSmelting(exporter, List.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC, ModItems.TITANIUM, 0.8f, 300, "titanium");
        offerBlasting(exporter, List.of(ModItems.TITANIUM_RAW), RecipeCategory.MISC, ModItems.TITANIUM, 0.8f, 150, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.DEEPSLATE_TITANIUM_ORE), RecipeCategory.MISC, ModItems.TITANIUM, 0.8f, 150, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.TITANIUM_ORE), RecipeCategory.MISC, ModItems.TITANIUM, 0.8f, 150, "titanium");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);
    }
}
