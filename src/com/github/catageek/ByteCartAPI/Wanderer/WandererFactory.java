package com.github.catageek.ByteCartAPI.Wanderer;

import java.io.IOException;

import org.bukkit.inventory.Inventory;

import com.github.catageek.ByteCartAPI.Signs.BCSign;

public interface WandererFactory {
	
	/**
	 * @return a new wanderer instance
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	Wanderer getWanderer(BCSign bc, Inventory inv) throws ClassNotFoundException, IOException;

}
