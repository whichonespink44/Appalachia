package appalachia.item.slabs;

import net.minecraft.block.Block;
import net.minecraft.block.state.IBlockState;

import appalachia.api.AppalachiaBlocks;
import appalachia.block.planks.BlockPlanksOakH180S20;

public class ItemSlabOakH180S20 extends AppalachiaItemSlab {

    public ItemSlabOakH180S20(Block block) {

        super(block);
    }

    @Override
    protected IBlockState getFullBlock() {

        return AppalachiaBlocks.planks_oak_180_20.getDefaultState().withProperty(BlockPlanksOakH180S20.DOUBLE, Boolean.valueOf(true));
    }
}