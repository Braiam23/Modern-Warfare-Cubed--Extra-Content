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
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class VSSVintorezFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("vss_vintorez")
        .withFireRate(0.7f)
        .withRecoil(1.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMuzzlePosition(new Vec3d (-0.13200000393390654, -0.7959999939203257, -6.976000014185902))
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("vss_vintorez")
        .withSilencedShootSound("ak15_silenced")
        .withReloadSound("ak15_reload")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.4f)
        .withFlashOffsetX(() -> 0.1f)
        .withFlashOffsetY(() -> 0.11f)
        .withShootSoundVolume(1f)
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
                 2f, // x 
                 0.1f, // y
                 3f) // z
         
         .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 10), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 15), new
	        		CraftingEntry(MWCItems.steelIngot, 4))
         
         .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
         .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
         .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
         
        .withCompatibleAttachment(AuxiliaryAttachments.VSSVintorezAction, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezDustCover, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSMDustCover, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezStock, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.ASValStock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezHandguard, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.ASValHandguard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VSSVintorezMilspecStock, (player, stack) -> {
        },(model) -> {
        	if(model instanceof MilSpecStock) {
                GL11.glTranslatef(0F, 0.12F, -0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.VSSVintorezTriRailMount, (model) -> {
        })
        .withCompatibleAttachment(Magazines.VSSVintorezMag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.ASValMag, (model) -> {
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
        .withCompatibleAttachment(Attachments.OKP7, (player, stack) -> {
                GL11.glTranslatef(-0.2F, -0.65F, -1F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof OKP7reticle) {
                GL11.glTranslatef(0.17F, -1.15F, -0.6F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraMount, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.23F, -0.6F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.205F, -1.35F, -1.8F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.295F, -1.35F, -0.6F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
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
        
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.15F, -1.2F, -1.6F);
		            GL11.glScaled(0.4F, 0.4F, 0.4F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.18F, -1.1F, -0.7F);
		            GL11.glScaled(0.37F, 0.37F, 0.37F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -1.88F, -1F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		        }
		    })
		.withCompatibleAttachment(Attachments.RMR, (player, stack) -> {
            GL11.glTranslatef(-0.165F, -1.38F, -0.8F);
            GL11.glScaled(0.3F, 0.3F, 0.3F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(-0.17F, -1.38F, -0.7F);
            GL11.glScaled(0.33F, 0.33F, 0.33F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.17F, -1.38F, -0.7F);
            GL11.glScaled(0.33F, 0.33F, 0.33F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
        	GL11.glTranslatef(-0.12F, -0.75F, -0.5F);
            GL11.glScaled(0.83F, 0.83F, 0.83F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
        	GL11.glTranslatef(-0.062F, -1.19F, -1.0F);
            GL11.glScaled(0.47F, 0.47F, 0.47F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.055F, -1.13F, -1.0F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
        	GL11.glTranslatef(-0.045F, -1.22F, -1.0F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.045F, -1.22F, -1.0F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.045F, -1.22F, -1.0F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
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
            GL11.glTranslatef(-0.288F, -1.39F, -1.2F);
            GL11.glScaled(0.42F, 0.42F, 0.42F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.21F, -0.7F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.04F, -1.21F, -0.7F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(0F, -0.95F, -4.5F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
		.withCompatibleAttachment(Attachments.Laser, (p, s) -> {
			GL11.glTranslatef(0F, -0.95F, -4.5F);
			GL11.glScaled(0.8F, 0.8F, 0.8F);
		})
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.1F, -4.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -3.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
        	GL11.glTranslatef(-0.2F, -0.15F, -3.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, 0F, -4.2F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("vssvintorez")
        .withRenderer(new WeaponRenderer.Builder()

            .withModel(new VSSVintorez())
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
                GL11.glScaled(0.5F, 0.5F, 0.5F);
                GL11.glTranslatef(-1.8F, -1.1F, 2F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
            
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.305000f, 3.785000f, -2.525000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.145000f, -0.380000f)
                        .withBBRotation(-10.1474, -26.3974, 59.2926)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2, 0.1, 2)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("vssvintorez", AuxiliaryAttachments.VSSVintorezAction)
                .setupModernMagazineAnimations("vssvintorez", Magazines.ASValMag, Magazines.VSSVintorezMag)
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.VSSVintorezAction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
				
            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.14f, 0.72f, -0.2f);

                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                    GL11.glTranslatef(-0.015F, 0.28f, -0.1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                    GL11.glTranslatef(-0.04F, 0.24f, -0.2f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraMount)) {
                    GL11.glTranslatef(0F, 0.36f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    GL11.glTranslatef(0F, 0.315f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    GL11.glTranslatef(0F, 0.315f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    GL11.glTranslatef(0F, 0.315f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    GL11.glTranslatef(0F, 0.315f, 0f);
                } 
				
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    GL11.glTranslatef(0F, 0.26f, 0f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    GL11.glTranslatef(0F, 0.31f, 0.2f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    GL11.glTranslatef(0F, 0.29f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    GL11.glTranslatef(0F, 0.29f, 0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    GL11.glTranslatef(0F, 0.26f, 0.2f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    GL11.glTranslatef(0F, 0.3f, 0.2f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(0F, 0.31f, 0.4f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    GL11.glTranslatef(0F, 0.32f, 0.0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0F, 0.32f, 0.0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    GL11.glTranslatef(0F, 0.32f, 0.0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(0F, 0.31f, 0.0f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0F, 0.25f, 0.2f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                    GL11.glTranslatef(0F, 0.21f, 0.2f);
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
        .withSpawnEntityDamage(13f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

