package com.bored.morefuelsmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.event.RegistryEvent;

/**
 * Created by Seine Eiligkeit on 27.06.2017.
 */
public final class ModItems extends Item {

    public static Item tutorialItem;

    public static final void init(){
        tutorialItem = new Item();

        tutorialItem.setUnlocalizedName("tutorialItem");
        tutorialItem.setRegistryName("tutorialItem");
        tutorialItem.setCreativeTab(CreativeTabs.MISC);

    }
}