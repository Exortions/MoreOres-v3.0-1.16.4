package com.itchs.moreores.core.init;

import com.itchs.moreores.MoreOres;
import com.itchs.moreores.common.containers.OreBackpackContainer;

import net.minecraft.inventory.container.ContainerType;
import net.minecraftforge.common.extensions.IForgeContainerType;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModContainerTypes {

	public static final DeferredRegister<ContainerType<?>> CONTAINER_TYPES = DeferredRegister.create(ForgeRegistries.CONTAINERS, MoreOres.MOD_ID);
	
	public static final RegistryObject<ContainerType<OreBackpackContainer>> ORE_BACKPACK = CONTAINER_TYPES
			.register("ore_backpack", ()-> IForgeContainerType.create(OreBackpackContainer::new));
}