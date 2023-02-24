import java.util.HashSet;
import java.util.Set;

public class VideoBlog {
    private String nickname;
    static Set<Video> allvideos = new HashSet<>();

    public static void addVideo(Video video) {
        allvideos.add(video);
    }

    public static Set<Video> getVideos() {
        return allvideos;
    }

    public VideoBlog(String nickname) {
        this.nickname = nickname;
    }
}