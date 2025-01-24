package net.vturnip.crystalmagicmod.item.custom;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tier;
import net.vturnip.crystalmagicmod.effect.ModEffects;

public class FreezeSwordItem extends SwordItem {
    public FreezeSwordItem(Tier pTier, int pAttackDamageModifier, float pAttackSpeedModifier, Properties pProperties) {
        super(pTier, pAttackDamageModifier, pAttackSpeedModifier, pProperties);
    }

    @Override
    public boolean hurtEnemy(ItemStack pStack, LivingEntity pTarget, LivingEntity pAttacker) {
        pTarget.addEffect(new MobEffectInstance(ModEffects.FREEZE.get(), 200));
        return super.hurtEnemy(pStack, pTarget, pAttacker);
    }
}

