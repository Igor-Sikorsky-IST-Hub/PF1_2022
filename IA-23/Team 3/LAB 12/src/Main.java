public class Main {
    public static void main(String[] args) {
        FilmsDataBase base = new FilmsDataBase();

        Actor bob = new Actor("Bob", new String[]{"Mountain", "Cave"});
        base.appendWithActor(bob);
        Actor dave = new Actor("Dave", new String[]{"Mountain", "Desert"});
        base.appendWithActor(dave);
        Actor nik = new Actor("Nik", new String[]{"Mountain", "Desert", "Cave", "Rose"});
        base.appendWithActor(nik);
        Actor actorWhoNeverPlayed = new Actor("ActorWhoNeverPlayed", new String[]{});
        base.appendWithActor(actorWhoNeverPlayed);

        Film mountain = new Film("Mountain", new String[]{"Bob", "Dave", "Nik"});
        base.appendWithFilm(mountain);
        Film cave = new Film("Cave", new String[]{"Bob", "Nik"});
        base.appendWithFilm(cave);
        Film desert = new Film("Desert", new String[]{"Dave", "Nik"});
        base.appendWithFilm(desert);
        Film rose = new Film("Rose", new String[]{"Nik"});
        base.appendWithFilm(rose);

        System.out.println(Task1.getActorWhoNeverPlayed(base));
        System.out.println(Task2.actorsGivenActorHasEverPlayedWith(bob, base));
        System.out.println(Task3.filmWithBiggestActorsNumber(base));

        Task4.renameActor(bob, "Harry", base);
        Task4.renameActor(dave, "George", base);
        System.out.println("-----------------------------");

        System.out.println(Task1.getActorWhoNeverPlayed(base));
        System.out.println(Task2.actorsGivenActorHasEverPlayedWith(bob, base));
        System.out.println(Task3.filmWithBiggestActorsNumber(base));
    }
}