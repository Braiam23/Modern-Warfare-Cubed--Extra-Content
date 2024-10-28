package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington700Mag extends ModelWithAttachments {
	private final ModelRenderer mag_5rnd;

	public Remington700Mag() {
		textureWidth = 400;
		textureHeight = 400;

		mag_5rnd = new ModelRenderer(this);
		mag_5rnd.setRotationPoint(0.0F, -10.0F, -16.6F);
		setRotationAngle(mag_5rnd, -0.0349F, 0.0F, 0.0F);
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 27, 35, -2.25F, -1.5F, -5.8F, 2, 4, 1, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 57, 76, -2.25F, -1.5F, -3.8F, 2, 4, 7, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 0, 35, -0.75F, -1.5F, -3.8F, 1, 4, 7, 0.001F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 58, 25, -0.9F, -1.5F, -4.8F, 1, 4, 1, 0.001F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 18, 35, -2.1F, -1.5F, -4.8F, 2, 4, 1, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 40, 10, -0.75F, -1.5F, -5.8F, 1, 4, 1, 0.001F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 169, 141, -0.65F, 2.5F, -5.8F, 1, 1, 9, 0.0F, false));
		mag_5rnd.cubeList.add(new ModelBox(mag_5rnd, 130, 96, -2.35F, 2.5F, -5.8F, 2, 1, 9, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag_5rnd.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}