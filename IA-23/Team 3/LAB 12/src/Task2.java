import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Task2 {
    static String actorsGivenActorHasEverPlayedWith(Actor givenActor, FilmsDataBase base) {
        Set<String> actors = new TreeSet<>();
        for (Cinema film : base.data().get("filmsBase")) {
            for (Object actor : ((HashSet) film.info().get("actors"))) {
                if (actor.toString().equals(givenActor.toString())) {
                    actors.addAll(((HashSet) film.info().get("actors")));
                }
            }
        }
        actors.remove(givenActor.toString());
        StringBuilder builder = new StringBuilder(String.format("Actors who ever played with %s: ", givenActor));
        for (String actor : actors) {
            builder.append(actor);
            builder.append(", ");
        }
        return builder.toString();
    }
}
