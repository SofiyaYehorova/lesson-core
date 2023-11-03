package lesson4.demo3_streamapi;

import lesson4.demo1_list.Person;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

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

        List<Person> persons = new LinkedList<>();

        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
        persons.add(person1);
//        persons.add(null);
//        persons.add(null);
//        persons.add(null);
//        persons.add(null);
        persons.add(person2);
        persons.add(person3);
        persons.add(person4);
        persons.add(person5);
        persons.add(person5);
        persons.add(person6);
        persons.add(person6);
        persons.add(person7);
        persons.add(person7);
        persons.add(person8);
        persons.add(person8);
        System.out.println(persons);

// виводить всіх person і дублікати, щоб цього уникнути потрібно проітерувати і виключити дублікати
//        list
        List<Person> tempPersons = new ArrayList<>();
        for (Person person : persons) {
            if (!tempPersons.contains(person)){
                tempPersons.add(person);
            }
        }
        System.out.println("Distinct persons: " + tempPersons);
//                                      OR
//        persons.removeIf(new Predicate<Person>() {
//            @Override
//            public boolean test(Person person) {
//                return person.getAge()>40;
//            }
//        });
//        System.out.println(persons);
//                                              OR
//        persons.removeIf(person -> person.getAge()<40);
//        System.out.println(persons);

//                                              STREAM
        Stream<Person> personStream=persons.stream();
        List<Person> filteredPersons = personStream
                .filter(person -> person.getAge() > 30)
                .collect(Collectors.toList());
        System.out.println(filteredPersons);

        List<Person> distinctPersons = persons.stream().distinct().collect(Collectors.toList());
        System.out.println(distinctPersons);

        persons.stream()
                .map(person -> person.getName())
                .distinct()
                .filter(name -> name.length()<=6)
                .forEach(System.out::println);


//        Iterator<Person> personIterator=persons.iterator();
//        while(personIterator.hasNext()){
//            System.out.println(personIterator.next());
//        }
    }}
