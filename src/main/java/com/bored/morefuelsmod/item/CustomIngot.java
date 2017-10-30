package com.bored.morefuelsmod.item;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CustomIngot extends net.minecraft.item.Item {

    public CustomIngot(String name){
        setUnlocalizedName(name);
        setRegistryName(name);
        setCreativeTab(CreativeTabs.MATERIALS);
    }
}