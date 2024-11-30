package com.paneedah.mwc.models;

import com.paneedah.weaponlib.ModelWithAttachments;
import net.minecraft.client.model.ModelBox;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

// Made with Blockbench 4.11.2
// Exported for Minecraft version 1.7 - 1.12
// Paste this class into your mod and generate all required imports


public class AKS74URearSight extends ModelWithAttachments {
	private final ModelRenderer rearsight;
	private final ModelRenderer cube_r1;
	private final ModelRenderer cube_r2;
	private final ModelRenderer cube_r3;
	private final ModelRenderer cube_r4;
	private final ModelRenderer cube_r5;
	private final ModelRenderer cube_r6;
	private final ModelRenderer cube_r7;
	private final ModelRenderer cube_r8;
	private final ModelRenderer cube_r9;
	private final ModelRenderer cube_r10;

	public AKS74URearSight() {
		textureWidth = 150;
		textureHeight = 150;

		rearsight = new ModelRenderer(this);
		rearsight.setRotationPoint(0.0794F, 11.279F, -3.6205F);
		rearsight.cubeList.add(new ModelBox(rearsight, 134, 113, -1.5744F, 1.447F, -22.8775F, 3, 1, 34, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 167, 146, -1.5744F, -2.553F, 3.1225F, 3, 4, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 167, 146, 0.9256F, -3.953F, 3.1225F, 1, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 167, 146, -2.1744F, -3.953F, 3.1225F, 1, 2, 1, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 134, 113, -2.5744F, 0.447F, -22.8775F, 1, 1, 34, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 134, 113, 1.4156F, 0.447F, -22.8775F, 1, 1, 34, 0.0F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 165, 144, -2.5744F, -3.253F, -26.8775F, 1, 3, 2, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 164, 143, -2.5744F, -4.553F, 1.1225F, 1, 6, 4, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 165, 144, 1.4156F, -3.253F, -26.8775F, 1, 3, 2, 0.0F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 166, 145, 1.4156F, -0.553F, -1.8775F, 1, 2, 2, 0.0F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 166, 145, 1.4156F, -1.453F, -1.8775F, 1, 2, 2, 0.0F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 159, 138, 1.4156F, -1.553F, -0.8775F, 1, 3, 9, 0.0F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 164, 143, 1.4156F, -4.553F, 1.1225F, 1, 6, 4, 0.0F, true));
		rearsight.cubeList.add(new ModelBox(rearsight, 159, 138, -2.5744F, -1.553F, -0.8775F, 1, 3, 9, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 166, 145, -2.5744F, -1.453F, -1.8775F, 1, 2, 2, 0.0F, false));
		rearsight.cubeList.add(new ModelBox(rearsight, 166, 145, -2.5744F, -0.553F, -1.8775F, 1, 2, 2, 0.0F, false));

		cube_r1 = new ModelRenderer(this);
		cube_r1.setRotationPoint(-2.0744F, -1.553F, 3.1225F);
		rearsight.addChild(cube_r1);
		setRotationAngle(cube_r1, 0.7679F, 0.0F, 0.0F);
		cube_r1.cubeList.add(new ModelBox(cube_r1, 164, 143, -0.5F, -0.75F, -0.4F, 1, 4, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 164, 143, -0.5F, -0.5F, -0.4F, 1, 4, 4, 0.0F, false));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 164, 143, 3.49F, -0.5F, -0.4F, 1, 4, 4, 0.0F, true));
		cube_r1.cubeList.add(new ModelBox(cube_r1, 164, 143, 3.49F, -0.75F, -0.4F, 1, 4, 4, 0.0F, true));

		cube_r2 = new ModelRenderer(this);
		cube_r2.setRotationPoint(-2.0744F, -1.553F, 3.1225F);
		rearsight.addChild(cube_r2);
		setRotationAngle(cube_r2, 0.6109F, 0.0F, 0.0F);
		cube_r2.cubeList.add(new ModelBox(cube_r2, 167, 146, -0.5F, 3.9F, 2.1F, 1, 1, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 167, 146, -0.5F, 2.9F, 3.1F, 1, 3, 1, 0.0F, false));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 167, 146, 3.49F, 2.9F, 3.1F, 1, 3, 1, 0.0F, true));
		cube_r2.cubeList.add(new ModelBox(cube_r2, 167, 146, 3.49F, 3.9F, 2.1F, 1, 1, 1, 0.0F, true));

		cube_r3 = new ModelRenderer(this);
		cube_r3.setRotationPoint(-2.0744F, -1.553F, 3.1225F);
		rearsight.addChild(cube_r3);
		setRotationAngle(cube_r3, -0.6632F, 0.0F, 0.0F);
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 145, -0.5F, 3.175F, -3.9F, 1, 1, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 167, 146, -0.5F, 4.825F, -3.9F, 1, 1, 1, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 145, -0.5F, 3.325F, -3.9F, 1, 2, 2, 0.0F, false));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 145, 3.49F, 3.325F, -3.9F, 1, 2, 2, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 166, 145, 3.49F, 3.175F, -3.9F, 1, 1, 2, 0.0F, true));
		cube_r3.cubeList.add(new ModelBox(cube_r3, 167, 146, 3.49F, 4.825F, -3.9F, 1, 1, 1, 0.0F, true));

		cube_r4 = new ModelRenderer(this);
		cube_r4.setRotationPoint(-2.0744F, -1.553F, 3.1225F);
		rearsight.addChild(cube_r4);
		setRotationAngle(cube_r4, -0.7679F, 0.0F, 0.0F);
		cube_r4.cubeList.add(new ModelBox(cube_r4, 164, 143, -0.5F, -0.475F, -3.5F, 1, 4, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 164, 143, -0.5F, -0.775F, -3.5F, 1, 4, 4, 0.0F, false));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 164, 143, 3.49F, -0.775F, -3.5F, 1, 4, 4, 0.0F, true));
		cube_r4.cubeList.add(new ModelBox(cube_r4, 164, 143, 3.49F, -0.475F, -3.5F, 1, 4, 4, 0.0F, true));

		cube_r5 = new ModelRenderer(this);
		cube_r5.setRotationPoint(1.9156F, 0.947F, -23.6775F);
		rearsight.addChild(cube_r5);
		setRotationAngle(cube_r5, -0.5236F, 0.0F, 0.0F);
		cube_r5.cubeList.add(new ModelBox(cube_r5, 162, 141, -0.5F, -2.6F, -3.5F, 1, 3, 5, 0.0F, true));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 145, -0.5F, -2.6F, 1.5F, 1, 1, 1, 0.0F, true));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 145, -0.5F, -2.3F, 1.5F, 1, 1, 1, 0.0F, true));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 145, -0.5F, -2.6F, 2.5F, 1, 1, 1, 0.0F, true));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 145, -4.49F, -2.3F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 145, -4.49F, -2.6F, 2.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 166, 145, -4.49F, -2.6F, 1.5F, 1, 1, 1, 0.0F, false));
		cube_r5.cubeList.add(new ModelBox(cube_r5, 162, 141, -4.49F, -2.6F, -3.5F, 1, 3, 5, 0.0F, false));

		cube_r6 = new ModelRenderer(this);
		cube_r6.setRotationPoint(-0.0744F, -1.553F, -25.4775F);
		rearsight.addChild(cube_r6);
		setRotationAngle(cube_r6, 0.6632F, 0.0F, 0.0F);
		cube_r6.cubeList.add(new ModelBox(cube_r6, 166, 145, -1.5F, 0.3F, -0.5F, 3, 5, 1, 0.0F, false));

		cube_r7 = new ModelRenderer(this);
		cube_r7.setRotationPoint(1.9156F, 1.947F, -5.8775F);
		rearsight.addChild(cube_r7);
		setRotationAngle(cube_r7, 0.0F, 0.0F, -0.7854F);
		cube_r7.cubeList.add(new ModelBox(cube_r7, 134, 113, -0.3F, -1.0F, -17.0F, 1, 1, 34, 0.0F, true));
		cube_r7.cubeList.add(new ModelBox(cube_r7, 134, 113, -0.7F, -1.0F, -17.0F, 1, 1, 34, 0.0F, true));

		cube_r8 = new ModelRenderer(this);
		cube_r8.setRotationPoint(-2.0744F, 1.947F, -5.8775F);
		rearsight.addChild(cube_r8);
		setRotationAngle(cube_r8, 0.0F, 0.0F, 0.7854F);
		cube_r8.cubeList.add(new ModelBox(cube_r8, 134, 113, -0.7F, -1.0F, -17.0F, 1, 1, 34, 0.0F, false));
		cube_r8.cubeList.add(new ModelBox(cube_r8, 134, 113, -0.3F, -1.0F, -17.0F, 1, 1, 34, 0.0F, false));

		cube_r9 = new ModelRenderer(this);
		cube_r9.setRotationPoint(-1.5844F, -3.453F, 3.6225F);
		rearsight.addChild(cube_r9);
		setRotationAngle(cube_r9, 0.0F, 0.0F, -0.7854F);
		cube_r9.cubeList.add(new ModelBox(cube_r9, 167, 146, -0.9F, 0.5F, -0.5F, 1, 1, 1, 0.0F, true));

		cube_r10 = new ModelRenderer(this);
		cube_r10.setRotationPoint(1.4256F, -3.453F, 3.6225F);
		rearsight.addChild(cube_r10);
		setRotationAngle(cube_r10, 0.0F, 0.0F, 0.7854F);
		cube_r10.cubeList.add(new ModelBox(cube_r10, 167, 146, -0.1F, 0.5F, -0.5F, 1, 1, 1, 0.0F, false));
	}

	@Override
	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5) {
		rearsight.render(f5);
	}

	public void setRotationAngle(ModelRenderer modelRenderer, float x, float y, float z) {
		modelRenderer.rotateAngleX = x;
		modelRenderer.rotateAngleY = y;
		modelRenderer.rotateAngleZ = z;
	}
}