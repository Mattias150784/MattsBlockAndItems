package net.mattias.mattsitemsandblocks.item;

import net.mattias.mattsitemsandblocks.MattsItemsBlocks;
import net.mattias.mattsitemsandblocks.block.ModBlocks;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, MattsItemsBlocks.MOD_ID);

    public static final RegistryObject<CreativeModeTab> MATTSBLOCKS = CREATIVE_MODE_TABS.register("mattsblocks",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModBlocks.BLACK_STONE_BRICKS.get()))
                    .title(Component.translatable("creativetab.mattsblocks"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModBlocks.BLACK_STONE_BRICKS.get());
                        pOutput.accept(ModBlocks.COPPER_BRICKS.get());
                        pOutput.accept(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get());
                        pOutput.accept(ModBlocks.ROTTEN_FLESH_BLOCK.get());
                        pOutput.accept(ModBlocks.ENDER_PEARL_BLOCK.get());
                        pOutput.accept(ModBlocks.NETHERRACK_BRICKS.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_BRICKS_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_BRICKS_SLAB.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_BRICKS_WALL.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_BRICKS_BUTTON.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_STAIRS.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_SLAB.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_WALL.get());
                        pOutput.accept(ModBlocks.BLACKSTONE_BUTTON.get());
                        pOutput.accept(ModBlocks.COPPER_STAIRS.get());
                        pOutput.accept(ModBlocks.COPPER_SLAB.get());
                        pOutput.accept(ModBlocks.COPPER_WALL.get());
                        pOutput.accept(ModBlocks.COPPER_BUTTON.get());
                        pOutput.accept(ModBlocks.OXIDIZED_CUT_COPPER_STAIRS.get());
                        pOutput.accept(ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get());
                        pOutput.accept(ModBlocks.OXIDIZED_CUT_COPPER_WALL.get());
                        pOutput.accept(ModBlocks.OXIDIZED_CUT_COPPER_BUTTON.get());

                    })
                    .build());


    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}