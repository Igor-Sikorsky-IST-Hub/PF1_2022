import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Movie {
    String name;
    List<Actor> cast = new ArrayList<>();

    public Movie(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public <Actor> List<Actor> getCast() {
        return (List<Actor>) cast;
    }
    public void addCast(Collection<Actor> actors){
        this.cast.addAll(actors);
    }

    @Override
    public String toString() {
        return  name;
    }


}
