import java.util.TreeSet;
import java.util.Set;

public class Actor implements Comparable<Actor>{
    final private String name;
    final private Set<String> films;
    Actor (String name, String[] films) {
        this.name = name;
        this.films = new TreeSet<>(Set.of(films));
    }

    @Override
    public int compareTo(Actor actor) {
        return name.compareTo(actor.toString());
    }

    @Override
    public String toString() {
        return name;
    }
    public Set<String> filmsWithActor () {
        return films;
    }
}
