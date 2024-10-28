package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.mwc.rendering.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class Remington700Factory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("remington_700")
        .withFireRate(0.16f)
        .withEjectRoundRequired()
        .withEjectSpentRoundSound("r700_boltaction")
	.withMuzzlePosition(new Vec3d(0.1120000033378601, -1.3240000156164168, -9.052000076055524))
        .withRecoil(10f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMaxShots(1)
        .withShootSound("r700")
        .withPumpTimeout(1200)
        .withSilencedShootSound("snipersilencer")
        .withDrawSound("ax50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.8f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.14f)
        .withShellCasingEjectEnabled(false)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
              // The weapon power
              75.0,
               // Muzzle climb divisor
              25.0,
              // "Stock Length"
              26.25,
              // Recovery rate from initial shot
              0.5,
              // Recovery rate @ "stock"
              0.525,
              // Recoil rotation (Y)
              -0.020,
              // Recoil rotation (Z)
              0.025,
              // Ads similarity divisor
              1.0
        ))
         .withScreenShaking(RenderableState.SHOOTING, 
                 2f,
                 6f,
                 10f)
         
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        .withCompatibleAttachment(Magazines.R700Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.R700Mag10rnd, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Remington700BoltAction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Remington700BoltActionMain, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Remington700Chassis, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Remington700APACChassis, (model) -> {
        })
        .withCompatibleAttachment(Attachments.Remington700MDTXRSChassis, (model) -> {
        })

		.withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.15F, -1.4F, -2.0F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
		},(model) -> {
		    if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
		        GL11.glScaled(0.03F, 0.03F, 0.03F);
		    }
		})
		.withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.4F, -1.0F);
            GL11.glScaled(0.6F, 0.6F, 0.6F);
		},(model) -> {
		    if(model instanceof AcogScope2) {
		        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
		        GL11.glScaled(0.5F, 0.5F, 0.5F);
		    }
		    else if(model instanceof AcogReticle) {
		        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
		        GL11.glScaled(0.03F, 0.03F, 0.03F);
		    }
		})
		.withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.13F, -1.145F, -1.2F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
		.withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.1F, -1.25F, -1.9F);
            GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
            GL11.glTranslatef(-0.1F, -1.77F, -1.2F);
		    GL11.glScaled(0.25F, 0.25F, 0.25F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		        }
		    })
		.withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.034F, -1.26F, -1.4F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		    if(model instanceof Reflex2) {
			    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
			}
		})
		.withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.034F, -1.25F, -1.25F);
            GL11.glScaled(0.38F, 0.38F, 0.38F);
			},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
			})
		.withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.01F, -1.3F, -1.4F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
			},(model) -> {
		        if(model instanceof Holo2) {
		            GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
		            GL11.glScaled(0.1F, 0.1F, 0.1F);
		        }
		    })
		.withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.01F, -1.3F, -1.4F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
		.withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(-0.01F, -1.3F, -1.45F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof EotechScopeRing) {
		        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
		        GL11.glScaled(0.5F, 0.5F, 0.5F);
		    }
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
		        GL11.glScaled(0.05F, 0.05F, 0.05F);
		    }
		})
		.withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.41F, -1.4F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		},(model) -> {
		    if(model instanceof Holo2) {
		        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		.withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
            GL11.glTranslatef(-0.015F, -1.26F, -1.2F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		.withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0.015F, -1.26F, -1.2F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		.withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
            GL11.glTranslatef(-0.115F, -1.41F, -1.2F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        }
		    })
		.withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.115F, -1.41F, -1.2F);
            GL11.glScaled(0.28F, 0.28F, 0.28F);
		},(model) -> {
		    if(model instanceof Reflex2) {
		        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
		        GL11.glScaled(0.15F, 0.15F, 0.15F);
		    }
		})
		.withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.08F, -0.9F, -1.0F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Silencer762x54, (model) -> {
            GL11.glTranslatef(-0.15F, -1.27F, -8.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Bullet, true, (model) -> {
            if(model instanceof BulletBig) {
                GL11.glScaled(0.3F, 0.3F, 0.5F);
                GL11.glTranslatef(-0.28F, -3.8F, -4.4F);
                GL11.glRotatef(90f, 1f, 0f, 0f);
            }
        })
        .withTextureNames("remington700")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new Remington700())
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
                GL11.glTranslatef(0, 0f, 3f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
            	GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-0.9F, 0.4F, 1F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
            })	
		.withFirstPersonPositioning(
			new Transform()
                    	.withPosition(-1.425000f, 4.645000f, -1.175000f)
			.withRotation(0.000000f, 1.000000f, 6.300000f)
                    	.withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    	.withScale(3.87F, 3.87F, 3.87F)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.050000f, 0.025000f, -0.500000f)
                        .withBBRotation(-8.1997F, -23.6991F, 57.7232F)
                        .withScale(2.2F, 2.2F, 4.0F)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.15F, 0F, 1.4F)
                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                        .withScale(2.5F, 2.5F, 2.5F)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m40a6", AuxiliaryAttachments.Remington700BoltAction)
		.setupCustomKeyedPart(AuxiliaryAttachments.Remington700BoltAction, "m40a6", BBLoader.KEY_BOLT_ACTION)
		.setupCustomKeyedPart(AuxiliaryAttachments.Remington700BoltActionMain, "m40a6", "boltprime")
                .setupModernMagazineAnimations("m40a6", 
                		Magazines.R700Mag, 
                		Magazines.R700Mag10rnd)
		
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Remington700BoltAction.getRenderablePart(), (renderContext) -> {
            })

            .withFirstPersonCustomPositioning(AuxiliaryAttachments.Bullet.getRenderablePart(), (renderContext) -> {
                    if(renderContext.getWeaponInstance().getAmmo() == 0) {
                        GL11.glTranslatef(0F, 6F, 0.7F);
                    }
            })

            .withFirstPersonCustomPositioningEjectSpentRound(AuxiliaryAttachments.Bullet.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.4F, -0.5F, -0F);
                          GL11.glRotatef(10f, 1f, 0f, 0f);
                          GL11.glRotatef(25f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1F, -0.3F, -0F);
                          GL11.glRotatef(30f, 1f, 0f, 0f);
                          GL11.glRotatef(35f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.4F, -0F, 0.3F);
                          GL11.glRotatef(35f, 1f, 0f, 0f);
                          GL11.glRotatef(40f, 0f, 1f, 0f);
                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 1F, 1F);
                          GL11.glRotatef(45f, 1f, 0f, 0f);
                          GL11.glRotatef(50f, 0f, 1f, 0f);

                      }, 250, 50),
                      new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 3F, 1F);
                          GL11.glRotatef(0f, 1f, 0f, 0f);
                          GL11.glRotatef(0f, 0f, 1f, 0f);
                      }, 250, 50)
                    )

            .withFirstPersonCustomPositioningEjectSpentRoundAimed(AuxiliaryAttachments.Bullet.getRenderablePart(),
            		new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                      }, 250, 300),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-0.4F, -0.5F, -0F);
                        GL11.glRotatef(10f, 1f, 0f, 0f);
                        GL11.glRotatef(25f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1F, -0.3F, -0F);
                        GL11.glRotatef(30f, 1f, 0f, 0f);
                        GL11.glRotatef(35f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-1.4F, -0F, 0.3F);
                        GL11.glRotatef(35f, 1f, 0f, 0f);
                        GL11.glRotatef(40f, 0f, 1f, 0f);
                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 1F, 1F);
                        GL11.glRotatef(45f, 1f, 0f, 0f);
                        GL11.glRotatef(50f, 0f, 1f, 0f);

                    }, 250, 50),
                    new Transition((renderContext) -> { // Reload position
                    	  GL11.glTranslatef(-2F, 3F, 1F);
                        GL11.glRotatef(0f, 1f, 0f, 0f);
                        GL11.glRotatef(0f, 0f, 1f, 0f);
                    }, 250, 50)
            )
  
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3f, 3f, 3f);
                GL11.glTranslatef(0.093f, 0.9f, 0.25f);
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.15f, 0.15f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0.4f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.085f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.09f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0.2f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.1f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.1f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.17f, 0.15f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.15f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(0F, 0.14f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.11f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0.005F, 0.11f, 0f);
                } 
                
             // HP Zoom
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    //System.out.println("Position me for Scope");
                    GL11.glTranslatef(-0F, 0.11f, 0f);
                } 
                
                // Everything else
                else {
                }
                
            
                })

            .withFirstPersonPositioningModifying((renderContext) -> {
				 new Transform()
				 .withPosition(-1.905000f, 4.065000f, -3.645000f)
				 .withRotation(0.000000f, -30.514396f, -26.062789f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
			 })
			 .withFirstPersonPositioningModifyingAlt((renderContext) -> {
				 new Transform()
				 .withPosition(-1.425000f, 3.545000f, -5.685000f)
				 .withRotation(-0.187566f, -46.164037f, -11.869230f)
				 .withPivotPoint(-0.350000f, -2.900000f, -0.100000f)
				 .withScale(3.000000f, 3.000000f, 3.000000f)
				 .doGLDirect();
           })
					 
	   .withFirstPersonHandPositioningModifying(
                   (renderContext) -> {
                       new Transform()
                       .withPosition(1.730000f, 0.065000f, -0.980000f)
                       .withRotation(93.414678f, 23.699100f, 15.553163f)
                       .withScale(2.6F, 2.6F, 4.0F)
                       .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                       .doGLDirect();
                   }, 
                   (renderContext) -> {
                       new Transform()
                       .withPosition(-0.2F, 0.1F, 2)
                       .withRotation(-5.4027F, -4.7805F, -1.6694F)
                       .withScale(3.5F, 3.5F, 3.5F)
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
                      .withRotation(-12.193518f, -4.7805F, 1.399459f)
                      .withScale(3.5F, 3.5F, 3.5F)
                      .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                      .doGLDirect();
                  })
                   
            .build())
        .withSpawnEntityDamage(14f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}