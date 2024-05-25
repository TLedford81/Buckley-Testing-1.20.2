package net.kitnox.buckleytesting.datagen;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.block.ModBlocks;
import net.kitnox.buckleytesting.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, BuckleyTestingMod.MODID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        simpleItem(ModItems.HORSERITE);
        simpleItem(ModItems.RAW_HORSERITE);
        simpleItem(ModItems.BIG_BERTHA_SPAWN_EGG);
        simpleItem(ModItems.PILLAGER_KING_SPAWN_EGG);
        simpleItem(ModItems.HORSE_HAIR);
        simpleItem(ModItems.LACED_CARROT);
        simpleItem(ModItems.METAL_DETECTOR);

        handheldItem(ModItems.KETAMINE_SWORD);
        handheldItem(ModItems.HORSERITE_SWORD);
        handheldItem(ModItems.HORSERITE_AXE);
        handheldItem(ModItems.HORSERITE_PICKAXE);
        handheldItem(ModItems.HORSERITE_SHOVEL);
        handheldItem(ModItems.HORSERITE_HOE);
        handheldItem(ModItems.HORSERITE_PAXEL);
        handheldItem(ModItems.HORSERITE_HAMMER);

//        simpleBlockItem(ModBlocks.HORSERITE_DOOR);

        buttonItem(ModBlocks.HORSERITE_BUTTON, ModBlocks.HORSERITE_BLOCK);
        fenceItem(ModBlocks.HORSERITE_FENCE, ModBlocks.HORSERITE_BLOCK);
        wallItem(ModBlocks.HORSERITE_WALL, ModBlocks.HORSERITE_BLOCK);
//        layeredItem(ModBlocks.HORSE_CREPE, ModBlocks.HORSERITE_BLOCK);

        complexBlock(ModBlocks.HAY_RACK_BLACK.get());
    }
    public void layeredItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/layered_inventory"))
                .texture("texture", new ResourceLocation(BuckleyTestingMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void fenceItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/fence_inventory"))
                .texture("texture", new ResourceLocation(BuckleyTestingMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }
    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(BuckleyTestingMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock){
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(BuckleyTestingMod.MODID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BuckleyTestingMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(BuckleyTestingMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder handheldItem(RegistryObject<Item> item){
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/handheld")).texture("layer0",
                new ResourceLocation(BuckleyTestingMod.MODID, "item/" + item.getId().getPath()));
    }

    private ItemModelBuilder complexBlock(Block block){
        return withExistingParent(ForgeRegistries.BLOCKS.getKey(block).getPath(), new ResourceLocation(BuckleyTestingMod.MODID,
                "block/" + ForgeRegistries.BLOCKS.getKey(block).getPath()));
    }
}
