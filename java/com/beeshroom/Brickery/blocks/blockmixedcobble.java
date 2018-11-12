package com.beeshroom.Brickery.blocks;

import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;

public class blockmixedcobble extends BlockBase
{

	public blockmixedcobble (String name, Material material) 
	{
		super(name, material);

		setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(30.0f);
		setHarvestLevel("pickaxe", 0);
		//setLightOpacity(1);
		//setBlockUnbreakable();
		//setLightLevel(0.0f);
		
	
		
		
	}

}
