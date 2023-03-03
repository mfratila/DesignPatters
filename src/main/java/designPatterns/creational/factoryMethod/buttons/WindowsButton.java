package designPatterns.creational.factoryMethod.buttons;


public class WindowsButton implements Button {

    public void render() {
        System.out.println("Rendering a Windows button...");
    }

    public void onClick() {
        System.out.println("Handling a click on a Windows button...");
    }
}
