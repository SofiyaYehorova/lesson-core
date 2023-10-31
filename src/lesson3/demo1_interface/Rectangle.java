package lesson3.demo1_interface;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Rectangle implements Shape {
    private double a;
    private double b;

    @Override
    public double getPerimeter() {
        return 2 * (a + b);
    }

    @Override
    public void printPerimeter() {
        System.out.println("Rectangle perimeter is " + getPerimeter());
    }
}
