import java.util.List;
import java.util.Iterator;

public class Main {

    public static void Database() {
        Film film1 = new Film ("Deadpool");
        Film film2 = new Film ("Focus");
        Film film3 = new Film ("The Pursuit of Happyness");

        Actor actor1 = new Actor("Ryan Rodney");
        Actor actor2 = new Actor("Will Smith");
        Actor actor3 = new Actor("Syre Smith");
        Actor actor4 = new Actor("Brad Pitt");

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

    }
    public static void main(String[] args){
        Database();
        notFilmed();
    }

    private static void notFilmed() {
        List<Actor> allactors = Database.getActors();

        for (Iterator <Actor> i = allactors.iterator(); i.hasNext();) {
            Actor actor = (Actor) i.next();
            if (actor.getFilms().isEmpty()) {
                System.out.println(actor.getName() +" - didn't act in any film ");
            }

        }

    }


}




