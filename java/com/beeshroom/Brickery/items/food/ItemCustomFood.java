package com.beeshroom.Brickery.items.food;

import com.beeshroom.Brickery.Main;
import com.beeshroom.Brickery.init.ModItems;
import com.beeshroom.Brickery.util.IHasModel;

import net.minecraft.item.Item;
import net.minecraft.item.ItemFood;

public class ItemCustomFood extends ItemFood implements IHasModel 
{
	public ItemCustomFood(String name, int amount, boolean iswolffood)
	{
		super(amount, iswolffood);
		setUnlocalizedName(name);
		setRegistryName(name);
		setCreativeTab(Main.brickstab);
		
		ModItems.ITEMS.add(this);
		
	}
	@Override 
	public void registerModels()
	{
		Main.proxy.registerItemRenderer(this, 0, "inventory");
	}
}
