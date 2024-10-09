package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.1
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class DesertEagleMag extends ModelWithAttachments {
	private final ModelRenderer magazine;
	private final ModelRenderer cube_r92_r1;
	private final ModelRenderer cube_r92_r2;
	private final ModelRenderer cube_r92_r3;
	private final ModelRenderer cube_r92_r4;
	private final ModelRenderer cube_r92_r5;
	private final ModelRenderer cube_r92_r6;
	private final ModelRenderer cube_r92_r7;
	private final ModelRenderer bone;
	private final ModelRenderer cube_r95_r1;
	private final ModelRenderer cube_r94_r1;

	public DesertEagleMag() {
		textureWidth = 135;
		textureHeight = 135;

		magazine = new ModelRenderer(this);
		magazine.setRotationPoint(-1.3F, 8.5892F, 0.1728F);
		

		cube_r92_r1 = new ModelRenderer(this);
		cube_r92_r1.setRotationPoint(0.0F, -5.2441F, -0.5935F);
		magazine.addChild(cube_r92_r1);
		setRotationAngle(cube_r92_r1, 0.2007F, 0.0F, 0.0F);
		cube_r92_r1.cubeList.add(new ModelBox(cube_r92_r1, 50, 35, -1.8F, 5.0259F, -4.0793F, 2, 1, 7, 0.0F, false));
		cube_r92_r1.cubeList.add(new ModelBox(cube_r92_r1, 50, 50, -0.2F, 5.0283F, -4.0793F, 2, 1, 7, 0.0F, false));

		cube_r92_r2 = new ModelRenderer(this);
		cube_r92_r2.setRotationPoint(0.0F, -4.5441F, -0.3935F);
		magazine.addChild(cube_r92_r2);
		setRotationAngle(cube_r92_r2, 0.2007F, 0.0F, 0.0F);
		cube_r92_r2.cubeList.add(new ModelBox(cube_r92_r2, 82, 110, -0.2F, 5.0283F, -1.1142F, 2, 1, 4, 0.0F, false));
		cube_r92_r2.cubeList.add(new ModelBox(cube_r92_r2, 36, 111, -1.8F, 5.0259F, -1.1358F, 2, 1, 4, 0.0F, false));

		cube_r92_r3 = new ModelRenderer(this);
		cube_r92_r3.setRotationPoint(0.0F, -5.1575F, -0.884F);
		magazine.addChild(cube_r92_r3);
		setRotationAngle(cube_r92_r3, 0.2007F, 0.0F, 0.0F);
		cube_r92_r3.cubeList.add(new ModelBox(cube_r92_r3, 13, 66, -1.8F, 5.0259F, -4.1358F, 2, 1, 3, 0.0F, false));
		cube_r92_r3.cubeList.add(new ModelBox(cube_r92_r3, 46, 86, -0.2F, 5.0283F, -4.1142F, 2, 1, 3, 0.0F, false));

		cube_r92_r4 = new ModelRenderer(this);
		cube_r92_r4.setRotationPoint(0.0F, -5.9441F, -0.6935F);
		magazine.addChild(cube_r92_r4);
		setRotationAngle(cube_r92_r4, 0.2007F, 0.0F, 0.0F);
		cube_r92_r4.cubeList.add(new ModelBox(cube_r92_r4, 106, 58, -1.8F, -12.9741F, -4.1358F, 2, 19, 7, 0.0F, false));
		cube_r92_r4.cubeList.add(new ModelBox(cube_r92_r4, 50, 107, -0.2F, -12.9717F, -4.1142F, 2, 19, 7, 0.0F, false));

		cube_r92_r5 = new ModelRenderer(this);
		cube_r92_r5.setRotationPoint(0.0F, -5.8575F, -1.084F);
		magazine.addChild(cube_r92_r5);
		setRotationAngle(cube_r92_r5, 0.2007F, 0.0F, 0.0F);
		cube_r92_r5.cubeList.add(new ModelBox(cube_r92_r5, 41, 50, -0.2F, -12.9717F, -4.1142F, 2, 19, 1, 0.0F, false));
		cube_r92_r5.cubeList.add(new ModelBox(cube_r92_r5, 66, 22, -1.8F, -12.9741F, -4.1358F, 2, 19, 1, 0.0F, false));

		cube_r92_r6 = new ModelRenderer(this);
		cube_r92_r6.setRotationPoint(-1.1F, -18.9238F, -2.9137F);
		magazine.addChild(cube_r92_r6);
		setRotationAngle(cube_r92_r6, 0.1883F, -0.0699F, 0.3512F);
		cube_r92_r6.cubeList.add(new ModelBox(cube_r92_r6, 10, 48, -0.58F, -0.5653F, -2.5591F, 1, 1, 5, 0.0F, false));

		cube_r92_r7 = new ModelRenderer(this);
		cube_r92_r7.setRotationPoint(1.2F, -18.9238F, -2.9137F);
		magazine.addChild(cube_r92_r7);
		setRotationAngle(cube_r92_r7, 0.1877F, 0.0715F, -0.3598F);
		cube_r92_r7.cubeList.add(new ModelBox(cube_r92_r7, 61, 50, -0.53F, -0.5553F, -2.5F, 1, 1, 5, 0.0F, false));

		bone = new ModelRenderer(this);
		bone.setRotationPoint(1.0172F, 16.4108F, -2.69F);
		magazine.addChild(bone);
		bone.cubeList.add(new ModelBox(bone, 8, 75, -2.0172F, -15.7F, -2.9828F, 2, 1, 2, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 13, -3.2172F, -15.7F, -1.7828F, 4, 1, 7, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 68, 10, 0.2228F, -15.7F, 4.8172F, 1, 1, 2, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 0, 105, -3.2172F, -15.7F, 4.8172F, 4, 1, 2, -0.1F, false));
		bone.cubeList.add(new ModelBox(bone, 78, 77, 0.2228F, -15.7F, -1.7828F, 1, 1, 7, -0.1F, false));

		cube_r95_r1 = new ModelRenderer(this);
		cube_r95_r1.setRotationPoint(0.0F, 0.0F, 0.0F);
		bone.addChild(cube_r95_r1);
		setRotationAngle(cube_r95_r1, 0.0F, -0.7854F, 0.0F);
		cube_r95_r1.cubeList.add(new ModelBox(cube_r95_r1, 40, 107, -1.36F, -15.7F, -2.1F, 1, 1, 1, -0.1F, false));
		cube_r95_r1.cubeList.add(new ModelBox(cube_r95_r1, 44, 107, -2.12F, -15.7F, -2.1F, 1, 1, 1, -0.1F, false));

		cube_r94_r1 = new ModelRenderer(this);
		cube_r94_r1.setRotationPoint(1.5941F, 0.0F, -1.9172F);
		bone.addChild(cube_r94_r1);
		setRotationAngle(cube_r94_r1, 0.0F, 0.7854F, 0.0F);
		cube_r94_r1.cubeList.add(new ModelBox(cube_r94_r1, 97, 105, -3.5F, -15.7F, -3.3F, 1, 1, 1, -0.1F, false));
		cube_r94_r1.cubeList.add(new ModelBox(cube_r94_r1, 105, 103, -2.8F, -15.7F, -3.3F, 1, 1, 1, -0.1F, false));
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