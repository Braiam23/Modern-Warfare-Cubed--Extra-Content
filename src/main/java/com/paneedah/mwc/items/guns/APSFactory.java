package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class APSFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("aps")
        .withFireRate(0.4f)
        .withRecoil(5.3f)
        .withZoom(0f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMuzzlePosition(new Vec3d(-0.14400000429153445, -0.8639999959468836, -2.355999876499175))
        .withShellType(Type.PISTOL)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("aps")
        .withSilencedShootSound("m9a1_silenced")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.19f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapon power
        		67.50,
        		// Muzzle climb divisor
        		13.5,
        		// "Stock Length"
        		27.35,
        		// Recovery rate from initial shot
        		0.425,
        		// Recovery rate @ "stock"
        		0.2125,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.0
        ))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                2.5f, 
                0.1f,
                1f)
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 1), new
        		CraftingEntry(MWCItems.gunmetalPlate, 4), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(AuxiliaryAttachments.APSslide, true, (model) -> {
            if(model instanceof APSslide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof APSrearsight) {
                GL11.glTranslatef(-0.147F, -1.1F, 0.02F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
            else if(model instanceof makarovfrontsight) {
                GL11.glTranslatef(-0.15F, -1.09F, -2.23F);
                GL11.glScaled(0.2F, 0.2F, 0.25F);
            }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.APShammer, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.APSMag, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.215F, -1.05F, -4.52F);
            GL11.glScaled(1.1F, 1.1F, 1.3F);
        })
        .withCompatibleAttachment(Attachments.APSStock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.APSGrip, true, (model) -> {
      })
        .withTextureNames("APS")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new APS())
            .withActionPiece(
            		AuxiliaryAttachments.APSslide)
            .withActionTransform(new Transform().withPosition(0, 0, 0.5))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(0, 0f, 3f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-0.945000f, 4.065000f, -7.845000f)
					.withRotation(0.000000f, 1.000000f, 10.681469f)
					.withRotationPoint(-0.12000000357627871, -0.36000001072883614, 0.040000001192092904)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 0.865000f, 2.020000f)
                        .withBBRotation(-12.9672, -29.0825, 67.8433)
                        .withScale(3, 3, 4)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.220000f, 2.040000f)
                        .withBBRotation(10.0931, 10.9576, -10.0294)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m9", AuxiliaryAttachments.APSslide)
                .setupModernMagazineAnimations("m9", Magazines.APSMag)
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.APSslide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
			
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(3F, 3F, 3F);
                GL11.glTranslatef(0.14f, 0.59f, -2.15f);

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                } 
                
                else {
                }
            
                })
                
            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.165000f)
				 .withRotation(-4.041486f, -30.854630f, -19.420376f)
				 .withRotationPoint(-0.120000f, -0.360000f, 0.040000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-0.945000f, 3.625000f, -7.885000f)
				 .withRotation(-4.041486f, -45.595835f, -21.768277f)
				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
         
			 .withFirstPersonHandPositioningModifying(
                  (renderContext) -> {
                 	 new Transform()
                 	 .withPosition(2.770000f, 1.225000f, 0.140000f)
                 	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                      .withScale(2.6, 2.6, 4.0)
                      .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                      .doGLDirect();
                  }, 
                  (renderContext) -> {
                 	 new Transform()
                 	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                      .withBBRotation(10.0931, 10.9576, -10.0294)
                      .withScale(3, 3, 3.5)
                      .withRotationPoint(0, 0, 0)
                      .doGLDirect();
                  })
                  
         .withFirstPersonHandPositioningModifyingAlt(
         		(renderContext) -> {
                	 new Transform()
	                   	 .withPosition(2.770000f, 1.225000f, 0.140000f)
	                   	 .withRotation(73.670132f, -70.659155f, 41.991085f)
                     .withScale(2.6, 2.6, 4.0)
                     .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                     .doGLDirect();
                 }, 
                 (renderContext) -> {
                	 new Transform()
                	 .withPosition(-0.320000f, 0.140000f, 2.040000f)
                     .withBBRotation(10.0931, 10.9576, -10.0294)
                     .withScale(3, 3, 3.5)
                     .withRotationPoint(0, 0, 0)
                     .doGLDirect();
                 })

            .build())
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
