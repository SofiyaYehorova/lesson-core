package lesson2.demo4_enums;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ProductCart {
    private ArrayList<Product> products = new ArrayList<>();

    public void addProduct(Product product) {
        products.add(product);
    }

    public double getTotalPrice() {
        double totalPrice = 0;

        for (Product product : products) {
            totalPrice += product.getPrice();
        }
        return totalPrice;
    }
}
