package com.bored.morefuelsmod.blocks;

import com.bored.morefuelsmod.Main;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstBlock extends Block {

    public FirstBlock() {
        super(Material.ROCK);
        setUnlocalizedName(Main.MODID + ".firstblock");
        setRegistryName("firstblock");
    }
}