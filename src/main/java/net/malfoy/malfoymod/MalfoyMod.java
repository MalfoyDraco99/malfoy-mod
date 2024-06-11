package net.malfoy.malfoymod;

import net.fabricmc.api.ModInitializer;

import net.fabricmc.fabric.api.registry.FuelRegistry;
import net.malfoy.malfoymod.block.ModBlocks;
import net.malfoy.malfoymod.item.ModItemGroups;
import net.malfoy.malfoymod.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MalfoyMod implements ModInitializer {
	public static final String MOD_ID = "malfoymod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

	@Override
	public void onInitialize() {
		ModItemGroups.registerItemGroups();
		ModItems.registerModItems();
		ModBlocks.registerModBlocks();
		FuelRegistry.INSTANCE.add(ModItems.URANIUM_INGOT,22000);
	}
}