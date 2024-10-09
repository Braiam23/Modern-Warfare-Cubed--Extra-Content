package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagle extends ModelWithAttachments {
	private final ModelRenderer body;
	private final ModelRenderer Hammer;
	private final ModelRenderer cube_r2_r1;
	private final ModelRenderer cube_r1_r1;
	private final ModelRenderer Grip;
	private final ModelRenderer mainbodygrip;
	private final ModelRenderer cube_r84_r1;
	private final ModelRenderer cube_r84_r2;
	private final ModelRenderer cube_r84_r3;
	private final ModelRenderer cube_r20_r1;
	private final ModelRenderer cube_r20_r2;
	private final ModelRenderer cube_r20_r3;
	private final ModelRenderer cube_r20_r4;
	private final ModelRenderer cube_r17_r1;
	private final ModelRenderer cube_r17_r2;
	private final ModelRenderer cube_r16_r1;
	private final ModelRenderer cube_r15_r1;
	private final ModelRenderer cube_r14_r1;
	private final ModelRenderer cube_r13_r1;
	private final ModelRenderer cube_r12_r1;
	private final ModelRenderer cube_r11_r1;
	private final ModelRenderer cube_r10_r1;
	private final ModelRenderer cube_r9_r1;
	private final ModelRenderer cube_r6_r1;
	private final ModelRenderer cube_r6_r2;
	private final ModelRenderer cube_r5_r1;
	private final ModelRenderer cube_r4_r1;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cubes_r1;
	private final ModelRenderer cubes_r2;
	private final ModelRenderer cubes_r3;
	private final ModelRenderer cubes_r4;
	private final ModelRenderer MagBase;
	private final ModelRenderer cube_r29;
	private final ModelRenderer cube_r30;
	private final ModelRenderer laser_rail;
	private final ModelRenderer cube_r18;
	private final ModelRenderer cube_r19;
	private final ModelRenderer gripitself;
	private final ModelRenderer cube_r7_r1;
	private final ModelRenderer cube_r26_r1;
	private final ModelRenderer cube_r23_r1;
	private final ModelRenderer cube_r22_r1;
	private final ModelRenderer cube_r22_r1_r1;
	private final ModelRenderer cube_r21_r1;
	private final ModelRenderer cube_r21_r2;
	private final ModelRenderer gripitself_r2_r1;
	private final ModelRenderer gripitself_r1_r1;
	private final ModelRenderer cube_r8_r1;
	private final ModelRenderer details;
	private final ModelRenderer details_r1;
	private final ModelRenderer details_r2;
	private final ModelRenderer details_r3;
	private final ModelRenderer details_r4;
	private final ModelRenderer details_r5;
	private final ModelRenderer details_r6;
	private final ModelRenderer details_r7;
	private final ModelRenderer cube_r28;
	private final ModelRenderer Barrel;
	private final ModelRenderer cube_r42_r1;
	private final ModelRenderer cube_r42_r2;
	private final ModelRenderer Barrel_r1;
	private final ModelRenderer cube_r41_r1;
	private final ModelRenderer cube_r41_r2;
	private final ModelRenderer cube_r40_r1;
	private final ModelRenderer cube_r39_r1;
	private final ModelRenderer cube_r38_r1;
	private final ModelRenderer cube_r37_r1;
	private final ModelRenderer cube_r36_r1;
	private final ModelRenderer cube_r35_r1;
	private final ModelRenderer cube_r34_r1;
	private final ModelRenderer cube_r33_r1;
	private final ModelRenderer cube_r31_r1;
	private final ModelRenderer cube_r31_r2;
	private final ModelRenderer cube_r33_r2;
	private final ModelRenderer Barrel_r2;
	private final ModelRenderer Barrel_r3;
	private final ModelRenderer Barrel_r4;
	private final ModelRenderer Barrel_r5;
	private final ModelRenderer Barrel_r6;
	private final ModelRenderer Barrel_r7;
	private final ModelRenderer Barrel_r8;
	private final ModelRenderer Barrel_r9;
	private final ModelRenderer Barrel_r10;
	private final ModelRenderer sightrail;
	private final ModelRenderer cube_r52_r1;
	private final ModelRenderer cube_r51_r1;
	private final ModelRenderer cube_r50_r1;
	private final ModelRenderer cube_r49_r1;
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r46;
	private final ModelRenderer cube_r47;
	private final ModelRenderer cube_r48;

	public DesertEagle() {
		textureWidth = 135;
		textureHeight = 135;

		body = new ModelRenderer(this);
		body.setRotationPoint(-1.4F, 0.6F, -2.7F);
		body.cubeList.add(new ModelBox(body, 0, 23, -0.5F, -15.0F, -33.5F, 1, 2, 3, 0.0F, false));

		Hammer = new ModelRenderer(this);
		Hammer.setRotationPoint(-0.1F, -11.1F, 6.2F);
		body.addChild(Hammer);
		setRotationAngle(Hammer, -1.0908F, 0.0F, 0.0F);
		Hammer.cubeList.add(new ModelBox(Hammer, 11, 36, -0.4F, -3.5F, 0.3F, 1, 4, 1, 0.0F, false));
		Hammer.cubeList.add(new ModelBox(Hammer, 35, 33, -0.4F, -3.5F, 0.5F, 1, 4, 1, -0.001F, false));

		cube_r2_r1 = new ModelRenderer(this);
		cube_r2_r1.setRotationPoint(1.5F, 27.0108F, -23.007F);
		Hammer.addChild(cube_r2_r1);
		setRotationAngle(cube_r2_r1, -0.576F, 0.0F, 0.0F);
		cube_r2_r1.cubeList.add(new ModelBox(cube_r2_r1, 10, 23, -1.9F, -39.8108F, 4.1794F, 1, 4, 1, -0.002F, false));

		cube_r1_r1 = new ModelRenderer(this);
		cube_r1_r1.setRotationPoint(0.1F, -3.3648F, 1.3688F);
		Hammer.addChild(cube_r1_r1);
		setRotationAngle(cube_r1_r1, 0.2618F, 0.0F, 0.0F);
		cube_r1_r1.cubeList.add(new ModelBox(cube_r1_r1, 50, 25, -0.5F, -0.4852F, -1.0F, 1, 1, 2, 0.0F, false));

		Grip = new ModelRenderer(this);
		Grip.setRotationPoint(-0.075F, -1.6F, 0.0F);
		body.addChild(Grip);
		

		mainbodygrip = new ModelRenderer(this);
		mainbodygrip.setRotationPoint(0.6F, 0.0F, 0.0F);
		Grip.addChild(mainbodygrip);
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 28, 0, -3.0F, -8.0F, -14.0F, 5, 2, 20, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 93, 89, -2.4F, -6.0F, -12.4F, 4, 5, 1, -0.001F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 50, 46, -2.4F, -2.0F, -12.8F, 4, 1, 1, -0.002F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 20, 113, -2.4F, -2.0F, -11.4F, 4, 1, 8, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 58, 0, -3.0F, -8.0F, -31.0F, 5, 1, 17, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 113, 103, -2.0F, -9.1F, -33.2F, 3, 1, 3, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 23, 83, -2.002F, -7.0F, 5.4F, 3, 1, 5, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 10, 6, -2.002F, -7.0F, 9.9F, 3, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 0, 67, -3.0F, -8.0F, 5.4F, 5, 1, 3, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 105, 89, -3.0F, -6.0F, -4.2F, 5, 5, 9, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 0, 44, -3.0F, -2.0F, -4.85F, 5, 1, 1, -0.001F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 0, 109, -3.0F, 6.0F, -0.875F, 5, 3, 9, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 0, 0, -2.0F, -6.0F, 4.3F, 3, 5, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 67, 4, -2.0F, -9.0F, 5.9F, 3, 2, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 36, 77, -0.9F, -10.0F, 5.9F, 1, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 62, 69, -1.4F, -10.0F, 5.0F, 1, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 36, 77, -0.7F, -10.0F, 5.0F, 1, 1, 1, 0.0F, false));
		mainbodygrip.cubeList.add(new ModelBox(mainbodygrip, 62, 69, -1.2F, -10.0F, 5.9F, 1, 1, 1, 0.0F, false));

		cube_r84_r1 = new ModelRenderer(this);
		cube_r84_r1.setRotationPoint(0.875F, 27.2605F, 4.5663F);
		mainbodygrip.addChild(cube_r84_r1);
		setRotationAngle(cube_r84_r1, 0.0785F, 0.0F, 0.0F);
		cube_r84_r1.cubeList.add(new ModelBox(cube_r84_r1, 43, 25, -3.9F, -37.0F, 4.2F, 1, 2, 1, -0.01F, false));

		cube_r84_r2 = new ModelRenderer(this);
		cube_r84_r2.setRotationPoint(0.875F, 27.3605F, 4.5663F);
		mainbodygrip.addChild(cube_r84_r2);
		setRotationAngle(cube_r84_r2, 0.0785F, 0.0F, 0.0F);
		cube_r84_r2.cubeList.add(new ModelBox(cube_r84_r2, 44, 0, -3.0F, -38.0F, 4.3F, 1, 2, 1, 0.0F, false));

		cube_r84_r3 = new ModelRenderer(this);
		cube_r84_r3.setRotationPoint(0.875F, 27.3605F, 4.4663F);
		mainbodygrip.addChild(cube_r84_r3);
		setRotationAngle(cube_r84_r3, 0.0785F, 0.0F, 0.0F);
		cube_r84_r3.cubeList.add(new ModelBox(cube_r84_r3, 44, 5, -0.8F, -38.0F, 4.3F, 1, 2, 1, 0.0F, false));

		cube_r20_r1 = new ModelRenderer(this);
		cube_r20_r1.setRotationPoint(1.2554F, 3.464F, -1.8575F);
		mainbodygrip.addChild(cube_r20_r1);
		setRotationAngle(cube_r20_r1, 0.2617F, 0.5315F, 0.1288F);
		cube_r20_r1.cubeList.add(new ModelBox(cube_r20_r1, 18, 29, -0.4554F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r20_r2 = new ModelRenderer(this);
		cube_r20_r2.setRotationPoint(-2.0054F, 3.464F, -2.4575F);
		mainbodygrip.addChild(cube_r20_r2);
		setRotationAngle(cube_r20_r2, 0.2617F, -0.5315F, -0.1288F);
		cube_r20_r2.cubeList.add(new ModelBox(cube_r20_r2, 14, 96, -0.5F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r20_r3 = new ModelRenderer(this);
		cube_r20_r3.setRotationPoint(-2.3054F, 3.464F, -1.8575F);
		mainbodygrip.addChild(cube_r20_r3);
		setRotationAngle(cube_r20_r3, 0.2617F, -0.5315F, -0.1288F);
		cube_r20_r3.cubeList.add(new ModelBox(cube_r20_r3, 18, 54, -0.5446F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r20_r4 = new ModelRenderer(this);
		cube_r20_r4.setRotationPoint(0.9554F, 3.464F, -2.4575F);
		mainbodygrip.addChild(cube_r20_r4);
		setRotationAngle(cube_r20_r4, 0.2617F, 0.5315F, 0.1288F);
		cube_r20_r4.cubeList.add(new ModelBox(cube_r20_r4, 34, 97, -0.5F, -5.0F, -0.7F, 1, 10, 1, 0.0F, false));

		cube_r17_r1 = new ModelRenderer(this);
		cube_r17_r1.setRotationPoint(-0.3F, -5.2517F, -6.0737F);
		mainbodygrip.addChild(cube_r17_r1);
		setRotationAngle(cube_r17_r1, 0.2444F, 0.0F, 0.0F);
		cube_r17_r1.cubeList.add(new ModelBox(cube_r17_r1, 17, 48, -1.0F, -1.0F, -0.5F, 2, 2, 1, 0.0F, false));

		cube_r17_r2 = new ModelRenderer(this);
		cube_r17_r2.setRotationPoint(0.875F, 21.5607F, 11.6742F);
		mainbodygrip.addChild(cube_r17_r2);
		setRotationAngle(cube_r17_r2, 0.3491F, 0.0F, 0.0F);
		cube_r17_r2.cubeList.add(new ModelBox(cube_r17_r2, 17, 48, -2.175F, -32.3F, -8.1F, 2, 2, 1, 0.0F, false));

		cube_r16_r1 = new ModelRenderer(this);
		cube_r16_r1.setRotationPoint(0.875F, 26.922F, -5.0826F);
		mainbodygrip.addChild(cube_r16_r1);
		setRotationAngle(cube_r16_r1, -0.2182F, 0.0F, 0.0F);
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 75, 62, -2.175F, -29.6F, -8.05F, 2, 1, 1, 0.0F, false));
		cube_r16_r1.cubeList.add(new ModelBox(cube_r16_r1, 31, 76, -2.175F, -30.6F, -8.05F, 2, 1, 1, 0.0F, false));

		cube_r15_r1 = new ModelRenderer(this);
		cube_r15_r1.setRotationPoint(0.875F, 27.7035F, -21.7874F);
		mainbodygrip.addChild(cube_r15_r1);
		setRotationAngle(cube_r15_r1, -0.7854F, 0.0F, 0.0F);
		cube_r15_r1.cubeList.add(new ModelBox(cube_r15_r1, 35, 44, -3.275F, -28.35F, -14.65F, 4, 1, 1, -0.002F, false));

		cube_r14_r1 = new ModelRenderer(this);
		cube_r14_r1.setRotationPoint(0.875F, 28.6875F, -16.2792F);
		mainbodygrip.addChild(cube_r14_r1);
		setRotationAngle(cube_r14_r1, -0.5672F, 0.0F, 0.0F);
		cube_r14_r1.cubeList.add(new ModelBox(cube_r14_r1, 114, 15, -3.275F, -32.475F, -14.625F, 4, 2, 1, 0.0F, false));

		cube_r13_r1 = new ModelRenderer(this);
		cube_r13_r1.setRotationPoint(0.875F, 14.0736F, 15.4199F);
		mainbodygrip.addChild(cube_r13_r1);
		setRotationAngle(cube_r13_r1, 0.5672F, 0.0F, 0.0F);
		cube_r13_r1.cubeList.add(new ModelBox(cube_r13_r1, 114, 51, -3.275F, -32.475F, -13.575F, 4, 2, 1, 0.0F, false));

		cube_r12_r1 = new ModelRenderer(this);
		cube_r12_r1.setRotationPoint(0.875F, 21.5054F, -8.7594F);
		mainbodygrip.addChild(cube_r12_r1);
		setRotationAngle(cube_r12_r1, -0.3316F, 0.0F, 0.0F);
		cube_r12_r1.cubeList.add(new ModelBox(cube_r12_r1, 68, 113, -2.975F, -33.5F, 6.6F, 3, 1, 3, 0.0F, false));

		cube_r11_r1 = new ModelRenderer(this);
		cube_r11_r1.setRotationPoint(-1.9459F, 21.4984F, -8.7801F);
		mainbodygrip.addChild(cube_r11_r1);
		setRotationAngle(cube_r11_r1, -0.3502F, 0.3211F, -0.1148F);
		cube_r11_r1.cubeList.add(new ModelBox(cube_r11_r1, 0, 48, -3.211F, -33.5F, 5.9007F, 1, 1, 3, -0.002F, false));

		cube_r10_r1 = new ModelRenderer(this);
		cube_r10_r1.setRotationPoint(3.6959F, 21.4984F, -8.7801F);
		mainbodygrip.addChild(cube_r10_r1);
		setRotationAngle(cube_r10_r1, -0.3502F, -0.3211F, 0.1148F);
		cube_r10_r1.cubeList.add(new ModelBox(cube_r10_r1, 0, 52, -0.439F, -33.5F, 6.8007F, 1, 1, 3, -0.002F, false));

		cube_r9_r1 = new ModelRenderer(this);
		cube_r9_r1.setRotationPoint(0.875F, 23.5427F, 11.7789F);
		mainbodygrip.addChild(cube_r9_r1);
		setRotationAngle(cube_r9_r1, 0.4014F, 0.0F, 0.0F);
		cube_r9_r1.cubeList.add(new ModelBox(cube_r9_r1, 40, 91, -3.875F, -28.7F, 2.8F, 5, 9, 1, 0.0F, false));

		cube_r6_r1 = new ModelRenderer(this);
		cube_r6_r1.setRotationPoint(0.875F, 23.2692F, 11.7233F);
		mainbodygrip.addChild(cube_r6_r1);
		setRotationAngle(cube_r6_r1, 0.4014F, 0.0F, 0.0F);
		cube_r6_r1.cubeList.add(new ModelBox(cube_r6_r1, 50, 43, -3.275F, -19.3F, -5.9F, 4, 1, 1, 0.0F, false));

		cube_r6_r2 = new ModelRenderer(this);
		cube_r6_r2.setRotationPoint(-0.5F, 3.2727F, -2.8477F);
		mainbodygrip.addChild(cube_r6_r2);
		setRotationAngle(cube_r6_r2, 0.2269F, 0.0F, 0.0F);
		cube_r6_r2.cubeList.add(new ModelBox(cube_r6_r2, 52, 91, -1.5F, -4.5F, -0.5F, 3, 10, 2, 0.0F, false));

		cube_r5_r1 = new ModelRenderer(this);
		cube_r5_r1.setRotationPoint(0.875F, 20.3223F, 16.3063F);
		mainbodygrip.addChild(cube_r5_r1);
		setRotationAngle(cube_r5_r1, 0.6109F, 0.0F, 0.0F);
		cube_r5_r1.cubeList.add(new ModelBox(cube_r5_r1, 98, 85, -3.875F, -34.2F, -2.5F, 5, 2, 1, -0.002F, false));

		cube_r4_r1 = new ModelRenderer(this);
		cube_r4_r1.setRotationPoint(0.875F, 15.4095F, 21.0104F);
		mainbodygrip.addChild(cube_r4_r1);
		setRotationAngle(cube_r4_r1, 0.8727F, 0.0F, 0.0F);
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 43, 23, -3.875F, -31.4F, -4.0F, 5, 1, 1, 0.0F, false));
		cube_r4_r1.cubeList.add(new ModelBox(cube_r4_r1, 75, 65, -3.875F, -31.4F, -3.5F, 5, 1, 2, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(0.875F, 16.3126F, 20.3172F);
		mainbodygrip.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.829F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 0, 82, -2.875F, -26.9F, 3.1F, 3, 2, 5, 0.0F, false));

		cubes_r1 = new ModelRenderer(this);
		cubes_r1.setRotationPoint(-0.5F, 1.5F, 2.2F);
		mainbodygrip.addChild(cubes_r1);
		setRotationAngle(cubes_r1, 0.288F, 0.0F, 0.0F);
		cubes_r1.cubeList.add(new ModelBox(cubes_r1, 46, 73, -2.5F, -2.5F, 2.5F, 5, 9, 1, -0.001F, false));

		cubes_r2 = new ModelRenderer(this);
		cubes_r2.setRotationPoint(-0.5F, 1.5F, 1.9F);
		mainbodygrip.addChild(cubes_r2);
		setRotationAngle(cubes_r2, 0.288F, 0.0F, 0.0F);
		cubes_r2.cubeList.add(new ModelBox(cubes_r2, 60, 73, -2.5F, -2.5F, 2.5F, 5, 9, 1, -0.001F, false));

		cubes_r3 = new ModelRenderer(this);
		cubes_r3.setRotationPoint(-0.5F, -0.8929F, -2.9303F);
		mainbodygrip.addChild(cubes_r3);
		setRotationAngle(cubes_r3, 0.6807F, 0.0F, 0.0F);
		cubes_r3.cubeList.add(new ModelBox(cubes_r3, 103, 55, -2.5F, -0.5F, -0.5F, 5, 2, 1, -0.001F, false));

		cubes_r4 = new ModelRenderer(this);
		cubes_r4.setRotationPoint(-0.5F, 1.5F, 1.3F);
		mainbodygrip.addChild(cubes_r4);
		setRotationAngle(cubes_r4, 0.2182F, 0.0F, 0.0F);
		cubes_r4.cubeList.add(new ModelBox(cubes_r4, 85, 0, -2.5F, -3.5F, -3.5F, 5, 10, 7, 0.0F, false));

		MagBase = new ModelRenderer(this);
		MagBase.setRotationPoint(-0.625F, 10.0F, 3.0F);
		mainbodygrip.addChild(MagBase);
		MagBase.cubeList.add(new ModelBox(MagBase, 96, 110, -2.35F, -1.4F, -4.0F, 5, 2, 8, 0.0F, false));
		MagBase.cubeList.add(new ModelBox(MagBase, 50, 69, -2.35F, -0.4F, -5.8F, 5, 1, 2, -0.002F, false));
		MagBase.cubeList.add(new ModelBox(MagBase, 40, 101, -2.35F, -1.4F, 2.8F, 5, 2, 2, -0.002F, false));

		cube_r29 = new ModelRenderer(this);
		cube_r29.setRotationPoint(0.0F, 0.0F, 0.0F);
		MagBase.addChild(cube_r29);
		setRotationAngle(cube_r29, 0.9599F, 0.0F, 0.0F);
		cube_r29.cubeList.add(new ModelBox(cube_r29, 110, 84, -1.85F, 2.2F, 2.4F, 4, 2, 2, 0.0F, false));

		cube_r30 = new ModelRenderer(this);
		cube_r30.setRotationPoint(0.0F, 0.0F, 0.0F);
		MagBase.addChild(cube_r30);
		setRotationAngle(cube_r30, -0.2618F, 0.0F, 0.0F);
		cube_r30.cubeList.add(new ModelBox(cube_r30, 20, 99, -2.35F, -0.4F, -5.7F, 5, 2, 2, -0.003F, false));
		cube_r30.cubeList.add(new ModelBox(cube_r30, 95, 32, -2.35F, -0.8F, -5.7F, 5, 2, 2, 0.0F, false));

		laser_rail = new ModelRenderer(this);
		laser_rail.setRotationPoint(0.5038F, -6.3972F, -15.5F);
		Grip.addChild(laser_rail);
		laser_rail.cubeList.add(new ModelBox(laser_rail, 75, 28, -1.8038F, -0.4028F, 0.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 0, 75, -1.8038F, -0.4028F, -5.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 75, 22, -1.8038F, -0.4028F, -3.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 68, 18, -1.8038F, -0.4028F, -9.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 74, 18, -1.8038F, -0.4028F, -7.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 10, 54, -1.8038F, -0.4028F, -13.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 67, 62, -1.8038F, -0.4028F, -11.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 75, 30, -1.8038F, -0.4028F, -15.5F, 2, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 89, 23, -0.2038F, -0.4028F, -13.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 89, 29, -0.2038F, -0.4028F, -11.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 89, 31, -0.2038F, -0.4028F, -9.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 90, 85, -0.2038F, -0.4028F, -7.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 73, 91, -0.2038F, -0.4028F, -5.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 0, 93, -0.2038F, -0.4028F, -3.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 20, 93, -0.2038F, -0.4028F, -1.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 93, 65, -0.2038F, -0.4028F, 0.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 79, 94, -0.2038F, -0.4028F, -15.5F, 1, 1, 1, 0.0F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 23, 73, -2.0038F, -1.0028F, -15.5F, 3, 1, 17, -0.001F, false));
		laser_rail.cubeList.add(new ModelBox(laser_rail, 75, 26, -1.8038F, -0.4028F, -1.5F, 2, 1, 1, 0.0F, false));

		cube_r18 = new ModelRenderer(this);
		cube_r18.setRotationPoint(2.4462F, 0.0972F, 0.0F);
		laser_rail.addChild(cube_r18);
		setRotationAngle(cube_r18, 0.0F, 0.0F, -0.7854F);
		cube_r18.cubeList.add(new ModelBox(cube_r18, 54, 103, -3.3621F, -3.6621F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 103, 52, -3.3621F, -3.6621F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 103, 37, -3.3621F, -3.6621F, -15.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 28, 103, -3.3621F, -3.6621F, -11.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 20, 103, -3.3621F, -3.6621F, -13.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 103, 19, -3.3621F, -3.6621F, -7.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 85, 102, -3.3621F, -3.6621F, -9.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 79, 102, -3.3621F, -3.6621F, -3.5F, 1, 1, 1, 0.0F, false));
		cube_r18.cubeList.add(new ModelBox(cube_r18, 102, 65, -3.3621F, -3.6621F, -5.5F, 1, 1, 1, 0.0F, false));

		cube_r19 = new ModelRenderer(this);
		cube_r19.setRotationPoint(0.5038F, -0.0972F, 0.0F);
		laser_rail.addChild(cube_r19);
		setRotationAngle(cube_r19, 0.0F, 0.0F, 0.7854F);
		cube_r19.cubeList.add(new ModelBox(cube_r19, 102, 5, -0.2879F, -0.7121F, 0.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 102, 2, -0.2879F, -0.7121F, -1.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 102, 0, -0.2879F, -0.7121F, -15.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 65, 101, -0.2879F, -0.7121F, -11.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 101, 29, -0.2879F, -0.7121F, -13.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 101, 27, -0.2879F, -0.7121F, -7.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 101, 25, -0.2879F, -0.7121F, -9.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 101, 23, -0.2879F, -0.7121F, -3.5F, 1, 1, 1, 0.0F, false));
		cube_r19.cubeList.add(new ModelBox(cube_r19, 101, 21, -0.2879F, -0.7121F, -5.5F, 1, 1, 1, 0.0F, false));

		gripitself = new ModelRenderer(this);
		gripitself.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(gripitself);
		gripitself.cubeList.add(new ModelBox(gripitself, 23, 73, 1.95F, -6.1F, -2.8F, 1, 4, 6, 0.0F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 17, 23, 1.95F, -7.4F, 1.0F, 1, 2, 2, -0.001F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 0, 23, 1.95F, 3.6F, -1.2F, 1, 5, 8, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 0, 48, 1.95F, 0.7F, -1.9F, 1, 3, 8, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 25, 33, -2.7F, 0.7F, -1.9F, 1, 3, 8, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 28, 10, 1.95F, -2.2F, -2.4F, 1, 3, 7, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 0, 72, -2.7F, -3.2F, -1.4F, 1, 4, 6, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 88, 46, -2.7F, 6.6F, 6.8F, 1, 2, 1, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 88, 26, 1.95F, 6.6F, 6.8F, 1, 2, 1, -0.003F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 42, 33, -2.7F, -7.4F, 0.8F, 1, 2, 2, -0.001F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 0, 0, -2.7F, 3.6F, -1.2F, 1, 5, 8, -0.002F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 88, 18, -2.7F, 7.0F, 7.1F, 1, 2, 1, 0.0F, false));
		gripitself.cubeList.add(new ModelBox(gripitself, 65, 88, -2.7F, -6.2F, -2.8F, 1, 3, 6, 0.0F, false));

		cube_r7_r1 = new ModelRenderer(this);
		cube_r7_r1.setRotationPoint(1.475F, 25.4138F, 5.7469F);
		gripitself.addChild(cube_r7_r1);
		setRotationAngle(cube_r7_r1, 0.1571F, 0.0F, 0.0F);
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 35, 39, -3.875F, -16.85F, 4.525F, 5, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 87, 73, -4.175F, -18.35F, 4.525F, 1, 2, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 25, 44, -3.425F, -16.85F, 4.825F, 4, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 44, 111, -3.425F, -18.35F, 4.825F, 4, 2, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 99, 95, 0.475F, -16.85F, 4.575F, 1, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 87, 81, 0.475F, -18.35F, 4.575F, 1, 2, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 99, 97, -4.175F, -16.85F, 4.525F, 1, 1, 1, 0.0F, false));
		cube_r7_r1.cubeList.add(new ModelBox(cube_r7_r1, 36, 29, -3.875F, -18.35F, 4.525F, 5, 2, 1, 0.0F, false));

		cube_r26_r1 = new ModelRenderer(this);
		cube_r26_r1.setRotationPoint(1.475F, 24.4463F, 9.0149F);
		gripitself.addChild(cube_r26_r1);
		setRotationAngle(cube_r26_r1, 0.288F, 0.0F, 0.0F);
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 75, 56, 0.475F, -20.4F, 3.475F, 1, 3, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 78, 69, -4.175F, -20.4F, 3.475F, 1, 3, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 78, 77, 0.475F, -20.4F, 2.775F, 1, 3, 1, -0.003F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 69, 108, -3.425F, -20.4F, 3.775F, 4, 3, 1, 0.0F, false));
		cube_r26_r1.cubeList.add(new ModelBox(cube_r26_r1, 13, 81, -4.175F, -20.4F, 2.775F, 1, 3, 1, -0.001F, false));

		cube_r23_r1 = new ModelRenderer(this);
		cube_r23_r1.setRotationPoint(1.475F, 8.1642F, 24.7434F);
		gripitself.addChild(cube_r23_r1);
		setRotationAngle(cube_r23_r1, 1.1868F, 0.0F, 0.0F);
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 99, 99, -4.175F, -29.8F, -0.15F, 1, 1, 1, -0.002F, false));
		cube_r23_r1.cubeList.add(new ModelBox(cube_r23_r1, 85, 100, -4.175F, -29.0F, -1.1F, 1, 1, 1, 0.0F, false));

		cube_r22_r1 = new ModelRenderer(this);
		cube_r22_r1.setRotationPoint(1.475F, 25.1978F, 6.6301F);
		gripitself.addChild(cube_r22_r1);
		setRotationAngle(cube_r22_r1, 0.192F, 0.0F, 0.0F);
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 93, 100, -4.175F, -32.625F, -4.25F, 1, 1, 1, 0.0F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 0, 101, -4.175F, -32.625F, -4.4F, 1, 1, 1, 0.0F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 0, 13, -4.175F, -32.3F, -4.4F, 1, 3, 2, -0.002F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 95, 19, -4.175F, -28.3F, -4.4F, 1, 10, 2, -0.0015F, false));
		cube_r22_r1.cubeList.add(new ModelBox(cube_r22_r1, 18, 0, 0.475F, -32.3F, -4.4F, 1, 14, 1, -0.0015F, false));

		cube_r22_r1_r1 = new ModelRenderer(this);
		cube_r22_r1_r1.setRotationPoint(1.475F, 21.2856F, 14.7417F);
		gripitself.addChild(cube_r22_r1_r1);
		setRotationAngle(cube_r22_r1_r1, 0.4713F, 0.0F, 0.0F);
		cube_r22_r1_r1.cubeList.add(new ModelBox(cube_r22_r1_r1, 9, 101, 0.475F, -32.425F, -4.2F, 1, 1, 1, -0.0025F, false));

		cube_r21_r1 = new ModelRenderer(this);
		cube_r21_r1.setRotationPoint(1.475F, 23.2692F, 11.7233F);
		gripitself.addChild(cube_r21_r1);
		setRotationAngle(cube_r21_r1, 0.4014F, 0.0F, 0.0F);
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 10, 0, -4.175F, -31.7F, -2.9F, 1, 3, 3, -0.002F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 37, 10, -3.425F, -25.7F, 3.1F, 4, 6, 1, 0.0F, false));
		cube_r21_r1.cubeList.add(new ModelBox(cube_r21_r1, 98, 65, -4.175F, -31.7F, 1.8F, 1, 12, 2, -0.001F, false));

		cube_r21_r2 = new ModelRenderer(this);
		cube_r21_r2.setRotationPoint(2.45F, -1.482F, 4.3595F);
		gripitself.addChild(cube_r21_r2);
		setRotationAngle(cube_r21_r2, 0.3839F, 0.0F, 0.0F);
		cube_r21_r2.cubeList.add(new ModelBox(cube_r21_r2, 105, 37, -0.5F, -6.0F, -1.0F, 1, 12, 2, -0.001F, false));

		gripitself_r2_r1 = new ModelRenderer(this);
		gripitself_r2_r1.setRotationPoint(5.1398F, 25.8405F, 1.7F);
		gripitself.addChild(gripitself_r2_r1);
		setRotationAngle(gripitself_r2_r1, 0.0F, 0.0F, -0.2094F);
		gripitself_r2_r1.cubeList.add(new ModelBox(gripitself_r2_r1, 25, 23, 0.5735F, -18.0174F, -2.9F, 1, 1, 9, -0.001F, false));

		gripitself_r1_r1 = new ModelRenderer(this);
		gripitself_r1_r1.setRotationPoint(-2.2431F, 26.3817F, 1.7F);
		gripitself.addChild(gripitself_r1_r1);
		setRotationAngle(gripitself_r1_r1, 0.0F, 0.0F, 0.2094F);
		gripitself_r1_r1.cubeList.add(new ModelBox(gripitself_r1_r1, 28, 0, -4.275F, -18.0F, -2.9F, 1, 1, 9, -0.001F, false));

		cube_r8_r1 = new ModelRenderer(this);
		cube_r8_r1.setRotationPoint(1.475F, 24.4463F, 9.7149F);
		gripitself.addChild(cube_r8_r1);
		setRotationAngle(cube_r8_r1, 0.288F, 0.0F, 0.0F);
		cube_r8_r1.cubeList.add(new ModelBox(cube_r8_r1, 109, 32, -3.875F, -20.4F, 2.775F, 5, 3, 1, 0.0F, false));

		details = new ModelRenderer(this);
		details.setRotationPoint(0.0F, 0.0F, 0.0F);
		Grip.addChild(details);
		details.cubeList.add(new ModelBox(details, 99, 41, 1.8F, -7.9F, -0.8F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 99, 39, 1.8F, -7.9F, -0.2F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 0, 59, 1.8F, -7.3F, -6.2F, 1, 1, 7, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 66, 65, -2.9F, -8.0F, -11.8F, 1, 1, 2, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 34, 66, -2.9F, -7.8F, -11.1F, 1, 1, 2, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 99, 19, -2.6F, -7.8F, -11.5F, 1, 1, 1, 0.0F, false));
		details.cubeList.add(new ModelBox(details, 9, 99, -2.7F, -7.0F, -12.1F, 1, 1, 1, 0.0F, false));

		details_r1 = new ModelRenderer(this);
		details_r1.setRotationPoint(-2.05F, -2.0F, -4.3F);
		details.addChild(details_r1);
		setRotationAngle(details_r1, 0.7854F, 0.0F, 0.0F);
		details_r1.cubeList.add(new ModelBox(details_r1, 99, 37, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		details_r2 = new ModelRenderer(this);
		details_r2.setRotationPoint(2.7F, -6.7F, -1.2F);
		details.addChild(details_r2);
		setRotationAngle(details_r2, 0.0F, 0.0F, -0.6981F);
		details_r2.cubeList.add(new ModelBox(details_r2, 93, 98, -0.5F, -0.5F, -2.0F, 1, 1, 4, -0.1F, false));

		details_r3 = new ModelRenderer(this);
		details_r3.setRotationPoint(2.7F, -6.8F, -5.7F);
		details.addChild(details_r3);
		setRotationAngle(details_r3, -0.7854F, 0.0F, 0.0F);
		details_r3.cubeList.add(new ModelBox(details_r3, 106, 5, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.16F, false));

		details_r4 = new ModelRenderer(this);
		details_r4.setRotationPoint(2.0F, -7.0F, -12.7F);
		details.addChild(details_r4);
		setRotationAngle(details_r4, -0.6981F, 0.0F, 0.0F);
		details_r4.cubeList.add(new ModelBox(details_r4, 99, 52, -0.475F, -0.5F, -0.5F, 1, 1, 1, 0.1F, false));

		details_r5 = new ModelRenderer(this);
		details_r5.setRotationPoint(1.9F, -5.4F, -11.9F);
		details.addChild(details_r5);
		setRotationAngle(details_r5, -0.6981F, 0.0F, 0.0F);
		details_r5.cubeList.add(new ModelBox(details_r5, 99, 62, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.05F, false));

		details_r6 = new ModelRenderer(this);
		details_r6.setRotationPoint(-1.6F, -5.4F, -11.8F);
		details.addChild(details_r6);
		setRotationAngle(details_r6, 0.7802F, -0.098F, -0.0155F);
		details_r6.cubeList.add(new ModelBox(details_r6, 65, 99, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.05F, false));

		details_r7 = new ModelRenderer(this);
		details_r7.setRotationPoint(2.3F, -2.0F, -4.3F);
		details.addChild(details_r7);
		setRotationAngle(details_r7, -0.7854F, 0.0F, 0.0F);
		details_r7.cubeList.add(new ModelBox(details_r7, 73, 99, -0.5F, -0.5F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r28 = new ModelRenderer(this);
		cube_r28.setRotationPoint(-2.5F, -6.6F, -11.6F);
		details.addChild(cube_r28);
		setRotationAngle(cube_r28, -0.7854F, 0.0F, 0.0F);
		cube_r28.cubeList.add(new ModelBox(cube_r28, 0, 99, -0.1F, -0.975F, -0.2F, 1, 1, 1, 0.0F, false));
		cube_r28.cubeList.add(new ModelBox(cube_r28, 93, 98, -0.1F, -1.2F, -0.2F, 1, 1, 1, 0.0F, false));

		Barrel = new ModelRenderer(this);
		Barrel.setRotationPoint(-0.1F, -13.6F, -11.0F);
		body.addChild(Barrel);
		Barrel.cubeList.add(new ModelBox(Barrel, 58, 10, -0.9F, -2.69F, -2.5F, 2, 1, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 72, -1.4F, -1.6F, -19.475F, 3, 1, 17, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 99, -0.9F, -2.25F, -23.475F, 2, 1, 5, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 91, 37, 1.35F, -1.2F, -2.5F, 1, 2, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 20, 91, -2.2F, -1.2F, -2.5F, 1, 2, 6, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 73, 97, 1.6F, 3.0F, -22.5F, 1, 1, 4, -0.001F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 28, 91, 1.6F, 1.7F, -22.5F, 1, 2, 4, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 8, 90, -2.4F, 1.7F, -22.5F, 1, 2, 4, -0.003F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 6, -1.4F, 0.8F, -23.5F, 3, 1, 1, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 73, 89, -2.4F, 3.0F, -22.5F, 1, 1, 4, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 90, 1.125F, 2.3F, -19.0F, 1, 1, 18, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 78, 70, -1.825F, 2.3F, -19.0F, 1, 1, 18, 0.0F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 0, 0, -1.4F, 0.4F, -23.5F, 3, 1, 22, -0.002F, false));
		Barrel.cubeList.add(new ModelBox(Barrel, 54, 69, -1.4F, -0.2F, -19.6F, 3, 1, 18, -0.003F, false));

		cube_r42_r1 = new ModelRenderer(this);
		cube_r42_r1.setRotationPoint(1.5055F, -1.6696F, 0.5F);
		Barrel.addChild(cube_r42_r1);
		setRotationAngle(cube_r42_r1, 0.0F, 0.0F, 1.0646F);
		cube_r42_r1.cubeList.add(new ModelBox(cube_r42_r1, 9, 59, -0.1755F, -0.5104F, -3.0F, 1, 1, 6, 0.0F, false));

		cube_r42_r2 = new ModelRenderer(this);
		cube_r42_r2.setRotationPoint(1.4055F, -1.8696F, 0.5F);
		Barrel.addChild(cube_r42_r2);
		setRotationAngle(cube_r42_r2, 0.0F, 0.0F, 1.0646F);
		cube_r42_r2.cubeList.add(new ModelBox(cube_r42_r2, 59, 58, -0.1755F, -0.5104F, -3.0F, 1, 1, 6, 0.0F, false));

		Barrel_r1 = new ModelRenderer(this);
		Barrel_r1.setRotationPoint(1.28F, -2.2F, 0.6F);
		Barrel.addChild(Barrel_r1);
		setRotationAngle(Barrel_r1, 0.0F, 0.0F, 0.5585F);
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 79, 98, -0.52F, -0.415F, 2.0F, 1, 1, 1, -0.1F, false));
		Barrel_r1.cubeList.add(new ModelBox(Barrel_r1, 85, 98, -0.52F, -0.415F, -3.2F, 1, 1, 6, -0.1F, false));

		cube_r41_r1 = new ModelRenderer(this);
		cube_r41_r1.setRotationPoint(1.95F, -0.0446F, -2.4423F);
		Barrel.addChild(cube_r41_r1);
		setRotationAngle(cube_r41_r1, 1.021F, 0.0F, 0.0F);
		cube_r41_r1.cubeList.add(new ModelBox(cube_r41_r1, 0, 72, -0.5F, -0.5F, -1.0F, 1, 1, 2, -0.101F, false));
		cube_r41_r1.cubeList.add(new ModelBox(cube_r41_r1, 68, 13, -4.24F, -0.5F, -1.0F, 1, 1, 2, -0.1F, false));

		cube_r41_r2 = new ModelRenderer(this);
		cube_r41_r2.setRotationPoint(-1.75F, 0.724F, -3.2801F);
		Barrel.addChild(cube_r41_r2);
		setRotationAngle(cube_r41_r2, 0.2182F, 0.0F, 0.0F);
		cube_r41_r2.cubeList.add(new ModelBox(cube_r41_r2, 28, 5, -0.54F, -0.5F, -2.5F, 1, 1, 3, -0.1F, false));
		cube_r41_r2.cubeList.add(new ModelBox(cube_r41_r2, 39, 5, 3.2F, -0.5F, -2.5F, 1, 1, 3, -0.1F, false));

		cube_r40_r1 = new ModelRenderer(this);
		cube_r40_r1.setRotationPoint(26.4877F, 28.6514F, 12.8F);
		Barrel.addChild(cube_r40_r1);
		setRotationAngle(cube_r40_r1, 0.0F, 0.0F, -0.7243F);
		cube_r40_r1.cubeList.add(new ModelBox(cube_r40_r1, 98, 79, -0.71F, -38.0F, -36.3F, 1, 1, 1, -0.002F, false));

		cube_r39_r1 = new ModelRenderer(this);
		cube_r39_r1.setRotationPoint(9.481F, 36.8629F, 12.8F);
		Barrel.addChild(cube_r39_r1);
		setRotationAngle(cube_r39_r1, 0.0F, 0.0F, -0.2182F);
		cube_r39_r1.cubeList.add(new ModelBox(cube_r39_r1, 11, 36, -0.3F, -36.85F, -36.3F, 1, 1, 5, 0.0F, false));

		cube_r38_r1 = new ModelRenderer(this);
		cube_r38_r1.setRotationPoint(1.5F, 21.5976F, 23.8259F);
		Barrel.addChild(cube_r38_r1);
		setRotationAngle(cube_r38_r1, 0.4014F, 0.0F, 0.0F);
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 12, 44, -3.9F, -36.7F, -35.8F, 4, 1, 1, 0.0F, false));
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 103, 58, -3.9F, -36.3F, -35.8F, 4, 2, 1, -0.001F, false));
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 44, 17, 0.1F, -36.3F, -35.8F, 1, 2, 1, 0.0F, false));
		cube_r38_r1.cubeList.add(new ModelBox(cube_r38_r1, 34, 86, 0.1F, -36.7F, -35.8F, 1, 1, 1, 0.0F, false));

		cube_r37_r1 = new ModelRenderer(this);
		cube_r37_r1.setRotationPoint(-4.4604F, 37.9244F, 12.8F);
		Barrel.addChild(cube_r37_r1);
		setRotationAngle(cube_r37_r1, 0.0F, 0.0F, 0.1571F);
		cube_r37_r1.cubeList.add(new ModelBox(cube_r37_r1, 44, 41, -3.0F, -39.4F, -36.3F, 1, 3, 1, 0.0F, false));

		cube_r36_r1 = new ModelRenderer(this);
		cube_r36_r1.setRotationPoint(6.4444F, 37.6366F, 12.8F);
		Barrel.addChild(cube_r36_r1);
		setRotationAngle(cube_r36_r1, 0.0F, 0.0F, -0.1309F);
		cube_r36_r1.cubeList.add(new ModelBox(cube_r36_r1, 75, 48, -0.8F, -39.4F, -36.3F, 1, 3, 1, 0.0F, false));

		cube_r35_r1 = new ModelRenderer(this);
		cube_r35_r1.setRotationPoint(-6.5474F, 37.469F, 12.8F);
		Barrel.addChild(cube_r35_r1);
		setRotationAngle(cube_r35_r1, 0.0F, 0.0F, 0.2182F);
		cube_r35_r1.cubeList.add(new ModelBox(cube_r35_r1, 36, 23, -3.5F, -36.85F, -36.3F, 1, 1, 5, 0.0F, false));

		cube_r34_r1 = new ModelRenderer(this);
		cube_r34_r1.setRotationPoint(-23.6171F, 29.6965F, 12.8F);
		Barrel.addChild(cube_r34_r1);
		setRotationAngle(cube_r34_r1, 0.0F, 0.0F, 0.7243F);
		cube_r34_r1.cubeList.add(new ModelBox(cube_r34_r1, 98, 81, -3.0F, -37.01F, -36.3F, 1, 1, 1, 0.0F, false));

		cube_r33_r1 = new ModelRenderer(this);
		cube_r33_r1.setRotationPoint(1.3422F, -0.418F, -24.0F);
		Barrel.addChild(cube_r33_r1);
		setRotationAngle(cube_r33_r1, 0.0F, 0.0F, -0.2531F);
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 99, 104, -0.4922F, -0.2946F, 1.5F, 1, 2, 4, 0.0F, false));
		cube_r33_r1.cubeList.add(new ModelBox(cube_r33_r1, 86, 91, -0.4972F, -0.2946F, 4.5F, 1, 2, 17, 0.0F, false));

		cube_r31_r1 = new ModelRenderer(this);
		cube_r31_r1.setRotationPoint(1.2422F, -0.818F, -24.0F);
		Barrel.addChild(cube_r31_r1);
		setRotationAngle(cube_r31_r1, 0.0F, 0.0F, -0.2531F);
		cube_r31_r1.cubeList.add(new ModelBox(cube_r31_r1, 108, 50, -0.4922F, -0.7054F, 1.5F, 1, 1, 4, 0.0F, false));
		cube_r31_r1.cubeList.add(new ModelBox(cube_r31_r1, 95, 37, -0.4976F, -0.7054F, 4.5F, 1, 1, 17, 0.0F, false));

		cube_r31_r2 = new ModelRenderer(this);
		cube_r31_r2.setRotationPoint(-1.0422F, -0.818F, -14.0F);
		Barrel.addChild(cube_r31_r2);
		setRotationAngle(cube_r31_r2, 0.0F, 0.0F, 0.2531F);
		cube_r31_r2.cubeList.add(new ModelBox(cube_r31_r2, 108, 14, -0.5024F, -0.7054F, -8.5F, 1, 1, 4, 0.0F, false));
		cube_r31_r2.cubeList.add(new ModelBox(cube_r31_r2, 95, 1, -0.5024F, -0.7054F, -5.5F, 1, 1, 17, 0.0F, false));

		cube_r33_r2 = new ModelRenderer(this);
		cube_r33_r2.setRotationPoint(-1.1422F, -0.418F, -14.0F);
		Barrel.addChild(cube_r33_r2);
		setRotationAngle(cube_r33_r2, 0.0F, 0.0F, 0.2531F);
		cube_r33_r2.cubeList.add(new ModelBox(cube_r33_r2, 34, 105, -0.5078F, -0.2946F, -8.5F, 1, 2, 4, 0.0F, false));
		cube_r33_r2.cubeList.add(new ModelBox(cube_r33_r2, 21, 92, -0.5028F, -0.2946F, -5.5F, 1, 2, 17, 0.0F, false));

		Barrel_r2 = new ModelRenderer(this);
		Barrel_r2.setRotationPoint(1.425F, 2.5F, -10.0F);
		Barrel.addChild(Barrel_r2);
		setRotationAngle(Barrel_r2, 0.0F, 0.0F, -0.4887F);
		Barrel_r2.cubeList.add(new ModelBox(Barrel_r2, 75, 18, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r3 = new ModelRenderer(this);
		Barrel_r3.setRotationPoint(1.925F, 3.8F, -10.0F);
		Barrel.addChild(Barrel_r3);
		setRotationAngle(Barrel_r3, 0.0F, 0.0F, -0.5411F);
		Barrel_r3.cubeList.add(new ModelBox(Barrel_r3, 75, 46, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r4 = new ModelRenderer(this);
		Barrel_r4.setRotationPoint(-1.125F, 2.5F, -10.0F);
		Barrel.addChild(Barrel_r4);
		setRotationAngle(Barrel_r4, 0.0F, 0.0F, 0.4887F);
		Barrel_r4.cubeList.add(new ModelBox(Barrel_r4, 45, 88, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r5 = new ModelRenderer(this);
		Barrel_r5.setRotationPoint(-1.625F, 3.8F, -10.0F);
		Barrel.addChild(Barrel_r5);
		setRotationAngle(Barrel_r5, 0.0F, 0.0F, 0.5411F);
		Barrel_r5.cubeList.add(new ModelBox(Barrel_r5, 65, 89, -0.5F, -0.5F, -9.0F, 1, 1, 18, 0.0F, false));

		Barrel_r6 = new ModelRenderer(this);
		Barrel_r6.setRotationPoint(0.55F, -2.0F, -2.5F);
		Barrel.addChild(Barrel_r6);
		setRotationAngle(Barrel_r6, 0.7418F, 0.0F, 0.0F);
		Barrel_r6.cubeList.add(new ModelBox(Barrel_r6, 75, 54, -1.45F, -0.5F, -0.53F, 2, 1, 1, 0.0F, false));

		Barrel_r7 = new ModelRenderer(this);
		Barrel_r7.setRotationPoint(-1.5796F, -1.4004F, 0.5F);
		Barrel.addChild(Barrel_r7);
		setRotationAngle(Barrel_r7, 0.0F, 0.0F, -1.0646F);
		Barrel_r7.cubeList.add(new ModelBox(Barrel_r7, 95, 45, -0.4804F, -0.4396F, -3.0F, 1, 1, 6, 0.0F, false));

		Barrel_r8 = new ModelRenderer(this);
		Barrel_r8.setRotationPoint(-1.4796F, -1.5004F, 0.5F);
		Barrel.addChild(Barrel_r8);
		setRotationAngle(Barrel_r8, 0.0F, 0.0F, -1.0646F);
		Barrel_r8.cubeList.add(new ModelBox(Barrel_r8, 95, 55, -0.5154F, -0.4826F, -3.0F, 1, 1, 6, 0.0F, false));

		Barrel_r9 = new ModelRenderer(this);
		Barrel_r9.setRotationPoint(-1.0047F, -2.1779F, 0.4F);
		Barrel.addChild(Barrel_r9);
		setRotationAngle(Barrel_r9, 0.0F, 0.0F, -0.6021F);
		Barrel_r9.cubeList.add(new ModelBox(Barrel_r9, 65, 97, -0.5253F, -0.4621F, -3.0F, 1, 1, 6, -0.1F, false));
		Barrel_r9.cubeList.add(new ModelBox(Barrel_r9, 105, 105, -0.5253F, -0.4621F, 2.2F, 1, 1, 1, -0.1F, false));

		Barrel_r10 = new ModelRenderer(this);
		Barrel_r10.setRotationPoint(-1.1047F, -2.0779F, 0.6F);
		Barrel.addChild(Barrel_r10);
		setRotationAngle(Barrel_r10, 0.0F, 0.0F, -0.6021F);
		Barrel_r10.cubeList.add(new ModelBox(Barrel_r10, 85, 98, -0.5153F, -0.4821F, 2.0F, 1, 1, 1, -0.1F, false));
		Barrel_r10.cubeList.add(new ModelBox(Barrel_r10, 98, 78, -0.5153F, -0.4821F, -3.2F, 1, 1, 6, -0.1F, false));

		sightrail = new ModelRenderer(this);
		sightrail.setRotationPoint(0.0F, 0.0F, 0.0F);
		Barrel.addChild(sightrail);
		sightrail.cubeList.add(new ModelBox(sightrail, 25, 38, -0.9F, -2.3F, -4.475F, 2, 1, 2, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 75, 46, -0.9F, -2.3F, -6.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 75, 41, -0.9F, -2.3F, -12.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 75, 39, -0.9F, -2.3F, -10.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 0, 18, -0.9F, -2.3F, -16.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 0, 18, -0.9F, -2.3F, -18.375F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 75, 37, -0.9F, -2.3F, -14.475F, 2, 1, 1, 0.0F, false));
		sightrail.cubeList.add(new ModelBox(sightrail, 75, 34, -0.9F, -2.3F, -8.475F, 2, 1, 1, 0.0F, false));

		cube_r52_r1 = new ModelRenderer(this);
		cube_r52_r1.setRotationPoint(-31.5276F, 23.6365F, 11.8F);
		sightrail.addChild(cube_r52_r1);
		setRotationAngle(cube_r52_r1, 0.0F, 0.0F, 0.9425F);
		cube_r52_r1.cubeList.add(new ModelBox(cube_r52_r1, 10, 23, -2.95F, -39.991F, -35.275F, 1, 1, 5, -0.002F, false));

		cube_r51_r1 = new ModelRenderer(this);
		cube_r51_r1.setRotationPoint(32.2115F, 26.2091F, 11.8F);
		sightrail.addChild(cube_r51_r1);
		setRotationAngle(cube_r51_r1, 0.0F, 0.0F, -0.8552F);
		cube_r51_r1.cubeList.add(new ModelBox(cube_r51_r1, 35, 33, 0.1192F, -42.191F, -35.275F, 1, 1, 5, 0.0F, false));

		cube_r50_r1 = new ModelRenderer(this);
		cube_r50_r1.setRotationPoint(-25.8094F, 27.9307F, 12.7F);
		sightrail.addChild(cube_r50_r1);
		setRotationAngle(cube_r50_r1, 0.0F, 0.0F, 0.7854F);
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 95, 46, -3.775F, -38.975F, -21.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 95, 48, -3.775F, -38.975F, -27.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 18, 42, -3.775F, -38.975F, -29.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 95, 52, -3.775F, -38.975F, -23.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 95, 55, -3.775F, -38.975F, -25.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 95, 57, -3.775F, -38.975F, -19.175F, 1, 1, 1, -0.002F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 9, 62, -3.775F, -38.975F, -17.175F, 1, 1, 2, 0.0F, false));
		cube_r50_r1.cubeList.add(new ModelBox(cube_r50_r1, 18, 42, -3.775F, -38.975F, -31.075F, 1, 1, 1, -0.002F, false));

		cube_r49_r1 = new ModelRenderer(this);
		cube_r49_r1.setRotationPoint(28.8094F, 27.9307F, 12.7F);
		sightrail.addChild(cube_r49_r1);
		setRotationAngle(cube_r49_r1, 0.0F, 0.0F, -0.7854F);
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 95, 59, 0.775F, -40.975F, -21.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 95, 62, 0.775F, -40.975F, -27.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 69, 42, 0.775F, -40.975F, -29.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 79, 96, 0.775F, -40.975F, -23.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 65, 97, 0.775F, -40.975F, -25.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 73, 97, 0.775F, -40.975F, -19.175F, 1, 1, 1, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 34, 63, 0.775F, -40.975F, -17.175F, 1, 1, 2, 0.0F, false));
		cube_r49_r1.cubeList.add(new ModelBox(cube_r49_r1, 69, 42, 0.775F, -40.975F, -31.075F, 1, 1, 1, 0.0F, false));

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 0.0F, -15.0F);
		Barrel.addChild(frontsight);
		frontsight.cubeList.add(new ModelBox(frontsight, 20, 95, -0.4F, -3.2F, -8.075F, 1, 1, 1, 0.0F, false));

		cube_r46 = new ModelRenderer(this);
		cube_r46.setRotationPoint(3.7F, -2.7F, -7.675F);
		frontsight.addChild(cube_r46);
		setRotationAngle(cube_r46, 0.0F, 0.0F, 0.384F);
		cube_r46.cubeList.add(new ModelBox(cube_r46, 59, 61, -2.96F, 1.3F, -0.5F, 1, 1, 2, -0.1F, false));

		cube_r47 = new ModelRenderer(this);
		cube_r47.setRotationPoint(-0.7F, -2.7F, -7.675F);
		frontsight.addChild(cube_r47);
		setRotationAngle(cube_r47, 0.0F, 0.0F, -0.384F);
		cube_r47.cubeList.add(new ModelBox(cube_r47, 59, 58, -0.6F, 0.3F, -0.5F, 1, 1, 2, -0.1F, false));

		cube_r48 = new ModelRenderer(this);
		cube_r48.setRotationPoint(0.0F, 0.0F, 0.0F);
		frontsight.addChild(cube_r48);
		setRotationAngle(cube_r48, -0.7854F, 0.0F, 0.0F);
		cube_r48.cubeList.add(new ModelBox(cube_r48, 9, 59, -0.4F, 2.7293F, -7.3043F, 1, 1, 2, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		body.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}