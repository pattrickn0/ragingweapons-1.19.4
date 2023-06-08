package ragingweapons.data;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.item.Items;
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
                0.8f, 280, "titanium");
        offerBlasting(exporter, List.of(ModBlocks.TITANIUM_ORE, ModBlocks.DEEPSLATE_TITANIUM_ORE, ModItems.TITANIUM_RAW), RecipeCategory.MISC, ModItems.TITANIUM,
                0.8f, 120, "titanium");
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

        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.TITANIUM, 9)
                .pattern("   ")
                .pattern(" X ")
                .pattern("   ")
                .input('X', ModBlocks.TITANIUM_BLOCK)
                .criterion(FabricRecipeProvider.hasItem(ModBlocks.TITANIUM_BLOCK),
                        FabricRecipeProvider.conditionsFromItem(ModBlocks.TITANIUM_BLOCK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM2)));
        //TOOLS
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SWORD, 1)
                .pattern(" X ")
                .pattern(" X ")
                .pattern(" A ")
                .input('X', ModItems.TITANIUM)
                .input('A', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_SWORD)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_AXE, 1)
                .pattern("XX ")
                .pattern("XA ")
                .pattern(" A ")
                .input('X', ModItems.TITANIUM)
                .input('A', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_AXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_PICKAXE, 1)
                .pattern("XXX")
                .pattern(" A ")
                .pattern(" A ")
                .input('X', ModItems.TITANIUM)
                .input('A', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_PICKAXE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_SHOVEL, 1)
                .pattern(" X ")
                .pattern(" A ")
                .pattern(" A ")
                .input('X', ModItems.TITANIUM)
                .input('A', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_SHOVEL)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HOE, 1)
                .pattern("XX ")
                .pattern(" A ")
                .pattern(" A ")
                .input('X', ModItems.TITANIUM)
                .input('A', Items.STICK)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .criterion(FabricRecipeProvider.hasItem(Items.STICK),
                        FabricRecipeProvider.conditionsFromItem(Items.STICK))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_HOE)));
        //ARMOR
        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_HELMET, 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("   ")
                .input('X', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_HELMET)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_CHESTPLATE, 1)
                .pattern("X X")
                .pattern("XXX")
                .pattern("XXX")
                .input('X', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_CHESTPLATE)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_LEGGINGS, 1)
                .pattern("XXX")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_LEGGINGS)));

        ShapedRecipeJsonBuilder.create(RecipeCategory.TOOLS, ModItems.TITANIUM_BOOTS, 1)
                .pattern("   ")
                .pattern("X X")
                .pattern("X X")
                .input('X', ModItems.TITANIUM)
                .criterion(FabricRecipeProvider.hasItem(ModItems.TITANIUM),
                        FabricRecipeProvider.conditionsFromItem(ModItems.TITANIUM))
                .offerTo(exporter, new Identifier(FabricRecipeProvider.getRecipeName(ModItems.TITANIUM_BOOTS)));


    }
}
