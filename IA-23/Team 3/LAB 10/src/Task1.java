import java.util.Iterator;

public class Task1 {
    public static String getActorWhoNeverPlayed(Cinema cinema) {
        Iterator<Actor> iterator = cinema.getCinemaActorsIfo().iterator();
        while (iterator.hasNext()) {
            Actor actor = iterator.next();
            if (actor.filmsWhereActorPlayed().isEmpty()) {
                return actor.getActorName() + " has never played in a film";
            }
        }
        return "There are not actors who never played in a film";
    }
}
