import java.util.ArrayList;
import java.util.List;

public class Film{
    private String name;
    private final List<Actor> actors = new ArrayList<>();
    public Film(String name) {
        this.name = name;
    }
    public void setName(String name) throws InvalidFilmNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidFilmNameException("Invalid film name: " + name);
        }
        this.name = name;
    }

    public void addActor(Actor actor) {
        this.actors.add(actor);
    }
    public List<Actor> getActors(){
        return this.actors;
    }
    public String getName() {
        return this.name;
    }
}
class InvalidFilmNameException extends Exception {

    public InvalidFilmNameException(String message) {
        super(message);
    }

}

