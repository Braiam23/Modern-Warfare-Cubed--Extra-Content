package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington700Chassis extends ModelWithAttachments {
	private final ModelRenderer chassis;
	private final ModelRenderer chassis48_r1;
	private final ModelRenderer chassis4_r1;
	private final ModelRenderer chassis3_r1;
	private final ModelRenderer chassis1_r1;
	private final ModelRenderer chassis9_r1;
	private final ModelRenderer chassis8_r1;
	private final ModelRenderer chassis7_r1;
	private final ModelRenderer chassis10_r1;
	private final ModelRenderer chassis9_r2;
	private final ModelRenderer chassis8_r2;
	private final ModelRenderer chassis11_r1;
	private final ModelRenderer chassis10_r2;
	private final ModelRenderer chassis9_r3;
	private final ModelRenderer chassis47_r1;
	private final ModelRenderer chassis46_r1;
	private final ModelRenderer chassis54_r1;
	private final ModelRenderer chassis54_r2;
	private final ModelRenderer chassis52_r1;
	private final ModelRenderer chassis55_r1;
	private final ModelRenderer chassis54_r3;
	private final ModelRenderer chassis53_r1;
	private final ModelRenderer chassis53_r2;
	private final ModelRenderer chassis51_r1;
	private final ModelRenderer chassis57;
	private final ModelRenderer chassis56;
	private final ModelRenderer chassis55;
	private final ModelRenderer chassis48;
	private final ModelRenderer chassis46;
	private final ModelRenderer chassis36;
	private final ModelRenderer chassis45;
	private final ModelRenderer chassis44;
	private final ModelRenderer chassis39;
	private final ModelRenderer chassis38;
	private final ModelRenderer chassis37;
	private final ModelRenderer chassis35;
	private final ModelRenderer chassis34;
	private final ModelRenderer chassis33;
	private final ModelRenderer chassis31;
	private final ModelRenderer chassis30;
	private final ModelRenderer chassis29;
	private final ModelRenderer chassis23;
	private final ModelRenderer chassis22;
	private final ModelRenderer chassis21;
	private final ModelRenderer chassis20;
	private final ModelRenderer chassis19;
	private final ModelRenderer chassis18;
	private final ModelRenderer chassis17;
	private final ModelRenderer chassis16;
	private final ModelRenderer chassis15;
	private final ModelRenderer chassis14;
	private final ModelRenderer chassis13;
	private final ModelRenderer chassis12;
	private final ModelRenderer chassis11;
	private final ModelRenderer chassis10;
	private final ModelRenderer chassis6;
	private final ModelRenderer chassis5;
	private final ModelRenderer chassis4;
	private final ModelRenderer chassis3;
	private final ModelRenderer chassis2;
	private final ModelRenderer chassis1;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer gun30;
	private final ModelRenderer gun33;
	private final ModelRenderer gun34;
	private final ModelRenderer gun32;
	private final ModelRenderer gun29;
	private final ModelRenderer gun31;
	private final ModelRenderer gun35;
	private final ModelRenderer gun36;

	public Remington700Chassis() {
		textureWidth = 400;
		textureHeight = 400;

		chassis = new ModelRenderer(this);
		chassis.setRotationPoint(0.0F, 16.0F, -17.0F);
		

		chassis48_r1 = new ModelRenderer(this);
		chassis48_r1.setRotationPoint(-3.0F, -28.1F, 10.15F);
		chassis.addChild(chassis48_r1);
		setRotationAngle(chassis48_r1, 0.2586F, -0.1441F, -2.6463F);
		chassis48_r1.cubeList.add(new ModelBox(chassis48_r1, 180, 140, -1.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		chassis4_r1 = new ModelRenderer(this);
		chassis4_r1.setRotationPoint(-2.5F, -30.1F, 9.35F);
		chassis.addChild(chassis4_r1);
		setRotationAngle(chassis4_r1, -0.1263F, -0.3506F, -1.2168F);
		chassis4_r1.cubeList.add(new ModelBox(chassis4_r1, 0, 76, -1.5F, 0.0F, 1.4F, 1, 1, 6, -0.001F, false));
		chassis4_r1.cubeList.add(new ModelBox(chassis4_r1, 131, 172, -1.0F, 0.0F, 1.0F, 1, 1, 9, 0.0F, false));

		chassis3_r1 = new ModelRenderer(this);
		chassis3_r1.setRotationPoint(0.5F, -30.1F, 9.35F);
		chassis.addChild(chassis3_r1);
		setRotationAngle(chassis3_r1, -0.1263F, 0.3506F, 1.2168F);
		chassis3_r1.cubeList.add(new ModelBox(chassis3_r1, 18, 76, 0.5F, 0.0F, 1.4F, 1, 1, 6, -0.001F, false));
		chassis3_r1.cubeList.add(new ModelBox(chassis3_r1, 110, 189, 0.0F, 0.0F, 1.0F, 1, 1, 9, 0.0F, false));

		chassis1_r1 = new ModelRenderer(this);
		chassis1_r1.setRotationPoint(-2.5F, -30.1F, 9.35F);
		chassis.addChild(chassis1_r1);
		setRotationAngle(chassis1_r1, -0.3718F, 0.0F, 0.0F);
		chassis1_r1.cubeList.add(new ModelBox(chassis1_r1, 53, 134, 0.0F, 0.0F, 2.0F, 3, 2, 8, 0.0F, false));

		chassis9_r1 = new ModelRenderer(this);
		chassis9_r1.setRotationPoint(0.5F, -27.76F, 23.35F);
		chassis.addChild(chassis9_r1);
		setRotationAngle(chassis9_r1, -0.0976F, -0.054F, -0.5035F);
		chassis9_r1.cubeList.add(new ModelBox(chassis9_r1, 260, 41, -1.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		chassis8_r1 = new ModelRenderer(this);
		chassis8_r1.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis8_r1);
		setRotationAngle(chassis8_r1, -0.0976F, 0.054F, 0.5035F);
		chassis8_r1.cubeList.add(new ModelBox(chassis8_r1, 260, 116, 0.0F, 0.0F, 0.0F, 1, 1, 27, 0.0F, false));

		chassis7_r1 = new ModelRenderer(this);
		chassis7_r1.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis7_r1);
		setRotationAngle(chassis7_r1, -0.1115F, 0.0F, 0.0F);
		chassis7_r1.cubeList.add(new ModelBox(chassis7_r1, 77, 189, 0.0F, 0.0F, 0.0F, 3, 1, 27, 0.0F, false));

		chassis10_r1 = new ModelRenderer(this);
		chassis10_r1.setRotationPoint(0.5F, -27.76F, 23.35F);
		chassis.addChild(chassis10_r1);
		setRotationAngle(chassis10_r1, -1.2033F, 0.2045F, -0.4855F);
		chassis10_r1.cubeList.add(new ModelBox(chassis10_r1, 49, 35, -1.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		chassis9_r2 = new ModelRenderer(this);
		chassis9_r2.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis9_r2);
		setRotationAngle(chassis9_r2, -1.2033F, -0.2045F, 0.4855F);
		chassis9_r2.cubeList.add(new ModelBox(chassis9_r2, 49, 43, 0.0F, 0.0F, 0.0F, 1, 5, 1, 0.0F, false));

		chassis8_r2 = new ModelRenderer(this);
		chassis8_r2.setRotationPoint(-2.5F, -27.76F, 23.35F);
		chassis.addChild(chassis8_r2);
		setRotationAngle(chassis8_r2, -1.1525F, 0.0F, 0.0F);
		chassis8_r2.cubeList.add(new ModelBox(chassis8_r2, 26, 76, 0.0F, 0.0F, 0.0F, 3, 5, 1, 0.0F, false));

		chassis11_r1 = new ModelRenderer(this);
		chassis11_r1.setRotationPoint(0.5F, -26.76F, 21.35F);
		chassis.addChild(chassis11_r1);
		setRotationAngle(chassis11_r1, -1.4983F, 0.0418F, -0.5221F);
		chassis11_r1.cubeList.add(new ModelBox(chassis11_r1, 18, 62, -1.0F, 0.0F, 0.0F, 1, 4, 1, 0.001F, false));

		chassis10_r2 = new ModelRenderer(this);
		chassis10_r2.setRotationPoint(-2.5F, -26.76F, 21.35F);
		chassis.addChild(chassis10_r2);
		setRotationAngle(chassis10_r2, -1.4983F, -0.0418F, 0.5221F);
		chassis10_r2.cubeList.add(new ModelBox(chassis10_r2, 77, 59, 0.0F, 0.0F, 0.0F, 1, 4, 1, 0.001F, false));

		chassis9_r3 = new ModelRenderer(this);
		chassis9_r3.setRotationPoint(-2.5F, -26.76F, 21.35F);
		chassis.addChild(chassis9_r3);
		setRotationAngle(chassis9_r3, -1.4871F, 0.0F, 0.0F);
		chassis9_r3.cubeList.add(new ModelBox(chassis9_r3, 114, 29, 0.0F, 0.0F, 0.0F, 3, 3, 1, 0.001F, false));

		chassis47_r1 = new ModelRenderer(this);
		chassis47_r1.setRotationPoint(1.0F, -28.1F, 10.15F);
		chassis.addChild(chassis47_r1);
		setRotationAngle(chassis47_r1, 0.2586F, 0.1441F, 2.6463F);
		chassis47_r1.cubeList.add(new ModelBox(chassis47_r1, 132, 189, 0.0F, 0.0F, 0.0F, 1, 1, 9, 0.0F, false));

		chassis46_r1 = new ModelRenderer(this);
		chassis46_r1.setRotationPoint(1.0F, -28.1F, -6.65F);
		chassis.addChild(chassis46_r1);
		setRotationAngle(chassis46_r1, 0.0F, 0.0F, 2.8999F);
		chassis46_r1.cubeList.add(new ModelBox(chassis46_r1, 114, 77, 0.0F, 0.0F, -1.0F, 1, 2, 17, 0.0F, false));

		chassis54_r1 = new ModelRenderer(this);
		chassis54_r1.setRotationPoint(-2.8F, -28.1F, -44.65F);
		chassis.addChild(chassis54_r1);
		setRotationAngle(chassis54_r1, 0.0012F, -0.0056F, 0.0F);
		chassis54_r1.cubeList.add(new ModelBox(chassis54_r1, 40, 52, 0.0F, 0.6F, 21.0F, 1, 1, 16, 0.002F, false));
		chassis54_r1.cubeList.add(new ModelBox(chassis54_r1, 205, 236, 0.0F, 0.0F, 0.0F, 1, 1, 37, 0.0F, false));

		chassis54_r2 = new ModelRenderer(this);
		chassis54_r2.setRotationPoint(-2.8F, -27.6F, -44.65F);
		chassis.addChild(chassis54_r2);
		setRotationAngle(chassis54_r2, -0.0227F, -0.0056F, 0.0F);
		chassis54_r2.cubeList.add(new ModelBox(chassis54_r2, 240, 152, 0.0F, 0.0F, 0.03F, 1, 1, 37, 0.001F, false));

		chassis52_r1 = new ModelRenderer(this);
		chassis52_r1.setRotationPoint(-2.8F, -28.1F, -44.65F);
		chassis.addChild(chassis52_r1);
		setRotationAngle(chassis52_r1, 0.0F, 0.0056F, -2.8972F);
		chassis52_r1.cubeList.add(new ModelBox(chassis52_r1, 166, 234, -1.0F, 0.0F, 0.0F, 1, 2, 37, 0.0F, false));

		chassis55_r1 = new ModelRenderer(this);
		chassis55_r1.setRotationPoint(-2.8F, -26.6F, -44.65F);
		chassis.addChild(chassis55_r1);
		setRotationAngle(chassis55_r1, -0.0079F, -0.0211F, -0.9948F);
		chassis55_r1.cubeList.add(new ModelBox(chassis55_r1, 123, 230, 0.0F, 0.0F, 0.03F, 1, 1, 39, 0.001F, false));

		chassis54_r3 = new ModelRenderer(this);
		chassis54_r3.setRotationPoint(0.8F, -26.6F, -44.65F);
		chassis.addChild(chassis54_r3);
		setRotationAngle(chassis54_r3, -0.0079F, 0.0211F, 0.9948F);
		chassis54_r3.cubeList.add(new ModelBox(chassis54_r3, 231, 0, -1.0F, 0.0F, 0.03F, 1, 1, 39, 0.001F, false));

		chassis53_r1 = new ModelRenderer(this);
		chassis53_r1.setRotationPoint(0.8F, -27.6F, -44.65F);
		chassis.addChild(chassis53_r1);
		setRotationAngle(chassis53_r1, -0.0227F, 0.0056F, 0.0F);
		chassis53_r1.cubeList.add(new ModelBox(chassis53_r1, 244, 232, -1.0F, 0.0F, 0.03F, 1, 1, 37, 0.001F, false));

		chassis53_r2 = new ModelRenderer(this);
		chassis53_r2.setRotationPoint(0.8F, -28.1F, -44.65F);
		chassis.addChild(chassis53_r2);
		setRotationAngle(chassis53_r2, 0.0012F, 0.0056F, 0.0F);
		chassis53_r2.cubeList.add(new ModelBox(chassis53_r2, 0, 76, -1.0F, 0.6F, 21.0F, 1, 1, 16, 0.002F, false));
		chassis53_r2.cubeList.add(new ModelBox(chassis53_r2, 0, 269, -1.0F, 0.0F, 0.0F, 1, 1, 37, 0.0F, false));

		chassis51_r1 = new ModelRenderer(this);
		chassis51_r1.setRotationPoint(0.8F, -28.1F, -44.65F);
		chassis.addChild(chassis51_r1);
		setRotationAngle(chassis51_r1, 0.0F, -0.0056F, 2.8972F);
		chassis51_r1.cubeList.add(new ModelBox(chassis51_r1, 235, 193, 0.0F, 0.0F, 0.0F, 1, 2, 37, 0.0F, false));

		chassis57 = new ModelRenderer(this);
		chassis57.setRotationPoint(-2.5F, -30.1F, 7.0F);
		chassis.addChild(chassis57);
		chassis57.cubeList.add(new ModelBox(chassis57, 117, 103, 0.0F, 0.0F, 0.0F, 1, 1, 1, 0.002F, false));

		chassis56 = new ModelRenderer(this);
		chassis56.setRotationPoint(-3.0F, -28.1F, 7.0F);
		chassis.addChild(chassis56);
		setRotationAngle(chassis56, 0.0F, 0.0F, -1.3384F);
		chassis56.cubeList.add(new ModelBox(chassis56, 85, 16, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		chassis55 = new ModelRenderer(this);
		chassis55.setRotationPoint(-3.0F, -28.1F, -3.65F);
		chassis.addChild(chassis55);
		setRotationAngle(chassis55, 0.0F, 0.0F, -1.3384F);
		chassis55.cubeList.add(new ModelBox(chassis55, 58, 17, 0.0F, 0.0F, -1.0F, 1, 1, 7, 0.0F, false));
		chassis55.cubeList.add(new ModelBox(chassis55, 58, 8, 0.5F, 0.0F, -1.0F, 1, 1, 7, -0.001F, false));

		chassis48 = new ModelRenderer(this);
		chassis48.setRotationPoint(-3.0F, -28.1F, 7.35F);
		chassis.addChild(chassis48);
		setRotationAngle(chassis48, 0.0F, 0.0F, -1.3384F);
		chassis48.cubeList.add(new ModelBox(chassis48, 85, 18, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		chassis46 = new ModelRenderer(this);
		chassis46.setRotationPoint(1.0F, -28.1F, -6.65F);
		chassis.addChild(chassis46);
		setRotationAngle(chassis46, 0.0F, 0.0F, 2.8999F);
		chassis46.cubeList.add(new ModelBox(chassis46, 117, 78, 0.0F, 0.0F, 15.9F, 1, 1, 1, -0.001F, false));
		chassis46.cubeList.add(new ModelBox(chassis46, 77, 117, 0.0F, 0.7F, 15.9F, 1, 1, 1, -0.002F, false));

		chassis36 = new ModelRenderer(this);
		chassis36.setRotationPoint(-3.0F, -28.1F, -6.65F);
		chassis.addChild(chassis36);
		setRotationAngle(chassis36, 0.0F, 0.0F, -2.8999F);
		chassis36.cubeList.add(new ModelBox(chassis36, 117, 66, -1.0F, 0.0F, 15.9F, 1, 1, 1, -0.001F, false));
		chassis36.cubeList.add(new ModelBox(chassis36, 117, 64, -1.0F, 0.7F, 15.9F, 1, 1, 1, -0.002F, false));

		chassis45 = new ModelRenderer(this);
		chassis45.setRotationPoint(-3.0F, -28.1F, 2.35F);
		chassis.addChild(chassis45);
		setRotationAngle(chassis45, 0.0F, 0.0F, -1.3384F);
		chassis45.cubeList.add(new ModelBox(chassis45, 40, 10, 0.0F, 0.0F, 0.0F, 2, 1, 5, 0.0F, false));

		chassis44 = new ModelRenderer(this);
		chassis44.setRotationPoint(-3.0F, -28.1F, -6.65F);
		chassis.addChild(chassis44);
		setRotationAngle(chassis44, 0.0F, 0.0F, -1.3384F);
		chassis44.cubeList.add(new ModelBox(chassis44, 37, 105, 0.0F, 0.0F, -1.0F, 2, 1, 3, -0.001F, false));

		chassis39 = new ModelRenderer(this);
		chassis39.setRotationPoint(-3.0F, -28.5F, 9.2F);
		chassis.addChild(chassis39);
		chassis39.cubeList.add(new ModelBox(chassis39, 77, 68, 0.0F, 0.4F, 0.0F, 4, 2, 1, -0.001F, false));

		chassis38 = new ModelRenderer(this);
		chassis38.setRotationPoint(-3.0F, -28.1F, -4.65F);
		chassis.addChild(chassis38);
		chassis38.cubeList.add(new ModelBox(chassis38, 271, 76, 0.0F, 0.0F, -3.0F, 4, 2, 17, 0.0F, false));

		chassis37 = new ModelRenderer(this);
		chassis37.setRotationPoint(-2.0F, -30.1F, -44.65F);
		chassis.addChild(chassis37);
		setRotationAngle(chassis37, 0.0F, -0.0124F, 0.0F);
		chassis37.cubeList.add(new ModelBox(chassis37, 0, 228, 0.0F, 0.0F, 0.0F, 1, 1, 40, 0.0F, false));

		chassis35 = new ModelRenderer(this);
		chassis35.setRotationPoint(0.0F, -30.1F, -44.65F);
		chassis.addChild(chassis35);
		setRotationAngle(chassis35, 0.0F, 0.0124F, 0.0F);
		chassis35.cubeList.add(new ModelBox(chassis35, 198, 152, -1.0F, 0.0F, 0.0F, 1, 1, 40, 0.0F, false));

		chassis34 = new ModelRenderer(this);
		chassis34.setRotationPoint(-2.5F, -25.9F, -44.65F);
		chassis.addChild(chassis34);
		setRotationAngle(chassis34, 1.5533F, 0.0F, 0.0F);
		chassis34.cubeList.add(new ModelBox(chassis34, 181, 273, 0.6F, 0.0F, 0.0F, 2, 58, 1, 0.0F, false));
		chassis34.cubeList.add(new ModelBox(chassis34, 224, 0, 0.4F, 0.0F, 0.0F, 1, 58, 1, 0.001F, false));

		chassis33 = new ModelRenderer(this);
		chassis33.setRotationPoint(-3.0F, -26.0F, -21.65F);
		chassis.addChild(chassis33);
		setRotationAngle(chassis33, 1.5533F, 0.0F, 0.0F);
		chassis33.cubeList.add(new ModelBox(chassis33, 97, 153, 0.0F, 14.0F, 0.0F, 4, 19, 1, 0.001F, false));

		chassis31 = new ModelRenderer(this);
		chassis31.setRotationPoint(-0.5F, -30.1F, -4.65F);
		chassis.addChild(chassis31);
		chassis31.cubeList.add(new ModelBox(chassis31, 0, 152, 0.0F, 0.0F, 0.0F, 1, 1, 14, -0.001F, false));

		chassis30 = new ModelRenderer(this);
		chassis30.setRotationPoint(-2.0F, -30.1F, -44.65F);
		chassis.addChild(chassis30);
		chassis30.cubeList.add(new ModelBox(chassis30, 154, 153, 0.0F, 0.0F, 0.0F, 2, 1, 40, 0.001F, false));

		chassis29 = new ModelRenderer(this);
		chassis29.setRotationPoint(-2.5F, -30.1F, 2.35F);
		chassis.addChild(chassis29);
		chassis29.cubeList.add(new ModelBox(chassis29, 94, 58, 0.0F, 0.0F, 0.0F, 1, 1, 5, -0.001F, false));
		chassis29.cubeList.add(new ModelBox(chassis29, 58, 0, -0.1F, 0.5F, -7.0F, 1, 1, 7, 0.0F, false));

		chassis23 = new ModelRenderer(this);
		chassis23.setRotationPoint(-3.0F, -21.2F, 25.2F);
		chassis.addChild(chassis23);
		setRotationAngle(chassis23, 1.2641F, 0.0F, 0.0F);
		chassis23.cubeList.add(new ModelBox(chassis23, 77, 153, 0.0F, 0.0F, -1.0F, 4, 20, 5, 0.001F, false));

		chassis22 = new ModelRenderer(this);
		chassis22.setRotationPoint(-3.0F, -26.0F, 23.35F);
		chassis.addChild(chassis22);
		setRotationAngle(chassis22, -0.1115F, 0.0F, 0.0F);
		chassis22.cubeList.add(new ModelBox(chassis22, 39, 269, 0.0F, 0.0F, 0.0F, 4, 5, 23, 0.0F, false));

		chassis21 = new ModelRenderer(this);
		chassis21.setRotationPoint(-3.0F, -23.3F, 48.1F);
		chassis.addChild(chassis21);
		setRotationAngle(chassis21, -1.7299F, 0.0F, 0.0F);
		chassis21.cubeList.add(new ModelBox(chassis21, 114, 153, 0.0F, -2.0F, 0.0F, 4, 5, 10, -0.001F, false));

		chassis20 = new ModelRenderer(this);
		chassis20.setRotationPoint(-3.0F, -21.2F, 23.8F);
		chassis.addChild(chassis20);
		setRotationAngle(chassis20, 1.2641F, 0.0F, 0.0F);
		chassis20.cubeList.add(new ModelBox(chassis20, 142, 153, 0.0F, 0.0F, -1.0F, 4, 26, 1, 0.0F, false));

		chassis19 = new ModelRenderer(this);
		chassis19.setRotationPoint(-3.0F, -20.25F, 24.4F);
		chassis.addChild(chassis19);
		setRotationAngle(chassis19, -1.2641F, 0.0F, 0.0F);
		chassis19.cubeList.add(new ModelBox(chassis19, 77, 98, 0.0F, 0.0F, -1.0F, 4, 6, 1, -0.002F, false));

		chassis18 = new ModelRenderer(this);
		chassis18.setRotationPoint(-3.0F, -21.5F, 18.4F);
		chassis.addChild(chassis18);
		setRotationAngle(chassis18, 0.409F, 0.0F, 0.0F);
		chassis18.cubeList.add(new ModelBox(chassis18, 48, 70, 0.0F, 0.0F, -1.0F, 4, 3, 2, 0.001F, false));

		chassis17 = new ModelRenderer(this);
		chassis17.setRotationPoint(-3.0F, -23.3F, 16.75F);
		chassis.addChild(chassis17);
		setRotationAngle(chassis17, 0.632F, 0.0F, 0.0F);
		chassis17.cubeList.add(new ModelBox(chassis17, 77, 0, 0.0F, 0.0F, -1.0F, 4, 4, 3, 0.003F, false));

		chassis16 = new ModelRenderer(this);
		chassis16.setRotationPoint(-3.0F, -25.2F, 13.5F);
		chassis.addChild(chassis16);
		setRotationAngle(chassis16, 1.041F, 0.0F, 0.0F);
		chassis16.cubeList.add(new ModelBox(chassis16, 0, 83, 0.0F, 0.0F, -1.0F, 4, 5, 2, -0.001F, false));

		chassis15 = new ModelRenderer(this);
		chassis15.setRotationPoint(-3.0F, -26.4F, 10.3F);
		chassis.addChild(chassis15);
		setRotationAngle(chassis15, 1.2269F, 0.0F, 0.0F);
		chassis15.cubeList.add(new ModelBox(chassis15, 56, 98, 0.0F, 0.0F, -1.0F, 4, 4, 2, 0.0F, false));

		chassis14 = new ModelRenderer(this);
		chassis14.setRotationPoint(-2.0F, -20.3F, 23.5F);
		chassis.addChild(chassis14);
		setRotationAngle(chassis14, 1.2641F, 0.0F, 0.0F);
		chassis14.cubeList.add(new ModelBox(chassis14, 67, 152, 0.0F, 0.0F, -1.0F, 2, 26, 1, 0.0F, false));

		chassis13 = new ModelRenderer(this);
		chassis13.setRotationPoint(-2.0F, -19.2F, 23.8F);
		chassis.addChild(chassis13);
		setRotationAngle(chassis13, -1.2641F, 0.0F, 0.0F);
		chassis13.cubeList.add(new ModelBox(chassis13, 9, 0, 0.0F, 0.0F, -1.0F, 2, 6, 1, 0.001F, false));

		chassis12 = new ModelRenderer(this);
		chassis12.setRotationPoint(-3.0F, -27.0F, 23.35F);
		chassis.addChild(chassis12);
		setRotationAngle(chassis12, -0.1115F, 0.0F, 0.0F);
		chassis12.cubeList.add(new ModelBox(chassis12, 154, 112, 0.0F, 0.1F, 0.0F, 4, 1, 27, 0.0F, false));

		chassis11 = new ModelRenderer(this);
		chassis11.setRotationPoint(-3.0F, -27.0F, 23.35F);
		chassis.addChild(chassis11);
		setRotationAngle(chassis11, -1.1525F, 0.0F, 0.0F);
		chassis11.cubeList.add(new ModelBox(chassis11, 190, 59, 0.0F, 0.0F, 0.1F, 4, 4, 6, -0.001F, false));

		chassis10 = new ModelRenderer(this);
		chassis10.setRotationPoint(-3.0F, -26.0F, 22.0F);
		chassis.addChild(chassis10);
		setRotationAngle(chassis10, -1.4871F, 0.0F, 0.0F);
		chassis10.cubeList.add(new ModelBox(chassis10, 190, 77, 0.0F, 0.0F, 0.0F, 4, 4, 6, 0.0F, false));

		chassis6 = new ModelRenderer(this);
		chassis6.setRotationPoint(-2.0F, -20.5F, 17.8F);
		chassis.addChild(chassis6);
		setRotationAngle(chassis6, 0.409F, 0.0F, 0.0F);
		chassis6.cubeList.add(new ModelBox(chassis6, 18, 54, 0.0F, 0.0F, -1.0F, 2, 3, 1, 0.0F, false));

		chassis5 = new ModelRenderer(this);
		chassis5.setRotationPoint(-2.0F, -22.7F, 16.0F);
		chassis.addChild(chassis5);
		setRotationAngle(chassis5, 0.632F, 0.0F, 0.0F);
		chassis5.cubeList.add(new ModelBox(chassis5, 40, 0, 0.0F, 0.0F, -1.0F, 2, 4, 1, -0.001F, false));

		chassis4 = new ModelRenderer(this);
		chassis4.setRotationPoint(-2.0F, -24.4F, 13.0F);
		chassis.addChild(chassis4);
		setRotationAngle(chassis4, 1.041F, 0.0F, 0.0F);
		chassis4.cubeList.add(new ModelBox(chassis4, 40, 17, 0.0F, 0.0F, -1.0F, 2, 4, 1, 0.001F, false));

		chassis3 = new ModelRenderer(this);
		chassis3.setRotationPoint(-2.0F, -25.5F, 10.0F);
		chassis.addChild(chassis3);
		setRotationAngle(chassis3, 1.2269F, 0.0F, 0.0F);
		chassis3.cubeList.add(new ModelBox(chassis3, 0, 35, 0.0F, -1.0F, -1.0F, 2, 5, 1, 0.0F, false));

		chassis2 = new ModelRenderer(this);
		chassis2.setRotationPoint(-3.0F, -28.5F, 11.2F);
		chassis.addChild(chassis2);
		setRotationAngle(chassis2, -0.2952F, 0.0F, 0.0F);
		chassis2.cubeList.add(new ModelBox(chassis2, 37, 98, 0.0F, 0.6909F, -0.9568F, 4, 2, 11, 0.002F, false));

		chassis1 = new ModelRenderer(this);
		chassis1.setRotationPoint(-2.5F, -30.1F, 10.35F);
		chassis.addChild(chassis1);
		setRotationAngle(chassis1, -0.3718F, 0.0F, 0.0F);
		chassis1.cubeList.add(new ModelBox(chassis1, 49, 52, 2.0F, 0.3633F, -0.9317F, 1, 2, 2, 0.0F, false));
		chassis1.cubeList.add(new ModelBox(chassis1, 40, 52, 0.0F, 0.3633F, -0.9317F, 1, 2, 2, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(0.5F, -25.1F, -7.0F);
		chassis.addChild(bone);
		setRotationAngle(bone, -0.0262F, 0.0F, 0.0F);
		bone.cubeList.add(new ModelBox(bone, 154, 140, -3.01F, -1.0F, 1.0F, 3, 1, 9, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 114, 4, -3.01F, -1.1F, 10.0F, 3, 3, 1, 0.0F, false));
		bone.cubeList.add(new ModelBox(bone, 8, 90, -3.01F, 0.0F, 1.0F, 3, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.5411F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 114, 0, -3.01F, 3.8F, 7.6F, 3, 3, 1, -0.001F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r2);
		setRotationAngle(cube_r2, -0.5236F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 93, 72, -3.01F, -2.15F, 1.25F, 3, 2, 1, -0.001F, false));

		gun30 = new ModelRenderer(this);
		gun30.setRotationPoint(-2.0F, -24.7F, 10.0F);
		chassis.addChild(gun30);
		setRotationAngle(gun30, -1.8961F, 0.0F, 0.0F);
		gun30.cubeList.add(new ModelBox(gun30, 94, 12, 0.0F, 0.0F, 0.0F, 2, 1, 2, -0.001F, false));

		gun33 = new ModelRenderer(this);
		gun33.setRotationPoint(-2.0F, -22.8F, 9.4F);
		chassis.addChild(gun33);
		setRotationAngle(gun33, -2.4166F, 0.0F, 0.0F);
		gun33.cubeList.add(new ModelBox(gun33, 27, 40, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.0F, false));

		gun34 = new ModelRenderer(this);
		gun34.setRotationPoint(-2.0F, -22.3F, 8.8F);
		chassis.addChild(gun34);
		setRotationAngle(gun34, -2.4166F, 0.0F, 0.0F);
		gun34.cubeList.add(new ModelBox(gun34, 40, 22, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun32 = new ModelRenderer(this);
		gun32.setRotationPoint(-2.0F, -23.1F, 5.2F);
		chassis.addChild(gun32);
		setRotationAngle(gun32, -0.1487F, 0.0F, 0.0F);
		gun32.cubeList.add(new ModelBox(gun32, 56, 104, 0.0F, 0.0F, 0.0F, 2, 1, 3, 0.0F, false));

		gun29 = new ModelRenderer(this);
		gun29.setRotationPoint(-2.0F, -24.7F, 4.0F);
		chassis.addChild(gun29);
		setRotationAngle(gun29, 0.1487F, 0.0F, 0.0F);
		gun29.cubeList.add(new ModelBox(gun29, 48, 79, 0.0F, 0.0F, 0.0F, 2, 2, 1, 0.0F, false));

		gun31 = new ModelRenderer(this);
		gun31.setRotationPoint(-2.0F, -22.7F, 4.3F);
		chassis.addChild(gun31);
		setRotationAngle(gun31, 0.9295F, 0.0F, 0.0F);
		gun31.cubeList.add(new ModelBox(gun31, 69, 28, 0.0F, 0.0F, 0.0F, 2, 1, 1, 0.001F, false));

		gun35 = new ModelRenderer(this);
		gun35.setRotationPoint(-2.0F, -24.5F, 3.3F);
		chassis.addChild(gun35);
		setRotationAngle(gun35, 1.5533F, 0.0F, 0.0F);
		gun35.cubeList.add(new ModelBox(gun35, 0, 0, 0.0F, 0.0F, 0.0F, 2, 6, 1, 0.001F, false));

		gun36 = new ModelRenderer(this);
		gun36.setRotationPoint(-2.0F, -24.5F, 3.3F);
		chassis.addChild(gun36);
		setRotationAngle(gun36, 1.0328F, 0.0F, 0.0F);
		gun36.cubeList.add(new ModelBox(gun36, 18, 40, 0.0F, 0.0F, 0.0F, 2, 1, 1, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		chassis.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}