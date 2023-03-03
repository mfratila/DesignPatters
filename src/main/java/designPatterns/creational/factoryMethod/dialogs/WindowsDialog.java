package designPatterns.creational.factoryMethod.dialogs;

import designPatterns.creational.factoryMethod.buttons.Button;
import designPatterns.creational.factoryMethod.factory.Dialog;
import designPatterns.creational.factoryMethod.buttons.WindowsButton;


public class WindowsDialog extends Dialog {
    public Button createButton() {
        return new WindowsButton();
    }
}