package hw2.task2;

public class Comics extends Book{
    private int thickness;

    public Comics() {
    }

    public Comics(int size, String color, int numberOfPages, int thickness) {
        super(size, color, numberOfPages);
        this.thickness = thickness;
    }

    public int getThickness() {
        return thickness;
    }

    public void setThickness(int thickness) {
        this.thickness = thickness;
    }

    @Override
    public String toString() {
        return "Comics{" +
                "thickness=" + thickness +
                "} " + super.toString();
    }
}
