package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.buttons.Button;
import patterns.creational.abstract_factory.buttons.MacButton;
import patterns.creational.abstract_factory.checkboxes.Checkbox;
import patterns.creational.abstract_factory.checkboxes.MacCheckbox;

/**
 * Each specific factory knows and creates only
 * its own variants of products.
 * <p>
 * This one creates products for MacOS
 */
public class MacFactory implements GUIFactory {
    /**
     * Creates new Button product in MacOS
     *
     * @return MacOS button
     */
    @Override
    public Button createButton() {
        return new MacButton();
    }

    /**
     * Creates new Checkbox product in MacOS
     *
     * @return MacOS checkbox
     */
    @Override
    public Checkbox createCheckbox() {
        return new MacCheckbox();
    }
}