package patterns.creational.abstract_factory.checkboxes;

/**
 * Windows checkbox variant of checkboxes family
 */
public class WinCheckbox implements Checkbox {
    /**
     * Paints Windows checkbox
     */
    @Override
    public void paint() {
        System.out.println("You created a Windows checkbox");
    }
}
