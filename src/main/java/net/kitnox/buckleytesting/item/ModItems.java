package net.kitnox.buckleytesting.item;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.entity.MobEntities;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraftforge.common.ForgeSpawnEggItem;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BuckleyTestingMod.MODID);

    public static final RegistryObject<Item> HORSERITE = ITEMS.register("horserite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> RAW_HORSERITE = ITEMS.register("raw_horserite",
            () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> BIG_BERTHA_SPAWN_EGG = ITEMS.register("big_bertha_spawn_egg",
            () -> new ForgeSpawnEggItem(MobEntities.BIGBERTHA, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
