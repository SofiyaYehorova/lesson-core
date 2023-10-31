package lesson3.demo4_functionalInterfaces;

import lesson3.demo1_interface.Rectangle;
import lesson3.demo1_interface.Shape;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

public class Main {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> addOperations = (a, b) -> a + b;
//                                                 OR
        BiFunction<Integer, Integer, Integer> addOperations1 = Integer::sum;

        Function<String, Integer> charCount = (str) -> str.length();
//                                                    OR
        Function<String, Integer> charCount1 = String::length;

        Function<Shape, Double> perimeter = Shape::getPerimeter;

        Supplier<Shape> rectangleCreator = () -> new Rectangle(2, 4);

        Consumer<Shape> shapeConsumer=shape -> System.out.println(shape.getPerimeter());


        System.out.println(charCount.apply("hello")); /*5*/
        System.out.println(charCount1.apply("hello"));/*5*/
        System.out.println(perimeter.apply(rectangleCreator.get())); /*12.0*/
        System.out.println(rectangleCreator.get().getPerimeter()); /*12.0*/
        shapeConsumer.accept(rectangleCreator.get()); /*12*/

    }
}
