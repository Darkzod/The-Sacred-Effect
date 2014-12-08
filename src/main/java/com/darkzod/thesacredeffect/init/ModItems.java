package com.darkzod.thesacredeffect.init;


import com.darkzod.thesacredeffect.item.ItemBladeOfSorrow;

import com.darkzod.thesacredeffect.item.ItemSacredBookOfKnowledge;
import com.darkzod.thesacredeffect.item.ItemTSE;
import com.darkzod.thesacredeffect.reference.Reference;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

@GameRegistry.ObjectHolder(Reference.MOD_ID)
public class ModItems
{
    public static final ItemTSE BladeOfSorrow = new ItemBladeOfSorrow();
    public static final ItemTSE SacredBookOfKnowledge = new ItemSacredBookOfKnowledge();



    public static void init()
    {
        GameRegistry.registerItem(BladeOfSorrow, "BladeOfSorrow");
        GameRegistry.registerItem(SacredBookOfKnowledge, "SacredBookOfKnowledge");

    }

}
