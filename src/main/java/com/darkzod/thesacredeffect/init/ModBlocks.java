package com.darkzod.thesacredeffect.init;

import com.darkzod.thesacredeffect.block.BlockNitorium;
import com.darkzod.thesacredeffect.block.BlockSacredGlass;
import com.darkzod.thesacredeffect.block.BlockTSE;
import com.darkzod.thesacredeffect.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;


@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModBlocks
{
    public static final BlockTSE Nitorium = new BlockNitorium();
    public static final BlockTSE SacredGlass = new BlockSacredGlass();


    public static void init()
    {
        GameRegistry.registerBlock(Nitorium, "Nitorium");
        GameRegistry.registerBlock(SacredGlass, "SacredGlass");
    }
}
