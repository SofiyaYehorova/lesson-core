package lesson2.demo3_agregation;

public class Main {
    public static void main(String [] args){
        Phone phone = new Phone();
        phone.setName("phone");
        phone.setPrice(100);
        phone.setManufacturer("xiaomi");
        phone.addReviews("nice device", 5);
        phone.addReviews("good item", 4);

        Notebook notebook = new Notebook();
        notebook.setName("notebook");
        notebook.setPrice(5);
        notebook.setNumberOfSheets(12);

        ProductCart productCart = new ProductCart();
        productCart.addProduct(phone);
        productCart.addProduct(notebook);

        System.out.println("Product cart total price: " + productCart.getTotalPrice());
//        System.out.println(productCart);
    }
}
