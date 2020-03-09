package nl.jboi.minecraft.bytecart.api.Event;

import nl.jboi.minecraft.bytecart.api.Wanderer.Wanderer;
import org.bukkit.block.Block;
import org.bukkit.block.BlockFace;
import org.bukkit.event.HandlerList;

/**
 * Event triggered when an updater pass a router of the same level.
 * A region updater will trigger this event on BC8010 sign.
 * A backbone updater will trigger this event on BC8020 sign.
 * A local updater will never trigger this event
 */
public class UpdaterPassRouterEvent extends UpdaterEvent {

    private static final HandlerList handlers = new HandlerList();
    private final int nextring;
    private final BlockFace to;

    /**
     * Default constructor
     *
     * @param updater  The updater involved
     * @param to       The face from where the updater will leave the router
     * @param nextring The ring number of the track attached to the router where it is going
     */
    public UpdaterPassRouterEvent(Wanderer updater, BlockFace to, int nextring) {
        super(updater);
        this.to = to;
        this.nextring = nextring;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }

    public HandlerList getHandlers() {
        return handlers;
    }

    /**
     * Get the face of the router from where the updater comes
     *
     * @return The face of the updater
     */
    public final BlockFace getFrom() {
        return getUpdater().getFrom().getBlockFace();
    }

    /**
     * @return The ring number of the track attached to the router where it is going
     */
    public int getNextring() {
        return nextring;
    }

    /**
     * @return The face from where the updater will leave the router
     */
    public BlockFace getTo() {
        return to;
    }

    /**
     * @return The center of the router, at sign level
     */
    public Block getCenter() {
        return getUpdater().getCenter();
    }


}
