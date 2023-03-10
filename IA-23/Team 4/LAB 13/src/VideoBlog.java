import java.util.HashSet;
import java.util.Set;

public class VideoBlog {
    private String nickname;
    static Set<Video> allvideos = new HashSet<>();

    public static void addVideo(Video video){
        if(video.name.isEmpty()){
            throw new IllegalArgumentException("Title cannot be empty");
        }
        if(video.vidviews < 0 || video.vidlikes < 0 || video.viddislikes < 0){
            throw new IllegalArgumentException("The number of views, likes or dislikes cannot be less than 0");
        }
        allvideos.add(video);
    }

    public static Set<Video> getVideos() {
        return allvideos;
    }

    public VideoBlog(String nickname) {
        this.nickname = nickname;
    }
}