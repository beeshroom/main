package com.beeshroom.Brickery.items;

import com.beeshroom.Brickery.Main;
import com.beeshroom.Brickery.init.ModItems;
import com.beeshroom.Brickery.util.IHasModel;

import net.minecraft.item.Item;

public class ItemBase extends Item implements IHasModel {

	public ItemBase(String name)
	{
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.brickstab);
		
		ModItems.ITEMS.add(this);
		
	}
	
	@Override
	public void registerModels() 
	{
	Main.proxy.registerItemRenderer(this,0,"inventory");
		
	}

}
