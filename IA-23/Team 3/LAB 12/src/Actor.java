import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Actor implements Cinema {
    final private Map<String, Object> actor;

    Actor(String name, String[] films) {
        actor = new HashMap<>();
        actor.put("name", name);
        actor.put("films", new HashSet<>(Set.of(films)));
    }

    Actor(String name, HashSet<String> films) {
        actor = new HashMap<>();
        actor.put("name", name);
        actor.put("films", films);
    }

    public Map<String, Object> info() {
        return actor;
    }

    @Override
    public String toString() {
        return actor.get("name").toString();
    }
}
