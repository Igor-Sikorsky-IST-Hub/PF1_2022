import java.util.*;


public class Actor {
    String name;
    String surname;
    List<Movie> career = new ArrayList<>();

    public String getFullName() {
        return name+" "+surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public Actor(String name, String surname) {
        this.name = name;
        this.surname=surname;
    }
    public void addAllMovies(Collection<Movie> movie){
        this.career.addAll(movie);
    }

    public List<Movie> getCareer() {
        return career;
    }

    @Override
    public String toString() {
        return  name + " " + surname ;
    }
}
