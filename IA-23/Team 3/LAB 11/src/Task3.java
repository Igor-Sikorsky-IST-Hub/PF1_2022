public class Task3 {
    static String filmWithBiggestActorsNumber (FilmsDataBase base) {
        int biggestActorsNumber = 0;
        StringBuilder output = new StringBuilder();
        for (Film film: base.getFilmsBase()) {
            if (film.getActors().size() > biggestActorsNumber) {
                biggestActorsNumber = film.getActors().size();
                output.replace(0, output.capacity(), film.toString());
            }
        }
        return output.insert(0, "Film with biggest actors number: ").toString();
    }
}
