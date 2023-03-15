import java.util.HashSet;
import java.util.Objects;

class Film  {
    private final String name;
    private final HashSet<Actor> actors;

    public Film(String name) {
        this.name = name;
        this.actors = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public HashSet<Actor> getActors() {
        return actors;
    }
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Film Actor = (Film)obj;
        return name.equals(Actor.name);
    }
    public void addActor(Actor actor) {
        actors.add(actor);
    }

    @Override
    public int hashCode(){
        return Objects.hash(name);
    }
}