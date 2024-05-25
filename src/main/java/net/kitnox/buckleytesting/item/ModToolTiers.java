package net.kitnox.buckleytesting.item;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.util.ModTags;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Tier;
import net.minecraft.world.item.Tiers;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;
import net.minecraftforge.common.TierSortingRegistry;

import java.util.List;

public class ModToolTiers {
    public static final Tier HORSERITE = TierSortingRegistry.registerTier(
            new ForgeTier(3, 450, 12f, 3.0f, 10,
                    ModTags.Blocks.NEEDS_HORSERITE_TOOL, () -> Ingredient.of(ModItems.HORSERITE.get())),
            new ResourceLocation(BuckleyTestingMod.MODID, "horserite"), List.of(Tiers.IRON), List.of(Tiers.DIAMOND));

}
