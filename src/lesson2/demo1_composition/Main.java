package lesson2.demo1_composition;

public class Main {
    //    композиція (клач який контролює всі процеси об'єкта(створення, видалення і тд)),
//    агрегація (клас отримує об'єкт),
//    наслідування(розширення)(клас розширяє об'єкт)
    public static void main(String[] args) {
//        Product product = new Phone();
//        product.setName("iphone 12 pro");
//        product.setPrice(1200);
//        product.showInfo();
//
////      class cast (краще не використовувати!!!)
//        Phone phone = (Phone) product;
//
//        phone.setManufacturer("apple");
//        phone.showManufacturer();

        Notebook product=new Notebook();
        product.setName("notebook");
        product.setPrice(5);
        product.showInfo();

        product.setNumberOfSheets(48);
        System.out.println(product);
    }
}
