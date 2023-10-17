package lesson2.demo3_agregation;

import lombok.Data;

import java.util.ArrayList;

@Data
public class ProductCart {
    private ArrayList<Product> products = new ArrayList<>();
// можна прописувати ENUM при статусі замовдення (формується, чкає на оплату, доставляється, виконано)
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
