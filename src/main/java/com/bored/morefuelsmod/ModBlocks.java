package com.bored.morefuelsmod;

import com.bored.morefuelsmod.blocks.*;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModBlocks {

    @GameRegistry.ObjectHolder("morefuelsmod:firstblock")
    public static FirstBlock firstBlock;

    @GameRegistry.ObjectHolder("morefuelsmod:simpletexturedblock")
    public static SimpleTexturedBlock simpleTexturedBlock;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleTexturedBlock.initModel();
    }

    @SideOnly(Side.CLIENT)
    public static void initItemModels() {
    }
}