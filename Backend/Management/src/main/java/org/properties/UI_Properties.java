package org.properties;

/**
 * Class that contains all current properties of windows
 *
 * @author Maciej
 * @version 0.1
 */
public class UI_Properties {
    private static Boolean scalable = Boolean.FALSE;

    public static Boolean getScalable() {
        return scalable;
    }

    private static String languagePath = "Supply\\src\\main\\java\\bundles\\Polish.properties";

    public static void setScalable(Boolean scalable) {
        UI_Properties.scalable = scalable;
    }

    public static String getLanguagePath() {
        return languagePath;
    }

    public static void setLanguagePath(String language) {
        UI_Properties.languagePath = "Supply\\src\\main\\java\\bundles\\" + language + ".properties";
    }
}
