package com.example

import net.fabricmc.api.ModInitializer
import org.slf4j.{Logger, LoggerFactory}

class ExampleMod extends ModInitializer {
	// This logger is used to write text to the console and the log file.
	// It is considered best practice to use your mod id as the logger's name.
	// That way, it's clear which mod wrote info, warnings, and errors.
	val LOGGER: Logger = LoggerFactory.getLogger("modid")

	override def onInitialize(): Unit = {
		// This code runs as soon as Minecraft is in a mod-load-ready state.
		// However, some things (like resources) may still be uninitialized.
		// Proceed with mild caution.

		LOGGER.info("Hello Fabric world!")
	}
}