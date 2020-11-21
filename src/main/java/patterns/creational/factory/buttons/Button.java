package patterns.creational.factory.buttons;

/**
 * Factory pattern of buttons structure
 * <p>
 * Main interface represents abstract button.
 * We have button's hierarchy
 */
public interface Button {
    /**
     * Draws button
     */
    void render();

    /**
     * Event when button was pressed
     */
    void onClick();
}
