package hw4.task3;

import java.util.HashSet;

//Створити клас котрий відповідає наступній моделі
//        {
//        id: 1,
//        name: 'vasya',
//        surname: 'pupkin',
//        email: 'asd@asd.com',
//        age: 31,
//        gender: 'MALE',
//        skills: [{title: 'java', exp: 10}, {title: 'js', exp: 10}, {title: 'c++', exp: 10}],
//        car: {model: 'toyota', year: 2021, power: 250}
//        }
//        Використати композицію/агрегацію та енуми в потрібному місці.
//        Створити HashSet з 10 об'єктів, проітерувати її, видалити всіх чоловіків
//        Створити TreeSet з 10 об'єктів, посортовану за кількістю скілів від меньшого до більшого
public class Main {
    public static void main(String[] args) {
        HashSet<User_HashSet> users = new HashSet<>();
        users.add(new User_HashSet(1, "Sofiya", "Yehorova", "yehorova@gmail", 35, Gender.FEMALE, new Car("Audi", 2020, 200)));
        users.add(new User_HashSet(2, "Mark", "Sukhanov", "yehorova12@gmail", 4, Gender.MALE, new Car("Audi", 2020, 200)));
        users.add(new User_HashSet(3, "Liliya", "Yehorova", "yehorova15@gmail", 32, Gender.FEMALE, new Car("Audi", 2020, 200)));
        users.add(new User_HashSet(4, "Oleksandr", "Kokos", "yehorova22@gmail", 42, Gender.MALE, new Car("Audi", 2020, 200)));
        users.add(new User_HashSet(5, "Anna", "Popov", "yehorova40@gmail", 6, Gender.FEMALE, new Car("Audi", 2020, 200)));

        System.out.println(users);

        users.removeIf(user -> user.getGender().equals(Gender.MALE));
        {
            System.out.println(users);
        }
        ;

//        TreeSet<User_TreeSet> users1 = new TreeSet<>();
//        users1.add(new User_TreeSet(1, "Sofiya", "Yehorova", "yehorova@gmail", 35, Gender.FEMALE, new Car("Audi", 2020, 200), Arrays.asList(new Skill("js", 2))));
//        users1.add(new User_TreeSet(2, "Mark", "Sukhanov", "yehoro15va@gmail", 25, Gender.MALE, new Car("Audi", 2020, 200), Arrays.asList(new Skill("js", 2), new Skill("python", 2))));
//        users1.add(new User_TreeSet(3, "Liliya", "Popov", "yehorov17a@gmail", 30, Gender.FEMALE, new Car("Audi", 2020, 200), Arrays.asList(new Skill("js", 2), new Skill("python", 2), new Skill("java", 5))));
//        users1.add(new User_TreeSet(4, "Oleksandr", "Kokos", "yehorov20a@gmail", 18, Gender.MALE, new Car("Audi", 2020, 200), Arrays.asList(new Skill("js", 2), new Skill("html", 4))));
//
//        System.out.println(users1);
    }
}
