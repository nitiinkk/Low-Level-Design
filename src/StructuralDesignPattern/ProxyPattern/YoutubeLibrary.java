package StructuralDesignPattern.ProxyPattern;

import java.util.HashMap;

public interface YoutubeLibrary {
    HashMap<String, Video>popularVideos();
    Video getVideo(String videoId);
}
