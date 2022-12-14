import java.util.*;

public class Main {
    public static void main(String[] args) {
        Database();
        Task1();
        System.out.println();
        Task2("Chris Evans");
        System.out.println();
        Task3();


    }
    static void Task1(){
        List<Actor> allActors = DataBase.getAllActors();
        for (Iterator i = allActors.iterator(); i.hasNext();){
            Actor actor = (Actor) i.next();
            if (actor.getCareer().isEmpty()){
                System.out.println(actor.getFullName() + " did not act in any film");
            }
        }
    }
    static void Task2(String actor){
        System.out.println("Colleagues of "+actor);
        DataProcessor task = new DataProcessor();
        for(Actor i:task.listActors(actor)){
            System.out.println(i);
        }
    }
    static void Task3(){
        int movieSize = 0;
        List<Movie> allFilms = DataBase.getAllFilms();
        for (Iterator<Movie> it = allFilms.iterator(); it.hasNext(); ) {
            Movie movie = it.next();
            if (movie.getCast().size() > movieSize){
                movieSize = movie.getCast().size();
                System.out.println("The largest number of actors: "+movie.getName());
            }
        }

        }

    public static void Database(){
        Movie film1 = new Movie("Avengers");
        Movie film2 = new Movie("Iron Man");
        Movie film3 = new Movie("Black Widow");

        Actor actor1 = new Actor("Robert", "Downey Jr.");
        Actor actor2 = new Actor("Chris", "Evans");
        Actor actor3 = new Actor("Mark", "Ruffalo");
        Actor actor4 = new Actor("Scarlett", "Johansson");
        Actor actor5 = new Actor("Gwyneth", "Paltrow");
        Actor actor6 = new Actor("Jeff", "Bridges");
        Actor actor7 = new Actor("Florence", "Pugh");
        Actor actor8 = new Actor("Rachel", "Weisz");
        Actor actor9 = new Actor("Angelina", "Jolie");

        film1.addCast(Arrays.asList(actor1, actor2, actor3, actor4));
        film2.addCast(Arrays.asList(actor1, actor5, actor6));
        film3.addCast(Arrays.asList(actor4, actor7, actor8));

        actor1.addAllMovies(Arrays.asList(film1, film2));
        actor2.addAllMovies(Arrays.asList(film1));
        actor3.addAllMovies(Arrays.asList(film1));
        actor4.addAllMovies(Arrays.asList(film1, film3));
        actor5.addAllMovies(Arrays.asList(film2));
        actor6.addAllMovies(Arrays.asList(film2));
        actor7.addAllMovies(Arrays.asList(film3));
        actor8.addAllMovies(Arrays.asList(film3));

        DataBase.addActors(Arrays.asList(actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor8, actor9));
        DataBase.addFilms(Arrays.asList(film1, film2, film3));



    }
}