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
import org.lwjgl.opengl.GL11;

public class SCCYCPX2Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("sccy_cpx_2")
        .withFireRate(0.5f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SIDEARM)
        .withShellType(Type.PISTOL)
        .withMaxShots(1)
        .withShootSound("m9a1")
        .withSilencedShootSound("m9a1_silenced")
        .withDrawSound("handgun_draw")
        .withReloadingTime(50)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.18f)
//      .withShellCasingForwardOffset(0.001f)
        .withInaccuracy(3)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		// The weapon power
        		45.0,
        		// Muzzle climb divisor
        		13.5,
        		// "Stock Length"
        		37.5,
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
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 7), new
        		CraftingEntry(MWCItems.gunmetalPlate, 3), new
        		CraftingEntry(MWCItems.steelIngot, 3))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 2.5f, // x 
                 0.1f, // y
                 0.5f) // z
         .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
         .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Attachments.SCCYCPX2Body, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.SCCYCPX2BodyTan, (model) -> {
        })
        .withCompatibleAttachment(Attachments.SCCYCPX2GripTape, (model) -> {
        })
        .withCompatibleAttachment(Attachments.SCCYCPX2Slide, true, (model) -> {
            if(model instanceof SCCYCPX2Slide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof M9A1rearsight) {
                GL11.glTranslatef(-0.155F, -1.095F, -0.15F);
                GL11.glScaled(0.3F, 0.3F, 0.4F);
            }
            else if(model instanceof M9A1frontsight) {
                GL11.glTranslatef(-0.15F, -1.11F, -1.8F);
                GL11.glScaled(0.2F, 0.2F, 0.25F);
            }
        })
        .withCompatibleAttachment(Attachments.SCCYCPX2BSlide, (model) -> {
            if(model instanceof SCCYCPX2Slide) {
                GL11.glScaled(1F, 1F, 1F);
            }
            else if(model instanceof M9A1rearsight) {
            	GL11.glTranslatef(-0.155F, -1.095F, -0.15F);
                GL11.glScaled(0.3F, 0.3F, 0.4F);
            }
            else if(model instanceof M9A1frontsight) {
            	GL11.glTranslatef(-0.15F, -1.11F, -1.8F);
                GL11.glScaled(0.2F, 0.2F, 0.25F);
            }
        })
        .withCompatibleAttachment(Magazines.SCCYCPX2Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.SCCYCPX2MagExt, (model) -> {
        })
        .withCompatibleAttachment(Attachments.SCCYCPX2Laser, (p, s) -> {
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.22F, -1.12F, -4.06F);
            GL11.glScaled(1.3F, 1.3F, 1.3F);
        })
        .withTextureNames("glock18c")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Glock18C())
            .withActionPiece(
            		Attachments.SCCYCPX2Slide,
            		Attachments.SCCYCPX2BSlide)
            .withActionTransform(new Transform().withPosition(0, 0, 0.5))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
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
					.withPosition(-0.945000f, 3.865000f, -6.965000f)
					.withRotation(0.000000f, 1.000000f, 10.681469f)
					.withRotationPoint(-0.12000000357627871, -0.36000001072883614, 0.040000001192092904)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.370000f, 0.985000f, 2.020000f)
                        .withBBRotation(-12.9672, -29.0825, 67.8433)
                        .withScale(3, 3, 4)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.320000f, 0.260000f, 1.920000f)
                        .withBBRotation(10.0931, 10.9576, -10.0294)
                        .withScale(2.8, 2.8, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("cpx2", Attachments.SCCYCPX2Slide)
                .setupModernMagazineAnimations("cpx2", 
                		Magazines.SCCYCPX2Mag, 
                		Magazines.SCCYCPX2MagExt)
                
            .withFirstPersonCustomPositioning(Attachments.SCCYCPX2Slide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })
                
            .withFirstPersonCustomPositioning(Attachments.SCCYCPX2BSlide.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 0.6F);
                }
            })

            .withFirstPersonPositioningZooming((renderContext) -> {
            	GL11.glScaled(3F, 3F, 3F);
            	GL11.glTranslatef(0.145f, 0.60f, -2f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.22f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Holo");
                    GL11.glTranslatef(0f, 0.32f, 0f);
                } 
                
                // Everything else
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
