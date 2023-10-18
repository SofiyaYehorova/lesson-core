package hw2.task1_v2;

public class Laptop extends PC{
    private double weight;

    public Laptop() {
    }

    public Laptop(int CPUs, int RAM, double monitor, double weight) {
        super(CPUs, RAM, monitor);
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "weight=" + weight + " kg"+
                "} " + super.toString();
    }
}
