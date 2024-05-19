package net.kitnox.buckleytesting.entity.client;// Made with Blockbench 4.10.1
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports


import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.blaze3d.vertex.VertexConsumer;
import net.kitnox.buckleytesting.entity.animations.ModAnimationDefinitions;
import net.kitnox.buckleytesting.entity.custom.BigBerthaEntity;
import net.minecraft.client.model.EntityModel;
import net.minecraft.client.model.HierarchicalModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.util.Mth;

public class BigBerthaModel<T extends BigBerthaEntity> extends HierarchicalModel<T> {
	private final ModelPart body;
//	private final ModelPart mane;
//	private final ModelPart front_left_leg;
//	private final ModelPart tail;
//	private final ModelPart back_left_leg;
//	private final ModelPart back_right_leg;
//	private final ModelPart front_right_leg;
//	private final ModelPart torso;
//	private final ModelPart neck;
	private final ModelPart head;
//	private final ModelPart mouth;
//	private final ModelPart left_ear;
//	private final ModelPart right_ear;

	public BigBerthaModel(ModelPart root) {
		this.body = root.getChild("body");
		this.head = root.getChild("body").getChild("head");
//		this.mane = root.getChild("mane");
//		this.front_left_leg = root.getChild("front_left_leg");
//		this.tail = root.getChild("tail");
//		this.back_left_leg = root.getChild("back_left_leg");
//		this.back_right_leg = root.getChild("back_right_leg");
//		this.front_right_leg = root.getChild("front_right_leg");
//		this.torso = root.getChild("torso");
//		this.neck = root.getChild("neck");
//		this.head = root.getChild("head");
//		this.mouth = root.getChild("mouth");
//		this.left_ear = root.getChild("left_ear");
//		this.right_ear = root.getChild("right_ear");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition body = partdefinition.addOrReplaceChild("body", CubeListBuilder.create(), PartPose.offsetAndRotation(0.0F, 24.0F, 3.2F, 0.0F, 1.5708F, 0.0F));

		PartDefinition mane = body.addOrReplaceChild("mane", CubeListBuilder.create().texOffs(14, 1).addBox(21.4436F, -51.4405F, -0.7617F, 8.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -0.2682F));

		PartDefinition cube_r1 = mane.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 1).addBox(-4.7282F, -5.0F, -1.0F, 22.0F, 5.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.3798F, -36.4873F, 0.2279F, 0.0F, 0.0F, -0.7418F));

		PartDefinition front_left_leg = body.addOrReplaceChild("front_left_leg", CubeListBuilder.create().texOffs(68, 158).addBox(4.6646F, -22.7723F, 1.0421F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 158).addBox(5.8528F, -26.5482F, 1.0267F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(88, 106).addBox(4.2683F, -7.8375F, 1.0421F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(84, 57).addBox(5.6778F, -1.1364F, 1.0421F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.25F, 0.0F, 0.5F));

		PartDefinition cube_r2 = front_left_leg.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(45, 116).addBox(5.3282F, 2.8855F, -2.4427F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.6613F, -4.0219F, 3.4725F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r3 = front_left_leg.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(128, 159).addBox(5.4762F, -10.0159F, -2.4921F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3804F, -15.3349F, 4.1696F, 0.0F, 0.0F, 0.1745F));

		PartDefinition tail = body.addOrReplaceChild("tail", CubeListBuilder.create(), PartPose.offset(12.0F, -13.5F, -0.25F));

		PartDefinition cube_r4 = tail.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(136, 123).addBox(-5.0652F, -4.4674F, 0.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-40.2517F, -5.3756F, -1.2921F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r5 = tail.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(147, 64).addBox(-5.0652F, -4.4674F, 0.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(158, 90).addBox(-5.0652F, -4.4674F, -1.2337F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.018F, -7.843F, -0.6753F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r6 = tail.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(155, 133).addBox(-5.0652F, -4.4674F, 0.0F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(160, 17).addBox(-5.0652F, -4.4674F, -1.2337F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-40.2517F, -7.843F, -0.6753F, 0.0F, 0.0F, 1.6144F));

		PartDefinition cube_r7 = tail.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(141, 0).addBox(-5.0159F, -7.4921F, -2.4921F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-39.2882F, -13.6636F, -0.0615F, 0.0F, 0.0F, 1.7453F));

		PartDefinition cube_r8 = tail.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(60, 70).addBox(-5.0652F, -7.4674F, -2.4674F, 10.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-40.2517F, -13.3947F, -0.0584F, 0.0F, 0.0F, 1.7453F));

		PartDefinition cube_r9 = tail.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(88, 126).addBox(-4.5326F, -7.4674F, 0.0F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-37.1675F, -21.4137F, -0.6753F, 0.0F, 0.0F, 2.2689F));

		PartDefinition cube_r10 = tail.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(73, 141).addBox(-4.5573F, -7.4427F, 0.0F, 7.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-36.9454F, -21.0559F, -1.8843F, 0.0F, 0.0F, 2.2689F));

		PartDefinition cube_r11 = tail.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(40, 74).addBox(-4.5326F, -4.4674F, 0.0F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-29.7653F, -16.4789F, -1.2921F, 0.0F, 0.0F, 0.6109F));

		PartDefinition back_left_leg = body.addOrReplaceChild("back_left_leg", CubeListBuilder.create().texOffs(127, 77).addBox(-17.6484F, 6.8636F, 1.659F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(79, 13).addBox(-15.2982F, -23.5157F, 1.6775F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -8.0F, 0.5F));

		PartDefinition cube_r12 = back_left_leg.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(111, 18).addBox(-7.0652F, -4.4674F, 0.0F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.162F, -10.8756F, 1.0421F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r13 = back_left_leg.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(150, 10).addBox(-11.0F, -0.0652F, 0.0F, 11.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.3305F, -18.2778F, 2.2758F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r14 = back_left_leg.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(0, 93).addBox(-4.4674F, -2.5978F, -2.4674F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(30, 165).addBox(-4.4674F, -2.5978F, -1.2337F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.3305F, -10.8756F, 2.8927F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r15 = back_left_leg.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(21, 132).addBox(-7.0F, -4.4674F, -2.4674F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0968F, -6.5577F, 3.5095F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r16 = back_left_leg.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(61, 80).addBox(-7.4427F, -4.4427F, -2.4427F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.0638F, -7.6248F, 4.0832F, 0.0F, 0.0F, -1.1781F));

		PartDefinition cube_r17 = back_left_leg.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(49, 136).addBox(-9.4921F, -4.4921F, -2.4921F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.8199F, -5.3651F, 4.1726F, 0.0F, 0.0F, -1.6144F));

		PartDefinition cube_r18 = back_left_leg.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(44, 120).addBox(-9.4022F, -4.4674F, -2.4674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.6484F, -3.4734F, 4.1264F, 0.0F, 0.0F, -1.6144F));

		PartDefinition cube_r19 = back_left_leg.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(125, 45).addBox(-9.4022F, -4.4674F, -2.4674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.499F, -2.8566F, 4.1264F, 0.0F, 0.0F, -1.8762F));

		PartDefinition back_right_leg = body.addOrReplaceChild("back_right_leg", CubeListBuilder.create().texOffs(137, 20).addBox(-17.6484F, 6.8636F, -3.4932F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(136, 164).addBox(-15.2982F, -23.5809F, -3.5487F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(-1.5F, -8.0F, -1.75F));

		PartDefinition cube_r20 = back_right_leg.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(130, 92).addBox(-7.0652F, -4.4674F, -2.4674F, 12.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-5.162F, -10.8756F, -1.6427F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r21 = back_right_leg.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(103, 159).addBox(-11.0F, -0.0652F, -4.9348F, 11.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.3305F, -18.2778F, 0.3836F, 0.0F, 0.0F, -0.8727F));

		PartDefinition cube_r22 = back_right_leg.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(38, 165).addBox(-4.4674F, -2.5978F, -2.4674F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(0, 166).addBox(-4.4674F, -2.5978F, -1.2337F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.3305F, -10.8756F, -1.0258F, 0.0F, 0.0F, 0.48F));

		PartDefinition cube_r23 = back_right_leg.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(97, 149).addBox(-7.0F, -4.4427F, -2.4427F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.0104F, -6.4034F, -1.6057F, 0.0F, 0.0F, -0.6109F));

		PartDefinition cube_r24 = back_right_leg.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(85, 71).addBox(-7.4674F, -4.4674F, -2.4674F, 5.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-13.181F, -7.7914F, -1.0258F, 0.0F, 0.0F, -1.1781F));

		PartDefinition cube_r25 = back_right_leg.addOrReplaceChild("cube_r25", CubeListBuilder.create().texOffs(160, 21).addBox(-9.4921F, -4.4921F, -2.4921F, 7.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.8199F, -5.3651F, -1.0536F, 0.0F, 0.0F, -1.6144F));

		PartDefinition cube_r26 = back_right_leg.addOrReplaceChild("cube_r26", CubeListBuilder.create().texOffs(130, 81).addBox(-9.4022F, -4.4674F, -2.4674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-15.6484F, -3.4734F, -1.0258F, 0.0F, 0.0F, -1.6144F));

		PartDefinition cube_r27 = back_right_leg.addOrReplaceChild("cube_r27", CubeListBuilder.create().texOffs(98, 133).addBox(-9.4022F, -4.4674F, -2.4674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-17.499F, -2.8566F, -1.0258F, 0.0F, 0.0F, -1.8762F));

		PartDefinition front_right_leg = body.addOrReplaceChild("front_right_leg", CubeListBuilder.create().texOffs(144, 164).addBox(4.6646F, -22.7723F, -2.6264F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(144, 164).addBox(4.6646F, -22.7723F, -2.6264F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(37, 115).addBox(4.1035F, -7.8005F, -2.577F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(118, 137).addBox(5.8567F, -1.1364F, -2.6757F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F))
		.texOffs(68, 158).addBox(5.8528F, -26.5482F, -2.6409F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(7.25F, 0.0F, -2.0F));

		PartDefinition cube_r28 = front_right_leg.addOrReplaceChild("cube_r28", CubeListBuilder.create().texOffs(126, 137).addBox(5.4022F, 2.9348F, -2.4674F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-1.575F, -4.0712F, -0.159F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r29 = front_right_leg.addOrReplaceChild("cube_r29", CubeListBuilder.create().texOffs(22, 165).addBox(5.4762F, -10.0159F, -2.4921F, 2.0F, 15.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.3804F, -15.3349F, -0.8067F, 0.0F, 0.0F, 0.1745F));

		PartDefinition torso = body.addOrReplaceChild("torso", CubeListBuilder.create().texOffs(0, 115).addBox(-3.1565F, -30.7262F, -4.0095F, 15.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(150, 70).addBox(-1.1755F, -34.4273F, -4.0095F, 5.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(80, 149).addBox(-1.1755F, -33.1936F, -3.3927F, 5.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(0, 149).addBox(-1.1755F, -33.1936F, -4.6264F, 5.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(107, 122).addBox(-12.4688F, -31.5651F, -2.7649F, 12.0F, 10.0F, 5.0F, new CubeDeformation(0.0F))
		.texOffs(4, 69).addBox(7.2457F, -34.5767F, -6.4769F, 12.0F, 12.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(44, 116).addBox(14.7131F, -35.0441F, -5.2432F, 7.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(44, 94).addBox(-12.9905F, -32.8025F, -6.5417F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(0, 93).addBox(8.012F, -33.8104F, -7.7106F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(79, 13).addBox(8.012F, -33.8104F, -5.2432F, 10.0F, 10.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(112, 103).addBox(-11.1946F, -30.8104F, -7.0938F, 7.0F, 7.0F, 12.0F, new CubeDeformation(0.0F))
		.texOffs(117, 1).addBox(-16.1294F, -30.8104F, -5.2432F, 7.0F, 7.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(115, 25).addBox(-12.4283F, -34.4273F, -5.2432F, 7.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(130, 45).addBox(-12.4283F, -35.661F, -4.0095F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F))
		.texOffs(75, 37).addBox(-8.0913F, -32.5767F, -5.2432F, 15.0F, 10.0F, 10.0F, new CubeDeformation(0.0F))
		.texOffs(104, 84).addBox(-11.1946F, -30.8104F, -5.8601F, 7.0F, 7.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r30 = torso.addOrReplaceChild("cube_r30", CubeListBuilder.create().texOffs(68, 126).addBox(-0.0652F, -5.0F, -2.4674F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.6941F, -24.4273F, -2.7758F, 0.0F, 0.0F, 1.309F));

		PartDefinition cube_r31 = torso.addOrReplaceChild("cube_r31", CubeListBuilder.create().texOffs(32, 93).addBox(-7.4674F, -7.4674F, -4.9348F, 5.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0451F, -31.2126F, 0.9253F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r32 = torso.addOrReplaceChild("cube_r32", CubeListBuilder.create().texOffs(127, 62).addBox(-7.4649F, -7.4649F, -7.3948F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-6.0391F, -29.9489F, 2.1568F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r33 = torso.addOrReplaceChild("cube_r33", CubeListBuilder.create().texOffs(130, 77).addBox(-0.0652F, -5.0F, -2.4674F, 5.0F, 5.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.9278F, -22.5767F, -2.7758F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r34 = torso.addOrReplaceChild("cube_r34", CubeListBuilder.create().texOffs(150, 108).addBox(0.4022F, -7.5326F, -2.4674F, 7.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-4.8114F, -23.1936F, -0.3084F, -0.0027F, 0.0059F, 0.1748F));

		PartDefinition cube_r35 = torso.addOrReplaceChild("cube_r35", CubeListBuilder.create().texOffs(48, 158).addBox(2.4022F, -7.5326F, -2.4674F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-0.4935F, -21.343F, -0.3084F, -0.0027F, 0.0059F, 0.0002F));

		PartDefinition cube_r36 = torso.addOrReplaceChild("cube_r36", CubeListBuilder.create().texOffs(158, 49).addBox(2.4022F, -7.5326F, -2.4674F, 5.0F, 10.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(3.8245F, -21.343F, -0.3084F, -0.0027F, 0.0059F, -0.087F));

		PartDefinition cube_r37 = torso.addOrReplaceChild("cube_r37", CubeListBuilder.create().texOffs(0, 132).addBox(2.8696F, -7.5326F, -4.9348F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.3631F, -28.1284F, 0.3084F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r38 = torso.addOrReplaceChild("cube_r38", CubeListBuilder.create().texOffs(134, 130).addBox(2.9683F, -7.5079F, -4.9841F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.4667F, -28.4096F, 1.5575F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r39 = torso.addOrReplaceChild("cube_r39", CubeListBuilder.create().texOffs(28, 136).addBox(2.8696F, -7.5326F, -4.9348F, 7.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-10.3631F, -29.3621F, 0.9253F, 0.0F, 0.0F, 0.3054F));

		PartDefinition cube_r40 = torso.addOrReplaceChild("cube_r40", CubeListBuilder.create().texOffs(56, 141).addBox(2.4022F, -7.5326F, -4.9348F, 5.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3571F, -25.661F, 0.3084F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r41 = torso.addOrReplaceChild("cube_r41", CubeListBuilder.create().texOffs(116, 142).addBox(2.4762F, -7.5079F, -4.9841F, 5.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3706F, -25.9176F, 1.5575F, 0.0F, 0.0F, -0.2618F));

		PartDefinition cube_r42 = torso.addOrReplaceChild("cube_r42", CubeListBuilder.create().texOffs(140, 147).addBox(2.4022F, -7.5326F, -4.9348F, 5.0F, 10.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(1.3571F, -26.8947F, 0.9253F, 0.0F, 0.0F, -0.2618F));

		PartDefinition neck = body.addOrReplaceChild("neck", CubeListBuilder.create(), PartPose.offset(12.0F, -13.5F, -0.25F));

		PartDefinition cube_r43 = neck.addOrReplaceChild("cube_r43", CubeListBuilder.create().texOffs(151, 32).addBox(2.4022F, -12.0F, -2.4674F, 5.0F, 12.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.4604F, -18.9463F, -0.6753F, 0.0F, 0.0F, 0.3927F));

		PartDefinition cube_r44 = neck.addOrReplaceChild("cube_r44", CubeListBuilder.create().texOffs(93, 137).addBox(-12.4921F, -7.0F, -2.4921F, 10.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.0453F, -29.8621F, -0.0615F, 0.0F, 0.0F, -0.7854F));

		PartDefinition cube_r45 = neck.addOrReplaceChild("cube_r45", CubeListBuilder.create().texOffs(157, 142).addBox(-9.9348F, -7.0F, -2.4674F, 5.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(17.7322F, -34.3676F, -0.0584F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r46 = neck.addOrReplaceChild("cube_r46", CubeListBuilder.create().texOffs(24, 153).addBox(-11.9348F, -7.0F, -2.4674F, 7.0F, 7.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(7.8626F, -24.498F, -0.0584F, 0.0F, 0.0F, -0.7418F));

		PartDefinition cube_r47 = neck.addOrReplaceChild("cube_r47", CubeListBuilder.create().texOffs(89, 57).addBox(-9.449F, -7.0F, -2.517F, 17.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(10.2091F, -25.2791F, -1.3293F, 0.0F, 0.0F, -0.829F));

		PartDefinition head = body.addOrReplaceChild("head", CubeListBuilder.create().texOffs(138, 96).addBox(9.4361F, -36.3796F, -3.8027F, 8.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, -13.5F, -0.25F));

		PartDefinition cube_r48 = head.addOrReplaceChild("cube_r48", CubeListBuilder.create().texOffs(68, 116).addBox(0.4022F, -7.4674F, -2.4674F, 7.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(11.5637F, -25.7317F, -0.2372F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r49 = head.addOrReplaceChild("cube_r49", CubeListBuilder.create().texOffs(155, 123).addBox(0.0396F, -6.0132F, -2.0132F, 6.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(14.8472F, -28.9101F, -0.0732F, 0.0F, 0.0F, 1.1345F));

		PartDefinition cube_r50 = head.addOrReplaceChild("cube_r50", CubeListBuilder.create().texOffs(76, 94).addBox(0.4022F, -7.4674F, -2.4674F, 7.0F, 5.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(9.0963F, -28.1991F, -1.2921F, 0.0F, 0.0F, 0.7854F));

		PartDefinition cube_r51 = head.addOrReplaceChild("cube_r51", CubeListBuilder.create().texOffs(139, 18).addBox(-4.5079F, -9.4921F, -2.4921F, 7.0F, 7.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(12.7625F, -25.6793F, -1.3045F, 0.0F, 0.0F, 0.7854F));

		PartDefinition mouth = head.addOrReplaceChild("mouth", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, -0.3575F));

		PartDefinition cube_r52 = mouth.addOrReplaceChild("cube_r52", CubeListBuilder.create().texOffs(159, 159).addBox(-2.483F, -10.034F, -2.517F, 5.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(16.442F, -18.34F, 0.1124F, 0.0F, 0.0F, 0.9163F));

		PartDefinition left_ear = head.addOrReplaceChild("left_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r53 = left_ear.addOrReplaceChild("cube_r53", CubeListBuilder.create().texOffs(94, 0).addBox(-2.0F, -9.9348F, -2.4674F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.4142F, -30.0496F, 3.6427F, 0.0F, 0.0F, 0.9163F));

		PartDefinition right_ear = head.addOrReplaceChild("right_ear", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition cube_r54 = right_ear.addOrReplaceChild("cube_r54", CubeListBuilder.create().texOffs(77, 35).addBox(-2.0F, -9.9348F, -2.4674F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(13.4142F, -30.0496F, -1.2921F, 0.0F, 0.0F, 0.9163F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(BigBerthaEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.root().getAllParts().forEach(ModelPart::resetPose);
		this.applyHeadRotation(entity, netHeadYaw, headPitch, ageInTicks);

		this.animateWalk(ModAnimationDefinitions.BERTHA_IDLE, limbSwing, limbSwingAmount, 2f, 2.5f);
		this.animate(entity.idleAnimationState, ModAnimationDefinitions.BERTHA_IDLE, ageInTicks, 1f);
	}

	private void applyHeadRotation(BigBerthaEntity pEntity, float pNetHeadYaw, float pHeadPitch, float pAgeInTicks){
		pNetHeadYaw = Mth.clamp(pNetHeadYaw, -30.0f, 30.0f);
		pHeadPitch = Mth.clamp(pHeadPitch, -25.0f, 45.0f);

		this.head.yRot = pNetHeadYaw * ((float) Math.PI / 180F);
		this.head.xRot = pHeadPitch * ((float) Math.PI / 180F);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, float red, float green, float blue, float alpha) {
		body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	@Override
	public ModelPart root() {
		return body;
	}
}