package net.kitnox.buckleytesting.datagen;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.block.ModBlocks;
import net.kitnox.buckleytesting.item.ModItems;
import net.minecraft.advancements.critereon.InventoryChangeTrigger;
import net.minecraft.advancements.critereon.ItemPredicate;
import net.minecraft.data.PackOutput;
import net.minecraft.data.recipes.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.crafting.AbstractCookingRecipe;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraft.world.item.crafting.RecipeSerializer;
import net.minecraft.world.level.ItemLike;
import net.minecraftforge.common.crafting.conditions.IConditionBuilder;

import javax.annotation.Nullable;
import java.util.List;

public class ModRecipeProvider extends RecipeProvider implements IConditionBuilder {
    private static final List<ItemLike> HORSERITE_SMELTABLES = List.of(
            ModItems.RAW_HORSERITE.get(),
            ModBlocks.RAW_HORSERITE_BLOCK.get());

    public ModRecipeProvider(PackOutput pOutput) {
        super(pOutput);
    }

    @Override
    protected void buildRecipes(RecipeOutput pRecipeOutput) {
        //Horserite Metal Detector

        ShapedRecipeBuilder.shaped(RecipeCategory.MISC, ModItems.METAL_DETECTOR.get())
                .pattern(" T ")
                .pattern("HSH")
                .pattern(" I ")
                .define('T', Items.REDSTONE_TORCH)
                .define('H', ModItems.HORSERITE.get())
                .define('S', Items.SCULK_SENSOR)
                .define('I', Items.IRON_INGOT)
                .unlockedBy("has_horserite", has(ModItems.HORSERITE.get()))
                .save(pRecipeOutput);
        //Sound Block
        ShapelessRecipeBuilder.shapeless(RecipeCategory.REDSTONE, ModBlocks.SOUND_BLOCK.get(), 1)
                .requires(ModItems.HORSERITE.get())
                .requires(Items.NOTE_BLOCK)
                .unlockedBy("has_horserite", has(ModBlocks.HORSERITE_BLOCK.get()))
                .save(pRecipeOutput);

        //Horserite Compression
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModBlocks.HORSERITE_BLOCK.get())
                .requires(ModItems.HORSERITE.get(), 9)
                .unlockedBy("has_horserite", has(ModItems.HORSERITE.get()))
                .save(pRecipeOutput);

        //Horserite Decompression
        ShapelessRecipeBuilder.shapeless(RecipeCategory.MISC, ModItems.HORSERITE.get(), 9)
                .requires(ModBlocks.HORSERITE_BLOCK.get())
                .unlockedBy("has_horserite", has(ModItems.HORSERITE.get()))
                .save(pRecipeOutput);

        //Horserite Smelting
        oreSmelting(pRecipeOutput, HORSERITE_SMELTABLES, RecipeCategory.MISC, ModItems.HORSERITE.get(), 0.25f, 200, "horserite");
        oreBlasting(pRecipeOutput, HORSERITE_SMELTABLES, RecipeCategory.MISC, ModItems.HORSERITE.get(), 0.25f, 100, "horserite");
    }

    //Custom Recipe Types

    protected static void oreSmelting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.SMELTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_smelting");
    }

    protected static void oreBlasting(RecipeOutput pRecipeOutput, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup) {
        oreCooking(pRecipeOutput, RecipeSerializer.BLASTING_RECIPE, pIngredients, pCategory, pResult, pExperience, pCookingTime, pGroup, "_from_blasting");
    }

    private static void oreCooking(RecipeOutput pRecipeOutput, RecipeSerializer<? extends AbstractCookingRecipe> pSerializer, List<ItemLike> pIngredients, RecipeCategory pCategory, ItemLike pResult, float pExperience, int pCookingTime, String pGroup, String pSuffix) {
        for(ItemLike itemlike : pIngredients) {
            SimpleCookingRecipeBuilder.generic(Ingredient.of(itemlike), pCategory, pResult, pExperience, pCookingTime, pSerializer).group(pGroup).unlockedBy(getHasName(itemlike), has(itemlike)).save(pRecipeOutput, BuckleyTestingMod.MODID + ":" + (pResult) + pSuffix + "_" + getItemName(itemlike));
        }

    }

}
