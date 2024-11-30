package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKS74UFrontSight extends ModelWithAttachments {
	private final ModelRenderer frontsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public AKS74UFrontSight() {
		textureWidth = 150;
		textureHeight = 150;

		frontsight = new ModelRenderer(this);
		frontsight.setRotationPoint(0.0F, 24.0F, 0.0F);
		frontsight.cubeList.add(new ModelBox(frontsight, 3, 3, 1.995F, -16.851F, -90.295F, 1, 3, 5, 0.0F, true));
		frontsight.cubeList.add(new ModelBox(frontsight, 3, 3, -1.495F, -13.351F, -90.295F, 3, 7, 5, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 7, 7, -0.495F, -15.351F, -88.295F, 1, 2, 1, 0.0F, false));
		frontsight.cubeList.add(new ModelBox(frontsight, 3, 3, -2.995F, -16.851F, -90.295F, 1, 3, 5, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(0.005F, -9.851F, -87.795F);
		frontsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.1396F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 7, 7, -1.5F, -3.1F, 2.0F, 3, 8, 1, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.495F, -12.351F, -87.795F);
		frontsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, 0.7854F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 3, 3, -5.6F, -1.7F, -2.5F, 1, 1, 5, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.505F, -12.351F, -87.795F);
		frontsight.addChild(cube_r3);
		setRotationAngle(cube_r3, 0.0F, 0.0F, -0.7854F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 3, 3, -1.4F, -3.5F, -2.5F, 1, 3, 5, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-0.505F, -12.351F, -87.795F);
		frontsight.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, 0.7854F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 3, 3, 0.4F, -3.5F, -2.5F, 1, 3, 5, 0.0F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.495F, -12.351F, -87.795F);
		frontsight.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, -0.7854F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 3, 3, 4.6F, -1.7F, -2.5F, 1, 1, 5, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		frontsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}