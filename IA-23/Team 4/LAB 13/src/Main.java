import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        VideoBlog blog = new VideoBlog("Nanana");
        Video video1 = new Video("Git tutorial", "https://youtu.be/UQ8nXehmOro", 56_000, 8300, 500);
        Video video2 = new Video("Student life", "https://youtu.be/dQw4w9WgXcQ", 30_000, 4800, 500);
        Video video3 = new Video("My plans for future", "https://youtu.be/fMSS6diyXQE", 145_000, 10000, 23);
        Video video4 = new Video("Some title", "https://youtu.be/UydUK-adIQs", -2222, 31, 4);
        Video video5 = new Video("", "https://youtu.be/2fhs0S_MIws", 46, 6, 0);
        try {
            VideoBlog.addVideo(video1);
            VideoBlog.addVideo(video2);
            VideoBlog.addVideo(video3);
           // VideoBlog.addVideo(video4); // Exception
            VideoBlog.addVideo(video5); // Exception
        } catch (IllegalArgumentException e) {
            System.out.println("Exception! " + e.getMessage());
        }

        Comment com1 = new Comment("I like it!", 123, 15);
        Comment com2 = new Comment("You have such a pretty dog!", 9999, 0);
        Comment com3 = new Comment("You are so lazy. One video per month! Unsubscribe!!", 3, 87);
        Comment com4 = new Comment("The shimmering stars in the midnight sky illuminated the darkened landscape below. " +
                "A lone wolf howled mournfully in the distance, while a soft breeze whispered through the trees. " +
                "It was a moment of serene beauty, a fleeting glimpse of the wonders of nature.", 32, 1);
        Comment com5 = new Comment(null, 2, 12);
        try {
            video1.addСomment(com1);
            video1.addСomment(com2);
            video2.addСomment(com3);
            video2.addСomment(com4); // Exception
            video3.addСomment(com1);
            video3.addСomment(com2);
            video3.addСomment(com3);
            video3.addСomment(com5); // Exception
        } catch (NullPointerException e) {
            System.out.println("Exception! " + e.getMessage());
        } catch (CommentLengthExceededException e) {
            System.out.println("Exception! " + e.getMessage());
        }


        System.out.println("Total views: " + task1());
        System.out.println("Is there any comment which has more likes than it`s video: " + task2());
        System.out.print("Video which have the biggest number of dislike: ");
        task3();
        System.out.println();
        System.out.println("Videos with more than 50000 views: " + task4());

    }

    /*1-типізований
     2-for-each
     3-нетипізований*/

    //1. Сумарна кількість переглядів усіх відео разом
    public static int task1() {
        int sumviews = 0;
        Iterator<Video> i = VideoBlog.getVideos().iterator();
        while (i.hasNext()) {
            Video video = i.next();
            sumviews += video.getVidviews();
        }
        return sumviews;
    }

    //2. Чи є коментар, що набрав лайків більше, ніж відео, до якого він дописаний
    static boolean task2() {
        int videolikes;
        int commentlikes;
        for (Video video : VideoBlog.allvideos) {
            videolikes = video.getVidlikes();
            for (Comment comment : Video.comments) {
                commentlikes = comment.getCommentLikes();
                if (commentlikes > videolikes) return true;
            }
        }
        return false;
    }

    //3. Відео, що набрало найбільшу кількість дізлайків
    public static void task3() {
        Set<Video> maxdislike = new HashSet<>();
        int dislike;
        int max = 0;
        for (Iterator i = VideoBlog.getVideos().iterator(); i.hasNext(); ) {
            Video video = (Video) i.next();
            dislike = video.getViddislikes();
            if (dislike > max) max = dislike;
        }
        for (Iterator i = VideoBlog.getVideos().iterator(); i.hasNext(); ) {
            Video video = (Video) i.next();
            dislike = video.getViddislikes();
            if ((dislike == max) & (max != 0)) {
                maxdislike.add(video);
            }
        }
        for (Video n : maxdislike) System.out.print(n.name() + "; ");
    }

    //Відео, що мають більше 50_000 переглядів (реалізація HashMap)
    public static HashMap<String, String> task4() {
        HashMap<String, String> vidViewsStats = new HashMap<>();
        for (Iterator<Video> i = VideoBlog.getVideos().iterator(); i.hasNext(); ) {
            Video video = i.next();
            if (video.vidviews >= 50_000) {
                vidViewsStats.put(video.name, video.URL);
            }
        }
        return vidViewsStats;
    }
}