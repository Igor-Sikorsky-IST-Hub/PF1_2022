public class Main {
    public static void main(String[] args) {
        try {
            CoordinatesOfPixel firstPixel = new CoordinatesOfPixel(1.8, 2.4, -3.2, 2, 2);
            System.out.println(firstPixel.toString());

            System.out.println("--------------");

            ColorfulPixel firstColorfulPixel = new ColorfulPixel(1.8, 2.4, -3.2, 2, 2, "blue", "square", 0.8);
            System.out.println(firstColorfulPixel.toString());

            System.out.println("--------------");

            firstPixel.setHeight(3);
            firstPixel.setWidth(1);
            firstPixel.setCoordinateY(4);
            System.out.println(firstPixel.toString());

            System.out.println("--------------");

            CoordinatesOfPixel secondPixel = new CoordinatesOfPixel(1.8, 2.4, -3.2, -3, 2);
            System.out.println(secondPixel.getArea());
        } catch (IllegalArgumentException e) {
            System.out.println("Exception! " + e.getMessage());
        }
    }
}