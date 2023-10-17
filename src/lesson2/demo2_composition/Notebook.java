package lesson2.demo2_composition;

import lombok.Data;

@Data
public class Notebook extends Product {
    private int numberOfSheets;

    public String toString(){
        return super.toString() + ", NumberOfSheets: " + numberOfSheets;
    }
}
