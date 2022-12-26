
public class Rectangle extends Figure{
    private double length;
    private double width;

    public Rectangle(String name, double length, double width) {
        super(name);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double length, double width) {
        super("No name");
        this.length = length;
        this.width = width;
    }

    public Rectangle(String name, double a) {
        super(name);
        this.length = a;
        this.width = a;
    }

    public Rectangle(double a) {
        super("No name");
        this.length = a;
        this.width = a;
    }

    @Override
    public double getArea() {
        return 0.5 * (length + width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (length + width);
    }

    public double getLength() {
        return length;
    }

    public double getWidth() {
        return width;
    }

    public void setSides(double length, double width){
        this.length = length;
        this.width = width;
    }

    public void setSides(double a){
        this.length = a;
        this.width = a;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                super.toString() +
                ", length=" + length +
                ", width=" + width +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || o instanceof Rectangle) return false;
        Rectangle rectangle = (Rectangle) o;
        return rectangle.length == length && rectangle.width == width;
    }

    public boolean isSquare() {
        if (length == width) return true;
        return false;
    }

}
