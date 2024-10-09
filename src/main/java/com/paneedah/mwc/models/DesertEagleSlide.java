package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleSlide extends ModelWithAttachments {
	private final ModelRenderer slide;
	private final ModelRenderer cube_r84_r1;
	private final ModelRenderer cube_r21_r1_r1_r1;
	private final ModelRenderer RearSight;
	private final ModelRenderer cube_r3_r1;
	private final ModelRenderer cube_r55;
	private final ModelRenderer cube_r56;
	private final ModelRenderer FireSelector;
	private final ModelRenderer cube_r54_r1;
	private final ModelRenderer cube_r53_r1;
	private final ModelRenderer FireSelector_r2;
	private final ModelRenderer FireSelector_r1;
	private final ModelRenderer Cubes2;
	private final ModelRenderer cube_r91_r1;
	private final ModelRenderer cube_r90_r1;
	private final ModelRenderer cube_r89_r1;
	private final ModelRenderer cube_r88_r1;
	private final ModelRenderer cube_r87_r1;
	private final ModelRenderer cube_r86_r1;
	private final ModelRenderer cube_r85_r1;
	private final ModelRenderer cube_r84_r2;
	private final ModelRenderer cube_r84_r3;
	private final ModelRenderer cube_r77_r1;
	private final ModelRenderer cube_r76_r1;
	private final ModelRenderer cube_r75_r1;
	private final ModelRenderer cube_r65_r1;
	private final ModelRenderer cube_r65_r2;
	private final ModelRenderer cube_r57_r1;
	private final ModelRenderer cube_r65_r3;
	private final ModelRenderer cube_r65_r4;
	private final ModelRenderer cube_r65_r5;
	private final ModelRenderer cube_r65_r6;
	private final ModelRenderer cube_r65_r7;
	private final ModelRenderer cube_r65_r8;
	private final ModelRenderer cube_r65_r9;
	private final ModelRenderer cube_r65_r10;
	private final ModelRenderer cube_r65_r11;
	private final ModelRenderer cube_r65_r12;
	private final ModelRenderer Cubes2_r1;
	private final ModelRenderer Cubes2_r2;
	private final ModelRenderer Cubes2_r3;
	private final ModelRenderer Cubes2_r4;
	private final ModelRenderer Cubes2_r5;
	private final ModelRenderer Cubes2_r6;
	private final ModelRenderer Cubes2_r7;
	private final ModelRenderer Cubes2_r8;
	private final ModelRenderer cube_r65_r13;
	private final ModelRenderer cube_r65_r14;
	private final ModelRenderer cube_r65_r15;
	private final ModelRenderer cube_r65_r16;
	private final ModelRenderer cube_r65_r17;
	private final ModelRenderer cube_r58_r1;
	private final ModelRenderer cube_r54_r2;
	private final ModelRenderer cube_r53_r2;
	private final ModelRenderer FireSelector_r3;
	private final ModelRenderer cube_r65_r18;
	private final ModelRenderer cube_r65_r19;
	private final ModelRenderer cube_r60_r1;
	private final ModelRenderer Cubes2_r9;
	private final ModelRenderer Cubes2_r10;
	private final ModelRenderer Cubes2_r11;
	private final ModelRenderer Cubes2_r12;
	private final ModelRenderer Cubes2_r13;
	private final ModelRenderer Cubes2_r14;

	public DesertEagleSlide() {
		textureWidth = 135;
		textureHeight = 135;

		slide = new ModelRenderer(this);
		slide.setRotationPoint(-2.0316F, -12.0337F, -2.4061F);
		slide.cubeList.add(new ModelBox(slide, 15, 15, -0.3684F, -2.9663F, 3.8061F, 2, 4, 1, 0.0F, false));
		slide.cubeList.add(new ModelBox(slide, 17, 51, -0.3684F, 0.1337F, 3.7961F, 2, 1, 1, 0.0F, false));

		cube_r84_r1 = new ModelRenderer(this);
		cube_r84_r1.setRotationPoint(2.0316F, 39.2942F, 4.1724F);
		slide.addChild(cube_r84_r1);
		setRotationAngle(cube_r84_r1, 0.0785F, 0.0F, 0.0F);
		cube_r84_r1.cubeList.add(new ModelBox(cube_r84_r1, 33, 5, 0.1F, -38.0F, 4.3F, 1, 2, 1, -0.01F, false));

		cube_r21_r1_r1_r1 = new ModelRenderer(this);
		cube_r21_r1_r1_r1.setRotationPoint(0.6316F, -1.7663F, 4.7061F);
		slide.addChild(cube_r21_r1_r1_r1);
		setRotationAngle(cube_r21_r1_r1_r1, 0.0F, 0.0F, 0.5236F);
		cube_r21_r1_r1_r1.cubeList.add(new ModelBox(cube_r21_r1_r1_r1, 58, 103, -0.5F, -0.5F, -0.5F, 1, 1, 1, -0.17F, false));

		RearSight = new ModelRenderer(this);
		RearSight.setRotationPoint(0.6F, -4.0F, 2.8F);
		slide.addChild(RearSight);
		RearSight.cubeList.add(new ModelBox(RearSight, 60, 46, -2.0F, -0.3F, -0.3F, 4, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 60, 43, -2.0F, 0.2F, -1.2F, 4, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 105, 95, -2.3867F, 0.15F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 87, 34, 1.0F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 87, 34, 0.7F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 87, 62, -1.9867F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 87, 62, -1.5867F, -0.8F, -0.3F, 1, 1, 1, 0.0F, false));
		RearSight.cubeList.add(new ModelBox(RearSight, 105, 93, 1.4F, 0.15F, -0.3F, 1, 1, 1, 0.0F, false));

		cube_r3_r1 = new ModelRenderer(this);
		cube_r3_r1.setRotationPoint(1.7177F, -0.8312F, -0.9735F);
		RearSight.addChild(cube_r3_r1);
		setRotationAngle(cube_r3_r1, 0.6981F, 0.0F, 0.0F);
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 39, 0, -3.9F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 25, 33, -4.1F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 28, 0, -0.5F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));
		cube_r3_r1.cubeList.add(new ModelBox(cube_r3_r1, 25, 23, -0.3F, 0.0649F, -2.1104F, 1, 2, 3, -0.4F, false));

		cube_r55 = new ModelRenderer(this);
		cube_r55.setRotationPoint(1.6677F, -0.1821F, 0.2F);
		RearSight.addChild(cube_r55);
		setRotationAngle(cube_r55, 0.0F, 0.0F, -0.3927F);
		cube_r55.cubeList.add(new ModelBox(cube_r55, 93, 105, -0.45F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

		cube_r56 = new ModelRenderer(this);
		cube_r56.setRotationPoint(-1.6544F, -0.1821F, 0.2F);
		RearSight.addChild(cube_r56);
		setRotationAngle(cube_r56, 0.0F, 0.0F, 0.3927F);
		cube_r56.cubeList.add(new ModelBox(cube_r56, 105, 91, -0.55F, -0.425F, -0.5F, 1, 1, 1, 0.0F, false));

		FireSelector = new ModelRenderer(this);
		FireSelector.setRotationPoint(0.0F, -1.5F, 3.5F);
		slide.addChild(FireSelector);
		FireSelector.cubeList.add(new ModelBox(FireSelector, 61, 108, 1.4F, -0.925F, -4.35F, 2, 1, 4, 0.0F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 0, 28, 1.9816F, -0.5463F, -4.5939F, 2, 1, 2, -0.25F, false));
		FireSelector.cubeList.add(new ModelBox(FireSelector, 10, 29, 1.9816F, -0.5463F, -3.3939F, 2, 1, 1, -0.25F, false));

		cube_r54_r1 = new ModelRenderer(this);
		cube_r54_r1.setRotationPoint(2.3316F, 35.6528F, -14.5247F);
		FireSelector.addChild(cube_r54_r1);
		setRotationAngle(cube_r54_r1, -0.3316F, 0.0F, 0.0F);
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 20, 103, -0.9316F, -37.8587F, -1.7561F, 2, 1, 4, -0.002F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 60, 83, -0.9316F, -38.6587F, 0.2439F, 2, 1, 1, 0.0F, false));
		cube_r54_r1.cubeList.add(new ModelBox(cube_r54_r1, 84, 85, -0.9316F, -37.8587F, -1.9561F, 2, 1, 1, 0.0F, false));

		cube_r53_r1 = new ModelRenderer(this);
		cube_r53_r1.setRotationPoint(2.3316F, 26.272F, 28.1735F);
		FireSelector.addChild(cube_r53_r1);
		setRotationAngle(cube_r53_r1, 0.8727F, 0.0F, 0.0F);
		cube_r53_r1.cubeList.add(new ModelBox(cube_r53_r1, 66, 83, -0.9316F, -39.3337F, 1.4939F, 2, 1, 1, 0.0F, false));
		cube_r53_r1.cubeList.add(new ModelBox(cube_r53_r1, 84, 22, -0.9316F, -38.8337F, 1.4939F, 2, 1, 1, 0.0F, false));
		cube_r53_r1.cubeList.add(new ModelBox(cube_r53_r1, 84, 30, -0.9316F, -38.8337F, 0.5939F, 2, 1, 1, -0.002F, false));

		FireSelector_r2 = new ModelRenderer(this);
		FireSelector_r2.setRotationPoint(2.9F, -0.1663F, -3.4939F);
		FireSelector.addChild(FireSelector_r2);
		setRotationAngle(FireSelector_r2, 0.0F, 0.0F, -0.4887F);
		FireSelector_r2.cubeList.add(new ModelBox(FireSelector_r2, 8, 72, -1.0684F, -0.58F, -1.0F, 2, 1, 2, -0.14F, false));

		FireSelector_r1 = new ModelRenderer(this);
		FireSelector_r1.setRotationPoint(2.3F, 0.275F, -0.65F);
		FireSelector.addChild(FireSelector_r1);
		setRotationAngle(FireSelector_r1, -0.7854F, 0.0F, 0.0F);
		FireSelector_r1.cubeList.add(new ModelBox(FireSelector_r1, 84, 42, -0.7F, -0.5707F, -0.5707F, 2, 1, 1, 0.0F, false));

		Cubes2 = new ModelRenderer(this);
		Cubes2.setRotationPoint(0.2316F, 0.0337F, -3.2939F);
		slide.addChild(Cubes2);
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 22, -2.1F, 0.7F, -26.6F, 1, 1, 23, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 25, 25, -2.1F, 1.0F, -26.6F, 1, 2, 23, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 89, 105, 1.4F, -0.7F, 7.4F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 85, 105, 1.4F, -2.7F, 6.6F, 1, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 23, 1.9F, 1.0F, -26.6F, 1, 2, 23, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 28, 91, 1.9F, -0.6F, -5.1F, 1, 2, 1, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 48, 1.9F, 0.7F, -26.6F, 1, 1, 23, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 85, 92, -2.1F, -0.6F, -5.1F, 1, 2, 1, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 92, 37, -2.1F, -0.8F, -4.6F, 1, 2, 1, -0.0015F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 78, 69, 1.9F, -2.7F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 75, 54, -2.1F, -2.7F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 95, 19, -1.5F, -3.6F, -4.8F, 4, 1, 12, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 82, 110, -1.7F, -3.6F, -4.8F, 1, 1, 12, -0.001F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 36, -0.53F, -4.105F, -4.8F, 2, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 75, 46, -0.67F, -4.105F, -4.8F, 1, 1, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 58, 18, -1.6F, -3.6F, 6.6F, 4, 1, 1, -0.001F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 0, 90, 1.525F, -2.8F, 2.0F, 1, 3, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 58, 1.725F, 0.2F, 2.1F, 1, 3, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 25, 50, 1.725F, -2.8F, -4.8F, 1, 6, 7, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 11, 85, -2.85F, -2.08F, 3.4F, 2, 1, 1, -0.25F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 31, 73, -2.85F, -2.08F, 2.2F, 2, 1, 2, -0.25F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 46, 83, -2.4684F, -1.8294F, 5.5732F, 2, 1, 1, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 105, 103, -2.2684F, -2.4587F, 2.4439F, 2, 1, 4, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 85, 89, -1.72F, -2.8F, 2.0F, 1, 3, 6, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 58, 0, -1.955F, 0.2F, 2.1F, 1, 3, 7, 0.0F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 50, 22, -1.855F, -2.8F, -4.8F, 1, 6, 7, -0.002F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 115, 19, -0.15F, -3.27F, -6.6F, 1, 1, 4, 0.1F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 114, 46, -0.15F, -1.33F, -6.6F, 1, 1, 4, 0.1F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 82, 115, 0.82F, -2.3F, -6.6F, 1, 1, 4, 0.1F, false));
		Cubes2.cubeList.add(new ModelBox(Cubes2, 102, 0, -1.12F, -2.3F, -6.6F, 1, 1, 4, 0.1F, false));

		cube_r91_r1 = new ModelRenderer(this);
		cube_r91_r1.setRotationPoint(2.1F, 25.4386F, 30.7701F);
		Cubes2.addChild(cube_r91_r1);
		setRotationAngle(cube_r91_r1, 0.7854F, 0.0F, 0.0F);
		cube_r91_r1.cubeList.add(new ModelBox(cube_r91_r1, 103, 62, -0.35F, -37.8F, -1.3F, 1, 1, 1, -0.2F, false));
		cube_r91_r1.cubeList.add(new ModelBox(cube_r91_r1, 28, 105, -4.05F, -37.8F, -1.3F, 1, 1, 1, -0.2F, false));

		cube_r90_r1 = new ModelRenderer(this);
		cube_r90_r1.setRotationPoint(-24.3252F, 27.6281F, 6.81F);
		Cubes2.addChild(cube_r90_r1);
		setRotationAngle(cube_r90_r1, 0.0556F, -0.0555F, 0.7839F);
		cube_r90_r1.cubeList.add(new ModelBox(cube_r90_r1, 103, 89, -3.6276F, -36.3604F, 4.3F, 1, 1, 1, -0.002F, false));
		cube_r90_r1.cubeList.add(new ModelBox(cube_r90_r1, 99, 103, -3.6276F, -36.0604F, 4.3F, 1, 1, 1, -0.001F, false));

		cube_r89_r1 = new ModelRenderer(this);
		cube_r89_r1.setRotationPoint(27.105F, 25.6543F, 6.6547F);
		Cubes2.addChild(cube_r89_r1);
		setRotationAngle(cube_r89_r1, 0.0556F, 0.0555F, -0.7839F);
		cube_r89_r1.cubeList.add(new ModelBox(cube_r89_r1, 65, 104, -0.1925F, -36.3805F, 4.3F, 1, 1, 1, -0.002F, false));
		cube_r89_r1.cubeList.add(new ModelBox(cube_r89_r1, 69, 104, -0.1925F, -36.0805F, 4.3F, 1, 1, 1, -0.001F, false));

		cube_r88_r1 = new ModelRenderer(this);
		cube_r88_r1.setRotationPoint(9.7262F, 36.2269F, 4.7F);
		Cubes2.addChild(cube_r88_r1);
		setRotationAngle(cube_r88_r1, 0.0F, 0.0F, -0.2182F);
		cube_r88_r1.cubeList.add(new ModelBox(cube_r88_r1, 26, 50, 0.02F, -37.15F, -31.3F, 1, 1, 22, 0.0F, false));

		cube_r87_r1 = new ModelRenderer(this);
		cube_r87_r1.setRotationPoint(-6.1925F, 36.833F, 4.7F);
		Cubes2.addChild(cube_r87_r1);
		setRotationAngle(cube_r87_r1, 0.0F, 0.0F, 0.2182F);
		cube_r87_r1.cubeList.add(new ModelBox(cube_r87_r1, 51, 46, -3.82F, -37.15F, -31.3F, 1, 1, 22, 0.0F, false));

		cube_r86_r1 = new ModelRenderer(this);
		cube_r86_r1.setRotationPoint(1.8F, 35.8954F, -10.1298F);
		Cubes2.addChild(cube_r86_r1);
		setRotationAngle(cube_r86_r1, -0.4014F, 0.0F, 0.0F);
		cube_r86_r1.cubeList.add(new ModelBox(cube_r86_r1, 84, 54, -3.9F, -37.0F, -9.9F, 1, 3, 1, 0.0F, false));
		cube_r86_r1.cubeList.add(new ModelBox(cube_r86_r1, 30, 23, -3.9F, -37.3F, -9.6F, 1, 2, 1, -0.003F, false));
		cube_r86_r1.cubeList.add(new ModelBox(cube_r86_r1, 81, 72, 0.1F, -37.0F, -9.9F, 1, 3, 1, 0.0F, false));

		cube_r85_r1 = new ModelRenderer(this);
		cube_r85_r1.setRotationPoint(1.8F, 24.5974F, 28.0367F);
		Cubes2.addChild(cube_r85_r1);
		setRotationAngle(cube_r85_r1, 0.7243F, 0.0F, 0.0F);
		cube_r85_r1.cubeList.add(new ModelBox(cube_r85_r1, 88, 54, 0.1F, -34.9173F, 2.0915F, 1, 2, 1, 0.0F, false));
		cube_r85_r1.cubeList.add(new ModelBox(cube_r85_r1, 73, 104, 0.1F, -33.4974F, 2.0915F, 1, 1, 1, 0.0F, false));

		cube_r84_r2 = new ModelRenderer(this);
		cube_r84_r2.setRotationPoint(1.8F, 37.2605F, 7.5663F);
		Cubes2.addChild(cube_r84_r2);
		setRotationAngle(cube_r84_r2, 0.0785F, 0.0F, 0.0F);
		cube_r84_r2.cubeList.add(new ModelBox(cube_r84_r2, 81, 80, 0.1F, -37.0F, 4.3F, 1, 3, 1, -0.0005F, false));
		cube_r84_r2.cubeList.add(new ModelBox(cube_r84_r2, 65, 88, -3.0F, -38.0F, 4.3F, 1, 2, 1, 0.0F, false));
		cube_r84_r2.cubeList.add(new ModelBox(cube_r84_r2, 0, 82, -3.9F, -37.0F, 4.3F, 1, 3, 1, 0.0F, false));

		cube_r84_r3 = new ModelRenderer(this);
		cube_r84_r3.setRotationPoint(1.8F, 36.2605F, 7.5663F);
		Cubes2.addChild(cube_r84_r3);
		setRotationAngle(cube_r84_r3, 0.0785F, 0.0F, 0.0F);
		cube_r84_r3.cubeList.add(new ModelBox(cube_r84_r3, 73, 88, -0.8F, -37.0F, 4.3F, 1, 2, 1, 0.0F, false));

		cube_r77_r1 = new ModelRenderer(this);
		cube_r77_r1.setRotationPoint(0.788F, 29.5426F, 30.9565F);
		Cubes2.addChild(cube_r77_r1);
		setRotationAngle(cube_r77_r1, 0.7479F, 0.2272F, 0.206F);
		cube_r77_r1.cubeList.add(new ModelBox(cube_r77_r1, 77, 104, -0.248F, -40.2558F, 3.6235F, 1, 1, 1, 0.0F, false));

		cube_r76_r1 = new ModelRenderer(this);
		cube_r76_r1.setRotationPoint(2.812F, 29.5426F, 30.9565F);
		Cubes2.addChild(cube_r76_r1);
		setRotationAngle(cube_r76_r1, 0.7479F, -0.2272F, -0.206F);
		cube_r76_r1.cubeList.add(new ModelBox(cube_r76_r1, 10, 105, -3.422F, -40.2558F, 4.4661F, 1, 1, 1, 0.0F, false));

		cube_r75_r1 = new ModelRenderer(this);
		cube_r75_r1.setRotationPoint(1.8F, 28.9526F, 31.6233F);
		Cubes2.addChild(cube_r75_r1);
		setRotationAngle(cube_r75_r1, 0.7243F, 0.0F, 0.0F);
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 20, 105, -3.9F, -39.0826F, 2.2911F, 1, 1, 1, 0.0F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 36, 82, -0.8F, -39.8526F, 2.5911F, 1, 3, 1, 0.0F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 56, 88, -2.5F, -40.2558F, 2.5911F, 1, 1, 1, -0.001F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 56, 88, -3.0F, -40.2558F, 2.5911F, 1, 1, 1, 0.0F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 89, 21, -1.8F, -40.2558F, 2.5911F, 1, 1, 1, 0.0F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 89, 21, -0.8F, -40.2558F, 2.5911F, 1, 1, 1, 0.0F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 85, 0, -3.0F, -39.8526F, 2.5911F, 1, 3, 1, 0.0F, false));
		cube_r75_r1.cubeList.add(new ModelBox(cube_r75_r1, 89, 65, -3.9F, -40.5558F, 2.2911F, 1, 2, 1, 0.0F, false));

		cube_r65_r1 = new ModelRenderer(this);
		cube_r65_r1.setRotationPoint(2.7F, 1.4802F, 3.3579F);
		Cubes2.addChild(cube_r65_r1);
		setRotationAngle(cube_r65_r1, 0.2444F, 0.0F, 0.0F);
		cube_r65_r1.cubeList.add(new ModelBox(cube_r65_r1, 79, 89, -0.51F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));
		cube_r65_r1.cubeList.add(new ModelBox(cube_r65_r1, 91, 80, -5.02F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));

		cube_r65_r2 = new ModelRenderer(this);
		cube_r65_r2.setRotationPoint(2.7F, 0.9802F, 8.1579F);
		Cubes2.addChild(cube_r65_r2);
		setRotationAngle(cube_r65_r2, 0.2444F, 0.0F, 0.0F);
		cube_r65_r2.cubeList.add(new ModelBox(cube_r65_r2, 85, 89, -0.51F, -2.1802F, -0.5F, 1, 2, 1, -0.301F, false));
		cube_r65_r2.cubeList.add(new ModelBox(cube_r65_r2, 68, 50, -5.02F, -1.5F, -0.5F, 1, 4, 1, -0.3F, false));
		cube_r65_r2.cubeList.add(new ModelBox(cube_r65_r2, 34, 91, -5.02F, -2.1802F, -0.5F, 1, 2, 1, -0.301F, false));
		cube_r65_r2.cubeList.add(new ModelBox(cube_r65_r2, 36, 23, -0.51F, -1.5F, -0.5F, 1, 4, 1, -0.3F, false));

		cube_r57_r1 = new ModelRenderer(this);
		cube_r57_r1.setRotationPoint(-1.2F, 26.0181F, 35.0532F);
		Cubes2.addChild(cube_r57_r1);
		setRotationAngle(cube_r57_r1, 0.8727F, 0.0F, 0.0F);
		cube_r57_r1.cubeList.add(new ModelBox(cube_r57_r1, 78, 20, -0.755F, -37.8858F, 2.109F, 1, 1, 1, 0.0F, false));
		cube_r57_r1.cubeList.add(new ModelBox(cube_r57_r1, 25, 28, -0.755F, -38.3858F, 0.609F, 1, 1, 3, -0.002F, false));
		cube_r57_r1.cubeList.add(new ModelBox(cube_r57_r1, 67, 0, 2.925F, -38.3858F, 0.609F, 1, 1, 3, -0.002F, false));
		cube_r57_r1.cubeList.add(new ModelBox(cube_r57_r1, 40, 105, 2.925F, -37.8858F, 2.109F, 1, 1, 1, 0.0F, false));

		cube_r65_r3 = new ModelRenderer(this);
		cube_r65_r3.setRotationPoint(-1.8F, 1.4802F, 7.3579F);
		Cubes2.addChild(cube_r65_r3);
		setRotationAngle(cube_r65_r3, 0.2444F, 0.0F, 0.0F);
		cube_r65_r3.cubeList.add(new ModelBox(cube_r65_r3, 65, 91, -0.52F, -1.9302F, -0.4779F, 1, 2, 1, -0.301F, false));
		cube_r65_r3.cubeList.add(new ModelBox(cube_r65_r3, 0, 90, 3.99F, -1.9302F, -0.4779F, 1, 2, 1, -0.301F, false));

		cube_r65_r4 = new ModelRenderer(this);
		cube_r65_r4.setRotationPoint(-1.8F, 0.9802F, 7.2579F);
		Cubes2.addChild(cube_r65_r4);
		setRotationAngle(cube_r65_r4, 0.2444F, 0.0F, 0.0F);
		cube_r65_r4.cubeList.add(new ModelBox(cube_r65_r4, 87, 49, -0.52F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));
		cube_r65_r4.cubeList.add(new ModelBox(cube_r65_r4, 23, 83, 3.99F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));

		cube_r65_r5 = new ModelRenderer(this);
		cube_r65_r5.setRotationPoint(-1.8F, 0.9802F, 6.2579F);
		Cubes2.addChild(cube_r65_r5);
		setRotationAngle(cube_r65_r5, 0.2444F, 0.0F, 0.0F);
		cube_r65_r5.cubeList.add(new ModelBox(cube_r65_r5, 87, 57, -0.52F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));
		cube_r65_r5.cubeList.add(new ModelBox(cube_r65_r5, 84, 18, 3.99F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));

		cube_r65_r6 = new ModelRenderer(this);
		cube_r65_r6.setRotationPoint(-1.8F, 1.4802F, 6.3579F);
		Cubes2.addChild(cube_r65_r6);
		setRotationAngle(cube_r65_r6, 0.2444F, 0.0F, 0.0F);
		cube_r65_r6.cubeList.add(new ModelBox(cube_r65_r6, 91, 69, -0.52F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));
		cube_r65_r6.cubeList.add(new ModelBox(cube_r65_r6, 8, 90, 3.99F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));

		cube_r65_r7 = new ModelRenderer(this);
		cube_r65_r7.setRotationPoint(-1.8F, 1.4802F, 5.3579F);
		Cubes2.addChild(cube_r65_r7);
		setRotationAngle(cube_r65_r7, 0.2444F, 0.0F, 0.0F);
		cube_r65_r7.cubeList.add(new ModelBox(cube_r65_r7, 91, 72, -0.52F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));
		cube_r65_r7.cubeList.add(new ModelBox(cube_r65_r7, 14, 90, 3.99F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));

		cube_r65_r8 = new ModelRenderer(this);
		cube_r65_r8.setRotationPoint(-1.8F, 0.9802F, 5.2579F);
		Cubes2.addChild(cube_r65_r8);
		setRotationAngle(cube_r65_r8, 0.2444F, 0.0F, 0.0F);
		cube_r65_r8.cubeList.add(new ModelBox(cube_r65_r8, 87, 69, -0.52F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));
		cube_r65_r8.cubeList.add(new ModelBox(cube_r65_r8, 84, 26, 3.99F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));

		cube_r65_r9 = new ModelRenderer(this);
		cube_r65_r9.setRotationPoint(-1.8F, 0.9802F, 4.2579F);
		Cubes2.addChild(cube_r65_r9);
		setRotationAngle(cube_r65_r9, 0.2444F, 0.0F, 0.0F);
		cube_r65_r9.cubeList.add(new ModelBox(cube_r65_r9, 87, 77, -0.52F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));
		cube_r65_r9.cubeList.add(new ModelBox(cube_r65_r9, 84, 37, 3.99F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));

		cube_r65_r10 = new ModelRenderer(this);
		cube_r65_r10.setRotationPoint(-1.8F, 1.4802F, 4.3579F);
		Cubes2.addChild(cube_r65_r10);
		setRotationAngle(cube_r65_r10, 0.2444F, 0.0F, 0.0F);
		cube_r65_r10.cubeList.add(new ModelBox(cube_r65_r10, 91, 77, -0.52F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));
		cube_r65_r10.cubeList.add(new ModelBox(cube_r65_r10, 20, 90, 3.99F, -1.5F, -0.4779F, 1, 2, 1, -0.301F, false));

		cube_r65_r11 = new ModelRenderer(this);
		cube_r65_r11.setRotationPoint(-1.8F, 0.9802F, 3.2579F);
		Cubes2.addChild(cube_r65_r11);
		setRotationAngle(cube_r65_r11, 0.2444F, 0.0F, 0.0F);
		cube_r65_r11.cubeList.add(new ModelBox(cube_r65_r11, 88, 3, -0.52F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));
		cube_r65_r11.cubeList.add(new ModelBox(cube_r65_r11, 84, 46, 3.99F, -0.5F, -0.5F, 1, 3, 1, -0.3F, false));

		cube_r65_r12 = new ModelRenderer(this);
		cube_r65_r12.setRotationPoint(-1.8F, 0.9802F, 2.3579F);
		Cubes2.addChild(cube_r65_r12);
		setRotationAngle(cube_r65_r12, 0.2444F, 0.0F, 0.0F);
		cube_r65_r12.cubeList.add(new ModelBox(cube_r65_r12, 50, 35, -0.52F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r65_r12.cubeList.add(new ModelBox(cube_r65_r12, 28, 10, 3.99F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));

		Cubes2_r1 = new ModelRenderer(this);
		Cubes2_r1.setRotationPoint(-0.155F, -2.5F, -4.6F);
		Cubes2.addChild(Cubes2_r1);
		setRotationAngle(Cubes2_r1, 0.0F, 0.0F, 0.7854F);
		Cubes2_r1.cubeList.add(new ModelBox(Cubes2_r1, 114, 0, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r2 = new ModelRenderer(this);
		Cubes2_r2.setRotationPoint(-0.355F, -2.3F, -4.6F);
		Cubes2.addChild(Cubes2_r2);
		setRotationAngle(Cubes2_r2, 0.0F, 0.0F, 0.7854F);
		Cubes2_r2.cubeList.add(new ModelBox(Cubes2_r2, 115, 24, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r3 = new ModelRenderer(this);
		Cubes2_r3.setRotationPoint(1.055F, -2.3F, -4.6F);
		Cubes2.addChild(Cubes2_r3);
		setRotationAngle(Cubes2_r3, 0.0F, 0.0F, -0.7854F);
		Cubes2_r3.cubeList.add(new ModelBox(Cubes2_r3, 114, 5, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r4 = new ModelRenderer(this);
		Cubes2_r4.setRotationPoint(0.855F, -1.1F, -4.6F);
		Cubes2.addChild(Cubes2_r4);
		setRotationAngle(Cubes2_r4, 0.0F, 0.0F, 0.7854F);
		Cubes2_r4.cubeList.add(new ModelBox(Cubes2_r4, 114, 10, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r5 = new ModelRenderer(this);
		Cubes2_r5.setRotationPoint(1.055F, -1.3F, -4.6F);
		Cubes2.addChild(Cubes2_r5);
		setRotationAngle(Cubes2_r5, 0.0F, 0.0F, 0.7854F);
		Cubes2_r5.cubeList.add(new ModelBox(Cubes2_r5, 114, 36, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r6 = new ModelRenderer(this);
		Cubes2_r6.setRotationPoint(-0.155F, -1.1F, -4.6F);
		Cubes2.addChild(Cubes2_r6);
		setRotationAngle(Cubes2_r6, 0.0F, 0.0F, -0.7854F);
		Cubes2_r6.cubeList.add(new ModelBox(Cubes2_r6, 114, 41, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r7 = new ModelRenderer(this);
		Cubes2_r7.setRotationPoint(-0.355F, -1.3F, -4.6F);
		Cubes2.addChild(Cubes2_r7);
		setRotationAngle(Cubes2_r7, 0.0F, 0.0F, -0.7854F);
		Cubes2_r7.cubeList.add(new ModelBox(Cubes2_r7, 36, 116, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		Cubes2_r8 = new ModelRenderer(this);
		Cubes2_r8.setRotationPoint(0.855F, -2.5F, -4.6F);
		Cubes2.addChild(Cubes2_r8);
		setRotationAngle(Cubes2_r8, 0.0F, 0.0F, -0.7854F);
		Cubes2_r8.cubeList.add(new ModelBox(Cubes2_r8, 114, 110, -0.5F, -0.5F, -2.0F, 1, 1, 4, 0.1F, false));

		cube_r65_r13 = new ModelRenderer(this);
		cube_r65_r13.setRotationPoint(-1.8F, 0.9802F, 1.3579F);
		Cubes2.addChild(cube_r65_r13);
		setRotationAngle(cube_r65_r13, 0.2444F, 0.0F, 0.0F);
		cube_r65_r13.cubeList.add(new ModelBox(cube_r65_r13, 50, 50, -0.52F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r65_r13.cubeList.add(new ModelBox(cube_r65_r13, 0, 36, 3.99F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));

		cube_r65_r14 = new ModelRenderer(this);
		cube_r65_r14.setRotationPoint(-1.8F, 0.9802F, 0.4579F);
		Cubes2.addChild(cube_r65_r14);
		setRotationAngle(cube_r65_r14, 0.2444F, 0.0F, 0.0F);
		cube_r65_r14.cubeList.add(new ModelBox(cube_r65_r14, 59, 22, -0.52F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r65_r14.cubeList.add(new ModelBox(cube_r65_r14, 0, 59, 3.99F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));

		cube_r65_r15 = new ModelRenderer(this);
		cube_r65_r15.setRotationPoint(-1.8F, 0.9802F, -0.5421F);
		Cubes2.addChild(cube_r65_r15);
		setRotationAngle(cube_r65_r15, 0.2444F, 0.0F, 0.0F);
		cube_r65_r15.cubeList.add(new ModelBox(cube_r65_r15, 58, 0, -0.52F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r65_r15.cubeList.add(new ModelBox(cube_r65_r15, 25, 50, 3.99F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));

		cube_r65_r16 = new ModelRenderer(this);
		cube_r65_r16.setRotationPoint(-1.8F, 0.9802F, -1.5421F);
		Cubes2.addChild(cube_r65_r16);
		setRotationAngle(cube_r65_r16, 0.2444F, 0.0F, 0.0F);
		cube_r65_r16.cubeList.add(new ModelBox(cube_r65_r16, 50, 58, -0.52F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r65_r16.cubeList.add(new ModelBox(cube_r65_r16, 34, 50, 3.99F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));

		cube_r65_r17 = new ModelRenderer(this);
		cube_r65_r17.setRotationPoint(-1.8F, 0.9802F, -2.4421F);
		Cubes2.addChild(cube_r65_r17);
		setRotationAngle(cube_r65_r17, 0.2444F, 0.0F, 0.0F);
		cube_r65_r17.cubeList.add(new ModelBox(cube_r65_r17, 25, 63, -0.52F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));
		cube_r65_r17.cubeList.add(new ModelBox(cube_r65_r17, 61, 35, 3.99F, -3.5F, -0.5F, 1, 6, 1, -0.3F, false));

		cube_r58_r1 = new ModelRenderer(this);
		cube_r58_r1.setRotationPoint(-1.2F, 33.0605F, 17.0724F);
		Cubes2.addChild(cube_r58_r1);
		setRotationAngle(cube_r58_r1, 0.3491F, 0.0F, 0.0F);
		cube_r58_r1.cubeList.add(new ModelBox(cube_r58_r1, 67, 56, -0.655F, -36.8F, -4.4F, 1, 1, 2, 0.0F, false));
		cube_r58_r1.cubeList.add(new ModelBox(cube_r58_r1, 67, 59, 2.9F, -36.8F, -4.4F, 1, 1, 2, 0.0F, false));

		cube_r54_r2 = new ModelRenderer(this);
		cube_r54_r2.setRotationPoint(-1.2F, 34.1191F, -7.7308F);
		Cubes2.addChild(cube_r54_r2);
		setRotationAngle(cube_r54_r2, -0.3316F, 0.0F, 0.0F);
		cube_r54_r2.cubeList.add(new ModelBox(cube_r54_r2, 84, 37, -1.0684F, -37.8587F, -1.7561F, 2, 1, 4, -0.002F, false));
		cube_r54_r2.cubeList.add(new ModelBox(cube_r54_r2, 52, 83, -1.0684F, -38.6587F, 0.2439F, 2, 1, 1, 0.0F, false));
		cube_r54_r2.cubeList.add(new ModelBox(cube_r54_r2, 78, 85, -1.0684F, -37.8587F, -1.9561F, 2, 1, 1, 0.0F, false));

		cube_r53_r2 = new ModelRenderer(this);
		cube_r53_r2.setRotationPoint(-1.2F, 24.7383F, 34.9674F);
		Cubes2.addChild(cube_r53_r2);
		setRotationAngle(cube_r53_r2, 0.8727F, 0.0F, 0.0F);
		cube_r53_r2.cubeList.add(new ModelBox(cube_r53_r2, 23, 77, -1.0684F, -39.3337F, 1.4939F, 2, 1, 1, 0.0F, false));
		cube_r53_r2.cubeList.add(new ModelBox(cube_r53_r2, 81, 34, -1.0684F, -38.8337F, 1.4939F, 2, 1, 1, 0.0F, false));
		cube_r53_r2.cubeList.add(new ModelBox(cube_r53_r2, 81, 62, -1.0684F, -38.8337F, 0.5939F, 2, 1, 1, -0.002F, false));

		FireSelector_r3 = new ModelRenderer(this);
		FireSelector_r3.setRotationPoint(-1.7684F, -1.7F, 3.3F);
		Cubes2.addChild(FireSelector_r3);
		setRotationAngle(FireSelector_r3, 0.0F, 0.0F, 0.4887F);
		FireSelector_r3.cubeList.add(new ModelBox(FireSelector_r3, 64, 69, -0.9316F, -0.58F, -1.0F, 2, 1, 2, -0.14F, false));

		cube_r65_r18 = new ModelRenderer(this);
		cube_r65_r18.setRotationPoint(-1.6F, 1.3802F, -3.5421F);
		Cubes2.addChild(cube_r65_r18);
		setRotationAngle(cube_r65_r18, 0.2444F, 0.0F, 0.0F);
		cube_r65_r18.cubeList.add(new ModelBox(cube_r65_r18, 48, 107, -0.5F, 0.5398F, -0.4479F, 1, 1, 1, 0.0F, false));

		cube_r65_r19 = new ModelRenderer(this);
		cube_r65_r19.setRotationPoint(-1.6F, 0.7802F, -3.6421F);
		Cubes2.addChild(cube_r65_r19);
		setRotationAngle(cube_r65_r19, 0.2444F, 0.0F, 0.0F);
		cube_r65_r19.cubeList.add(new ModelBox(cube_r65_r19, 23, 72, -0.5F, -2.5F, -0.5F, 1, 4, 1, -0.0015F, false));
		cube_r65_r19.cubeList.add(new ModelBox(cube_r65_r19, 58, 10, 3.5F, -2.5F, -0.5F, 1, 5, 1, -0.001F, false));

		cube_r60_r1 = new ModelRenderer(this);
		cube_r60_r1.setRotationPoint(1.8F, 34.2705F, 14.7181F);
		Cubes2.addChild(cube_r60_r1);
		setRotationAngle(cube_r60_r1, 0.2793F, 0.0F, 0.0F);
		cube_r60_r1.cubeList.add(new ModelBox(cube_r60_r1, 10, 48, 0.1F, -36.3F, 3.3F, 1, 4, 1, 0.0F, false));
		cube_r60_r1.cubeList.add(new ModelBox(cube_r60_r1, 61, 50, -3.9F, -36.3F, 3.3F, 1, 4, 1, -0.002F, false));

		Cubes2_r9 = new ModelRenderer(this);
		Cubes2_r9.setRotationPoint(-1.4F, -3.2F, -1.3F);
		Cubes2.addChild(Cubes2_r9);
		setRotationAngle(Cubes2_r9, 0.0F, 0.0F, 0.384F);
		Cubes2_r9.cubeList.add(new ModelBox(Cubes2_r9, 25, 63, -0.463F, -0.521F, -3.5F, 1, 1, 7, 0.0F, false));

		Cubes2_r10 = new ModelRenderer(this);
		Cubes2_r10.setRotationPoint(-1.0F, -3.5F, -1.3F);
		Cubes2.addChild(Cubes2_r10);
		setRotationAngle(Cubes2_r10, 0.0F, 0.0F, 1.3177F);
		Cubes2_r10.cubeList.add(new ModelBox(Cubes2_r10, 75, 18, -0.5F, -0.475F, -3.5F, 1, 1, 7, 0.0F, false));

		Cubes2_r11 = new ModelRenderer(this);
		Cubes2_r11.setRotationPoint(-1.5F, -3.0F, -1.3F);
		Cubes2.addChild(Cubes2_r11);
		setRotationAngle(Cubes2_r11, 0.0F, 0.0F, 0.384F);
		Cubes2_r11.cubeList.add(new ModelBox(Cubes2_r11, 46, 73, -0.445F, -0.5F, -3.5F, 1, 1, 12, 0.0F, false));

		Cubes2_r12 = new ModelRenderer(this);
		Cubes2_r12.setRotationPoint(2.2F, -3.2F, -1.3F);
		Cubes2.addChild(Cubes2_r12);
		setRotationAngle(Cubes2_r12, 0.0F, 0.0F, -0.384F);
		Cubes2_r12.cubeList.add(new ModelBox(Cubes2_r12, 75, 26, -0.537F, -0.521F, -3.5F, 1, 1, 7, 0.0F, false));

		Cubes2_r13 = new ModelRenderer(this);
		Cubes2_r13.setRotationPoint(2.3F, -3.0F, -1.3F);
		Cubes2.addChild(Cubes2_r13);
		setRotationAngle(Cubes2_r13, 0.0F, 0.0F, -0.384F);
		Cubes2_r13.cubeList.add(new ModelBox(Cubes2_r13, 68, 108, -0.555F, -0.5F, -3.5F, 1, 1, 12, 0.0F, false));

		Cubes2_r14 = new ModelRenderer(this);
		Cubes2_r14.setRotationPoint(1.8F, -3.5F, -1.3F);
		Cubes2.addChild(Cubes2_r14);
		setRotationAngle(Cubes2_r14, 0.0F, 0.0F, -1.3177F);
		Cubes2_r14.cubeList.add(new ModelBox(Cubes2_r14, 75, 37, -0.5F, -0.475F, -3.5F, 1, 1, 7, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		slide.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}