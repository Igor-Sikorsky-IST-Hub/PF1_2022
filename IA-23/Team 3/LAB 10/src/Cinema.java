import java.util.List;

public class Cinema {
    private List<Film> filmsList;
    private List<Actor> actorsList;

    public Cinema(List<Film> filmsList, List<Actor> actorsList) {
        this.filmsList = filmsList;
        this.actorsList = actorsList;
    }

    public List<Film> getCinemaFilmsInfo() {
        return this.filmsList;
    }

    public List<Actor> getCinemaActorsIfo() {
        return this.actorsList;
    }
}
