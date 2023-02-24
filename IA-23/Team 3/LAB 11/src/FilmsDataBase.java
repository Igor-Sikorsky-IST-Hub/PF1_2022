import java.util.Comparator;
import java.util.Set;
import java.util.TreeSet;

public class FilmsDataBase {
    final private Set<Actor> actorsBase;
    final private Set<Film> filmsBase;
    FilmsDataBase () {
        actorsBase = new TreeSet<>();
        filmsBase = new TreeSet<>(new FilmComparator());
    }
    public void appendWithFilm (Film film) {
        filmsBase.add(film);
    }
    public void appendWithActor (Actor actor) {
        actorsBase.add(actor);
    }
    public Set<Film> getFilmsBase () {
        return filmsBase;
    }
    public Set<Actor> getActorsBase () {
        return actorsBase;
    }
}

class FilmComparator implements Comparator<Film> {
    @Override
    public int compare(Film o1, Film o2) {
        return o1.toString().compareTo(o2.toString());
    }
}
