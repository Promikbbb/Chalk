package de.dafuqs.chalk.common.data;

import net.fabricmc.loader.api.FabricLoader;

public class CompatibilityData {
	public static boolean CONTINUITY;

	static {
		CONTINUITY = (Data.getLoaderType() == Data.LoaderType.FABRIC || Data.getLoaderType() == Data.LoaderType.QUILT) && FabricLoader.getInstance().isModLoaded("continuity");
	}
}