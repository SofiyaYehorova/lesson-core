package hw3.task2;

public class Guitar implements Instrument {
    private int numberOfStrings;

    public Guitar() {
    }

    public Guitar(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    public int getNumberOfStrings() {
        return numberOfStrings;
    }

    public void setNumberOfStrings(int numberOfStrings) {
        this.numberOfStrings = numberOfStrings;
    }

    @Override
    public String toString() {
        return "Guitar{" +
                "numberOfStrings=" + numberOfStrings +
                '}';
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " " + this.numberOfStrings + " strings");
    }
}
