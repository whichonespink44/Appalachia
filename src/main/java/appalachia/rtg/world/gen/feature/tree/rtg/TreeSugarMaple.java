package appalachia.rtg.world.gen.feature.tree.rtg;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import net.minecraft.block.state.IBlockState;
import net.minecraft.init.Blocks;
import net.minecraft.util.math.BlockPos;
import net.minecraft.world.World;

import appalachia.api.AppalachiaBlocks;
import appalachia.util.TreeLayer;

/**
 * Acer Saccharum (Sugar Maple)
 * <p>
 * This tree was designed by Lentebriesje and released as part of the 'Custom Tree Repository' project
 * on Planet Minecraft (http://www.planetminecraft.com/project/native-trees-of-europe-template-repository-1779952/).
 * It was converted into Java from its original schematic using the 'Schematic To Java Converter [For Modders]' program
 * by ThisIsMika (http://www.minecraftforum.net/forums/mapping-and-modding/minecraft-tools/2193206-schematic-to-java-converter-for-modders).
 * It has been modified slightly by WhichOnesPink to allow for random variation when generating in the world.
 */
public class TreeSugarMaple extends AppalachiaTree {

    public TreeSugarMaple() {

        super();
        this.setLogBlock(AppalachiaBlocks.log_sugar_maple_01.getDefaultState());
        this.setLeavesBlock(AppalachiaBlocks.leaves_sugar_maple_01.getDefaultState());
        this.setFallenLeavesBlock(AppalachiaBlocks.leaves_sugar_maple_01_fallen.getDefaultState());
        this.setSaplingBlock(AppalachiaBlocks.sapling_sugar_maple_01.getDefaultState());

        this.validGroundBlocks = new ArrayList<IBlockState>(Arrays.asList(Blocks.GRASS.getDefaultState(), Blocks.DIRT.getDefaultState()));

        this.firstBlockOffsetX = 13;
        this.firstBlockOffsetZ = 9;
    }

    @Override
    public boolean generate(World world, Random rand, BlockPos pos) {
        this.init(world, rand, pos);
        this.buildTree(world, pos.getX(), pos.getY() - this.rootDepth(), pos.getZ(), this.logBlock, this.leavesBlock);
        this.generateTreeFromLayers(this.logBlock, this.leavesBlock);
        return true;
    }

    @Override
    public int rootDepth() {
        return 1;
    }

    @Override
    public int opaqueLeavesChance() {
        return 2;
    }

