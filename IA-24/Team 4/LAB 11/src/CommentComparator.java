import java.util.Comparator;

public class CommentComparator implements Comparator<Comment> {
    @Override
    public int compare(Comment o1, Comment o2) {
        if (o1.getText().length() == o2.getText().length()){
            return 0;
        }
        if (o1.getText().length() > o2.getText().length()){
            return -1;
        }
        return 1;
    }
}
