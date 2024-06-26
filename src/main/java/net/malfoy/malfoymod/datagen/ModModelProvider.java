package net.malfoy.malfoymod.datagen;

import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;
import net.fabricmc.fabric.api.datagen.v1.provider.FabricModelProvider;
import net.malfoy.malfoymod.block.ModBlocks;
import net.malfoy.malfoymod.item.ModItems;
import net.minecraft.data.client.BlockStateModelGenerator;
import net.minecraft.data.client.ItemModelGenerator;
import net.minecraft.data.client.Models;

public class ModModelProvider extends FabricModelProvider {
    public ModModelProvider(FabricDataOutput output) {
        super(output);
    }

    @Override
    public void generateBlockStateModels(BlockStateModelGenerator blockStateModelGenerator) {
        BlockStateModelGenerator.BlockTexturePool rubyPool = blockStateModelGenerator.registerCubeAllModelTexturePool(ModBlocks.RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RAW_RUBY_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.NETHER_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.DEEPSLATE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.END_STONE_RUBY_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.URANIUM_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.SOUND_BLOCK);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASBESTOS_ORE);
        blockStateModelGenerator.registerSimpleCubeAll(ModBlocks.ASBESTOS_BLOCK);

        rubyPool.stairs(ModBlocks.RUBY_STAIRS);
        rubyPool.slab(ModBlocks.RUBY_SLAB);
        rubyPool.button(ModBlocks.RUBY_BUTTON);
        rubyPool.pressurePlate(ModBlocks.RUBY_PRESSURE_PLATE);
        rubyPool.fence(ModBlocks.RUBY_FENCE);
        rubyPool.fenceGate(ModBlocks.RUBY_FENCE_GATE);
        rubyPool.wall(ModBlocks.RUBY_WALL);

        blockStateModelGenerator.registerDoor(ModBlocks.RUBY_DOOR);
        blockStateModelGenerator.registerTrapdoor(ModBlocks.RUBY_TRAPDOOR);


    }

    @Override
    public void generateItemModels(ItemModelGenerator itemModelGenerator) {
        itemModelGenerator.register(ModItems.RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.RAW_RUBY, Models.GENERATED);
        itemModelGenerator.register(ModItems.URANIUM_INGOT, Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_BURGER, Models.GENERATED);
        itemModelGenerator.register(ModItems.METAL_DETECTOR, Models.GENERATED);
        itemModelGenerator.register(ModItems.ASBESTOS,Models.GENERATED);
        itemModelGenerator.register(ModItems.ASBESTOS_BURGER,Models.GENERATED);
        itemModelGenerator.register(ModItems.RUBY_PICKAXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_AXE,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SHOVEL,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_SWORD,Models.HANDHELD);
        itemModelGenerator.register(ModItems.RUBY_HOE,Models.HANDHELD);

    }
}
