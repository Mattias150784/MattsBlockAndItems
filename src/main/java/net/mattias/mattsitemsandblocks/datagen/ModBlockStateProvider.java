package net.mattias.mattsitemsandblocks.datagen;

import net.mattias.mattsitemsandblocks.MattsItemsBlocks;
import net.mattias.mattsitemsandblocks.block.ModBlocks;
import net.minecraft.data.PackOutput;
import net.minecraft.world.level.block.*;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.RegistryObject;

public class ModBlockStateProvider extends BlockStateProvider {
    public ModBlockStateProvider(PackOutput output, ExistingFileHelper exFileHelper) {
        super(output, MattsItemsBlocks.MOD_ID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        blockWithItem(ModBlocks.BLACK_STONE_BRICKS);
        blockWithItem(ModBlocks.COPPER_BRICKS);
        blockWithItem(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS);
        blockWithItem(ModBlocks.ENDER_PEARL_BLOCK);
        blockWithItem(ModBlocks.ROTTEN_FLESH_BLOCK);
        blockWithItem(ModBlocks.NETHERRACK_BRICKS);



        stairsBlock(((StairBlock) ModBlocks.BLACKSTONE_BRICKS_STAIRS.get()), blockTexture(ModBlocks.BLACK_STONE_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.BLACKSTONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.BLACKSTONE_BRICKS_SLAB.get()), blockTexture(ModBlocks.BLACK_STONE_BRICKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.BLACKSTONE_BRICKS_BUTTON.get()), blockTexture(ModBlocks.BLACK_STONE_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.BLACKSTONE_BRICKS_WALL.get()), blockTexture(ModBlocks.BLACK_STONE_BRICKS.get()));

        stairsBlock(((StairBlock) ModBlocks.BLACKSTONE_STAIRS.get()), blockTexture(Blocks.BLACKSTONE));
        slabBlock(((SlabBlock) ModBlocks.BLACKSTONE_SLAB.get()), blockTexture(Blocks.BLACKSTONE), blockTexture(Blocks.BLACKSTONE));
        buttonBlock(((ButtonBlock) ModBlocks.BLACKSTONE_BUTTON.get()), blockTexture(Blocks.BLACKSTONE));
        wallBlock(((WallBlock) ModBlocks.BLACKSTONE_WALL.get()), blockTexture(Blocks.BLACKSTONE));

        stairsBlock(((StairBlock) ModBlocks.OXIDIZED_CUT_COPPER_STAIRS.get()), blockTexture(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get()), blockTexture(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()), blockTexture(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.OXIDIZED_CUT_COPPER_BUTTON.get()), blockTexture(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.OXIDIZED_CUT_COPPER_WALL.get()), blockTexture(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get()));

        stairsBlock(((StairBlock) ModBlocks.COPPER_STAIRS.get()), blockTexture(ModBlocks.COPPER_BRICKS.get()));
        slabBlock(((SlabBlock) ModBlocks.COPPER_SLAB.get()), blockTexture(Blocks.COPPER_BLOCK), blockTexture(ModBlocks.COPPER_BRICKS.get()));
        buttonBlock(((ButtonBlock) ModBlocks.COPPER_BUTTON.get()), blockTexture(ModBlocks.COPPER_BRICKS.get()));
        wallBlock(((WallBlock) ModBlocks.COPPER_WALL.get()), blockTexture(ModBlocks.COPPER_BRICKS.get()));

    }

    private void blockWithItem(RegistryObject<Block> blockRegistryObject) {
        simpleBlockWithItem(blockRegistryObject.get(), cubeAll(blockRegistryObject.get()));
    }
}