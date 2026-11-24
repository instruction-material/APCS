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
        return height * width;
    }

    @Override
    public double getPerimeter() {
        return (2 * height) + (2 * width);
    }
}
