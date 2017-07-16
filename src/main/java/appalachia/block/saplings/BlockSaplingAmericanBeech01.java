package appalachia.block.saplings;

import appalachia.block.IAppalachiaBlock;
import appalachia.rtg.world.gen.feature.tree.rtg.AppalachiaTree;
import appalachia.rtg.world.gen.feature.tree.rtg.TreeAmericanBeech;

public class BlockSaplingAmericanBeech01 extends AppalachiaBlockSapling implements IAppalachiaBlock {

    public BlockSaplingAmericanBeech01() {

        super("sapling.american_beech.01");
    }

    @Override
    public String registryName() {

        return super.registryName();
    }

    @Override
    public AppalachiaTree getTree() {

        return new TreeAmericanBeech();
    }
}