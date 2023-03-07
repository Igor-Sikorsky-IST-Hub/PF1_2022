import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;

public class Movie {
    private final String name;
    private final HashSet<Actor> cast = new HashSet<>();

    public Movie(String name) {
        this.name = name;
        DataBase db = DataBase.getInstance();
        db.addMovies(this);
    }

    public void addCast(Collection<Actor> actors){
        this.cast.addAll(actors);

        for (Actor actor : actors) {
            actor.Career().add(this);
        }
    }

    public void addCast(Actor actor){
        this.cast.add(actor);
        actor.Career().add(this);
    }

    public String Name() {
        return name;
    }

    public HashSet<Actor> Cast() {
        return cast;
    }

    @Override
    public String toString() {
        return name;
    }
}
