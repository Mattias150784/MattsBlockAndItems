package net.mattias.mattsitemsandblocks.block;

import net.mattias.mattsitemsandblocks.MattsItemsBlocks;
import net.mattias.mattsitemsandblocks.item.ModItems;
import net.minecraft.world.item.BlockItem;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.block.*;
import net.minecraft.world.level.block.state.BlockBehaviour;
import net.minecraft.world.level.block.state.properties.BlockSetType;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

import java.util.function.Supplier;

public class ModBlocks {
    public static final DeferredRegister<Block> BLOCKS =
            DeferredRegister.create(ForgeRegistries.BLOCKS, MattsItemsBlocks.MOD_ID);

    public static final RegistryObject<Block> BLACK_STONE_BRICKS = registerBlock("black_stone_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE).strength(1.5F, 6.0F).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> COPPER_BRICKS = registerBlock("copper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.COPPER_BLOCK).requiresCorrectToolForDrops()));

    public static final RegistryObject<Block> OXIDIZED_CUT_COPPER_BRICKS = registerBlock("oxidized_cut_copper_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.OXIDIZED_CUT_COPPER).requiresCorrectToolForDrops()));


    public static final RegistryObject<Block> ROTTEN_FLESH_BLOCK = registerBlock("rotten_flesh_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.CLAY).sound(SoundType.HONEY_BLOCK)));

    public static final RegistryObject<Block> ENDER_PEARL_BLOCK = registerBlock("ender_pearl_block",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.GLASS)));

    public static final RegistryObject<Block> NETHERRACK_BRICKS = registerBlock("netherrack_bricks",
            () -> new Block(BlockBehaviour.Properties.copy(Blocks.NETHERRACK)));

    
    public static final RegistryObject<Block> BLACKSTONE_BRICKS_STAIRS = registerBlock("blackstone_brick_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(ModBlocks.BLACK_STONE_BRICKS.get())));
    
    public static final RegistryObject<Block> BLACKSTONE_BRICKS_SLAB = registerBlock("blackstone_bricks_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(ModBlocks.BLACK_STONE_BRICKS.get())));

    public static final RegistryObject<Block> BLACKSTONE_BRICKS_BUTTON = registerBlock("blackstone_bricks_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON), 
                    BlockSetType.STONE, 10, true));

    public static final RegistryObject<Block> BLACKSTONE_BRICKS_WALL = registerBlock("blackstone_bricks_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(ModBlocks.BLACK_STONE_BRICKS.get())));

    public static final RegistryObject<Block> BLACKSTONE_STAIRS = registerBlock("blackstone_stairs",
            () -> new StairBlock(() -> ModBlocks.BLACK_STONE_BRICKS.get().defaultBlockState(),
                    BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

    public static final RegistryObject<Block> BLACKSTONE_SLAB = registerBlock("blackstone_slab",
            () -> new SlabBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

    public static final RegistryObject<Block> BLACKSTONE_BUTTON = registerBlock("blackstone_button",
            () -> new ButtonBlock(BlockBehaviour.Properties.copy(Blocks.STONE_BUTTON),
                    BlockSetType.STONE, 10, true));

    public static final RegistryObject<Block> BLACKSTONE_WALL = registerBlock("blackstone_wall",
            () -> new WallBlock(BlockBehaviour.Properties.copy(Blocks.BLACKSTONE)));

    private static <T extends Block> RegistryObject<T> registerBlock(String name, Supplier<T> block) {
        RegistryObject<T> toReturn = BLOCKS.register(name, block);
        registerBlockItem(name, toReturn);
        return toReturn;
    }

    private static <T extends Block> RegistryObject<Item> registerBlockItem(String name, RegistryObject<T> block) {
        return ModItems.ITEMS.register(name, () -> new BlockItem(block.get(), new Item.Properties()));
    }

    public static void register(IEventBus eventBus) {
        BLOCKS.register(eventBus);
    }
}