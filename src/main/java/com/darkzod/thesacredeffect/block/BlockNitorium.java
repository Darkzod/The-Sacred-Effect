package com.darkzod.thesacredeffect.block;



public class BlockNitorium extends BlockTSE {
    public BlockNitorium()
    {
        super();
        this.setBlockName("Nitorium");
        this.setBlockTextureName("Nitorium");

        this.setStepSound(soundTypePiston);
        this.setResistance(10.0F);           //explosions
        this.setHardness(2.0F);             //how long it takes to break
        this.setLightLevel(0.9F);          //how much light it gives off
        this.setLightOpacity(16);         //how much light it lets through 0 is all 16 is none
        this.setHarvestLevel("pickaxe", 0);




    }
}
