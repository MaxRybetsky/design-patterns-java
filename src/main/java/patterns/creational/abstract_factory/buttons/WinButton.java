package patterns.creational.abstract_factory.buttons;

/**
 * Windows button variant of buttons family
 */
public class WinButton implements Button {
    /**
     * Paints Windows button
     */
    @Override
    public void paint() {
        System.out.println("You created a Windows button");
    }
}
