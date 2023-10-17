package lesson1.demo1;

import java.util.ArrayList;
import java.util.Arrays;

//public class Main {

//    public static void main(String[] args){
////        System.out.println("hello");
//        Person person=new Person("John", 30);
////        person.name="John";
//        System.out.println(person.name);
//    }
//    public static void main(String [] args){
//        Person person=new Person("Tom", 25);
////        Person person=new Person();
//        System.out.println(person.getName()+ " is " + person.getAge());
//        person.setAge(26);
//        System.out.println(person.getName()+ " is " + person.getAge());
//    }

//    public static void main(String[] args) {
//        Person person = new Person("Tom", 25);
////        Person person=new Person();
//        System.out.println(person.toString());
//    }
//                                                  МАСИВИ

//    public static void main(String[] args) {
//        Person [] persons = new Person[3];
//        persons[0]=new Person("Kevin", 25);
//        persons[1]=new Person("Mark", 26);
//        persons[2]=new Person("Tom", 27);
//        System.out.println(Arrays.toString(persons));
////        [Person(name=Kevin, age=25), Person(name=Mark, age=26), Person(name=Tom, age=27)]
//    }

//                                     ЦИКЛИ В МАСИВАХ
//    public static void main(String[] args) {
//        Person[] persons = new Person[3];
//        persons[0] = new Person("Kevin", 25);
//        persons[1] = new Person("Mark", 26);
//        persons[2] = new Person("Tom", 27);

//        for (Person person: persons){
//            System.out.println(person);
//        }
////        Person(name=Kevin, age=25)
////        Person(name=Mark, age=26)
////        Person(name=Tom, age=27)

//        for (int index = 0; index < persons.length; index++) {
//            Person person=persons[index];
//            System.out.println(index + ": " + person);
////            0: Person(name=Kevin, age=25)
////            1: Person(name=Mark, age=26)
////            2: Person(name=Tom, age=27)
//        }

//        int index = 0;
//        while (index < persons.length) {
//            Person person = persons[index];
//            System.out.println(person);
//            index++;
////             Person(name=Kevin, age=25)
////             Person(name=Mark, age=26)
////             Person(name=Tom, age=27)
//        }

//        do {
//            System.out.println("do");
//        } while (false);

//    }
//}

//                                               ДИНАМІЧНІ МАСИВИ

//public class Main{
//    public static void main(String[] args){
////        Person person =new Person("John", 30, new String[3]);
////        person.setCourses(new String[]{"java", "sql", "spring"});
////        System.out.println(person);
//////        Person(name=John, age=30, courses=[java, sql, spring])
////        System.out.println(Arrays.toString(person.getCourses()));
//////        [java, sql, spring]
//
//        ArrayList<String> courses = new ArrayList<>();
//        courses.add("java");
//        courses.add("spring");
//        Person person =new Person("John", 25, courses);
//        System.out.println(person);
////        Person(name=John, age=25, course=[java, spring])
//        courses.add("sql");
//        System.out.println(person);
////        Person(name=John, age=25, course=[java, spring, sql]
//    }
//}

//                                     ЛАНЦЮГ ВИКЛИКІВ

public class Main{
    public static void main(String [] args){
        ArrayList<String> courses=new ArrayList<>();
        courses.add("java");
        courses.add("spring");

//        Person person=new Person();
//        person.setName("John");
//        person.setAge(30);
//        person.setCourses(courses);

        Person person=new Person()
                .setName("Tom")
                .setAge(25)
                .setCourses(courses);

        System.out.println(person);
//        Person(name=John, age=30, courses=[java, spring])
    }
}

