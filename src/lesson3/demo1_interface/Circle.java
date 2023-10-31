package lesson3.demo1_interface;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Circle implements Shape {
    private double r;

    @Override
    public double getPerimeter() {
        return 2 * 3.14 * r;
    }
}
