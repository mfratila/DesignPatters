package designPatterns.behavioral.state;

import designPatterns.behavioral.state.ui.Player;
import designPatterns.behavioral.state.ui.UI;

public class ExampleApp {

    public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
