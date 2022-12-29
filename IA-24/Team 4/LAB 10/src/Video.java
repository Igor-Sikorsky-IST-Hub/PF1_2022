import java.util.ArrayList;

public class Video {
    private String name;
    private final String URL;
    private int views;
    private int likes;
    private int dislikes;
    private ArrayList<Comment> comments;

    public Video(String name) {
        this.name = name;
        URL = "https://someblog.com/v/" + name.toLowerCase();
        comments = new ArrayList<>();
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

    public void addComment(Comment newComment) {
        comments.add(newComment);
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public boolean hasMoreLikedComment() {
        for (Comment comment: comments) {
            if (likes < comment.getLikes()) {
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
}
