import java.util.*;

public class Video{
    String name;
    String URL;
    int vidviews;
    int vidlikes;
    int viddislikes;
    static List<Comment> comments = new ArrayList<>();

    public Video(String name,String URL,int vidviews,int vidlikes,int viddislikes) {
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
    public int getViddislikes() {return this.viddislikes;}

    public static List<Comment> getComments(){return comments;}
    public static void addcomment(Comment comment){comments.add(comment);}

    public String name() {return this.name;}
}