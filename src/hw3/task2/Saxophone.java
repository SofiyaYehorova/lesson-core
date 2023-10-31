package hw3.task2;

public class Saxophone implements Instrument {
    private double diameter;

    public Saxophone() {
    }

    public Saxophone(double diameter) {
        this.diameter = diameter;
    }

    public double getDiameter() {
        return diameter;
    }

    public void setDiameter(double diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Saxophone{" +
                "diameter=" + diameter +
                '}';
    }

    @Override
    public void play() {
        System.out.println(this.getClass().getSimpleName() + " " + this.diameter + " diameter");
    }
}
