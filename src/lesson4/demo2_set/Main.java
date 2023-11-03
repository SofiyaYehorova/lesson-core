package lesson4.demo2_set;

import lesson4.demo1_list.Person;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

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

        Set<Person> persons = new HashSet<>(); /* не може містити дублікати та nulls, допускається(пропускає) лише 1 null*/
        /*містить в собі HASHMAP(використовує HashTable)*/
//        Set<Person> persons = new TreeSet<>(); /*не дозволяє додавати nulls*/ /*вимагає щоб ми вказали методи сортування*/


        persons.add(person1);
//        persons.add(null);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person6);
        persons.add(person7);
        persons.add(person8);

        System.out.println(persons);

        System.out.println("Persons size: " + persons.size());

        persons.remove(person1);
        System.out.println(persons);

        Set<Integer> numbers= new TreeSet<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(30);
        numbers.add(45);
        numbers.add(-50);
        numbers.add(156);
        System.out.println(numbers); /*[-50, 1, 2, 30, 45, 156]*/
    }
}
