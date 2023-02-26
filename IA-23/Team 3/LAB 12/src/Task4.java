import java.util.HashSet;

public class Task4 {
    static void renameActor(Actor oldActor, String newName, FilmsDataBase base) {
        String oldName = oldActor.info().get("name").toString();
        Actor newActor = new Actor(newName, (HashSet) oldActor.info().get("films"));

        oldActor.info().replace("name", newName);
        base.data().get("actorsBase").remove(oldActor);
        base.data().get("actorsBase").add(newActor);

        for (Cinema film : base.data().get("filmsBase")) {
            ((HashSet) film.info().get("actors")).remove(oldName);
            ((HashSet) film.info().get("actors")).add(newName);
        }
    }
}
