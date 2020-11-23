package patterns.creational.abstract_factory.app;

import patterns.creational.abstract_factory.buttons.Button;
import patterns.creational.abstract_factory.checkboxes.Checkbox;
import patterns.creational.abstract_factory.factories.GUIFactory;

/**
 * It's not important for client with what kind
 * of factory it works because all the work goes
 * through common interfaces.
 */
public class Application {
    /**
     * Has info about client's button
     */
    private final Button button;

    /**
     * Has info about client's checkbox
     */
    private final Checkbox checkbox;

    /**
     * Gets client's factory realization for
     * working
     *
     * @param factory customs factory
     */
    public Application(GUIFactory factory) {
        this.button = factory.createButton();
        this.checkbox = factory.createCheckbox();
    }

    /**
     * Paints client's UI units
     */
    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
