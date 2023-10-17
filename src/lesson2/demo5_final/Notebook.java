package lesson2.demo5_final;

import lombok.Data;

@Data
public class Notebook extends Product {
    private int numberOfSheets;

    public String toString(){
        return super.toString() + ", NumberOfSheets: " + numberOfSheets;
    }

//    @Override
//    public void showBasicInfo() {
//        super.showBasicInfo();
//        System.out.println("show basic info from child class!");
//    }
}
