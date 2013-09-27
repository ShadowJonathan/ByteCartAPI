package com.github.catageek.ByteCartAPI.Event;

import org.bukkit.event.Event;

import com.github.catageek.ByteCartAPI.HAL.IC;

/**
 * A container class for all events
 */
public abstract class BCEvent extends Event {
	public BCEvent(IC ic) {
		super();
		this.ic = ic;
	}

	/**
	 * @return the component
	 */
	public IC getIc() {
		return ic;
	}

	private final IC ic;
	
	
}
