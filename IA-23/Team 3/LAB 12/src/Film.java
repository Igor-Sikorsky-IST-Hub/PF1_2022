import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Film implements Cinema {
    final private Map<String, Object> film;

    Film(String name, String[] actors) {
        film = new HashMap<>();
        film.put("name", name);
        film.put("actors", new HashSet<>(Set.of(actors)));
    }

    public Map<String, Object> info() {
        return film;
    }

    @Override
    public String toString() {
        return film.get("name").toString();
    }
}


