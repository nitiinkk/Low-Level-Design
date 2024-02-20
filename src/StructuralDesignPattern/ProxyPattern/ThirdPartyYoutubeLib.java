package StructuralDesignPattern.ProxyPattern;

import java.util.HashMap;

public class ThirdPartyYoutubeLib implements  YoutubeLibrary {

    public HashMap<String, Video>popularVideos() {
        System.out.println("Getting popular videos....");
        return getRandomVideos();
    }

    public Video getVideo(String videoId) {
        System.out.println("Getting video for videoId: "+ videoId);
        return getSomeVideo(videoId);
    }

    HashMap<String, Video>getRandomVideos() {
        System.out.println("Downloading populars.....");
        HashMap<String, Video>hmap = new HashMap<>();
        hmap.put("abc", new Video("zjxidc", "Catzzz.avi"));
        hmap.put("def", new Video("qwerty", "Dancing Video.mp4"));
        System.out.println("Downloaded popular videos !!");
        return hmap;
    }

    public Video getSomeVideo(String videoId) {
        Video video = new Video(videoId, "some randome video");
        System.out.println("Downloaded video for videoId: " + videoId);
        return video;
    }

}
