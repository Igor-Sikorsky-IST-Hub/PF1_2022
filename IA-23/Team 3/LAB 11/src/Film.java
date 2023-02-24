import java.util.Set;
import java.util.TreeSet;

public class Film{
    final private String name;
    final private Set<String> actors;

    public Film(String name, String[] actors) {
        this.name = name;
        this.actors = new TreeSet<>(Set.of(actors));
    }
    public String toString () {
        return name;
    }
    public Set<String> getActors () {
        return actors;
    }
}


