public class Figure {
    private int numberOfAngles;
    private String colorOfFigure;

    public Figure(int numberOfAngles, String colorOfFigure){
        this.numberOfAngles = numberOfAngles;
        this.colorOfFigure = colorOfFigure;
    }

    public int getNumberOfAngles(){
        return numberOfAngles;
    }

    public String getColorOfFigure(){
        return colorOfFigure;
    }

    private void setNumberOfAngles(int numberOfAngles){
        this.numberOfAngles = numberOfAngles;
    }

    private void setColorOfFigure(String colorOfFigure){
        this.colorOfFigure = colorOfFigure;
    }

    public String toString(){
        return "";
    }
}
