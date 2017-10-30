package com.bored.morefuelsmod;

import com.bored.morefuelsmod.items.FirstItem;
import com.bored.morefuelsmod.items.MultiModelItem;
import com.bored.morefuelsmod.items.SimpleTexturedItem;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class ModItems {

    @GameRegistry.ObjectHolder("morefuelsmod:firstitem")
    public static FirstItem firstItem;

    @GameRegistry.ObjectHolder("morefuelsmod:simpletextureditem")
    public static SimpleTexturedItem simpleTexturedItem;

    @GameRegistry.ObjectHolder("morefuelsmod:multimodelitem")
    public static MultiModelItem multiModelItem;

    @SideOnly(Side.CLIENT)
    public static void initModels() {
        simpleTexturedItem.initModel();
        multiModelItem.initModel();
    }

}