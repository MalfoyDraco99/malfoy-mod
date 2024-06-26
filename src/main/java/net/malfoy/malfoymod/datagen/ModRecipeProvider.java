package net.malfoy.malfoymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricRecipeProvider;
import net.malfoy.malfoymod.block.ModBlocks;
import net.malfoy.malfoymod.item.ModItems;
import net.minecraft.data.server.recipe.RecipeJsonProvider;
import net.minecraft.data.server.recipe.ShapedRecipeJsonBuilder;
import net.minecraft.data.server.recipe.ShapelessRecipeJsonBuilder;
import net.minecraft.item.ItemConvertible;
import net.minecraft.item.Items;
import net.minecraft.recipe.Ingredient;
import net.minecraft.recipe.Recipe;
import net.minecraft.recipe.book.RecipeCategory;
import net.minecraft.util.Identifier;

import java.awt.*;
import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends FabricRecipeProvider {
    private static final List<ItemConvertible> RUBY_SMELTABLES = List.of(ModItems.RAW_RUBY,
            ModBlocks.DEEPSLATE_RUBY_ORE,
            ModBlocks.NETHER_RUBY_ORE,
            ModBlocks.END_STONE_RUBY_ORE,
            ModBlocks.RUBY_ORE);
    public ModRecipeProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generate(Consumer<RecipeJsonProvider> exporter) {
        offerSmelting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,2.0f,200, "ruby");
        offerBlasting(exporter, RUBY_SMELTABLES, RecipeCategory.MISC, ModItems.RUBY,3.0f,100, "ruby");
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS, ModItems.RUBY,RecipeCategory.DECORATIONS,ModBlocks.RUBY_BLOCK);
        offerReversibleCompactingRecipes(exporter, RecipeCategory.BUILDING_BLOCKS,ModItems.URANIUM_INGOT,RecipeCategory.DECORATIONS,ModBlocks.URANIUM_BLOCK);
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.RAW_RUBY,1)
                .pattern("SSS")
                .pattern("SRS")
                .pattern("SSS")
                .input('S', Items.STONE)
                .input('R',ModItems.RUBY)
                .criterion(hasItem(Items.STONE),conditionsFromItem(Items.STONE))
                .criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.RAW_RUBY)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC, ModItems.METAL_DETECTOR,1)
                .pattern("C R")
                .pattern(" S ")
                .pattern("  D")
                .input('C',Items.COMPASS)
                .input('R', ModItems.RUBY)
                .input('S', Items.STICK)
                .input('D',Items.REDSTONE)
                .criterion(hasItem(Items.COMPASS),conditionsFromItem(Items.COMPASS))
                .criterion(hasItem(Items.STICK),conditionsFromItem(Items.STICK))
                .criterion(hasItem(Items.REDSTONE),conditionsFromItem(Items.REDSTONE))
                .criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.METAL_DETECTOR)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.BUILDING_BLOCKS,ModBlocks.ASBESTOS_BLOCK,1)
                .pattern("##")
                .pattern("##")
                .input('#',ModItems.ASBESTOS)
                .criterion(hasItem(ModItems.ASBESTOS),conditionsFromItem(ModItems.ASBESTOS))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.ASBESTOS_BLOCK)));
        ShapedRecipeJsonBuilder.create(RecipeCategory.FOOD,ModItems.ASBESTOS_BURGER,1)
                .pattern("###")
                .pattern("MAM")
                .pattern("###")
                .input('#',Items.BREAD)
                .input('M',Items.MILK_BUCKET)
                .input('A',ModItems.ASBESTOS)
                .criterion(hasItem(ModItems.ASBESTOS),conditionsFromItem(ModItems.ASBESTOS))
                .offerTo(exporter,new Identifier(getRecipeName(ModItems.ASBESTOS_BURGER)));

        createDoorRecipe(ModBlocks.RUBY_DOOR, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RUBY_DOOR)));
        createFenceRecipe(ModBlocks.RUBY_FENCE, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RUBY_FENCE)));
        createPressurePlateRecipe(RecipeCategory.REDSTONE,ModBlocks.RUBY_PRESSURE_PLATE, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RUBY_PRESSURE_PLATE)));
        createSlabRecipe(RecipeCategory.MISC, ModBlocks.RUBY_SLAB, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RUBY_SLAB)));
        createTrapdoorRecipe(ModBlocks.RUBY_TRAPDOOR, Ingredient.ofItems(ModItems.RUBY)).criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RUBY_TRAPDOOR)));


        ShapedRecipeJsonBuilder.create(RecipeCategory.MISC,ModBlocks.RUBY_WALL,6)
                .pattern("###")
                .pattern("###")
                .input('#', ModItems.RUBY)
                .criterion(hasItem(ModItems.RUBY),conditionsFromItem(ModItems.RUBY))
                .offerTo(exporter,new Identifier(getRecipeName(ModBlocks.RUBY_WALL)));

        offerShapelessRecipe(exporter, ModBlocks.RUBY_BUTTON, ModItems.RUBY, "ruby_button" , 1);
    }
}
