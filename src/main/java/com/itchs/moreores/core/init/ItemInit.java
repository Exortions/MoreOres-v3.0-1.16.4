package com.itchs.moreores.core.init;

import java.util.function.Supplier;

import com.itchs.moreores.MoreOres;
import com.itchs.moreores.common.items.LightningRod;
import com.itchs.moreores.common.items.NecromancersStaff;

import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.AxeItem;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Food;
import net.minecraft.item.HoeItem;
import net.minecraft.item.IArmorMaterial;
import net.minecraft.item.IItemTier;
import net.minecraft.item.Item;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ShovelItem;
import net.minecraft.item.SwordItem;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.potion.EffectInstance;
import net.minecraft.potion.Effects;
import net.minecraft.util.LazyValue;
import net.minecraft.util.SoundEvent;
import net.minecraft.util.SoundEvents;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ItemInit {
		
	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS,MoreOres.MOD_ID);
		
	// Items
	public static final RegistryObject<Item> RUBY = ITEMS.register("ruby", () -> new Item(new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	public static final RegistryObject<Item> OBSIDIAN_INGOT = ITEMS.register("obsidian_ingot", () -> new Item(new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	public static final RegistryObject<Item> SAPPHIRE = ITEMS.register("sapphire", () -> new Item(new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	public static final RegistryObject<Item> COPPER = ITEMS.register("copper_ingot", () -> new Item(new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	public static final RegistryObject<Item> COPPER_ALLOY = ITEMS.register("copper_alloy", () -> new Item(new Item.Properties().group(MoreOres.MOREORES_GROUP)));
		
	// Tools
		// Ruby
		public static final RegistryObject<Item> RUBY_SWORD = ITEMS.register("ruby_sword", () -> new SwordItem(ModItemTier.RUBY, 4, -2.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_PICKAXE = ITEMS.register("ruby_pickaxe", () -> new PickaxeItem(ModItemTier.RUBY, 1, -3.0f, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_AXE = ITEMS.register("ruby_axe", () -> new AxeItem(ModItemTier.RUBY, 5.5F, -3.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_SHOVEL = ITEMS.register("ruby_shovel", () -> new ShovelItem(ModItemTier.RUBY, 1.75F, -3.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_HOE = ITEMS.register("ruby_hoe", () -> new HoeItem(ModItemTier.RUBY, -4, 0.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		
		// Obsidian
		public static final RegistryObject<Item> OBSIDIAN_SWORD = ITEMS.register("obsidian_sword", () -> new SwordItem(ModItemTier.OBSIDIAN, 5, -2.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_PICKAXE = ITEMS.register("obsidian_pickaxe", () -> new PickaxeItem(ModItemTier.OBSIDIAN, 1, -3.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_AXE = ITEMS.register("obsidian_axe", () -> new AxeItem(ModItemTier.OBSIDIAN, 6.5F, -3.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_SHOVEL = ITEMS.register("obsidian_shovel", () -> new ShovelItem(ModItemTier.OBSIDIAN, 1.75F, -3.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_HOE = ITEMS.register("obsidian_hoe", () -> new HoeItem(ModItemTier.OBSIDIAN, -4, 0.0F, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		
	// Armor
		// Ruby
		public static final RegistryObject<Item> RUBY_HELMET = ITEMS.register("ruby_helmet", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.HEAD, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_CHESTPLATE = ITEMS.register("ruby_chestplate", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.CHEST, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_LEGGINGS = ITEMS.register("ruby_leggings", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.LEGS, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> RUBY_BOOTS = ITEMS.register("ruby_boots", () -> new ArmorItem(ModArmorMaterial.RUBY, EquipmentSlotType.FEET, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		
		// Obsidian
		public static final RegistryObject<Item> OBSIDIAN_HELMET = ITEMS.register("obsidian_helmet", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.HEAD, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_CHESTPLATE = ITEMS.register("obsidian_chestplate", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.CHEST, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_LEGGINGS = ITEMS.register("obsidian_leggings", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.LEGS, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
		public static final RegistryObject<Item> OBSIDIAN_BOOTS = ITEMS.register("obsidian_boots", () -> new ArmorItem(ModArmorMaterial.OBSIDIAN, EquipmentSlotType.FEET, (new Item.Properties()).group(MoreOres.MOREORES_GROUP)));
	
	// Advanced Items
	public static final RegistryObject<LightningRod> LIGHTNING_ROD = ITEMS.register("lightning_rod", () -> new LightningRod(new Item.Properties().group(MoreOres.MOREORES_GROUP).maxStackSize(1).maxDamage(1000)));
	public static final RegistryObject<NecromancersStaff> NECROMANCERS_ROD = ITEMS.register("necromancers_staff", () -> new NecromancersStaff(new Item.Properties().group(MoreOres.MOREORES_GROUP).maxStackSize(1).maxDamage(1000)));
	
	// BlockItems
	public static final RegistryObject<BlockItem> RUBY_BLOCK = ITEMS.register("ruby_block", () -> new BlockItem(BlockInit.RUBY_BLOCK.get(), new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	public static final RegistryObject<BlockItem> RUBY_ORE = ITEMS.register("ruby_ore", () -> new BlockItem(BlockInit.RUBY_ORE.get(), new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	public static final RegistryObject<BlockItem> SAPPHIRE_ORE = ITEMS.register("sapphire_ore", () -> new BlockItem(BlockInit.SAPPHIRE_ORE.get(), new Item.Properties().group(MoreOres.MOREORES_GROUP)));
	
	// Food
	public static final RegistryObject<Item> GOLDEN_STEAK = ITEMS.register("golden_steak", () -> new Item(new Item.Properties().group(MoreOres.MOREORES_GROUP).food(new Food.Builder().effect(() -> new EffectInstance(Effects.ABSORPTION, 12000, 3), 1.0f).effect(() -> new EffectInstance(Effects.REGENERATION, 200, 2), 1.0f).meat().hunger(8).saturation(1.0f).setAlwaysEdible().build())));
	
	
	
	// Custom ItemTier Enum
	public enum ModItemTier implements IItemTier {
		   RUBY(4, 2031, 9.0F, 4.0F, 15, () -> {
		      return Ingredient.fromItems(ItemInit.RUBY.get());
		   }),
		   OBSIDIAN(5, 3129, 11.0F, 4.5F, 9, () -> {
			   return Ingredient.fromItems(ItemInit.OBSIDIAN_INGOT.get());
		   });
		

		   private final int harvestLevel;
		   private final int maxUses;
		   private final float efficiency;
		   private final float attackDamage;
		   private final int enchantability;
		   private final LazyValue<Ingredient> repairMaterial;

		   private ModItemTier(int harvestLevelIn, int maxUsesIn, float efficiencyIn, float attackDamageIn, int enchantabilityIn, Supplier<Ingredient> repairMaterialIn) {
		      this.harvestLevel = harvestLevelIn;
		      this.maxUses = maxUsesIn;
		      this.efficiency = efficiencyIn;
		      this.attackDamage = attackDamageIn;
		      this.enchantability = enchantabilityIn;
		      this.repairMaterial = new LazyValue<>(repairMaterialIn);
		   }

		   public int getMaxUses() {
		      return this.maxUses;
		   }

		   public float getEfficiency() {
		      return this.efficiency;
		   }

		   public float getAttackDamage() {
		      return this.attackDamage;
		   }

		   public int getHarvestLevel() {
		      return this.harvestLevel;
		   }

		   public int getEnchantability() {
		      return this.enchantability;
		   }

		   public Ingredient getRepairMaterial() {
		      return this.repairMaterial.getValue();
		   }
		}
	
	// Custom ArmorMaterial enum
	public enum ModArmorMaterial implements IArmorMaterial {
		   RUBY("moreores:ruby", 38, new int[]{4, 7, 9, 4}, 16, SoundEvents.ITEM_ARMOR_EQUIP_DIAMOND, 3.5F, 0.0F, () -> {
			   return Ingredient.fromItems(ItemInit.RUBY.get());
		   }),
		   OBSIDIAN("moreores:obsidian", 43, new int[] {7, 10, 12, 6}, 12, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 4.5F, 0.0F, () -> {
			   return Ingredient.fromItems(ItemInit.OBSIDIAN_INGOT.get());
		   });

		   private static final int[] MAX_DAMAGE_ARRAY = new int[]{13, 15, 16, 11};
		   private final String name;
		   private final int maxDamageFactor;
		   private final int[] damageReductionAmountArray;
		   private final int enchantability;
		   private final SoundEvent soundEvent;
		   private final float toughness;
		   private final float knockbackResistance;
		   private final LazyValue<Ingredient> repairMaterial;

		   private ModArmorMaterial(String name, int maxDamageFactor, int[] damageReductionAmountArray, int enchantability, SoundEvent soundEvent, float toughness, float knockbackResistance, Supplier<Ingredient> repairMaterial) {
		      this.name = name;
		      this.maxDamageFactor = maxDamageFactor;
		      this.damageReductionAmountArray = damageReductionAmountArray;
		      this.enchantability = enchantability;
		      this.soundEvent = soundEvent;
		      this.toughness = toughness;
		      this.knockbackResistance = knockbackResistance;
		      this.repairMaterial = new LazyValue<>(repairMaterial);
		   }

		   public int getDurability(EquipmentSlotType slotIn) {
		      return MAX_DAMAGE_ARRAY[slotIn.getIndex()] * this.maxDamageFactor;
		   }

		   public int getDamageReductionAmount(EquipmentSlotType slotIn) {
		      return this.damageReductionAmountArray[slotIn.getIndex()];
		   }

		   public int getEnchantability() {
		      return this.enchantability;
		   }

		   public SoundEvent getSoundEvent() {
		      return this.soundEvent;
		   }

		   public Ingredient getRepairMaterial() {
		      return this.repairMaterial.getValue();
		   }

		   @OnlyIn(Dist.CLIENT)
		   public String getName() {
		      return this.name;
		   }

		   public float getToughness() {
		      return this.toughness;
		   }

		   public float getKnockbackResistance() {
		      return this.knockbackResistance;
		   }
		}
}