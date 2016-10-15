package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH40S170;

public class ItemSlabOakH40S170 extends AppalachiaItemSlab {

    public ItemSlabOakH40S170(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_40_170.getDefaultState().withProperty(BlockPlanksOakH40S170.DOUBLE, Boolean.valueOf(true));
    }
}