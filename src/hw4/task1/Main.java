package hw4.task1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Створити List Юзерів
//        - відсортувати  за  віком (зростання , а потім окремо спадання за допомоги методу sort)
//        - відсортувати його за кількістю знаків в імені  (зростання , а потім окремо спадання)
public class Main {
    public static void main(String[] args) {
        List<User> users = Arrays.asList(
                new User("Max", 20),
                new User("Sofiya", 35),
                new User("Mark", 25),
                new User("Oleksandr", 42),
                new User("Mykyta", 34)
        );
//        users.sort((a, b)->a.getAge()-b.getAge());
//        System.out.println(users);
//                                             OR
        users.sort(Comparator.comparingInt(User::getAge));
        System.out.println(users);

        users.sort((a, b)->b.getAge()-a.getAge());
        System.out.println(users);

        System.out.println("********************************************************************");

        users.sort((a, b)->a.getName().length()-b.getName().length());
        System.out.println(users);

        users.sort((a, b)->b.getName().length()-a.getName().length());
        System.out.println(users);
    }
}
