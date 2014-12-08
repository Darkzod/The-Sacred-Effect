package com.darkzod.thesacredeffect;

import com.darkzod.thesacredeffect.handler.ConfigurationHandler;
import com.darkzod.thesacredeffect.init.ModBlocks;
import com.darkzod.thesacredeffect.init.ModItems;
import com.darkzod.thesacredeffect.proxy.IProxy;
import com.darkzod.thesacredeffect.reference.Reference;
import com.darkzod.thesacredeffect.utility.LogHelper;
import cpw.mods.fml.common.FMLCommonHandler;
import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = Reference.MOD_ID, name = Reference.MOD_NAME, version = Reference.MOD_VERSION, guiFactory = Reference.GUI_FACTORY_CLASS)
public class TheSacredEffect {





//////Proxy////////////////////////////////////////////////////////////////////////
@SidedProxy(clientSide = Reference.CLIENT_PROXY_CLASS, serverSide = Reference.SERVER_PROXY_CLASS)
public static IProxy proxy1;







//////Mod Instance//////////////////////////////////////////////////////////////////
@Mod.Instance(Reference.MOD_ID)
public static TheSacredEffect instance;









    /////Initializations///////////////////////////////////////////////////////////////////////
    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event)
    {
        ConfigurationHandler.init(event.getSuggestedConfigurationFile());
        FMLCommonHandler.instance().bus().register(new ConfigurationHandler());

        /////////items/////////////////////
        ModItems.init();
        ModBlocks.init();

    }

    @Mod.EventHandler
    public void Init(FMLInitializationEvent event)
    {

    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event)
    {

    }


}
