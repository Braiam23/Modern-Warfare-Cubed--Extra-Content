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
import com.paneedah.weaponlib.crafting.CraftingComplexity;
import com.paneedah.weaponlib.crafting.CraftingEntry;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;
import com.paneedah.weaponlib.config.ModernConfigManager;

public class AKS74UFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("aks74u")
                .withFireRate(0.68f)
                .withRecoil(3.5f)
                .withZoom(0f)
                .withConfigGroup(GunConfigurationGroup.RIFLES)
                .hasFlashPedals()
                .withMaxShots(1, Integer.MAX_VALUE)
                .withMuzzlePosition(new Vec3d(-0.16400000488758082, -0.86, -5.8))
                .withShootSound("aks74u")
                .withSilencedShootSound("aks_sp")
                .withEndOfShootSound("gun_click")
                .withDrawSound("ak_draw")
                .withReloadingTime(50)
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.5f)
                .withFlashOffsetX(() -> 0.12f)
                .withFlashOffsetY(() -> 0.16f)
                .withShellCasingVerticalOffset(-0.05f)
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
                        1.5f, 
                        3f, 
                        3f)

                .withModernRecipe(new
                        CraftingEntry(MWCItems.carbonComposite, 8), new
                        CraftingEntry(MWCItems.gunmetalPlate, 12), new
                        CraftingEntry(MWCItems.steelIngot, 5))

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.RAILING)
                .withCrafting(CraftingComplexity.MEDIUM,
                        MWCItems.gunmetalIngot,
                        MWCItems.gunmetalPlate)

                .withCompatibleAttachment(Attachments.AKSStock,true, (model) -> {
                })
                .withCompatibleAttachment(AuxiliaryAttachments.AKSaction,true, (model) -> {
                })
                .withCompatibleAttachment(Magazines.AKS74UMag, (model) -> {
                })
                .withCompatibleAttachment(Attachments.AKSDustCover, true, (player, stack
                ) -> {
                },(model) -> {
                    if(model instanceof AKS74URearSight) {
                        GL11.glTranslatef(-0.124F, -1.555F, -1.5F);
                        GL11.glScaled(0.35F, 0.35F, 0.35F);
                    }
                })
                .withCompatibleAttachment(AuxiliaryAttachments.AKSFrontSight, true, (model) -> {
                    GL11.glTranslatef(-0.124F, -1.55F, -1.3F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                })
                .withCompatibleAttachment(Attachments.AKS74Uhandguard, true, (model) -> {
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
                .withCompatibleAttachment(Attachments.PSO1, (player, stack) -> {
                    GL11.glTranslatef(0.14F, -0.9F, -1.1F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                }, (model) -> {
                    if (model instanceof PSO1reticle) {
                        GL11.glTranslatef(-0.212F, -0.483F, 1.27F);
                        GL11.glScaled(0.017F, 0.017F, 0.017F);
                    } else if (model instanceof PSO12) {
                        GL11.glTranslatef(-0.27F, -0.6F, 1.21F);
                        GL11.glScaled(0.8F, 0.8F, 0.8F);
                    }
                })
                .withCompatibleAttachment(Attachments.OKP7, (player, stack) -> {
                    GL11.glTranslatef(-0.2F, -0.65F, -1F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                    }
                })
                .withCompatibleAttachment(Attachments.NightRaider, (player, stack) -> {
                    GL11.glTranslatef(-0.21F, -1.4F, -2.1F);
                    GL11.glScaled(0.75F, 0.75F, 0.75F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.12F, -0.2F, 2.49F);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })
                .withCompatibleAttachment(Attachments.ACOG, (player, stack) -> {
                    GL11.glTranslatef(-0.32F, -1.4F, -1F);
                    GL11.glScaled(0.83F, 0.83F, 0.83F);
                }, (model) -> {
                    if (model instanceof AcogScope2) {
                        GL11.glTranslatef(-0.018F, -0.25F, 0.13F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    } else if (model instanceof AcogReticle) {
                        GL11.glTranslatef(0.243F, -0.23F, 0.68f);
                        GL11.glScaled(0.03F, 0.03F, 0.03F);
                    }
                })

                .withCompatibleAttachment(Attachments.LeupoldRailScope, (player, stack) -> {
                    GL11.glTranslatef(-0.155F, -1.23F, -1.9F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof JPUreticle) {
                        GL11.glTranslatef(0.076F, -0.67F, 4.0251F);
                        GL11.glScaled(0.04F, 0.04F, 0.04F);
                    }
                })

                .withCompatibleAttachment(Attachments.Specter, (player, stack) -> {
                    GL11.glTranslatef(-0.195F, -1.05F, -1.3F);
                    GL11.glScaled(0.47F, 0.47F, 0.47F);
                }, (model) -> {
                    if (model instanceof Acog2) {
                        GL11.glTranslatef(0.15F, -1.035F, 1.513F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.MicroReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.15F, -1.91F, -1F);
                    GL11.glScaled(0.35F, 0.35F, 0.35F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.08F, 0.97F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    } else if (model instanceof SightMount) {
                    }
                })

                .withCompatibleAttachment(Attachments.MicroT1, (player, stack) -> {
                    GL11.glTranslatef(-0.185F, -1.41F, -1.2F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.AimpointCompM5, (player, stack) -> {
                    GL11.glTranslatef(-0.185F, -1.41F, -1.2F);
                    GL11.glScaled(0.43F, 0.43F, 0.43F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(0.155F, -0.4F, -0.5F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Reflex, (player, stack) -> {
                    GL11.glTranslatef(-0.06F, -1.18F, -1.6F);
                    GL11.glScaled(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.7F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.BijiaReflex, (player, stack) -> {
                    GL11.glTranslatef(-0.055F, -1.16F, -1.4F);
                    GL11.glScaled(0.55F, 0.55F, 0.55F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.68F, -0.4F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Holographic, (player, stack) -> {
                    GL11.glTranslatef(-0.035F, -1.25F, -1.4F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })
                .withCompatibleAttachment(Attachments.HolographicAlt, (player, stack) -> {
                    GL11.glTranslatef(-0.035F, -1.25F, -1.4F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.125F, -0.5F, -0.1F);
                        GL11.glScaled(0.1F, 0.1F, 0.1F);
                    }
                })

                .withCompatibleAttachment(Attachments.EotechHybrid2, (player, stack) -> {
                    GL11.glTranslatef(-0.035F, -1.25F, -1.8F);
                    GL11.glScaled(0.73F, 0.73F, 0.73F);
                }, (model) -> {
                    if (model instanceof EotechScopeRing) {
                        GL11.glTranslatef(-0.2F, -0.41F, 1.8F);
                        GL11.glScaled(0.5F, 0.5F, 0.5F);
                    }
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(-0.118F, -0.535F, 1.9F);
                        GL11.glScaled(0.05F, 0.05F, 0.05F);
                    }
                })

                .withCompatibleAttachment(Attachments.VortexRedux, (player, stack) -> {
                    GL11.glTranslatef(-0.33F, -1.44F, -1.6F);
                    GL11.glScaled(0.52F, 0.52F, 0.52F);
                }, (model) -> {
                    if (model instanceof Holo2) {
                        GL11.glTranslatef(0.395F, -0.33F, -0.1F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.Kobra, (player, stack) -> {
                    GL11.glTranslatef(-0.04F, -1.24F, -1F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withCompatibleAttachment(Attachments.KobraGen3, (player, stack) -> {
                    GL11.glTranslatef(-0.04F, -1.24F, -1F);
                    GL11.glScaled(0.7F, 0.7F, 0.7F);
                }, (model) -> {
                    if (model instanceof Reflex2) {
                        GL11.glTranslatef(-0.125F, -0.45F, -0.85F);
                        GL11.glScaled(0.15F, 0.15F, 0.15F);
                    }
                })
                .withTextureNames("aks74u")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new AKS74U())
                        .withActionPiece(AuxiliaryAttachments.AKSaction)
                        .withActionTransform(new Transform().withPosition(0, 0, 1))
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
                                        .withPosition(-1.225000f, 3.005000f, -2.525000f)
                                        .withRotation(0.000000f, 1.000000f, 6.300000f)
                                        .withRotationPoint(-0.350000f, -2.900000f, -0.100000f)
                                        .withScale(3.0F, 3.0F, 3.0F)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.210000f, 0.465000f, -0.820000f)
                                        .withBBRotation(-7.1415F, -27.3003F, 52.6433F)
                                        .withScale(2.8F, 2.8F, 4.0F)
                                        .withRotationPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.200000f, 0.180000f, 1.960000f)
                                        .withRotation(-5.4027F, -4.7805F, -1.6694F)
                                        .withScale(3, 3, 3.5F)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("aks74u", AuxiliaryAttachments.AKSaction)
                        .setupModernMagazineAnimations("aks74u",
                                Magazines.AKS74UMag)


                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.18f, -0.23f, 0.7f);


                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.NightRaider)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.23f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.ACOG)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.26f, 0.9f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.LeupoldRailScope)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.18f, 0.5f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Specter)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.18f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroReflex)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.22f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.MicroT1)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.25f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AimpointCompM5)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.25f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Reflex)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.2f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.BijiaReflex)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.19f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Holographic)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.26f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.HolographicAlt)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.26f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.EotechHybrid2)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.28f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.VortexRedux)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.28f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.Kobra)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.24f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.KobraGen3)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.24f, 0.7f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.AK15ironsight)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.008f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.OKP7)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(0F, 0.15f, 0f);
                            }

                            // ACOG Zoom
                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.PSO1)) {
                                //System.out.println("Position me for Acog");
                                GL11.glTranslatef(-0.02F, 0.16f, -0.45f);
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
                                            .withRotation(-12.193518f, -4.780500f, 1.399459f)
                                            .withScale(3.5F, 3.5F, 3.5F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                })

                        .build())
                .withSpawnEntityDamage(6f)
                .withSpawnEntityGravityVelocity(0.0118f)

                .build(MWC.modContext);
    }
}

