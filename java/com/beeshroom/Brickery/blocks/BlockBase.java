package com.beeshroom.Brickery.blocks;

import com.beeshroom.Brickery.Main;
import com.beeshroom.Brickery.init.ModBlocks;
import com.beeshroom.Brickery.init.ModItems;
import com.beeshroom.Brickery.util.IHasModel;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;

public class BlockBase extends Block implements IHasModel
{
	public BlockBase(String name, Material material)
	{
		super(material);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.brickstab);
		
		ModBlocks.BLOCKS.add(this);
		ModItems.ITEMS.add(new ItemBlock(this).setRegistryName(this.getRegistryName()));
	}

	@Override
	public void registerModels()
	{

		Main.proxy.registerItemRenderer(Item.getItemFromBlock(this), 0, "inventory");
	}


}
