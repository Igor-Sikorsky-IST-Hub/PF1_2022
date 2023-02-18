import java.util.Set;
import java.util.TreeSet;

public class VideoBlog {
    private String nickname;
    static Set<Video> allvideos = new TreeSet<Video>(new Video.VideoComparator());

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