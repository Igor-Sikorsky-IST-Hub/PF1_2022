import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        DataBase db = DataBase.getInstance();
        loadDataBase();
        System.out.println(task_1());
        System.out.println(task_2("Robert", "Downey Jr."));
        System.out.println(task_3());
    }

    public static String task_1() {
        DataBase db = DataBase.getInstance();

        for (Iterator i = db.AllActors().iterator(); i.hasNext();){
            Actor actor = (Actor) i.next();
            if (actor.Career().isEmpty()){
                return actor.FullName() + " did not act in any film";
            }
        }

        return "There are no actors with empty career";
    }

    public static HashSet<Actor> task_2(String name, String surname) {
        DataBase db = DataBase.getInstance();
        HashSet<Actor> colleagues = new HashSet<>();
        Actor actor = db.getActor(name, surname);

        for(Movie movie : actor.Career()) {
            colleagues.addAll(movie.Cast());
        }
        colleagues.remove(actor);

        return colleagues;
    }

    public static String task_3() {
        DataBase db = DataBase.getInstance();
        int movieLength = 0;
        String biggestMovie = "";

        for (Iterator<Movie> i = db.AllMovies().iterator(); i.hasNext();) {
            Movie movie = (Movie) i.next();

            if (movie.Cast().size() > movieLength) {
                movieLength = movie.Cast().size();
                biggestMovie = movie.Name();
            }
        }
        return biggestMovie;
    }

    public static void loadDataBase() {
        Actor actor1 = new Actor("Robert", "Downey Jr.");
        Actor actor2 = new Actor("Chris", "Evans");
        Actor actor3 = new Actor("Mark", "Ruffalo");
        Actor actor4 = new Actor("Scarlett", "Johansson");
        Actor actor5 = new Actor("Gwyneth", "Paltrow");
        Actor actor6 = new Actor("Jeff", "Bridges");
        Actor actor7 = new Actor("Florence", "Pugh");
        Actor actor8 = new Actor("Rachel", "Weisz");
        Actor actor9 = new Actor("Angelina", "Jolie");

        Movie film1 = new Movie("Avengers");
        Movie film2 = new Movie("Iron Man");
        Movie film3 = new Movie("Black Widow");

        film1.addCast(Arrays.asList(actor1, actor2, actor3, actor4));
        film2.addCast(Arrays.asList(actor1, actor5, actor6));
        film3.addCast(Arrays.asList(actor4, actor7, actor8));

    }
}
