package net.kitnox.buckleytesting;

import com.mojang.logging.LogUtils;
import net.kitnox.buckleytesting.block.ModBlocks;
import net.kitnox.buckleytesting.enchantment.ModEnchantments;
import net.kitnox.buckleytesting.entity.MobEntities;
import net.kitnox.buckleytesting.entity.client.BigBerthaRenderer;
import net.kitnox.buckleytesting.entity.client.PillagerKingRenderer;
import net.kitnox.buckleytesting.item.ModCreativeModeTabs;
import net.kitnox.buckleytesting.item.ModItems;
import net.minecraft.client.renderer.entity.EntityRenderers;
import net.minecraft.world.item.CreativeModeTabs;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.BuildCreativeModeTabContentsEvent;
import net.minecraftforge.event.server.ServerStartingEvent;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.eventbus.api.SubscribeEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.slf4j.Logger;

// The value here should match an entry in the META-INF/mods.toml file
@Mod(BuckleyTestingMod.MODID)
public class BuckleyTestingMod
{
    // Define mod id in a common place for everything to reference
    public static final String MODID = "buckleytesting";
    // Directly reference a slf4j logger
    private static final Logger LOGGER = LogUtils.getLogger();

    public BuckleyTestingMod()
    {
        IEventBus modEventBus = FMLJavaModLoadingContext.get().getModEventBus();

        ModCreativeModeTabs.register(modEventBus);
        ModItems.register(modEventBus);
        ModBlocks.register(modEventBus);
        MobEntities.register(modEventBus);
        ModEnchantments.register(modEventBus);

        // Register the commonSetup method for modloading
        modEventBus.addListener(this::commonSetup);

        // Register ourselves for server and other game events we are interested in
        MinecraftForge.EVENT_BUS.register(this);

        // Register the item to a creative tab
        modEventBus.addListener(this::addCreative);
    }

    private void commonSetup(final FMLCommonSetupEvent event)
    {

    }

    // Add the example block item to the building blocks tab
    private void addCreative(BuildCreativeModeTabContentsEvent event)
    {
        if(event.getTabKey() == CreativeModeTabs.INGREDIENTS)
        {
            event.accept(ModItems.HORSERITE);
            event.accept(ModItems.RAW_HORSERITE);
        }
        if(event.getTabKey() == CreativeModeTabs.SPAWN_EGGS)
        {
            event.accept(ModItems.BIG_BERTHA_SPAWN_EGG);
        }
        if(event.getTabKey() == CreativeModeTabs.BUILDING_BLOCKS)
        {
            event.accept(ModBlocks.HORSERITE_BLOCK);
            event.accept(ModBlocks.RAW_HORSERITE_BLOCK);
        }
    }

    // You can use SubscribeEvent and let the Event Bus discover methods to call
    @SubscribeEvent
    public void onServerStarting(ServerStartingEvent event)
    {

    }

    // You can use EventBusSubscriber to automatically register all static methods in the class annotated with @SubscribeEvent
    @Mod.EventBusSubscriber(modid = MODID, bus = Mod.EventBusSubscriber.Bus.MOD, value = Dist.CLIENT)
    public static class ClientModEvents
    {
        @SubscribeEvent
        public static void onClientSetup(FMLClientSetupEvent event)
        {
            EntityRenderers.register(MobEntities.BIGBERTHA.get(), BigBerthaRenderer::new);
            EntityRenderers.register(MobEntities.PILLAGERKING.get(), PillagerKingRenderer::new);
        }
    }
}
