import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        // Creating actors-------------------------------------------------------------

        // actor bob
        List<String> actorFilmsList = new ArrayList<>();
        String[] actorFilms = {"Rock", "Mountain"};
        Collections.addAll(actorFilmsList, actorFilms);
        Actor bob = new Actor("Bob", actorFilmsList);

        // actor john
        actorFilmsList = new ArrayList<>();
        actorFilms = new String[]{"Rock", "Mountain", "Moon"};
        Collections.addAll(actorFilmsList, actorFilms);
        Actor john = new Actor("John", actorFilmsList);

        // actor david
        actorFilmsList = new ArrayList<>();
        actorFilms = new String[]{"David", "Hawaii"};
        Collections.addAll(actorFilmsList, actorFilms);
        Actor david = new Actor("David", actorFilmsList);

        // actor ryan
        actorFilmsList = new ArrayList<>();
        actorFilms = new String[]{"Drive"};
        Collections.addAll(actorFilmsList, actorFilms);
        Actor ryan = new Actor("Ryan", actorFilmsList);

        // actor vova
        actorFilmsList = new ArrayList<>();
        actorFilms = new String[]{};
        Collections.addAll(actorFilmsList, actorFilms);
        Actor vova = new Actor("Vova", actorFilmsList);

        //Creating films-------------------------------------------------------------

        // film rock
        List<Actor> whoPlayedInFilm = new ArrayList<>();
        whoPlayedInFilm.add(bob);
        whoPlayedInFilm.add(john);
        Film rock = new Film("Rock", whoPlayedInFilm);

        // film mountain
        whoPlayedInFilm = new ArrayList<>();
        whoPlayedInFilm.add(bob);
        whoPlayedInFilm.add(john);
        whoPlayedInFilm.add(david);
        Film mountain = new Film("Mountain", whoPlayedInFilm);

        // film moon
        whoPlayedInFilm = new ArrayList<>();
        whoPlayedInFilm.add(john);
        Film moon = new Film("Moon", whoPlayedInFilm);

        // film hawaii
        whoPlayedInFilm = new ArrayList<>();
        whoPlayedInFilm.add(david);
        Film hawaii = new Film("Hawaii", whoPlayedInFilm);

        // film drive
        whoPlayedInFilm = new ArrayList<>();
        whoPlayedInFilm.add(ryan);
        Film drive = new Film("Drive", whoPlayedInFilm);

        List<Actor> actorsList = new ArrayList<>();
        actorsList.add(bob);
        actorsList.add(john);
        actorsList.add(david);
        actorsList.add(ryan);
        actorsList.add(vova);

        List<Film> filmsList = new ArrayList<>();
        filmsList.add(rock);
        filmsList.add(mountain);
        filmsList.add(moon);
        filmsList.add(hawaii);
        filmsList.add(drive);

        // create an object of the Сinema class and add the created actorsList and filmsList to it
        Cinema cinema = new Cinema(filmsList, actorsList);

        // Task1
        System.out.println("Task1");
        System.out.println(Task1.getActorWhoNeverPlayed(cinema));

        // Task2
        System.out.println("Task2");
        List<Actor> actors = Task2.getActorsListThisActorHasEverPlayedWith(bob, cinema);
        for (Iterator i = actors.iterator(); i.hasNext();) {
            Actor actor = (Actor) i.next();
            System.out.print(actor.getActorName() + ", ");
        }
        System.out.println();

        // Task3
        System.out.println("Task3");
        System.out.println(Task3.filmWithBiggestAmountOfActers(cinema));
    }
}