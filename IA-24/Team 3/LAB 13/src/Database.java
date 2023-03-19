import java.util.ArrayList;
import java.util.List;

class Database {
    private static final List<Film> allFilms = new ArrayList<>();
    public static void addFilm(Film film) {
        allFilms.add(film);
    }

    private static final List<Actor> allActors = new ArrayList<>();
    public static void addActor(Actor actor) {
        allActors.add(actor);
    }

    public static List<Actor> getActors(){
        return allActors;
    }
    public static List<Film> getFilms(){
        return allFilms;
    }
}