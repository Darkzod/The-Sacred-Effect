package com.darkzod.thesacredeffect.creativetab;

import com.darkzod.thesacredeffect.init.ModItems;
import com.darkzod.thesacredeffect.reference.Reference;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;

public class CreativeTabTSE
{
    public static final CreativeTabs TSE_TAB = new CreativeTabs(Reference.MOD_ID) {
        @Override
        public Item getTabIconItem() {
            return ModItems.SacredBookOfKnowledge;
        }

        @Override
    public String getTranslatedTabLabel()
        {
            return "The Sacred Effect";
        }
    };
}
