package lesson2.demo5_final;

public class Main {
    //    public static void main(String[] args) {
//        final int count=10;
//        System.out.println(count);
//
////      !!!!  count=20;
//        System.out.println(count);
//
//    }
    public static void main(String[] args) {
        Phone phone = new Phone();
        phone.setName("phone 9");
        phone.setPrice(100);
        phone.setManufacturer("xiaomi");

        phone.addReviews("nice phone", 4);
        phone.showBasicInfo();

        Notebook notebook = new Notebook();
        notebook.setName("notebook");
        notebook.setPrice(10);
        notebook.setNumberOfSheets(24);
        notebook.addReviews("good done", 3);

        notebook.showBasicInfo();


    }
}
