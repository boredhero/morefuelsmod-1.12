package com.bored.morefuelsmod;

import com.bored.morefuelsmod.block.BlockInit;
import com.bored.morefuelsmod.item.ItemInit;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

public class RegisterUtil {
	 @SubscribeEvent
	    public static void registerBlocks(RegistryEvent.Register<Block> event){

	        BlockInit.prepareBlocks();
	        BlockInit.registerBlocks(event);
	    }
	    @SubscribeEvent
	    public static void registerItems(RegistryEvent.Register<Item> event){
	        ItemInit.prepareItems();
	        ItemInit.registerItems(event);
	    }
}
