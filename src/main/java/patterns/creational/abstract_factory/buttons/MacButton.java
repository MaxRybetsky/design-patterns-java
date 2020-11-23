package patterns.creational.abstract_factory.buttons;

/**
 * MacOS button variant of buttons family
 */
public class MacButton implements Button {
    /**
     * Paints MacOS button
     */
    public void paint() {
        System.out.println("You created a MacOS button");
    }
}
