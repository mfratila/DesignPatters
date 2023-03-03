package designPatterns.creational.abstractFactory.app;

import designPatterns.creational.abstractFactory.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.factories.GUIFactory;
import designPatterns.creational.abstractFactory.buttons.Button;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.paint();
        checkbox.paint();
    }
}
