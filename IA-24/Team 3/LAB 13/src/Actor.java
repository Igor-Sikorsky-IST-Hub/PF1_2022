import java.util.ArrayList;
import java.util.List;

public class Actor{
    private String name;
    private final List<Film> films = new ArrayList<>();
    public Actor(String name) {
        this.name = name;
    }

    public void setActor(String name) throws InvalidActorNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new InvalidActorNameException("Invalid film name: " + name);
        }
        this.name = name;
    }

    public void addFilm(Film film) {
        this.films.add(film);
    }
    public List<Film> getFilms(){
        return this.films;
    }
    public String getName() {
        return this.name;
    }

}
class InvalidActorNameException extends Exception {

    public InvalidActorNameException(String message) {
        super(message);
    }

}