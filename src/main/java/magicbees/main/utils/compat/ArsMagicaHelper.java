package magicbees.main.utils.compat;

import cpw.mods.fml.common.Loader;
import magicbees.main.Config;
import magicbees.main.utils.BlockInterface;
import magicbees.main.utils.ItemInterface;

public class ArsMagicaHelper {
	
	public enum ResourceType {
		VINTEUM_DUST,
		ARCANE_COMPOUND,
		ARCANE_ASH,
		PURIFIED_VINTEUM,
		CHIMERITE,
		BLUE_TOPAZ,
		SUNSTONE,
		MOONSTONE,
	}

	public enum EssenceType {
		ARCANE,
		EARTH,
		AIR,
		FIRE,
		WATER,
		PLANT,
		ICE,
		LIGHTNING,
		LIFE,
		ENDER,
		PURE,
		HIGH,
		BASE,
	}

	private static boolean isArsMagicaPresent = false;
	public static final String Name = "arsmagica2";

	public static boolean isActive() {
		return isArsMagicaPresent;
	}

	public static void preInit() {
		if (Loader.isModLoaded(Name) && Config.arsMagicaActive) {
			isArsMagicaPresent = true;
		}
	}

	public static void init() {
	}

	public static void postInit() {
		if (isActive()) {
			getBlocks();
			getItems();
		}
	}

	private static void getBlocks() {
		Config.amResourceBlock = BlockInterface.getBlock(Name, "AMOres");
		Config.amBlackOrchid = BlockInterface.getBlock(Name, "blueOrchid");
		Config.amDesertNova = BlockInterface.getBlock(Name, "desertNova");
		Config.amAum = BlockInterface.getBlock(Name, "aum");
		Config.amWakebloom = BlockInterface.getBlock(Name, "wakebloom");
		Config.amTarmaRoot = BlockInterface.getBlock(Name, "tarmaRoot");
	}

	private static void getItems() {
		Config.amItemResource = ItemInterface.getItem(Name, "itemOre");
		Config.amEssence = ItemInterface.getItem(Name, "essence");
	}
}
