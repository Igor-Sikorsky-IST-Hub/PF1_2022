public class CoordinatesOfPixel {
    private double x;
    private double y;
    private double z;
    private int width;
    private int height;

    CoordinatesOfPixel() {
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }

    CoordinatesOfPixel(double x, double y, double z, int width, int height) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.width = width;
        this.height = height;
    }

    public double getCoordinateX() {
        return x;
    }

    public double getCoordinateY() {
        return y;
    }

    public double getCoordinateZ() {
        return z;
    }

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }

    public void setCoordinateX(double x) {
        this.x = x;
    }

    public void setCoordinateY(double y) {
        this.y = y;
    }

    public void setCoordinateZ(double z) {
        this.z = z;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Pixel's coordinates: (" + getCoordinateX() + ", " + getCoordinateY() + ", " + getCoordinateZ() + ")" + "\n"
                + "Pixel's area: " + getArea();
    }

    public int getArea() {
        if (this.width <= 0 || this.height <= 0) {
            throw new IllegalArgumentException("Width and height can't be null or negative");
        } else {
            return width * height;
        }
    }
}
