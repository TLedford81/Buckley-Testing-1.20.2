package net.kitnox.buckleytesting.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.entity.custom.BigBerthaEntity;
import net.kitnox.buckleytesting.entity.layers.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class BigBerthaRenderer extends MobRenderer<BigBerthaEntity, BigBerthaModel<BigBerthaEntity>> {
    private static final ResourceLocation BIG_BERTHA_LOCATION = new ResourceLocation(BuckleyTestingMod.MODID, "textures/entity/big_bertha.png");

    public BigBerthaRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new BigBerthaModel<>(pContext.bakeLayer(ModModelLayers.BIG_BERTHA_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(BigBerthaEntity pEntity) {
        return BIG_BERTHA_LOCATION;
    }

    @Override
    public void render(BigBerthaEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
