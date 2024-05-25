package net.kitnox.buckleytesting.datagen;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.block.ModBlocks;
import net.kitnox.buckleytesting.util.ModTags;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, BuckleyTestingMod.MODID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {
        this.tag(ModTags.Blocks.METAL_DETECTOR_HORSERITE)
                .add(ModBlocks.RAW_HORSERITE_BLOCK.get(),
                        ModBlocks.HORSERITE_BLOCK.get(),
                        ModBlocks.HORSERITE_STAIRS.get(),
                        ModBlocks.HORSERITE_SLAB.get(),
                        ModBlocks.HORSERITE_FENCE.get(),
                        ModBlocks.HORSERITE_FENCE_GATE.get(),
                        ModBlocks.HORSERITE_WALL.get(),
                        ModBlocks.SOUND_BLOCK.get());

        this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.HORSERITE_BLOCK.get())
                .add(ModBlocks.RAW_HORSERITE_BLOCK.get())
                .add(ModBlocks.HORSERITE_FENCE_GATE.get())
                .add(ModBlocks.HORSERITE_FENCE.get())
                .add(ModBlocks.HORSERITE_WALL.get())
                .add(ModBlocks.HORSERITE_SLAB.get())
                .add(ModBlocks.HORSERITE_STAIRS.get());

        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.HORSERITE_BLOCK.get())
                .add(ModBlocks.RAW_HORSERITE_BLOCK.get())
                .add(ModBlocks.HORSERITE_FENCE.get())
                .add(ModBlocks.HORSERITE_FENCE_GATE.get())
                .add(ModBlocks.HORSERITE_WALL.get())
                .add(ModBlocks.HORSERITE_STAIRS.get())
                .add(ModBlocks.HORSERITE_SLAB.get());

        this.tag(ModTags.Blocks.PAXEL_MINEABLE)
                .addTags(BlockTags.MINEABLE_WITH_PICKAXE)
                .addTags(BlockTags.MINEABLE_WITH_AXE)
                .addTags(BlockTags.MINEABLE_WITH_SHOVEL);

        this.tag(BlockTags.FENCES)
                .add(ModBlocks.HORSERITE_FENCE.get());
        this.tag(BlockTags.WALLS)
                .add(ModBlocks.HORSERITE_WALL.get());
        this.tag(BlockTags.FENCE_GATES)
                .add(ModBlocks.HORSERITE_FENCE_GATE.get());
    }

    @Override
    public String getName() {
        return "Block Tags";
    }
}
