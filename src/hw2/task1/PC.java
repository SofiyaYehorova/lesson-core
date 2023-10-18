package hw2.task1;
public class PC {
    private int CPUs;
    private int RAM;
    private int monitor;

    public PC() {
    }

    public PC(int CPUs, int RAM, int monitor) {
        this.CPUs = CPUs;
        this.RAM = RAM;
        this.monitor = monitor;
    }

    public int getCPUs() {
        return CPUs;
    }

    public void setCPUs(int CPUs) {
        this.CPUs = CPUs;
    }

    public int getRAM() {
        return RAM;
    }

    public void setRAM(int RAM) {
        this.RAM = RAM;
    }

    public int getMonitor() {
        return monitor;
    }

    public void setMonitor(int monitor) {
        this.monitor = monitor;
    }

    @Override
    public String toString() {
        return " PC{" +
                "CPUs=" + CPUs +
                ", RAM=" + RAM +
                ", monitor=" + monitor +
                '}';
    }
}