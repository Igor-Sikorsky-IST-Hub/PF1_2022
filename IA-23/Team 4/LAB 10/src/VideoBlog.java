import java.util.*;

public class VideoBlog {
    private String nickname;
    static List<Video> allvideos = new ArrayList<Video>();

    public static void addVideo(Video video){
        allvideos.add(video);
    }
    public static List<Video> getVideos(){
        return allvideos;
    }
    public VideoBlog(String nickname) {
        this.nickname = nickname;
    }
}