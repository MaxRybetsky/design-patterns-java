package patterns.creational.abstract_factory.factories;

import patterns.creational.abstract_factory.buttons.Button;
import patterns.creational.abstract_factory.checkboxes.Checkbox;

/**
 * Abstract factory knows about
 * all abstract types of products
 */
public interface GUIFactory {
    /**
     * Creates new Button product
     *
     * @return Button link to concrete button
     */
    Button createButton();

    /**
     * Creates new Checkbox product
     *
     * @return Checkbox link to concrete checkbox
     */
    Checkbox createCheckbox();
}
