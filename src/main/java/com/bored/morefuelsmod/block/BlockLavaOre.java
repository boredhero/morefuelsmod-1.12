package com.bored.morefuelsmod.block;

import java.util.Random;

import com.bored.morefuelsmod.MoreFuelsMod;
import com.bored.morefuelsmod.item.ItemBase;
import com.bored.morefuelsmod.item.ModItems;

import net.minecraft.block.material.Material;
import net.minecraft.block.state.IBlockState;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class BlockLavaOre extends BlockBase {
	
	public BlockLavaOre(String name){
		super(Material.ROCK, name);
		
		setHardness(3f);
		setResistance(5f);
	}
	
	@Override
	public BlockLavaOre setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
	
	public Item getItemDropped(IBlockState state, Random rand, int fortune){
		return ModItems.lavaCrystals;
}
}
