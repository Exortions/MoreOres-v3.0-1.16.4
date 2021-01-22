package com.itchs.moreores.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.effect.LightningBoltEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.StringTextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

public class LightningRod extends Item{

	public LightningRod(Properties properties) {
		super(properties);
	}
	
	@Override
	@OnlyIn(Dist.CLIENT)
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new StringTextComponent(""));
			tooltip.add(new StringTextComponent("\u00A78Lightning Rod:"));
			tooltip.add(new StringTextComponent("\u00A77When right clicked, summon lightning"));
			tooltip.add(new StringTextComponent("\u00A77in direction player is looking."));
			tooltip.add(new StringTextComponent(""));
			tooltip.add(new StringTextComponent("\u00A77(5 Second Cooldown)"));
		} else {
			tooltip.add(new TranslationTextComponent("moreores.other.information.hold_shift"));
		}
		
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldownTracker().hasCooldown(this)) { 
			LightningBoltEntity entity0 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity1 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity2 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity3 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity4 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity5 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity6 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity7 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			LightningBoltEntity entity8 = new LightningBoltEntity(EntityType.LIGHTNING_BOLT, worldIn);
			BlockPos position = playerIn.getPosition().offset(playerIn.getHorizontalFacing(), 5);
			entity0.setPosition(position.getX(), position.getY(), position.getZ());
			entity1.setPosition(position.getX(), position.getY(), position.getZ());
			entity2.setPosition(position.getX(), position.getY(), position.getZ());
			entity3.setPosition(position.getX() + 3, position.getY(), position.getZ());
			entity4.setPosition(position.getX(), position.getY(), position.getZ() + 3);
			entity5.setPosition(position.getX() + -3, position.getY(), position.getZ());
			entity6.setPosition(position.getX(), position.getY(), position.getZ() + -3);
			entity7.setPosition(position.getX(), position.getY() + 2, position.getZ());
			entity8.setPosition(position.getX(), position.getY() + -2, position.getZ());
			worldIn.addEntity(entity0);
			worldIn.addEntity(entity1);
			worldIn.addEntity(entity2);
			worldIn.addEntity(entity3);
			worldIn.addEntity(entity4);
			worldIn.addEntity(entity5);
			worldIn.addEntity(entity6);
			worldIn.addEntity(entity7);
			worldIn.addEntity(entity8);
			playerIn.getCooldownTracker().setCooldown(this, 100);
			return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
	}
	
}