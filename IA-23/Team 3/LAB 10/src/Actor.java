import java.util.List;

public class Actor {
    private String name;
    private List<String> filmList;
    public Actor(String name, List<String> filmList) {
        this.name = name;
        this.filmList = filmList;
    }

    public String getActorName() {
        return this.name;
    }

    public List<String> filmsWhereActorPlayed() {
        return this.filmList;
    }
}
