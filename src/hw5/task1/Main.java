package hw5.task1;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        //створити ArrayList зі словами на 15-20 елементів.
//        - відсортувати його за алфавітом .
        List<String> strings = Arrays.asList(
                "apple",
                "bananas",
                "window",
                "pen",
                "notebook"
        );
        List<String> collect1 = strings.stream().sorted(String::compareTo).collect(Collectors.toList());
        List<String> collect2 = strings.stream().sorted(String::compareTo).toList();
        System.out.println(collect1);
        System.out.println(collect2);

        //        *-- відфільтрувати слова довжиною менше 4 символів

        List<String> sorted4 = strings.stream().filter(a -> a.length() >= 4).toList();
        System.out.println(sorted4);

        //        - Створити масив з 20 числами.
        List<Integer> numbers = Arrays.asList(2, 5, 7, 8, 90, 6, 55, 40, 78, 9, 3);

//        - за допомогою способу sorted відсортувати масив.
        List<Integer> sortedNumbers = numbers.stream().sorted().toList();
        System.out.println(sortedNumbers);

//        -- за допомогою filter отримати числа кратні 3
        List<Integer> sortedNumbers3 = numbers.stream().filter(a -> a % 3 == 0).toList();
        System.out.println(sortedNumbers3);

//        -- за допомогою filter отримати числа кратні 10
        List<Integer> sortedNumbers10 = numbers.stream().filter(a -> a % 10 == 0).toList();
        System.out.println(sortedNumbers10);

//        -- перебрати (проітерувати) масив за допомогою foreach()
        numbers.stream().forEach(a->System.out.println(a));
        numbers.stream().forEach(System.out::println);

//        -- перебрати масив за допомогою map() і отримати новий масив, в якому всі значення будуть у 3 рази більші
        List<Integer> numbersB = numbers.stream().map(a -> a * 3).toList();
        System.out.println(numbersB);
    }
}
