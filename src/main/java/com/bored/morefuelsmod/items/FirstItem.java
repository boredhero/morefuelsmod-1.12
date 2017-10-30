package com.bored.morefuelsmod.items;

import com.bored.morefuelsmod.Main;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;

public class FirstItem extends Item {

    public FirstItem() {
        setRegistryName("firstitem");        // The unique name (within your mod) that identifies this item
        setUnlocalizedName(Main.MODID + ".firstitem");     // Used for localization (en_US.lang)
    }

}