package nl.jboi.minecraft.bytecart.api.Event;

import nl.jboi.minecraft.bytecart.api.AddressLayer.Address;
import nl.jboi.minecraft.bytecart.api.Wanderer.Wanderer;
import org.bukkit.event.HandlerList;

/**
 * Event triggered when a local updater leaves a subnet
 */
public class UpdaterLeaveSubnetEvent extends UpdaterEvent {
    private static final HandlerList handlers = new HandlerList();
    private final Address address, newaddress;
    private final int length, newlength;

    /**
     * Default constructor
     *
     * @param updater    updater involved
     * @param address    address of the subnet we are leaving
     * @param length     number of stations this subnet can contain
     * @param newlength  number of stations of the subnet we are re-entering
     * @param newaddress address of the subnet we are re-entering
     */
    public UpdaterLeaveSubnetEvent(Wanderer updater, Address address, int length, Address newaddress, int newlength) {
        super(updater);
        this.address = address;
        this.length = length;
        this.newaddress = newaddress;
        this.newlength = newlength;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @return the length of the old subnet
     */
    public int getLength() {
        return length;
    }

    /**
     * @return the address of the old subnet
     */
    public String getAddress() {
        return address.toString();
    }

    /**
     * @return the address of the new subnet
     */
    @Deprecated
    public Address getNewaddress() {
        return newaddress;
    }

    /**
     * @return the address of the new subnet
     */
    public String getNewAddress() {
        return newaddress.toString();
    }

    /**
     * @return the length of the new subnet
     */
    public int getNewlength() {
        return newlength;
    }
}
