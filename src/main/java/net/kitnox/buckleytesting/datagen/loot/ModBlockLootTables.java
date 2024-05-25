package net.kitnox.buckleytesting.datagen.loot;

import net.kitnox.buckleytesting.block.ModBlocks;
import net.kitnox.buckleytesting.item.ModItems;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {
        this.dropSelf(ModBlocks.HORSERITE_BLOCK.get());
        this.dropSelf(ModBlocks.SOUND_BLOCK.get());
        this.dropSelf(ModBlocks.HORSERITE_STAIRS.get());
        this.dropSelf(ModBlocks.HORSERITE_BUTTON.get());
        this.dropSelf(ModBlocks.HORSERITE_PRESSURE_PLATE.get());
        this.dropSelf(ModBlocks.HORSERITE_WALL.get());
        this.dropSelf(ModBlocks.HORSERITE_FENCE.get());
        this.dropSelf(ModBlocks.HORSERITE_FENCE_GATE.get());
//        this.dropSelf(ModBlocks.HORSERITE_TRAPDOOR.get());
//        this.dropSelf(ModBlocks.HORSE_CREPE.get());
        this.dropSelf(ModBlocks.HAY_RACK_BLACK.get());

//        this.add(ModBlocks.HORSERITE_DOOR.get(), block -> createDoorTable(ModBlocks.HORSERITE_DOOR.get()));
        this.add(ModBlocks.HORSERITE_SLAB.get(), block -> createSlabItemTable(ModBlocks.HORSERITE_SLAB.get()));

        this.add(ModBlocks.RAW_HORSERITE_BLOCK.get(), block -> createOreDrop(ModBlocks.RAW_HORSERITE_BLOCK.get(), ModItems.RAW_HORSERITE.get()));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}
