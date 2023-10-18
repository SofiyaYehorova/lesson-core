package hw2.task2;

public class Book extends Papyrus{
    private int numberOfPages;

    public Book() {
    }

    public Book(int size, String color, int numberOfPages) {
        super(size, color);
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "numberOfPages=" + numberOfPages +
                "} " + super.toString();
    }
}
