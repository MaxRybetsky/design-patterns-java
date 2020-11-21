package patterns.creational.factory;

import patterns.creational.factory.factory_pack.Dialog;
import patterns.creational.factory.factory_pack.WebDialog;
import patterns.creational.factory.factory_pack.WindowsDialog;

/**
 * Application of dialogs using
 */
public class Application {
    /**
     * Link to {@link Dialog}
     */
    private static Dialog dialog;

    /**
     * Initialize {@link Application#dialog} value
     * by choosing right config data
     * @param config settings of dialog type
     */
    private static void initialize(String config) {
        if ("Windows".equals(config)) {
            dialog = new WindowsDialog();
        } else if ("Web".equals(config)) {
            dialog = new WebDialog();
        } else {
            throw new IllegalArgumentException("Unknown config!");
        }
    }

    // Using only common interface
    public static void main(String[] args) {
        initialize("Windows");
        dialog.render();
        initialize("Web");
        dialog.render();
    }
}
