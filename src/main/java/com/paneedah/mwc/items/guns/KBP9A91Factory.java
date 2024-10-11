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

import java.util.Arrays;

public class KBP9A91Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("kbp_9a91")
        .withFireRate(0.7f)
        .withRecoil(2f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .withShellType(Type.PISTOL)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("kbp_9a91")
        .withSilencedShootSound("kbp9a91_silenced")
        .withReloadSound("kbp9a91_reload")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.15f)
        .withInaccuracy(2f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
				// The weapon power
				15.0,
				// Muzzle climb divisor
				15.75,
				// "Stock Length"
				50.0,
				// Recovery rate from initial shot
				0.4,
				// Recovery rate @ "stock"
				0.3125,
				// Recoil rotation (Y)
				0.0,
				// Recoil rotation (Z)
				0.0,
				// Ads similarity divisor
				1.0
		))

        
        .withScreenShaking(RenderableState.SHOOTING, 
                2f, 
                0.1f, 
                3f) 
				
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 6), new
        		CraftingEntry(MWCItems.gunmetalPlate, 7), new
        		CraftingEntry(MWCItems.steelIngot, 3))
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        
        .withCompatibleAttachment(AuxiliaryAttachments.KBP9A91action, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.KBP9A91Handguard, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.KBP9A91CompactHandguard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.KBP9A91KulaTacHandguard, (model) -> {
        })
       .withCompatibleAttachment(Magazines.KBP9A91Mag, (model) -> {
        })
        .withCompatibleAttachment(Attachments.SuppressorKBP9A91, (model) -> {
        })
        .withCompatibleAttachment(Attachments.KobraMount, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.23F, -0.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.OKP7, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -0.65F, -1F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof OKP7reticle) {
                GL11.glTranslatef(0.17F, -1.15F, -0.6F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
            
            GL11.glTranslatef(0.14F, -0.9F, -1.2F);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        },(model) -> {
            if(model instanceof PSO1reticle) {
                GL11.glTranslatef(-0.212F, -0.486F, 1.27F);
                GL11.glScaled(0.017F, 0.017F, 0.017F);
            }
             else if(model instanceof PSO12) {
                 GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                 GL11.glScaled(0.8F, 0.8F, 0.8F);
             }
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -3.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.15F, -3.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.15F, -3.3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("kbp9a91")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new KBP9A91())
            .withActionPiece(AuxiliaryAttachments.KBP9A91action)
            .withActionTransform(new Transform().withPosition(0, 0, 0.8))
            .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glRotatef(-90F, 0f, 0f, 4f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.225000f, 3.705000f, -2.525000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.350000f, -1.300000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.265000f, -0.820000f)
                        .withBBRotation(-7.1415, -27.3003, 52.6433)
                        .withScale(2.8, 2.8, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.180000f, 1.960000f)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3, 3, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("kbp9a91", AuxiliaryAttachments.KBP9A91action)
                .setupModernMagazineAnimations("kbp9a91", 
                		Magazines.KBP9A91Mag)

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3f, 3f, 3f);
                GL11.glTranslatef(0.14f, 0.8f, -0.4f);

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount)) {
                    GL11.glTranslatef(-0F, 0.305f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    GL11.glTranslatef(-0.06F, 0.17f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    GL11.glTranslatef(-0.015F, 0.2f, 0.0f);
                } 
                
                else {
                }
            
                })
            
            .withFirstPersonPositioningModifying((renderContext) -> {
  				 new Transform()
  				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
  				 .withRotation(0.000000f, -30.514396f, -26.062789f)
  				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
  				 .withScale(3.000000f, 3.000000f, 3.000000f)
  				 .doGLDirect();
  			 })
  			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
  				 new Transform()
  				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
  				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
  				 .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
  				 .withScale(3.000000f, 3.000000f, 3.000000f)
  				 .doGLDirect();
              })
  					 
  			.withFirstPersonHandPositioningModifying(
                      (renderContext) -> {
                     	 new Transform()
                     	 .withPosition(1.730000f, 0.065000f, -0.980000f)
                     	 .withRotation(93.414678f, 23.699100f, 15.553163f)
                          .withScale(2.6, 2.6, 4.0)
                          .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                          .doGLDirect();
                      }, 
                      (renderContext) -> {
                     	 new Transform()
                          .withPosition(-0.2, 0.1, 2)
                          .withRotation(-5.4027, -4.7805, -1.6694)
                          .withScale(3.5, 3.5, 3.5)
                          .withRotationPoint(0, 0, 0)
                          .doGLDirect();
                      })
                      
             .withFirstPersonHandPositioningModifyingAlt(
             		(renderContext) -> {
                    	 new Transform()
                    	 	.withPosition(2.450000f, -0.335000f, -0.660000f)
                    	 	.withRotation(93.766422f, 50.841130f, 4.679372f)
                    	 	.withScale(2.600000f, 2.600000f, 4.000000f)
                         .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                         .doGLDirect();
                     }, 
                     (renderContext) -> {
                    	 new Transform()
                    	 	.withPosition(-0.600000f, 0.340000f, 1.880000f)
                    	 	.withRotation(-12.193518f, -4.780500f, 1.399459f)
                         .withScale(3.5, 3.5, 3.5)
                         .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                         .doGLDirect();
                     })

            .build())
        .withSpawnEntityDamage(7f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

