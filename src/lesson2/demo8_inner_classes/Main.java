package lesson2.demo8_inner_classes;

public class Main {
    public static void main(String[] args) {
        new Main().new InnerClass().printInfo();
        new Main.InnerStaticClass().print();

//        внутрішні аномімні класи ніколи так не робити!!!
//        class InnerMethodClass{
//            void print(){
//                System.out.println("print from method class!");
//            }
//        }
//        new InnerMethodClass().print();

    }


    class InnerClass {
        public void printInfo() {
            System.out.println("inner class");
        }
    }

    static class InnerStaticClass {
        public void print() {
            System.out.println("inner static class");
        }
    }
}