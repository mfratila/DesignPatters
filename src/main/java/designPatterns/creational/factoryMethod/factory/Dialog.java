package designPatterns.creational.factoryMethod.factory;

import designPatterns.creational.factoryMethod.buttons.Button;

public abstract class Dialog {
    public abstract Button createButton();

    public void render() {
        Button button = createButton();
        button.render();
        button.onClick();
    }
}
