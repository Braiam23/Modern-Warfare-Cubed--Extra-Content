package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington700 extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer gun25_r1;
	private final ModelRenderer gun26_r1;
	private final ModelRenderer gun22_r1;
	private final ModelRenderer gun23_r1;
	private final ModelRenderer gun22_r2;
	private final ModelRenderer gun21_r1;
	private final ModelRenderer gun25_r2;
	private final ModelRenderer gun28_r1;
	private final ModelRenderer gun27_r1;
	private final ModelRenderer gun25_r3;
	private final ModelRenderer gun24_r1;
	private final ModelRenderer gun24_r2;
	private final ModelRenderer gun23_r2;
	private final ModelRenderer gun42_r1;
	private final ModelRenderer gun41_r1;
	private final ModelRenderer gun41_r2;
	private final ModelRenderer gun40_r1;
	private final ModelRenderer gun44_r1;
	private final ModelRenderer gun44;
	private final ModelRenderer gun43;
	private final ModelRenderer gun41;
	private final ModelRenderer gun38;
	private final ModelRenderer gun37;
	private final ModelRenderer gun23;
	private final ModelRenderer gun21;
	private final ModelRenderer gun19;
	private final ModelRenderer gun18;
	private final ModelRenderer gun17;
	private final ModelRenderer gun16;
	private final ModelRenderer gun15;
	private final ModelRenderer gun14;
	private final ModelRenderer gun13;
	private final ModelRenderer gun12;
	private final ModelRenderer gun11;
	private final ModelRenderer gun10;
	private final ModelRenderer gun9;
	private final ModelRenderer gun8;
	private final ModelRenderer gun7;
	private final ModelRenderer gun6;
	private final ModelRenderer gun5;
	private final ModelRenderer gun4;
	private final ModelRenderer gun3;
	private final ModelRenderer gun2;
	private final ModelRenderer gun1;

	public Remington700() {
		textureWidth = 400;
		textureHeight = 400;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(0.0F, 16.0F, -17.0F);
		gun.cubeList.add(new ModelBox(gun, 9, 70, -1.55F, -29.57F, 8.97F, 1, 1, 2, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 77, 153, -0.9F, -30.4F, -81.7F, 1, 1, 75, -0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 154, 76, -1.5F, -31.0F, -81.7F, 1, 1, 75, 0.001F, false));
		gun.cubeList.add(new ModelBox(gun, 94, 6, -1.5F, -31.8F, 2.6F, 1, 1, 5, 0.0F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 113, -2.2F, -32.5F, -7.9F, 2, 1, 16, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 54, -1.75F, -32.6F, 7.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 117, 49, -1.25F, -32.6F, 7.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 116, -1.75F, -32.6F, 5.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 117, -1.25F, -32.6F, 5.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 49, 116, -1.75F, -32.6F, 4.5F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 57, 116, -1.25F, -32.6F, 4.5F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 20, 116, -1.75F, -32.6F, 3.25F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 24, 116, -1.25F, -32.6F, 3.25F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 113, -1.75F, -32.6F, 2.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 31, 115, -1.25F, -32.6F, 2.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 98, -1.75F, -32.6F, 0.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 100, -1.25F, -32.6F, 0.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 83, -1.75F, -32.6F, -0.5F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 85, -1.25F, -32.6F, -0.5F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 63, -1.75F, -32.6F, -1.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 65, -1.25F, -32.6F, -1.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 50, -1.75F, -32.6F, -3.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 53, -1.25F, -32.6F, -3.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 38, -1.75F, -32.6F, -4.25F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 114, 40, -1.25F, -32.6F, -4.25F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 70, 113, -1.75F, -32.6F, -5.5F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 113, 72, -1.25F, -32.6F, -5.5F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 107, 108, -1.75F, -32.6F, -6.75F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 110, 73, -1.25F, -32.6F, -6.75F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 46, -1.75F, -32.6F, -8.0F, 1, 1, 1, -0.201F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 82, -1.25F, -32.6F, -8.0F, 1, 1, 1, -0.202F, false));
		gun.cubeList.add(new ModelBox(gun, 40, 35, -0.8F, -32.5F, -7.9F, 1, 1, 16, -0.3F, false));
		gun.cubeList.add(new ModelBox(gun, 108, 27, -0.8F, -32.5F, -8.1F, 1, 1, 1, -0.299F, false));
		gun.cubeList.add(new ModelBox(gun, 9, 40, -2.2F, -32.5F, -8.1F, 2, 1, 1, -0.299F, false));

		gun25_r1 = new ModelRenderer(this);
		gun25_r1.setRotationPoint(-0.45F, -32.4F, -7.7F);
		gun.addChild(gun25_r1);
		setRotationAngle(gun25_r1, 0.0F, 0.0F, -1.0472F);
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 108, 93, -0.7F, -0.3F, -0.2F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 108, 85, -0.7F, -0.3F, -0.4F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 8, 112, -0.7F, -0.3F, 1.05F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 71, 111, -0.7F, -0.3F, 0.85F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 86, 113, -0.7F, -0.3F, 2.3F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 82, 113, -0.7F, -0.3F, 2.1F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 44, -0.7F, -0.3F, 3.55F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 42, -0.7F, -0.3F, 3.35F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 57, -0.7F, -0.3F, 4.8F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 55, -0.7F, -0.3F, 4.6F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 77, -0.7F, -0.3F, 6.05F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 67, -0.7F, -0.3F, 5.85F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 89, -0.7F, -0.3F, 7.3F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 87, -0.7F, -0.3F, 7.1F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 104, -0.7F, -0.3F, 8.55F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 102, -0.7F, -0.3F, 8.35F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 114, 115, -0.7F, -0.3F, 9.8F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 85, 115, -0.7F, -0.3F, 9.6F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 37, 116, -0.7F, -0.3F, 11.05F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 28, 116, -0.7F, -0.3F, 10.85F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 65, 116, -0.7F, -0.3F, 12.3F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 61, 116, -0.7F, -0.3F, 12.1F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 39, -0.7F, -0.3F, 13.55F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 37, -0.7F, -0.3F, 13.35F, 1, 1, 1, -0.304F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 47, -0.7F, -0.3F, 14.8F, 1, 1, 1, -0.303F, false));
		gun25_r1.cubeList.add(new ModelBox(gun25_r1, 117, 45, -0.7F, -0.3F, 14.6F, 1, 1, 1, -0.304F, false));

		gun26_r1 = new ModelRenderer(this);
		gun26_r1.setRotationPoint(-1.55F, -32.4F, -7.7F);
		gun.addChild(gun26_r1);
		setRotationAngle(gun26_r1, 0.0F, 0.0F, 1.0472F);
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 108, 36, -0.3F, -0.3F, -0.2F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 30, 108, -0.3F, -0.3F, -0.4F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 108, 102, -0.3F, -0.3F, 1.05F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 108, 95, -0.3F, -0.3F, 0.85F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 62, 112, -0.3F, -0.3F, 2.3F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 50, 112, -0.3F, -0.3F, 2.1F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 36, -0.3F, -0.3F, 3.55F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 10, 114, -0.3F, -0.3F, 3.35F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 48, -0.3F, -0.3F, 4.8F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 46, -0.3F, -0.3F, 4.6F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 61, -0.3F, -0.3F, 6.05F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 59, -0.3F, -0.3F, 5.85F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 81, -0.3F, -0.3F, 7.3F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 79, -0.3F, -0.3F, 7.1F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 96, -0.3F, -0.3F, 8.55F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 91, -0.3F, -0.3F, 8.35F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 108, -0.3F, -0.3F, 9.8F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 114, 106, -0.3F, -0.3F, 9.6F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 16, 116, -0.3F, -0.3F, 11.05F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 10, 116, -0.3F, -0.3F, 10.85F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 45, 116, -0.3F, -0.3F, 12.3F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 41, 116, -0.3F, -0.3F, 12.1F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 116, 73, -0.3F, -0.3F, 13.55F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 69, 116, -0.3F, -0.3F, 13.35F, 1, 1, 1, -0.304F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 117, 43, -0.3F, -0.3F, 14.8F, 1, 1, 1, -0.303F, false));
		gun26_r1.cubeList.add(new ModelBox(gun26_r1, 117, 41, -0.3F, -0.3F, 14.6F, 1, 1, 1, -0.304F, false));

		gun22_r1 = new ModelRenderer(this);
		gun22_r1.setRotationPoint(0.1F, -29.4F, -81.7F);
		gun.addChild(gun22_r1);
		setRotationAngle(gun22_r1, 0.0F, 0.0F, 0.7854F);
		gun22_r1.cubeList.add(new ModelBox(gun22_r1, 0, 76, -0.92F, -0.08F, -0.08F, 1, 1, 75, -0.08F, false));

		gun23_r1 = new ModelRenderer(this);
		gun23_r1.setRotationPoint(-2.1F, -29.4F, -81.7F);
		gun.addChild(gun23_r1);
		setRotationAngle(gun23_r1, 0.0F, 0.0F, -0.7854F);
		gun23_r1.cubeList.add(new ModelBox(gun23_r1, 0, 0, -0.08F, -0.08F, -0.08F, 1, 1, 75, -0.081F, false));

		gun22_r2 = new ModelRenderer(this);
		gun22_r2.setRotationPoint(-2.1F, -30.4F, -81.7F);
		gun.addChild(gun22_r2);
		setRotationAngle(gun22_r2, 0.0F, 0.0F, 0.7854F);
		gun22_r2.cubeList.add(new ModelBox(gun22_r2, 77, 1, -0.08F, -0.92F, -0.08F, 1, 1, 75, -0.081F, false));

		gun21_r1 = new ModelRenderer(this);
		gun21_r1.setRotationPoint(0.1F, -30.4F, -81.7F);
		gun.addChild(gun21_r1);
		setRotationAngle(gun21_r1, 0.0F, 0.0F, -0.7854F);
		gun21_r1.cubeList.add(new ModelBox(gun21_r1, 0, 152, -0.92F, -0.92F, -0.081F, 1, 1, 75, -0.08F, false));

		gun25_r2 = new ModelRenderer(this);
		gun25_r2.setRotationPoint(-2.1F, -30.4F, -27.7F);
		gun.addChild(gun25_r2);
		setRotationAngle(gun25_r2, -0.0055F, -0.0163F, 0.8814F);
		gun25_r2.cubeList.add(new ModelBox(gun25_r2, 70, 269, -0.1F, -0.9F, -0.9F, 1, 1, 21, -0.1F, false));

		gun28_r1 = new ModelRenderer(this);
		gun28_r1.setRotationPoint(-1.5F, -31.0F, -27.7F);
		gun.addChild(gun28_r1);
		setRotationAngle(gun28_r1, 0.0133F, 0.0138F, -0.8203F);
		gun28_r1.cubeList.add(new ModelBox(gun28_r1, 185, 194, -0.9F, -0.1F, -0.9F, 1, 1, 21, -0.1F, false));

		gun27_r1 = new ModelRenderer(this);
		gun27_r1.setRotationPoint(-0.5F, -31.0F, -27.7F);
		gun.addChild(gun27_r1);
		setRotationAngle(gun27_r1, 0.0133F, -0.0138F, 0.8203F);
		gun27_r1.cubeList.add(new ModelBox(gun27_r1, 137, 270, -0.1F, -0.1F, -0.9F, 1, 1, 21, -0.1F, false));

		gun25_r3 = new ModelRenderer(this);
		gun25_r3.setRotationPoint(-1.5F, -31.0F, -27.7F);
		gun.addChild(gun25_r3);
		setRotationAngle(gun25_r3, 0.0192F, 0.0F, 0.0F);
		gun25_r3.cubeList.add(new ModelBox(gun25_r3, 110, 189, 0.0F, 0.0F, 0.0F, 1, 1, 20, -0.001F, false));

		gun24_r1 = new ModelRenderer(this);
		gun24_r1.setRotationPoint(-2.1F, -29.4F, -27.7F);
		gun.addChild(gun24_r1);
		setRotationAngle(gun24_r1, 0.0087F, -0.0148F, 0.0F);
		gun24_r1.cubeList.add(new ModelBox(gun24_r1, 116, 270, 0.0F, -1.0F, 0.0F, 1, 1, 20, -0.001F, false));

		gun24_r2 = new ModelRenderer(this);
		gun24_r2.setRotationPoint(0.1F, -30.4F, -27.7F);
		gun.addChild(gun24_r2);
		setRotationAngle(gun24_r2, -0.0055F, 0.0163F, -0.8814F);
		gun24_r2.cubeList.add(new ModelBox(gun24_r2, 93, 270, -0.9F, -0.9F, -0.9F, 1, 1, 21, -0.1F, false));

		gun23_r2 = new ModelRenderer(this);
		gun23_r2.setRotationPoint(0.1F, -29.4F, -27.7F);
		gun.addChild(gun23_r2);
		setRotationAngle(gun23_r2, 0.0087F, 0.0148F, 0.0F);
		gun23_r2.cubeList.add(new ModelBox(gun23_r2, 261, 270, -1.0F, -1.0F, 0.0F, 1, 1, 20, -0.001F, false));

		gun42_r1 = new ModelRenderer(this);
		gun42_r1.setRotationPoint(-2.3F, -30.2F, 9.35F);
		gun.addChild(gun42_r1);
		setRotationAngle(gun42_r1, -0.3837F, 0.2435F, -0.097F);
		gun42_r1.cubeList.add(new ModelBox(gun42_r1, 0, 79, -0.39F, -0.1F, 0.85F, 1, 1, 2, -0.101F, false));

		gun41_r1 = new ModelRenderer(this);
		gun41_r1.setRotationPoint(0.3F, -30.2F, 9.35F);
		gun.addChild(gun41_r1);
		setRotationAngle(gun41_r1, -0.3837F, -0.2435F, 0.097F);
		gun41_r1.cubeList.add(new ModelBox(gun41_r1, 18, 79, -0.61F, -0.1F, 0.85F, 1, 1, 2, -0.101F, false));

		gun41_r2 = new ModelRenderer(this);
		gun41_r2.setRotationPoint(-2.4F, -30.2F, 9.35F);
		gun.addChild(gun41_r2);
		setRotationAngle(gun41_r2, -0.3726F, 0.065F, -0.0254F);
		gun41_r2.cubeList.add(new ModelBox(gun41_r2, 117, 84, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun40_r1 = new ModelRenderer(this);
		gun40_r1.setRotationPoint(0.4F, -30.2F, 9.35F);
		gun.addChild(gun40_r1);
		setRotationAngle(gun40_r1, -0.3726F, -0.065F, 0.0254F);
		gun40_r1.cubeList.add(new ModelBox(gun40_r1, 117, 88, -1.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun44_r1 = new ModelRenderer(this);
		gun44_r1.setRotationPoint(-1.65F, -29.67F, 9.67F);
		gun.addChild(gun44_r1);
		setRotationAngle(gun44_r1, 1.0297F, 0.0F, 0.0F);
		gun44_r1.cubeList.add(new ModelBox(gun44_r1, 117, 58, -1.0F, 0.0F, 0.0F, 1, 1, 1, -0.3F, false));

		gun44 = new ModelRenderer(this);
		gun44.setRotationPoint(-0.7F, -30.2F, 8.35F);
		gun.addChild(gun44);
		gun44.cubeList.add(new ModelBox(gun44, 37, 79, 0.1F, 0.0F, -1.0F, 1, 1, 2, 0.002F, false));

		gun43 = new ModelRenderer(this);
		gun43.setRotationPoint(-2.3F, -30.2F, 7.35F);
		gun.addChild(gun43);
		gun43.cubeList.add(new ModelBox(gun43, 85, 117, -0.1F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun41 = new ModelRenderer(this);
		gun41.setRotationPoint(-2.0F, -30.2F, 9.35F);
		gun.addChild(gun41);
		setRotationAngle(gun41, -0.3718F, 0.0F, 0.0F);
		gun41.cubeList.add(new ModelBox(gun41, 117, 86, 0.85F, -0.01F, 1.73F, 1, 1, 1, 0.0F, false));
		gun41.cubeList.add(new ModelBox(gun41, 81, 117, 1.05F, -0.11F, 0.83F, 1, 1, 1, -0.1F, false));
		gun41.cubeList.add(new ModelBox(gun41, 117, 80, -0.05F, -0.11F, 0.83F, 1, 1, 1, -0.1F, false));
		gun41.cubeList.add(new ModelBox(gun41, 117, 82, 0.15F, -0.01F, 1.73F, 1, 1, 1, 0.001F, false));

		gun38 = new ModelRenderer(this);
		gun38.setRotationPoint(-1.5F, -24.1F, 8.4F);
		gun.addChild(gun38);
		setRotationAngle(gun38, -1.9333F, 0.0F, 0.0F);
		gun38.cubeList.add(new ModelBox(gun38, 117, 90, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.0F, false));

		gun37 = new ModelRenderer(this);
		gun37.setRotationPoint(-1.5F, -25.0F, 7.3F);
		gun.addChild(gun37);
		setRotationAngle(gun37, 0.1115F, 0.0F, 0.0F);
		gun37.cubeList.add(new ModelBox(gun37, 57, 90, 0.0F, -1.0F, 0.0F, 1, 2, 1, 0.001F, false));

		gun23 = new ModelRenderer(this);
		gun23.setRotationPoint(-2.0F, -30.4F, -81.7F);
		gun.addChild(gun23);
		gun23.cubeList.add(new ModelBox(gun23, 77, 77, -0.1F, 0.0F, 0.0F, 1, 1, 75, 0.0F, false));

		gun21 = new ModelRenderer(this);
		gun21.setRotationPoint(-1.5F, -29.8F, -81.7F);
		gun.addChild(gun21);
		gun21.cubeList.add(new ModelBox(gun21, 154, 0, 0.0F, 0.0F, 0.0F, 1, 1, 75, 0.001F, false));

		gun19 = new ModelRenderer(this);
		gun19.setRotationPoint(-2.4F, -30.6F, 6.95F);
		gun.addChild(gun19);
		setRotationAngle(gun19, 0.0F, 0.0F, -0.7064F);
		gun19.cubeList.add(new ModelBox(gun19, 117, 92, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.003F, false));

		gun18 = new ModelRenderer(this);
		gun18.setRotationPoint(-1.5F, -31.4F, 6.95F);
		gun.addChild(gun18);
		setRotationAngle(gun18, 0.0F, 0.0F, 0.8378F);
		gun18.cubeList.add(new ModelBox(gun18, 93, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun17 = new ModelRenderer(this);
		gun17.setRotationPoint(0.4F, -30.6F, 6.95F);
		gun.addChild(gun17);
		setRotationAngle(gun17, 0.0F, 0.0F, 2.3051F);
		gun17.cubeList.add(new ModelBox(gun17, 97, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.001F, false));

		gun16 = new ModelRenderer(this);
		gun16.setRotationPoint(-0.5F, -31.4F, 6.95F);
		gun.addChild(gun16);
		setRotationAngle(gun16, 0.0F, 0.0F, 0.7436F);
		gun16.cubeList.add(new ModelBox(gun16, 117, 97, 0.0F, 0.0F, 0.0F, 1, 1, 1, -0.002F, false));

		gun15 = new ModelRenderer(this);
		gun15.setRotationPoint(-1.5F, -31.4F, 6.95F);
		gun.addChild(gun15);
		gun15.cubeList.add(new ModelBox(gun15, 117, 99, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun14 = new ModelRenderer(this);
		gun14.setRotationPoint(-2.4F, -30.6F, 2.3F);
		gun.addChild(gun14);
		setRotationAngle(gun14, 0.0F, 0.0F, -0.7064F);
		gun14.cubeList.add(new ModelBox(gun14, 94, 16, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.002F, false));

		gun13 = new ModelRenderer(this);
		gun13.setRotationPoint(-1.5F, -31.4F, 2.3F);
		gun.addChild(gun13);
		setRotationAngle(gun13, 0.0F, 0.0F, 0.8378F);
		gun13.cubeList.add(new ModelBox(gun13, 94, 22, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

		gun12 = new ModelRenderer(this);
		gun12.setRotationPoint(-2.4F, -30.6F, -6.7F);
		gun.addChild(gun12);
		setRotationAngle(gun12, 0.0F, 0.0F, -0.7064F);
		gun12.cubeList.add(new ModelBox(gun12, 114, 8, 0.0F, 0.0F, -1.0F, 1, 1, 3, -0.002F, false));

		gun11 = new ModelRenderer(this);
		gun11.setRotationPoint(-1.5F, -31.4F, -6.7F);
		gun.addChild(gun11);
		setRotationAngle(gun11, 0.0F, 0.0F, 0.8378F);
		gun11.cubeList.add(new ModelBox(gun11, 114, 12, 0.0F, 0.0F, -1.0F, 1, 1, 3, -0.001F, false));

		gun10 = new ModelRenderer(this);
		gun10.setRotationPoint(0.4F, -30.6F, -6.7F);
		gun.addChild(gun10);
		setRotationAngle(gun10, 0.0F, 0.0F, 2.3051F);
		gun10.cubeList.add(new ModelBox(gun10, 77, 36, 0.0F, 0.0F, -1.0F, 1, 1, 15, 0.0F, false));

		gun9 = new ModelRenderer(this);
		gun9.setRotationPoint(-0.5F, -31.4F, 2.3F);
		gun.addChild(gun9);
		setRotationAngle(gun9, 0.0F, 0.0F, 0.7436F);
		gun9.cubeList.add(new ModelBox(gun9, 94, 36, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));

		gun8 = new ModelRenderer(this);
		gun8.setRotationPoint(-1.5F, -31.4F, 2.3F);
		gun.addChild(gun8);
		gun8.cubeList.add(new ModelBox(gun8, 94, 42, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 69, 25, 0.0F, -0.4F, -9.2F, 1, 1, 2, 0.0F, false));
		gun8.cubeList.add(new ModelBox(gun8, 117, 56, 0.0F, -0.4F, -10.0F, 1, 1, 1, 0.001F, false));

		gun7 = new ModelRenderer(this);
		gun7.setRotationPoint(-0.5F, -31.4F, -6.7F);
		gun.addChild(gun7);
		setRotationAngle(gun7, 0.0F, 0.0F, 0.7436F);
		gun7.cubeList.add(new ModelBox(gun7, 114, 17, 0.0F, 0.0F, -1.0F, 1, 1, 3, -0.001F, false));

		gun6 = new ModelRenderer(this);
		gun6.setRotationPoint(-1.5F, -31.4F, -6.7F);
		gun.addChild(gun6);
		gun6.cubeList.add(new ModelBox(gun6, 114, 21, 0.0F, 0.0F, -1.0F, 1, 1, 3, 0.0F, false));

		gun5 = new ModelRenderer(this);
		gun5.setRotationPoint(-2.4F, -30.6F, 6.95F);
		gun.addChild(gun5);
		gun5.cubeList.add(new ModelBox(gun5, 101, 117, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun4 = new ModelRenderer(this);
		gun4.setRotationPoint(-0.6F, -30.6F, 6.95F);
		gun.addChild(gun4);
		gun4.cubeList.add(new ModelBox(gun4, 117, 101, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.001F, false));

		gun3 = new ModelRenderer(this);
		gun3.setRotationPoint(-0.6F, -30.6F, -6.7F);
		gun.addChild(gun3);
		gun3.cubeList.add(new ModelBox(gun3, 77, 52, 0.0F, 0.0F, -1.0F, 1, 1, 15, 0.0F, false));

		gun2 = new ModelRenderer(this);
		gun2.setRotationPoint(-2.4F, -30.6F, -6.7F);
		gun.addChild(gun2);
		gun2.cubeList.add(new ModelBox(gun2, 114, 25, 0.0F, 0.0F, -1.0F, 1, 1, 3, 0.0F, false));

		gun1 = new ModelRenderer(this);
		gun1.setRotationPoint(-2.4F, -30.6F, 2.4F);
		gun.addChild(gun1);
		gun1.cubeList.add(new ModelBox(gun1, 94, 52, 0.0F, 0.0F, 0.0F, 1, 1, 5, 0.0F, false));
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