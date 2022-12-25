import java.util.*;
public class Comment{
    String commentText;
    int commentLikes;
    int commentDislikes;

    public Comment(String commentText, int commentLikes, int commentDislikes) {
        this.commentText = commentText;
        this.commentLikes = commentLikes;
        this.commentDislikes = commentDislikes;
    }

    public int getCommentLikes() {
        return this.commentLikes;
    }
    public String toString(){
        return "Коментар: " + commentText + " к-сть лайків: " + commentLikes + " к-сть дизлайків: " + commentDislikes;
    }
}