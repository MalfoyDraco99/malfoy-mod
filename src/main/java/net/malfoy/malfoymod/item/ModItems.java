package net.malfoy.malfoymod.item;

import net.malfoy.malfoymod.MalfoyMod;
import net.minecraft.item.Item;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {

    private static Item registerItem(String name, Item item) {
        Registry.register(Registries.ITEM, new Identifier(MalfoyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MalfoyMod.LOGGER.info("Registering Mod Items for " + MalfoyMod.MOD_ID);
    }
}
