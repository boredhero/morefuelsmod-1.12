package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockWood extends BlockBase {
	
	public BlockWood(String name){
		super(Material.WOOD, name);
		setHardness(2f);
		setResistance(3f);
	}
	
	@Override
	public BlockWood setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
}