/**
 * Module responsible for managing the properties of UI and
 * <br>
 * making connection between module {@code Database} and {@code UI}
 *
 * @author Maciej
 */
module Management {
    exports org.properties to UI;
    requires Database;
}