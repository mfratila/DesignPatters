package designPatterns.creational.abstractFactory.factories;

import designPatterns.creational.abstractFactory.buttons.WindowsButton;
import designPatterns.creational.abstractFactory.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.checkboxes.WindowsCheckbox;
import designPatterns.creational.abstractFactory.buttons.Button;

public class WindowsFactory implements GUIFactory {

    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
