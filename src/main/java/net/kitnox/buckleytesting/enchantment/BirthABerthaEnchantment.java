package net.kitnox.buckleytesting.enchantment;

import net.kitnox.buckleytesting.entity.MobEntities;
import net.minecraft.core.BlockPos;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.item.enchantment.Enchantment;
import net.minecraft.world.item.enchantment.EnchantmentCategory;

public class BirthABerthaEnchantment extends Enchantment {
    protected BirthABerthaEnchantment(Rarity pRarity, EnchantmentCategory pCategory, EquipmentSlot... pApplicableSlots) {
        super(pRarity, pCategory, pApplicableSlots);
    }

    @Override
    public void doPostAttack(LivingEntity pAttacker, Entity pTarget, int pLevel) {
        if(!pAttacker.level().isClientSide()){
            ServerLevel level = ((ServerLevel) pAttacker.level());
            BlockPos position = pTarget.blockPosition();

            if(pLevel == 1){
                if(Math.random() >= 0.9){
                    MobEntities.BIGBERTHA.get().spawn(level, (ItemStack) null, null, position,
                            MobSpawnType.BREEDING, true, true);
                }
            }
            if(pLevel == 2){
                if(Math.random() >= 0.8){
                    MobEntities.BIGBERTHA.get().spawn(level, (ItemStack) null, null, position,
                            MobSpawnType.BREEDING, true, true);
                }
            }
            if(pLevel == 3){
                if(Math.random() >= 0.7){
                    MobEntities.BIGBERTHA.get().spawn(level, (ItemStack) null, null, position,
                            MobSpawnType.BREEDING, true, true);
                }
            }
        }
        super.doPostAttack(pAttacker, pTarget, pLevel);
    }

    @Override
    public int getMaxLevel() {
        return 3;
    }
}
