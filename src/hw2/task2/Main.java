package hw2.task2;
//Cтворити клас ланцюг наслідування:
//        Папірус-Книга-Журнал
//        Папірус-Книга-Комікс
//        Кількість полів довільна.
public class Main {
    public static void main(String[] args) {
        Papyrus papyrus = new Papyrus(200, "yellow");
        System.out.println(papyrus);
        Book book = new Book(45, "red", 200);
        System.out.println(book);
        Magazine blueMagazine = new Magazine(50, "blue", 48, 2000);
        System.out.println(blueMagazine);
        Comics pink = new Comics(50, "pink", 100, 3);
        System.out.println(pink);
    }
}
