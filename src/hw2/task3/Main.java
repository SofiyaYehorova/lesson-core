package hw2.task3;
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
public class Main {
    public static void main(String[] args) {
        User user = new User(1, "Sofiya", "Yehorova", "yehorova@gmail.com", 35, Gender.FEMALE, new Car("BMW", 2020, 250));
        user.getSkills().add(new Skill("js", 2));
        user.getSkills().add(new Skill("python", 1));
        user.getSkills().add(new Skill("node", 1));

        System.out.println(user);
    }
}
