public class Drops extends Drugs {
    private int volume;
    public Drops() {
        volume = 200;
    }
    public Drops(int dose,String name, int volume) {
        super(dose, name);
        this.volume = volume;
    }
    @Override
    public void getInformation() {
        super.getInformation();
    }
    @Override
    public void getInformation(String name) {
        super.getInformation(name);
        System.out.println("Here is volume of your drops: " + volume);
    }
}
