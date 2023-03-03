package designPatterns.creational.abstractFactory.factories;

import designPatterns.creational.abstractFactory.buttons.MacOSButton;
import designPatterns.creational.abstractFactory.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.checkboxes.MacOSCheckbox;
import designPatterns.creational.abstractFactory.buttons.Button;

public class MacOSFactory implements GUIFactory {
    @Override
    public Button createButton() {
        return new MacOSButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new MacOSCheckbox();
    }
}
