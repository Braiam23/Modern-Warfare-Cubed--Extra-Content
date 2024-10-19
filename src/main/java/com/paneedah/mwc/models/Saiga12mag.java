package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Saiga12mag extends ModelWithAttachments {
	private final ModelRenderer gun;
	private final ModelRenderer mag;
	private final ModelRenderer Mag25_r1;
	private final ModelRenderer Mag24_r1;
	private final ModelRenderer Mag23_r1;
	private final ModelRenderer Mag22_r1;
	private final ModelRenderer Mag21_r1;
	private final ModelRenderer Mag20_r1;
	private final ModelRenderer Mag19_r1;
	private final ModelRenderer Mag18_r1;
	private final ModelRenderer Mag14_r1;
	private final ModelRenderer Mag13_r1;
	private final ModelRenderer Mag12_r1;
	private final ModelRenderer Mag11_r1;
	private final ModelRenderer Mag10_r1;
	private final ModelRenderer Mag9_r1;
	private final ModelRenderer Mag8_r1;
	private final ModelRenderer Mag7_r1;
	private final ModelRenderer Mag6_r1;
	private final ModelRenderer Mag3_r1;
	private final ModelRenderer Mag3_r2;
	private final ModelRenderer Mag2_r1;

	public Saiga12mag() {
		textureWidth = 280;
		textureHeight = 280;

		gun = new ModelRenderer(this);
		gun.setRotationPoint(-1.5F, -1.0F, -6.0F);
		

		mag = new ModelRenderer(this);
		mag.setRotationPoint(0.1F, 9.2479F, -22.3963F);
		gun.addChild(mag);
		mag.cubeList.add(new ModelBox(mag, 80, 22, -1.8F, -15.2479F, -2.6037F, 3, 2, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 70, 10, -1.8F, -17.2479F, 4.3963F, 1, 2, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 80, 34, -1.8F, -15.9479F, 2.3963F, 1, 1, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 70, 44, -1.7F, -16.1479F, -2.6037F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 13, 25, 0.7F, -17.2479F, 4.3963F, 1, 2, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 80, 17, 0.7F, -15.9479F, 2.3963F, 1, 1, 2, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 66, 69, 0.6F, -16.1479F, -2.6037F, 1, 1, 3, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 64, 60, -2.1F, -13.2479F, 6.3963F, 4, 1, 1, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 29, 106, 0.6F, -15.2479F, -2.6037F, 1, 2, 10, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 57, 10, -2.1F, -15.2479F, 2.3963F, 4, 2, 5, 0.0F, false));
		mag.cubeList.add(new ModelBox(mag, 68, 17, -2.1F, -15.2479F, 6.5963F, 4, 2, 1, 0.0F, false));

		Mag25_r1 = new ModelRenderer(this);
		Mag25_r1.setRotationPoint(1.4F, 15.2276F, 23.4064F);
		mag.addChild(Mag25_r1);
		setRotationAngle(Mag25_r1, -0.2094F, 0.0F, 0.0F);
		Mag25_r1.cubeList.add(new ModelBox(Mag25_r1, 18, 19, -0.35F, -26.0966F, -21.7081F, 1, 2, 1, 0.0F, false));

		Mag24_r1 = new ModelRenderer(this);
		Mag24_r1.setRotationPoint(1.4F, 19.4309F, 21.5982F);
		mag.addChild(Mag24_r1);
		setRotationAngle(Mag24_r1, -0.2094F, 0.0F, 0.0F);
		Mag24_r1.cubeList.add(new ModelBox(Mag24_r1, 39, 0, -3.65F, -30.5F, -20.9F, 1, 2, 1, 0.0F, false));

		Mag23_r1 = new ModelRenderer(this);
		Mag23_r1.setRotationPoint(-21.1404F, 8.5694F, 28.3963F);
		mag.addChild(Mag23_r1);
		setRotationAngle(Mag23_r1, 0.0F, 0.0F, 0.7854F);
		Mag23_r1.cubeList.add(new ModelBox(Mag23_r1, 11, 17, -2.6F, -30.8F, -30.7F, 1, 1, 5, 0.0F, false));

		Mag22_r1 = new ModelRenderer(this);
		Mag22_r1.setRotationPoint(-20.496F, 7.0138F, 28.3963F);
		mag.addChild(Mag22_r1);
		setRotationAngle(Mag22_r1, 0.0F, 0.0F, 0.7854F);
		Mag22_r1.cubeList.add(new ModelBox(Mag22_r1, 38, 14, -0.4F, -30.8F, -30.7F, 1, 1, 5, 0.0F, false));

		Mag21_r1 = new ModelRenderer(this);
		Mag21_r1.setRotationPoint(-20.7161F, 8.7452F, 28.3963F);
		mag.addChild(Mag21_r1);
		setRotationAngle(Mag21_r1, 0.0F, 0.0F, 0.7854F);
		Mag21_r1.cubeList.add(new ModelBox(Mag21_r1, 39, 0, -2.6F, -30.2F, -31.0F, 1, 1, 5, 0.0F, false));

		Mag20_r1 = new ModelRenderer(this);
		Mag20_r1.setRotationPoint(-20.2919F, 8.9209F, 28.3963F);
		mag.addChild(Mag20_r1);
		setRotationAngle(Mag20_r1, 0.0F, 0.0F, 0.7854F);
		Mag20_r1.cubeList.add(new ModelBox(Mag20_r1, 39, 6, -2.6F, -29.6F, -31.3F, 1, 1, 5, 0.0F, false));

		Mag19_r1 = new ModelRenderer(this);
		Mag19_r1.setRotationPoint(-20.0718F, 7.1895F, 28.3963F);
		mag.addChild(Mag19_r1);
		setRotationAngle(Mag19_r1, 0.0F, 0.0F, 0.7854F);
		Mag19_r1.cubeList.add(new ModelBox(Mag19_r1, 39, 44, -0.4F, -30.2F, -31.0F, 1, 1, 5, 0.0F, false));

		Mag18_r1 = new ModelRenderer(this);
		Mag18_r1.setRotationPoint(-19.6475F, 7.3653F, 28.3963F);
		mag.addChild(Mag18_r1);
		setRotationAngle(Mag18_r1, 0.0F, 0.0F, 0.7854F);
		Mag18_r1.cubeList.add(new ModelBox(Mag18_r1, 23, 52, -0.4F, -29.6F, -31.3F, 1, 1, 5, 0.0F, false));

		Mag14_r1 = new ModelRenderer(this);
		Mag14_r1.setRotationPoint(1.4F, 27.9234F, 17.1983F);
		mag.addChild(Mag14_r1);
		setRotationAngle(Mag14_r1, -0.4325F, 0.0F, 0.0F);
		Mag14_r1.cubeList.add(new ModelBox(Mag14_r1, 18, 13, -0.8F, -19.4F, -33.3F, 1, 5, 1, 0.0F, false));
		Mag14_r1.cubeList.add(new ModelBox(Mag14_r1, 53, 53, -3.2F, -19.4F, -33.3F, 3, 5, 1, 0.0F, false));

		Mag13_r1 = new ModelRenderer(this);
		Mag13_r1.setRotationPoint(1.4F, 20.4804F, 21.3828F);
		mag.addChild(Mag13_r1);
		setRotationAngle(Mag13_r1, -0.2094F, 0.0F, 0.0F);
		Mag13_r1.cubeList.add(new ModelBox(Mag13_r1, 47, 159, -3.5F, -31.0F, -26.0F, 4, 18, 6, 0.0F, false));

		Mag12_r1 = new ModelRenderer(this);
		Mag12_r1.setRotationPoint(1.4F, 21.5199F, 21.2736F);
		mag.addChild(Mag12_r1);
		setRotationAngle(Mag12_r1, -0.2094F, 0.0F, 0.0F);
		Mag12_r1.cubeList.add(new ModelBox(Mag12_r1, 92, 70, -0.8F, -31.0F, -31.0F, 1, 17, 5, 0.0F, false));
		Mag12_r1.cubeList.add(new ModelBox(Mag12_r1, 0, 0, -3.2F, -31.0F, -31.0F, 3, 17, 5, 0.0F, false));

		Mag11_r1 = new ModelRenderer(this);
		Mag11_r1.setRotationPoint(-19.5597F, 7.1532F, 28.3963F);
		mag.addChild(Mag11_r1);
		setRotationAngle(Mag11_r1, 0.0F, 0.0F, 0.7854F);
		Mag11_r1.cubeList.add(new ModelBox(Mag11_r1, 85, 44, -0.1F, -29.6F, -26.5F, 1, 1, 6, 0.0F, false));

		Mag10_r1 = new ModelRenderer(this);
		Mag10_r1.setRotationPoint(-19.9839F, 6.9774F, 28.3963F);
		mag.addChild(Mag10_r1);
		setRotationAngle(Mag10_r1, 0.0F, 0.0F, 0.7854F);
		Mag10_r1.cubeList.add(new ModelBox(Mag10_r1, 88, 36, -0.1F, -30.2F, -26.3F, 1, 1, 6, 0.0F, false));

		Mag9_r1 = new ModelRenderer(this);
		Mag9_r1.setRotationPoint(-20.4082F, 6.8017F, 28.3963F);
		mag.addChild(Mag9_r1);
		setRotationAngle(Mag9_r1, 0.0F, 0.0F, 0.7854F);
		Mag9_r1.cubeList.add(new ModelBox(Mag9_r1, 89, 13, -0.1F, -30.8F, -26.2F, 1, 1, 6, 0.0F, false));

		Mag8_r1 = new ModelRenderer(this);
		Mag8_r1.setRotationPoint(-20.3798F, 9.1331F, 28.3963F);
		mag.addChild(Mag8_r1);
		setRotationAngle(Mag8_r1, 0.0F, 0.0F, 0.7854F);
		Mag8_r1.cubeList.add(new ModelBox(Mag8_r1, 90, 53, -2.9F, -29.6F, -26.5F, 1, 1, 6, 0.0F, false));

		Mag7_r1 = new ModelRenderer(this);
		Mag7_r1.setRotationPoint(-20.804F, 8.9573F, 28.3963F);
		mag.addChild(Mag7_r1);
		setRotationAngle(Mag7_r1, 0.0F, 0.0F, 0.7854F);
		Mag7_r1.cubeList.add(new ModelBox(Mag7_r1, 94, 0, -2.9F, -30.2F, -26.3F, 1, 1, 6, 0.0F, false));

		Mag6_r1 = new ModelRenderer(this);
		Mag6_r1.setRotationPoint(-21.2283F, 8.7816F, 28.3963F);
		mag.addChild(Mag6_r1);
		setRotationAngle(Mag6_r1, 0.0F, 0.0F, 0.7854F);
		Mag6_r1.cubeList.add(new ModelBox(Mag6_r1, 53, 94, -2.9F, -30.8F, -26.2F, 1, 1, 6, 0.0F, false));

		Mag3_r1 = new ModelRenderer(this);
		Mag3_r1.setRotationPoint(-1.5F, 15.7521F, 28.3963F);
		mag.addChild(Mag3_r1);
		setRotationAngle(Mag3_r1, 1.0036F, 0.0F, 0.0F);
		Mag3_r1.cubeList.add(new ModelBox(Mag3_r1, 90, 53, 2.1F, -38.0F, 12.9F, 1, 1, 2, 0.0F, false));
		Mag3_r1.cubeList.add(new ModelBox(Mag3_r1, 90, 56, -0.2F, -38.0F, 12.9F, 1, 1, 2, 0.0F, false));

		Mag3_r2 = new ModelRenderer(this);
		Mag3_r2.setRotationPoint(-1.5F, 15.7521F, 28.3963F);
		mag.addChild(Mag3_r2);
		setRotationAngle(Mag3_r2, 0.4363F, 0.0F, 0.0F);
		Mag3_r2.cubeList.add(new ModelBox(Mag3_r2, 38, 52, 2.2F, -38.4F, -6.3F, 1, 2, 1, 0.0F, false));
		Mag3_r2.cubeList.add(new ModelBox(Mag3_r2, 57, 10, -0.3F, -38.4F, -6.3F, 1, 2, 1, 0.0F, false));

		Mag2_r1 = new ModelRenderer(this);
		Mag2_r1.setRotationPoint(1.4F, 19.3992F, 21.4965F);
		mag.addChild(Mag2_r1);
		setRotationAngle(Mag2_r1, -0.2094F, 0.0F, 0.0F);
		Mag2_r1.cubeList.add(new ModelBox(Mag2_r1, 68, 5, -3.5F, -31.0F, -20.8F, 4, 3, 1, 0.0F, false));
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