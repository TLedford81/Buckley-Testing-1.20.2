package net.kitnox.buckleytesting.entity.client;

import com.mojang.blaze3d.vertex.PoseStack;
import net.kitnox.buckleytesting.BuckleyTestingMod;
import net.kitnox.buckleytesting.entity.custom.BigBerthaEntity;
import net.kitnox.buckleytesting.entity.custom.PillagerKingEntity;
import net.kitnox.buckleytesting.entity.layers.ModModelLayers;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.resources.ResourceLocation;

public class PillagerKingRenderer extends MobRenderer<PillagerKingEntity, PillagerKingModel<PillagerKingEntity>> {
    private static final ResourceLocation PILLAGER_KING_LOCATION = new ResourceLocation(BuckleyTestingMod.MODID, "textures/entity/pillager_king.png");

    public PillagerKingRenderer(EntityRendererProvider.Context pContext) {
        super(pContext, new PillagerKingModel<>(pContext.bakeLayer(ModModelLayers.PILLAGER_KING_LAYER)), 2f);
    }

    @Override
    public ResourceLocation getTextureLocation(PillagerKingEntity pEntity) {
        return PILLAGER_KING_LOCATION;
    }

    @Override
    public void render(PillagerKingEntity pEntity, float pEntityYaw, float pPartialTicks,
                       PoseStack pMatrixStack, MultiBufferSource pBuffer, int pPackedLight) {
        if(pEntity.isBaby()) {
            pMatrixStack.scale(0.45f, 0.45f, 0.45f);
        }

        super.render(pEntity, pEntityYaw, pPartialTicks, pMatrixStack, pBuffer, pPackedLight);
    }
}
