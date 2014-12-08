package com.darkzod.thesacredeffect.block;


import com.darkzod.thesacredeffect.creativetab.CreativeTabTSE;
import com.darkzod.thesacredeffect.reference.Reference;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockTSE extends Block
{
    ////Block breaking material setting///////////////////////////////////////////////
    public BlockTSE(Material material)
    {
        super(material);
        this.setCreativeTab(CreativeTabTSE.TSE_TAB);
    }
    public BlockTSE()
    {
        this(Material.rock);
    }


    /////Setting name of block/////////////////////////////////////////////////////////
    @Override
    public String getUnlocalizedName()
    {
        return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName()));
    }



    @Override
    @SideOnly(Side.CLIENT)
    public void registerBlockIcons(IIconRegister iconRegister)
    {
        blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
    }









    protected String getUnwrappedUnlocalizedName(String unlocalizedName)

    {
        return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
    }


}
