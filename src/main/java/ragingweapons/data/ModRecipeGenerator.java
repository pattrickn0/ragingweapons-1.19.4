package ragingweapons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;
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
        offerSmelting(exporter, List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.TITANIUM_RAW), RecipeCategory.MISC, ModItems.TITANIUM,
                0.8f, 300, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.TITANIUM_RAW), RecipeCategory.MISC, ModItems.TITANIUM,
                0.8f, 150, "titanium");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.TITANIUM, RecipeCategory.DECORATIONS, ModBlocks.TITANIUM_BLOCK);

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM)
                .pattern("XXX")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.TITANIUM_NUGGET)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM_NUGGET),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM_NUGGET))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_NUGGET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM_NUGGET, 9)
                .pattern("   ")
                .pattern(" X ")
                .pattern("   ")
                .input('X', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_RAW)));


    }
}
