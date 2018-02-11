package com.bored.morefuelsmod.item;

import com.bored.morefuelsmod.MoreFuelsMod;

import net.minecraft.item.Item;
import net.minecraft.creativetab.CreativeTabs;

public class ItemBase extends Item {
	protected String name;
	
	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(){
		MoreFuelsMod.proxy.registerItemRenderer(this, 0, name);
	}
	@Override
	public ItemBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
			return this;
	}
}
