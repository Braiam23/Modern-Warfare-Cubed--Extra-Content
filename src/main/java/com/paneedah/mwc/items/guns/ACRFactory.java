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


public class ACRFactory implements GunFactory {

	public Item createGun(CommonProxy commonProxy) {
		return new Weapon.Builder()
		
		.withName("acr") 
		.withFireRate(0.65f) 
		.withRecoil(3f) 
		.withZoom(0.9f) 
		.withConfigGroup(GunConfigurationGroup.RIFLES) 
		.withMuzzlePosition(new Vec3d(0.0, -1.076000002264977, -6.227999991893772)) 
		.hasFlashPedals() 
		.withMaxShots(1, 3, Integer.MAX_VALUE) 
        .withCreativeTab(MWC.WEAPONS_TAB)
		.withShootSound("acr") 
		.withSilencedShootSound("m4a1_silenced") 
		.withDrawSound("acr_draw") 
		.withReloadingTime(30) 
		.withCrosshair("gun") 
		.withCrosshairRunning("Running")
		.withCrosshairZoomed("Sight") 
		.withFlashIntensity(0.5f) 
        .withFlashScale(() -> 0.6f) 
        .withFlashOffsetX(() -> 0.14f) 
        .withFlashOffsetY(() -> 0.16f) 
		.withCreativeTab(MWC.WEAPONS_TAB) 
		.useNewSystem()
		.withRecoilParam(new RecoilParam( 
				15.0,
				15.75,
				50.0,
				0.4,
				0.3125,
				0.0,
				0.0,
				1.0
		))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                1f, 
                1f, 
                3f) 
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 12), new
        		CraftingEntry(MWCItems.steelIngot, 3))

        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.RECEIVER)
        .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
        .withCompatibleAttachment(Attachments.Placeholder, true, (model) -> {
            GL11.glTranslatef(0.01f, -0.19f, -0.4f);
            GL11.glScaled(0F, 0F, 0F);
        })

        .withCompatibleAttachment(Attachments.ACRStock, true, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRStockBlack, (model) -> {
		})

        .withCompatibleAttachment(Attachments.ACRPRSStockTan, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRFixedStockTan, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRLongRangeStock, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRPDWStock, (model) -> {
        })

        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
            GL11.glTranslatef(0.01f, -0.35f, -0.15f);
            GL11.glScaled(1.1F, 1.1F, 1.1F);
        })

        .withCompatibleAttachment(Attachments.ACRHandGuard, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })

        .withCompatibleAttachment(Attachments.ACRHandGuardBlack, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0.85F, 0.85F, 0.8F);
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            }
        })

        .withCompatibleAttachment(Attachments.ACRWEMSKHandGuardTan, (model) -> {
            if(model instanceof AKRail) {
            	GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0.85F, 0.85F, 0.75F);
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } 
        })

        .withCompatibleAttachment(Attachments.ACRPrecisionHandGuardTan, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRPolymerHandGuardTan, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRSBRHandGuardTan, (model) -> {
        })

        .withCompatibleAttachment(Attachments.ACRSquareDropHandguardTan, (model) -> {
        	GL11.glTranslatef(0.001f, -0f, 0f);
        })

        .withCompatibleAttachment(Magazines.M4A1Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.1F, 1.2F, 1.2F);
        })

        .withCompatibleAttachment(Magazines.M38Mag, (model) -> {
            GL11.glTranslatef(-0.35F, 0.3F, -1.31F);
            GL11.glScaled(1.15F, 1.2F, 1.2F);
        })

        .withCompatibleAttachment(Magazines.Stanag50, (model) -> {
            GL11.glTranslatef(0F, -0.15F, -0.1F);
        })

        .withCompatibleAttachment(Magazines.Stanag60, (model) -> {
            GL11.glRotatef(-10F, 1f, 0f, 0f);
            GL11.glTranslatef(0F, 0.08F, -0.15F);
        })

        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.22F, -1.6F, -2F);
            GL11.glScaled(0.82F, 0.82F, 0.82F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })

        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.32F, -1.62F, -0.9F);
            GL11.glScaled(0.83F, 0.83F, 0.83F);
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
            GL11.glTranslatef(-0.2F, -1.26F, -1F);
            GL11.glScaled(0.5F, 0.5F, 0.5F);
        },(model) -> {
             if(model instanceof Acog2) {
                 GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                 GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })

        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.154F, -1.45F, -1.7F);
		            GL11.glScaled(0.46F, 0.46F, 0.46F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})

	    .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
			    GL11.glTranslatef(-0.148F, -2.12F, -1F);
			    GL11.glScaled(0.35F, 0.35F, 0.35F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        } else if (model instanceof SightMount) {
	        }
	    })

        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.0555F, -1.4F, -1.5F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })

        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })

        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.034F, -1.46F, -1.4F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
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

        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.054F, -1.38F, -1.3F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })

        .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
            GL11.glTranslatef(-0.3F, -1.64F, -1.4F);
            GL11.glScaled(0.45F, 0.45F, 0.45F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })

        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.45F, -0.99F);
                GL11.glScaled(0.65F, 0.65F, 0.65F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })

        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
	            GL11.glTranslatef(-0.04F, -1.45F, -0.99F);
	            GL11.glScaled(0.65F, 0.65F, 0.65F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })

        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.18F, -1.64F, -1F);
                GL11.glScaled(0.4F, 0.4F, 0.4F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.15F, -0.4F, -0.35F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })

        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
            GL11.glTranslatef(-0.18F, -1.64F, -1F);
            GL11.glScaled(0.4F, 0.4F, 0.4F);
    },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(0.15F, -0.4F, -0.35F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
    })
	    .withCompatibleAttachment(Attachments.SIGTANGO6T, (player, stack) -> {
            GL11.glTranslatef(-0.16F, -1.43F, -1.75F);
            GL11.glScaled(0.49F, 0.49F, 0.4F);
        }, (model) -> {
            if (model instanceof JPUreticle) {
                GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                GL11.glScaled(0.04F, 0.04F, 0.04F);
            }
        })

        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })

        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })

        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.3F, -2.95F);
            GL11.glScaled(1F, 1F, 1F);
        })

        .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.23F, -0.62F, -2.9F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })

        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.4F, -2.7F);
            GL11.glScaled(1F, 1F, 1F);
        })

        .withCompatibleAttachment(Attachments.Bipod, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.GUARD, instance);
                if(activeAttachment == Attachments.ACRPrecisionHandGuardTan) {
                	GL11.glTranslatef(-0.2F, -0.35F, -5F);
    	            GL11.glScaled(1F, 1F, 1F);
                } else {
                	GL11.glTranslatef(-0.18F, -0.35F, -3.5F);
                    GL11.glScaled(0.8F, 0.8F, 0.8F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)

        .withCompatibleAttachment(Attachments.Laser2, (p, s) -> {
        	GL11.glTranslatef(0.08F, -1.15F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
		})

        .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
            GL11.glTranslatef(0.08F, -1.15F, -3F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })

        .withCompatibleAttachment(Attachments.Silencer556x45, (model) -> {
            GL11.glTranslatef(-0.19F, -1.205F, -6.8F);
            GL11.glScaled(0.9F, 0.9F, 0.9F);
        })

        .withCompatibleAttachment(Attachments.TritiumRearSights, (model) -> {
            if(model instanceof TritiumRearSights) {
            	 GL11.glTranslatef(-0.165F, -1.72F, -0.27F);
                 GL11.glScaled(0.38F, 0.38F, 0.38F);
            }
        })

 	   .withCompatibleAttachment(Attachments.HK416RearSights, (model) -> {
            if(model instanceof G95_upright_rearsights) {
         	   GL11.glTranslatef(-0.156F, -1.73F, -0.5F);
                GL11.glScaled(0.32F, 0.32F, 0.32F);
            }
        })

 	   .withCompatibleAttachment(Attachments.MBUSRearSights, true, (model) -> {
            if(model instanceof MBUSRearSight) {
         	    GL11.glTranslatef(-0.16F, -1.73F, -0.3F);
                GL11.glScaled(0.35F, 0.35F, 0.35F);
            }
        })

		.withCompatibleAttachment(Attachments.HK416FrontSight, (model) -> {
			if(model instanceof G95_upright_frontsights) {
 		  		GL11.glTranslatef(-0.155F, -1.76F, -3.5F);
 	            GL11.glScaled(0.32F, 0.32F, 0.32F);
 		  	}
        })
      
      .withCompatibleAttachment(Attachments.MBUSFrontSight, true, (model) -> {
    	  if(model instanceof MBUSFrontSight) {
    		  GL11.glTranslatef(-0.16F, -1.73F, -3.6F);
              GL11.glScaled(0.35F, 0.35F, 0.35F);
           }
      })

        .withCompatibleAttachment(Attachments.AKMIron, (model) -> {
            if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.255F, -1.55F, -2.25F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.17F, -1.68F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.22F, -2F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof G36CIron1) {
                GL11.glTranslatef(-0.22F, -1.94F, 0.13F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof G36CIron2) {
                GL11.glTranslatef(-0.205F, -1.9F, -3.15F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron1) {
                GL11.glTranslatef(0.165F, -1.65F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof ScarIron2) {
                GL11.glTranslatef(0.25F, -1.55F, -2F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof FALIron) {
                GL11.glTranslatef(-0.09F, -1.525F, -3.8F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F); 
            } else if(model instanceof M27rearsight) {
            	GL11.glTranslatef(-0.164F, -1.7F, -0.5F);
                GL11.glScaled(0.38F, 0.38F, 0.38F);
            } else if(model instanceof MBUSiron) {
            	 GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                 GL11.glScaled(0F, 0F, 0F); 
            }
        })

        .withCompatibleAttachment(AuxiliaryAttachments.ACRRails, true, (model) -> {
            if(model instanceof AKRail) {
                GL11.glTranslatef(0.19F, -1.15F, -3.9F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail2) {
                GL11.glTranslatef(-0.43F, -0.93F, -3.92F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(-90F, 0f, 0f, 1f);
            } else if(model instanceof AKRail3) {
                GL11.glTranslatef(-0.03F, -0.77F, -3.94F);
                GL11.glScaled(0F, 0F, 0F); 
                GL11.glRotatef(180F, 0f, 0f, 1f);
            } else if(model instanceof AKRail4) {
                GL11.glTranslatef(-0.226F, -1.52F, -3.9F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            } else if(model instanceof AKRail5) {
                GL11.glTranslatef(-0.226F, -1.52F, -2F);
                GL11.glScaled(0.76F, 0.87F, 0.8F);
            }
        })

        .withCompatibleAttachment(AuxiliaryAttachments.ACRAction, true, (model) -> {
        })

        .withTextureNames("acr")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new BushmasterACR())
            .withActionPiece(AuxiliaryAttachments.ACRAction)
            .withActionTransform(new Transform().withPosition(0, 0, 1))

            .withEntityPositioning(itemStack -> {
                GL11.glScaled(0.35F, 0.35F, 0.35F);
				GL11.glTranslatef(0, 0f, 3f);
            })
            .withInventoryPositioning(itemStack -> {
                GL11.glScaled(0.4F, 0.4F, 0.4F);
                GL11.glTranslatef(1, 2f, -1.2f);
                GL11.glRotatef(-120F, -0.5f, 7f, 3f);
            })
            .withThirdPersonPositioning((renderContext) -> {
                GL11.glScaled(0.6F, 0.6F, 0.6F);
                GL11.glTranslatef(-1.7F, -0.8F, 1.9F);
                GL11.glRotatef(-45F, 0f, 1f, 0f);
                GL11.glRotatef(70F, 1f, 0f, 0f);
                })

            .withFirstPersonPositioning(
					new Transform()
					.withPosition(-1.425000f, 4.625000f, -2.845000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                    .withScale(3.0, 3.0, 3.0)
                )
                
                .withFirstPersonHandPositioning(
                        
                		// Left hand
                        new Transform()
                        .withPosition(1.090000f, -0.015000f, -0.620000f)
                        .withBBRotation(-8.1997, -23.6991, 57.7232)
                        .withScale(2.6, 2.6, 4.0)
                        .withRotationPoint(0, 0, 0),
                        
                        
                        
                        // Right hand
                        new Transform()
                        .withPosition(-0.2, 0.1, 2)
                        .withRotation(-5.4027, -4.7805, -1.6694)
                        .withScale(3.5, 3.5, 3.5)
                        .withRotationPoint(0, 0, 0)
                
                )
                
                .setupModernAnimations("acr", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("acr", 
                		Magazines.M4A1Mag, 
                		Magazines.M38Mag,
                		Magazines.Stanag50,
                		Magazines.Stanag60,
                		Magazines.SOCOM_Mag)
                
            .withFirstPersonCustomPositioning(AuxiliaryAttachments.ACRAction.getRenderablePart(), (renderContext) -> {
                if(renderContext.getWeaponInstance().getAmmo() == 0) {
                    GL11.glTranslatef(0F, 0F, 1F);
                }
            })
                    

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glScaled(2F, 2F, 2);
                GL11.glTranslatef(0.148f, 0.945f, -0.1f);
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MBUSRearSights)) {
                    GL11.glTranslatef(0F, 0.07f, 0f);
                }
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HK416RearSights)) {
                    GL11.glTranslatef(0F, 0.055f, 0f);
                }
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.TritiumRearSights)) {
                    GL11.glTranslatef(0F, 0.05f, 0f);
                }

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    GL11.glTranslatef(0F, 0.08f, 0.25f);
                }
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(-0F, 0.11f, 0.7f);
                }
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0F, 0.05f, 0.3f);
                }
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    GL11.glTranslatef(0F, 0.06f, 0.05f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    GL11.glTranslatef(-0F, 0.055f, 0.6f);
                }

                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(-0F, 0.055f, 0.6f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    GL11.glTranslatef(-0F, 0.045f, 0.6f);
                }

                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                	 GL11.glTranslatef(-0F, 0.09f, 0.6f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	 GL11.glTranslatef(-0F, 0.1f, 0.3f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    GL11.glTranslatef(-0F, 0.08f, 0.8f);
                }

                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                    GL11.glTranslatef(0F, 0.05f, 0.6f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                    GL11.glTranslatef(-0.001F, 0.08f, 0.9f);
                }
                else if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.SIGTANGO6T)) {
                    GL11.glTranslatef(0.001F, 0.055f, 0.1f);
                }
                else if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AKMIron)) {
                    GL11.glTranslatef(0F, 0.039f, 0.2f);
                }

                {
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
		.withSpawnEntityDamage(6f)
		.withSpawnEntityGravityVelocity(0.0118f)


		.build(MWC.modContext);
	}

}
