package com.bored.morefuelsmod.item;

import java.util.ArrayList;

import javax.naming.Reference;

import com.bored.morefuelsmod.Main;

import net.minecraft.block.Block;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.event.RegistryEvent.Register;

public class ItemInit {

	public static Item tutorial_ingot;
    public static ArrayList<Item> itemList = new ArrayList<>();

    public static void prepareItems(){
        Main.LOGGER.info("Item Preparation starts now");

        tutorial_ingot = new CustomIngot("tutorial_ingot");

        itemList.add(tutorial_ingot);
    }
    public static void addItemBlockToItems(Block block){
        ItemBlock itemblock = new ItemBlock(block);
        itemblock.setRegistryName(block.getRegistryName());
        itemList.add(itemblock);
    }


    public static void registerItems(RegistryEvent.Register<Item> event){
        Main.LOGGER.info("Item Registration starts now");
        for(Item item : itemList){
            Main.LOGGER.info("Going to register: " + item.getUnlocalizedName() +"...");
            event.getRegistry().register(item);
            Main.LOGGER.info("\t\tSet ModelResourceLocation to " + Main.modid + ":" + item.getUnlocalizedName().substring(5));
            Main.setCustomModelResourceLocation(
                    item,
                    0,
                    new ModelResourceLocation(Main.modid + ":" + item.getUnlocalizedName().substring(5))
            );
           Main.LOGGER.info("Done registering: " + item.getUnlocalizedName() +"...");
        }
        Main.LOGGER.info("Done Item registration...");
    }
}
