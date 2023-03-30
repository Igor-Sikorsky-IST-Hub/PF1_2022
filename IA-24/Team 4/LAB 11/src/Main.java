
public class Main {
    public static void main(String[] args) {
        CommentComparator commentComparator = new CommentComparator();

        //------------------------Comment------------------------//
        Comment comment1 = new Comment("Didn't thought that name of the video would be so wrong...");
        comment1.setLikes(100);
        comment1.setDislikes(1);

        Comment comment2 = new Comment("L0L");
        comment2.setLikes(2);
        comment2.setDislikes(4);

        Comment comment3 = new Comment("Qwerty");
        comment2.setLikes(2);

        Comment comment4 = new Comment("Some Comment");
        comment2.setDislikes(1);

        //-------------------------Video-------------------------//
        Video video1 = new Video("FirstVideo", commentComparator);
        video1.setViews(50);
        video1.setLikes(5);
        video1.setDislikes(2);

        Video video2 = new Video("SecondVideo", commentComparator);
        video2.setViews(35);
        video2.setLikes(15);
        video2.setDislikes(2);

        Video video3 = new Video("ThirdVideo", commentComparator);
        video3.setViews(70);
        video3.setLikes(10);
        video3.setDislikes(0);

        Video video4 = new Video("CoolVideo", commentComparator);
        video4.setViews(101);
        video4.setLikes(1);
        video4.setDislikes(100);

        Video video5 = new Video("StrangeVideo", commentComparator);
        video5.setViews(60);
        video5.setLikes(50);
        video5.setDislikes(3);

        Video video6 = new Video("Should I do video?", commentComparator);
        video6.setViews(200);
        video6.setLikes(75);
        //-------------------------------------------------------//

        video4.addComment(comment1);
        video4.addComment(comment2);
        video4.addComment(comment3);
        video5.addComment(comment4);

        //-----------------------VideoBlog-----------------------//
        VideoBlog videoBlog1 = new VideoBlog("CoolThings");
        VideoBlog videoBlog2 = new VideoBlog("StupidThings");
        VideoBlog videoBlog3 = new VideoBlog("SomeThings");

        videoBlog1.addVideo(video1);
        videoBlog1.addVideo(video2);
        videoBlog1.addVideo(video3);

        videoBlog2.addVideo(video4);
        videoBlog2.addVideo(video5);

        videoBlog3.addVideo(video6);

        System.out.println("Sort videoBlog" + " {" + videoBlog1.getVideoBlogger() + "} by Views:");
        for (Video video: videoBlog1.getVideos()) {
            System.out.println("\t" + video.getName() + " " + video.getViews());
        }

        System.out.println("\n");

        System.out.println("Sort comment" + " {" + video4.getName() + "} by length:");
        for (Comment comment: video4.getComments()){
            System.out.println("\t" + comment.getText());
        }

        System.out.println("\n=============================================\n");

        printHasMoreLikedComment(video4);
        printHasMoreLikedComment(video5);

        System.out.println("\n=============================================\n");

        printAllViews(videoBlog1);
        printAllViews(videoBlog2);
        printAllViews(videoBlog3);

        System.out.println("\n=============================================\n");

        printMostDislikedVideo(videoBlog1);
        printMostDislikedVideo(videoBlog2);
        printMostDislikedVideo(videoBlog3);

        System.out.println("\n=============================================\n");
    }

    private static void printHasMoreLikedComment(Video video) {
        System.out.println("Video " + video.getName() +
                " at URL \"" + video.getURL() +
                "\" has more liked comment: " + video.hasMoreLikedComment());
    }

    private static void printAllViews(VideoBlog videoBlog) {
        System.out.println("Videoblogger " + videoBlog.getVideoBlogger() +
                " has " + videoBlog.getAllViews() +
                " views in total on his videoblog.");
    }

    private static void printMostDislikedVideo(VideoBlog videoBlog) {
        System.out.println("Most disliked videos on videoblog " + videoBlog.getVideoBlogger() +
                ": " + videoBlog.getMostDislikedVideo());
    }

}