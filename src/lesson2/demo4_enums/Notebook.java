package lesson2.demo4_enums;

import lombok.Data;

@Data
public class Notebook extends Product {
    private int numberOfSheets;
    private Markup markup;

    public String toString(){
        return super.toString() + ", NumberOfSheets: " + numberOfSheets + ", Markup: " + markup.getName();
    }
}
