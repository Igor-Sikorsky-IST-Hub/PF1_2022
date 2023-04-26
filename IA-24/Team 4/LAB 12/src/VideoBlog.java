import java.util.*;

public class VideoBlog {
    private String videoBlogger;
    private Map<Integer, Video> videos;

    public VideoBlog(String videoBlogger) {
        this.videoBlogger = videoBlogger;
        this.videos = new HashMap<Integer, Video>();
    }

    public String getVideoBlogger() {
        return videoBlogger;
    }

    public void setVideoBlogger(String videoBlogger) {
        this.videoBlogger = videoBlogger;
    }
    public void addVideo(int id, Video newVideo) {
        this.videos.put(id, newVideo);
    }

    public Map<Integer, Video> getVideos() {
        return videos;
    }

    public int getAllViews() {
        int viewsCount = 0;
        for (Map.Entry<Integer, Video> v : videos.entrySet()){
            viewsCount += v.getValue().getViews();
        }
        return viewsCount;
    }

    public Map<Integer, Video> getMostDislikedVideo() {
        Map<Integer, Video> mostDislikedVideos = new HashMap<Integer, Video>();
        int maxDislikes = 0;
        int id = 1;
        for (Map.Entry<Integer, Video> v : videos.entrySet()) {
            int dislikes = v.getValue().getDislikes();
            if (dislikes != 0 && dislikes >= maxDislikes) {
                maxDislikes = dislikes;
                mostDislikedVideos.put(id++, v.getValue());
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

