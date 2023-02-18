public class Comment implements Comparable<Comment>{
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

    @Override
    public int compareTo(Comment other) {
        int result = this.commentLikes - other.commentLikes;
        if (result != 0){
            return result;
        }
        return this.commentText.compareTo(other.commentText);
    }

    public String toString() {
        return "Коментар: " + commentText + " к-сть лайків: " + commentLikes + " к-сть дизлайків: " + commentDislikes;
    }
}
