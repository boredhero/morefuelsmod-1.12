package com.bored.morefuelsmod.block;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import com.bored.morefuelsmod.MoreFuelsMod;

public class BlockBase extends Block {
	
	protected String name;
	
	public BlockBase(Material material, String name) {
		super(material);
		
		this.name = name;
		
		setUnlocalizedName(name);
		setRegistryName(name);
	}
	
	public void registerItemModel(Item item) {
		MoreFuelsMod.proxy.registerItemRenderer(item, 0, name);
	}
	
	public Item createItemBlock() {
		return new ItemBlock(this).setRegistryName(getRegistryName());
	}
	
	@Override
	public BlockBase setCreativeTab(CreativeTabs tab) {
		super.setCreativeTab(MoreFuelsMod.creativeTab);
		return this;
	}
}