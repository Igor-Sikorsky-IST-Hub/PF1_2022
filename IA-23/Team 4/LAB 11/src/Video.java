import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class Video {
    String name;
    String URL;
    int vidviews;
    int vidlikes;
    int viddislikes;
    static Set<Comment> comments = new TreeSet<>();

    public Video(String name, String URL, int vidviews, int vidlikes, int viddislikes) {
        this.name = name;
        this.URL = URL;
        this.vidviews = vidviews;
        this.vidlikes = vidlikes;
        this.viddislikes = viddislikes;

    }

    static class VideoComparator implements Comparator<Video>{

        @Override
        public int compare(Video first, Video second) {
            int result = first.vidviews - second.vidviews;
            if(result != 0){
                return result;
            }
            return first.viddislikes - second.viddislikes;
        }
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

    public static Set<Comment> getComments() {
        return comments;
    }

    public static void addСomment(Comment comment) {
        comments.add(comment);
    }

    public String name() {
        return this.name;
    }
}


