package com.github.catageek.ByteCartAPI.Event;

import org.bukkit.event.HandlerList;

import com.github.catageek.ByteCartAPI.AddressLayer.Address;
import com.github.catageek.ByteCartAPI.Routing.Updater;

/**
 * Event triggered when an local updater pass a station sign.
*/

public class UpdaterPassStationEvent extends UpdaterEvent {
	private final Address address;

	/**
	 * Default constructor
	 * 
	 * @param updater The updater involved
	 * @param address The address of the station
	 */
	public UpdaterPassStationEvent(Updater updater, Address address) {
		super(updater);
		this.address = address;
	}

	private static final HandlerList handlers = new HandlerList();

	public HandlerList getHandlers() {
        return handlers;
	}

	public static HandlerList getHandlerList() {
        return handlers;
    }

	/**
	 * @return The address of the station
	 */
	@Deprecated
	public Address getAddress() {
		return address;
	}

	/**
	 * @return The address of the station
	 */
	public String getAddressString() {
		return address.toString();
	}
}
