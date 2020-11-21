package patterns.creational.factory.factory_pack;

import patterns.creational.factory.buttons.Button;

/**
 * Main factory class.
 * <p>
 * NOTE: Factory is not main role for
 * the class in common case
 */
public abstract class Dialog {
    /**
     * Creates new button and draws it
     * <p>
     * {@link Button} is the common interface for all
     * buttons, so we can use factory method
     * {@link Dialog#createButton()}
     */
    public void render() {
        Button button = createButton();
        button.render();
    }

    /**
     * Factory method for creation {@link Button}
     * subclasses objects
     *
     * @return new product of {@link Button}'s
     * implementation class
     */
    public abstract Button createButton();
}
