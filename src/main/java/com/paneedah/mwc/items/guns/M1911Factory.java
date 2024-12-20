package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.animation.jim.BBLoader;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M1911Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m1911")
                .withFireRate(0.26f)
                .withRecoil(4f)
                .withZoom(0f)
                .withConfigGroup(GunConfigurationGroup.SIDEARM)
                .withShellType(Type.PISTOL)
                .withMuzzlePosition(new Vec3d(-0.15, -0.8, -3.4))
                .withMaxShots(1)
                .withShootSound("colt_m45a1")
                .withSilencedShootSound("colt_m45a1_silenced")
                .withDrawSound("handgun_draw")
                .withReloadingTime(50)
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withFlashIntensity(0.5f)
                .withFlashScale(() -> 0.6f)
                .withFlashOffsetX(() -> 0.13f)
                .withFlashOffsetY(() -> 0.12f)
                .withInaccuracy(3)
                .useNewSystem()
                .withCreativeTab(MWC.WEAPONS_TAB)

                .withRecoilParam(new RecoilParam(
                        80.0,
                        16.5,
                        37.5,
                        0.425,
                        0.2125,
                        0.0,
                        0.0,
                        1.15
                ))
                .withScreenShaking(RenderableState.SHOOTING,
                        3f,
                        0.1f,
                        1f)

                .withUnremovableAttachmentCategories(AttachmentCategory.GUARD)
                .withUnremovableAttachmentCategories(AttachmentCategory.BACKGRIP)
                .withUnremovableAttachmentCategories(AttachmentCategory.FRONTSIGHT)
                .withCompatibleAttachment(Attachments.M1911Body, true, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M45A1CQBPBody, (model) -> {
                })
                .withCompatibleAttachment(Attachments.M1911Slide, true, (model) -> {
                    if (model instanceof makarovrearsight) {
                        GL11.glTranslatef(-0.23F, -1.355F, -0.09F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof M1911frontsight) {
                        GL11.glTranslatef(-0.235F, -1.35F, -2.35F);
                        GL11.glScaled(0.25F, 0.25F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Attachments.M45A1CQBPSlide, (model) -> {
                    if (model instanceof M1911rearsight) {
                        GL11.glTranslatef(-0.235F, -1.33F, -0.0F);
                        GL11.glScaled(0.3F, 0.3F, 0.3F);
                    } else if (model instanceof M1911frontsight) {
                        GL11.glTranslatef(-0.24F, -1.335F, -2.35F);
                        GL11.glScaled(0.25F, 0.25F, 0.25F);
                    }
                })
                .withCompatibleAttachment(Magazines.M1911Mag, (model) -> {
                })
                .withCompatibleAttachment(Magazines.M1911Mag15, (model) -> {
                })
                .withCompatibleAttachment(Attachments.Silencer45ACP, (model) -> {
                    GL11.glTranslatef(-0.31F, -1.3F, -5.1F);
                    GL11.glScaled(1.5F, 1.5F, 1.5F);
                })
                .withCompatibleAttachment(Attachments.Laser, (p, s) -> {
                    GL11.glTranslatef(-0.045F, -0.75F, -2.2F);
                    GL11.glScaled(1.2F, 1.2F, 1.2F);
                    GL11.glRotatef(-90F, 0f, 0f, -4f);
                })

                .withTextureNames("m1911")
                .withRenderer(new WeaponRenderer.Builder()
                        .withModel(new Glock18C())
                        .withActionPiece(
                                Attachments.M1911Slide,
                                Attachments.M45A1CQBPSlide)
                        .withActionTransform(new Transform().withPosition(0, 0, 0.65F))
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
                            GL11.glTranslatef(0, 0.7f, 0);
                            GL11.glRotatef(-120F, -0.5f, 7f, 3f);
                        })
                        .withThirdPersonPositioning((renderContext) -> {
                            GL11.glScaled(0.45F, 0.45F, 0.45F);
                            GL11.glTranslatef(-1.8F, -1F, 2F);
                            GL11.glRotatef(-45F, 0f, 1f, 0f);
                            GL11.glRotatef(70F, 1f, 0f, 0f);
                        })

                        .withFirstPersonPositioning(
                                new Transform()
                                        .withPosition(-0.845000f, 4.065000f, -7.845000f)
                                        .withRotation(0.00f, 1.00f, 10.681469f)
                                        .withRotationPoint(-0.12000000357627871F, -0.36000001072883614F, 0.040000001192092904F)
                                        .withScale(2.6F, 2.6F, 2.6F)
                        )

                        .withFirstPersonHandPositioning(

                                new Transform()
                                        .withPosition(1.370000f, 0.925000f, 2.020000f)
                                        .withBBRotation(-12.9672F, -29.0825F, 67.8433F)
                                        .withScale(3, 3, 4)
                                        .withRotationPoint(0, 0, 0),


                                new Transform()
                                        .withPosition(-0.420000f, 0.360000f, 2.040000f)
                                        .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                        .withScale(3.5F, 3.5F, 4F)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("glock", Attachments.M1911Slide)
                        .setupModernMagazineAnimations("glock",
                                Magazines.M1911Mag,
                                Magazines.M1911Mag15)
                        .setupCustomKeyedPart(Attachments.M45A1CQBPSlide, "glock", BBLoader.KEY_ACTION)

                        .withFirstPersonCustomPositioning(Attachments.M1911Slide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.6F);
                            }
                        })
                        .withFirstPersonCustomPositioning(Attachments.M45A1CQBPSlide.getRenderablePart(), (renderContext) -> {
                            if (renderContext.getWeaponInstance().getAmmo() == 0) {
                                GL11.glTranslatef(0F, 0F, 0.6F);
                            }
                        })

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0.239F, -0.235F, -1.9F);

                            if (Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.M45A1CQBPSlide))
                                GL11.glTranslatef(0.01f, 0.01f, 0f);
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
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(2.770000f, 1.225000f, 0.140000f)
                                            .withRotation(73.670132f, -70.659155f, 41.991085f)
                                            .withScale(2.6F, 2.6F, 4.0F)
                                            .withRotationPoint(0.000000f, 0.000000f, 0.000000f)
                                            .doGLDirect();
                                },
                                (renderContext) -> {
                                    new Transform()
                                            .withPosition(-0.320000f, 0.140000f, 2.040000f)
                                            .withBBRotation(10.0931F, 10.9576F, -10.0294F)
                                            .withScale(3, 3, 3.5F)
                                            .withRotationPoint(0, 0, 0)
                                            .doGLDirect();
                                })

                        .build())
                .withSpawnEntityDamage(5f)
                .withSpawnEntityGravityVelocity(0.02f)


                .build(MWC.modContext);
    }
}
