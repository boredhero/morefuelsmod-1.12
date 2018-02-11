package com.bored.morefuelsmod.fuels;

import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.IFuelHandler;

public class Leaves implements IFuelHandler {

	@Override
	public int getBurnTime(ItemStack fuel){
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.LEAVES)){
			return 300;
		}
		if(fuel.getItem() == Item.getItemFromBlock(Blocks.LEAVES2)){
			return 300;
		}
		return 0;
	}
}