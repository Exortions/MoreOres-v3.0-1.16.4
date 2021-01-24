package com.itchs.moreores.client.screens;

import com.mojang.blaze3d.systems.RenderSystem;
import com.itchs.moreores.MoreOres;
import com.itchs.moreores.common.containers.OreBackpackContainer;
import com.mojang.blaze3d.matrix.MatrixStack;

import net.minecraft.client.gui.screen.inventory.ContainerScreen;
import net.minecraft.entity.player.PlayerInventory;
import net.minecraft.util.ResourceLocation;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class OreBackpackScreen extends ContainerScreen<OreBackpackContainer> {
	
	private static final ResourceLocation BACKGROUND_TEXTURE = new ResourceLocation(MoreOres.MOD_ID, "textures/gui/ore_backpack.png");
	
	public OreBackpackScreen(OreBackpackContainer screenContainer, PlayerInventory inv, ITextComponent titleIn) {
		super(screenContainer, inv, titleIn);
		this.guiLeft = 0;
		this.guiTop = 0;
		this.xSize = 175;
		this.ySize = 165;
	}
	
	@Override
	public void render(MatrixStack matrixStack, final int mouseX, final int MouseY, final float partialTicks) {
		this.renderBackground(matrixStack);
		super.render(matrixStack, mouseX, MouseY, partialTicks);
		this.renderHoveredTooltip(matrixStack, mouseX, MouseY);
	}
	
	@Override
	protected void drawGuiContainerForegroundLayer(MatrixStack matrixStack, int mouseX, int mouseY) {
		super.drawGuiContainerForegroundLayer(matrixStack, mouseX, mouseY);
		this.font.func_243248_b(matrixStack, this.title, 8.0f, 6.0f, 0x404040);
		this.font.func_243248_b(matrixStack, this.playerInventory.getDisplayName(), 8.0f, 90.0f, 0x404040);
	}
	
	@SuppressWarnings("deprecation")
	@Override
	protected void drawGuiContainerBackgroundLayer(MatrixStack matrixStack, float partialTicks, int mouseX, int mouseY) {
		RenderSystem.color4f(1.0f, 1.0f, 1.0f, 1.0f);
		this.minecraft.getTextureManager().bindTexture(BACKGROUND_TEXTURE);
		int x = (this.width - this.xSize) / 2;
		int y = (this.height - this.ySize) / 2;
		this.blit(matrixStack, x, y, 0, 0, this.xSize, this.ySize);
	}
}