package patterns.creational.factory.buttons;

/**
 * Describes HTML button in web
 */
public class WebButton implements Button {
    /**
     * Draws html button
     */
    @Override
    public void render() {
        System.out.println("HTML button");
        onClick();
    }

    /**
     * Implements event handler to html button
     */
    @Override
    public void onClick() {
        System.out.println("html button says \"Hello!\"");
    }
}
