import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class FilmsDataBase {
    final private Map<String, Set<Cinema>> base;

    FilmsDataBase() {
        base = new HashMap<>();
        base.put("filmsBase", new HashSet<>());
        base.put("actorsBase", new HashSet<>());
    }

    public void appendWithFilm(Film film) {
        base.get("filmsBase").add(film);
    }

    public void appendWithActor(Actor actor) {
        base.get("actorsBase").add(actor);
    }

    public Map<String, Set<Cinema>> data() {
        return base;
    }
}
