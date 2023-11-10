package org.properties;

/**
 * Class that contains all current properties of windows
 *
 * @author Maciej
 * @version 0.1
 */
public class Properties {
    private static Boolean scalable = Boolean.valueOf(false);

    public static Boolean getScalable() {
        return scalable;
    }

    public static void setScalable(Boolean scalable) {
        Properties.scalable = scalable;
    }
}
