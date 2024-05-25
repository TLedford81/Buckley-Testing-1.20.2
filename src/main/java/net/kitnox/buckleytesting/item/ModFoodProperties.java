package net.kitnox.buckleytesting.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraftforge.event.entity.living.MobEffectEvent;

public class ModFoodProperties {
    public static final FoodProperties LACED_CARROT = new FoodProperties.Builder()
            .nutrition(3)
            .saturationMod(0.25f)
            .effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 300), 1.0f)
            .effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 300, 1), 1.0f)
            .build();
}
