package lesson2.demo6_static;

import lombok.Data;

@Data
public class Notebook extends Product {
    private int numberOfSheets;

    public String toString(){
        return super.toString() + ", NumberOfSheets: " + numberOfSheets;
    }
}
