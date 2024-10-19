package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Saiga12 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer body;
	private final ModelRenderer gun36_r1;
	private final ModelRenderer gun32_r1;
	private final ModelRenderer gun11_r1;
	private final ModelRenderer gun9_r1;
	private final ModelRenderer gun7_r1;
	private final ModelRenderer gun6_r1;
	private final ModelRenderer gun5_r1;
	private final ModelRenderer gun3_r1;
	private final ModelRenderer gun2_r1;
	private final ModelRenderer gun933_r1;
	private final ModelRenderer gun911_r1;
	private final ModelRenderer gun899_r1;
	private final ModelRenderer gun530_r1;
	private final ModelRenderer gun529_r1;
	private final ModelRenderer gun514_r1;
	private final ModelRenderer gun513_r1;
	private final ModelRenderer gun512_r1;
	private final ModelRenderer gun511_r1;
	private final ModelRenderer gun510_r1;
	private final ModelRenderer gun509_r1;
	private final ModelRenderer gun508_r1;
	private final ModelRenderer gun503_r1;
	private final ModelRenderer gun502_r1;
	private final ModelRenderer gun501_r1;
	private final ModelRenderer gun500_r1;
	private final ModelRenderer gun499_r1;
	private final ModelRenderer gun498_r1;
	private final ModelRenderer gun497_r1;
	private final ModelRenderer gun454_r1;
	private final ModelRenderer gun427_r1;
	private final ModelRenderer gun426_r1;
	private final ModelRenderer gun425_r1;
	private final ModelRenderer gun423_r1;
	private final ModelRenderer gun422_r1;
	private final ModelRenderer gun420_r1;
	private final ModelRenderer gun418_r1;
	private final ModelRenderer gun414_r1;
	private final ModelRenderer gun413_r1;
	private final ModelRenderer gun412_r1;
	private final ModelRenderer gun410_r1;
	private final ModelRenderer gun370_r1;
	private final ModelRenderer gun369_r1;
	private final ModelRenderer gun130_r1;
	private final ModelRenderer gun128_r1;
	private final ModelRenderer gun127_r1;
	private final ModelRenderer gun126_r1;
	private final ModelRenderer gun125_r1;
	private final ModelRenderer gun118_r1;
	private final ModelRenderer gun117_r1;
	private final ModelRenderer gun115_r1;
	private final ModelRenderer gun113_r1;
	private final ModelRenderer gun112_r1;
	private final ModelRenderer gun111_r1;
	private final ModelRenderer gun110_r1;
	private final ModelRenderer gun94_r1;
	private final ModelRenderer gun93_r1;
	private final ModelRenderer gun91_r1;
	private final ModelRenderer gun90_r1;
	private final ModelRenderer gun89_r1;
	private final ModelRenderer gun70_r1;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun17_r1;
	private final ModelRenderer gun15_r1;
	private final ModelRenderer stock;
	private final ModelRenderer gun409_r1;
	private final ModelRenderer gun408_r1;
	private final ModelRenderer gun407_r1;
	private final ModelRenderer gun406_r1;
	private final ModelRenderer gun405_r1;
	private final ModelRenderer gun245_r1;
	private final ModelRenderer gun244_r1;
	private final ModelRenderer gun241_r1;
	private final ModelRenderer gun240_r1;
	private final ModelRenderer gun239_r1;
	private final ModelRenderer gun236_r1;
	private final ModelRenderer gun235_r1;
	private final ModelRenderer gun234_r1;

	public Saiga12() {
		textureWidth = 280;
		textureHeight = 280;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-1.5F, -1.0F, -6.0F);
		

		body = new ModelRenderer(this);
		body.setRotationPoint(-0.0803F, -8.0319F, -15.5882F);
		gun.addChild(body);
		body.cubeList.add(new ModelBox(body, 106, 93, -1.9197F, 2.0319F, 14.5882F, 4, 1, 9, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 85, 66, -1.6197F, 1.5319F, 14.0882F, 3, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 76, 66, 0.7803F, 1.5319F, 14.0882F, 1, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 57, 0, -1.6197F, 0.8319F, 6.0882F, 3, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 17, 62, 0.7803F, 0.8319F, 6.0882F, 1, 5, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 75, 107, 1.2803F, -1.9681F, -13.9118F, 1, 3, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 25, 0, -2.1197F, -1.9681F, -13.9118F, 1, 3, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 53, 128, -2.1197F, -2.9681F, 12.0882F, 4, 5, 13, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 159, 52, 1.3803F, -2.9681F, -13.9118F, 1, 1, 38, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 52, -2.1197F, -1.9681F, -8.9118F, 1, 2, 21, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 88, -2.1197F, -0.4681F, -8.9118F, 1, 2, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 29, 77, 1.3803F, -2.9681F, 24.0882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 64, 22, -2.4197F, -3.9681F, -13.9118F, 5, 3, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 35, 98, -2.3197F, -2.9681F, 11.0882F, 1, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 110, 36, -2.2197F, -2.9681F, 14.0882F, 4, 1, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 25, 0, -2.1197F, -0.4681F, 0.0882F, 1, 2, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 159, 105, 1.2803F, -3.9681F, -11.9118F, 1, 1, 36, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 163, 0, 1.3803F, -4.4681F, -11.9118F, 1, 1, 35, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 77, 1.3803F, -4.4681F, 22.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 30, 97, -2.3197F, -3.7681F, 11.0882F, 1, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 80, 0, -2.3197F, -4.4681F, 1.4882F, 1, 1, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 76, 53, -2.2197F, -4.4681F, 11.4882F, 1, 1, 12, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 132, 53, -2.1197F, -3.4681F, 12.4882F, 1, 1, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 77, -2.1197F, -3.4681F, 12.0882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 71, 204, 1.2803F, -1.9681F, 0.0882F, 1, 4, 25, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 61, 94, 1.2803F, -1.9681F, -2.9118F, 1, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 94, 7, -1.8197F, -0.4681F, -2.9118F, 1, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 90, 60, 1.2803F, -0.4681F, -2.9118F, 1, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 198, -0.4197F, -6.7681F, -11.9118F, 1, 1, 34, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 29, 75, -2.2197F, 0.0319F, -4.9118F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 75, 1.3803F, 1.0319F, 3.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 7, 75, 1.3803F, 0.5319F, 5.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 75, 1.3803F, 1.3319F, 11.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 97, -1.9197F, 2.3319F, 5.0882F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 74, 1.3803F, -1.7681F, 23.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 74, 2, -2.2197F, -1.7681F, 22.0882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 74, 0, 1.4803F, -0.1681F, 23.0882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 72, -2.2197F, -0.4681F, 18.0882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 69, 65, -2.3197F, -1.7681F, 15.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 69, 63, -2.3197F, -0.9681F, 15.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 68, -2.3197F, -1.3681F, 15.8882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 40, 68, -2.5197F, -1.5681F, 15.3882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 34, 68, -2.5197F, -1.1681F, 15.3882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 68, -2.5197F, -1.3681F, 15.1882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 16, 68, -2.5197F, -1.3681F, 15.5882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 68, 2, -0.4197F, -5.1681F, 23.0882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 46, 66, 1.3803F, 1.4319F, 23.2882F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 131, 0, 1.5803F, -1.4681F, 2.0882F, 1, 2, 14, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 31, 88, 1.5803F, 0.3319F, 7.5882F, 1, 2, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 81, 94, 1.7803F, -0.7681F, 2.0882F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 67, 94, 1.7803F, -0.7681F, 10.0882F, 1, 1, 6, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 25, 0, 1.7803F, -0.7681F, 9.3882F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 25, 1.7803F, -0.7681F, 7.7882F, 1, 3, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 132, 18, -2.2197F, -3.9681F, 13.0882F, 1, 1, 11, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 40, -2.4197F, -2.9681F, -11.9118F, 5, 2, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 80, 10, -2.4197F, -2.4681F, -8.4118F, 5, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 53, 107, -2.1197F, -2.6681F, -7.9118F, 1, 1, 20, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 36, 88, -2.1197F, -2.9681F, -7.9118F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 53, 71, -2.4197F, -4.4681F, -13.9118F, 5, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 40, 77, -0.5197F, -6.8181F, -15.9118F, 1, 1, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 23, 75, -0.3197F, -6.8181F, -15.9118F, 1, 1, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 52, -0.4197F, -3.9681F, -64.9118F, 1, 3, 51, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 0, -1.4197F, -2.9681F, -64.9118F, 3, 1, 51, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 97, -0.4197F, -4.0681F, -67.9118F, 1, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 96, 38, -0.4197F, -1.8681F, -67.9118F, 1, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 96, 34, 0.6803F, -2.9681F, -67.9118F, 1, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 96, 26, -1.5197F, -2.9681F, -67.9118F, 1, 1, 3, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 76, 55, 1.3803F, 0.0319F, -13.2118F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 76, 53, 1.3803F, 0.0319F, -10.9118F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 65, 75, -2.2197F, 0.0319F, -12.9118F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 53, 75, -2.2197F, 0.0319F, -10.9118F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 75, 44, 1.3803F, 0.0319F, -5.9118F, 1, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 75, 44, -1.9197F, 15.5319F, 20.5882F, 4, 2, 4, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 0, 142, -1.9197F, 2.5319F, 14.5882F, 4, 4, 7, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 98, 53, -1.9197F, 3.0319F, 21.1882F, 4, 1, 1, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 76, 53, 1.1803F, 3.2319F, 15.0882F, 1, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 39, 66, -2.0197F, 3.2319F, 15.0882F, 1, 1, 5, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 89, 16, 1.1803F, 4.2319F, 16.5882F, 1, 1, 2, 0.0F, false));
		body.cubeList.add(new ModelBox(body, 89, 13, -2.0197F, 4.2319F, 16.5882F, 1, 1, 2, 0.0F, false));

		gun36_r1 = new ModelRenderer(this);
		gun36_r1.setRotationPoint(1.5803F, 27.4083F, 33.3788F);
		body.addChild(gun36_r1);
		setRotationAngle(gun36_r1, 0.4461F, 0.0F, 0.0F);
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 45, 14, -0.4F, -28.8F, -6.5F, 1, 3, 2, 0.0F, false));
		gun36_r1.cubeList.add(new ModelBox(gun36_r1, 30, 52, -3.6F, -28.8F, -6.5F, 1, 3, 2, 0.0F, false));

		gun32_r1 = new ModelRenderer(this);
		gun32_r1.setRotationPoint(1.5803F, 27.181F, 33.6431F);
		body.addChild(gun32_r1);
		setRotationAngle(gun32_r1, 0.481F, 0.0F, 0.0F);
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 57, 22, -0.4F, -27.5F, -5.9F, 1, 13, 5, 0.0F, false));
		gun32_r1.cubeList.add(new ModelBox(gun32_r1, 0, 75, -3.6F, -27.5F, -5.9F, 1, 13, 5, 0.0F, false));

		gun11_r1 = new ModelRenderer(this);
		gun11_r1.setRotationPoint(1.5803F, -12.8644F, -1.7069F);
		body.addChild(gun11_r1);
		setRotationAngle(gun11_r1, -2.1564F, 0.0F, 0.0F);
		gun11_r1.cubeList.add(new ModelBox(gun11_r1, 28, 48, -3.5F, -29.2F, 0.67F, 4, 1, 2, 0.0F, false));

		gun9_r1 = new ModelRenderer(this);
		gun9_r1.setRotationPoint(1.5803F, 8.8766F, 41.8966F);
		body.addChild(gun9_r1);
		setRotationAngle(gun9_r1, 1.2269F, 0.0F, 0.0F);
		gun9_r1.cubeList.add(new ModelBox(gun9_r1, 53, 88, -3.5F, -26.5F, -7.0F, 4, 2, 1, 0.0F, false));

		gun7_r1 = new ModelRenderer(this);
		gun7_r1.setRotationPoint(1.5803F, 26.3714F, 10.8311F);
		body.addChild(gun7_r1);
		setRotationAngle(gun7_r1, -0.6692F, 0.0F, 0.0F);
		gun7_r1.cubeList.add(new ModelBox(gun7_r1, 75, 98, -3.5F, -18.8F, 4.2F, 4, 1, 1, 0.0F, false));

		gun6_r1 = new ModelRenderer(this);
		gun6_r1.setRotationPoint(1.5803F, 7.0156F, 36.3634F);
		body.addChild(gun6_r1);
		setRotationAngle(gun6_r1, 2.491F, 0.0F, 0.0F);
		gun6_r1.cubeList.add(new ModelBox(gun6_r1, 76, 59, -3.5F, -15.5F, 3.0F, 4, 3, 2, 0.0F, false));

		gun5_r1 = new ModelRenderer(this);
		gun5_r1.setRotationPoint(1.5803F, 29.1034F, 34.6052F);
		body.addChild(gun5_r1);
		setRotationAngle(gun5_r1, 0.481F, 0.0F, 0.0F);
		gun5_r1.cubeList.add(new ModelBox(gun5_r1, 38, 25, -3.5F, -28.5F, -1.5F, 4, 12, 1, 0.0F, false));

		gun3_r1 = new ModelRenderer(this);
		gun3_r1.setRotationPoint(1.5803F, -22.6495F, 7.9528F);
		body.addChild(gun3_r1);
		setRotationAngle(gun3_r1, -2.5281F, 0.0F, 0.0F);
		gun3_r1.cubeList.add(new ModelBox(gun3_r1, 57, 17, -3.5F, -30.0F, 2.0F, 4, 1, 3, 0.0F, false));

		gun2_r1 = new ModelRenderer(this);
		gun2_r1.setRotationPoint(1.5803F, 27.2482F, 33.1691F);
		body.addChild(gun2_r1);
		setRotationAngle(gun2_r1, 0.481F, 0.0F, 0.0F);
		gun2_r1.cubeList.add(new ModelBox(gun2_r1, 0, 25, -3.5F, -26.5F, -6.0F, 4, 12, 5, 0.0F, false));

		gun933_r1 = new ModelRenderer(this);
		gun933_r1.setRotationPoint(1.5803F, 16.2039F, -7.5768F);
		body.addChild(gun933_r1);
		setRotationAngle(gun933_r1, -0.9295F, 0.0F, 0.0F);
		gun933_r1.cubeList.add(new ModelBox(gun933_r1, 57, 6, -3.8F, -37.5F, 2.2F, 2, 1, 2, 0.0F, false));
		gun933_r1.cubeList.add(new ModelBox(gun933_r1, 53, 59, -1.2F, -37.5F, 2.2F, 2, 1, 2, 0.0F, false));

		gun911_r1 = new ModelRenderer(this);
		gun911_r1.setRotationPoint(1.5803F, 16.5385F, -9.5494F);
		body.addChild(gun911_r1);
		setRotationAngle(gun911_r1, -0.9295F, 0.0F, 0.0F);
		gun911_r1.cubeList.add(new ModelBox(gun911_r1, 23, 80, -1.2F, -39.3F, 0.88F, 1, 1, 4, 0.0F, false));
		gun911_r1.cubeList.add(new ModelBox(gun911_r1, 80, 27, -2.8F, -39.3F, 0.88F, 1, 1, 4, 0.0F, false));

		gun899_r1 = new ModelRenderer(this);
		gun899_r1.setRotationPoint(1.5803F, 16.6421F, -10.1027F);
		body.addChild(gun899_r1);
		setRotationAngle(gun899_r1, -0.9295F, 0.0F, 0.0F);
		gun899_r1.cubeList.add(new ModelBox(gun899_r1, 9, 65, -2.0F, -39.8F, 0.5F, 1, 1, 5, 0.0F, false));

		gun530_r1 = new ModelRenderer(this);
		gun530_r1.setRotationPoint(22.137F, -26.2532F, 21.5882F);
		body.addChild(gun530_r1);
		setRotationAngle(gun530_r1, 0.0F, 0.0F, -2.3562F);
		gun530_r1.cubeList.add(new ModelBox(gun530_r1, 60, 88, -2.0F, -33.9F, -89.5F, 1, 1, 3, 0.0F, false));

		gun529_r1 = new ModelRenderer(this);
		gun529_r1.setRotationPoint(22.2077F, -26.4239F, 21.5882F);
		body.addChild(gun529_r1);
		setRotationAngle(gun529_r1, 0.0F, 0.0F, -2.3562F);
		gun529_r1.cubeList.add(new ModelBox(gun529_r1, 57, 1, -2.0F, -34.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun514_r1 = new ModelRenderer(this);
		gun514_r1.setRotationPoint(23.8441F, -25.5461F, 21.5882F);
		body.addChild(gun514_r1);
		setRotationAngle(gun514_r1, 0.0F, 0.0F, -2.3562F);
		gun514_r1.cubeList.add(new ModelBox(gun514_r1, 82, 88, -1.0F, -33.9F, -89.5F, 1, 1, 3, 0.0F, false));

		gun513_r1 = new ModelRenderer(this);
		gun513_r1.setRotationPoint(-22.9978F, -26.7875F, 21.5882F);
		body.addChild(gun513_r1);
		setRotationAngle(gun513_r1, 0.0F, 0.0F, 2.3562F);
		gun513_r1.cubeList.add(new ModelBox(gun513_r1, 93, 66, 0.1F, -35.0F, -89.5F, 1, 1, 3, 0.0F, false));

		gun512_r1 = new ModelRenderer(this);
		gun512_r1.setRotationPoint(-23.7049F, -28.4946F, 21.5882F);
		body.addChild(gun512_r1);
		setRotationAngle(gun512_r1, 0.0F, 0.0F, 2.3562F);
		gun512_r1.cubeList.add(new ModelBox(gun512_r1, 75, 94, 0.1F, -36.0F, -89.5F, 1, 1, 3, 0.0F, false));

		gun511_r1 = new ModelRenderer(this);
		gun511_r1.setRotationPoint(-24.9463F, 22.8727F, 21.5882F);
		body.addChild(gun511_r1);
		setRotationAngle(gun511_r1, 0.0F, 0.0F, 0.7854F);
		gun511_r1.cubeList.add(new ModelBox(gun511_r1, 89, 94, -1.0F, -37.1F, -89.5F, 1, 1, 3, 0.0F, false));

		gun510_r1 = new ModelRenderer(this);
		gun510_r1.setRotationPoint(-25.2392F, 23.5798F, 21.5882F);
		body.addChild(gun510_r1);
		setRotationAngle(gun510_r1, 0.0F, 0.0F, 0.7854F);
		gun510_r1.cubeList.add(new ModelBox(gun510_r1, 41, 95, -2.0F, -37.1F, -89.5F, 1, 1, 3, 0.0F, false));

		gun509_r1 = new ModelRenderer(this);
		gun509_r1.setRotationPoint(25.4211F, 20.5886F, 21.5882F);
		body.addChild(gun509_r1);
		setRotationAngle(gun509_r1, 0.0F, 0.0F, -0.7854F);
		gun509_r1.cubeList.add(new ModelBox(gun509_r1, 94, 95, -3.1F, -35.0F, -89.5F, 1, 1, 3, 0.0F, false));

		gun508_r1 = new ModelRenderer(this);
		gun508_r1.setRotationPoint(26.1282F, 20.2958F, 21.5882F);
		body.addChild(gun508_r1);
		setRotationAngle(gun508_r1, 0.0F, 0.0F, -0.7854F);
		gun508_r1.cubeList.add(new ModelBox(gun508_r1, 96, 22, -3.1F, -36.0F, -89.5F, 1, 1, 3, 0.0F, false));

		gun503_r1 = new ModelRenderer(this);
		gun503_r1.setRotationPoint(23.9148F, -25.7168F, 21.5882F);
		body.addChild(gun503_r1);
		setRotationAngle(gun503_r1, 0.0F, 0.0F, -2.3562F);
		gun503_r1.cubeList.add(new ModelBox(gun503_r1, 0, 106, -1.0F, -34.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun502_r1 = new ModelRenderer(this);
		gun502_r1.setRotationPoint(-23.1685F, -26.7168F, 21.5882F);
		body.addChild(gun502_r1);
		setRotationAngle(gun502_r1, 0.0F, 0.0F, 2.3562F);
		gun502_r1.cubeList.add(new ModelBox(gun502_r1, 106, 53, 0.0F, -35.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun501_r1 = new ModelRenderer(this);
		gun501_r1.setRotationPoint(-23.8756F, -28.4239F, 21.5882F);
		body.addChild(gun501_r1);
		setRotationAngle(gun501_r1, 0.0F, 0.0F, 2.3562F);
		gun501_r1.cubeList.add(new ModelBox(gun501_r1, 106, 105, 0.0F, -36.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun500_r1 = new ModelRenderer(this);
		gun500_r1.setRotationPoint(-24.8756F, 22.902F, 21.5882F);
		body.addChild(gun500_r1);
		setRotationAngle(gun500_r1, 0.0F, 0.0F, 0.7854F);
		gun500_r1.cubeList.add(new ModelBox(gun500_r1, 53, 107, -1.0F, -37.0101F, -86.5F, 1, 1, 51, 0.0F, false));

		gun499_r1 = new ModelRenderer(this);
		gun499_r1.setRotationPoint(-25.1685F, 23.6091F, 21.5882F);
		body.addChild(gun499_r1);
		setRotationAngle(gun499_r1, 0.0F, 0.0F, 0.7854F);
		gun499_r1.cubeList.add(new ModelBox(gun499_r1, 110, 0, -2.0003F, -37.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun498_r1 = new ModelRenderer(this);
		gun498_r1.setRotationPoint(25.4503F, 20.6594F, 21.5882F);
		body.addChild(gun498_r1);
		setRotationAngle(gun498_r1, 0.0F, 0.0F, -0.7854F);
		gun498_r1.cubeList.add(new ModelBox(gun498_r1, 53, 55, -3.0F, -35.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun497_r1 = new ModelRenderer(this);
		gun497_r1.setRotationPoint(26.1574F, 20.3665F, 21.5882F);
		body.addChild(gun497_r1);
		setRotationAngle(gun497_r1, 0.0F, 0.0F, -0.7854F);
		gun497_r1.cubeList.add(new ModelBox(gun497_r1, 106, 157, -3.0F, -36.0F, -86.5F, 1, 1, 51, 0.0F, false));

		gun454_r1 = new ModelRenderer(this);
		gun454_r1.setRotationPoint(-11.392F, 31.8443F, 21.5882F);
		body.addChild(gun454_r1);
		setRotationAngle(gun454_r1, 0.0F, 0.0F, 0.3346F);
		gun454_r1.cubeList.add(new ModelBox(gun454_r1, 68, 0, -2.97F, -39.0F, -37.5F, 1, 1, 4, 0.0F, false));

		gun427_r1 = new ModelRenderer(this);
		gun427_r1.setRotationPoint(-20.8779F, 26.6998F, 21.5882F);
		body.addChild(gun427_r1);
		setRotationAngle(gun427_r1, 0.0F, 0.0F, 0.5949F);
		gun427_r1.cubeList.add(new ModelBox(gun427_r1, 80, 0, -0.9F, -39.8F, -37.5F, 1, 1, 4, 0.0F, false));

		gun426_r1 = new ModelRenderer(this);
		gun426_r1.setRotationPoint(-31.1551F, 18.7255F, 21.5882F);
		body.addChild(gun426_r1);
		setRotationAngle(gun426_r1, 0.0F, 0.0F, 0.9295F);
		gun426_r1.cubeList.add(new ModelBox(gun426_r1, 80, 5, -2.1F, -39.8F, -37.5F, 1, 1, 4, 0.0F, false));

		gun425_r1 = new ModelRenderer(this);
		gun425_r1.setRotationPoint(-36.3259F, 4.3303F, 21.5882F);
		body.addChild(gun425_r1);
		setRotationAngle(gun425_r1, 0.0F, 0.0F, 1.3013F);
		gun425_r1.cubeList.add(new ModelBox(gun425_r1, 7, 75, -0.1F, -39.25F, -37.5F, 2, 1, 4, 0.0F, false));

		gun423_r1 = new ModelRenderer(this);
		gun423_r1.setRotationPoint(25.9091F, 20.4263F, 21.5882F);
		body.addChild(gun423_r1);
		setRotationAngle(gun423_r1, 0.0F, 0.0F, -0.7436F);
		gun423_r1.cubeList.add(new ModelBox(gun423_r1, 43, 20, -4.0F, -37.5F, -35.5F, 2, 1, 2, 0.0F, false));

		gun422_r1 = new ModelRenderer(this);
		gun422_r1.setRotationPoint(-24.5865F, -30.3373F, 21.5882F);
		body.addChild(gun422_r1);
		setRotationAngle(gun422_r1, 0.0F, 0.0F, 2.3051F);
		gun422_r1.cubeList.add(new ModelBox(gun422_r1, 45, 52, 1.0F, -37.5F, -35.5F, 1, 2, 2, 0.0F, false));

		gun420_r1 = new ModelRenderer(this);
		gun420_r1.setRotationPoint(1.5803F, 41.9332F, -11.9222F);
		body.addChild(gun420_r1);
		setRotationAngle(gun420_r1, -0.7854F, 0.0F, 0.0F);
		gun420_r1.cubeList.add(new ModelBox(gun420_r1, 34, 66, -3.7F, -36.0F, -27.5F, 1, 1, 1, 0.0F, false));

		gun418_r1 = new ModelRenderer(this);
		gun418_r1.setRotationPoint(1.5803F, 45.9855F, -14.1392F);
		body.addChild(gun418_r1);
		setRotationAngle(gun418_r1, -0.7854F, 0.0F, 0.0F);
		gun418_r1.cubeList.add(new ModelBox(gun418_r1, 0, 71, -4.0F, -36.65F, -33.5F, 5, 1, 1, 0.0F, false));

		gun414_r1 = new ModelRenderer(this);
		gun414_r1.setRotationPoint(1.5803F, 35.8432F, 15.5468F);
		body.addChild(gun414_r1);
		setRotationAngle(gun414_r1, -0.1859F, 0.0F, 0.0F);
		gun414_r1.cubeList.add(new ModelBox(gun414_r1, 14, 91, -2.5F, -31.0F, -18.1F, 2, 1, 1, 0.0F, false));

		gun413_r1 = new ModelRenderer(this);
		gun413_r1.setRotationPoint(1.5803F, 30.7468F, 24.9218F);
		body.addChild(gun413_r1);
		setRotationAngle(gun413_r1, 0.1115F, 0.0F, 0.0F);
		gun413_r1.cubeList.add(new ModelBox(gun413_r1, 80, 13, -2.5F, -31.0F, -18.8F, 2, 3, 1, 0.0F, false));

		gun412_r1 = new ModelRenderer(this);
		gun412_r1.setRotationPoint(1.5803F, -0.9383F, 38.7943F);
		body.addChild(gun412_r1);
		setRotationAngle(gun412_r1, 1.1897F, 0.0F, 0.0F);
		gun412_r1.cubeList.add(new ModelBox(gun412_r1, 13, 97, -3.5F, -29.7F, -16.5F, 4, 1, 1, 0.0F, false));

		gun410_r1 = new ModelRenderer(this);
		gun410_r1.setRotationPoint(25.9618F, 20.5617F, 21.5882F);
		body.addChild(gun410_r1);
		setRotationAngle(gun410_r1, 0.0F, 0.0F, -0.7436F);
		gun410_r1.cubeList.add(new ModelBox(gun410_r1, 40, 66, -3.8F, -37.5F, 0.5F, 1, 1, 1, 0.0F, false));
		gun410_r1.cubeList.add(new ModelBox(gun410_r1, 0, 75, -3.8F, -37.5F, -20.1F, 1, 1, 21, 0.0F, false));

		gun370_r1 = new ModelRenderer(this);
		gun370_r1.setRotationPoint(1.5803F, 31.6362F, 4.9252F);
		body.addChild(gun370_r1);
		setRotationAngle(gun370_r1, -0.4833F, 0.0F, 0.0F);
		gun370_r1.cubeList.add(new ModelBox(gun370_r1, 30, 58, 0.0F, -34.5F, -5.5F, 1, 2, 2, 0.0F, false));

		gun369_r1 = new ModelRenderer(this);
		gun369_r1.setRotationPoint(1.5803F, 32.0295F, -19.0875F);
		body.addChild(gun369_r1);
		setRotationAngle(gun369_r1, -1.0782F, 0.0F, 0.0F);
		gun369_r1.cubeList.add(new ModelBox(gun369_r1, 45, 58, 0.0F, -34.5F, -19.5F, 1, 2, 2, 0.0F, false));

		gun130_r1 = new ModelRenderer(this);
		gun130_r1.setRotationPoint(1.5803F, 2.5946F, -13.3982F);
		body.addChild(gun130_r1);
		setRotationAngle(gun130_r1, -1.3013F, 0.0F, 0.0F);
		gun130_r1.cubeList.add(new ModelBox(gun130_r1, 68, 0, -2.0F, -38.2F, 2.5F, 1, 1, 1, 0.0F, false));

		gun128_r1 = new ModelRenderer(this);
		gun128_r1.setRotationPoint(1.5803F, 18.2726F, -18.5683F);
		body.addChild(gun128_r1);
		setRotationAngle(gun128_r1, -1.2641F, 0.0F, 0.0F);
		gun128_r1.cubeList.add(new ModelBox(gun128_r1, 0, 0, -4.0F, -34.8F, -10.0F, 1, 4, 1, 0.0F, false));
		gun128_r1.cubeList.add(new ModelBox(gun128_r1, 86, 75, -3.9F, -34.8F, -10.0F, 1, 9, 1, 0.0F, false));

		gun127_r1 = new ModelRenderer(this);
		gun127_r1.setRotationPoint(1.5803F, -31.7659F, 4.9488F);
		body.addChild(gun127_r1);
		setRotationAngle(gun127_r1, -2.9496F, 0.0F, 0.0F);
		gun127_r1.cubeList.add(new ModelBox(gun127_r1, 122, 93, -4.0F, -33.2F, -5.2F, 1, 1, 10, 0.0F, false));

		gun126_r1 = new ModelRenderer(this);
		gun126_r1.setRotationPoint(1.5803F, 12.433F, -16.8542F);
		body.addChild(gun126_r1);
		setRotationAngle(gun126_r1, -1.3384F, 0.0F, 0.0F);
		gun126_r1.cubeList.add(new ModelBox(gun126_r1, 82, 75, -4.1F, -34.6F, -6.2F, 1, 9, 1, 0.0F, false));

		gun125_r1 = new ModelRenderer(this);
		gun125_r1.setRotationPoint(1.5803F, 18.5518F, -18.1869F);
		body.addChild(gun125_r1);
		setRotationAngle(gun125_r1, -1.2641F, 0.0F, 0.0F);
		gun125_r1.cubeList.add(new ModelBox(gun125_r1, 11, 0, -3.9F, -34.4F, -10.0F, 1, 4, 1, 0.0F, false));

		gun118_r1 = new ModelRenderer(this);
		gun118_r1.setRotationPoint(1.5803F, 33.0514F, 1.6562F);
		body.addChild(gun118_r1);
		setRotationAngle(gun118_r1, -0.5577F, 0.0F, 0.0F);
		gun118_r1.cubeList.add(new ModelBox(gun118_r1, 88, 36, -4.0F, -34.8F, -10.0F, 1, 1, 2, 0.0F, false));

		gun117_r1 = new ModelRenderer(this);
		gun117_r1.setRotationPoint(1.5803F, -31.5985F, 5.9338F);
		body.addChild(gun117_r1);
		setRotationAngle(gun117_r1, -2.9671F, 0.0F, 0.0F);
		gun117_r1.cubeList.add(new ModelBox(gun117_r1, 23, 52, -3.9F, -33.0F, -5.0F, 1, 1, 13, 0.0F, false));

		gun115_r1 = new ModelRenderer(this);
		gun115_r1.setRotationPoint(1.5803F, 13.0344F, -16.4731F);
		body.addChild(gun115_r1);
		setRotationAngle(gun115_r1, -1.309F, 0.0F, 0.0F);
		gun115_r1.cubeList.add(new ModelBox(gun115_r1, 14, 80, -3.9F, -34.8F, -6.0F, 1, 10, 1, 0.0F, false));

		gun113_r1 = new ModelRenderer(this);
		gun113_r1.setRotationPoint(1.5803F, -14.848F, -10.0863F);
		body.addChild(gun113_r1);
		setRotationAngle(gun113_r1, -2.6397F, 0.0F, 0.0F);
		gun113_r1.cubeList.add(new ModelBox(gun113_r1, 70, 53, -2.0F, -28.0F, -9.7F, 1, 1, 1, 0.0F, false));

		gun112_r1 = new ModelRenderer(this);
		gun112_r1.setRotationPoint(1.5803F, -8.1435F, -14.9137F);
		body.addChild(gun112_r1);
		setRotationAngle(gun112_r1, -2.3051F, 0.0F, 0.0F);
		gun112_r1.cubeList.add(new ModelBox(gun112_r1, 70, 55, -2.0F, -28.7F, -9.1F, 1, 1, 1, 0.0F, false));

		gun111_r1 = new ModelRenderer(this);
		gun111_r1.setRotationPoint(1.5803F, 34.1289F, 9.421F);
		body.addChild(gun111_r1);
		setRotationAngle(gun111_r1, -0.3718F, 0.0F, 0.0F);
		gun111_r1.cubeList.add(new ModelBox(gun111_r1, 38, 14, -2.0F, -31.8F, -9.0F, 1, 3, 1, 0.0F, false));

		gun110_r1 = new ModelRenderer(this);
		gun110_r1.setRotationPoint(1.5803F, 25.4474F, 34.0229F);
		body.addChild(gun110_r1);
		setRotationAngle(gun110_r1, 0.4461F, 0.0F, 0.0F);
		gun110_r1.cubeList.add(new ModelBox(gun110_r1, 23, 52, -2.0F, -31.2F, -10.5F, 1, 2, 1, 0.0F, false));

		gun94_r1 = new ModelRenderer(this);
		gun94_r1.setRotationPoint(-11.4482F, 31.7774F, 21.5882F);
		body.addChild(gun94_r1);
		setRotationAngle(gun94_r1, 0.0F, 0.0F, 0.3346F);
		gun94_r1.cubeList.add(new ModelBox(gun94_r1, 0, 25, -2.8F, -39.2F, -20.5F, 1, 2, 21, 0.0F, false));

		gun93_r1 = new ModelRenderer(this);
		gun93_r1.setRotationPoint(-24.9205F, -30.1888F, 21.5882F);
		body.addChild(gun93_r1);
		setRotationAngle(gun93_r1, 0.0F, 0.0F, 2.3051F);
		gun93_r1.cubeList.add(new ModelBox(gun93_r1, 159, 157, 0.8F, -37.5F, -33.5F, 1, 1, 35, 0.0F, false));

		gun91_r1 = new ModelRenderer(this);
		gun91_r1.setRotationPoint(-36.3772F, 4.3978F, 21.5882F);
		body.addChild(gun91_r1);
		setRotationAngle(gun91_r1, 0.0F, 0.0F, 1.3013F);
		gun91_r1.cubeList.add(new ModelBox(gun91_r1, 176, 193, -0.17F, -39.25F, -33.5F, 2, 1, 34, 0.0F, false));

		gun90_r1 = new ModelRenderer(this);
		gun90_r1.setRotationPoint(-31.1149F, 18.6454F, 21.5882F);
		body.addChild(gun90_r1);
		setRotationAngle(gun90_r1, 0.0F, 0.0F, 0.9295F);
		gun90_r1.cubeList.add(new ModelBox(gun90_r1, 196, 142, -2.0F, -39.8F, -33.5F, 1, 1, 34, 0.0F, false));

		gun89_r1 = new ModelRenderer(this);
		gun89_r1.setRotationPoint(-20.8951F, 26.7558F, 21.5882F);
		body.addChild(gun89_r1);
		setRotationAngle(gun89_r1, 0.0F, 0.0F, 0.5949F);
		gun89_r1.cubeList.add(new ModelBox(gun89_r1, 197, 91, -1.0F, -39.8F, -33.5F, 1, 1, 34, 0.0F, false));

		gun70_r1 = new ModelRenderer(this);
		gun70_r1.setRotationPoint(1.5803F, 25.3741F, -10.6221F);
		body.addChild(gun70_r1);
		setRotationAngle(gun70_r1, -0.8923F, 0.0F, 0.0F);
		gun70_r1.cubeList.add(new ModelBox(gun70_r1, 7, 77, -3.9F, -37.5F, -8.1F, 1, 1, 1, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(1.5803F, 33.6466F, 21.0243F);
		body.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.0175F, 0.0F, 0.0F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 47, 159, -0.3F, -32.0F, -35.5F, 1, 1, 39, 0.0F, false));
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 0, 158, -3.7F, -32.0F, -35.5F, 4, 1, 39, 0.0F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(1.5803F, -22.6165F, 12.5177F);
		body.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 2.4538F, 0.0F, 0.0F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 69, 41, -3.2F, -26.2F, -14.5F, 3, 1, 1, 0.0F, false));
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 40, 77, -0.8F, -26.2F, -14.5F, 1, 1, 1, 0.0F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(1.5803F, 15.3604F, 35.9093F);
		body.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.7436F, 0.0F, 0.0F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 46, 77, -0.8F, -27.2F, -15.5F, 1, 1, 1, 0.0F, false));
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 12, 71, -3.2F, -27.2F, -15.5F, 3, 1, 1, 0.0F, false));

		gun17_r1 = new ModelRenderer(this);
		gun17_r1.setRotationPoint(1.5803F, 34.034F, 19.5275F);
		body.addChild(gun17_r1);
		setRotationAngle(gun17_r1, -0.0744F, 0.0F, 0.0F);
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 25, 14, -3.2F, -27.2F, -14.5F, 3, 1, 7, 0.0F, false));
		gun17_r1.cubeList.add(new ModelBox(gun17_r1, 62, 33, -0.8F, -27.2F, -14.5F, 1, 1, 7, 0.0F, false));

		gun15_r1 = new ModelRenderer(this);
		gun15_r1.setRotationPoint(1.5803F, -7.1401F, -8.7807F);
		body.addChild(gun15_r1);
		setRotationAngle(gun15_r1, -2.3423F, 0.0F, 0.0F);
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 53, 77, -0.8F, -26.5F, -6.7F, 1, 1, 1, 0.0F, false));
		gun15_r1.cubeList.add(new ModelBox(gun15_r1, 95, 60, -3.2F, -26.5F, -6.7F, 3, 1, 1, 0.0F, false));

		stock = new ModelRenderer(this);
		stock.setRotationPoint(0.0882F, -6.1431F, 27.704F);
		gun.addChild(stock);
		stock.cubeList.add(new ModelBox(stock, 106, 107, -1.5882F, -4.3569F, -8.754F, 3, 2, 18, 0.0F, false));
		stock.cubeList.add(new ModelBox(stock, 106, 73, -2.0882F, -3.4569F, -8.954F, 4, 2, 18, 0.0F, false));

		gun409_r1 = new ModelRenderer(this);
		gun409_r1.setRotationPoint(1.4118F, 28.892F, -26.4231F);
		stock.addChild(gun409_r1);
		setRotationAngle(gun409_r1, -0.1487F, 0.0F, 0.0F);
		gun409_r1.cubeList.add(new ModelBox(gun409_r1, 110, 18, -3.0F, -32.8F, 12.75F, 3, 2, 16, 0.0F, false));

		gun408_r1 = new ModelRenderer(this);
		gun408_r1.setRotationPoint(1.4118F, 28.0658F, -25.2278F);
		stock.addChild(gun408_r1);
		setRotationAngle(gun408_r1, -0.1115F, 0.0F, 0.0F);
		gun408_r1.cubeList.add(new ModelBox(gun408_r1, 25, 8, -3.5F, -33.1F, 25.8F, 4, 1, 2, 0.0F, false));

		gun407_r1 = new ModelRenderer(this);
		gun407_r1.setRotationPoint(1.4118F, 28.9096F, -26.186F);
		stock.addChild(gun407_r1);
		setRotationAngle(gun407_r1, -0.1487F, 0.0F, 0.0F);
		gun407_r1.cubeList.add(new ModelBox(gun407_r1, 0, 124, -3.5F, -31.2F, 12.75F, 4, 3, 15, 0.0F, false));

		gun406_r1 = new ModelRenderer(this);
		gun406_r1.setRotationPoint(1.4118F, 28.8721F, -26.6898F);
		stock.addChild(gun406_r1);
		setRotationAngle(gun406_r1, -0.1487F, 0.0F, 0.0F);
		gun406_r1.cubeList.add(new ModelBox(gun406_r1, 106, 53, -3.5F, -34.6F, 12.75F, 4, 2, 18, 0.0F, false));

		gun405_r1 = new ModelRenderer(this);
		gun405_r1.setRotationPoint(1.4118F, 29.895F, -28.094F);
		stock.addChild(gun405_r1);
		setRotationAngle(gun405_r1, -0.1859F, 0.0F, 0.0F);
		gun405_r1.cubeList.add(new ModelBox(gun405_r1, 125, 127, -3.5F, -34.9F, 3.5F, 4, 4, 12, 0.0F, false));

		gun245_r1 = new ModelRenderer(this);
		gun245_r1.setRotationPoint(1.4118F, 28.3153F, -24.6717F);
		stock.addChild(gun245_r1);
		setRotationAngle(gun245_r1, -0.0873F, 0.0F, 0.0F);
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 32, 0, -1.1F, -35.4F, 30.9F, 1, 3, 1, 0.0F, false));
		gun245_r1.cubeList.add(new ModelBox(gun245_r1, 15, 75, -2.9F, -35.4F, 30.9F, 2, 3, 1, 0.0F, false));

		gun244_r1 = new ModelRenderer(this);
		gun244_r1.setRotationPoint(1.4118F, 28.4146F, -24.5974F);
		stock.addChild(gun244_r1);
		setRotationAngle(gun244_r1, -0.0873F, 0.0F, 0.0F);
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 16, 0, -0.6F, -34.5F, 29.8F, 1, 11, 2, 0.0F, false));
		gun244_r1.cubeList.add(new ModelBox(gun244_r1, 23, 25, -3.4F, -34.5F, 29.8F, 3, 11, 2, 0.0F, false));

		gun241_r1 = new ModelRenderer(this);
		gun241_r1.setRotationPoint(1.4118F, 27.8113F, -24.1864F);
		stock.addChild(gun241_r1);
		setRotationAngle(gun241_r1, -0.1115F, 0.0F, 0.0F);
		gun241_r1.cubeList.add(new ModelBox(gun241_r1, 97, 17, -3.5F, -23.9F, 28.6F, 4, 1, 1, 0.0F, false));

		gun240_r1 = new ModelRenderer(this);
		gun240_r1.setRotationPoint(1.4118F, 27.9545F, -25.2216F);
		stock.addChild(gun240_r1);
		setRotationAngle(gun240_r1, -0.1115F, 0.0F, 0.0F);
		gun240_r1.cubeList.add(new ModelBox(gun240_r1, 53, 75, -3.5F, -33.1F, 26.8F, 4, 9, 4, 0.0F, false));

		gun239_r1 = new ModelRenderer(this);
		gun239_r1.setRotationPoint(1.4118F, 28.6422F, -31.3972F);
		stock.addChild(gun239_r1);
		setRotationAngle(gun239_r1, -0.2974F, 0.0F, 0.0F);
		gun239_r1.cubeList.add(new ModelBox(gun239_r1, 88, 159, -3.5F, -33.6F, 3.5F, 4, 3, 27, -0.01F, false));

		gun236_r1 = new ModelRenderer(this);
		gun236_r1.setRotationPoint(1.4118F, 31.2904F, -5.3015F);
		stock.addChild(gun236_r1);
		setRotationAngle(gun236_r1, 0.4833F, 0.0F, 0.0F);
		gun236_r1.cubeList.add(new ModelBox(gun236_r1, 23, 66, -3.0F, -33.2F, 8.5F, 3, 2, 5, 0.0F, false));

		gun235_r1 = new ModelRenderer(this);
		gun235_r1.setRotationPoint(1.4118F, 31.3935F, -5.7198F);
		stock.addChild(gun235_r1);
		setRotationAngle(gun235_r1, 0.4833F, 0.0F, 0.0F);
		gun235_r1.cubeList.add(new ModelBox(gun235_r1, 57, 44, -3.5F, -32.3F, 8.5F, 4, 2, 5, 0.0F, false));

		gun234_r1 = new ModelRenderer(this);
		gun234_r1.setRotationPoint(1.4118F, 29.8778F, -28.2788F);
		stock.addChild(gun234_r1);
		setRotationAngle(gun234_r1, -0.1859F, 0.0F, 0.0F);
		gun234_r1.cubeList.add(new ModelBox(gun234_r1, 23, 75, -3.0F, -35.9F, 3.5F, 3, 2, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		gun.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}