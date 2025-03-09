package net.chocwaffle.archaeologicalmagic;

import net.chocwaffle.archaeologicalmagic.block.ModBlocks;
import net.chocwaffle.archaeologicalmagic.item.ModItemGroups;
import net.chocwaffle.archaeologicalmagic.item.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArchaeologicalMagic implements ModInitializer {
	public static final String MOD_ID = "archaeological_magic";
	public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
	}
}