package designPatterns.creational.factoryMethod.buttons;

public class HTMLButton implements Button {

    public void render() {
        System.out.println("Rendering an HTML button...");
    }

    public void onClick() {
        System.out.println("Handling a click on an HTML button...");
    }
}
