import java.util.*;

public class Task2 {
    public static List<Actor> getActorsListThisActorHasEverPlayedWith(Actor actorToCheck, Cinema cinema) {
        System.out.print("Actors who ever played with " + actorToCheck.getActorName() + ": ");
        Set<Actor> actors = new LinkedHashSet<>();
        for (Iterator i = cinema.getCinemaFilmsInfo().iterator(); i.hasNext();) {
            Film film = (Film) i.next();
            if (film.whoPlayedInFilm().contains(actorToCheck)) {
                actors.addAll(film.whoPlayedInFilm());
                actors.remove(actorToCheck);
            }
        }
        List<Actor> actorsList = new ArrayList<>(actors);
        return actorsList;
    }
}