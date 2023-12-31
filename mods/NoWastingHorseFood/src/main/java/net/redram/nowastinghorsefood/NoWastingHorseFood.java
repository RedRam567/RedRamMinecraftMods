package net.redram.nowastinghorsefood;

import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NoWastingHorseFood implements ModInitializer {
    private static final String MOD_ID = "nowastinghorsefood";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    @Override
    public void onInitialize() {
        // This code runs as soon as Minecraft is in a mod-load-ready state.
        // However, some things (like resources) may still be uninitialized.
        // Proceed with mild caution.

        LOGGER.info("[NoWastingHorseFood] server onInitialize()");
    }
}