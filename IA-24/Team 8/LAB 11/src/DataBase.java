import java.util.HashSet;
import java.util.Objects;

public class DataBase {
    private HashSet<Actor> actors = new HashSet<>();
    private HashSet<Movie> movies = new HashSet<>();
    private static DataBase instance;

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void addActors(Actor actor){
        this.actors.add(actor);
    }

    public void addMovies(Movie movie){
        this.movies.add(movie);
    }

    public HashSet<Actor> AllActors() {
        return actors;
    }

    public HashSet<Movie> AllMovies() {
        return movies;
    }

    public Actor getActor(String name, String surname) {
        String actorFullName = name + " " + surname;

        for (Actor actor : this.AllActors()) {
            if (Objects.equals(actor.FullName(), actorFullName)) {
                return actor;
            }
        }

        return new Actor(name, surname);
    }
}
