package net.kitnox.buckleytesting.util;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.ItemTags;
import net.minecraft.tags.TagKey;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;

public class ModTags {
    public static class Items{
        private static TagKey<Item> tag(String name){
            return ItemTags.create(new ResourceLocation(BuckleyTestingMod.MODID, name));
        }
        private static TagKey<Item> forgeTag(String name){
            return ItemTags.create(new ResourceLocation("forge", name));
        }
    }
    public static class Blocks{

        public static final TagKey<Block> METAL_DETECTOR_HORSERITE = tag("metal_detector_horserite");
        public static final TagKey<Block> NEEDS_HORSERITE_TOOL = tag("needs_horserite_tool");
        public static final TagKey<Block> PAXEL_MINEABLE = tag("mineable/paxel");

        private static TagKey<Block> tag(String name){
            return BlockTags.create(new ResourceLocation(BuckleyTestingMod.MODID, name));
        }
        private static TagKey<Block> forgeTag(String name){
            return BlockTags.create(new ResourceLocation("forge", name));
        }
    }
}