    protected void buildTree(World world, int x, int y, int z, IBlockState log, IBlockState leaves) {

        int currentY = y - 1;

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 0, z + 9),
                new BlockPos(x + 15, y + 0, z + 10),
                new BlockPos(x + 12, y + 0, z + 11)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 1, z + 9),
                new BlockPos(x + 14, y + 1, z + 9),
                new BlockPos(x + 13, y + 1, z + 10),
                new BlockPos(x + 15, y + 1, z + 10),
                new BlockPos(x + 12, y + 1, z + 11)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 2, z + 8),
                new BlockPos(x + 13, y + 2, z + 9),
                new BlockPos(x + 14, y + 2, z + 9),
                new BlockPos(x + 13, y + 2, z + 10),
                new BlockPos(x + 14, y + 2, z + 10),
                new BlockPos(x + 15, y + 2, z + 10),
                new BlockPos(x + 12, y + 2, z + 11)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 3, z + 8),
                new BlockPos(x + 13, y + 3, z + 9),
                new BlockPos(x + 14, y + 3, z + 9),
                new BlockPos(x + 13, y + 3, z + 10),
                new BlockPos(x + 14, y + 3, z + 10),
                new BlockPos(x + 15, y + 3, z + 10),
                new BlockPos(x + 12, y + 3, z + 11)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 4, z + 9),
                new BlockPos(x + 14, y + 4, z + 9),
                new BlockPos(x + 13, y + 4, z + 10),
                new BlockPos(x + 14, y + 4, z + 10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 5, z + 9),
                new BlockPos(x + 14, y + 5, z + 9),
                new BlockPos(x + 13, y + 5, z + 10),
                new BlockPos(x + 14, y + 5, z + 10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 6, z + 9),
                new BlockPos(x + 14, y + 6, z + 9),
                new BlockPos(x + 13, y + 6, z + 10),
                new BlockPos(x + 14, y + 6, z + 10)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 7, z + 9),
                new BlockPos(x + 14, y + 7, z + 9),
                new BlockPos(x + 13, y + 7, z + 10),
                new BlockPos(x + 14, y + 7, z + 10)
            )
            .setLeaves(
                new BlockPos(x + 10, y + 7, z + 10),
                new BlockPos(x + 12, y + 7, z + 10),
                new BlockPos(x + 11, y + 7, z + 11)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 8, z + 9),
                new BlockPos(x + 14, y + 8, z + 9),
                new BlockPos(x + 13, y + 8, z + 10),
                new BlockPos(x + 14, y + 8, z + 10)
            )
            .setLeaves(
                new BlockPos(x + 10, y + 8, z + 8),
                new BlockPos(x + 11, y + 8, z + 9),
                new BlockPos(x + 10, y + 8, z + 10),
                new BlockPos(x + 17, y + 8, z + 11)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 9, z + 9),
                new BlockPos(x + 14, y + 9, z + 9),
                new BlockPos(x + 12, y + 9, z + 10),
                new BlockPos(x + 13, y + 9, z + 10),
                new BlockPos(x + 14, y + 9, z + 10)
            )
            .setLeaves(
                new BlockPos(x + 17, y + 9, z + 7),
                new BlockPos(x + 15, y + 9, z + 8),
                new BlockPos(x + 19, y + 9, z + 8),
                new BlockPos(x + 9, y + 9, z + 9),
                new BlockPos(x + 11, y + 9, z + 9),
                new BlockPos(x + 20, y + 9, z + 9),
                new BlockPos(x + 8, y + 9, z + 10),
                new BlockPos(x + 11, y + 9, z + 10),
                new BlockPos(x + 16, y + 9, z + 10),
                new BlockPos(x + 13, y + 9, z + 11),
                new BlockPos(x + 17, y + 9, z + 13),
                new BlockPos(x + 14, y + 9, z + 15),
                new BlockPos(x + 15, y + 9, z + 15)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 10, z + 9),
                new BlockPos(x + 14, y + 10, z + 9),
                new BlockPos(x + 11, y + 10, z + 10),
                new BlockPos(x + 12, y + 10, z + 10),
                new BlockPos(x + 13, y + 10, z + 10),
                new BlockPos(x + 14, y + 10, z + 10),
                new BlockPos(x + 13, y + 10, z + 11)
            )
            .setLeaves(
                new BlockPos(x + 15, y + 10, z + 7),
                new BlockPos(x + 20, y + 10, z + 7),
                new BlockPos(x + 12, y + 10, z + 8),
                new BlockPos(x + 14, y + 10, z + 8),
                new BlockPos(x + 17, y + 10, z + 8),
                new BlockPos(x + 20, y + 10, z + 8),
                new BlockPos(x + 21, y + 10, z + 8),
                new BlockPos(x + 11, y + 10, z + 9),
                new BlockPos(x + 17, y + 10, z + 9),
                new BlockPos(x + 9, y + 10, z + 10),
                new BlockPos(x + 7, y + 10, z + 11),
                new BlockPos(x + 17, y + 10, z + 11),
                new BlockPos(x + 19, y + 10, z + 11),
                new BlockPos(x + 9, y + 10, z + 12),
                new BlockPos(x + 11, y + 10, z + 12),
                new BlockPos(x + 17, y + 10, z + 13),
                new BlockPos(x + 16, y + 10, z + 14),
                new BlockPos(x + 16, y + 10, z + 15),
                new BlockPos(x + 12, y + 10, z + 16),
                new BlockPos(x + 13, y + 10, z + 18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 13, y + 11, z + 9),
                new BlockPos(x + 14, y + 11, z + 9),
                new BlockPos(x + 10, y + 11, z + 10),
                new BlockPos(x + 13, y + 11, z + 10),
                new BlockPos(x + 14, y + 11, z + 10),
                new BlockPos(x + 13, y + 11, z + 12)
            )
            .setLeaves(
                new BlockPos(x + 17, y + 11, z + 5),
                new BlockPos(x + 11, y + 11, z + 7),
                new BlockPos(x + 20, y + 11, z + 8),
                new BlockPos(x + 6, y + 11, z + 9),
                new BlockPos(x + 11, y + 11, z + 9),
                new BlockPos(x + 8, y + 11, z + 10),
                new BlockPos(x + 9, y + 11, z + 10),
                new BlockPos(x + 9, y + 11, z + 11),
                new BlockPos(x + 17, y + 11, z + 11),
                new BlockPos(x + 18, y + 11, z + 11),
                new BlockPos(x + 7, y + 11, z + 12),
                new BlockPos(x + 14, y + 11, z + 12),
                new BlockPos(x + 15, y + 11, z + 12),
                new BlockPos(x + 18, y + 11, z + 12),
                new BlockPos(x + 16, y + 11, z + 13),
                new BlockPos(x + 14, y + 11, z + 14),
                new BlockPos(x + 15, y + 11, z + 14),
                new BlockPos(x + 17, y + 11, z + 14),
                new BlockPos(x + 19, y + 11, z + 14),
                new BlockPos(x + 5, y + 11, z + 15),
                new BlockPos(x + 6, y + 11, z + 15),
                new BlockPos(x + 17, y + 11, z + 15),
                new BlockPos(x + 15, y + 11, z + 18),
                new BlockPos(x + 16, y + 11, z + 18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 12, y + 12, z + 8),
                new BlockPos(x + 14, y + 12, z + 9),
                new BlockPos(x + 13, y + 12, z + 10),
                new BlockPos(x + 14, y + 12, z + 10),
                new BlockPos(x + 9, y + 12, z + 11),
                new BlockPos(x + 13, y + 12, z + 13)
            )
            .setLeaves(
                new BlockPos(x + 17, y + 12, z + 5),
                new BlockPos(x + 15, y + 12, z + 7),
                new BlockPos(x + 18, y + 12, z + 7),
                new BlockPos(x + 10, y + 12, z + 8),
                new BlockPos(x + 11, y + 12, z + 8),
                new BlockPos(x + 14, y + 12, z + 8),
                new BlockPos(x + 15, y + 12, z + 8),
                new BlockPos(x + 16, y + 12, z + 8),
                new BlockPos(x + 17, y + 12, z + 8),
                new BlockPos(x + 19, y + 12, z + 8),
                new BlockPos(x + 20, y + 12, z + 8),
                new BlockPos(x + 9, y + 12, z + 9),
                new BlockPos(x + 12, y + 12, z + 9),
                new BlockPos(x + 8, y + 12, z + 10),
                new BlockPos(x + 10, y + 12, z + 10),
                new BlockPos(x + 15, y + 12, z + 10),
                new BlockPos(x + 17, y + 12, z + 10),
                new BlockPos(x + 18, y + 12, z + 10),
                new BlockPos(x + 20, y + 12, z + 10),
                new BlockPos(x + 5, y + 12, z + 11),
                new BlockPos(x + 10, y + 12, z + 11),
                new BlockPos(x + 11, y + 12, z + 11),
                new BlockPos(x + 19, y + 12, z + 11),
                new BlockPos(x + 8, y + 12, z + 12),
                new BlockPos(x + 16, y + 12, z + 12),
                new BlockPos(x + 17, y + 12, z + 12),
                new BlockPos(x + 19, y + 12, z + 12),
                new BlockPos(x + 20, y + 12, z + 12),
                new BlockPos(x + 8, y + 12, z + 13),
                new BlockPos(x + 17, y + 12, z + 13),
                new BlockPos(x + 13, y + 12, z + 14),
                new BlockPos(x + 14, y + 12, z + 14),
                new BlockPos(x + 16, y + 12, z + 14),
                new BlockPos(x + 17, y + 12, z + 14),
                new BlockPos(x + 6, y + 12, z + 15),
                new BlockPos(x + 15, y + 12, z + 15),
                new BlockPos(x + 17, y + 12, z + 15),
                new BlockPos(x + 6, y + 12, z + 16),
                new BlockPos(x + 12, y + 12, z + 16),
                new BlockPos(x + 13, y + 12, z + 16),
                new BlockPos(x + 15, y + 12, z + 16),
                new BlockPos(x + 16, y + 12, z + 16),
                new BlockPos(x + 18, y + 12, z + 16),
                new BlockPos(x + 8, y + 12, z + 17),
                new BlockPos(x + 12, y + 12, z + 17),
                new BlockPos(x + 14, y + 12, z + 17),
                new BlockPos(x + 16, y + 12, z + 17),
                new BlockPos(x + 9, y + 12, z + 18),
                new BlockPos(x + 12, y + 12, z + 18),
                new BlockPos(x + 13, y + 12, z + 18),
                new BlockPos(x + 14, y + 12, z + 18),
                new BlockPos(x + 14, y + 12, z + 19)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 12, y + 13, z + 8),
                new BlockPos(x + 15, y + 13, z + 9),
                new BlockPos(x + 13, y + 13, z + 10),
                new BlockPos(x + 8, y + 13, z + 11),
                new BlockPos(x + 15, y + 13, z + 11),
                new BlockPos(x + 13, y + 13, z + 13)
            )
            .setLeaves(
                new BlockPos(x + 18, y + 13, z + 5),
                new BlockPos(x + 16, y + 13, z + 6),
                new BlockPos(x + 17, y + 13, z + 6),
                new BlockPos(x + 6, y + 13, z + 7),
                new BlockPos(x + 10, y + 13, z + 7),
                new BlockPos(x + 12, y + 13, z + 7),
                new BlockPos(x + 13, y + 13, z + 7),
                new BlockPos(x + 18, y + 13, z + 7),
                new BlockPos(x + 6, y + 13, z + 8),
                new BlockPos(x + 9, y + 13, z + 8),
                new BlockPos(x + 10, y + 13, z + 8),
                new BlockPos(x + 14, y + 13, z + 8),
                new BlockPos(x + 15, y + 13, z + 8),
                new BlockPos(x + 17, y + 13, z + 8),
                new BlockPos(x + 19, y + 13, z + 8),
                new BlockPos(x + 20, y + 13, z + 8),
                new BlockPos(x + 9, y + 13, z + 9),
                new BlockPos(x + 14, y + 13, z + 9),
                new BlockPos(x + 17, y + 13, z + 9),
                new BlockPos(x + 18, y + 13, z + 9),
                new BlockPos(x + 20, y + 13, z + 9),
                new BlockPos(x + 5, y + 13, z + 10),
                new BlockPos(x + 8, y + 13, z + 10),
                new BlockPos(x + 9, y + 13, z + 10),
                new BlockPos(x + 16, y + 13, z + 10),
                new BlockPos(x + 18, y + 13, z + 10),
                new BlockPos(x + 5, y + 13, z + 11),
                new BlockPos(x + 7, y + 13, z + 11),
                new BlockPos(x + 11, y + 13, z + 11),
                new BlockPos(x + 12, y + 13, z + 11),
                new BlockPos(x + 13, y + 13, z + 11),
                new BlockPos(x + 17, y + 13, z + 11),
                new BlockPos(x + 7, y + 13, z + 12),
                new BlockPos(x + 8, y + 13, z + 12),
                new BlockPos(x + 6, y + 13, z + 13),
                new BlockPos(x + 14, y + 13, z + 13),
                new BlockPos(x + 6, y + 13, z + 14),
                new BlockPos(x + 13, y + 13, z + 14),
                new BlockPos(x + 17, y + 13, z + 14),
                new BlockPos(x + 8, y + 13, z + 15),
                new BlockPos(x + 13, y + 13, z + 15),
                new BlockPos(x + 14, y + 13, z + 15),
                new BlockPos(x + 15, y + 13, z + 15),
                new BlockPos(x + 16, y + 13, z + 15),
                new BlockPos(x + 17, y + 13, z + 15),
                new BlockPos(x + 8, y + 13, z + 16),
                new BlockPos(x + 11, y + 13, z + 16),
                new BlockPos(x + 12, y + 13, z + 16),
                new BlockPos(x + 13, y + 13, z + 16),
                new BlockPos(x + 14, y + 13, z + 16),
                new BlockPos(x + 4, y + 13, z + 17),
                new BlockPos(x + 7, y + 13, z + 17),
                new BlockPos(x + 12, y + 13, z + 17),
                new BlockPos(x + 16, y + 13, z + 17),
                new BlockPos(x + 6, y + 13, z + 18),
                new BlockPos(x + 8, y + 13, z + 19),
                new BlockPos(x + 9, y + 13, z + 19)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 12, y + 14, z + 8),
                new BlockPos(x + 15, y + 14, z + 9),
                new BlockPos(x + 13, y + 14, z + 11),
                new BlockPos(x + 15, y + 14, z + 11),
                new BlockPos(x + 7, y + 14, z + 12),
                new BlockPos(x + 14, y + 14, z + 14)
            )
            .setLeaves(
                new BlockPos(x + 6, y + 14, z + 1),
                new BlockPos(x + 17, y + 14, z + 2),
                new BlockPos(x + 15, y + 14, z + 3),
                new BlockPos(x + 16, y + 14, z + 4),
                new BlockPos(x + 12, y + 14, z + 5),
                new BlockPos(x + 15, y + 14, z + 5),
                new BlockPos(x + 17, y + 14, z + 5),
                new BlockPos(x + 12, y + 14, z + 6),
                new BlockPos(x + 14, y + 14, z + 6),
                new BlockPos(x + 15, y + 14, z + 6),
                new BlockPos(x + 17, y + 14, z + 6),
                new BlockPos(x + 10, y + 14, z + 7),
                new BlockPos(x + 14, y + 14, z + 7),
                new BlockPos(x + 7, y + 14, z + 8),
                new BlockPos(x + 14, y + 14, z + 8),
                new BlockPos(x + 16, y + 14, z + 8),
                new BlockPos(x + 19, y + 14, z + 8),
                new BlockPos(x + 5, y + 14, z + 9),
                new BlockPos(x + 14, y + 14, z + 9),
                new BlockPos(x + 16, y + 14, z + 9),
                new BlockPos(x + 17, y + 14, z + 9),
                new BlockPos(x + 14, y + 14, z + 10),
                new BlockPos(x + 5, y + 14, z + 11),
                new BlockPos(x + 6, y + 14, z + 11),
                new BlockPos(x + 17, y + 14, z + 11),
                new BlockPos(x + 6, y + 14, z + 12),
                new BlockPos(x + 10, y + 14, z + 12),
                new BlockPos(x + 15, y + 14, z + 12),
                new BlockPos(x + 16, y + 14, z + 12),
                new BlockPos(x + 19, y + 14, z + 12),
                new BlockPos(x + 4, y + 14, z + 13),
                new BlockPos(x + 8, y + 14, z + 13),
                new BlockPos(x + 10, y + 14, z + 13),
                new BlockPos(x + 13, y + 14, z + 13),
                new BlockPos(x + 16, y + 14, z + 13),
                new BlockPos(x + 3, y + 14, z + 14),
                new BlockPos(x + 8, y + 14, z + 14),
                new BlockPos(x + 9, y + 14, z + 14),
                new BlockPos(x + 10, y + 14, z + 14),
                new BlockPos(x + 6, y + 14, z + 15),
                new BlockPos(x + 7, y + 14, z + 15),
                new BlockPos(x + 12, y + 14, z + 15),
                new BlockPos(x + 14, y + 14, z + 15),
                new BlockPos(x + 17, y + 14, z + 15),
                new BlockPos(x + 3, y + 14, z + 16),
                new BlockPos(x + 5, y + 14, z + 16),
                new BlockPos(x + 9, y + 14, z + 16),
                new BlockPos(x + 4, y + 14, z + 17),
                new BlockPos(x + 6, y + 14, z + 17),
                new BlockPos(x + 7, y + 14, z + 18),
                new BlockPos(x + 9, y + 14, z + 18),
                new BlockPos(x + 13, y + 14, z + 18),
                new BlockPos(x + 15, y + 14, z + 18),
                new BlockPos(x + 6, y + 14, z + 19),
                new BlockPos(x + 7, y + 14, z + 19),
                new BlockPos(x + 11, y + 14, z + 19)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 11, y + 15, z + 8),
                new BlockPos(x + 16, y + 15, z + 8),
                new BlockPos(x + 13, y + 15, z + 11),
                new BlockPos(x + 7, y + 15, z + 12),
                new BlockPos(x + 16, y + 15, z + 12),
                new BlockPos(x + 14, y + 15, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 7, y + 15, z + 0),
                new BlockPos(x + 15, y + 15, z + 0),
                new BlockPos(x + 6, y + 15, z + 1),
                new BlockPos(x + 7, y + 15, z + 1),
                new BlockPos(x + 15, y + 15, z + 1),
                new BlockPos(x + 8, y + 15, z + 2),
                new BlockPos(x + 15, y + 15, z + 2),
                new BlockPos(x + 5, y + 15, z + 3),
                new BlockPos(x + 8, y + 15, z + 3),
                new BlockPos(x + 13, y + 15, z + 3),
                new BlockPos(x + 15, y + 15, z + 3),
                new BlockPos(x + 18, y + 15, z + 3),
                new BlockPos(x + 6, y + 15, z + 4),
                new BlockPos(x + 7, y + 15, z + 4),
                new BlockPos(x + 15, y + 15, z + 4),
                new BlockPos(x + 5, y + 15, z + 5),
                new BlockPos(x + 15, y + 15, z + 5),
                new BlockPos(x + 16, y + 15, z + 5),
                new BlockPos(x + 18, y + 15, z + 5),
                new BlockPos(x + 6, y + 15, z + 6),
                new BlockPos(x + 10, y + 15, z + 6),
                new BlockPos(x + 11, y + 15, z + 6),
                new BlockPos(x + 13, y + 15, z + 6),
                new BlockPos(x + 16, y + 15, z + 6),
                new BlockPos(x + 17, y + 15, z + 6),
                new BlockPos(x + 18, y + 15, z + 6),
                new BlockPos(x + 19, y + 15, z + 6),
                new BlockPos(x + 8, y + 15, z + 7),
                new BlockPos(x + 10, y + 15, z + 7),
                new BlockPos(x + 12, y + 15, z + 7),
                new BlockPos(x + 20, y + 15, z + 7),
                new BlockPos(x + 6, y + 15, z + 8),
                new BlockPos(x + 12, y + 15, z + 8),
                new BlockPos(x + 13, y + 15, z + 8),
                new BlockPos(x + 12, y + 15, z + 10),
                new BlockPos(x + 14, y + 15, z + 10),
                new BlockPos(x + 3, y + 15, z + 11),
                new BlockPos(x + 4, y + 15, z + 11),
                new BlockPos(x + 7, y + 15, z + 11),
                new BlockPos(x + 10, y + 15, z + 11),
                new BlockPos(x + 15, y + 15, z + 11),
                new BlockPos(x + 19, y + 15, z + 11),
                new BlockPos(x + 3, y + 15, z + 12),
                new BlockPos(x + 6, y + 15, z + 12),
                new BlockPos(x + 13, y + 15, z + 12),
                new BlockPos(x + 17, y + 15, z + 12),
                new BlockPos(x + 19, y + 15, z + 12),
                new BlockPos(x + 4, y + 15, z + 13),
                new BlockPos(x + 5, y + 15, z + 13),
                new BlockPos(x + 6, y + 15, z + 13),
                new BlockPos(x + 7, y + 15, z + 13),
                new BlockPos(x + 9, y + 15, z + 13),
                new BlockPos(x + 10, y + 15, z + 13),
                new BlockPos(x + 14, y + 15, z + 13),
                new BlockPos(x + 16, y + 15, z + 13),
                new BlockPos(x + 18, y + 15, z + 13),
                new BlockPos(x + 4, y + 15, z + 14),
                new BlockPos(x + 7, y + 15, z + 14),
                new BlockPos(x + 14, y + 15, z + 14),
                new BlockPos(x + 11, y + 15, z + 15),
                new BlockPos(x + 15, y + 15, z + 15),
                new BlockPos(x + 16, y + 15, z + 15),
                new BlockPos(x + 5, y + 15, z + 16),
                new BlockPos(x + 8, y + 15, z + 16),
                new BlockPos(x + 11, y + 15, z + 16),
                new BlockPos(x + 12, y + 15, z + 16),
                new BlockPos(x + 13, y + 15, z + 16),
                new BlockPos(x + 15, y + 15, z + 16),
                new BlockPos(x + 4, y + 15, z + 17),
                new BlockPos(x + 8, y + 15, z + 17),
                new BlockPos(x + 11, y + 15, z + 17),
                new BlockPos(x + 12, y + 15, z + 17),
                new BlockPos(x + 13, y + 15, z + 17),
                new BlockPos(x + 6, y + 15, z + 18),
                new BlockPos(x + 7, y + 15, z + 18),
                new BlockPos(x + 11, y + 15, z + 18),
                new BlockPos(x + 15, y + 15, z + 18),
                new BlockPos(x + 8, y + 15, z + 19),
                new BlockPos(x + 10, y + 15, z + 19),
                new BlockPos(x + 7, y + 15, z + 20)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 17, y + 16, z + 7),
                new BlockPos(x + 11, y + 16, z + 8),
                new BlockPos(x + 16, y + 16, z + 8),
                new BlockPos(x + 12, y + 16, z + 11),
                new BlockPos(x + 6, y + 16, z + 12),
                new BlockPos(x + 16, y + 16, z + 12),
                new BlockPos(x + 13, y + 16, z + 16)
            )
            .setLeaves(
                new BlockPos(x + 17, y + 16, z + 0),
                new BlockPos(x + 7, y + 16, z + 1),
                new BlockPos(x + 8, y + 16, z + 1),
                new BlockPos(x + 13, y + 16, z + 1),
                new BlockPos(x + 17, y + 16, z + 1),
                new BlockPos(x + 8, y + 16, z + 2),
                new BlockPos(x + 9, y + 16, z + 2),
                new BlockPos(x + 12, y + 16, z + 2),
                new BlockPos(x + 17, y + 16, z + 2),
                new BlockPos(x + 18, y + 16, z + 2),
                new BlockPos(x + 5, y + 16, z + 3),
                new BlockPos(x + 8, y + 16, z + 3),
                new BlockPos(x + 9, y + 16, z + 3),
                new BlockPos(x + 13, y + 16, z + 3),
                new BlockPos(x + 18, y + 16, z + 3),
                new BlockPos(x + 17, y + 16, z + 4),
                new BlockPos(x + 6, y + 16, z + 5),
                new BlockPos(x + 9, y + 16, z + 5),
                new BlockPos(x + 18, y + 16, z + 5),
                new BlockPos(x + 19, y + 16, z + 5),
                new BlockPos(x + 6, y + 16, z + 6),
                new BlockPos(x + 15, y + 16, z + 6),
                new BlockPos(x + 16, y + 16, z + 6),
                new BlockPos(x + 6, y + 16, z + 7),
                new BlockPos(x + 9, y + 16, z + 7),
                new BlockPos(x + 14, y + 16, z + 7),
                new BlockPos(x + 16, y + 16, z + 7),
                new BlockPos(x + 18, y + 16, z + 7),
                new BlockPos(x + 12, y + 16, z + 8),
                new BlockPos(x + 17, y + 16, z + 8),
                new BlockPos(x + 5, y + 16, z + 9),
                new BlockPos(x + 11, y + 16, z + 9),
                new BlockPos(x + 12, y + 16, z + 9),
                new BlockPos(x + 16, y + 16, z + 9),
                new BlockPos(x + 17, y + 16, z + 9),
                new BlockPos(x + 18, y + 16, z + 9),
                new BlockPos(x + 7, y + 16, z + 10),
                new BlockPos(x + 16, y + 16, z + 10),
                new BlockPos(x + 2, y + 16, z + 11),
                new BlockPos(x + 7, y + 16, z + 11),
                new BlockPos(x + 9, y + 16, z + 11),
                new BlockPos(x + 14, y + 16, z + 11),
                new BlockPos(x + 2, y + 16, z + 12),
                new BlockPos(x + 9, y + 16, z + 12),
                new BlockPos(x + 14, y + 16, z + 12),
                new BlockPos(x + 7, y + 16, z + 13),
                new BlockPos(x + 11, y + 16, z + 13),
                new BlockPos(x + 5, y + 16, z + 14),
                new BlockPos(x + 11, y + 16, z + 14),
                new BlockPos(x + 13, y + 16, z + 14),
                new BlockPos(x + 14, y + 16, z + 14),
                new BlockPos(x + 16, y + 16, z + 14),
                new BlockPos(x + 18, y + 16, z + 14),
                new BlockPos(x + 7, y + 16, z + 15),
                new BlockPos(x + 11, y + 16, z + 15),
                new BlockPos(x + 13, y + 16, z + 15),
                new BlockPos(x + 8, y + 16, z + 17),
                new BlockPos(x + 9, y + 16, z + 17),
                new BlockPos(x + 11, y + 16, z + 17),
                new BlockPos(x + 12, y + 16, z + 17),
                new BlockPos(x + 11, y + 16, z + 19),
                new BlockPos(x + 13, y + 16, z + 19),
                new BlockPos(x + 14, y + 16, z + 19),
                new BlockPos(x + 15, y + 16, z + 19),
                new BlockPos(x + 8, y + 16, z + 20)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 18, y + 17, z + 6),
                new BlockPos(x + 11, y + 17, z + 8),
                new BlockPos(x + 16, y + 17, z + 8),
                new BlockPos(x + 5, y + 17, z + 11),
                new BlockPos(x + 12, y + 17, z + 11),
                new BlockPos(x + 6, y + 17, z + 12),
                new BlockPos(x + 12, y + 17, z + 12),
                new BlockPos(x + 16, y + 17, z + 12),
                new BlockPos(x + 12, y + 17, z + 13),
                new BlockPos(x + 13, y + 17, z + 17)
            )
            .setLeaves(
                new BlockPos(x + 8, y + 17, z + 0),
                new BlockPos(x + 13, y + 17, z + 0),
                new BlockPos(x + 14, y + 17, z + 0),
                new BlockPos(x + 15, y + 17, z + 0),
                new BlockPos(x + 16, y + 17, z + 0),
                new BlockPos(x + 6, y + 17, z + 1),
                new BlockPos(x + 6, y + 17, z + 2),
                new BlockPos(x + 12, y + 17, z + 2),
                new BlockPos(x + 13, y + 17, z + 2),
                new BlockPos(x + 14, y + 17, z + 2),
                new BlockPos(x + 6, y + 17, z + 3),
                new BlockPos(x + 9, y + 17, z + 3),
                new BlockPos(x + 14, y + 17, z + 4),
                new BlockPos(x + 15, y + 17, z + 4),
                new BlockPos(x + 16, y + 17, z + 4),
                new BlockPos(x + 17, y + 17, z + 4),
                new BlockPos(x + 19, y + 17, z + 4),
                new BlockPos(x + 20, y + 17, z + 5),
                new BlockPos(x + 9, y + 17, z + 6),
                new BlockPos(x + 14, y + 17, z + 6),
                new BlockPos(x + 19, y + 17, z + 6),
                new BlockPos(x + 19, y + 17, z + 7),
                new BlockPos(x + 5, y + 17, z + 8),
                new BlockPos(x + 9, y + 17, z + 8),
                new BlockPos(x + 20, y + 17, z + 8),
                new BlockPos(x + 4, y + 17, z + 9),
                new BlockPos(x + 5, y + 17, z + 9),
                new BlockPos(x + 15, y + 17, z + 9),
                new BlockPos(x + 19, y + 17, z + 9),
                new BlockPos(x + 2, y + 17, z + 10),
                new BlockPos(x + 4, y + 17, z + 10),
                new BlockPos(x + 6, y + 17, z + 10),
                new BlockPos(x + 7, y + 17, z + 10),
                new BlockPos(x + 8, y + 17, z + 10),
                new BlockPos(x + 11, y + 17, z + 10),
                new BlockPos(x + 16, y + 17, z + 10),
                new BlockPos(x + 18, y + 17, z + 10),
                new BlockPos(x + 4, y + 17, z + 11),
                new BlockPos(x + 15, y + 17, z + 11),
                new BlockPos(x + 18, y + 17, z + 11),
                new BlockPos(x + 5, y + 17, z + 12),
                new BlockPos(x + 16, y + 17, z + 13),
                new BlockPos(x + 4, y + 17, z + 14),
                new BlockPos(x + 7, y + 17, z + 14),
                new BlockPos(x + 10, y + 17, z + 14),
                new BlockPos(x + 13, y + 17, z + 14),
                new BlockPos(x + 14, y + 17, z + 14),
                new BlockPos(x + 17, y + 17, z + 14),
                new BlockPos(x + 4, y + 17, z + 15),
                new BlockPos(x + 13, y + 17, z + 15),
                new BlockPos(x + 4, y + 17, z + 16),
                new BlockPos(x + 5, y + 17, z + 16),
                new BlockPos(x + 7, y + 17, z + 16),
                new BlockPos(x + 14, y + 17, z + 16),
                new BlockPos(x + 8, y + 17, z + 17),
                new BlockPos(x + 9, y + 17, z + 17),
                new BlockPos(x + 10, y + 17, z + 17),
                new BlockPos(x + 16, y + 17, z + 17),
                new BlockPos(x + 6, y + 17, z + 19),
                new BlockPos(x + 8, y + 17, z + 19),
                new BlockPos(x + 9, y + 17, z + 20)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 17, y + 18, z + 5),
                new BlockPos(x + 18, y + 18, z + 6),
                new BlockPos(x + 11, y + 18, z + 7),
                new BlockPos(x + 17, y + 18, z + 8),
                new BlockPos(x + 4, y + 18, z + 10),
                new BlockPos(x + 12, y + 18, z + 11),
                new BlockPos(x + 17, y + 18, z + 12),
                new BlockPos(x + 5, y + 18, z + 13),
                new BlockPos(x + 15, y + 18, z + 13),
                new BlockPos(x + 11, y + 18, z + 14),
                new BlockPos(x + 13, y + 18, z + 17)
            )
            .setLeaves(
                new BlockPos(x + 8, y + 18, z + 0),
                new BlockPos(x + 13, y + 18, z + 0),
                new BlockPos(x + 8, y + 18, z + 1),
                new BlockPos(x + 10, y + 18, z + 1),
                new BlockPos(x + 18, y + 18, z + 1),
                new BlockPos(x + 5, y + 18, z + 2),
                new BlockPos(x + 6, y + 18, z + 2),
                new BlockPos(x + 8, y + 18, z + 2),
                new BlockPos(x + 9, y + 18, z + 2),
                new BlockPos(x + 14, y + 18, z + 2),
                new BlockPos(x + 16, y + 18, z + 2),
                new BlockPos(x + 7, y + 18, z + 3),
                new BlockPos(x + 9, y + 18, z + 3),
                new BlockPos(x + 15, y + 18, z + 3),
                new BlockPos(x + 17, y + 18, z + 3),
                new BlockPos(x + 18, y + 18, z + 3),
                new BlockPos(x + 7, y + 18, z + 5),
                new BlockPos(x + 8, y + 18, z + 5),
                new BlockPos(x + 12, y + 18, z + 5),
                new BlockPos(x + 19, y + 18, z + 5),
                new BlockPos(x + 21, y + 18, z + 5),
                new BlockPos(x + 7, y + 18, z + 6),
                new BlockPos(x + 11, y + 18, z + 6),
                new BlockPos(x + 12, y + 18, z + 6),
                new BlockPos(x + 13, y + 18, z + 6),
                new BlockPos(x + 16, y + 18, z + 6),
                new BlockPos(x + 10, y + 18, z + 7),
                new BlockPos(x + 13, y + 18, z + 7),
                new BlockPos(x + 14, y + 18, z + 7),
                new BlockPos(x + 18, y + 18, z + 7),
                new BlockPos(x + 4, y + 18, z + 8),
                new BlockPos(x + 12, y + 18, z + 8),
                new BlockPos(x + 13, y + 18, z + 8),
                new BlockPos(x + 14, y + 18, z + 8),
                new BlockPos(x + 4, y + 18, z + 9),
                new BlockPos(x + 6, y + 18, z + 9),
                new BlockPos(x + 2, y + 18, z + 10),
                new BlockPos(x + 11, y + 18, z + 10),
                new BlockPos(x + 5, y + 18, z + 11),
                new BlockPos(x + 8, y + 18, z + 11),
                new BlockPos(x + 16, y + 18, z + 11),
                new BlockPos(x + 17, y + 18, z + 11),
                new BlockPos(x + 18, y + 18, z + 11),
                new BlockPos(x + 20, y + 18, z + 11),
                new BlockPos(x + 18, y + 18, z + 12),
                new BlockPos(x + 20, y + 18, z + 12),
                new BlockPos(x + 6, y + 18, z + 13),
                new BlockPos(x + 20, y + 18, z + 13),
                new BlockPos(x + 13, y + 18, z + 14),
                new BlockPos(x + 14, y + 18, z + 14),
                new BlockPos(x + 15, y + 18, z + 14),
                new BlockPos(x + 16, y + 18, z + 14),
                new BlockPos(x + 18, y + 18, z + 14),
                new BlockPos(x + 20, y + 18, z + 14),
                new BlockPos(x + 4, y + 18, z + 15),
                new BlockPos(x + 5, y + 18, z + 15),
                new BlockPos(x + 13, y + 18, z + 15),
                new BlockPos(x + 14, y + 18, z + 15),
                new BlockPos(x + 19, y + 18, z + 15),
                new BlockPos(x + 3, y + 18, z + 16),
                new BlockPos(x + 4, y + 18, z + 16),
                new BlockPos(x + 5, y + 18, z + 16),
                new BlockPos(x + 7, y + 18, z + 16),
                new BlockPos(x + 11, y + 18, z + 16),
                new BlockPos(x + 12, y + 18, z + 16),
                new BlockPos(x + 13, y + 18, z + 16),
                new BlockPos(x + 14, y + 18, z + 16),
                new BlockPos(x + 20, y + 18, z + 16),
                new BlockPos(x + 8, y + 18, z + 17),
                new BlockPos(x + 15, y + 18, z + 17),
                new BlockPos(x + 16, y + 18, z + 17),
                new BlockPos(x + 5, y + 18, z + 18),
                new BlockPos(x + 6, y + 18, z + 18),
                new BlockPos(x + 8, y + 18, z + 18),
                new BlockPos(x + 16, y + 18, z + 18),
                new BlockPos(x + 18, y + 18, z + 18),
                new BlockPos(x + 6, y + 18, z + 19),
                new BlockPos(x + 12, y + 18, z + 19),
                new BlockPos(x + 6, y + 18, z + 20),
                new BlockPos(x + 7, y + 18, z + 20),
                new BlockPos(x + 10, y + 18, z + 20),
                new BlockPos(x + 13, y + 18, z + 20)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 16, y + 19, z + 4),
                new BlockPos(x + 19, y + 19, z + 5),
                new BlockPos(x + 11, y + 19, z + 7),
                new BlockPos(x + 17, y + 19, z + 8),
                new BlockPos(x + 4, y + 19, z + 10),
                new BlockPos(x + 18, y + 19, z + 11),
                new BlockPos(x + 12, y + 19, z + 12),
                new BlockPos(x + 5, y + 19, z + 13),
                new BlockPos(x + 15, y + 19, z + 13),
                new BlockPos(x + 11, y + 19, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 8, y + 19, z + 1),
                new BlockPos(x + 8, y + 19, z + 2),
                new BlockPos(x + 18, y + 19, z + 2),
                new BlockPos(x + 5, y + 19, z + 3),
                new BlockPos(x + 8, y + 19, z + 3),
                new BlockPos(x + 19, y + 19, z + 3),
                new BlockPos(x + 6, y + 19, z + 4),
                new BlockPos(x + 8, y + 19, z + 4),
                new BlockPos(x + 10, y + 19, z + 5),
                new BlockPos(x + 11, y + 19, z + 5),
                new BlockPos(x + 17, y + 19, z + 5),
                new BlockPos(x + 10, y + 19, z + 6),
                new BlockPos(x + 16, y + 19, z + 6),
                new BlockPos(x + 20, y + 19, z + 6),
                new BlockPos(x + 21, y + 19, z + 6),
                new BlockPos(x + 14, y + 19, z + 7),
                new BlockPos(x + 17, y + 19, z + 7),
                new BlockPos(x + 2, y + 19, z + 8),
                new BlockPos(x + 9, y + 19, z + 8),
                new BlockPos(x + 4, y + 19, z + 9),
                new BlockPos(x + 18, y + 19, z + 9),
                new BlockPos(x + 20, y + 19, z + 9),
                new BlockPos(x + 7, y + 19, z + 10),
                new BlockPos(x + 2, y + 19, z + 11),
                new BlockPos(x + 20, y + 19, z + 11),
                new BlockPos(x + 18, y + 19, z + 12),
                new BlockPos(x + 4, y + 19, z + 13),
                new BlockPos(x + 17, y + 19, z + 13),
                new BlockPos(x + 21, y + 19, z + 13),
                new BlockPos(x + 2, y + 19, z + 14),
                new BlockPos(x + 5, y + 19, z + 14),
                new BlockPos(x + 6, y + 19, z + 14),
                new BlockPos(x + 12, y + 19, z + 14),
                new BlockPos(x + 16, y + 19, z + 14),
                new BlockPos(x + 18, y + 19, z + 14),
                new BlockPos(x + 3, y + 19, z + 15),
                new BlockPos(x + 4, y + 19, z + 15),
                new BlockPos(x + 21, y + 19, z + 15),
                new BlockPos(x + 2, y + 19, z + 16),
                new BlockPos(x + 17, y + 19, z + 16),
                new BlockPos(x + 18, y + 19, z + 16),
                new BlockPos(x + 20, y + 19, z + 16),
                new BlockPos(x + 8, y + 19, z + 17),
                new BlockPos(x + 10, y + 19, z + 17),
                new BlockPos(x + 15, y + 19, z + 17),
                new BlockPos(x + 19, y + 19, z + 17),
                new BlockPos(x + 3, y + 19, z + 18),
                new BlockPos(x + 6, y + 19, z + 18),
                new BlockPos(x + 9, y + 19, z + 18),
                new BlockPos(x + 14, y + 19, z + 18),
                new BlockPos(x + 18, y + 19, z + 18),
                new BlockPos(x + 19, y + 19, z + 18),
                new BlockPos(x + 4, y + 19, z + 19),
                new BlockPos(x + 15, y + 19, z + 19),
                new BlockPos(x + 19, y + 19, z + 19),
                new BlockPos(x + 11, y + 19, z + 20),
                new BlockPos(x + 12, y + 19, z + 20),
                new BlockPos(x + 9, y + 19, z + 23)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 15, y + 20, z + 3),
                new BlockPos(x + 19, y + 20, z + 5),
                new BlockPos(x + 11, y + 20, z + 6),
                new BlockPos(x + 11, y + 20, z + 7),
                new BlockPos(x + 18, y + 20, z + 7),
                new BlockPos(x + 4, y + 20, z + 9),
                new BlockPos(x + 18, y + 20, z + 11),
                new BlockPos(x + 12, y + 20, z + 12),
                new BlockPos(x + 15, y + 20, z + 13),
                new BlockPos(x + 4, y + 20, z + 14),
                new BlockPos(x + 11, y + 20, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 8, y + 20, z + 1),
                new BlockPos(x + 9, y + 20, z + 1),
                new BlockPos(x + 10, y + 20, z + 1),
                new BlockPos(x + 14, y + 20, z + 1),
                new BlockPos(x + 16, y + 20, z + 1),
                new BlockPos(x + 14, y + 20, z + 2),
                new BlockPos(x + 19, y + 20, z + 2),
                new BlockPos(x + 6, y + 20, z + 3),
                new BlockPos(x + 8, y + 20, z + 3),
                new BlockPos(x + 18, y + 20, z + 3),
                new BlockPos(x + 21, y + 20, z + 3),
                new BlockPos(x + 7, y + 20, z + 4),
                new BlockPos(x + 8, y + 20, z + 4),
                new BlockPos(x + 10, y + 20, z + 4),
                new BlockPos(x + 15, y + 20, z + 4),
                new BlockPos(x + 17, y + 20, z + 4),
                new BlockPos(x + 19, y + 20, z + 4),
                new BlockPos(x + 6, y + 20, z + 5),
                new BlockPos(x + 7, y + 20, z + 5),
                new BlockPos(x + 12, y + 20, z + 5),
                new BlockPos(x + 18, y + 20, z + 5),
                new BlockPos(x + 22, y + 20, z + 5),
                new BlockPos(x + 4, y + 20, z + 6),
                new BlockPos(x + 5, y + 20, z + 6),
                new BlockPos(x + 12, y + 20, z + 6),
                new BlockPos(x + 15, y + 20, z + 6),
                new BlockPos(x + 18, y + 20, z + 6),
                new BlockPos(x + 20, y + 20, z + 6),
                new BlockPos(x + 21, y + 20, z + 6),
                new BlockPos(x + 2, y + 20, z + 7),
                new BlockPos(x + 3, y + 20, z + 7),
                new BlockPos(x + 7, y + 20, z + 7),
                new BlockPos(x + 17, y + 20, z + 7),
                new BlockPos(x + 20, y + 20, z + 7),
                new BlockPos(x + 3, y + 20, z + 8),
                new BlockPos(x + 7, y + 20, z + 8),
                new BlockPos(x + 9, y + 20, z + 8),
                new BlockPos(x + 11, y + 20, z + 8),
                new BlockPos(x + 18, y + 20, z + 8),
                new BlockPos(x + 19, y + 20, z + 8),
                new BlockPos(x + 5, y + 20, z + 9),
                new BlockPos(x + 18, y + 20, z + 10),
                new BlockPos(x + 2, y + 20, z + 11),
                new BlockPos(x + 15, y + 20, z + 11),
                new BlockPos(x + 17, y + 20, z + 11),
                new BlockPos(x + 21, y + 20, z + 11),
                new BlockPos(x + 3, y + 20, z + 12),
                new BlockPos(x + 20, y + 20, z + 12),
                new BlockPos(x + 18, y + 20, z + 13),
                new BlockPos(x + 19, y + 20, z + 13),
                new BlockPos(x + 20, y + 20, z + 13),
                new BlockPos(x + 21, y + 20, z + 13),
                new BlockPos(x + 2, y + 20, z + 14),
                new BlockPos(x + 5, y + 20, z + 14),
                new BlockPos(x + 6, y + 20, z + 14),
                new BlockPos(x + 17, y + 20, z + 14),
                new BlockPos(x + 18, y + 20, z + 14),
                new BlockPos(x + 1, y + 20, z + 15),
                new BlockPos(x + 7, y + 20, z + 15),
                new BlockPos(x + 12, y + 20, z + 15),
                new BlockPos(x + 17, y + 20, z + 15),
                new BlockPos(x + 18, y + 20, z + 15),
                new BlockPos(x + 20, y + 20, z + 15),
                new BlockPos(x + 21, y + 20, z + 15),
                new BlockPos(x + 3, y + 20, z + 16),
                new BlockPos(x + 5, y + 20, z + 16),
                new BlockPos(x + 7, y + 20, z + 16),
                new BlockPos(x + 8, y + 20, z + 16),
                new BlockPos(x + 18, y + 20, z + 16),
                new BlockPos(x + 4, y + 20, z + 17),
                new BlockPos(x + 9, y + 20, z + 17),
                new BlockPos(x + 17, y + 20, z + 17),
                new BlockPos(x + 21, y + 20, z + 17),
                new BlockPos(x + 6, y + 20, z + 18),
                new BlockPos(x + 7, y + 20, z + 18),
                new BlockPos(x + 9, y + 20, z + 18),
                new BlockPos(x + 10, y + 20, z + 18),
                new BlockPos(x + 13, y + 20, z + 18),
                new BlockPos(x + 3, y + 20, z + 19),
                new BlockPos(x + 15, y + 20, z + 19),
                new BlockPos(x + 16, y + 20, z + 19),
                new BlockPos(x + 19, y + 20, z + 19),
                new BlockPos(x + 6, y + 20, z + 20),
                new BlockPos(x + 9, y + 20, z + 20),
                new BlockPos(x + 11, y + 20, z + 20),
                new BlockPos(x + 19, y + 20, z + 20),
                new BlockPos(x + 9, y + 20, z + 23)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 15, y + 21, z + 3),
                new BlockPos(x + 11, y + 21, z + 5),
                new BlockPos(x + 10, y + 21, z + 7),
                new BlockPos(x + 18, y + 21, z + 7),
                new BlockPos(x + 4, y + 21, z + 9),
                new BlockPos(x + 13, y + 21, z + 11),
                new BlockPos(x + 11, y + 21, z + 13),
                new BlockPos(x + 4, y + 21, z + 14),
                new BlockPos(x + 15, y + 21, z + 14),
                new BlockPos(x + 10, y + 21, z + 16)
            )
            .setLeaves(
                new BlockPos(x + 15, y + 21, z + 0),
                new BlockPos(x + 13, y + 21, z + 1),
                new BlockPos(x + 15, y + 21, z + 1),
                new BlockPos(x + 8, y + 21, z + 2),
                new BlockPos(x + 15, y + 21, z + 2),
                new BlockPos(x + 17, y + 21, z + 2),
                new BlockPos(x + 18, y + 21, z + 2),
                new BlockPos(x + 7, y + 21, z + 3),
                new BlockPos(x + 10, y + 21, z + 3),
                new BlockPos(x + 13, y + 21, z + 3),
                new BlockPos(x + 14, y + 21, z + 3),
                new BlockPos(x + 20, y + 21, z + 3),
                new BlockPos(x + 7, y + 21, z + 4),
                new BlockPos(x + 9, y + 21, z + 4),
                new BlockPos(x + 7, y + 21, z + 5),
                new BlockPos(x + 9, y + 21, z + 5),
                new BlockPos(x + 9, y + 21, z + 6),
                new BlockPos(x + 2, y + 21, z + 7),
                new BlockPos(x + 3, y + 21, z + 7),
                new BlockPos(x + 5, y + 21, z + 7),
                new BlockPos(x + 8, y + 21, z + 7),
                new BlockPos(x + 11, y + 21, z + 7),
                new BlockPos(x + 16, y + 21, z + 7),
                new BlockPos(x + 21, y + 21, z + 7),
                new BlockPos(x + 10, y + 21, z + 8),
                new BlockPos(x + 11, y + 21, z + 8),
                new BlockPos(x + 17, y + 21, z + 8),
                new BlockPos(x + 1, y + 21, z + 9),
                new BlockPos(x + 5, y + 21, z + 9),
                new BlockPos(x + 7, y + 21, z + 9),
                new BlockPos(x + 20, y + 21, z + 9),
                new BlockPos(x + 3, y + 21, z + 10),
                new BlockPos(x + 5, y + 21, z + 10),
                new BlockPos(x + 17, y + 21, z + 10),
                new BlockPos(x + 3, y + 21, z + 11),
                new BlockPos(x + 5, y + 21, z + 11),
                new BlockPos(x + 19, y + 21, z + 11),
                new BlockPos(x + 5, y + 21, z + 12),
                new BlockPos(x + 15, y + 21, z + 12),
                new BlockPos(x + 21, y + 21, z + 12),
                new BlockPos(x + 3, y + 21, z + 14),
                new BlockPos(x + 18, y + 21, z + 14),
                new BlockPos(x + 19, y + 21, z + 14),
                new BlockPos(x + 20, y + 21, z + 14),
                new BlockPos(x + 21, y + 21, z + 14),
                new BlockPos(x + 4, y + 21, z + 15),
                new BlockPos(x + 2, y + 21, z + 16),
                new BlockPos(x + 6, y + 21, z + 16),
                new BlockPos(x + 8, y + 21, z + 16),
                new BlockPos(x + 15, y + 21, z + 16),
                new BlockPos(x + 18, y + 21, z + 16),
                new BlockPos(x + 3, y + 21, z + 17),
                new BlockPos(x + 4, y + 21, z + 17),
                new BlockPos(x + 7, y + 21, z + 17),
                new BlockPos(x + 14, y + 21, z + 17),
                new BlockPos(x + 16, y + 21, z + 17),
                new BlockPos(x + 19, y + 21, z + 17),
                new BlockPos(x + 21, y + 21, z + 17),
                new BlockPos(x + 15, y + 21, z + 18),
                new BlockPos(x + 19, y + 21, z + 18),
                new BlockPos(x + 21, y + 21, z + 18),
                new BlockPos(x + 4, y + 21, z + 19),
                new BlockPos(x + 18, y + 21, z + 19),
                new BlockPos(x + 20, y + 21, z + 19),
                new BlockPos(x + 9, y + 21, z + 20),
                new BlockPos(x + 9, y + 21, z + 22),
                new BlockPos(x + 10, y + 21, z + 22)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 11, y + 22, z + 4),
                new BlockPos(x + 10, y + 22, z + 7),
                new BlockPos(x + 18, y + 22, z + 7),
                new BlockPos(x + 3, y + 22, z + 8),
                new BlockPos(x + 13, y + 22, z + 11),
                new BlockPos(x + 11, y + 22, z + 13),
                new BlockPos(x + 4, y + 22, z + 14),
                new BlockPos(x + 15, y + 22, z + 14),
                new BlockPos(x + 10, y + 22, z + 16)
            )
            .setLeaves(
                new BlockPos(x + 14, y + 22, z + 0),
                new BlockPos(x + 15, y + 22, z + 0),
                new BlockPos(x + 11, y + 22, z + 2),
                new BlockPos(x + 12, y + 22, z + 2),
                new BlockPos(x + 14, y + 22, z + 2),
                new BlockPos(x + 10, y + 22, z + 3),
                new BlockPos(x + 14, y + 22, z + 3),
                new BlockPos(x + 17, y + 22, z + 3),
                new BlockPos(x + 18, y + 22, z + 3),
                new BlockPos(x + 6, y + 22, z + 4),
                new BlockPos(x + 7, y + 22, z + 4),
                new BlockPos(x + 12, y + 22, z + 4),
                new BlockPos(x + 6, y + 22, z + 5),
                new BlockPos(x + 8, y + 22, z + 5),
                new BlockPos(x + 10, y + 22, z + 5),
                new BlockPos(x + 11, y + 22, z + 5),
                new BlockPos(x + 16, y + 22, z + 5),
                new BlockPos(x + 9, y + 22, z + 6),
                new BlockPos(x + 21, y + 22, z + 6),
                new BlockPos(x + 6, y + 22, z + 7),
                new BlockPos(x + 11, y + 22, z + 7),
                new BlockPos(x + 16, y + 22, z + 7),
                new BlockPos(x + 19, y + 22, z + 7),
                new BlockPos(x + 0, y + 22, z + 8),
                new BlockPos(x + 1, y + 22, z + 8),
                new BlockPos(x + 9, y + 22, z + 8),
                new BlockPos(x + 15, y + 22, z + 8),
                new BlockPos(x + 18, y + 22, z + 8),
                new BlockPos(x + 2, y + 22, z + 9),
                new BlockPos(x + 3, y + 22, z + 9),
                new BlockPos(x + 4, y + 22, z + 9),
                new BlockPos(x + 6, y + 22, z + 9),
                new BlockPos(x + 7, y + 22, z + 9),
                new BlockPos(x + 18, y + 22, z + 9),
                new BlockPos(x + 6, y + 22, z + 10),
                new BlockPos(x + 7, y + 22, z + 10),
                new BlockPos(x + 18, y + 22, z + 10),
                new BlockPos(x + 4, y + 22, z + 11),
                new BlockPos(x + 16, y + 22, z + 11),
                new BlockPos(x + 4, y + 22, z + 12),
                new BlockPos(x + 17, y + 22, z + 12),
                new BlockPos(x + 20, y + 22, z + 12),
                new BlockPos(x + 16, y + 22, z + 13),
                new BlockPos(x + 17, y + 22, z + 13),
                new BlockPos(x + 18, y + 22, z + 13),
                new BlockPos(x + 19, y + 22, z + 13),
                new BlockPos(x + 1, y + 22, z + 14),
                new BlockPos(x + 5, y + 22, z + 14),
                new BlockPos(x + 18, y + 22, z + 14),
                new BlockPos(x + 1, y + 22, z + 15),
                new BlockPos(x + 5, y + 22, z + 15),
                new BlockPos(x + 6, y + 22, z + 15),
                new BlockPos(x + 7, y + 22, z + 15),
                new BlockPos(x + 8, y + 22, z + 15),
                new BlockPos(x + 15, y + 22, z + 15),
                new BlockPos(x + 6, y + 22, z + 16),
                new BlockPos(x + 19, y + 22, z + 16),
                new BlockPos(x + 20, y + 22, z + 16),
                new BlockPos(x + 3, y + 22, z + 17),
                new BlockPos(x + 6, y + 22, z + 17),
                new BlockPos(x + 11, y + 22, z + 17),
                new BlockPos(x + 12, y + 22, z + 17),
                new BlockPos(x + 14, y + 22, z + 17),
                new BlockPos(x + 15, y + 22, z + 17),
                new BlockPos(x + 16, y + 22, z + 17),
                new BlockPos(x + 18, y + 22, z + 17),
                new BlockPos(x + 5, y + 22, z + 18),
                new BlockPos(x + 8, y + 22, z + 18),
                new BlockPos(x + 9, y + 22, z + 18),
                new BlockPos(x + 13, y + 22, z + 18),
                new BlockPos(x + 16, y + 22, z + 18),
                new BlockPos(x + 12, y + 22, z + 19),
                new BlockPos(x + 5, y + 22, z + 20),
                new BlockPos(x + 6, y + 22, z + 20),
                new BlockPos(x + 13, y + 22, z + 20),
                new BlockPos(x + 15, y + 22, z + 20),
                new BlockPos(x + 18, y + 22, z + 20),
                new BlockPos(x + 11, y + 22, z + 21)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 11, y + 23, z + 4),
                new BlockPos(x + 10, y + 23, z + 7),
                new BlockPos(x + 3, y + 23, z + 8),
                new BlockPos(x + 13, y + 23, z + 10),
                new BlockPos(x + 11, y + 23, z + 13),
                new BlockPos(x + 15, y + 23, z + 14),
                new BlockPos(x + 11, y + 23, z + 17)
            )
            .setLeaves(
                new BlockPos(x + 12, y + 23, z + 1),
                new BlockPos(x + 10, y + 23, z + 2),
                new BlockPos(x + 13, y + 23, z + 2),
                new BlockPos(x + 16, y + 23, z + 2),
                new BlockPos(x + 8, y + 23, z + 3),
                new BlockPos(x + 7, y + 23, z + 4),
                new BlockPos(x + 9, y + 23, z + 4),
                new BlockPos(x + 10, y + 23, z + 4),
                new BlockPos(x + 14, y + 23, z + 4),
                new BlockPos(x + 15, y + 23, z + 4),
                new BlockPos(x + 16, y + 23, z + 4),
                new BlockPos(x + 17, y + 23, z + 4),
                new BlockPos(x + 19, y + 23, z + 4),
                new BlockPos(x + 20, y + 23, z + 4),
                new BlockPos(x + 3, y + 23, z + 5),
                new BlockPos(x + 9, y + 23, z + 5),
                new BlockPos(x + 10, y + 23, z + 5),
                new BlockPos(x + 19, y + 23, z + 5),
                new BlockPos(x + 20, y + 23, z + 5),
                new BlockPos(x + 3, y + 23, z + 6),
                new BlockPos(x + 9, y + 23, z + 6),
                new BlockPos(x + 11, y + 23, z + 6),
                new BlockPos(x + 18, y + 23, z + 6),
                new BlockPos(x + 3, y + 23, z + 7),
                new BlockPos(x + 4, y + 23, z + 7),
                new BlockPos(x + 7, y + 23, z + 7),
                new BlockPos(x + 8, y + 23, z + 7),
                new BlockPos(x + 9, y + 23, z + 7),
                new BlockPos(x + 11, y + 23, z + 7),
                new BlockPos(x + 12, y + 23, z + 7),
                new BlockPos(x + 15, y + 23, z + 7),
                new BlockPos(x + 18, y + 23, z + 7),
                new BlockPos(x + 1, y + 23, z + 8),
                new BlockPos(x + 2, y + 23, z + 8),
                new BlockPos(x + 4, y + 23, z + 8),
                new BlockPos(x + 6, y + 23, z + 8),
                new BlockPos(x + 18, y + 23, z + 8),
                new BlockPos(x + 20, y + 23, z + 8),
                new BlockPos(x + 5, y + 23, z + 9),
                new BlockPos(x + 6, y + 23, z + 9),
                new BlockPos(x + 8, y + 23, z + 9),
                new BlockPos(x + 17, y + 23, z + 9),
                new BlockPos(x + 19, y + 23, z + 9),
                new BlockPos(x + 1, y + 23, z + 10),
                new BlockPos(x + 6, y + 23, z + 10),
                new BlockPos(x + 17, y + 23, z + 10),
                new BlockPos(x + 18, y + 23, z + 10),
                new BlockPos(x + 2, y + 23, z + 11),
                new BlockPos(x + 15, y + 23, z + 11),
                new BlockPos(x + 16, y + 23, z + 11),
                new BlockPos(x + 17, y + 23, z + 11),
                new BlockPos(x + 19, y + 23, z + 11),
                new BlockPos(x + 21, y + 23, z + 11),
                new BlockPos(x + 15, y + 23, z + 12),
                new BlockPos(x + 18, y + 23, z + 12),
                new BlockPos(x + 2, y + 23, z + 13),
                new BlockPos(x + 4, y + 23, z + 13),
                new BlockPos(x + 6, y + 23, z + 13),
                new BlockPos(x + 16, y + 23, z + 13),
                new BlockPos(x + 18, y + 23, z + 13),
                new BlockPos(x + 2, y + 23, z + 14),
                new BlockPos(x + 5, y + 23, z + 14),
                new BlockPos(x + 7, y + 23, z + 14),
                new BlockPos(x + 17, y + 23, z + 14),
                new BlockPos(x + 18, y + 23, z + 14),
                new BlockPos(x + 3, y + 23, z + 15),
                new BlockPos(x + 4, y + 23, z + 15),
                new BlockPos(x + 5, y + 23, z + 15),
                new BlockPos(x + 13, y + 23, z + 15),
                new BlockPos(x + 15, y + 23, z + 15),
                new BlockPos(x + 16, y + 23, z + 15),
                new BlockPos(x + 3, y + 23, z + 16),
                new BlockPos(x + 6, y + 23, z + 16),
                new BlockPos(x + 9, y + 23, z + 16),
                new BlockPos(x + 13, y + 23, z + 16),
                new BlockPos(x + 15, y + 23, z + 16),
                new BlockPos(x + 7, y + 23, z + 17),
                new BlockPos(x + 10, y + 23, z + 17),
                new BlockPos(x + 12, y + 23, z + 17),
                new BlockPos(x + 18, y + 23, z + 17),
                new BlockPos(x + 12, y + 23, z + 18),
                new BlockPos(x + 6, y + 23, z + 19),
                new BlockPos(x + 8, y + 23, z + 19),
                new BlockPos(x + 10, y + 23, z + 19),
                new BlockPos(x + 13, y + 23, z + 19),
                new BlockPos(x + 15, y + 23, z + 19),
                new BlockPos(x + 9, y + 23, z + 21),
                new BlockPos(x + 14, y + 23, z + 21),
                new BlockPos(x + 13, y + 23, z + 22)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 10, y + 24, z + 6),
                new BlockPos(x + 13, y + 24, z + 10),
                new BlockPos(x + 10, y + 24, z + 14),
                new BlockPos(x + 16, y + 24, z + 14),
                new BlockPos(x + 11, y + 24, z + 17)
            )
            .setLeaves(
                new BlockPos(x + 10, y + 24, z + 3),
                new BlockPos(x + 15, y + 24, z + 3),
                new BlockPos(x + 13, y + 24, z + 4),
                new BlockPos(x + 9, y + 24, z + 5),
                new BlockPos(x + 10, y + 24, z + 5),
                new BlockPos(x + 11, y + 24, z + 5),
                new BlockPos(x + 19, y + 24, z + 5),
                new BlockPos(x + 3, y + 24, z + 6),
                new BlockPos(x + 13, y + 24, z + 6),
                new BlockPos(x + 16, y + 24, z + 6),
                new BlockPos(x + 20, y + 24, z + 6),
                new BlockPos(x + 2, y + 24, z + 7),
                new BlockPos(x + 5, y + 24, z + 7),
                new BlockPos(x + 6, y + 24, z + 7),
                new BlockPos(x + 7, y + 24, z + 7),
                new BlockPos(x + 16, y + 24, z + 7),
                new BlockPos(x + 18, y + 24, z + 7),
                new BlockPos(x + 1, y + 24, z + 8),
                new BlockPos(x + 3, y + 24, z + 8),
                new BlockPos(x + 4, y + 24, z + 8),
                new BlockPos(x + 5, y + 24, z + 8),
                new BlockPos(x + 13, y + 24, z + 8),
                new BlockPos(x + 18, y + 24, z + 8),
                new BlockPos(x + 4, y + 24, z + 9),
                new BlockPos(x + 7, y + 24, z + 9),
                new BlockPos(x + 18, y + 24, z + 9),
                new BlockPos(x + 18, y + 24, z + 10),
                new BlockPos(x + 18, y + 24, z + 11),
                new BlockPos(x + 5, y + 24, z + 12),
                new BlockPos(x + 15, y + 24, z + 12),
                new BlockPos(x + 16, y + 24, z + 12),
                new BlockPos(x + 4, y + 24, z + 13),
                new BlockPos(x + 7, y + 24, z + 13),
                new BlockPos(x + 15, y + 24, z + 13),
                new BlockPos(x + 18, y + 24, z + 13),
                new BlockPos(x + 19, y + 24, z + 13),
                new BlockPos(x + 20, y + 24, z + 13),
                new BlockPos(x + 4, y + 24, z + 14),
                new BlockPos(x + 5, y + 24, z + 14),
                new BlockPos(x + 18, y + 24, z + 14),
                new BlockPos(x + 3, y + 24, z + 15),
                new BlockPos(x + 4, y + 24, z + 15),
                new BlockPos(x + 8, y + 24, z + 15),
                new BlockPos(x + 13, y + 24, z + 15),
                new BlockPos(x + 14, y + 24, z + 15),
                new BlockPos(x + 15, y + 24, z + 15),
                new BlockPos(x + 18, y + 24, z + 15),
                new BlockPos(x + 19, y + 24, z + 15),
                new BlockPos(x + 6, y + 24, z + 16),
                new BlockPos(x + 12, y + 24, z + 16),
                new BlockPos(x + 17, y + 24, z + 16),
                new BlockPos(x + 18, y + 24, z + 16),
                new BlockPos(x + 5, y + 24, z + 17),
                new BlockPos(x + 8, y + 24, z + 17),
                new BlockPos(x + 10, y + 24, z + 17),
                new BlockPos(x + 12, y + 24, z + 17),
                new BlockPos(x + 17, y + 24, z + 17),
                new BlockPos(x + 4, y + 24, z + 18),
                new BlockPos(x + 13, y + 24, z + 18),
                new BlockPos(x + 14, y + 24, z + 18),
                new BlockPos(x + 15, y + 24, z + 18),
                new BlockPos(x + 18, y + 24, z + 18),
                new BlockPos(x + 11, y + 24, z + 19),
                new BlockPos(x + 13, y + 24, z + 19),
                new BlockPos(x + 14, y + 24, z + 19),
                new BlockPos(x + 15, y + 24, z + 21)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 10, y + 25, z + 6),
                new BlockPos(x + 13, y + 25, z + 9),
                new BlockPos(x + 10, y + 25, z + 14),
                new BlockPos(x + 16, y + 25, z + 14),
                new BlockPos(x + 11, y + 25, z + 17)
            )
            .setLeaves(
                new BlockPos(x + 12, y + 25, z + 3),
                new BlockPos(x + 11, y + 25, z + 4),
                new BlockPos(x + 13, y + 25, z + 4),
                new BlockPos(x + 5, y + 25, z + 5),
                new BlockPos(x + 5, y + 25, z + 7),
                new BlockPos(x + 6, y + 25, z + 7),
                new BlockPos(x + 11, y + 25, z + 7),
                new BlockPos(x + 18, y + 25, z + 7),
                new BlockPos(x + 2, y + 25, z + 8),
                new BlockPos(x + 3, y + 25, z + 8),
                new BlockPos(x + 4, y + 25, z + 8),
                new BlockPos(x + 5, y + 25, z + 8),
                new BlockPos(x + 6, y + 25, z + 8),
                new BlockPos(x + 11, y + 25, z + 8),
                new BlockPos(x + 5, y + 25, z + 9),
                new BlockPos(x + 6, y + 25, z + 9),
                new BlockPos(x + 17, y + 25, z + 9),
                new BlockPos(x + 18, y + 25, z + 9),
                new BlockPos(x + 6, y + 25, z + 10),
                new BlockPos(x + 15, y + 25, z + 10),
                new BlockPos(x + 16, y + 25, z + 10),
                new BlockPos(x + 17, y + 25, z + 11),
                new BlockPos(x + 7, y + 25, z + 13),
                new BlockPos(x + 15, y + 25, z + 13),
                new BlockPos(x + 17, y + 25, z + 13),
                new BlockPos(x + 18, y + 25, z + 13),
                new BlockPos(x + 4, y + 25, z + 14),
                new BlockPos(x + 8, y + 25, z + 14),
                new BlockPos(x + 4, y + 25, z + 15),
                new BlockPos(x + 8, y + 25, z + 15),
                new BlockPos(x + 9, y + 25, z + 15),
                new BlockPos(x + 12, y + 25, z + 15),
                new BlockPos(x + 15, y + 25, z + 15),
                new BlockPos(x + 18, y + 25, z + 15),
                new BlockPos(x + 7, y + 25, z + 16),
                new BlockPos(x + 8, y + 25, z + 16),
                new BlockPos(x + 9, y + 25, z + 16),
                new BlockPos(x + 12, y + 25, z + 16),
                new BlockPos(x + 15, y + 25, z + 16),
                new BlockPos(x + 17, y + 25, z + 16),
                new BlockPos(x + 7, y + 25, z + 17),
                new BlockPos(x + 12, y + 25, z + 17),
                new BlockPos(x + 14, y + 25, z + 17),
                new BlockPos(x + 4, y + 25, z + 18),
                new BlockPos(x + 9, y + 25, z + 18),
                new BlockPos(x + 12, y + 25, z + 18),
                new BlockPos(x + 13, y + 25, z + 18),
                new BlockPos(x + 16, y + 25, z + 18),
                new BlockPos(x + 9, y + 25, z + 19),
                new BlockPos(x + 11, y + 25, z + 19),
                new BlockPos(x + 13, y + 25, z + 19),
                new BlockPos(x + 16, y + 25, z + 19),
                new BlockPos(x + 11, y + 25, z + 20)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 10, y + 26, z + 6),
                new BlockPos(x + 13, y + 26, z + 9),
                new BlockPos(x + 10, y + 26, z + 14),
                new BlockPos(x + 17, y + 26, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 6, y + 26, z + 4),
                new BlockPos(x + 4, y + 26, z + 5),
                new BlockPos(x + 6, y + 26, z + 5),
                new BlockPos(x + 9, y + 26, z + 5),
                new BlockPos(x + 10, y + 26, z + 5),
                new BlockPos(x + 8, y + 26, z + 6),
                new BlockPos(x + 3, y + 26, z + 7),
                new BlockPos(x + 6, y + 26, z + 7),
                new BlockPos(x + 9, y + 26, z + 7),
                new BlockPos(x + 3, y + 26, z + 8),
                new BlockPos(x + 5, y + 26, z + 8),
                new BlockPos(x + 7, y + 26, z + 8),
                new BlockPos(x + 14, y + 26, z + 8),
                new BlockPos(x + 5, y + 26, z + 9),
                new BlockPos(x + 10, y + 26, z + 9),
                new BlockPos(x + 14, y + 26, z + 9),
                new BlockPos(x + 18, y + 26, z + 9),
                new BlockPos(x + 16, y + 26, z + 10),
                new BlockPos(x + 4, y + 26, z + 11),
                new BlockPos(x + 13, y + 26, z + 11),
                new BlockPos(x + 16, y + 26, z + 11),
                new BlockPos(x + 17, y + 26, z + 11),
                new BlockPos(x + 18, y + 26, z + 11),
                new BlockPos(x + 19, y + 26, z + 11),
                new BlockPos(x + 19, y + 26, z + 13),
                new BlockPos(x + 13, y + 26, z + 14),
                new BlockPos(x + 14, y + 26, z + 14),
                new BlockPos(x + 18, y + 26, z + 14),
                new BlockPos(x + 8, y + 26, z + 15),
                new BlockPos(x + 11, y + 26, z + 15),
                new BlockPos(x + 13, y + 26, z + 15),
                new BlockPos(x + 19, y + 26, z + 15),
                new BlockPos(x + 20, y + 26, z + 15),
                new BlockPos(x + 8, y + 26, z + 16),
                new BlockPos(x + 11, y + 26, z + 16),
                new BlockPos(x + 12, y + 26, z + 16),
                new BlockPos(x + 13, y + 26, z + 16),
                new BlockPos(x + 14, y + 26, z + 16),
                new BlockPos(x + 16, y + 26, z + 16),
                new BlockPos(x + 19, y + 26, z + 16),
                new BlockPos(x + 4, y + 26, z + 17),
                new BlockPos(x + 5, y + 26, z + 17),
                new BlockPos(x + 8, y + 26, z + 17),
                new BlockPos(x + 16, y + 26, z + 17),
                new BlockPos(x + 9, y + 26, z + 18),
                new BlockPos(x + 17, y + 26, z + 18),
                new BlockPos(x + 15, y + 26, z + 19)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 9, y + 27, z + 6),
                new BlockPos(x + 13, y + 27, z + 9),
                new BlockPos(x + 9, y + 27, z + 14),
                new BlockPos(x + 11, y + 27, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 9, y + 27, z + 4),
                new BlockPos(x + 11, y + 27, z + 4),
                new BlockPos(x + 6, y + 27, z + 5),
                new BlockPos(x + 5, y + 27, z + 6),
                new BlockPos(x + 13, y + 27, z + 6),
                new BlockPos(x + 6, y + 27, z + 7),
                new BlockPos(x + 9, y + 27, z + 7),
                new BlockPos(x + 13, y + 27, z + 7),
                new BlockPos(x + 15, y + 27, z + 7),
                new BlockPos(x + 4, y + 27, z + 8),
                new BlockPos(x + 7, y + 27, z + 8),
                new BlockPos(x + 11, y + 27, z + 8),
                new BlockPos(x + 12, y + 27, z + 8),
                new BlockPos(x + 13, y + 27, z + 8),
                new BlockPos(x + 14, y + 27, z + 8),
                new BlockPos(x + 4, y + 27, z + 9),
                new BlockPos(x + 6, y + 27, z + 9),
                new BlockPos(x + 8, y + 27, z + 9),
                new BlockPos(x + 11, y + 27, z + 9),
                new BlockPos(x + 12, y + 27, z + 9),
                new BlockPos(x + 14, y + 27, z + 9),
                new BlockPos(x + 5, y + 27, z + 10),
                new BlockPos(x + 8, y + 27, z + 10),
                new BlockPos(x + 13, y + 27, z + 10),
                new BlockPos(x + 19, y + 27, z + 10),
                new BlockPos(x + 6, y + 27, z + 12),
                new BlockPos(x + 7, y + 27, z + 12),
                new BlockPos(x + 13, y + 27, z + 12),
                new BlockPos(x + 12, y + 27, z + 13),
                new BlockPos(x + 15, y + 27, z + 13),
                new BlockPos(x + 15, y + 27, z + 14),
                new BlockPos(x + 17, y + 27, z + 14),
                new BlockPos(x + 20, y + 27, z + 14),
                new BlockPos(x + 13, y + 27, z + 15),
                new BlockPos(x + 15, y + 27, z + 15),
                new BlockPos(x + 16, y + 27, z + 15),
                new BlockPos(x + 13, y + 27, z + 16),
                new BlockPos(x + 15, y + 27, z + 16),
                new BlockPos(x + 16, y + 27, z + 17),
                new BlockPos(x + 9, y + 27, z + 18),
                new BlockPos(x + 11, y + 27, z + 18),
                new BlockPos(x + 14, y + 27, z + 18),
                new BlockPos(x + 17, y + 27, z + 18),
                new BlockPos(x + 18, y + 27, z + 18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 9, y + 28, z + 6),
                new BlockPos(x + 14, y + 28, z + 8),
                new BlockPos(x + 9, y + 28, z + 14),
                new BlockPos(x + 11, y + 28, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 6, y + 28, z + 3),
                new BlockPos(x + 7, y + 28, z + 3),
                new BlockPos(x + 11, y + 28, z + 4),
                new BlockPos(x + 3, y + 28, z + 5),
                new BlockPos(x + 4, y + 28, z + 5),
                new BlockPos(x + 5, y + 28, z + 5),
                new BlockPos(x + 3, y + 28, z + 6),
                new BlockPos(x + 4, y + 28, z + 7),
                new BlockPos(x + 6, y + 28, z + 8),
                new BlockPos(x + 7, y + 28, z + 8),
                new BlockPos(x + 8, y + 28, z + 8),
                new BlockPos(x + 18, y + 28, z + 8),
                new BlockPos(x + 4, y + 28, z + 9),
                new BlockPos(x + 7, y + 28, z + 9),
                new BlockPos(x + 12, y + 28, z + 9),
                new BlockPos(x + 5, y + 28, z + 10),
                new BlockPos(x + 10, y + 28, z + 10),
                new BlockPos(x + 11, y + 28, z + 10),
                new BlockPos(x + 15, y + 28, z + 10),
                new BlockPos(x + 3, y + 28, z + 11),
                new BlockPos(x + 5, y + 28, z + 11),
                new BlockPos(x + 15, y + 28, z + 11),
                new BlockPos(x + 16, y + 28, z + 11),
                new BlockPos(x + 17, y + 28, z + 11),
                new BlockPos(x + 18, y + 28, z + 11),
                new BlockPos(x + 7, y + 28, z + 12),
                new BlockPos(x + 13, y + 28, z + 12),
                new BlockPos(x + 15, y + 28, z + 12),
                new BlockPos(x + 4, y + 28, z + 14),
                new BlockPos(x + 12, y + 28, z + 14),
                new BlockPos(x + 17, y + 28, z + 14),
                new BlockPos(x + 5, y + 28, z + 15),
                new BlockPos(x + 10, y + 28, z + 15),
                new BlockPos(x + 12, y + 28, z + 15),
                new BlockPos(x + 15, y + 28, z + 15),
                new BlockPos(x + 5, y + 28, z + 16),
                new BlockPos(x + 13, y + 28, z + 16),
                new BlockPos(x + 17, y + 28, z + 16),
                new BlockPos(x + 16, y + 28, z + 17),
                new BlockPos(x + 11, y + 28, z + 18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 9, y + 29, z + 6),
                new BlockPos(x + 14, y + 29, z + 8),
                new BlockPos(x + 9, y + 29, z + 13),
                new BlockPos(x + 12, y + 29, z + 15)
            )
            .setLeaves(
                new BlockPos(x + 8, y + 29, z + 3),
                new BlockPos(x + 6, y + 29, z + 5),
                new BlockPos(x + 3, y + 29, z + 6),
                new BlockPos(x + 15, y + 29, z + 6),
                new BlockPos(x + 16, y + 29, z + 6),
                new BlockPos(x + 17, y + 29, z + 6),
                new BlockPos(x + 4, y + 29, z + 7),
                new BlockPos(x + 7, y + 29, z + 7),
                new BlockPos(x + 9, y + 29, z + 7),
                new BlockPos(x + 10, y + 29, z + 7),
                new BlockPos(x + 11, y + 29, z + 7),
                new BlockPos(x + 16, y + 29, z + 7),
                new BlockPos(x + 17, y + 29, z + 7),
                new BlockPos(x + 18, y + 29, z + 7),
                new BlockPos(x + 8, y + 29, z + 8),
                new BlockPos(x + 10, y + 29, z + 8),
                new BlockPos(x + 13, y + 29, z + 8),
                new BlockPos(x + 19, y + 29, z + 8),
                new BlockPos(x + 3, y + 29, z + 9),
                new BlockPos(x + 16, y + 29, z + 9),
                new BlockPos(x + 19, y + 29, z + 9),
                new BlockPos(x + 14, y + 29, z + 10),
                new BlockPos(x + 15, y + 29, z + 11),
                new BlockPos(x + 18, y + 29, z + 11),
                new BlockPos(x + 9, y + 29, z + 12),
                new BlockPos(x + 14, y + 29, z + 12),
                new BlockPos(x + 16, y + 29, z + 12),
                new BlockPos(x + 17, y + 29, z + 12),
                new BlockPos(x + 4, y + 29, z + 13),
                new BlockPos(x + 6, y + 29, z + 13),
                new BlockPos(x + 18, y + 29, z + 14),
                new BlockPos(x + 6, y + 29, z + 15),
                new BlockPos(x + 9, y + 29, z + 15),
                new BlockPos(x + 11, y + 29, z + 15),
                new BlockPos(x + 14, y + 29, z + 15),
                new BlockPos(x + 17, y + 29, z + 15),
                new BlockPos(x + 14, y + 29, z + 16),
                new BlockPos(x + 11, y + 29, z + 18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 14, y + 30, z + 8),
                new BlockPos(x + 9, y + 30, z + 13)
            )
            .setLeaves(
                new BlockPos(x + 11, y + 30, z + 5),
                new BlockPos(x + 9, y + 30, z + 6),
                new BlockPos(x + 10, y + 30, z + 6),
                new BlockPos(x + 13, y + 30, z + 6),
                new BlockPos(x + 16, y + 30, z + 6),
                new BlockPos(x + 8, y + 30, z + 7),
                new BlockPos(x + 12, y + 30, z + 7),
                new BlockPos(x + 12, y + 30, z + 8),
                new BlockPos(x + 15, y + 30, z + 8),
                new BlockPos(x + 16, y + 30, z + 8),
                new BlockPos(x + 8, y + 30, z + 9),
                new BlockPos(x + 9, y + 30, z + 9),
                new BlockPos(x + 14, y + 30, z + 9),
                new BlockPos(x + 7, y + 30, z + 10),
                new BlockPos(x + 14, y + 30, z + 10),
                new BlockPos(x + 15, y + 30, z + 10),
                new BlockPos(x + 4, y + 30, z + 11),
                new BlockPos(x + 10, y + 30, z + 12),
                new BlockPos(x + 5, y + 30, z + 13),
                new BlockPos(x + 6, y + 30, z + 13),
                new BlockPos(x + 17, y + 30, z + 13),
                new BlockPos(x + 8, y + 30, z + 14),
                new BlockPos(x + 9, y + 30, z + 14),
                new BlockPos(x + 10, y + 30, z + 14),
                new BlockPos(x + 11, y + 30, z + 14),
                new BlockPos(x + 13, y + 30, z + 14),
                new BlockPos(x + 12, y + 30, z + 15),
                new BlockPos(x + 14, y + 30, z + 15),
                new BlockPos(x + 12, y + 30, z + 16),
                new BlockPos(x + 11, y + 30, z + 18)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 14, y + 31, z + 8),
                new BlockPos(x + 8, y + 31, z + 13)
            )
            .setLeaves(
                new BlockPos(x + 9, y + 31, z + 4),
                new BlockPos(x + 7, y + 31, z + 5),
                new BlockPos(x + 13, y + 31, z + 5),
                new BlockPos(x + 15, y + 31, z + 5),
                new BlockPos(x + 6, y + 31, z + 6),
                new BlockPos(x + 14, y + 31, z + 6),
                new BlockPos(x + 16, y + 31, z + 6),
                new BlockPos(x + 6, y + 31, z + 7),
                new BlockPos(x + 10, y + 31, z + 7),
                new BlockPos(x + 12, y + 31, z + 7),
                new BlockPos(x + 13, y + 31, z + 7),
                new BlockPos(x + 11, y + 31, z + 8),
                new BlockPos(x + 4, y + 31, z + 10),
                new BlockPos(x + 16, y + 31, z + 10),
                new BlockPos(x + 12, y + 31, z + 11),
                new BlockPos(x + 16, y + 31, z + 11),
                new BlockPos(x + 11, y + 31, z + 12),
                new BlockPos(x + 13, y + 31, z + 12),
                new BlockPos(x + 14, y + 31, z + 12),
                new BlockPos(x + 16, y + 31, z + 12),
                new BlockPos(x + 18, y + 31, z + 12),
                new BlockPos(x + 13, y + 31, z + 13),
                new BlockPos(x + 7, y + 31, z + 14),
                new BlockPos(x + 15, y + 31, z + 14),
                new BlockPos(x + 8, y + 31, z + 15),
                new BlockPos(x + 10, y + 31, z + 15),
                new BlockPos(x + 12, y + 31, z + 15),
                new BlockPos(x + 9, y + 31, z + 16),
                new BlockPos(x + 12, y + 31, z + 16),
                new BlockPos(x + 11, y + 31, z + 17),
                new BlockPos(x + 12, y + 31, z + 17)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLogs(
                new BlockPos(x + 14, y + 32, z + 8)
            )
            .setLeaves(
                new BlockPos(x + 8, y + 32, z + 6),
                new BlockPos(x + 12, y + 32, z + 7),
                new BlockPos(x + 14, y + 32, z + 7),
                new BlockPos(x + 15, y + 32, z + 7),
                new BlockPos(x + 16, y + 32, z + 7),
                new BlockPos(x + 13, y + 32, z + 8),
                new BlockPos(x + 11, y + 32, z + 9),
                new BlockPos(x + 14, y + 32, z + 11),
                new BlockPos(x + 15, y + 32, z + 11),
                new BlockPos(x + 6, y + 32, z + 12),
                new BlockPos(x + 13, y + 32, z + 12),
                new BlockPos(x + 6, y + 32, z + 13),
                new BlockPos(x + 8, y + 32, z + 13),
                new BlockPos(x + 9, y + 32, z + 14),
                new BlockPos(x + 11, y + 32, z + 15),
                new BlockPos(x + 12, y + 32, z + 15),
                new BlockPos(x + 11, y + 32, z + 16)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x + 12, y + 33, z + 6),
                new BlockPos(x + 13, y + 33, z + 8),
                new BlockPos(x + 15, y + 33, z + 9),
                new BlockPos(x + 17, y + 33, z + 9),
                new BlockPos(x + 13, y + 33, z + 10),
                new BlockPos(x + 6, y + 33, z + 11),
                new BlockPos(x + 8, y + 33, z + 11),
                new BlockPos(x + 14, y + 33, z + 11),
                new BlockPos(x + 15, y + 33, z + 11),
                new BlockPos(x + 6, y + 33, z + 12),
                new BlockPos(x + 16, y + 33, z + 12),
                new BlockPos(x + 6, y + 33, z + 13),
                new BlockPos(x + 7, y + 33, z + 13),
                new BlockPos(x + 13, y + 33, z + 13),
                new BlockPos(x + 16, y + 33, z + 13),
                new BlockPos(x + 8, y + 33, z + 15)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x + 14, y + 34, z + 8),
                new BlockPos(x + 15, y + 34, z + 8),
                new BlockPos(x + 12, y + 34, z + 9),
                new BlockPos(x + 13, y + 34, z + 10),
                new BlockPos(x + 15, y + 34, z + 10),
                new BlockPos(x + 8, y + 34, z + 12),
                new BlockPos(x + 14, y + 34, z + 12),
                new BlockPos(x + 16, y + 34, z + 12),
                new BlockPos(x + 8, y + 34, z + 13),
                new BlockPos(x + 7, y + 34, z + 14),
                new BlockPos(x + 9, y + 34, z + 14)
            )
        );

        this.addTreeLayer((new TreeLayer(++currentY))
            .setLeaves(
                new BlockPos(x + 13, y + 35, z + 9)
            )
        );
    }
}
