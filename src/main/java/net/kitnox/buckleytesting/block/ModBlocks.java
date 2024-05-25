package net.kitnox.buckleytesting.block;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.block.custom.HayRackBlock;
import net.kitnox.buckleytesting.block.custom.SoundBlock;
import net.kitnox.buckleytesting.item.ModItems;
import net.minecraft.sounds.SoundEvent;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import javax.swing.*;
import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, BuckleyTestingMod.MODID);


    public static final RegistryObject<Block> HORSERITE_BLOCK = registerBlock("horserite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> RAW_HORSERITE_BLOCK = registerBlock("raw_horserite_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COAL_ORE)));

    public static final RegistryObject<Block> SOUND_BLOCK = registerBlock("sound_block",
            () -> new SoundBlock(BlockBehaviour.Properties.copy(Blocks.OAK_PLANKS)));

    public static final RegistryObject<Block> HORSERITE_STAIRS = registerBlock("horserite_stairs",
            () -> new StairBlock(() -> ModBlocks.HORSERITE_BLOCK.get().defaultBlockState(), BlockBehaviour.Properties.copy(Blocks.QUARTZ_STAIRS).sound(SoundType.METAL)));

    public static final RegistryObject<Block> HORSERITE_SLAB = registerBlock("horserite_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).sound(SoundType.METAL)));

    public static final RegistryObject<Block> HORSERITE_PRESSURE_PLATE = registerBlock("horserite_pressure_plate",
            () -> new PressurePlateBlock(PressurePlateBlock.Sensitivity.EVERYTHING, BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), BlockSetType.IRON));

    public static final RegistryObject<Block> HORSERITE_BUTTON = registerBlock("horserite_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.QUARTZ_SLAB).sound(SoundType.METAL), BlockSetType.IRON, 5, true));

    public static final RegistryObject<Block> HORSERITE_WALL = registerBlock("horserite_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK)));

    public static final RegistryObject<Block> HORSERITE_FENCE = registerBlock("horserite_fence",
            () -> new FenceBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL)));

    public static final RegistryObject<Block> HORSERITE_FENCE_GATE = registerBlock("horserite_fence_gate",
            () -> new FenceGateBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), SoundEvents.FENCE_GATE_OPEN, SoundEvents.FENCE_GATE_CLOSE));
//
//    public static final RegistryObject<Block> HORSERITE_DOOR = registerBlock("horserite_door",
//            () -> new DoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), BlockSetType.IRON));
//
//    public static final RegistryObject<Block> HORSERITE_TRAPDOOR = registerBlock("horserite_trapdoor",
//            () -> new TrapDoorBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).sound(SoundType.METAL), BlockSetType.IRON));

//    public static final RegistryObject<Block> HORSE_CREPE = registerBlock("horse_crepe",
//            () -> new SnowLayerBlock(BlockBehaviour.Properties.copy(Blocks.SNOW)));

    public static final RegistryObject<Block> HAY_RACK_BLACK = registerBlock("hay_rack_black",
            () -> new HayRackBlock(BlockBehaviour.Properties.copy(Blocks.IRON_BLOCK).noOcclusion()));



    private static <T extends Block>RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block){
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block){
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    public static void register(IEventBus eventBus){
        BLOCKS.register(eventBus);
    }
}
