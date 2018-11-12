package com.beeshroom.Brickery.items.tools;

import java.util.List;

import com.beeshroom.Brickery.Main;
import com.beeshroom.Brickery.init.ModItems;
import com.beeshroom.Brickery.util.IHasModel;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemSword;
import net.minecraft.world.World;

public class ToolSword extends ItemSword implements IHasModel
{


	public ToolSword(String name, ToolMaterial material)
	{
		super(material);
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
	
	@Override
    public void addInformation(ItemStack stack, World worldIn, List<String> tooltip, ITooltipFlag flagIn) 
    {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add("unimplemented");
    }

	
}
