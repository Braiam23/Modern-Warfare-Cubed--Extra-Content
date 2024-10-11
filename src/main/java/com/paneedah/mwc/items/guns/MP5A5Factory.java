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

public class MP5A5Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("mp5a5")
        .withFireRate(0.8f)
        .withRecoil(1.5f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.SMG)
        .withShellType(Type.PISTOL)
        .withMaxShots(1, Integer.MAX_VALUE)
        .withShootSound("mp5")
        .withSilencedShootSound("mp5_silenced")
        .withDrawSound("noaction_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.5f)
        .withFlashScale(() -> 0.6f)
        .withFlashOffsetX(() -> 0.13f)
        .withFlashOffsetY(() -> 0.17f)
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
	        		CraftingEntry(MWCItems.carbonComposite, 7), new
	        		CraftingEntry(MWCItems.gunmetalPlate, 5), new
	        		CraftingEntry(MWCItems.steelIngot, 5))
         
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.STOCK)
        .withCompatibleAttachment(Attachments.MP5NavyHandGuard, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MP5A5HandGuard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MP5SDHandGuard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MIMP5MHandGuard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.UTGTriRailHandGuard, (model) -> {
            if(model instanceof UTGTriRailHandGuard) {
              GL11.glTranslatef(0F, -0F, 0F);
              GL11.glScaled(1F, 1F, 1F);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(0.12F, -0.98F, -3.22f);
                GL11.glScaled(0.6F, 0.6F, 0.55F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.38F, -0.81F, -3.22f);
                GL11.glScaled(0.6F, 0.6F, 0.55F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.02F, -0.68F, -3.22f);
                GL11.glScaled(0.6F, 0.6F, 0.55F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.MP5BMHandguard, (model) -> {
        	if(model instanceof UTGTriRailHandGuard) {
                GL11.glTranslatef(0F, -0F, 0F);
                GL11.glScaled(1F, 1F, 1F);
              } else if(model instanceof AKRail) {
                  GL11.glTranslatef(0.12F, -1.02F, -3.22f);
                  GL11.glScaled(0.6F, 0.6F, 0.55F);
                  GL11.glRotatef(90F, 0f, 0f, 1f);
              } else if(model instanceof AKRail2) {
                  GL11.glTranslatef(-0.38F, -0.85F, -3.22f);
                  GL11.glScaled(0.6F, 0.6F, 0.55F);
                  GL11.glRotatef(-90F, 0f, 0f, 1f);
              } else if(model instanceof AKRail3) {
                  GL11.glTranslatef(-0.02F, -0.7F, -3.22f);
                  GL11.glScaled(0.6F, 0.6F, 0.55F);
                  GL11.glRotatef(180F, 0f, 0f, 1f);
              }
          })
        .withCompatibleAttachment(Attachments.MP5Stock, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MP5A3Stock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MP5A4Stock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MP5MilspecStock, (model) -> {
        	if(model instanceof MilSpecStock) {
            } 
        })
        .withCompatibleAttachment(Attachments.MP5HOGUEGrip, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MIMP5TRRail, (model) -> {
        	GL11.glTranslatef(0F, 0F, 0.1f);
            if(model instanceof M4Iron2) {
          } else if(model instanceof AKRail) {
              GL11.glTranslatef(-0.22F, -1.36F, -2.07f);
              GL11.glScaled(0.7F, 0.75F, 0.57F);
              }
        })
        .withCompatibleAttachment(Attachments.MIMP5MRail, (model) -> {
        	GL11.glTranslatef(0F, 0F, 0.1f);
            if(model instanceof M4Iron2) {
          } else if(model instanceof AKRail) {
              GL11.glTranslatef(-0.22F, -1.36F, -1.93f);
              GL11.glScaled(0.7F, 0.75F, 0.52F);
              }
        })
        .withCompatibleAttachment(AuxiliaryAttachments.MP5action, true, (model) -> {
      })
        .withCompatibleAttachment(AuxiliaryAttachments.MP5boltaction, true, (model) -> {
        })
        .withCompatibleAttachment(Magazines.MP5A5Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.HK50Drum, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.183F, -1.29F, -4.1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.043F, -1.15F, -3.27F);
                GL11.glScaled(0.4F, 0.47F, 1.8F);
                GL11.glRotatef(-90F, 1f, 0f, 0f);
                GL11.glRotatef(-180F, 0f, 1f, 0f);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.192F, -1.37F, -3.4F);
                GL11.glScaled(0.44F, 0.5F, 0.5F);
            } else if(model instanceof ScarIron1) {
                    GL11.glTranslatef(0.165F, -1.65F, 1F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                    GL11.glTranslatef(0.25F, -1.55F, -2F);
                    GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(-0.101F, -1.27F, -0.18F);
                GL11.glScaled(0.5F, 0.55F, 0.55F);
            }
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.45F, -2F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.295F, -1.45F, -0.8F);
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
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.177F, -1.48F, -1.1F);
                GL11.glScaled(0.36F, 0.36F, 0.36F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.177F, -1.48F, -1.1F);
            GL11.glScaled(0.36F, 0.36F, 0.36F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.AimpointCompM2, (player, stack) -> {
            GL11.glTranslatef(-0.12F, -0.77F, -1F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.005F, -0.89F, -1.5F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
            GL11.glTranslatef(-0.182F, -1.18F, -1.1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
             if(model instanceof Acog2) {
                GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.065F, -1.25F, -1.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
        	GL11.glTranslatef(-0.065F, -1.25F, -1.5F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.145F, -1.98F, -1.3F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		        }
		    })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.32F, -1.3F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.32F, -1.3F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.32F, -1.5F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
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
                GL11.glTranslatef(-0.295F, -1.48F, -1.5F);
                GL11.glScaled(0.44F, 0.44F, 0.44F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.3F, -1.1F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
            GL11.glTranslatef(-0.04F, -1.3F, -1.1F);
            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.6F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.6F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.25F, -2.6F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -2.8F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
            GL11.glTranslatef(-0.2F, -0.15F, -3F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
        	 GL11.glTranslatef(-0.25F, -0.78F, -3.1F);
             GL11.glRotatef(-180F, 0f, 0f, 1f);
             GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
            GL11.glTranslatef(-0.25F, -0.78F, -3.1F);
            GL11.glRotatef(-180F, 0f, 0f, 1f);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })
        .withCompatibleAttachment(Attachments.Silencer9mm, (model) -> {
            GL11.glTranslatef(-0.2F, -1.08F, -5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withTextureNames("mp5")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new MP5())
            .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
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
					.withPosition(-1.425000f, 3.745000f, -3.325000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
					.withRotationPoint(-0.350000f, -0.940000f, 0.060000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                        // Left hand
                        new Transform()
                        .withPosition(1.210000f, 0.265000f, -0.260000f)
                        .withBBRotation(-10.558, -28.6459, 58.5348)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.200000f, 0.260000f, 1.680000f)
                        .withRotation(-5.402700f, -4.780500f, -1.669400f)
                        .withScale(3.0, 3.0, 3.0)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("mp5", AuxiliaryAttachments.MP5boltaction)
                .setupModernMagazineAnimations("mp5", 
                		Magazines.MP5A5Mag,
                		Magazines.HK50Drum)
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.MP5action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.5f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.MP5action.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 0.5f);
                })

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0.18f, -0.21f, -0.0f);

                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    GL11.glTranslatef(0F, 0.26f, 0.95f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(0F, 0.26f, 1.2f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    GL11.glTranslatef(0F, 0.25f, 1.3f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    GL11.glTranslatef(0F, 0.25f, 1.3f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM2)) {
                    GL11.glTranslatef(0F, 0.27f, 1.3f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HP)) {
                    GL11.glTranslatef(0F, 0.19f, 0.75f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0F, 0.21f, 1.25f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    GL11.glTranslatef(0F, 0.2f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    GL11.glTranslatef(0F, 0.263f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    GL11.glTranslatef(0F, 0.275f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                    GL11.glTranslatef(0F, 0.275f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                    GL11.glTranslatef(0F, 0.275f, 1.1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    GL11.glTranslatef(0F, 0.255f, 1f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0F, 0.245f, 0.8f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    GL11.glTranslatef(0F, 0.245f, 0.8f);
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
        .withSpawnEntityDamage(5f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

