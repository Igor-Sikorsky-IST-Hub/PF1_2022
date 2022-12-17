public class Rectangle extends Figure {
    private int firstSide;
    private int secondSide;

    public Rectangle(int numberOfAngles, String colorOfFigure,
                     int firstSide, int secondSide) {
        super(numberOfAngles, colorOfFigure);
        this.firstSide = firstSide;
        this.secondSide = secondSide;
    }

    public int getFirstSide() {
        return firstSide;
    }

    public int getSecondSide(){
        return secondSide;
    }

    public void setFirstSide(int firstSide){
        this.firstSide = firstSide;
    }

    public void setSecondSide(int secondSide){
        this.secondSide = secondSide;
    }

    @Override
    public String toString(){
        return "Довжина 1 ст. прямокут. = " + firstSide + "\n"
                + "Довжина 2 ст. прямокут. = " + secondSide + "\n"
                + "К-сть кутів = " + super.getNumberOfAngles() + "\n"
                + "Колір фігури = " + super.getColorOfFigure();
    }

    public void Transform(int k){
        setFirstSide(getFirstSide()*k);
        setSecondSide(getSecondSide()*k);
    }

    public void Transform(int k, int j){
        setFirstSide(getFirstSide()*k);
        setSecondSide(getSecondSide()*j);
    }
}
