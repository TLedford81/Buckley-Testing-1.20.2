package net.kitnox.buckleytesting.datagen;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.item.ModItems;
import net.kitnox.buckleytesting.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.data.tags.ItemTagsProvider;
import net.minecraft.tags.ItemTags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModItemTagGenerator extends ItemTagsProvider {
    public ModItemTagGenerator(PackOutput pOutput, CompletableFuture<HolderLookup.Provider> pLookupProvider, CompletableFuture<TagLookup<Block>> pBlockTags, @Nullable ExistingFileHelper existingFileHelper) {
        super(pOutput, pLookupProvider, pBlockTags, BuckleyTestingMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ItemTags.TRIMMABLE_ARMOR)
                .add(ModItems.HORSERITE_HELMET.get())
                .add(ModItems.HORSERITE_CHESTPLATE.get())
                .add(ModItems.HORSERITE_LEGGINGS.get())
                .add(ModItems.HORSERITE_BOOTS.get());
    }

    @Override
    public String getName() {
        return "Item Tags";
    }
}
