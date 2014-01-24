package com.darkmainiac.bottlecaps;

import net.minecraft.item.Item;
import net.minecraftforge.common.MinecraftForge;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.network.NetworkMod;
import cpw.mods.fml.common.registry.LanguageRegistry;

@NetworkMod(clientSideRequired = true, serverSideRequired = false)
@Mod(modid = "bottlecaps", name = "Bottlecaps", version = "0.1")
public class Bottlecaps {
	static Item bottlecap;

	@Instance("Bottlecaps")
	public static Bottlecaps instance;
	
	@EventHandler
	public void load(FMLInitializationEvent event)
	{
		bottlecap = new ItemBottlcap(13333).setUnlocalizedName("bottlecap");
		LanguageRegistry.instance().addName(bottlecap, "Bottlecap");
		MinecraftForge.EVENT_BUS.register(new EntityLivingHandler());
	}
	
}
