package lesson2.demo4_enums;

public class Main {
    public static void main(String [] args){
        Notebook notebook = new Notebook();
        notebook.setName("nb");
        notebook.setPrice(5);
        notebook.setNumberOfSheets(24);
        notebook.setMarkup(Markup.CELL);
        System.out.println(notebook);
    }
}
