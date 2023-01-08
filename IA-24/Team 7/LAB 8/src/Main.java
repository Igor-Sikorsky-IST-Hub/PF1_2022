public class Main {
    public static void main(String[] args) {
        Drugs drug = new Drugs();
        Drugs drugs = new Drugs(100, "Askoril");
        Drops drop = new Drops();
        Drops drops = new Drops(2, "Systeyn", 50);
        Pills pill = new Pills();
        Pills pills = new Pills(75, "Septifril","circle");
        drug.getInformation();
        drugs.getInformation("Askorill");
        drop.getInformation();
        drops.getInformation("Systeyn");
        pill.getInformation();
        pills.getInformation("Septifril");
    }
}