import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Video {
    String name;
    String URL;
    int vidviews;
    int vidlikes;
    int viddislikes;
    static Set<Comment> comments = new HashSet<>();


    public Video(String name, String URL, int vidviews, int vidlikes, int viddislikes) {
        this.name = name;
        this.URL = URL;
        this.vidviews = vidviews;
        this.vidlikes = vidlikes;
        this.viddislikes = viddislikes;

    }

    public int getVidviews() {
        return this.vidviews;
    }

    public int getVidlikes() {
        return this.vidlikes;
    }

    public int getViddislikes() {
        return this.viddislikes;
    }


    public static void addСomment(Comment comment) {
        comments.add(comment);
    }

    public String name() {
        return this.name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Video video = (Video) o;
        return Objects.equals(name, video.name) && URL.equals(video.URL);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, URL);
    }
}