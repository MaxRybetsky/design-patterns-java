package patterns.creational.abstract_factory;

import patterns.creational.abstract_factory.app.Application;
import patterns.creational.abstract_factory.factories.GUIFactory;
import patterns.creational.abstract_factory.factories.MacFactory;
import patterns.creational.abstract_factory.factories.WinFactory;

import java.util.Scanner;

public class Demo {
    public static void main(String[] args) throws Exception {
        Application application = configureApplication();
        application.paint();
    }

    public static Application configureApplication() throws Exception {
        GUIFactory factory;
        Scanner scanner = new Scanner(System.in);
        String os = scanner.nextLine();
        if ("windows".equals(os.toLowerCase())) {
            factory = new WinFactory();
        } else if ("mac".equals(os.toLowerCase())) {
            factory = new MacFactory();
        } else {
            throw new Exception("Unknown OS!");
        }
        return new Application(factory);
    }
}