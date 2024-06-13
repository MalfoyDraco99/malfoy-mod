package net.malfoy.malfoymod.item;

import net.fabricmc.yarn.constants.MiningLevels;
import net.minecraft.item.ToolMaterial;
import net.minecraft.recipe.Ingredient;

import java.util.function.Supplier;

public enum ModToolMaterial implements ToolMaterial {
    RUBY(5,650,4.5f,3.5f,26,() -> Ingredient.ofItems(ModItems.RUBY)),
    URANIUM(5,3021,14.0f,4,15,() -> Ingredient.ofItems(ModItems.URANIUM_INGOT))
    ;

    private final int miningLevel;
    private final int ItemDurability;
    private final float MiningSpeed;
    private final float attackDamage;
    private final int enchantability;
    private final Supplier<Ingredient> reparingIngredient;

    ModToolMaterial(int miningLevel, int itemDurability, float miningSpeed, float attckDamage, int enchantability, Supplier<Ingredient> reparingIngredient) {
        this.miningLevel = miningLevel;
        this.ItemDurability = itemDurability;
        this.MiningSpeed = miningSpeed;
        this.attackDamage = attckDamage;
        this.enchantability = enchantability;
        this.reparingIngredient = reparingIngredient;
    }

    @Override
    public int getDurability() {
        return this.ItemDurability;
    }

    @Override
    public float getMiningSpeedMultiplier() {
        return this.MiningSpeed;
    }

    @Override
    public float getAttackDamage() {
        return this.attackDamage;
    }

    @Override
    public int getMiningLevel() {
        return this.miningLevel;
    }

    @Override
    public int getEnchantability() {
        return this.enchantability;
    }

    @Override
    public Ingredient getRepairIngredient() {
        return this.reparingIngredient.get();
    }
}
