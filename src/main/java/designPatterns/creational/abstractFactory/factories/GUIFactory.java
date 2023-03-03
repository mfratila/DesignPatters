package designPatterns.creational.abstractFactory.factories;

import designPatterns.creational.abstractFactory.checkboxes.Checkbox;
import designPatterns.creational.abstractFactory.buttons.Button;

public interface GUIFactory {
    Button createButton();
    Checkbox createCheckbox();
}
