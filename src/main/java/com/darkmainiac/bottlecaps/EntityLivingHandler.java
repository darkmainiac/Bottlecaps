package com.darkmainiac.bottlecaps;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.entity.projectile.EntityArrow;
import net.minecraftforge.event.ForgeSubscribe;
import net.minecraftforge.event.entity.living.LivingDeathEvent;
import net.minecraftforge.event.entity.living.LivingEvent.LivingUpdateEvent;

public class EntityLivingHandler {
	
	 @ForgeSubscribe
	    public void onEntityLivingUpdate(LivingUpdateEvent event)
	    {

	    }
	 
	 @ForgeSubscribe
	    public void onEntityLivingDeath(LivingDeathEvent event)
	    {
	        if (event.source.getDamageType().equals("player"))
	        {
	            ItemHelper.dropBottlecap((EntityPlayer) event.source.getSourceOfDamage(), event.entityLiving);
	        }
	        if (event.source.getSourceOfDamage() instanceof EntityArrow)
	        {
	            if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity != null)
	            {
	                if (((EntityArrow) event.source.getSourceOfDamage()).shootingEntity instanceof EntityPlayer)
	                {
	                    ItemHelper.dropBottlecap((EntityPlayer) ((EntityArrow) event.source.getSourceOfDamage()).shootingEntity, event.entityLiving);
	                }
	            }
	        }
	    }

}
