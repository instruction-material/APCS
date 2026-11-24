# Many Shapes

Predict the area and perimeter before running Main. It uses the same Shape reference type to call methods on a square, rectangle, right triangle, and circle. The object's class determines which override runs. Use positive dimensions.

Use Square as a worked example. Complete the area and perimeter overrides in Rectangle, RightTriangle, and Circle. A rectangle uses height times width and twice the sum of its dimensions. A right triangle uses half the product of its legs and the sum of the legs and hypotenuse. For a circle use πr² and 2πr.

Run `javac Main.java Circle.java Rectangle.java RightTriangle.java Shape.java Square.java` then `java Main`. For the 5 by 10 rectangle expect 50 and 30. For the 3 by 4 triangle expect 6 and 12. A circle of radius 2.5 has area 6.25π and perimeter 5π. Explain why calling getSideLength through a Shape reference fails to compile even when the object is a Square.
