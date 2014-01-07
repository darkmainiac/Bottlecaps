package com.darkmainiac.bottlecaps;

import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.monster.IMob;
import net.minecraft.entity.player.EntityPlayer;

public class ItemHelper {
	private static double rand;
	
	 public static void dropBottlecap(EntityPlayer player, EntityLivingBase entity)
	    {
	        if (entity instanceof IMob)
	        {
	            rand = Math.random();

	            if (rand < 0.15d)
	            {
	                entity.dropItem(Bottlecaps.bottlecap.itemID, 1);
	            }
	            else if (rand < 0.20d)
	            {
	            	entity.dropItem(Bottlecaps.bottlecap.itemID, 3);
	            }
	        }
	    }

}
