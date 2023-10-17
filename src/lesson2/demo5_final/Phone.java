package lesson2.demo5_final;

import lombok.Data;

@Data
public class Phone extends Product {
    private String manufacturer;


    public String toString() {
        return super.toString() + ", Manufacturer: " + manufacturer;

    }
}