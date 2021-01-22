package com.itchs.moreores;

import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.eventbus.api.EventPriority;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.event.lifecycle.FMLCommonSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.itchs.moreores.core.init.BlockInit;
import com.itchs.moreores.core.init.ItemInit;
import com.itchs.moreores.world.OreGeneration;

@Mod(MoreOres.MOD_ID)
public class MoreOres
{
    public static final Logger LOGGER = LogManager.getLogger();
    public static final String MOD_ID = "moreores";
    public static final ItemGroup MOREORES_GROUP = new MoreOresGroup("moreorestab");

    public MoreOres() {
    	IEventBus bus = FMLJavaModLoadingContext.get().getModEventBus();
        bus.addListener(this::setup);
        
        ItemInit.ITEMS.register(bus);
        BlockInit.BLOCKS.register(bus);
        
        MinecraftForge.EVENT_BUS.addListener(EventPriority.HIGH, OreGeneration::generateOres);

        MinecraftForge.EVENT_BUS.register(this);
    }

    private void setup(final FMLCommonSetupEvent event) {
    	
    }
    
    public static class MoreOresGroup extends ItemGroup {

		public MoreOresGroup(String label) {
			super(label);
		}

		@Override
		public ItemStack createIcon() {
			return ItemInit.RUBY_BLOCK.get().getDefaultInstance();
		}
		
    }
}