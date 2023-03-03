package designPatterns.structural.facade;


import designPatterns.structural.facade.facade.VideoConversionFacade;

import java.io.File;

public class ExampleApp {

    public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
    }


}
