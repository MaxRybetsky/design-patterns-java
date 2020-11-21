package patterns.creational.factory.factory_pack;

import patterns.creational.factory.buttons.Button;
import patterns.creational.factory.buttons.WindowsButton;

/**
 * Dialog in Windows with Windows button
 */
public class WindowsDialog extends Dialog {
    /**
     * Creates new Windows button
     *
     * @return new Windows button
     */
    @Override
    public Button createButton() {
        return new WindowsButton();
    }
}
