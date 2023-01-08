public class Pills extends Drugs{
    private String form;
    public Pills(){
        super();
        form = "default";
    }
    public Pills(int dose, String name, String form){
        super(dose, name);
        this.form = form;
    }

    @Override
    public void getInformation() {
        super.getInformation();
    }
    @Override
    public void getInformation(String name) {
        super.getInformation(name);
        System.out.println("Form of your pills: "+ form);
    }
}
