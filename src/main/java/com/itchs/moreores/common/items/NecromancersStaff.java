package com.itchs.moreores.common.items;

import java.util.List;

import org.lwjgl.glfw.GLFW;

import net.minecraft.client.Minecraft;
import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.client.util.InputMappings;
import net.minecraft.entity.EntityType;
import net.minecraft.entity.monster.ZombieEntity;
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

public class NecromancersStaff extends Item {

	public NecromancersStaff(Properties properties) {
		super(properties);
	}

	@Override
	public void addInformation(ItemStack stack, World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
		super.addInformation(stack, worldIn, tooltip, flagIn);
		if (InputMappings.isKeyDown(Minecraft.getInstance().getMainWindow().getHandle(), GLFW.GLFW_KEY_LEFT_SHIFT)) {
			tooltip.add(new StringTextComponent(""));
			tooltip.add(new StringTextComponent("\u00A78Necromancer's Staff:"));
			tooltip.add(new StringTextComponent("\u00A77When right clicked, summon"));
			tooltip.add(new StringTextComponent("\u00A77a squad of zombies infront"));
			tooltip.add(new StringTextComponent("\u00A77of the player."));
			tooltip.add(new StringTextComponent(""));
			tooltip.add(new StringTextComponent("\u00A77(2 Second Cooldown)"));
		} else {
			tooltip.add(new TranslationTextComponent("moreores.other.information.hold_shift"));
		}
	}
	
	@Override
	public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
		if(!playerIn.getCooldownTracker().hasCooldown(this)) {
			ZombieEntity entity0 = new ZombieEntity(EntityType.ZOMBIE, worldIn);
			ZombieEntity entity1 = new ZombieEntity(EntityType.ZOMBIE, worldIn);
			ZombieEntity entity2 = new ZombieEntity(EntityType.ZOMBIE, worldIn);
			BlockPos position = playerIn.getPosition().offset(playerIn.getHorizontalFacing(), 5);
			entity0.setPosition(position.getX(), position.getY(), position.getZ());
			entity1.setPosition(position.getX(), position.getY(), position.getZ() + 1);
			entity2.setPosition(position.getX(), position.getY(), position.getZ() + -1);
			worldIn.addEntity(entity0);
			worldIn.addEntity(entity1);
			worldIn.addEntity(entity2);
			playerIn.getCooldownTracker().setCooldown(this, 40);
			return ActionResult.resultSuccess(playerIn.getHeldItem(handIn));
		}
		return ActionResult.resultFail(playerIn.getHeldItem(handIn));
	}
	
}