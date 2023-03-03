package designPatterns.structural.bridge;

import designPatterns.structural.bridge.devices.Device;
import designPatterns.structural.bridge.devices.Radio;
import designPatterns.structural.bridge.devices.Tv;
import designPatterns.structural.bridge.remotes.AdvancedRemote;
import designPatterns.structural.bridge.remotes.BasicRemote;

public class ExampleApp {

    public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Tests with basic remote.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Tests with advanced remote.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
