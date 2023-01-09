import java.util.List;

public class Film {
    private String title;
    private List<Actor> actorList;

    public Film(String title, List<Actor> actorList) {
        this.title = title;
        this.actorList = actorList;
    }

    public String getFilmTitle() {
        return this.title;
    }

    public List<Actor> whoPlayedInFilm() {
        return this.actorList;
    }
}
