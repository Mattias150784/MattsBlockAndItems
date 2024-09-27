package net.mattias.mattsitemsandblocks.datagen;

import net.mattias.mattsitemsandblocks.MattsItemsBlocks;
import net.mattias.mattsitemsandblocks.block.ModBlocks;
import net.mattias.mattsitemsandblocks.item.ModItems;
import net.minecraft.data.PackOutput;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.Blocks;
import net.minecraftforge.client.model.generators.ItemModelBuilder;
import net.minecraftforge.client.model.generators.ItemModelProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItemModelProvider extends ItemModelProvider {
    public ModItemModelProvider(PackOutput output, ExistingFileHelper existingFileHelper) {
        super(output, MattsItemsBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void registerModels() {
        // simpleItem(ModItems.SAPPHIRE);

        buttonItem(ModBlocks.BLACKSTONE_BRICKS_BUTTON, ModBlocks.BLACK_STONE_BRICKS);
        wallItem(ModBlocks.BLACKSTONE_BRICKS_WALL, ModBlocks.BLACK_STONE_BRICKS);
        evenSimplerBlockItem(ModBlocks.BLACKSTONE_BRICKS_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACKSTONE_BRICKS_SLAB);


        buttonItem(ModBlocks.BLACKSTONE_BUTTON, Blocks.BLACKSTONE);
        wallItem(ModBlocks.BLACKSTONE_WALL, Blocks.BLACKSTONE);
        evenSimplerBlockItem(ModBlocks.BLACKSTONE_STAIRS);
        evenSimplerBlockItem(ModBlocks.BLACKSTONE_SLAB);
    }

    private ItemModelBuilder simpleItem(RegistryObject<Item> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MattsItemsBlocks.MOD_ID,"item/" + item.getId().getPath()));
    }

    public void evenSimplerBlockItem(RegistryObject<Block> block) {
        this.withExistingParent(MattsItemsBlocks.MOD_ID + ":" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath(),
                modLoc("block/" + ForgeRegistries.BLOCKS.getKey(block.get()).getPath()));
    }


    public void buttonItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MattsItemsBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    public void buttonItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/button_inventory"))
                .texture("texture", new ResourceLocation(MattsItemsBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }


    public void wallItem(RegistryObject<Block> block, RegistryObject<Block> baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(MattsItemsBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock.get()).getPath()));
    }


    public void wallItem(RegistryObject<Block> block, Block baseBlock) {
        this.withExistingParent(ForgeRegistries.BLOCKS.getKey(block.get()).getPath(), mcLoc("block/wall_inventory"))
                .texture("wall", new ResourceLocation(MattsItemsBlocks.MOD_ID, "block/" + ForgeRegistries.BLOCKS.getKey(baseBlock).getPath()));
    }

    private ItemModelBuilder simpleBlockItem(RegistryObject<Block> item) {
        return withExistingParent(item.getId().getPath(),
                new ResourceLocation("item/generated")).texture("layer0",
                new ResourceLocation(MattsItemsBlocks.MOD_ID,"item/" + item.getId().getPath()));
    }
}
