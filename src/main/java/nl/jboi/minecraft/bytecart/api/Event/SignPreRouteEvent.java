package nl.jboi.minecraft.bytecart.api.Event;

import nl.jboi.minecraft.bytecart.api.Signs.BCRouter;
import org.bukkit.event.HandlerList;

/**
 * Event triggered when a vehicle is entering a router,
 * before the collision avoidance layer operations.
 * <p>
 * The target track may be changed by collision avoidance layer.
 */
public final class SignPreRouteEvent extends SignPostRouteEvent {

    private static final HandlerList handlers = new HandlerList();

    /**
     * Default constructor
     *
     * @param router The router involved
     * @param to     The ring number of the connected track where the vehicle wish to go (not the destination ring)
     */
    public SignPreRouteEvent(BCRouter router, int to) {
        super(router, to);
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Modify the destination ring on the fly to override the routing layer.
     * This will modify internal state of the router before actual operations.
     * This will not change the destination address recorded in the vehicle.
     * <p>
     * The final route is undefined until routing layer operations occur.
     *
     * @param target The ring to send the vehicle to
     */
    public final void setTargetTrack(int target) {
        to = target;
    }
}
