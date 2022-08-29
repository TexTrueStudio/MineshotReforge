package com.texstudio.mineshot_reforge;

import com.texstudio.mineshot_reforge.client.OrthoViewHandler;
import com.texstudio.mineshot_reforge.client.ScreenshotHandler;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.fml.ModLoadingContext;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.config.ModConfig;
import net.minecraftforge.fml.event.lifecycle.FMLClientSetupEvent;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

import com.texstudio.mineshot_reforge.client.config.MyModConfig;

@Mod(Mineshot.MODID)
public class Mineshot {

	public static final String MODID = "mineshot_reborn";

	public Mineshot() {
		// Register the clientSetup method for modloading
		FMLJavaModLoadingContext.get().getModEventBus().addListener(this::clientSetup);

		// Register the configuration
		ModLoadingContext.get().registerConfig(ModConfig.Type.CLIENT, MyModConfig.CLIENT_SPEC);

		// Register ourselves for server and other game events we are interested in
		MinecraftForge.EVENT_BUS.register(this);
	}

	private void clientSetup(final FMLClientSetupEvent event) {
		OrthoViewHandler ovh = new OrthoViewHandler();
		MinecraftForge.EVENT_BUS.register(ovh);

		ScreenshotHandler sch = new ScreenshotHandler();
		MinecraftForge.EVENT_BUS.register(sch);
	}
}
