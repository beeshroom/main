package com.beeshroom.Brickery.init;

import java.util.ArrayList;
import java.util.List;

import com.beeshroom.Brickery.blocks.BlockTerracottaBrick;
import com.beeshroom.Brickery.blocks.block_brick_tile;
import com.beeshroom.Brickery.blocks.block_brick_wall;
import com.beeshroom.Brickery.blocks.block_dirty_bricks;
import com.beeshroom.Brickery.blocks.blockcrackedbricks;
import com.beeshroom.Brickery.blocks.blockmixedcobble;
import com.beeshroom.Brickery.blocks.blockmossybricks;
import com.beeshroom.Brickery.blocks.plank_fancy_acacia;
import com.beeshroom.Brickery.blocks.plank_fancy_birch;
import com.beeshroom.Brickery.blocks.plank_fancy_dark_oak;
import com.beeshroom.Brickery.blocks.plank_fancy_jungle;
import com.beeshroom.Brickery.blocks.plank_fancy_oak;
import com.beeshroom.Brickery.blocks.plank_fancy_spruce;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.block.model.ModelBlock;
import net.minecraft.item.EnumDyeColor;

public class ModBlocks 
{

	public static final List<Block> BLOCKS = new ArrayList<Block>();

	public static final Block BLOCKMOSSYBRICKS = new blockmossybricks("blockmossybricks", Material.ROCK);
	public static final Block BLOCKCRACKEDBRICKS = new blockcrackedbricks("blockcrackedbricks", Material.ROCK);
	public static final Block BLOCKMIXEDCOBBLE = new blockmixedcobble("blockmixedcobble", Material.ROCK);
	public static final Block BLOCK_BRICK_TILE = new block_brick_tile("block_brick_tile", Material.ROCK);
	public static final Block BLOCK_DIRTY_BRICKS = new block_dirty_bricks("block_dirty_bricks", Material.ROCK);
	
	
	//brick wall???? plz help
	//public static final Block BLOCK_BRICK_WALL = new ModelBlock ("block_brick_wall");
	
	
	
	//terracotta
	//public static final Block BLOCTERRACOTTABRICK = new BlockTerracottaBrick("BlockTerracottaBrick", Material.ROCK);
	public static Block[] TerracottaBrick = new Block[16];
	{
	for(EnumDyeColor color : EnumDyeColor.values()) {
	    TerracottaBrick[color.getMetadata()] = new BlockTerracottaBrick(color);
	}
	}
	
	
	//wood planks
	public static final Block PLANK_FANCY_OAK = new plank_fancy_oak("plank_fancy_oak", Material.WOOD);
	public static final Block PLANK_FANCY_BIRCH = new plank_fancy_birch("plank_fancy_birch", Material.WOOD);
	public static final Block PLANK_FANCY_SPRUCE = new plank_fancy_spruce("plank_fancy_spruce", Material.WOOD);
	public static final Block PLANK_FANCY_JUNGLE = new plank_fancy_jungle("plank_fancy_jungle", Material.WOOD);
	public static final Block PLANK_FANCY_ACACIA = new plank_fancy_acacia("plank_fancy_acacia", Material.WOOD);
	public static final Block PLANK_FANCY_DARK_OAK = new plank_fancy_dark_oak("plank_fancy_dark_oak", Material.WOOD);
	
	
	
	
	
}