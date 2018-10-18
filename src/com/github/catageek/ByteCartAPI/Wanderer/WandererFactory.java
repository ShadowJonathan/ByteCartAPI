package com.github.catageek.ByteCartAPI.Wanderer;

import java.io.IOException;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.github.catageek.ByteCartAPI.Signs.BCSign;
import com.github.catageek.ByteCartAPI.Wanderer.Wanderer.Level;

public interface WandererFactory {
	
	/**
	 * @return a new wanderer instance
	 * @throws IOException 
	 * @throws ClassNotFoundException 
	 */
	Wanderer getWanderer(BCSign bc, Inventory inv);

	void removeAllWanderers();

	void createWanderer(int id, Inventory inv, int region, Level level, Player player, boolean isfullreset, boolean isnew);

	boolean areAllRemoved();

	void updateTimestamp(InventoryContent routes);

	void destroyWanderer(Inventory inv);

}
