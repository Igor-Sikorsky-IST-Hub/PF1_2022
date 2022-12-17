public class Main {
    public static void main(String[] args)
    {
        Coordinates coordinates = new Coordinates();
        coordinates.findVectorLength();
        Coordinates coordinates1 = new Coordinates(2.34, 5.3, 6.7);
        System.out.println(coordinates1.findVectorLength(2.34, 5.3, 6.7));
        Color color = new Color();
        color.findVectorLength();
        Color color1 = new Color(2.34, 5.3, 6.7,23.4,12.6,1.3);
        System.out.println(color1.findVectorLength(2.34, 5.3, 6.7));
    }
}