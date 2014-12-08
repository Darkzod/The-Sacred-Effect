package com.darkzod.thesacredeffect.block;


import net.minecraft.block.material.Material;

import java.util.Random;

public class BlockSacredGlass extends BlockTSE
{
    public BlockSacredGlass()
    {
        super(Material.grass);
        this.setBlockName("SacredGlass");
        this.setBlockTextureName("SacredGlass");
        this.setHardness(0.3F);
        this.setStepSound(soundTypeGlass);
        this.setResistance(1.0F);




    }

    public boolean isOpaqueCube()
    {
        return false;
    }
    public boolean renderAsNormalBlock()
    {
        return true;
    }
    public int getRenderType()
    {
        return 0;
    }
    public int getRenderBlockPass()
    {
        return 1;
    }
    protected boolean canSilkHarvest()
    {
        return true;
    }



}
