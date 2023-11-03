package hw4.task2;

import java.util.ArrayList;
import java.util.List;

//створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .
public class Main {
    public static void main(String[] args) {
        List<String>words=new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("pineapple");
        words.add("tomato");
        words.add("potato");
        words.add("cucumber");
        words.add("cabbage");
        words.add("pear");

//        words.sort((a, b)->a.compareTo(b));
//                                                 OR
        words.sort(String::compareTo);

        System.out.println(words);
    }

}
