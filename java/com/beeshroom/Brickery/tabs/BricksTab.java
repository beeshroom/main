package com.beeshroom.Brickery.tabs;

import com.beeshroom.Brickery.init.ModBlocks;
import com.beeshroom.Brickery.init.ModItems;
import com.beeshroom.Brickery.items.ItemBase;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class BricksTab extends CreativeTabs
{
	public BricksTab(String label) {super("brickstab");}
	public ItemStack getTabIconItem() { return new ItemStack(ModBlocks.BLOCKMOSSYBRICKS);}

	}

	
