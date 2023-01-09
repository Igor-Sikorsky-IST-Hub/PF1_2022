public class Task3 {
    public static String filmWithBiggestAmountOfActers(Cinema cinema) {
        Film filmWithBiggestAmountOfActers = null;
        int biggestNumberOfActorsInFilms = 0;
        for (Film film: cinema.getCinemaFilmsInfo()) {
            if (film.whoPlayedInFilm().size() > biggestNumberOfActorsInFilms) {
                biggestNumberOfActorsInFilms = film.whoPlayedInFilm().size();
                filmWithBiggestAmountOfActers = film;
            }
        }
        return "The film with the biggest amount of acters: " +
                filmWithBiggestAmountOfActers.getFilmTitle() +
                ": " +  biggestNumberOfActorsInFilms;
    }
}
