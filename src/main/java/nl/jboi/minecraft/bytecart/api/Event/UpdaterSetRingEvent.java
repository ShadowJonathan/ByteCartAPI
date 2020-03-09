package nl.jboi.minecraft.bytecart.api.Event;

import nl.jboi.minecraft.bytecart.api.Wanderer.Wanderer;
import org.bukkit.event.HandlerList;

/**
 * Event triggered when a region updater modifies the address
 * on a BC8010 sign.
 */
public class UpdaterSetRingEvent extends UpdaterClearRingEvent {

    private static final HandlerList handlers = new HandlerList();
    private final int newring;

    /**
     * Default constructor
     *
     * @param updater The updater involved
     * @param old     The old value of the ring
     * @param newring The new value of the ring
     */
    public UpdaterSetRingEvent(Wanderer updater, int old, int newring) {
        super(updater, old);
        this.newring = newring;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * @return the newring
     */
    public int getNewring() {
        return newring;
    }
}
