package com.bored.morefuelsmod;

import java.lang.ref.Reference;
import java.util.logging.Logger;

//import com.bored.morefuelsmod.block.ModBlocks;
//import com.bored.morefuelsmod.client.MoreFuelsTab;
import com.bored.morefuelsmod.proxy.CommonProxy;
import com.bored.morefuelsmod.fuels.*;
import com.bored.morefuelsmod.fuels.modfuels.*;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.ConfigCategory;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.IWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@Mod(modid = Main.modid, name = Main.name, version = Main.version, acceptedMinecraftVersions = "[1.12, 1.12.2]")
public class Main {

	public static final String modid = "morefuelsmod";
	public static final String name = "More Fuels Mod";
	public static final String version = "b001";

	@Mod.Instance(modid)
	public static Main instance;
	
	public static Logger LOGGER = Logger.getLogger(Main.modid);
	
	@SidedProxy(clientSide = "com.bored.morefuelsmod.proxy.ClientProxy", serverSide = "com.bored.morefuelsmod.proxy.CommonProxy")
	public static CommonProxy proxy;
	
	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event){
		LOGGER.info("Starting PreInit...");
		System.out.println(name + " is making smelting oh so much better for you!");
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {
		LOGGER.info("Starting Init...");
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {
		LOGGER.info("Starting PostInit...");
	}

	public static void setCustomModelResourceLocation(Item item, int i, ModelResourceLocation modelResourceLocation) {
		// TODO Auto-generated method stub
		
	}
	
	
	//public static final MoreFuelsTab creativeTab = new MoreFuelsTab();

}