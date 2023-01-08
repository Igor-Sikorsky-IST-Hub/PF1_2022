import java.util.*;
public class Main {
    public static void main(String[] args) {
        VideoBlog blog = new VideoBlog("TA");
        Video video1 = new Video("viber", "https://youtu.be/UQ8nXehmOro",56000,8300, 500);
        Video video2 = new Video("student", "https://youtu.be/Zvg8RGcgGpw",30000,4800, 500);
        Video video3 = new Video("forest", "https://youtu.be/UQ8nXehmOro",48000,10000, 23);
        VideoBlog.addVideo(video1);
        VideoBlog.addVideo(video2);
        VideoBlog.addVideo(video3);


        Comment com1 = new Comment("I like it!", 123, 15);
        Comment com2 = new Comment("You have such a pretty dog!", 9999, 0);
        Comment com3 = new Comment("You are so lazy. One video per month! Unsubscribe!!!", 3, 87);
        video1.addcomment(com1);
        video1.addcomment(com2);
        video2.addcomment(com3);
        video3.addcomment(com1);
        video3.addcomment(com2);
        video3.addcomment(com3);


        System.out.println("Total views: "+task1());
        System.out.println("Is there any comment which has more likes than it`s video: "+task2());
        System.out.print("Video which have the biggest number of dislike: ");
        task3();

       }
/*1-типізований
 2-for-each
 3-нетипізований*/
    //сумарна цількість перегляду всіх відео
    public static int task1() {
    int sumviews=0;
    Iterator<Video> i = VideoBlog.getVideos().iterator();
    while (i.hasNext()){
        Video video = i.next();
        sumviews+=video.getVidviews();

    }
    return sumviews;}

    static boolean task2() {
        int videolikes;
        int commentlikes;
        for(Video video: VideoBlog.allvideos){
            videolikes = video.getVidlikes();
            for (Comment comment: Video.comments){
            commentlikes = comment.getCommentLikes();
            if (commentlikes>videolikes) return true;
        }
    }
        return false;
    }

    public static void task3(){
        List <Video> maxdislike =new ArrayList<Video>();
        int dislike;
        int max = 0;
        for(Iterator i = VideoBlog.getVideos().iterator();i.hasNext();){
            Video video = (Video) i.next();
            dislike = video.getViddislikes();
            if (dislike>max) max = dislike;
        }
        for(Iterator i = VideoBlog.getVideos().iterator();i.hasNext();){
            Video video =(Video) i.next();
            dislike = video.getViddislikes();
            if((dislike==max)&(max!=0)){
                maxdislike.add(video);}
        }
        for(Video n:maxdislike)System.out.print(n.name()+" ");

    }
}