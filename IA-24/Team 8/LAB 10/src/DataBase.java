import java.util.*;

public class DataBase {
    private static List<Actor> allActors = new ArrayList<>();
    private static List<Movie> allFilms = new ArrayList<>();

    public static void addActors(Collection<Actor> actors){
        allActors.addAll(actors);
    }
    public static void addFilms(Collection<Movie> movies){
        allFilms.addAll(movies);
    }

    public static List<Actor> getAllActors() {
        return allActors;
    }

    public static List<Movie> getAllFilms() {
        return allFilms;
    }
}
