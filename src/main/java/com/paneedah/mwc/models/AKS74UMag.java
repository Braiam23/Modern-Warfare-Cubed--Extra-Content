package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKS74UMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer bone5;
	private final ModelRenderer bone5_r1;
	private final ModelRenderer bone5_r2;
	private final ModelRenderer bone7;
	private final ModelRenderer bone8;
	private final ModelRenderer bone9;

	public AKS74UMag() {
		textureWidth = 256;
		textureHeight = 256;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.425F, 8.8F, -26.2F);
		

		bone5 = new ModelRenderer(this);
		bone5.setRotationPoint(0.5F, -14.6927F, 5.0326F);
		magazine.addChild(bone5);
		setRotationAngle(bone5, -0.1745F, 0.0F, 0.0F);
		bone5.cubeList.add(new ModelBox(bone5, 162, 144, -1.5F, -2.6593F, -2.7842F, 2, 6, 2, -0.001F, false));
		bone5.cubeList.add(new ModelBox(bone5, 76, 206, -2.0F, -2.6593F, -1.5342F, 3, 6, 7, 0.0F, false));

		bone5_r1 = new ModelRenderer(this);
		bone5_r1.setRotationPoint(-1.4F, -2.7593F, 1.9658F);
		bone5.addChild(bone5_r1);
		setRotationAngle(bone5_r1, 0.0F, 0.0F, 0.5236F);
		bone5_r1.cubeList.add(new ModelBox(bone5_r1, 222, 8, -0.5F, -0.5F, -3.5F, 1, 1, 5, -0.05F, false));

		bone5_r2 = new ModelRenderer(this);
		bone5_r2.setRotationPoint(0.4F, -2.7593F, 1.9658F);
		bone5.addChild(bone5_r2);
		setRotationAngle(bone5_r2, 0.0F, 0.0F, -0.5236F);
		bone5_r2.cubeList.add(new ModelBox(bone5_r2, 54, 200, -0.5F, -0.5F, -3.5F, 1, 1, 5, -0.05F, false));

		bone7 = new ModelRenderer(this);
		bone7.setRotationPoint(0.5F, -14.6927F, 5.0326F);
		magazine.addChild(bone7);
		setRotationAngle(bone7, -0.3054F, 0.0F, 0.0F);
		bone7.cubeList.add(new ModelBox(bone7, 144, 228, -1.5F, 2.5987F, -2.3949F, 2, 6, 2, 0.001F, false));
		bone7.cubeList.add(new ModelBox(bone7, 206, 193, -2.0F, 2.5987F, -1.1449F, 3, 6, 7, 0.001F, false));

		bone8 = new ModelRenderer(this);
		bone8.setRotationPoint(-1.1883F, -9.3512F, 4.8992F);
		magazine.addChild(bone8);
		setRotationAngle(bone8, -0.4363F, 0.0F, 0.0F);
		bone8.cubeList.add(new ModelBox(bone8, 228, 171, 0.1883F, 2.8635F, -3.4591F, 2, 6, 2, 0.0F, false));
		bone8.cubeList.add(new ModelBox(bone8, 206, 206, -0.3117F, 2.8635F, -2.2091F, 3, 6, 7, 0.0F, false));

		bone9 = new ModelRenderer(this);
		bone9.setRotationPoint(-1.1883F, -3.745F, 3.7015F);
		magazine.addChild(bone9);
		setRotationAngle(bone9, -0.6545F, 0.0F, 0.0F);
		bone9.cubeList.add(new ModelBox(bone9, 226, 228, 0.1883F, 2.4396F, -4.1169F, 2, 6, 2, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 0, 207, -0.3117F, 2.4396F, -2.8669F, 3, 6, 7, 0.001F, false));
		bone9.cubeList.add(new ModelBox(bone9, 206, 171, -0.3117F, 8.3396F, -3.9669F, 3, 1, 8, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		magazine.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}