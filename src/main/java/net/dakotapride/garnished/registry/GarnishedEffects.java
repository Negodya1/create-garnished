package net.dakotapride.garnished.registry;

import net.dakotapride.garnished.CreateGarnished;
import net.dakotapride.garnished.effect.AversionMobEffect;
import net.dakotapride.garnished.effect.CognateMobEffect;
import net.dakotapride.garnished.effect.FlagrantMobEffect;
import net.dakotapride.garnished.effect.MummificationMobEffect;
import net.dakotapride.garnished.effect.SanctityMobEffect;
import net.dakotapride.garnished.effect.SpiritedResistanceMobEffect;
import net.dakotapride.garnished.effect.SugarHighMobEffect;
import net.dakotapride.garnished.effect.ThornsMobEffect;
import net.fabricmc.fabric.api.registry.FabricBrewingRecipeRegistry;
import net.minecraft.core.Registry;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.entity.ai.attributes.AttributeModifier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.alchemy.Potion;
import net.minecraft.world.item.alchemy.PotionBrewing;
import net.minecraft.world.item.alchemy.Potions;
import net.minecraft.world.item.crafting.Ingredient;

public class GarnishedEffects {

	public static MobEffect AVERSION = effect("aversion", new AversionMobEffect()
			.addAttributeModifier(Attributes.MOVEMENT_SPEED, "8280b3f7-933d-426e-8398-a171d2339dc6",
					-0.25, AttributeModifier.Operation.MULTIPLY_TOTAL)
			.addAttributeModifier(Attributes.ATTACK_DAMAGE, "9f2c068e-013e-4413-8df6-6a08f19cdcc2",
					-0.15, AttributeModifier.Operation.MULTIPLY_TOTAL));

	public static MobEffect SPIRITED_RESISTANCE = effect("spirited_resistance", new SpiritedResistanceMobEffect());

	public static MobEffect COGNATE = effect("cognate", new CognateMobEffect());
	public static MobEffect FLAGRANT = effect("flagrant", new FlagrantMobEffect());

	public static MobEffect SUGAR_HIGH = effect("sugar_high", new SugarHighMobEffect()
			.addAttributeModifier(Attributes.MOVEMENT_SPEED, "660fa62e-0096-4f99-9b9a-9311d1936b89",
					0.075, AttributeModifier.Operation.MULTIPLY_TOTAL));

	public static MobEffect SANCTITY = effect("sanctity", new SanctityMobEffect()
			.addAttributeModifier(Attributes.ARMOR, "3a7cbac5-6234-49c8-93d0-fdacad4af501",
					4.0, AttributeModifier.Operation.ADDITION));

	public static MobEffect THORNS = effect("thorns", new ThornsMobEffect());
	public static MobEffect MUMMIFICATION = effect("mummification", new MummificationMobEffect()
			.addAttributeModifier(Attributes.MOVEMENT_SPEED, "9bfdc80b-2f5a-4e9f-9ffd-a5880ccf2a09",
					-0.015, AttributeModifier.Operation.MULTIPLY_TOTAL));

	public static Potion AVERSION_POTION = potion("aversion", new Potion(
			new MobEffectInstance(AVERSION, 2400)));
	public static Potion LONG_AVERSION_POTION = potion("long_aversion", new Potion("aversion",
			new MobEffectInstance(AVERSION, 3600)));

	public static final Potion FLAGRANT_POTION = potion("flagrant",
			new Potion("flagrant", new MobEffectInstance(FLAGRANT, 2400)));

	public static Potion BLINDNESS_POTION = vanillaPotion("blindness",
			new Potion(new MobEffectInstance(MobEffects.BLINDNESS, 2400)));

	public static final Potion SANCTITY_POTION = potion("sanctity",
			new Potion("sanctity", new MobEffectInstance(SANCTITY, 2800)));

	public static final Potion MUMMIFICATION_POTION = potion("mummification",
			new Potion(new MobEffectInstance(MUMMIFICATION, 1200)));


	private static MobEffect effect(String key, MobEffect effect) {
		return Registry.register(Registry.MOB_EFFECT, new ResourceLocation(CreateGarnished.ID, key), effect);
	}

	private static Potion potion(String key, Potion potion) {
		return Registry.register(Registry.POTION, new ResourceLocation(CreateGarnished.ID, key), potion);
	}

	private static Potion vanillaPotion(String key, Potion potion) {
		return Registry.register(Registry.POTION, new ResourceLocation(key), potion);
	}

	public static void setRegister() {

	}

}
