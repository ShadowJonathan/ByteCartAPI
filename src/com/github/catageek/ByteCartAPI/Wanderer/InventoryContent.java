package com.github.catageek.ByteCartAPI.Wanderer;

import java.io.Serializable;
import java.util.Stack;

import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

import com.github.catageek.ByteCartAPI.Util.DirectionRegistry;


public interface InventoryContent extends Serializable {
	/**
	 * @return the inventory
	 */
	public Inventory getInventory();
	
	/**
	 * Get the level of the wanderer
	 * 
	 * @return the level
	 */
	public Wanderer.Level getLevel();

	/**
	 * Get the region of the wanderer
	 * 
	 * @return the region
	 */
	public int getRegion();
	
	/**
	 * @return the player that creates the wanderer
	 */
	public Player getPlayer();

	public com.github.catageek.ByteCartAPI.Wanderer.Counter getCounter();

	public Stack<Integer> getStart();

	public Stack<Integer> getEnd();

	public boolean hasRouteTo(int ring);

	public int getMinDistanceRing(
			com.github.catageek.ByteCartAPI.Wanderer.RoutingTable routingTable,
			DirectionRegistry from);

	public int getCurrent();

	public void setCurrent(int i);

	public int getMetric(int ring);

	public void setRoute(int ring, int i);

}
