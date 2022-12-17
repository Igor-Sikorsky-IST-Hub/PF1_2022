public class Circle extends Figure{

    private int radius;
    private int circuit;


    public Circle(int numberOfAngles, String colorOfFigure,
                  int radius, int circuit) {
        super(numberOfAngles, colorOfFigure);
        this.radius = radius;
        this.circuit = circuit;
    }

    public int getRadius(){
        return radius;
    }

    public int getCircuit(){
        return circuit;
    }

    public void setRadius(int radius){
        this.radius = radius;
    }

    public void setCircuit(int circuit){
        this.circuit = circuit;
    }


    @Override
    public String toString(){
        return "Радіус кола = " + radius + "\n"
                + "Довжина кола = " + circuit + "\n"
                + "К-сть кутів = " + super.getNumberOfAngles() + "\n"
                + "Колір фігури = " + super.getColorOfFigure();
    }
    public void Transform(int k){
        setRadius(getRadius() + k);
    }
}
