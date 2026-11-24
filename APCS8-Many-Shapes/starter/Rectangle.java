public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        super("Rectangle", 4);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        // TODO: use this shape's dimensions.
        return 0.0;
    }

    @Override
    public double getPerimeter() {
        // TODO: use this shape's dimensions.
        return 0.0;
    }
}
