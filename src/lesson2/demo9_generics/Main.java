package lesson2.demo9_generics;

public class Main {
    public static void main(String[] args) {
//        ArrayList<String> list = new ArrayList<>();
//        User<Srting> user = new User<>();
        User<Integer> user = new User<>();
        user.setId(123);
        User<String> user2 = new User<>();
        user2.setId("Inna");

        System.out.println("User 1: " + user);
        System.out.println("User 2: " + user2);
    }
}
