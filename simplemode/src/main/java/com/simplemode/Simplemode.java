package com.simplemode;

import com.simplemode.registry.ModItems;
import net.fabricmc.api.ModInitializer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Simplemode implements ModInitializer {
	public static final String ID = "simplemode";
    public static final Logger LOGGER = LoggerFactory.getLogger(ID);

	@Override
	public void onInitialize() {

		LOGGER.info(ID + " initialized");
		ModItems.registerItems();

	}
}