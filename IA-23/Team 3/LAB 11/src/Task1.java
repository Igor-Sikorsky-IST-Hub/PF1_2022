public class Task1 {
    static String getActorWhoNeverPlayed (FilmsDataBase base) {
        for (Actor actor: base.getActorsBase()) {
            if (actor.filmsWithActor().isEmpty()) {return actor + " never played in film";}
        }
        return "Every actor played in film";
    }
}
