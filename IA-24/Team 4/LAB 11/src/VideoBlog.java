import java.util.Iterator;
import java.util.TreeSet;

public class VideoBlog {
    private String videoBlogger;
    private TreeSet<Video> videos;

    public VideoBlog(String videoBlogger) {
        this.videoBlogger = videoBlogger;
        this.videos = new TreeSet<Video>();
    }

    public String getVideoBlogger() {
        return videoBlogger;
    }

    public void setVideoBlogger(String videoBlogger) {
        this.videoBlogger = videoBlogger;
    }
    public void addVideo(Video newVideo) {
        this.videos.add(newVideo);
    }

    public void removeVideo(Video video) {
        videos.remove(video);
    }

    public TreeSet<Video> getVideos() {
        return videos;
    }

    public int getAllViews() {
        int viewsCount = 0;
        for (Iterator<Video> i = videos.iterator(); i.hasNext();){
            Video v = i.next();
            viewsCount += v.getViews();
        }
        return viewsCount;
    }

    public TreeSet<Video> getMostDislikedVideo() {
        TreeSet<Video> mostDislikedVideos = new TreeSet<Video>();
        int maxDislikes = 0;
        for (Iterator i = videos.iterator(); i.hasNext();) {
            Object o = i.next();
            if (o instanceof Video) {
                Video v = (Video) o;
                int dislikes = v.getDislikes();
                if (dislikes != 0 && dislikes >= maxDislikes) {
                    maxDislikes = dislikes;
                    mostDislikedVideos.add(v);
                }
            }
        }
        return mostDislikedVideos;
    }

    @Override
    public String toString() {
        return "VideoBlog{" +
                "videoBlogger='" + videoBlogger + '\'' +
                ", videos=" + videos +
                '}';
    }
}

