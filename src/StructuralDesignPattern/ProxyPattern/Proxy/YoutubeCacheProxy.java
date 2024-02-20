package StructuralDesignPattern.ProxyPattern.Proxy;

import StructuralDesignPattern.ProxyPattern.ThirdPartyYoutubeLib;
import StructuralDesignPattern.ProxyPattern.Video;
import StructuralDesignPattern.ProxyPattern.YoutubeLibrary;

import java.util.HashMap;

public class YoutubeCacheProxy extends ThirdPartyYoutubeLib {
    private YoutubeLibrary api;
    private HashMap<String, Video>cacheAll = new HashMap<String, Video>();
    private HashMap<String, Video>cachePopular = new HashMap<>();

    public YoutubeCacheProxy () {
        this.api = new ThirdPartyYoutubeLib();
    }

    public HashMap<String, Video>popularVideos() {
        if(cachePopular.isEmpty()) {
            cachePopular = api.popularVideos();
        } else {
            System.out.println("Retrieved List from cache....");
        }
        return cachePopular;
    }

    public Video getVideo(String videoId) {
        Video video = cacheAll.get(videoId);
        if(video == null) {
            video = api.getVideo(videoId);
            cacheAll.put(videoId, video);
        } else {
            System.out.println("retrieved video "+ videoId + " from cache.");
        }
        return video;
    }
}
