import java.util.HashSet;

public class Task1 {
    static String getActorWhoNeverPlayed(FilmsDataBase base) {
        for (Cinema actor : base.data().get("actorsBase")) {
            if (((HashSet) actor.info().get("films")).isEmpty()) {
                return actor + " never played in film";
            }
        }
        return "Every actor played in film";
    }
}
