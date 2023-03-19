import java.io.IOException;
import java.util.*;

public class Main {
    public static void main(String[] args) throws RuntimeException {
        printResult();
    }


    public static void printResult() throws IllegalArgumentException {

        Film film1 = new Film("Deadpool");
        Film film2 = new Film("");
        Film film3 = new Film("The Pursuit of Happyness");
        Actor actor1 = new Actor("");
        Actor actor2 = new Actor("Will Smith");
        Actor actor3 = new Actor("Syre Smith");
        Actor actor4 = new Actor("Brad Pitt");

             try {
            film2.setName("Focus");
        } catch (InvalidFilmNameException e) {
            System.out.println("Error: " + e.getMessage());
            return;
        }
        try {
            actor1.setActor("Ryan Reynolds");
        } catch (InvalidActorNameException e) {
            throw new RuntimeException(e);
        }

        Database.addFilm(film1);
        Database.addFilm(film2);
        Database.addFilm(film3);
        Database.addActor(actor1);
        Database.addActor(actor2);
        Database.addActor(actor3);
        Database.addActor(actor4);

        film1.addActor(actor1);
        film2.addActor(actor2);
        film3.addActor(actor2);
        film3.addActor(actor3);
        actor1.addFilm(film1);
        actor2.addFilm(film2);
        actor2.addFilm(film3);
        actor3.addFilm(film3);

        System.out.println(getCoActors(actor2));
        System.out.println("The largest number of actors in the film - " + mostActors());
        notFilmed();

    }

    private static String mostActors() throws RuntimeException {
        int countActor = 0;
        String mostActored = "";
        List<Film> allfilms = Database.getFilms();
        for (Film film : allfilms) {
            if (countActor < film.getActors().size()) {
                countActor = film.getActors().size();
                mostActored = film.getName();
            } else if (countActor == film.getActors().size() && film.getActors().size() != 0) {
                mostActored = film.getName() + " and " + mostActored;
            }
        }
        return mostActored;
    }


    private static void notFilmed() throws NullPointerException {
        List<Actor> allActors = Database.getActors();

        for (Iterator<Actor> i = allActors.iterator(); i.hasNext(); ) {
            Actor actor = (Actor) i.next();
            if (actor.getFilms().isEmpty()) {
                System.out.println(actor.getName() + " - didn't act in any film ");
            }
        }
    }

    public static String getCoActors(Actor actor) throws NullPointerException {
        List<Actor> coActors = new ArrayList<>();
        List<Film> films = Database.getFilms();

        Iterator<Film> filmIter = films.iterator();
        while (filmIter.hasNext()) {
            Film film = filmIter.next();
            if (film.getActors().contains(actor)) {
                List<Actor> actors = film.getActors();
                Iterator<Actor> actorIter = actors.iterator();
                while (actorIter.hasNext()) {
                    Actor coActor = actorIter.next();
                    if (!coActor.equals(actor) && !coActors.contains(coActor)) {
                        coActors.add(coActor);
                    }
                }
            }
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Co-actors of ").append(actor.getName()).append(": ");

        Iterator<Actor> coActorIter = coActors.iterator();
        while (coActorIter.hasNext()) {
            Actor coActor = coActorIter.next();
            sb.append(coActor.getName()).append(", ");
        }
        if (coActors.size() > 0) {
            sb.delete(sb.length() - 2, sb.length());
        }
        return sb.toString();
    }
}




