package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKSaction extends ModelWithAttachments {
	private final ModelRenderer action;
	private final ModelRenderer action11_r1;
	private final ModelRenderer action14_r1;
	private final ModelRenderer action15_r1;
	private final ModelRenderer action17_r1;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;

	public AKSaction() {
		textureWidth = 256;
		textureHeight = 256;

		action = new ModelRenderer(this);
		action.setRotationPoint(-1.9F, 25.0F, -0.6F);
		action.cubeList.add(new ModelBox(action, 66, 191, -1.2F, -37.975F, -27.325F, 1, 1, 14, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 52, 206, -1.5F, -36.975F, -26.725F, 1, 1, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 206, 137, -1.5F, -37.975F, -26.725F, 1, 1, 11, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 188, 52, -1.2F, -36.975F, -27.325F, 1, 1, 15, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 166, 111, -0.6F, -37.975F, -27.325F, 2, 1, 14, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 88, 175, -0.6F, -36.975F, -27.325F, 2, 1, 15, 0.0F, false));
		action.cubeList.add(new ModelBox(action, 230, 134, -1.701F, -37.0F, -26.701F, 1, 1, 4, 0.0F, false));

		action11_r1 = new ModelRenderer(this);
		action11_r1.setRotationPoint(-1.2112F, -36.9569F, -24.501F);
		action.addChild(action11_r1);
		setRotationAngle(action11_r1, 0.0F, 0.0F, 0.7505F);
		action11_r1.cubeList.add(new ModelBox(action11_r1, 246, 32, -0.5388F, -0.5F, 1.0F, 1, 1, 1, -0.2F, false));
		action11_r1.cubeList.add(new ModelBox(action11_r1, 230, 139, -0.5388F, -0.5F, -2.5F, 1, 1, 4, -0.2F, false));

		action14_r1 = new ModelRenderer(this);
		action14_r1.setRotationPoint(0.1149F, -0.7F, -56.5916F);
		action.addChild(action14_r1);
		setRotationAngle(action14_r1, -3.1416F, 0.1673F, 3.1416F);
		action14_r1.cubeList.add(new ModelBox(action14_r1, 240, 243, -3.8F, -36.301F, -31.6F, 2, 1, 1, 0.0F, false));

		action15_r1 = new ModelRenderer(this);
		action15_r1.setRotationPoint(6.7733F, -0.7F, -55.276F);
		action.addChild(action15_r1);
		setRotationAngle(action15_r1, -3.1416F, 0.3904F, 3.1416F);
		action15_r1.cubeList.add(new ModelBox(action15_r1, 246, 30, -3.8F, -36.3F, -31.5F, 1, 1, 1, 0.0F, false));

		action17_r1 = new ModelRenderer(this);
		action17_r1.setRotationPoint(8.05F, -0.7F, -55.5391F);
		action.addChild(action17_r1);
		setRotationAngle(action17_r1, -3.1416F, 0.5391F, 3.1416F);
		action17_r1.cubeList.add(new ModelBox(action17_r1, 246, 28, -5.8F, -36.3F, -31.9609F, 1, 1, 1, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-0.5F, -38.0F, -13.0F);
		action.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.0F, 0.0F, 1.2043F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 240, 152, -0.3F, -1.675F, -3.925F, 1, 1, 2, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 206, 149, -0.3F, -1.675F, -13.725F, 1, 1, 11, 0.0F, false));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(0.5F, -38.0F, -13.0F);
		action.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.0F, 0.0F, -1.2043F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 152, 240, -0.7F, -1.675F, -3.925F, 1, 1, 2, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 28, 206, -0.7F, -1.675F, -13.725F, 1, 1, 11, 0.0F, false));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(0.5F, -38.0F, -13.0F);
		action.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6981F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 246, 26, -1.9F, 0.325F, -0.225F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 234, 243, -1.1F, 0.325F, -0.225F, 2, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 246, 22, -1.9F, 0.325F, 0.175F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 242, 108, -1.1F, 0.325F, 0.175F, 2, 1, 1, 0.0F, false));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(0.5F, -38.0F, -13.0F);
		action.addChild(cube_r4);
		setRotationAngle(cube_r4, 0.0F, 0.0F, -0.4014F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 240, 149, -0.975F, -1.375F, -3.925F, 1, 1, 2, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 120, 205, -0.975F, -1.375F, -13.725F, 1, 1, 11, 0.0F, false));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(-0.5F, -38.0F, -13.0F);
		action.addChild(cube_r5);
		setRotationAngle(cube_r5, 0.0F, 0.0F, 0.4014F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 240, 146, -0.05F, -1.375F, -3.925F, 1, 1, 2, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 96, 204, -0.05F, -1.375F, -13.725F, 1, 1, 11, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		action.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}