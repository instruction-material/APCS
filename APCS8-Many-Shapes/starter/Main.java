class Main {
    public static void main(String[] args) {
        Shape[] shapes = {new Square(15), new Rectangle(5, 10),
                          new RightTriangle(3, 4), new Circle(2.5)};
        for (Shape shape : shapes) {
            System.out.println(shape.getName() + " (" + shape.getNumSides() + " sides)");
            System.out.println("Area: " + shape.getArea());
            System.out.println("Perimeter: " + shape.getPerimeter());
        }
    }
}
