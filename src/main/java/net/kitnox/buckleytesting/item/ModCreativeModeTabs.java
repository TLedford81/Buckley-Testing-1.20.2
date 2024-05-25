package net.kitnox.buckleytesting.item;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BuckleyTestingMod.MODID);

    public static final RegistryObject<CreativeModeTab> MAIN_TAB = CREATIVE_MODE_TABS.register("main_tab",
            () -> CreativeModeTab.builder()
                    .icon(() -> new ItemStack(ModItems.BIG_BERTHA_SPAWN_EGG.get()))
                    .title(Component.translatable("creativetab.main_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BIG_BERTHA_SPAWN_EGG.get());
                        pOutput.accept(ModItems.PILLAGER_KING_SPAWN_EGG.get());
                        pOutput.accept(ModItems.LACED_CARROT.get());
                        pOutput.accept(ModItems.HORSE_HAIR.get());
                        pOutput.accept(ModItems.HORSERITE.get());
                        pOutput.accept(ModItems.RAW_HORSERITE.get());
                        pOutput.accept(ModItems.HORSERITE_HELMET.get());
                        pOutput.accept(ModItems.HORSERITE_CHESTPLATE.get());
                        pOutput.accept(ModItems.HORSERITE_LEGGINGS.get());
                        pOutput.accept(ModItems.HORSERITE_BOOTS.get());
                        pOutput.accept(ModItems.KETAMINE_SWORD.get());
                        pOutput.accept(ModItems.HORSERITE_SWORD.get());
                        pOutput.accept(ModItems.HORSERITE_AXE.get());
                        pOutput.accept(ModItems.HORSERITE_PICKAXE.get());
                        pOutput.accept(ModItems.HORSERITE_SHOVEL.get());
                        pOutput.accept(ModItems.HORSERITE_HOE.get());
                        pOutput.accept(ModItems.HORSERITE_PAXEL.get());
                        pOutput.accept(ModItems.HORSERITE_HAMMER.get());
                        pOutput.accept(ModItems.METAL_DETECTOR.get());
                        pOutput.accept(ModBlocks.RAW_HORSERITE_BLOCK.get());
                        pOutput.accept(ModBlocks.HORSERITE_BLOCK.get());
                        pOutput.accept(ModBlocks.HORSERITE_SLAB.get());
                        pOutput.accept(ModBlocks.HORSERITE_STAIRS.get());
                        pOutput.accept(ModBlocks.HORSERITE_WALL.get());
                        pOutput.accept(ModBlocks.HORSERITE_FENCE.get());
                        pOutput.accept(ModBlocks.HORSERITE_FENCE_GATE.get());
                        pOutput.accept(ModBlocks.HORSERITE_BUTTON.get());
                        pOutput.accept(ModBlocks.HORSERITE_PRESSURE_PLATE.get());
//                        pOutput.accept(ModBlocks.HORSERITE_DOOR.get());
//                        pOutput.accept(ModBlocks.HORSERITE_TRAPDOOR.get());
                        pOutput.accept(ModBlocks.SOUND_BLOCK.get());
//                        pOutput.accept(ModBlocks.HORSE_CREPE.get());
                        pOutput.accept(ModBlocks.HAY_RACK_BLACK.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
