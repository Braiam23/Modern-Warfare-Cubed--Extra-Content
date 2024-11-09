package com.paneedah.mwc.items.guns;

import com.paneedah.mwc.MWC;
import com.paneedah.mwc.init.MWCItems;
import com.paneedah.mwc.models.*;
import com.paneedah.mwc.proxies.CommonProxy;
import com.paneedah.mwc.weapons.*;
import com.paneedah.weaponlib.*;
import com.paneedah.weaponlib.animation.Transition;
import com.paneedah.weaponlib.animation.Transform;
import com.paneedah.weaponlib.compatibility.RecoilParam;
import com.paneedah.weaponlib.config.BalancePackManager.GunConfigurationGroup;
import com.paneedah.weaponlib.render.shells.ShellParticleSimulator.Shell.Type;
import net.minecraft.item.Item;
import net.minecraft.util.math.Vec3d;
import org.lwjgl.opengl.GL11;

public class M134Factory implements GunFactory {

    public Item createGun(CommonProxy commonProxy) {
        return new Weapon.Builder()

                .withName("m134")
                .withAmmoCapacity(1000)
                .withFireRate(0.9999999f)
                .withRecoil(3f)
                .withZoom(0.0f)
                .withConfigGroup(GunConfigurationGroup.HEAVY)
                .withMaxShots(Integer.MAX_VALUE)
                .withShootSound("m134")
                .withEndOfShootSound("gun_click")
                .withDrawSound("noaction_draw")
                .withReloadingTime(50)
                .withMuzzlePosition(new Vec3d(-0.15600000464916233, -0.5239999917745591, -6.0523999881505966))
                .withCrosshair("gun")
                .withCrosshairRunning("Running")
                .withCrosshairZoomed("Sight")
                .withFlashIntensity(0.6f)
                .withFlashScale(() -> 0.7f)
                .withFlashOffsetX(() -> 0.18f)
                .withFlashOffsetY(() -> 0.2f)
                .withShellCasingForwardOffset(-0.02f)
                .withShellCasingVerticalOffset(-0.05f)
                .withBleedingCoefficient(7f)
                .withCreativeTab(MWC.WEAPONS_TAB)
                .withInaccuracy(2)
                .useNewSystem()
                .withRecoilParam(new RecoilParam(
                        10.0,
                        25.75,
                        50.0,
                        0.4,
                        0.3125,
                        0.01,
                        0.0,
                        1.0
                ))
                .withScreenShaking(RenderableState.SHOOTING,
                        1f,
                        1f,
                        2f)


                .withCompatibleAttachment(AuxiliaryAttachments.M134Barrels, true, (model) -> {
                })
                .withCompatibleBullet(Bullets.Bullet762x51, (model) -> {
                })
                .withTextureNames("m134")
                .withRenderer(new WeaponRenderer.Builder()

                        .withModel(new M134())
                        .withEntityPositioning(itemStack -> {
                            GL11.glScaled(0.4F, 0.4F, 0.4F);
                            GL11.glTranslatef(0, 0f, 3f);
                        })
                        .withInventoryPositioning(itemStack -> {
                            GL11.glScaled(0.35F, 0.35F, 0.35F);
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
                                        .withPosition(-2.95000f, 3.825000f, -3.045000f)
                                        .withRotation(0.000000f, 1.000000f, 21.300000f)
                                        .withRotationPoint(-0.350000f, -0.900000f, 0.700000f)
                                        .withScale(3.0, 3.0, 3.0)
                        )

                        .withFirstPersonHandPositioning(

                                // Left hand
                                new Transform()
                                        .withPosition(1.190000f, -0.170000f, -6.53000f)
                                        .withBBRotation(35.6925, 8.4022, -90.464)
                                        .withScale(2.6, 2.6, 4.0)
                                        .withRotationPoint(0, 0, 0),


                                // Right hand
                                new Transform()
                                        .withPosition(-0.0F, 0.2F, 4f)
                                        .withRotation(5.5675, 14.735, -0.7008)
                                        .withScale(3.5, 3.5, 3.5)
                                        .withRotationPoint(0, 0, 0)

                        )

                        .setupModernAnimations("mp7", AuxiliaryAttachments.M134Barrels)

                        .withFirstPersonPositioningZooming((renderContext) -> {
                            GL11.glTranslatef(0f, 0f, 0f);
                            GL11.glRotatef(0.5F, 1f, 0.5f, 1f);

                            if(Weapon.isActiveAttachment(renderContext.getWeaponInstance(), Attachments.RMR)) {
                                GL11.glTranslatef(0f, 0f, 0f);
                            }

                            else {
                            }

                        })

                        .withFirstPersonPositioningModifying((renderContext) -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glRotatef(-25.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(10.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-15.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-0.725000f, 0.700000f, -0.700000f);
                        })
                        .withFirstPersonPositioningModifyingAlt((renderContext) -> {
                            GL11.glScalef(3.000000f, 3.000000f, 3.000000f);
                            GL11.glRotatef(-10.000000f, 1f, 0f, 0f);
                            GL11.glRotatef(-15.000000f, 0f, 1f, 0f);
                            GL11.glRotatef(-10.000000f, 0f, 0f, 1f);
                            GL11.glTranslatef(-1.800000f, 0.50000f, -0.400000f);
                        })
                        .withFirstPersonHandPositioning(
                                (renderContext) -> {
                                    GL11.glScalef(2f, 2f, 2f);
                                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.400000f, 0.425000f);
                                },
                                (renderContext) -> {
                                    GL11.glScalef(3f, 3f, 3f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.625000f, -1.149999f, 0.325000f);
                                })

                        .withFirstPersonHandPositioningProning(
                                (renderContext) -> {
                                    GL11.glScalef(2f, 2f, 2f);
                                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.400000f, 0.425000f);
                                },
                                (renderContext) -> {
                                    GL11.glScalef(3f, 3f, 3f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.625000f, -1.149999f, 0.325000f);
                                })

                        .withFirstPersonHandPositioningModifying(
                                (renderContext) -> {
                                    GL11.glScalef(2f, 2f, 2f);
                                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.400000f, 0.425000f);
                                },
                                (renderContext) -> {
                                    GL11.glScalef(3f, 3f, 3f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.625000f, -1.149999f, 0.325000f);
                                })
                        .withFirstPersonHandPositioningModifyingAlt(
                                (renderContext) -> {
                                    GL11.glScalef(2f, 2f, 2f);
                                    GL11.glRotatef(-100.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-5.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(45.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(-0.025000f, -0.400000f, 0.425000f);
                                },
                                (renderContext) -> {
                                    GL11.glScalef(3f, 3f, 3f);
                                    GL11.glRotatef(-65.000000f, 1f, 0f, 0f);
                                    GL11.glRotatef(-10.000000f, 0f, 1f, 0f);
                                    GL11.glRotatef(-40.000000f, 0f, 0f, 1f);
                                    GL11.glTranslatef(0.625000f, -1.149999f, 0.325000f);
                                })


                        .build())
                .withSpawnEntityDamage(10f)
                .withSpawnEntityGravityVelocity(0.0118f)


                .build(MWC.modContext);
    }
}
