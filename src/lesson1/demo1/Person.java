package lesson1.demo1;

//public class Person {
//    String name;
//    int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

//public class Person {
//    private String name;
//    private int age;
//
//    public Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//
////    public String getName() {
////        return name;
////    }
////
////    public int getAge() {
////        return age;
////    }
////
////    public void setAge(int age) {
////        this.age = age;
////    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
//}
@Data
// для getters and setters
@AllArgsConstructor
@NoArgsConstructor
//створює всі рядки в конструкторі
//public class Person {
//    private String name;
//    private int age;
//
//    public String toString() {
//        return "name: " + name;
//    }
//}
//public class Person {
//    private String name;
//    private int age;
//
//}

//                                               ДИНАМІЧНІ МАСИВИ

//public class Person{
//    private String name;
//    private int age;
////    private String [] courses;
//    private ArrayList<String> course;
//}


//                                                     ЛАНЦЮГ ВИКЛИКІВ

public class Person {
    private String name;
    private int age;
    private ArrayList<String> courses;

    public Person setName(String name){
        this.name=name;
        return this;
    }
    public Person setAge(int age){
        this.age=age;
        return this;
    }
    public Person setCourses(ArrayList<String> courses){
        this.courses=courses;
        return this;
    }
}