package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class Remington700Mag10rnd extends ModelWithAttachments {
	private final ModelRenderer mag_10rnd;

	public Remington700Mag10rnd() {
		textureWidth = 400;
		textureHeight = 400;

		mag_10rnd = new ModelRenderer(this);
		mag_10rnd.setRotationPoint(0.0F, -7.0F, -16.7F);
		setRotationAngle(mag_10rnd, -0.0349F, 0.0F, 0.0F);
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 26, 93, -2.25F, -4.5F, -5.8F, 2, 7, 1, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 37, 76, -2.25F, -4.5F, -3.8F, 2, 7, 7, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 0, 0, -0.75F, -4.5F, -3.8F, 1, 7, 7, 0.001F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 10, 54, -0.9F, -4.5F, -4.8F, 1, 7, 1, 0.001F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 15, 93, -2.1F, -4.5F, -4.8F, 2, 7, 1, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 70, 52, -0.75F, -4.5F, -5.8F, 1, 7, 1, 0.001F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 190, 24, -0.65F, 2.5F, -5.8F, 1, 1, 9, 0.0F, false));
		mag_10rnd.cubeList.add(new ModelBox(mag_10rnd, 130, 130, -2.35F, 2.5F, -5.8F, 2, 1, 9, -0.001F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		mag_10rnd.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}