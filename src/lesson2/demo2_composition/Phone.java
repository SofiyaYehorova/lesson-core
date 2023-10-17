package lesson2.demo2_composition;

import lombok.Data;

@Data
public class Phone extends Product {
    private String manufacturer;

//public void showManufacturer(){
//    System.out.println(manufacturer);
//}
public String toString(){
    return super.toString() + ", Manufacturer: " + manufacturer;
//    super вказує на клас який ми розштряємо, тобто клас Product
}
}