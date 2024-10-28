package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class R700action extends ModelWithAttachments {
	private final ModelRenderer boltaction;
	private final ModelRenderer cube_r90;
	private final ModelRenderer cube_r91;
	private final ModelRenderer cube_r92;
	private final ModelRenderer cube_r93;
	private final ModelRenderer cube_r94;
	private final ModelRenderer cube_r95;
	private final ModelRenderer cube_r96;
	private final ModelRenderer cube_r97;

	public R700action() {
		textureWidth = 400;
		textureHeight = 400;

		boltaction = new ModelRenderer(this);
		boltaction.setRotationPoint(-1.5F, -15.2F, -21.85F);
		boltaction.cubeList.add(new ModelBox(boltaction, 0, 167, 0.0F, -0.1F, 0.0F, 1, 1, 13, -0.1F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 68, 76, 0.0F, -0.1F, 12.5F, 1, 1, 2, -0.15F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 117, 62, 0.0F, 0.4F, 13.8F, 1, 1, 1, 0.08F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 117, 60, 0.0F, 0.4F, 14.1F, 1, 1, 1, -0.1F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 48, 76, -0.55F, 0.45F, 12.5F, 1, 1, 2, -0.151F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 37, 76, 0.55F, 0.45F, 12.5F, 1, 1, 2, -0.151F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 57, 76, 0.0F, 1.0F, 12.5F, 1, 1, 2, -0.15F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 154, 91, -0.57F, 0.47F, 0.0F, 1, 1, 13, -0.099F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 154, 77, 0.57F, 0.47F, 0.0F, 1, 1, 13, -0.099F, false));
		boltaction.cubeList.add(new ModelBox(boltaction, 154, 35, 0.0F, 1.05F, 0.0F, 1, 1, 13, -0.1F, false));

		cube_r90 = new ModelRenderer(this);
		cube_r90.setRotationPoint(0.9F, 1.95F, 0.0F);
		boltaction.addChild(cube_r90);
		setRotationAngle(cube_r90, 0.0F, 0.0F, -0.7854F);
		cube_r90.cubeList.add(new ModelBox(cube_r90, 154, 49, -0.1F, -0.9F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r91 = new ModelRenderer(this);
		cube_r91.setRotationPoint(0.1F, 1.95F, 0.0F);
		boltaction.addChild(cube_r91);
		setRotationAngle(cube_r91, 0.0F, 0.0F, -0.7854F);
		cube_r91.cubeList.add(new ModelBox(cube_r91, 154, 14, -0.1F, -0.9F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r92 = new ModelRenderer(this);
		cube_r92.setRotationPoint(0.9F, 0.0F, 0.0F);
		boltaction.addChild(cube_r92);
		setRotationAngle(cube_r92, 0.0F, 0.0F, 0.7854F);
		cube_r92.cubeList.add(new ModelBox(cube_r92, 82, 165, -0.1F, -0.1F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r93 = new ModelRenderer(this);
		cube_r93.setRotationPoint(0.1F, 0.0F, 0.0F);
		boltaction.addChild(cube_r93);
		setRotationAngle(cube_r93, 0.0F, 0.0F, 0.7854F);
		cube_r93.cubeList.add(new ModelBox(cube_r93, 37, 166, -0.1F, -0.1F, 0.0F, 1, 1, 13, -0.101F, false));

		cube_r94 = new ModelRenderer(this);
		cube_r94.setRotationPoint(0.15F, 1.85F, 13.7F);
		boltaction.addChild(cube_r94);
		setRotationAngle(cube_r94, 0.0F, 0.0F, -0.7854F);
		cube_r94.cubeList.add(new ModelBox(cube_r94, 69, 70, -0.12F, -0.88F, -1.23F, 1, 1, 2, -0.122F, false));

		cube_r95 = new ModelRenderer(this);
		cube_r95.setRotationPoint(0.85F, 1.85F, 13.7F);
		boltaction.addChild(cube_r95);
		setRotationAngle(cube_r95, 0.0F, 0.0F, 0.7854F);
		cube_r95.cubeList.add(new ModelBox(cube_r95, 21, 70, -0.88F, -0.88F, -1.23F, 1, 1, 2, -0.122F, false));

		cube_r96 = new ModelRenderer(this);
		cube_r96.setRotationPoint(0.85F, 0.05F, 13.7F);
		boltaction.addChild(cube_r96);
		setRotationAngle(cube_r96, 0.0F, 0.0F, -0.7854F);
		cube_r96.cubeList.add(new ModelBox(cube_r96, 0, 76, -0.88F, -0.12F, -1.23F, 1, 1, 2, -0.122F, false));

		cube_r97 = new ModelRenderer(this);
		cube_r97.setRotationPoint(0.15F, 0.05F, 13.7F);
		boltaction.addChild(cube_r97);
		setRotationAngle(cube_r97, 0.0F, 0.0F, 0.7854F);
		cube_r97.cubeList.add(new ModelBox(cube_r97, 18, 76, -0.12F, -0.12F, -1.23F, 1, 1, 2, -0.122F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltaction.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}