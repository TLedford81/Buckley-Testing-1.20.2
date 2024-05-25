package net.kitnox.buckleytesting.enchantment;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModEnchantments {
    public static final DeferredRegister<Enchantment> ENCHANTMENTS =
            DeferredRegister.create(ForgeRegistries.ENCHANTMENTS, BuckleyTestingMod.MODID);

    public static final RegistryObject<Enchantment> BIRTH_A_BERTHA =
            ENCHANTMENTS.register("birth_a_bertha", () -> new BirthABerthaEnchantment(
                    Enchantment.Rarity.COMMON, EnchantmentCategory.WEAPON, EquipmentSlot.MAINHAND));
    public static void register(IEventBus eventBus){
        ENCHANTMENTS.register(eventBus);
    }
}
