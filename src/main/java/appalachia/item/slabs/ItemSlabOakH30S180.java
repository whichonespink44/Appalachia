package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH30S180;

public class ItemSlabOakH30S180 extends AppalachiaItemSlab {

    public ItemSlabOakH30S180(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_30_180.getDefaultState().withProperty(BlockPlanksOakH30S180.DOUBLE, Boolean.valueOf(true));
    }
}