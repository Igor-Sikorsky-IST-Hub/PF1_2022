public class Color extends Coordinates {
    private double r;
    private double g;
    private double b;
    Color(){
        super();
    }
    Color(double x,double y, double z,double r, double g, double b)
    {
        super(x, y, z);
        this.r = r;
        this.g = g;
        this.b = b;
    }
    @Override
    void findVectorLength() {
        super.findVectorLength();
    }
    @Override
    double findVectorLength(double x,double y, double z) {
        if (x < 0 || x > 255 || y < 0 || y > 255 || z < 0 || z > 255) {
            throw new IllegalArgumentException();
        }
        double colorlen = Math.sqrt(r*r + g*g + b*b);
        return colorlen;
    }
    }
