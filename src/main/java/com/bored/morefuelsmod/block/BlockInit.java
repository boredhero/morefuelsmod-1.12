package com.bored.morefuelsmod.block;

import java.util.ArrayList;

import com.bored.morefuelsmod.Main;
import com.bored.morefuelsmod.item.ItemInit;

import net.minecraft.block.Block;
import net.minecraftforge.event.RegistryEvent;

public class BlockInit {
	public static Block tutorial_ore;
    public static ArrayList<Block> blockList = new ArrayList<>();

    public static void prepareBlocks(){
        Main.LOGGER.info("Block Preparation starts now");

        tutorial_ore = new CustomOre("tutorial_ore",2.0F,4.0F,2);

        ItemInit.addItemBlockToItems(tutorial_ore);

        blockList.add(tutorial_ore);
    }

    public static void registerBlocks(RegistryEvent.Register<Block> event){
        Main.LOGGER.info("Block Registration starts now");
        for(Block block : blockList){
            Main.LOGGER.info("Going to register: " + block.getUnlocalizedName() +"...");
            event.getRegistry().register(block);

        }
        Main.LOGGER.info("Done Item registration...");
    }

}
