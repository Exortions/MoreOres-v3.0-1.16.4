package com.itchs.moreores.core.init;

import com.itchs.moreores.MoreOres;
import com.itchs.moreores.common.blocks.OreBackpackBlock;
import com.itchs.moreores.common.blocks.QuarryBlock;

import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.SoundType;
import net.minecraft.block.material.Material;
import net.minecraft.block.material.MaterialColor;
import net.minecraftforge.common.ToolType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class BlockInit {

	public static final DeferredRegister<Block> BLOCKS = DeferredRegister.create(ForgeRegistries.BLOCKS, MoreOres.MOD_ID);
	
	public static final RegistryObject<Block> RUBY_BLOCK = BLOCKS.register("ruby_block", () -> new Block(AbstractBlock.Properties.create(Material.IRON,MaterialColor.RED).hardnessAndResistance(5.0F, 6.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3).sound(SoundType.METAL).setRequiresTool()));
	public static final RegistryObject<Block> RUBY_ORE = BLOCKS.register("ruby_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK,MaterialColor.RED).setRequiresTool().hardnessAndResistance(3.5F, 3.0F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3)));
	public static final RegistryObject<Block> SAPPHIRE_ORE = BLOCKS.register("sapphire_ore", () -> new Block(AbstractBlock.Properties.create(Material.ROCK, MaterialColor.BLUE).setRequiresTool().hardnessAndResistance(4.0F, 3.5F).sound(SoundType.METAL).harvestTool(ToolType.PICKAXE).harvestLevel(3)));
    public static final RegistryObject<QuarryBlock> QUARRY = BLOCKS.register("quarry", () -> new QuarryBlock(AbstractBlock.Properties.create(Material.ROCK).setRequiresTool().hardnessAndResistance(3.5F)));
    public static final RegistryObject<OreBackpackBlock> ORE_BACKPACK = BLOCKS.register("ore_backpack", () -> new OreBackpackBlock(AbstractBlock.Properties.create(Material.WOOL)));
	
}