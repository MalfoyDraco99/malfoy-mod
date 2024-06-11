package net.malfoy.malfoymod.util;

import net.malfoy.malfoymod.MalfoyMod;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.util.Identifier;

public class ModTags {
    public static class Blocks {
        public static final TagKey<Block> METAL_DETECTOR_DECTECTABLE_BLOCKS = createTag("metal_dectector_dectectable_blocks");
        private static TagKey<Block> createTag(String name) {
            return TagKey.of(RegistryKeys.BLOCK, new Identifier(MalfoyMod.MOD_ID, name));
        }

    }
    public static class Items {
        private static TagKey<Item> createTag(String name) {
            return TagKey.of(RegistryKeys.ITEM, new Identifier(MalfoyMod.MOD_ID, name));
        }
    }
}
