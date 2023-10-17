package lesson2.demo2_composition;

public class Main {
    //    композиція (клач який контролює всі процеси об'єкта(створення, видалення і тд)),
//    агрегація (клас отримує об'єкт),
//    наслідування(розширення)(клас розширяє об'єкт)
    public static void main(String[] args) {
        Phone phone=new Phone();
        phone.setName("phone 9");
        phone.setPrice(100);
        phone.setManufacturer("xiaomi");

//        Review review1=new Review();
//        review1.setText("good phone!!!");
//        review1.setRating(4);
//
//        Review review2=new Review();
//        review2.setText("phone)))");
//        review2.setRating(5);

        phone.addReviews("nice phone", 4);
        System.out.println(phone);

        Notebook notebook = new Notebook();
        notebook.setName("notebook");
        notebook.setPrice(10);
        notebook.setNumberOfSheets(24);
        notebook.addReviews("good done", 3);
        System.out.println(notebook);
    }
}
