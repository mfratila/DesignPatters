package designPatterns.structural.proxy.some_cool_media_library;

import lombok.*;

public class Video {
    public @Getter @Setter String id;
    public @Getter @Setter String title;
    public @Getter @Setter String data;

    Video(String id, String title) {
        this.id = id;
        this.title = title;
        this.data = "Random video.";
    }
}
