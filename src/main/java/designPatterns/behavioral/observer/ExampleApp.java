package designPatterns.behavioral.observer;


import designPatterns.behavioral.observer.editor.Editor;
import designPatterns.behavioral.observer.listeners.EmailNotificationListener;
import designPatterns.behavioral.observer.listeners.LogOpenListener;

public class ExampleApp {

    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("/path/to/log/file.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
