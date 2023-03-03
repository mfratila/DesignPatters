package designPatterns.creational.abstractFactory;

import designPatterns.creational.abstractFactory.app.Application;
import designPatterns.creational.abstractFactory.factories.GUIFactory;
import designPatterns.creational.abstractFactory.factories.MacOSFactory;
import designPatterns.creational.abstractFactory.factories.WindowsFactory;

public class ExampleApp {

    private static Application configureApplication() {
        Application app;
        GUIFactory factory;
        String osName = System.getProperty("os.name").toLowerCase();
        if (osName.contains("mac")) {
            factory = new MacOSFactory();
        } else {
            factory = new WindowsFactory();
        }
        app = new Application(factory);
        return app;
    }

    public static void main(String[] args) {
        Application app = configureApplication();
        app.paint();
    }
}
