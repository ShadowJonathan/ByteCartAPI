package nl.jboi.minecraft.bytecart.api.Util;

import nl.jboi.minecraft.bytecart.api.HAL.Registry;
import nl.jboi.minecraft.bytecart.api.HAL.RegistryOutput;
import nl.jboi.minecraft.bytecart.api.HAL.VirtualRegistry;
import nl.jboi.minecraft.bytecart.api.Storage.Partitionable;
import org.bukkit.block.BlockFace;

/**
 * A 4-bit registry with 1 cardinal direction per bit
 */
public final class DirectionRegistry implements Partitionable {
    /**
     *
     */
    private VirtualRegistry registry;

    /*
     * bit 3 : SOUTH
     * bit 2 : WEST
     * bit 1 : NORTH
     * bit 0 : EAST
     */

    public DirectionRegistry() {
        this.registry = new VirtualRegistry(4);
    }

    /**
     * Build the registry with an initial value
     *
     * @param value initial value
     */
    public DirectionRegistry(int value) {
        this();
        this.registry.setAmount(value);
    }

    /**
     * Build the registry matching the blockface
     *
     * @param b blockface
     */
    public DirectionRegistry(BlockFace b) {
        this();
        this.setCardinal(b, true);
    }

    /**
     * Set a cardinal direction bit individually
     *
     * @param face  the cardinal direction
     * @param value true or false
     */
    public final void setCardinal(BlockFace face, boolean value) {

        switch (face) {
            case EAST:
                this.registry.setBit(0, value);
                break;
            case NORTH:
                this.registry.setBit(1, value);
                break;
            case WEST:
                this.registry.setBit(2, value);
                break;
            case SOUTH:
                this.registry.setBit(3, value);
            default:
                break;
        }

    }

    public final BlockFace ToString() {
        switch (this.getAmount()) {
            case 1:
                return BlockFace.SOUTH;
            case 2:
                return BlockFace.WEST;
            case 4:
                return BlockFace.NORTH;
            case 8:
                return BlockFace.EAST;
        }
        return BlockFace.SELF;
    }

    /**
     * Return the cardinal direction represented by this registry
     *
     * @return the direction, or self if there is no direction, or several directions are mixed
     */
    public final BlockFace getBlockFace() {
        switch (this.getAmount()) {
            case 1:
                return BlockFace.SOUTH;
            case 2:
                return BlockFace.WEST;
            case 4:
                return BlockFace.NORTH;
            case 8:
                return BlockFace.EAST;
        }
        return BlockFace.SELF;
    }

    @Override
    public final int getAmount() {
        return this.registry.getAmount();
    }

    /**
     * Get the value of the registry
     *
     * @param value the value
     */
    public final void setAmount(int value) {
        this.registry.setAmount(value);
    }

    /**
     * Return the registry
     *
     * @return the registry
     */
    public final Registry getRegistry() {
        RegistryOutput reg = new VirtualRegistry(4);
        reg.setAmount(this.getAmount());
        return reg;
    }

    @Override
    public int hashCode() {
        return getAmount();
    }

    @Override
    public boolean equals(Object o) {
        if (o == null)
            return false;
        if (o == this)
            return true;
        if (!(o instanceof DirectionRegistry))
            return false;

        return getAmount() == ((DirectionRegistry) o).getAmount();
    }
}
