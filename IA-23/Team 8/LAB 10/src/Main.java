import java.util.*;

public class Main {
    public static void main(String[] args) {
        printResults();
    }
    static void printResults(){
        loadDatabase();
        task1();
        task2("Chris Evans");
        task3();

    }
    static void task1(){
        List<Actor> allActors = Data.getAllActors();
        if (allActors.size()==0){
            throw new NullPointerException("Неможливо перевірити порожній список");
        }
        for (Iterator i = allActors.iterator(); i.hasNext();){
            Actor actor = (Actor) i.next();
            if (actor.getCareer().isEmpty()){
                System.out.println(actor.getFullName() + " не знімався в жодному фільмі");
            }
        }
    }
    static void task2(String actor){
        System.out.println("Колеги з "+actor+":");
        Data_Proc task = new Data_Proc();
        for(Actor i:task.listActors(actor)){
            System.out.println(i);
        }
    }
    static void task3(){
        int movieSize = 0;
        List<String> result = new ArrayList<>();
        List<Movie> allFilms = Data.getAllFilms();
        for (Iterator<Movie> it = allFilms.iterator(); it.hasNext(); ) {
            Movie movie = it.next();
            if (movie.getCast().size() > movieSize){
                movieSize = movie.getCast().size();
                result.add(movie.getName());
            } else if (movie.getCast().size()==movieSize) {
                result.add(movie.getName());
            }

        }
        System.out.println("Найбільша кількість акторів: "+ result);
    }

    public static void loadDatabase(){
        Movie film1 = new Movie("Spider man");
        Movie film2 = new Movie("Uncharted");
        Movie film3 = new Movie("Captain America");

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

        Data.addActors(Arrays.asList(actor1, actor2, actor3, actor4, actor5, actor6, actor7, actor8, actor9));
        Data.addFilms(Arrays.asList(film1, film2, film3));



    }
}