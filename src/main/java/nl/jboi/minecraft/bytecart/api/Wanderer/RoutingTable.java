package nl.jboi.minecraft.bytecart.api.Wanderer;

import org.bukkit.block.BlockFace;

import java.util.Iterator;
import java.util.Set;

public interface RoutingTable {
    /**
     * Return the best direction matching the entry
     *
     * @param entry the track number
     * @return the direction or null
     */
    BlockFace getDirection(int entry);

    /**
     * Return the best direction matching the entry whose interface is not closed
     *
     * @param entry the track number
     * @return the direction or null
     */
    BlockFace getAllowedDirection(int entry);

    /**
     * Tells if an interface is allowed or not
     *
     * @param direction the interface to test
     * @return true if allowed, false otherwise
     */
    Boolean isAllowedDirection(BlockFace direction);

    /**
     * Enable or disable an interface
     *
     * @param direction the interface to enable or disable
     * @param enable    true to enable, false to disable
     */
    void allowDirection(BlockFace direction, Boolean enable);

    /**
     * Get the metric associated with this entry and this direction
     *
     * @param entry     the track number
     * @param direction the direction
     * @return the metric
     */
    int getMetric(int entry, BlockFace direction);

    /**
     * Get the minimum metric for a specific entry
     *
     * @param entry the track number
     * @return the minimum metric recorded, or -1
     */
    int getMinMetric(int entry);

    /**
     * Tells if there is no record for an entry
     *
     * @param entry the track number
     * @return true if there is no record
     */
    boolean isEmpty(int entry);

    /**
     * Tells if a track is directly connected to a router at a specific direction
     *
     * @param ring      the track number
     * @param direction the direction
     * @return true if the track is directly connected at this direction
     */
    boolean isDirectlyConnected(int ring, BlockFace direction);

    /**
     * Get the track number at the specific direction
     *
     * @param direction the direction
     * @return the track number
     */
    int getDirectlyConnected(BlockFace direction);

    /**
     * Get a direction that has not been configured, or null if all directions are configured
     *
     * @return the direction
     */
    BlockFace getFirstUnknown();

    /**
     * Get the number of entries in the routing table
     *
     * @return the size
     */
    int size();

    /**
     * Get a list of tracks that have records with a metric 0 and at the specific direction
     *
     * @param from the direction
     * @return a list of track numbers
     */
    Set<Integer> getDirectlyConnectedList(BlockFace from);

    /**
     * Return an iterator of Route in incrementing order
     *
     * @return the set
     */
    Iterator<Integer> getOrderedRouteNumbers();


    /**
     * Get a set of track numbers that are seen in a direction, but not directly connected
     *
     * @param direction the direction
     * @return a set of track numbers
     */
    Set<Integer> getNotDirectlyConnectedList(BlockFace direction);

}
