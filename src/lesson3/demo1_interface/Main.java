package lesson3.demo1_interface;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(2, 5.5);
        System.out.println(rectangle.getPerimeter());

        Circle circle = new Circle(5);
        System.out.println(circle.getPerimeter());

        Square square = new Square(5);

        ArrayList<Shape> shapes = new ArrayList<>();
        shapes.add(rectangle);
        shapes.add(circle);
        shapes.add(square);
        for (Shape shape : shapes) {
//            System.out.println(shape.getPerimeter());
            shape.printPerimeter();
/*Rectangle perimeter is 15.0*/
        }
        System.out.println(Shape.a); /*10*/

    }
}
