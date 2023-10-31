package lesson3.demo3_lambdas;

import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(123);
        numbers.add(555500);
        numbers.add(-123);
        numbers.add(0);
        numbers.add(13);
//        System.out.println(numbers); /*[123, 555500, -123, 0, 13]*/
        Comparator<Integer> naturalOrder=new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        };
        numbers.sort(naturalOrder);
        System.out.println(numbers); /*[-123, 0, 13, 123, 555500]*/
//                               OR
        Comparator<Integer> naturalOrder1= (o1, o2) -> o1-o2;

        numbers.sort(naturalOrder1);
        System.out.println(numbers); /*[-123, 0, 13, 123, 555500]*/
//                                                               OR
        Comparator<Integer> naturalOrder2= Comparator.comparingInt(o -> o);

        numbers.sort(naturalOrder2);
        System.out.println(numbers); /*[-123, 0, 13, 123, 555500]*/
//                                        OR
        numbers.sort((o1, o2) -> o2-o1);
        System.out.println(numbers); /*[555500, 123, 13, 0, -123]*/

    }
}
