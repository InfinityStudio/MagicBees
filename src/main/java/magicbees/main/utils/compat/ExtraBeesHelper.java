package magicbees.main.utils.compat;

import magicbees.main.Config;
import cpw.mods.fml.common.Loader;

public class ExtraBeesHelper {
	
	public enum CombType {
		BARREN,
		ROTTEN,
		BONE,
		OIL,
		COAL,
		FUEL,
		WATER,
		MILK,
		FRUIT,
		SEED,
		ALCOHOL,
		STONE,
		REDSTONE,
		RESIN,
		IC2,
		IRON,
		GOLD,
		COPPER,
		TIN,
		SILVER,
		BRONZE,
		URANIUM,
		CLAY,
		OLD,
		FUNGAL,
		CREOSOTE,
		LATEX,
		ACIDIC,
		VENOMOUS,
		SLIME,
		BLAZE,
		COFFEE,
		GLACIAL,
		MINT,
		CITRUS,
		PEAT,
		SHADOW,
		LEAD,
		BRASS,
		ELECTRUM,
		ZINC,
		TITANIUM,
		TUNGSTEN,
		STEEL,
		IRIDIUM,
		PLATINUM,
		LAPIS,
		SODALITE,
		PYRITE,
		BAUXITE,
		CINNABAR,
		SPHALERITE,
		EMERALD,
		RUBY,
		SAPPHIRE,
		OLIVINE,
		DIAMOND,
		RED,
		YELLOW,
		BLUE,
		GREEN,
		BLACK,
		WHITE,
		BROWN,
		ORANGE,
		CYAN,
		PURPLE,
		GRAY,
		LIGHTBLUE,
		PINK,
		LIMEGREEN,
		MAGENTA,
		LIGHTGRAY,
		NICKEL,
		INVAR,
		GLOWSTONE,
		SALTPETER,
		PULP,
		MULCH,
		COMPOST,
		SAWDUST,
		;
	}

	private static boolean isEBPresent = false;

	public static boolean isActive() {
		return isEBPresent;
	}

	public static void preInit() {
		if (Loader.isModLoaded("ExtraBees") && Config.extraBeesActive)
		{
			isEBPresent = true;
		}
	}

	public static void init() {
	}

	public static void postInit() {
	}
}
