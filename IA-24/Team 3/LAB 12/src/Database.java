import java.util.HashSet;
public class Database {
    private static final HashSet<Film> films = new HashSet<>();
    private static final HashSet<Actor> actors = new HashSet<>();

    public static void addFilm(Film film) {
        films.add(film);
    }

    public static void addActor(Actor actor) {
        actors.add(actor);
    }

    public static HashSet<Film> getFilms() {
        return films;
    }

    public static HashSet<Actor> getActors() {
        return actors;
    }
}




