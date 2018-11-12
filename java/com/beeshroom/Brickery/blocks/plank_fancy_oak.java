package com.beeshroom.Brickery.blocks;

import java.util.List;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.IBlockAccess;
import net.minecraft.world.World;

public class plank_fancy_oak extends BlockBase
{

	public plank_fancy_oak (String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.WOOD);
		setHardness(2.0f);
		setResistance(10.0f);
		setHarvestLevel("axe", 0);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		//setLightLevel(0.0f);	
		
	}
	
	@Override

    public int getFlammability(IBlockAccess world, BlockPos pos, EnumFacing face)

    {

        return 5;

    }


    @Override

    public int getFireSpreadSpeed(IBlockAccess world, BlockPos pos, EnumFacing face)

    {

        return 5;

    }
    
    @Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add("parquet");
    }

}
