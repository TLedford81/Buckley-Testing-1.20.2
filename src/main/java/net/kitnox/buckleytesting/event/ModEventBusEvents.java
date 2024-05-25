package net.kitnox.buckleytesting.event;

import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.entity.MobEntities;
import net.kitnox.buckleytesting.entity.client.BigBerthaModel;
import net.kitnox.buckleytesting.entity.client.PillagerKingModel;
import net.kitnox.buckleytesting.entity.custom.BigBerthaEntity;
import net.kitnox.buckleytesting.entity.custom.PillagerKingEntity;
import net.kitnox.buckleytesting.entity.layers.ModModelLayers;
import net.minecraftforge.client.event.EntityRenderersEvent;
import net.minecraftforge.event.entity.EntityAttributeCreationEvent;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;

@Mod.EventBusSubscriber(modid = BuckleyTestingMod.MODID, bus = Mod.EventBusSubscriber.Bus.MOD)
public class ModEventBusEvents {
    @SubscribeEvent
    public static void registerLayers(EntityRenderersEvent.RegisterLayerDefinitions event){
        event.registerLayerDefinition(ModModelLayers.BIG_BERTHA_LAYER, BigBerthaModel::createBodyLayer);
        event.registerLayerDefinition(ModModelLayers.PILLAGER_KING_LAYER, PillagerKingModel::createBodyLayer);
    }
    @SubscribeEvent
    public static void registerAttributes(EntityAttributeCreationEvent event){
        event.put(MobEntities.BIGBERTHA.get(), BigBerthaEntity.createAttributes().build());
        event.put(MobEntities.PILLAGERKING.get(), PillagerKingEntity.createAttributes().build());
    }
}
