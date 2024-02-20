package StructuralDesignPattern.ProxyPattern;

import StructuralDesignPattern.ProxyPattern.Proxy.YoutubeCacheProxy;

public class Demo {
    public static void main(String[] args) {
        System.out.println("--- Proxy Pattern ---- ");
        YoutubeDownloader naiveDownloader = new YoutubeDownloader(new ThirdPartyYoutubeLib());
        YoutubeDownloader smartDownloader = new YoutubeDownloader(new YoutubeCacheProxy());
        long naive = speedTest(naiveDownloader);
        long smart = speedTest(smartDownloader);
        System.out.println(" Time saved by caching Proxy: " + (naive - smart) + " ms");
    }

    public static long speedTest(YoutubeDownloader youtubeDownloader) {
        long startTime = System.currentTimeMillis();
        youtubeDownloader.renderPopularVideos();
        youtubeDownloader.renderVideoPage("catzzzz");
        youtubeDownloader.renderVideoPage("catzzzz");

        long estimatedTime = System.currentTimeMillis() - startTime;
        System.out.println("Elapsed time : " + estimatedTime + "ms");
        return estimatedTime;
    }
}
