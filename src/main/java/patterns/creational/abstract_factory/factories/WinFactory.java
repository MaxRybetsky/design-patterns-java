package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.buttons.Button;
import patterns.creational.abstract_factory.buttons.WinButton;
import patterns.creational.abstract_factory.checkboxes.Checkbox;
import patterns.creational.abstract_factory.checkboxes.WinCheckbox;

/**
 * Each specific factory knows and creates only
 * its own variants of products
 * <p>
 * This one creates products for Windows
 */
public class WinFactory implements GUIFactory {
    /**
     * Creates new Button product in Windows
     *
     * @return Windows button
     */
    @Override
    public Button createButton() {
        return new WinButton();
    }

    /**
     * Creates new Checkbox product in Windows
     *
     * @return Windows checkbox
     */
    @Override
    public Checkbox createCheckbox() {
        return new WinCheckbox();
    }
}
