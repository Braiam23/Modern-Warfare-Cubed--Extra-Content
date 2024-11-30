package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class DesertEagleFactory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("desert_eagle")
        .withFireRate(0.1f)
        .withRecoil(8.95f)
        .withZoom(0f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withMuzzlePosition(new Vec3d(-0.14400000429153445, -0.8639999959468836, -3.355999876499175))
        .withShellType(Type.PISTOL)
        .withMaxShots(1)
        .withShootSound("desert_eagle")
        .withSilencedShootSound("m9a1_silenced")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.7f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.14f)
        .withInaccuracy(1.5f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapon power
        		90.0,
        		// Muzzle climb divisor
        		27.375,
        		// "Stock Length"
        		28.5,
        		// Recovery rate from initial shot
        		0.825,
        		// Recovery rate @ "stock"
        		0.5825,
        		// Recoil rotation (Y)
        		0.0,
        		// Recoil rotation (Z)
        		0.0,
        		// Ads similarity divisor
        		1.5
        ))
        .withScreenShaking(RenderableState.SHOOTING,
               4.6f,
               6.1f,
               5f)

        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withCompatibleAttachment(Attachments.PistolPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.DesertEagleBody, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.DesertEagleSlide, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.DesertEagleMag, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                GL11.glTranslatef(0.01F, -0.76F, -2.4F);
                GL11.glScaled(1.1F, 1.1F, 1.1F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
        })
        .withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
                GL11.glTranslatef(-0.19F, -1.4F, -1.25F);
                GL11.glScaled(0.46F, 0.46F, 0.46F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.1F, -0.5F);
                GL11.glScaled(0.2F, 0.2F, 0.2F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
				GL11.glTranslatef(-0.05F, -1.05F, -1.6F);
				GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                GL11.glTranslatef(-0.35F, -1.4F, -2.0F);
                GL11.glScaled(0.6F, 0.6F, 0.6F);
        }, (model) -> {
             if (model instanceof Holo2) {
                GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withTextureNames("deagle")
        .withRenderer(new WeaponRenderer.Builder()
		.withActionPiece(
            Attachments.DesertEagleSlide)
        .withActionTransform(new Transform().withPosition(0F, 0F, 1.01F))
    
            .withModel(new Glock18C())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(0, 0f, 3f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0.8f, 0); 
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.6F, -1F, 1.8F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.545000f, 3.865000f, -8.295000f)
					.withRotation(0.000000f, 1.000000f, 7.681469f)
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
                        .withPosition(-0.320000f, 0.230000f, 2.040000f)
                        .withBBRotation(10.0931, 10.9576, -10.0294)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("deagle", Attachments.DesertEagleSlide)
                .setupModernMagazineAnimations("deagle", Magazines.DesertEagleMag)
                
            .withFirstPersonCustomPositioning(Attachments.DesertEagleSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1.01F);
                }
            })
                
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0.168f, -0.245f, -1.9f);

            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR))
                    GL11.glTranslatef(-0.007f, 0.15f, 1f);
            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex))
                    GL11.glTranslatef(0.005f, 0.12f, 1.15f);
            else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    GL11.glTranslatef(-0.01f, 0.235f, 1.45f);
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
        .withSpawnEntityDamage(12f)
        .withSpawnEntityGravityVelocity(0.02f)
        
         
        .build(MWC.modContext);
    }
}
