package designPatterns.creational.factoryMethod.dialogs;

import designPatterns.creational.factoryMethod.buttons.Button;
import designPatterns.creational.factoryMethod.buttons.HTMLButton;
import designPatterns.creational.factoryMethod.factory.Dialog;

public class HTMLDialog extends Dialog {
    public Button createButton() {
        return new HTMLButton();
    }
}
