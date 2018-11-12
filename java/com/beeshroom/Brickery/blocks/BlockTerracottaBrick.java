package com.beeshroom.Brickery.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.EnumDyeColor;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.common.registry.ForgeRegistries;

public class BlockTerracottaBrick extends Block {

    public BlockTerracottaBrick(EnumDyeColor color) {
        super(Material.ROCK);
        setSoundType(SoundType.STONE);
		setHardness(2.0f);
		setResistance(21.0f);
		setHarvestLevel("pickaxe", 0);
        register(String.format("%s_terracotta_brick", color.getName()));
    }

    public Block register(String name) {
        setUnlocalizedName(name);
        setRegistryName("modid", name);
        ForgeRegistries.BLOCKS.register(this);
        ForgeRegistries.ITEMS.register(new ItemBlock(this).setRegistryName("modid", name));
        ModelLoader.setCustomModelResourceLocation(Item.getItemFromBlock(this), 0, new ModelResourceLocation(name, "inventory"));
        return this;
    }

}