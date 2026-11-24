public class RightTriangle extends Shape {
    private double base;
    private double height;
    private double hypotenuse;

    public RightTriangle(double base, double height) {
        super("Right Triangle", 3);
        this.base = base;
        this.height = height;
        this.hypotenuse = Math.sqrt(Math.pow(base, 2) + Math.pow(height, 2));
    }

    @Override
    public double getArea() {
        return (base * height) / 2.0;
    }

    @Override
    public double getPerimeter() {
        return base + height + hypotenuse;
    }
}
