package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;


public class M82Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("m82_barrett")
        .withFireRate(0.1f)
        .withRecoil(15f)
        .withZoom(0.8f)
        .withConfigGroup(GunConfigurationGroup.LONG_RANGE_RIFLES)
        .withMuzzlePosition(new Vec3d(-0.1480000044107437, -1.0880000026226049, -10.836000129222878))
        .hasFlashPedals()
        .withMaxShots(1)
        .withShootSound("m82")
        .withPumpTimeout(1000)
        .withSilencedShootSound("as50_silenced")
        .withDrawSound("as50_draw")
        .withReloadingTime(40)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.4f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.08f)
        .withFlashOffsetY(() -> 0.08f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
        		30.0,
        		25.0,
        		38.25,
        		0.3,
        		0.425,
        		0.0,
        		0.025,
        		1.0
        ))
         
         .withScreenShaking(RenderableState.SHOOTING, 
                 6f,
                 -5f,
                 12f)
         
         .withModernRecipe( new
	        		CraftingEntry(MWCItems.carbonComposite, 12), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 15), new
	        		CraftingEntry(MWCItems.steelIngot, 10))
         
        .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(Attachments.GripPlaceholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })
        .withCompatibleAttachment(AuxiliaryAttachments.M82Action, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.M82Mag, (model) -> {
        })
        .withCompatibleAttachment(Attachments.M4Grip, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.M4GripTan, (model) -> {
        })
        .withCompatibleAttachment(Attachments.M4GripGray, (model) -> {
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.58F, -2.5F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
         .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.328F, -1.6F, -1.2F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
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
            GL11.glTranslatef(-0.19F, -1.22F, -1.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
            GL11.glTranslatef(-0.155F, -1.4F, -2.2F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.145F, -2.15F, -1F);
		    GL11.glScaled(0.38F, 0.38F, 0.38F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		        }
		    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                GL11.glTranslatef(-0.045F, -1.35F, -1.5F);
                GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.32F, -1.6F);
            GL11.glScaled(0.63F, 0.63F, 0.63F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
            GL11.glTranslatef(-0.015F, -1.4F, -1.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.015F, -1.4F, -1.5F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.015F, -1.4F, -1.8F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
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
            GL11.glTranslatef(-0.315F, -1.61F, -1.5F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.025F, -1.42F, -1F);
                GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	 GL11.glTranslatef(-0.025F, -1.42F, -1F);
             GL11.glScaled(0.75F, 0.75F, 0.75F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
        	GL11.glTranslatef(-0.186F, -1.6F, -1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.186F, -1.6F, -1F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.18F, -0.15F, -4.9F);
            GL11.glScaled(1F, 1F, 1F);
      })
        .withCompatibleAttachment(Attachments.Silencer50BMG, (model) -> {
            GL11.glTranslatef(-0.23F, -1.4F, -12.4F);
            GL11.glScaled(1.5F, 1.5F, 1.5F);
        })
        .withTextureNames("m82")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new M82())
            .withActionPiece(AuxiliaryAttachments.M82Action)
            .withActionTransform(new Transform().withPosition(0, 0, 1.5))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.28F, 0.28F, 0.28F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.45F, 0.45F, 0.45F);
                GL11.glTranslatef(-2.2F, -1.1F, 2.4F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })
                
            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.705000f, 4.705000f, -3.445000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.230000f, -1.740000f, 0.140000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.250000f, 0.265000f, -0.980000f)
                        .withBBRotation(-6.645, -32.8876, 56.8877)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.160000f, 0.060000f, 1.640000f)
                        .withBBRotation(5.4027, 4.7805, -1.6694)
                        .withScale(3.0, 3.0, 3.0)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("m82", AuxiliaryAttachments.M82Action)
                .setupModernMagazineAnimations("m82", 
                		Magazines.M82Mag)
            
            .withFirstPersonCustomPositioning(Magazines.M82Mag, (renderContext) -> {
               })

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                GL11.glTranslatef(0.13f, 1.18f, -0.7f);

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    GL11.glTranslatef(0f, 0.12f, 0.8f);
                }  

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(-0.005f, 0.15f, 1.3f);
                }  

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0f, 0.05f, 1.2f);
                }  

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    GL11.glTranslatef(0f, 0.11f, 0.6f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    GL11.glTranslatef(0f, 0.1f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(0f, 0.08f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    GL11.glTranslatef(0f, 0.1f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    GL11.glTranslatef(0f, 0.14f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                	 GL11.glTranslatef(0f, 0.14f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	 GL11.glTranslatef(0f, 0.135f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    GL11.glTranslatef(0f, 0.11f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0f, 0.12f, 0.5f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    GL11.glTranslatef(0f, 0.12f, 0.5f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    GL11.glTranslatef(0f, 0.11f, 0.9f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                	GL11.glTranslatef(0f, 0.11f, 0.9f);
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
        .withSpawnEntityDamage(25f)
        .withSpawnEntityGravityVelocity(0f)
        
         
        .build(MWC.modContext);
    }
}
