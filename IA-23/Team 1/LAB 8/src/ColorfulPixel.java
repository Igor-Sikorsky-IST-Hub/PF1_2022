public class ColorfulPixel extends CoordinatesOfPixel {
    private String color;
    private double transparency;

    private String shape;

    ColorfulPixel() {
        this.color = "white";
        this.transparency = 1.0;
    }

    ColorfulPixel(double x, double y, double z, int width, int height, String color, String shape, double transparency) {
        super(x, y, z, width, height);
        this.color = color;
        this.transparency = transparency;
        this.shape = shape;
    }

    public String getColor() {
        return color;
    }

    public double getTransparency() {
        return transparency;
    }

    public String getShape() {
        return shape;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTransparency(double transparency) {
        this.transparency = transparency;
    }

    public void setShape(String shape) {
        this.shape = shape;
    }

    @Override
    public String toString() {
        return "Pixel's characteristics: " + "\n" +
                "color: " + getColor() + "\n" +
                "transparency: " + getTransparency() + "\n" +
                "shape: " + getShape();
    }
}
