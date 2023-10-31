package hw3.task1;
//а) Оприділити інтерфейс Printable, який містить метод void print().
//б) Оприділити клас Book, що реалізує інтерфейс Printable.
//в) Оприділити клас Magazine, що реалізує інтерфейс Printable.
//г) Створити масив типу Printable, який буде містити книги та журнали.
//

public class Main {
    public static void main(String[] args) {
        Printable[] printables = {
                new Book("book1"),
                new Book("book2"),
                new Book("book3"),
                new Magazine("magazine1"),
                new Magazine("magazine2"),
                new Magazine("magazine3")
        };
        for (Printable printable : printables) {
            printable.print();
        }
    };
}
