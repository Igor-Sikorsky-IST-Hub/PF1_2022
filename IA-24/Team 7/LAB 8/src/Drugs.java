public class Drugs {
    private int dose;
    private String name;
    public Drugs(){
        dose = 0;
        name = "Drug";
    }
    public Drugs(int dose, String name){
        this.dose = dose;
        this.name = name;
    }
    public void getInformation(){
    }
    public void getInformation(String name){
        System.out.println("Name of your drug: "+ name + ". Your recomended dose:" + dose + "mg");
    }
}
