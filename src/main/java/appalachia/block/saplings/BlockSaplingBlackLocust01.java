package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeBlackLocust;

public class BlockSaplingBlackLocust01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingBlackLocust01() {

        super("sapling.black_locust.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeBlackLocust();
    }
}