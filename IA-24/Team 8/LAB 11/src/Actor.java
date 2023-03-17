import java.util.HashSet;

public class Actor {
    private final String name;
    private final String surname;
    public HashSet<Movie> career = new HashSet<>();

    public Actor(String name, String surname) {
        this.name = name;
        this.surname = surname;
        DataBase db = DataBase.getInstance();
        db.addActors(this);
    }

    public String FullName() {
        return name+" "+surname;
    }

    public String Name() {
        return name;
    }

    public String Surname() {
        return surname;
    }

    public void addAllMovies(HashSet<Movie> movie){
        this.career.addAll(movie);
    }

    public HashSet<Movie> Career() {
        return career;
    }

    @Override
    public String toString() {
        return name + " " + surname ;
    }
}
