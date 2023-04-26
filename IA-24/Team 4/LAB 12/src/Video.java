import java.util.*;
import java.util.ArrayList;

public class Video implements Comparable<Video> {
    private String name;
    private final String URL;
    private int views;
    private int likes;
    private int dislikes;
    private Map<Integer, Comment> comments;

    public Video(String name) {
        this.name = name;
        URL = "https://someblog.com/v/" + name.toLowerCase();
        comments = new HashMap<Integer, Comment>();
    }

    public void view(){
        views++;
    }

    public void like() {
        likes++;
    }

    public void dislike() {
        dislikes++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getURL() {
        return URL;
    }

    public int getViews() {
        return views;
    }

    public void setViews(int views) {
        this.views = views;
    }

    public int getLikes() {
        return likes;
    }

    public void setLikes(int likes) {
        this.likes = likes;
    }

    public int getDislikes() {
        return dislikes;
    }

    public void setDislikes(int dislikes) {
        this.dislikes = dislikes;
    }

    public void addComment(int id, Comment newComment) {
        comments.put(id, newComment);
    }

    public Map<Integer, Comment> getComments() {
        return comments;
    }

    public boolean hasMoreLikedComment() {
        for (Map.Entry<Integer, Comment> comment: comments.entrySet()) {
            if (likes < comment.getValue().getLikes()) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Video{" +
                "name='" + name + '\'' +
                ", URL='" + URL + '\'' +
                ", views=" + views +
                ", likes=" + likes +
                ", dislikes=" + dislikes +
                ",\ncomments=" + comments +
                '}';
    }

    @Override
    public int compareTo(Video o) {
        if (this.views == o.getViews()){
            return 0;
        }
        if (this.views < o.getViews()){
            return -1;
        }
        return 1;
    }
}
