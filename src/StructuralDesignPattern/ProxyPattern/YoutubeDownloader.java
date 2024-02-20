package StructuralDesignPattern.ProxyPattern;

import StructuralDesignPattern.ProxyPattern.Proxy.YoutubeCacheProxy;

import java.util.HashMap;

public class YoutubeDownloader {
    private YoutubeLibrary api;

    public YoutubeDownloader(ThirdPartyYoutubeLib api) {
        this.api = api;
    }

    public void renderVideoPage(String videoId) {
        Video video = api.getVideo(videoId);
        System.out.println("\n------------");
        System.out.println("Video page (imagine fancy HTML)");
        System.out.println("ID: " + video.videoId);
        System.out.println("Title: " + video.title);
        System.out.println("Video: " + video.data);
        System.out.println("-------------------------------\n");
    }

    public void renderPopularVideos() {
        HashMap<String, Video> listPopularVideos = api.popularVideos();
        System.out.println("Most popular videos on YouTube (imagine fancy HTML)");
        for(Video video: listPopularVideos.values()) {
            System.out.println("ID: " + video.videoId + " / Title: " + video.title);
        }
    }
}
