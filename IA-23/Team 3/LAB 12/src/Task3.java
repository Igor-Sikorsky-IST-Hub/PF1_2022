import java.util.HashSet;

public class Task3 {
    static String filmWithBiggestActorsNumber(FilmsDataBase base) {
        int biggestActorsNumber = 0;
        StringBuilder output = new StringBuilder();
        for (Cinema film : base.data().get("filmsBase")) {
            if (((HashSet) film.info().get("actors")).size() > biggestActorsNumber) {
                biggestActorsNumber = ((HashSet) film.info().get("actors")).size();
                output.replace(0, output.capacity(), film.toString());
            }
        }
        return output.insert(0, "Film with biggest actors number: ").toString();
    }
}
