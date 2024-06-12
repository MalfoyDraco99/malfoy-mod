package net.malfoy.malfoymod.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import net.malfoy.malfoymod.MalfoyMod;
import net.malfoy.malfoymod.block.ModBlocks;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup RUBY_GROUP = Registry.register(Registries.ITEM_GROUP, new Identifier(MalfoyMod.MOD_ID, "ruby"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.ruby"))
                    .icon(() -> new ItemStack(ModItems.RUBY)).entries((displayContext, entries) -> {
                        entries.add(ModItems.RUBY);
                        entries.add(ModItems.RAW_RUBY);
                        entries.add(ModItems.RUBY_BURGER);
                        entries.add(ModBlocks.RUBY_BLOCK);
                        entries.add(ModBlocks.RAW_RUBY_BLOCK);
                        entries.add(ModItems.METAL_DETECTOR);
                        entries.add(ModItems.URANIUM_INGOT);
                        entries.add(ModBlocks.URANIUM_BLOCK);
                        entries.add(ModBlocks.RUBY_ORE);
                        entries.add(ModBlocks.DEEPSLATE_RUBY_ORE);
                        entries.add(ModBlocks.NETHER_RUBY_ORE);
                        entries.add(ModBlocks.END_STONE_RUBY_ORE);
                        entries.add(ModBlocks.SOUND_BLOCK);
                        entries.add(ModBlocks.ASBESTOS_ORE);
                        entries.add(ModItems.ASBESTOS);
                        entries.add(ModBlocks.ASBESTOS_BLOCK);
                        entries.add(ModItems.ASBESTOS_BURGER);

                    }).build());
    public static void registerItemGroups() {
        MalfoyMod.LOGGER.info("Registering Item Groups for"+MalfoyMod.MOD_ID);
    }
}
