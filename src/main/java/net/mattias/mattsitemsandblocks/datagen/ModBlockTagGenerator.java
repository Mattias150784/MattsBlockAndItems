package net.mattias.mattsitemsandblocks.datagen;

import net.mattias.mattsitemsandblocks.MattsItemsBlocks;
import net.mattias.mattsitemsandblocks.block.ModBlocks;
import net.minecraft.core.HolderLookup;
import net.minecraft.data.PackOutput;
import net.minecraft.tags.BlockTags;
import net.minecraftforge.common.Tags;
import net.minecraftforge.common.data.BlockTagsProvider;
import net.minecraftforge.common.data.ExistingFileHelper;
import org.jetbrains.annotations.Nullable;

import java.util.concurrent.CompletableFuture;

public class ModBlockTagGenerator extends BlockTagsProvider {
    public ModBlockTagGenerator(PackOutput output, CompletableFuture<HolderLookup.Provider> lookupProvider, @Nullable ExistingFileHelper existingFileHelper) {
        super(output, lookupProvider, MattsItemsBlocks.MOD_ID, existingFileHelper);
    }

    @Override
    protected void addTags(HolderLookup.Provider pProvider) {

     this.tag(BlockTags.MINEABLE_WITH_PICKAXE)
                .add(ModBlocks.BLACK_STONE_BRICKS.get(),
                        ModBlocks.COPPER_BRICKS.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get(),
                        ModBlocks.NETHERRACK_BRICKS.get(),
                        ModBlocks.BLACKSTONE_BRICKS_STAIRS.get(),
                        ModBlocks.BLACKSTONE_BRICKS_SLAB.get(),
                        ModBlocks.BLACKSTONE_BRICKS_WALL.get(),
                        ModBlocks.BLACKSTONE_BRICKS_BUTTON.get(),
                        ModBlocks.BLACKSTONE_STAIRS.get(),
                        ModBlocks.BLACKSTONE_SLAB.get(),
                        ModBlocks.BLACKSTONE_WALL.get(),
                        ModBlocks.BLACKSTONE_BUTTON.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_STAIRS.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_WALL.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_BUTTON.get(),
                        ModBlocks.COPPER_STAIRS.get(),
                        ModBlocks.COPPER_SLAB.get(),
                        ModBlocks.COPPER_WALL.get(),
                        ModBlocks.COPPER_BUTTON.get()
                );



        this.tag(BlockTags.NEEDS_IRON_TOOL)
                .add(ModBlocks.COPPER_BRICKS.get(),
                ModBlocks.OXIDIZED_CUT_COPPER_BRICKS.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_WALL.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_SLAB.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_BUTTON.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_STAIRS.get(),
                        ModBlocks.COPPER_WALL.get(),
                        ModBlocks.COPPER_SLAB.get(),
                        ModBlocks.COPPER_BUTTON.get(),
                        ModBlocks.COPPER_STAIRS.get()
                );

      /*  this.tag(BlockTags.NEEDS_DIAMOND_TOOL)


         this.tag(BlockTags.NEEDS_STONE_TOOL)


        this.tag(Tags.Blocks.NEEDS_NETHERITE_TOOL)

*/

        this.tag(BlockTags.WALLS)
                .add(ModBlocks.BLACKSTONE_BRICKS_WALL.get(),
                        ModBlocks.BLACKSTONE_WALL.get(),
                        ModBlocks.COPPER_WALL.get(),
                        ModBlocks.OXIDIZED_CUT_COPPER_WALL.get()
                );


    }
}