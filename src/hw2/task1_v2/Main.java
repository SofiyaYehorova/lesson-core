package hw2.task1_v2;
//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!
public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 12, 15.6, 2.2);
        System.out.println(laptop);
    }
}
