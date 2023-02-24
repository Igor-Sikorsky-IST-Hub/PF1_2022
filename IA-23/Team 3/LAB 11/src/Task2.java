import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    static String actorsGivenActorHasEverPlayedWith (Actor givenActor, FilmsDataBase base) {
        Set<String> actors = new TreeSet<>();
        for (Film film: base.getFilmsBase()) {
            for (String actor: film.getActors()) {
                if (actor.equals(givenActor.toString())) {
                    actors.addAll(film.getActors());
                }
            }
        }
        actors.remove(givenActor.toString());
        StringBuilder builder = new StringBuilder(String.format("Actors who ever played with %s: ", givenActor));
        for (String actor: actors) {
            builder.append(actor);
            builder.append(", ");
        }
        return builder.toString();
    }
}
