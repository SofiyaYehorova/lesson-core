package lesson2.demo7_singleton;

public class Service {
    public static final Service SERVICE = new Service();

    private Service (){
    }
    public void print(){
        System.out.println("singleton");
    }
}
