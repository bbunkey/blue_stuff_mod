package net.alan.alansmod.item;

import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;

public class ModFoods {
    public static final FoodProperties BLUESTUFF = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(10f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600,5), 0.1f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.HARM, 20,1000), 0.05f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 1200,1), 0.25f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200,1), 0.1f)
            .saturationMod(5f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 2400,1), 0.5f)
            .saturationMod(10f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600,1), 0.05f)
            .saturationMod(15f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400,3), 0.05f)
            .alwaysEat()
            .build();

    public static final FoodProperties CBS = new FoodProperties.Builder().nutrition(2).fast()
            .saturationMod(10f).effect(() -> new MobEffectInstance(MobEffects.DAMAGE_BOOST, 600,5), 0.75f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.HARM, 20,1000), 0.05f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.WEAKNESS, 1200,1), 0.25f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.BLINDNESS, 1200,1), 0.25f)
            .saturationMod(5f).effect(() -> new MobEffectInstance(MobEffects.CONFUSION, 2400,1), 0.5f)
            .saturationMod(10f).effect(() -> new MobEffectInstance(MobEffects.NIGHT_VISION, 600,1), 0.05f)
            .saturationMod(15f).effect(() -> new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 400,3), 0.5f)
            .saturationMod(0f).effect(() -> new MobEffectInstance(MobEffects.POISON, 400,3), 0.5f)
            .alwaysEat()
            .build();
}
