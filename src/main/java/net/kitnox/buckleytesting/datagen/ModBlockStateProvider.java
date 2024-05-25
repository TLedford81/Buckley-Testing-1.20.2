package net.kitnox.buckleytesting.datagen;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, BuckleyTestingMod.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.HORSERITE_BLOCK);
        blockWithItem(ModBlocks.RAW_HORSERITE_BLOCK);
        blockWithItem(ModBlocks.SOUND_BLOCK);

        stairsBlock((StairBlock) ModBlocks.HORSERITE_STAIRS.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));
        slabBlock((SlabBlock) ModBlocks.HORSERITE_SLAB.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));

        buttonBlock((ButtonBlock) ModBlocks.HORSERITE_BUTTON.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));
        pressurePlateBlock((PressurePlateBlock) ModBlocks.HORSERITE_PRESSURE_PLATE.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));

        wallBlock((WallBlock) ModBlocks.HORSERITE_WALL.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));
        fenceBlock((FenceBlock) ModBlocks.HORSERITE_FENCE.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));
        fenceGateBlock((FenceGateBlock) ModBlocks.HORSERITE_FENCE_GATE.get(), blockTexture(ModBlocks.HORSERITE_BLOCK.get()));

//        doorBlockWithRenderType((DoorBlock) ModBlocks.HORSERITE_DOOR.get(), modLoc("block/horserite_door_bottom"), modLoc("block/horserite_door_top"), "cutout");
//        trapdoorBlockWithRenderType((TrapDoorBlock) ModBlocks.HORSERITE_TRAPDOOR.get(), modLoc("block/horserite_trapdoor"), true, "cutout");
        blockItem(ModBlocks.HORSERITE_SLAB);
        blockItem(ModBlocks.HORSERITE_STAIRS);
        blockItem(ModBlocks.HORSERITE_PRESSURE_PLATE);
        blockItem(ModBlocks.HORSERITE_FENCE_GATE);
//        blockItem(ModBlocks.HORSERITE_TRAPDOOR, "_bottom");
//        blockItem(ModBlocks.HORSE_CREPE);

        horizontalBlock(ModBlocks.HAY_RACK_BLACK.get(),
                new ModelFile.UncheckedModelFile(modLoc("block/hay_rack_black")));

    }

    private void blockItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("buckleytesting:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath()));
    }
    private void blockItem(RegistryObject<Block> blockRegistryObject, String appendix){
        simpleBlockItem(blockRegistryObject.get(), new ModelFile.UncheckedModelFile("buckleytesting:block/" + ForgeRegistries.BLOCKS.getKey(blockRegistryObject.get()).getPath() + appendix));
    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject){
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}
