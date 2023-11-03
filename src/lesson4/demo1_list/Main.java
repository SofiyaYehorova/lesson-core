package lesson4.demo1_list;

import java.util.LinkedList;
import java.util.List;


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

//        ArrayList<Person> persons = new ArrayList<>();
//                                                          OR

        List<Person> persons = new LinkedList<>(); /*праює швидше*/ /*може містити дублікати та nulls*/
//                                                            OR
//        Collection<Person> persons = new LinkedList<>();

        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(null);
        persons.add(null);
        persons.add(null);
        persons.add(null);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);

//        for (Person person : persons) {
//            System.out.println(person);
//        }
//                                         OR
        System.out.println(persons);

        System.out.println("Persons size: " + persons.size());

        persons.remove(person1);
        System.out.println(persons);

    }
}
