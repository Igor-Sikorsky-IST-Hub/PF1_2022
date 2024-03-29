import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class Data_Proc {
    public Collection<Actor> listActors(String actorFullName) {
        String[] names = actorFullName.split("[., ]");
        Actor tempActor = null;

        List<Actor> actors = Data.getAllActors();
        List<Movie> movies = Data.getAllFilms();
        ArrayList<Actor> actorsList = new ArrayList<>();

        for (Actor actor : actors) {
            if (actor.getName().equals(names[0]) &
                    actor.getSurname().equals(names[names.length - 1])) {
                tempActor = actor;
                break;
            }
        }

        for (Movie movie : movies) {
            List<Actor> cast = movie.getCast();

            if (cast.contains(tempActor))
                actorsList.addAll(cast);

            actorsList.remove(tempActor);
        }

        actorsList = removeDuplicates(actorsList);

        return actorsList;
    }

    public ArrayList<Actor> removeDuplicates(Collection<Actor> actors) {
        ArrayList<Actor> newActorsList = new ArrayList<>();

        for (Actor actor : actors)
            if (!newActorsList.contains(actor))
                newActorsList.add(actor);

        return newActorsList;
    }
}