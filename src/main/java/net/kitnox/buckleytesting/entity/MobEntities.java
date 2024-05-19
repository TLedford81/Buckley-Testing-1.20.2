package net.kitnox.buckleytesting.entity;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.entity.custom.BigBerthaEntity;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.MobCategory;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class MobEntities {
    public static final DeferredRegister<EntityType<?>> ENTITY_TYPES =
            DeferredRegister.create(ForgeRegistries.ENTITY_TYPES, BuckleyTestingMod.MODID);

    public static final RegistryObject<EntityType<BigBerthaEntity>> BIGBERTHA =
            ENTITY_TYPES.register("bigbertha", () -> EntityType.Builder.of(BigBerthaEntity::new, MobCategory.CREATURE)
                    .sized(2f,3f).build("bigbertha"));

    public static void register(IEventBus eventBus){
        ENTITY_TYPES.register(eventBus);
    }
}
