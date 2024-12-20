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
import net.minecraft.init.Blocks;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class AK47Factory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

        .withName("ak47")
        .withFireRate(0.6f)
        .withRecoil(4f)
        .withZoom(0.9f)
        .withConfigGroup(GunConfigurationGroup.RIFLES)
        .hasFlashPedals()
        .withMaxShots(1, Integer.MAX_VALUE)
        .withMuzzlePosition(new Vec3d(-0.16400000488758082, -1.0, -6.5))
        //.withMaxShots(5)
        .withShootSound("ak47")
        .withSilencedShootSound("ak15_silenced")
        .withEndOfShootSound("gun_click")
        .withDrawSound("ak_draw")
        .withReloadingTime(45)
        .withCrosshair("gun")
        .withCrosshairRunning("Running")
        .withCrosshairZoomed("Sight")
        .withFlashIntensity(0.6f)
        .withFlashScale(() -> 0.5f)
        .withFlashOffsetX(() -> 0.12f)
        .withFlashOffsetY(() -> 0.16f)
        .withCreativeTab(MWC.WEAPONS_TAB)
        .useNewSystem()
        .withRecoilParam(new RecoilParam(
            40.0,
            15.75,
            50.0,
            0.4,
            0.3125,
            0.0,
            0.0,
            1.0
		))
        
        .withScreenShaking(RenderableState.SHOOTING, 
                5f,
                1f,
                10f)
        
        .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
        .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
        
        .withModernRecipe( new
        		CraftingEntry(MWCItems.carbonComposite, 8), new
        		CraftingEntry(MWCItems.gunmetalPlate, 12), new
        		CraftingEntry(Blocks.PLANKS, 4))
        
        .withCompatibleAttachment(Attachments.AK47Stock, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.RPKStock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK101Stock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK74Stock, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK47DustCover, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AKMDustCover, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK47HandleGuard, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK101HandGuard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK74Handguard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AKMagpulHandleGuard, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AKMagpulHandleGuardTan, (model) -> {
        })
        .withCompatibleAttachment(Attachments.MLOKHandguard, (model) -> {
            if(model instanceof MLOKHandguard) {
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -4.3f);
                GL11.glScaled(0.7F, 0.8F, 0.4F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.MLOKExtendedHandguard, (model) -> {
            if(model instanceof MLOKExtendedHandguard) {
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -5.6f);
                GL11.glScaled(0.7F, 0.8F, 1F);
            } else if(model instanceof AKRail2) {   
                GL11.glTranslatef(-0.02F, -0.5F, -5.6f);
                GL11.glScaled(0.7F, 0.8F, 1F);
                GL11.glRotatef(180.000000f, 0f, 0f, 1f);
            }
        })
        .withCompatibleAttachment(Attachments.AK101DustCover, (model) -> {
        })
        .withCompatibleAttachment(Attachments.VeprDustCover, (model) -> {
            if(model instanceof VeprDustCover) {
                GL11.glScaled(1F, 0.98F, 1);
            } else if(model instanceof AKRail) {
                GL11.glTranslatef(-0.22F, -1.3F, -2.75f);
                GL11.glScaled(0.7F, 0.8F, 1.1F);
            }
        })
        .withCompatibleAttachment(Attachments.CollapsableMOEStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.2f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStock, (model) -> {
            GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.HK416Stock, (model) -> {
        	GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MagpulCTRStockTan, (model) -> {
        	GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.MilSpecStockTan, (model) -> {
        	GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.HK416StockTan, (model) -> {
        	GL11.glTranslatef(0.02f, 0.2f, -0.4f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.AK47Grip, true, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AK101Grip, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AKErgoGrip, (model) -> {
        })
        .withCompatibleAttachment(Attachments.AKErgoGripTan, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKaction, true, (model) -> {
        })
        .withCompatibleAttachment(AuxiliaryAttachments.AKpart, true, (model) -> {
            GL11.glTranslatef(-0.14F, -0.81F, -5.96F);
            GL11.glScaled(0.5F, 0.5F, 3F);
            
        })
        .withCompatibleAttachment(Attachments.AKIron, true, (model) -> {
            if(model instanceof AKiron3) {
                GL11.glTranslatef(-0.195F, -1.06F, -5.96F);
                GL11.glScaled(0.9F, 0.55F, 0.5F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0.55F, 0.55F, 0.68F);
            }
        })
        .withCompatibleAttachment(Attachments.RPKBarrel, (model) -> {
            if(model instanceof RPKbarrel) {
            } else if(model instanceof AKiron3) {
                GL11.glTranslatef(-0.195F, -1.06F, -7.16F);
                GL11.glScaled(0.9F, 0.55F, 0.5F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -7.15F);
                GL11.glScaled(0.55F, 0.55F, 0.68F);
            }
        })
        .withCompatibleAttachment(Magazines.AK15Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.AK47PMAGTan, (model) -> {
        })
        .withCompatibleAttachment(Magazines.AK47Mag, (model) -> {
        })
        .withCompatibleAttachment(Magazines.AK50Mag, (model) -> {
            GL11.glRotatef(-20.000000f, 1f, 0f, 0f);
            GL11.glTranslatef(0f, 0.35f, -0.21f);
        })
        .withCompatibleAttachment(Magazines.AK75Mag, (model) -> {
            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
            GL11.glTranslatef(0f, 0.35f, 0.35f);
            GL11.glScaled(1.2F, 1.2F, 1.2F);
        })
        .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
            GL11.glTranslatef(-0.21F, -1.4F, -2.1F);
            GL11.glScaled(0.75F, 0.75F, 0.75F);
        },(model) -> {
            if(model instanceof JPUreticle) {
                GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                GL11.glScaled(0.03F, 0.03F, 0.03F);
            }
        })
        .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
            GL11.glTranslatef(-0.32F, -1.4F, -1F);
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
        
        .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
		            GL11.glTranslatef(-0.155F, -1.23F, -1.9F);
		            GL11.glScaled(0.43F, 0.43F, 0.43F);
		},(model) -> {
		     if(model instanceof JPUreticle) {
		        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
		        GL11.glScaled(0.04F, 0.04F, 0.04F);
		    }
		})
        
        .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
		            GL11.glTranslatef(-0.195F, -1.05F, -1.3F);
		            GL11.glScaled(0.47F, 0.47F, 0.47F);
		},(model) -> {
		    if(model instanceof Acog2) {
		        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
		        GL11.glScaled(0.1F, 0.1F, 0.1F);
		    }
		})
        
		.withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
		    GL11.glTranslatef(-0.15F, -1.91F, -1F);
		    GL11.glScaled(0.35F, 0.35F, 0.35F);
		    },(model) -> {
		        if(model instanceof Reflex2) {
		            GL11.glTranslatef(0.08F, 0.97F, -0.4F);
		            GL11.glScaled(0.15F, 0.15F, 0.15F);
		        } else if (model instanceof SightMount) {
		        }
		    })
        
        .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                GL11.glTranslatef(-0.185F, -1.41F, -1.2F);
                GL11.glScaled(0.43F, 0.43F, 0.43F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
        	GL11.glTranslatef(-0.185F, -1.41F, -1.2F);
            GL11.glScaled(0.43F, 0.43F, 0.43F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(0.155F, -0.4F, -0.5F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
            GL11.glTranslatef(-0.06F, -1.18F, -1.6F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
            },(model) -> {
                if(model instanceof Reflex2) {
                    GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                    GL11.glScaled(0.15F, 0.15F, 0.15F);
                }
            })
        .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
            GL11.glTranslatef(-0.055F, -1.16F, -1.4F);
            GL11.glScaled(0.55F, 0.55F, 0.55F);
        },(model) -> {
        if(model instanceof Reflex2) {
            GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
            GL11.glScaled(0.15F, 0.15F, 0.15F);
        }
        })
        .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                GL11.glTranslatef(-0.035F, -1.25F, -1.4F);
                GL11.glScaled(0.73F, 0.73F, 0.73F);
            },(model) -> {
                if(model instanceof Holo2) {
                    GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                    GL11.glScaled(0.1F, 0.1F, 0.1F);
                }
            })
        .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.25F, -1.4F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
        },(model) -> {
            if(model instanceof Holo2) {
                GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                GL11.glScaled(0.1F, 0.1F, 0.1F);
            }
        })
        
        .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
        	GL11.glTranslatef(-0.035F, -1.25F, -1.8F);
            GL11.glScaled(0.73F, 0.73F, 0.73F);
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
            GL11.glTranslatef(-0.33F, -1.44F, -1.6F);
            GL11.glScaled(0.52F, 0.52F, 0.52F);
	    },(model) -> {
	        if(model instanceof Holo2) {
	            GL11.glTranslatef(0.395F, -0.33F, -0.1F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                GL11.glTranslatef(-0.04F, -1.24F, -1F);
                GL11.glScaled(0.7F, 0.7F, 0.7F);
        },(model) -> {
            if(model instanceof Reflex2) {
                GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                GL11.glScaled(0.15F, 0.15F, 0.15F);
            }
        })
        .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
        	GL11.glTranslatef(-0.04F, -1.24F, -1F);
            GL11.glScaled(0.7F, 0.7F, 0.7F);
	    },(model) -> {
	        if(model instanceof Reflex2) {
	            GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
	            GL11.glScaled(0.15F, 0.15F, 0.15F);
	        }
	    })
        .withCompatibleAttachment(AuxiliaryAttachments.Extra, true, (model) -> {
            if(model instanceof AKMiron1) {
                GL11.glTranslatef(0.125F, -1.8F, -0.5F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AKMiron2) {
                GL11.glTranslatef(-0.185F, -1.32F, -5.95F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof AK47iron) {
                GL11.glTranslatef(-0.25F, -1.65F, -3.05F);
                GL11.glScaled(0.8F, 0.7F, 0.6F);
            } else if(model instanceof M4Iron1) {
                GL11.glTranslatef(0.155F, -1.74F, 1F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M4Iron2) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof P90iron) {
                GL11.glTranslatef(0.26F, -1.55F, -2.35F);
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
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof M14Iron) {
                GL11.glTranslatef(0.129F, -1.63F, -2.08F);
                GL11.glScaled(0F, 0F, 0F);
            } else if(model instanceof MP5Iron) {
                GL11.glTranslatef(0.215F, -1.54F, 1.2F);
                GL11.glScaled(0F, 0F, 0F);
            }
        })
        .withCompatibleAttachment(Attachments.Bipod, (model) -> {
        	GL11.glTranslatef(-0.18F, -0.15F, -4F);
            GL11.glScaled(0.8F, 0.8F, 0.8F);
        })
        .withCompatibleAttachment(Attachments.Grip2, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.StubbyGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.AngledGrip, (model) -> {
            GL11.glTranslatef(-0.2F, 0.05F, -4F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.VGrip, (model) -> {
            GL11.glTranslatef(-0.2F, -0.1F, -3.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.JunoGrip, (model) -> {
            GL11.glTranslatef(-0.3F, -0.35F, -4.5F);
            GL11.glScaled(1F, 1F, 1F);
        })
        .withCompatibleAttachment(Attachments.Silencer762x39, renderContext -> {
            PlayerWeaponInstance instance = renderContext.getWeaponInstance();
            if(instance != null) {
                ItemAttachment<Weapon> activeAttachment = WeaponAttachmentAspect.getActiveAttachment(
                        AttachmentCategory.FRONTSIGHT, instance);
                if(activeAttachment == Attachments.RPKBarrel) {
                    GL11.glTranslatef(-0.2F, -1.06F, -8.8F);
                    GL11.glScaled(1F, 1F, 1F);
                } else {
                    GL11.glTranslatef(-0.2F, -1.06F, -7.55F);
                    GL11.glScaled(1F, 1F, 1F);
                }
            }
        },(model) -> {
            if(model instanceof AcogReticle) {
                GL11.glTranslatef(0F, 0F, 0f);
                GL11.glScaled(0F, 0F, 0F);
            }
        }, false, false)
        .withTextureNames("ak47")
        .withRenderer(new WeaponRenderer.Builder()
    
            .withModel(new AK47())
            .withActionPiece(AuxiliaryAttachments.AKaction)
            .withActionTransform(new Transform().withPosition(0, 0, 1))
            .withADSBeizer(new Vec3d(0.2, 1.7, 0.5))
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
					.withPosition(-1.225000f, 3.705000f, -2.525000f)
					.withRotation(0.000000f, 1.000000f, 6.300000f)
                    .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
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
                
                .setupModernAnimations("ak47", AuxiliaryAttachments.AKaction)
                .setupModernMagazineAnimations("ak47", 
                		Magazines.AK47Mag, 
                		Magazines.AK15Mag, 
                		Magazines.AK47PMAGTan,
                		Magazines.AK50Mag,
                		Magazines.AK75Mag)
            
            .withFirstPersonPositioningCustomRecoiled(AuxiliaryAttachments.AKaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })
                
            .withFirstPersonPositioningCustomZoomingRecoiled(AuxiliaryAttachments.AKaction.getRenderablePart(), (renderContext) -> {
                GL11.glTranslatef(0f, 0f, 1f);
                })

            .withFirstPersonPositioningZooming((renderContext) -> {
                GL11.glTranslatef(0.18f, -0.23f, 0.7f);

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                    GL11.glTranslatef(0F, 0.23f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                    GL11.glTranslatef(0F, 0.26f, 0.6f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                    GL11.glTranslatef(0F, 0.18f, 0.2f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                    GL11.glTranslatef(0F, 0.18f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                    GL11.glTranslatef(0F, 0.22f, 0.4f);
                } 
                
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                    GL11.glTranslatef(0F, 0.25f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                	 GL11.glTranslatef(0F, 0.25f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                    GL11.glTranslatef(0F, 0.2f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                    GL11.glTranslatef(0F, 0.19f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                    GL11.glTranslatef(0F, 0.26f, 0.4f);
                } 
				
                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                	 GL11.glTranslatef(0F, 0.26f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                	 GL11.glTranslatef(0F, 0.28f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                    GL11.glTranslatef(0F, 0.28f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                    GL11.glTranslatef(0F, 0.24f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                	 GL11.glTranslatef(0F, 0.24f, 0.4f);
                } 

                if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AK15ironsight)) {
                    GL11.glTranslatef(0F, 0.008f, 0f);
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
        .withSpawnEntityDamage(6.6f)
        .withSpawnEntityGravityVelocity(0.0118f)
                
        .build(MWC.modContext);
    }
}

