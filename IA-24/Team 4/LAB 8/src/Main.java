public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("ABCD", 4, 6);
        System.out.println(rectangle);
        Rectangle unnamedRectangle = new Rectangle(4, 6);
        System.out.println(unnamedRectangle);
        Rectangle square = new Rectangle("A1B1C1D1", 4);
        System.out.println(square);
        Rectangle unnamedSquare = new Rectangle(4);
        System.out.println(unnamedSquare);

        System.out.println("Area of ABCD = " + rectangle.getArea());
        System.out.println("Perimeter of ABCD = " + rectangle.getPerimeter());
        System.out.println("Area of A1B1C1D1 = " + square.getArea());
        System.out.println("Perimeter of A1B1C1D1 = " + square.getPerimeter());

        System.out.println("ABCD and unnamed rectangle are equal: " + rectangle.equals(unnamedRectangle));
        System.out.println("ABCD and A1B1C1D1 are equal: " + rectangle.equals(square));

        rectangle.setSides(8, 10);
        System.out.println(rectangle);

        square.setSides(5);
        System.out.println(square);

        System.out.println("ABCD is square: " + rectangle.isSquare());
        System.out.println("A1B1C1D1 is square: " + rectangle.isSquare());

        System.out.println("\n=======================================================\n");

        Circle circle = new Circle("O", 5);
        Circle unnamedCircle = new Circle(3);

        System.out.println(circle);
        System.out.println(unnamedCircle);

        System.out.println("Area of O = " + circle.getArea());
        System.out.println("Perimeter of O = " + circle.getPerimeter());
        System.out.println("Area of unnamed circle = " + unnamedCircle.getArea());
        System.out.println("Perimeter of unnamed circle = " + unnamedCircle.getPerimeter());

        System.out.println("O and unnamed circle are equal: " + circle.equals(unnamedCircle));

        circle.setRadius(6);
        System.out.println(circle);

    }

}