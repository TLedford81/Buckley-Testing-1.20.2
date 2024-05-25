package net.kitnox.buckleytesting.item;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.entity.MobEntities;
import net.kitnox.buckleytesting.item.custom.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.*;
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

    public static final RegistryObject<Item> HORSERITE_SWORD = ITEMS.register("horserite_sword",
            () -> new SwordItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> KETAMINE_SWORD = ITEMS.register("ketamine_sword",
            () -> new KetamineSword(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> HORSERITE_PICKAXE = ITEMS.register("horserite_pickaxe",
            () -> new PickaxeItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> HORSERITE_AXE = ITEMS.register("horserite_axe",
            () -> new AxeItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> HORSERITE_SHOVEL = ITEMS.register("horserite_shovel",
            () -> new ShovelItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> HORSERITE_HOE = ITEMS.register("horserite_hoe",
            () -> new HoeItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> HORSERITE_PAXEL = ITEMS.register("horserite_paxel",
            () -> new PaxelItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));

    public static final RegistryObject<Item> HORSERITE_HAMMER = ITEMS.register("horserite_hammer",
            () -> new HammerItem(ModToolTiers.HORSERITE, 2, 3, new Item.Properties().durability(ModToolTiers.HORSERITE.getUses())));


    public static final RegistryObject<Item> HORSERITE_HELMET = ITEMS.register("horserite_helmet",
            () -> new ModArmorItem(ModArmorMaterials.HORSERITE, ArmorItem.Type.HELMET, new Item.Properties()));

    public static final RegistryObject<Item> HORSERITE_CHESTPLATE = ITEMS.register("horserite_chestplate",
            () -> new ModArmorItem(ModArmorMaterials.HORSERITE, ArmorItem.Type.CHESTPLATE, new Item.Properties()));

    public static final RegistryObject<Item> HORSERITE_LEGGINGS = ITEMS.register("horserite_leggings",
            () -> new ModArmorItem(ModArmorMaterials.HORSERITE, ArmorItem.Type.LEGGINGS, new Item.Properties()));

    public static final RegistryObject<Item> HORSERITE_BOOTS = ITEMS.register("horserite_boots",
            () -> new ModArmorItem(ModArmorMaterials.HORSERITE, ArmorItem.Type.BOOTS, new Item.Properties()));

    public static final RegistryObject<Item> HORSERITE_HORSE_ARMOR = ITEMS.register("horserite_horse_armor",
            () -> new HorseArmorItem(14, new ResourceLocation(BuckleyTestingMod.MODID, "textures/entity/horse/armor/horse_armor_horserite.png"), new Item.Properties()));


    public static final RegistryObject<Item> METAL_DETECTOR = ITEMS.register("metal_detector",
            () -> new MetalDetectorItem(new Item.Properties().durability(512)));

    public static final RegistryObject<Item> LACED_CARROT = ITEMS.register("laced_carrot",
            () -> new Item(new Item.Properties().food(ModFoodProperties.LACED_CARROT)));

    public static final RegistryObject<Item> HORSE_HAIR = ITEMS.register("horse_hair",
            () -> new FuelItem(new Item.Properties(), 100));

    public static final RegistryObject<Item> BIG_BERTHA_SPAWN_EGG = ITEMS.register("big_bertha_spawn_egg",
            () -> new ForgeSpawnEggItem(MobEntities.BIGBERTHA, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static final RegistryObject<Item> PILLAGER_KING_SPAWN_EGG = ITEMS.register("pillager_king_spawn_egg",
            () -> new ForgeSpawnEggItem(MobEntities.PILLAGERKING, 0x7e9680, 0xc5d1c5, new Item.Properties()));

    public static void register(IEventBus eventBus){
        ITEMS.register(eventBus);
    }

}
