package net.malfoy.malfoymod.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroupEntries;
import net.fabricmc.fabric.api.itemgroup.v1.ItemGroupEvents;
import net.malfoy.malfoymod.MalfoyMod;
import net.malfoy.malfoymod.item.custom.MetalDetectorItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.Registry;
import net.minecraft.registry.Registries;
import net.minecraft.util.Identifier;

public class ModItems {
    public static final Item RUBY = registerItem("ruby", new Item(new FabricItemSettings()));
    public static final Item RAW_RUBY = registerItem("raw_ruby", new Item(new FabricItemSettings()));
    public static final Item RUBY_BURGER = registerItem("ruby_burger", new Item(new FabricItemSettings().food(ModFoodComponents.RUBY_BURGER)));
    public static final Item METAL_DETECTOR = registerItem("metal_detector", new MetalDetectorItem(new FabricItemSettings().maxDamage(32)));
    public static final Item URANIUM_INGOT = registerItem("uranium_ingot", new Item(new FabricItemSettings()));
    public static final Item ASBESTOS = registerItem("asbestos", new Item(new FabricItemSettings()));
    public static final Item ASBESTOS_BURGER = registerItem("asbestos_burger", new Item(new FabricItemSettings().food(ModFoodComponents.ASBESTOS_BURGER)));

    private static void addItemsToIngredientItemGroup(FabricItemGroupEntries entries) {
        entries.add(RUBY);
        entries.add(RAW_RUBY);
    }

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(MalfoyMod.MOD_ID, name), item);
    }

    public static void registerModItems() {
        MalfoyMod.LOGGER.info("Registering Mod Items for " + MalfoyMod.MOD_ID);

        ItemGroupEvents.modifyEntriesEvent(ItemGroups.INGREDIENTS).register(ModItems::addItemsToIngredientItemGroup);
    }
}
