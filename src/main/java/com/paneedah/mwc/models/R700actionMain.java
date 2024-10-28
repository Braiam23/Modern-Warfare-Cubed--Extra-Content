package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.9.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class R700actionMain extends ModelWithAttachments {
	private final ModelRenderer boltactiongrabby;
	private final ModelRenderer cube_r87;
	private final ModelRenderer cube_r88;
	private final ModelRenderer cube_r89;

	public R700actionMain() {
		textureWidth = 400;
		textureHeight = 400;

		boltactiongrabby = new ModelRenderer(this);
		boltactiongrabby.setRotationPoint(-2.25F, -14.3F, -6.95F);
		boltactiongrabby.cubeList.add(new ModelBox(boltactiongrabby, 44, 90, 0.05F, -0.4F, -1.75F, 1, 2, 1, -0.1F, false));

		cube_r87 = new ModelRenderer(this);
		cube_r87.setRotationPoint(0.0F, 0.0F, 0.0F);
		boltactiongrabby.addChild(cube_r87);
		setRotationAngle(cube_r87, 0.0F, 0.0F, 0.8203F);
		cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 10, 0.45F, 2.1F, -1.95F, 1, 2, 2, -0.301F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 25, 0.25F, 2.1F, -1.95F, 1, 2, 2, -0.3F, false));
		cube_r87.cubeList.add(new ModelBox(cube_r87, 49, 17, -0.15F, 2.1F, -1.95F, 1, 2, 2, -0.3F, false));

		cube_r88 = new ModelRenderer(this);
		cube_r88.setRotationPoint(0.2F, 0.2F, -0.5F);
		boltactiongrabby.addChild(cube_r88);
		setRotationAngle(cube_r88, 0.2618F, 0.0F, 0.8203F);
		cube_r88.cubeList.add(new ModelBox(cube_r88, 30, 62, -0.15F, 0.8F, -1.55F, 1, 2, 1, -0.101F, false));

		cube_r89 = new ModelRenderer(this);
		cube_r89.setRotationPoint(0.2F, 0.2F, -0.5F);
		boltactiongrabby.addChild(cube_r89);
		setRotationAngle(cube_r89, 0.0F, 0.0F, 0.8203F);
		cube_r89.cubeList.add(new ModelBox(cube_r89, 77, 88, -0.15F, -0.6F, -1.25F, 1, 2, 1, -0.101F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		boltactiongrabby.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}