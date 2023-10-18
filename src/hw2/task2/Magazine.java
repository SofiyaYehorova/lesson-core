package hw2.task2;

public class Magazine extends Book{
    private int numberOfEditions;

    public Magazine() {
    }

    public Magazine(int size, String color, int numberOfPages, int numberOfEditions) {
        super(size, color, numberOfPages);
        this.numberOfEditions = numberOfEditions;
    }

    public int getNumberOfEditions() {
        return numberOfEditions;
    }

    public void setNumberOfEditions(int numberOfEditions) {
        this.numberOfEditions = numberOfEditions;
    }

    @Override
    public String toString() {
        return "Magazine{" +
                "numberOfEditions=" + numberOfEditions +
                "} " + super.toString();
    }
}
