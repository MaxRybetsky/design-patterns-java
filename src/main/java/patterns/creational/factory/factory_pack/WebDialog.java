package patterns.creational.factory.factory_pack;

import patterns.creational.factory.buttons.Button;
import patterns.creational.factory.buttons.WebButton;

/**
 * Dialog in Web with html buttons
 */
public class WebDialog extends Dialog {
    /**
     * Creates new html button for
     * Web
     *
     * @return new html button
     */
    @Override
    public Button createButton() {
        return new WebButton();
    }
}
