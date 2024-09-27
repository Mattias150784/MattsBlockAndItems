package net.mattias.mattsitemsandblocks.datagen.loot;

import net.mattias.mattsitemsandblocks.block.ModBlocks;
import net.minecraft.data.loot.BlockLootSubProvider;
import net.minecraft.world.flag.FeatureFlagSet;
import net.minecraft.world.flag.FeatureFlags;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.Items;
import net.minecraft.world.item.enchantment.Enchantments;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.storage.loot.LootTable;
import net.minecraft.world.level.storage.loot.entries.LootItem;
import net.minecraft.world.level.storage.loot.functions.ApplyBonusCount;
import net.minecraft.world.level.storage.loot.functions.SetItemCountFunction;
import net.minecraft.world.level.storage.loot.providers.number.UniformGenerator;
import net.minecraftforge.registries.RegistryObject;

import java.util.Set;

public class ModBlockLootTables extends BlockLootSubProvider {
    public ModBlockLootTables() {
        super(Set.of(), FeatureFlags.REGISTRY.allFlags());
    }

    @Override
    protected void generate() {

        this.dropSelf(ModBlocks.BLACK_STONE_BRICKS.get());
        this.dropSelf(ModBlocks.COPPER_BRICKS.get());
        this.dropSelf(ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get());
        this.dropSelf(ModBlocks.ROTTEN_FLESH_BLOCK.get());
        this.dropSelf(ModBlocks.ENDER_PEARL_BLOCK.get());
        this.dropSelf(ModBlocks.NETHERRACK_BRICKS.get());
        this.dropSelf(ModBlocks.BLACKSTONE_BRICKS_STAIRS.get());
        this.dropSelf(ModBlocks.BLACKSTONE_BRICKS_WALL.get());
        this.dropSelf(ModBlocks.BLACKSTONE_BRICKS_BUTTON.get());
        this.dropSelf(ModBlocks.BLACKSTONE_STAIRS.get());
        this.dropSelf(ModBlocks.BLACKSTONE_WALL.get());
        this.dropSelf(ModBlocks.BLACKSTONE_BUTTON.get());

        this.add(ModBlocks.BLACKSTONE_BRICKS_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACKSTONE_BRICKS_SLAB.get()));

        this.add(ModBlocks.BLACKSTONE_SLAB.get(),
                block -> createSlabItemTable(ModBlocks.BLACKSTONE_SLAB.get()));
    }

    protected LootTable.Builder createCopperLikeOreDrops(Block pBlock, Item item) {
        return createSilkTouchDispatchTable(pBlock,
                this.applyExplosionDecay(pBlock,
                        LootItem.lootTableItem(item)
                                .apply(SetItemCountFunction.setCount(UniformGenerator.between(2.0F, 5.0F)))
                                .apply(ApplyBonusCount.addOreBonusCount(Enchantments.BLOCK_FORTUNE))));
    }

    @Override
    protected Iterable<Block> getKnownBlocks() {
        return ModBlocks.BLOCKS.getEntries().stream().map(RegistryObject::get)::iterator;
    }
}