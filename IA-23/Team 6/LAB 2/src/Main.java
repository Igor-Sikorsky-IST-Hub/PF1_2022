public class Main {
    public static void main(String[] args) {
        //№24
        double a1 = 0.345;
        double b1 = -2.25;
        double c1 = 2.65;
        double d1 = 3.99;
        double e1 = 2.71828182846;
        double y1 = (Math.cos(b1) + Math.sin(Math.sqrt(a1))) / (2 * Math.log10(c1) + Math.pow(e1, d1));
        System.out.println(y1);

        //№15
        double a2 = 1.25;
        double b2 = 3.09;
        double c2 = 4.25;
        double d2 = 0.56;
        double e2 = 2.71828182846;
        double sh2 = (Math.pow(e2, d2) - Math.pow(e2, -d2)) / 2;
        double y2 = 2 * Math.sqrt(Math.tan(a2) / Math.abs(Math.acos(b2))) - 3 * Math.cbrt(Math.pow(e2, c2-a2) * sh2);
        System.out.println(y2);

        //№6
        double a3 = -1.23;
        double b3 = -0.34;
        double c3 = 0.707;
        double d3 = 2.312;
        double e3 = 2.71828182846;
        double y3 = 3*(Math.log10(Math.abs(b3/a3))+Math.sqrt(Math.sin(c3)+Math.pow(e3,d3)));
        System.out.println(y3);
    }
}