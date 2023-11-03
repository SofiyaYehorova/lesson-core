package lesson4.demo4_map;

import lesson4.demo1_list.Person;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person(1, "James", 20);
        Person person2 = new Person(2, "Robert", 32);
        Person person3 = new Person(3, "John", 22);
        Person person4 = new Person(4, "Jessica", 25);
        Person person5 = new Person(5, "Christopher", 42);
        Person person6 = new Person(6, "Charley", 35);
        Person person7 = new Person(7, "William", 45);
        Person person8 = new Person(8, "Richard", 39);

        Map<Integer, Person> persons=new HashMap<>();
        persons.put(person1.getId(), person1);
        persons.put(person2.getId(), person2);
        persons.put(person3.getId(), person3);
        persons.put(person4.getId(), person4);
        persons.put(person5.getId(), person5);
        persons.put(person6.getId(), person6);
        persons.put(person7.getId(), person7);
        persons.put(person8.getId(), person8);

        System.out.println(persons);

        Person personWithId3 = persons.get(3);
        System.out.println(personWithId3);

//        System.out.println(persons.entrySet()
//                .stream()
//                .filter(entry -> entry.getValue().getAge() > 30)
//                .map(entry -> entry.getValue().getName())
//                .collect(Collectors.toList()));

        persons.putIfAbsent(1, new Person(1, "bla bla bla", 32));
        System.out.println(persons); /* не додасть тому що id1 вже є*/
//        але можна внести зміну якщо використовувати просто put
        persons.put(1, new Person(1, "bla bla", 32));
        System.out.println(persons);

//        Person dummyPerson = persons.computeIfAbsent(10,(id)-> new Person(10, "dummy person", 12));
//        System.out.println(dummyPerson); /*Person(id=10, name=dummy person, age=12)*/

        Person dummyPerson = persons.get(10);
        System.out.println(dummyPerson); /*null*/

        System.out.println(persons.keySet());
        System.out.println(persons.values());
    }
}
