package nl.jboi.minecraft.bytecart.api.Event;

import nl.jboi.minecraft.bytecart.api.AddressLayer.Address;
import nl.jboi.minecraft.bytecart.api.Wanderer.Wanderer;
import org.bukkit.event.HandlerList;

/**
 * Event triggered when a local updater modifies the address
 * of a BC9001 sign.
 */
public class UpdaterSetStationEvent extends UpdaterClearStationEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Address newAddress;

    /**
     * Default constructor
     *
     * @param updater    The updater involved
     * @param oldAddress The old address of the station
     * @param newAddress The new address of the station
     * @param name       The name of the station
     */
    public UpdaterSetStationEvent(Wanderer updater, Address oldAddress, Address newAddress, String name) {
        super(updater, oldAddress, name);
        this.newAddress = newAddress;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @return the newAddress
     */
    public Address getNewAddress() {
        return newAddress;
    }
}
