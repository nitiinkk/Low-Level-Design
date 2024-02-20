package StructuralDesignPattern.ProxyPattern;

public class Video {
    public String videoId;
    public String title;
    public String data;

    public Video(String videoId, String title) {
        this.videoId = videoId;
        this.title = title;
        this.data = title;
    }
}
