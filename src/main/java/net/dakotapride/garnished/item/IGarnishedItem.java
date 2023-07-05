package net.dakotapride.garnished.item;

import net.dakotapride.garnished.registry.GarnishedItems;
import net.minecraft.ChatFormatting;
import net.minecraft.network.chat.Style;
import net.minecraft.world.effect.MobEffect;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;

public interface IGarnishedItem {
	int baseTick = 20;
	int getBaseEffectDuration = baseTick * 90;


	default String garnishedText() {
		return "text.garnished.nut.garnished";
	}

	default ChatFormatting getStandardColouring() {
		return ChatFormatting.GRAY;
	}

	default String ungarnishedText() {
		return "text.garnished.nut.ungarnished";
	}

	default String sweetenedText() {
		return "text.garnished.nut.sweetened";
	}

	default ChatFormatting getSweetenedColouring() {
		return ChatFormatting.AQUA;
	}

	default String honeyedText() {
		return "text.garnished.nut.honeyed";
	}

	default Style getHoneyedColouring() {
		return Style.EMPTY.withColor(0xEE890F);
	}

	default String cinderFlourText() {
		return "text.garnished.nut.cinder_flour";
	}

	default String meltedCinderFlourText() {
		return "text.garnished.nut.cinder_flour.melted";
	}

	default ChatFormatting getCinderFlourColouring() {
		return ChatFormatting.RED;
	}

	default String chocolateGlazedText() {
		return "text.garnished.nut.chocolate_glazed";
	}

	default Style getChocolateGlazedColouring() {
		return Style.EMPTY.withColor(0xB1543E);
	}

	default MobEffect getEffect(ItemStack stack) {
		MobEffect effect = null;
		Item item = stack.getItem();

		if (item == GarnishedItems.SPEED_CINDER_CASHEW.get()) {
			effect = MobEffects.MOVEMENT_SPEED;
		} else if (item == GarnishedItems.STRENGTH_CINDER_WALNUT.get()) {
			effect = MobEffects.DAMAGE_BOOST;
		} else if (item == GarnishedItems.HASTE_CINDER_ALMOND.get()) {
			effect = MobEffects.DIG_SPEED;
		} else if (item == GarnishedItems.RESISTANCE_CINDER_PECAN.get()) {
			effect = MobEffects.DAMAGE_RESISTANCE;
		} else if (item == GarnishedItems.NIGHT_VISION_CINDER_PISTACHIO.get()) {
			effect = MobEffects.NIGHT_VISION;
		} else if (item == GarnishedItems.FIRE_RESISTANCE_CINDER_MACADAMIA.get()) {
			effect = MobEffects.FIRE_RESISTANCE;
		}

		return effect;
	}

}
