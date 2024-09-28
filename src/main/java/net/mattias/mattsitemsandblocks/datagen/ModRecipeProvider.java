package net.mattias.mattsitemsandblocks.datagen;

import net.mattias.mattsitemsandblocks.MattsItemsBlocks;
import net.mattias.mattsitemsandblocks.block.ModBlocks;
import net.mattias.mattsitemsandblocks.datagen.loot.ModBlockLootTables;
import net.mattias.mattsitemsandblocks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import java.util.List;
import java.util.function.Consumer;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {


    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(Consumer<FinishedRecipe> pWriter) {

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACK_STONE_BRICKS.get(), 4)
                .pattern("  ")
                .pattern("BB")
                .pattern("BB")
                .define('B', Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_BRICKS.get(), 4)
                .pattern("  ")
                .pattern("BB")
                .pattern("BB")
                .define('B', Items.COPPER_BLOCK)
                .unlockedBy(getHasName(Items.COPPER_BLOCK), has(Items.COPPER_BLOCK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get(), 4)
                .pattern("  ")
                .pattern("BB")
                .pattern("BB")
                .define('B', Items.OXIDIZED_CUT_COPPER)
                .unlockedBy(getHasName(Items.OXIDIZED_CUT_COPPER), has(Items.OXIDIZED_CUT_COPPER))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.NETHERRACK_BRICKS.get(), 4)
                .pattern("  ")
                .pattern("BB")
                .pattern("BB")
                .define('B', Items.NETHERRACK)
                .unlockedBy(getHasName(Items.NETHERRACK), has(Items.NETHERRACK))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ENDER_PEARL_BLOCK.get(), 1)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.ENDER_PEARL)
                .unlockedBy(getHasName(Items.ENDER_PEARL), has(Items.ENDER_PEARL))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.ROTTEN_FLESH_BLOCK.get(), 1)
                .pattern("BBB")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.ROTTEN_FLESH)
                .unlockedBy(getHasName(Items.ROTTEN_FLESH), has(Items.ROTTEN_FLESH))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("BBB")
                .define('B', Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_WALL.get(), 6)
                .pattern("   ")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_BUTTON.get())
                .pattern("   ")
                .pattern("   ")
                .pattern("B  ")
                .define('B', Items.BLACKSTONE)
                .unlockedBy(getHasName(Items.BLACKSTONE), has(Items.BLACKSTONE))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_BRICKS_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', ModBlocks.BLACK_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_STONE_BRICKS.get()), has(ModBlocks.BLACK_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_BRICKS_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("BBB")
                .define('B', ModBlocks.BLACK_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_STONE_BRICKS.get()), has(ModBlocks.BLACK_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_BRICKS_WALL.get(), 6)
                .pattern("   ")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.BLACK_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_STONE_BRICKS.get()), has(ModBlocks.BLACK_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.BLACKSTONE_BRICKS_BUTTON.get())
                .pattern("  ")
                .pattern("  ")
                .pattern("B ")
                .define('B', ModBlocks.BLACK_STONE_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.BLACK_STONE_BRICKS.get()), has(ModBlocks.BLACK_STONE_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXIDIZED_CUT_COPPER_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()), has(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("BBB")
                .define('B', ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get()), has(ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXIDIZED_CUT_COPPER_WALL.get(), 6)
                .pattern("   ")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()), has(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.OXIDIZED_CUT_COPPER_BUTTON.get())
                .pattern("  ")
                .pattern("  ")
                .pattern("B ")
                .define('B', ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()), has(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_STAIRS.get(), 4)
                .pattern("B  ")
                .pattern("BB ")
                .pattern("BBB")
                .define('B', ModBlocks.COPPER_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.COPPER_BRICKS.get()), has(ModBlocks.COPPER_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_SLAB.get(), 6)
                .pattern("   ")
                .pattern("   ")
                .pattern("BBB")
                .define('B', ModBlocks.COPPER_SLAB.get())
                .unlockedBy(getHasName(ModBlocks.COPPER_SLAB.get()), has(ModBlocks.COPPER_SLAB.get()))
                .save(pWriter);


        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_WALL.get(), 6)
                .pattern("   ")
                .pattern("BBB")
                .pattern("BBB")
                .define('B', ModBlocks.COPPER_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.COPPER_BRICKS.get()), has(ModBlocks.COPPER_BRICKS.get()))
                .save(pWriter);

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModBlocks.COPPER_BUTTON.get())
                .pattern("  ")
                .pattern("  ")
                .pattern("B ")
                .define('B', ModBlocks.COPPER_BRICKS.get())
                .unlockedBy(getHasName(ModBlocks.COPPER_BRICKS.get()), has(ModBlocks.COPPER_BRICKS.get()))
                .save(pWriter);








        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ENDER_PEARL, 9)
                .requires(ModBlocks.ENDER_PEARL_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ENDER_PEARL_BLOCK.get()), has(ModBlocks.ENDER_PEARL_BLOCK.get()))
                .save(pWriter);

        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, Items.ROTTEN_FLESH, 9)
                .requires(ModBlocks.ROTTEN_FLESH_BLOCK.get())
                .unlockedBy(getHasName(ModBlocks.ROTTEN_FLESH_BLOCK.get()), has(ModBlocks.ROTTEN_FLESH_BLOCK.get()))
                .save(pWriter);



    }





    protected static void oreSmelting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTIme, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTIme, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(Consumer<FinishedRecipe> pFinishedRecipeConsumer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pFinishedRecipeConsumer, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    protected static void oreCooking(Consumer<FinishedRecipe> pFinishedRecipeConsumer, RecipeSerializer<? extends AbstractCookingRecipe> pCookingSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pRecipeName) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult,
                            pExperience, pCookingTime, pCookingSerializer)
                    .group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike))
                    .save(pFinishedRecipeConsumer,  MattsItemsBlocks.MOD_ID + ":" + getItemName(pResult) + pRecipeName + "_" + getItemName(itemlike));
        }
    }
}