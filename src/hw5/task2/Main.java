package hw5.task2;

import java.util.Arrays;
import java.util.List;

//Створити клас автомобіля з полями:
//        Марка автомобля, потужність двигуна, власник, ціна, рік випуску.
//        Власник автомобіля теж має бути обєкт, у якого є поля
//        Імя, вік, стаж водіння.
//        Створити не менше 7 та не більше 20 машинок.
//
//
//
//        Все через stream API
public class Main {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("BMW", 200, new Owner("Sofiya", 35, 6), 2000, 2002),
                new Car("Audi", 180, new Owner("Liliya", 26, 3), 1000, 2005),
                new Car("KIA", 150, new Owner("Mark", 49, 4), 5000, 2006),
                new Car("Ford", 125, new Owner("Oleksandr", 26, 10), 1200, 1995),
                new Car("OKA", 100, new Owner("Oksana", 21, 4), 1600, 2002),
                new Car("Mazda", 120, new Owner("Svitlana", 30, 1), 2005, 2002)
        );

//        Зробили половині автопарку ремонт мотору, що збільшить потужність автомобілів на 10% (переприсвоєння змінної потужності).
        for (int i = 0; i < cars.size() / 2; i++) {
            Car car = cars.get(i);
            car.setPower(car.getPower() + car.getPower() * 0.1);
        }
        System.out.println(cars);

//        Після того в масиві цих автівок зробити перевірку досвіду ВСІХ наших водіїв.
//        Якщо досвід водія менший за 5 років, але його вік більший за 25, то необідно відправити його на курси підвищення
//        кваліфікації, що збільшить йому досвід на 1 рік.

        cars.stream().filter(car -> car.getOwner().getAge() > 25 && car.getOwner().getExp() < 5).forEach(car -> car.getOwner().setExp(car.getOwner().getExp() + 1));
        System.out.println(cars);

//        Також спробуйте порахувати суму, яку потрібно потратити для покупки всіх цих авто
        Integer reduce1 = cars.stream().map(car -> car.getPrice()).reduce(0, (a, b) -> a + b);
        Integer reduce2 = cars.stream().map(car -> car.getPrice()).reduce(0, Integer::sum);
        System.out.println(reduce1);
        System.out.println(reduce2);
    }
}
