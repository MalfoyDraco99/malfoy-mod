package net.malfoy.malfoymod.item;

import net.minecraft.entity.effect.StatusEffectInstance;
import net.minecraft.entity.effect.StatusEffects;
import net.minecraft.item.FoodComponent;

public class ModFoodComponents {
    public static final FoodComponent RUBY_BURGER = new FoodComponent.Builder().hunger(10).saturationModifier(0.25f).statusEffect(new StatusEffectInstance(StatusEffects.ABSORPTION, 2400,5),1f).build();
    public static final FoodComponent ASBESTOS_BURGER = new FoodComponent.Builder().hunger(0).saturationModifier(0f).statusEffect(new StatusEffectInstance(StatusEffects.INSTANT_DAMAGE, 1,55),1f).build();
}
