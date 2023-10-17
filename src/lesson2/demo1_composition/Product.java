package lesson2.demo1_composition;

import lombok.Data;

@Data
public class Product {
    private String name;
    public double price;

    public void showInfo(){
        System.out.println("Name: " + name+ ", price: " + price + "$");
    }
}
