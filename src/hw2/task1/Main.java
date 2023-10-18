package hw2.task1;
//Створити та описати наступну їєрархію
//        PC-Laptop-Ultrabook
//        PC-Laptop- Workstation
//        Загальна кількість вкористаних класів - 4!

public class Main {
    public static void main(String[] args) {
        Laptop laptop = new Laptop(8, 16, 15, 2);
        System.out.println(laptop);
        UltraBook ultraBook = new UltraBook(12, 32, 15, 1, 1);
        System.out.println(ultraBook);
        WorkStation workStation = new WorkStation(32, 128, 21, 4, Video.NVIDIA);
        System.out.println(workStation);
    }
}
