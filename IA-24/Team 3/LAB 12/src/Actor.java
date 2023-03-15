import java.util.HashSet;
import java.util.Objects;

class Actor {
    private final String name;
    private final HashSet<Film> films;

    public Actor(String name) {
        this.name = name;
        this.films = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public HashSet<Film> getFilms() {
        return films;
    }

    public void addFilm(Film film) {
        films.add(film);
    }


    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Actor actor = (Actor) obj;
        return name.equals(actor.name);
    }


    @Override
    public int hashCode(){
        return Objects.hash(name);
    }

}
