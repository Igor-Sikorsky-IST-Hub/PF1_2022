public abstract class Figure {
    private String name;

    public abstract double getArea();
    public abstract double getPerimeter();

    public Figure(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Figure{" +
                "name='" + name + '\'' +
                '}';
    }
}
