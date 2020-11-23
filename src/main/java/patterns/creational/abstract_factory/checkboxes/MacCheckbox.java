package patterns.creational.abstract_factory.checkboxes;

/**
 * MacOS checkbox variant of checkboxes family
 */
public class MacCheckbox implements Checkbox {
    /**
     * Paints MacOS checkbox
     */
    @Override
    public void paint() {
        System.out.println("You created a MacOS checkbox");
    }
}
