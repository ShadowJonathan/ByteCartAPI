package nl.jboi.minecraft.bytecart.api.Signs;

/**
 * An IC that has a net mask should implement this
 */
public interface HasNetmask {
    /**
     * Get the net mask
     *
     * @return the net mask
     */
    int getNetmask();
}
