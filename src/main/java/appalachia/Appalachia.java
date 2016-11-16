package appalachia;

import java.io.File;

import appalachia.biome.AppalachiaBiomeManager;
import appalachia.block.BlockManager;
import appalachia.client.sound.SoundManager;
import appalachia.config.ConfigManager;
import appalachia.event.EventManager;
import appalachia.item.ItemManager;
import appalachia.proxy.ClientProxy;
import appalachia.proxy.CommonProxy;
import appalachia.reference.ModInfo;
import appalachia.rtg.config.BiomeConfigManagerAPL;
import appalachia.rtg.config.ConfigManagerAPL;
import appalachia.rtg.world.biome.realistic.appalachia.RealisticBiomeAPLBase;
import appalachia.world.AppalachiaWorldGenerator;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;

@SuppressWarnings({"WeakerAccess", "unused"})
@Mod(modid = ModInfo.MOD_ID, name = ModInfo.MOD_NAME, version = ModInfo.MOD_VERSION, dependencies = "required-after:Forge@[" + ModInfo.MCF_MINVER + "," + ModInfo.MCF_MAXVER + ");required-before:RTG@[" + ModInfo.RTG_MINVER + "," + ModInfo.RTG_MAXVER + ")", acceptableRemoteVersions = "*")
public class Appalachia {

    @Mod.Instance(ModInfo.MOD_ID)
    public static Appalachia instance;
    public static String configPath;
    public static EventManager eventMgr;

    @SidedProxy(clientSide = ClientProxy.LOCATION, serverSide = CommonProxy.LOCATION)
    public static CommonProxy proxy;

    private ConfigManager configManager = new ConfigManager();

    @Mod.EventHandler
    public void initPre(FMLPreInitializationEvent event) {

        instance = this;

        configPath = event.getModConfigurationDirectory() + File.separator + ModInfo.CONFIG_DIRECTORY + File.separator;
        ConfigManager.init(configPath);

        BlockManager.registerBlocks();
        ItemManager.registerItems();
        SoundManager.registerSounds();

        if (event.getSide().isClient()) {
            BlockManager.registerModels();
            ItemManager.registerModels();
        }

        AppalachiaBiomeManager.registerBiomes();

        proxy.preInit(event);

        BiomeConfigManagerAPL.initBiomeConfigs();
        ConfigManagerAPL.init(event.getModConfigurationDirectory() + File.separator + rtg.reference.ModInfo.CONFIG_DIRECTORY + File.separator);
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {

        eventMgr = new EventManager();
        eventMgr.registerEventHandlers();

        BlockManager.addRecipes();
        GameRegistry.registerWorldGenerator(new AppalachiaWorldGenerator(), 0);
        AppalachiaBiomeManager.doBiomeCheck();

        proxy.init(event);
    }

    @Mod.EventHandler
    public void initPost(FMLPostInitializationEvent event) {

        RealisticBiomeAPLBase.addBiomes();

        //RealisticBiomePresenceTester.doBiomeCheck();

        proxy.postInit(event);
    }
}
