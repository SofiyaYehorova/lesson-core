package lesson2.demo1_composition;

import lombok.Data;

@Data
public class Phone extends Product{
    private String manufacturer;

public void showManufacturer(){
    System.out.println(manufacturer);
}
}