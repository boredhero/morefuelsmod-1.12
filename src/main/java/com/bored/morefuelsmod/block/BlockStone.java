package com.bored.morefuelsmod.block;

import com.bored.morefuelsmod.MoreFuelsMod;
import com.bored.morefuelsmod.item.ItemBase;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;

public class BlockStone extends BlockBase {
	
	public BlockStone(String name){
		super(Material.ROCK, name);
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockStone setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
}