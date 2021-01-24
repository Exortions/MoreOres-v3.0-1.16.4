package com.itchs.moreores.core.init;

import com.itchs.moreores.MoreOres;
import com.itchs.moreores.common.tileentity.OreBackpackTileEntity;
import com.itchs.moreores.common.tileentity.QuarryTileEntity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModTileEntityTypes {

	public static final DeferredRegister<TileEntityType<?>> TILE_ENTITY_TYPES = DeferredRegister.create(ForgeRegistries.TILE_ENTITIES, MoreOres.MOD_ID);
	
	public static final RegistryObject<TileEntityType<QuarryTileEntity>> QUARRY = TILE_ENTITY_TYPES.register("quarry", () -> TileEntityType.Builder.create(QuarryTileEntity::new, BlockInit.QUARRY.get()).build(null));
	public static final RegistryObject<TileEntityType<OreBackpackTileEntity>> ORE_BACKPACK = TILE_ENTITY_TYPES.register("ore_backpack", () -> TileEntityType.Builder.create(OreBackpackTileEntity::new, BlockInit.ORE_BACKPACK.get()).build(null));
	
}