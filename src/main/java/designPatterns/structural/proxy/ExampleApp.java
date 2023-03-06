package designPatterns.structural.proxy;


import designPatterns.structural.proxy.downloader.YouTubeDownloader;
import designPatterns.structural.proxy.proxy.YoutubeCacheProxy;
import designPatterns.structural.proxy.some_cool_media_library.ThirdPartyYoutubeClass;

public class ExampleApp {

    public static void main(String[] args) {
        YouTubeDownloader naiveDownloader = new YouTubeDownloader(new ThirdPartyYoutubeClass());
        YouTubeDownloader smartDownloader = new YouTubeDownloader(new YoutubeCacheProxy());

        long naiveTime = test(naiveDownloader);
        long smartTime = test(smartDownloader);
        System.out.println("Time saved by caching proxy: " + (naiveTime - smartTime) + "ms");

    }

    private static long test(YouTubeDownloader downloader) {
        long startTime = System.currentTimeMillis();

        // User behavior in our app:
        downloader.renderPopularVideos();
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderPopularVideos();
        downloader.renderVideoPage("dancesvideoo");
        // Users might visit the same page quite often.
        downloader.renderVideoPage("catzzzzzzzzz");
        downloader.renderVideoPage("someothervid");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.print("Time elapsed: " + estimatedTime + "ms\n");
        return estimatedTime;
    }
}
