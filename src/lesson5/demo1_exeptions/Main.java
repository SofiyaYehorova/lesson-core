package lesson5.demo1_exeptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
//        divide_withTryCatch(10, 0);
        try {
            divide_withThrows(10, 0);
            divide_withThrows(10, 1);
        } catch (RuntimeException e) {
            System.out.println("Exceptions");
        } catch (IOException e){
            System.out.println("io exceptions");
        } finally {
            System.out.println("Finally1");
        }

//        catch (ArithmeticException | IllegalAccessException e) {
//            System.out.println("Exceptions");
//        }
//        catch (IllegalAccessError e) {
//            System.out.println("Argument is invalid");
//        }

        System.out.println("end");
    }

    private static void divide_withTryCatch(int a, int b) {
        try {
            System.out.println("Result: " + a / b);
        } catch (ArithmeticException e) {
            e.printStackTrace();
            System.out.println("Unable to divide(divide_withTryCatch)");
        }
        finally {
            System.out.println("Finally2");
        }
    }

//    private static void divide_withThrows(int a, int b) throws ArithmeticException, IllegalArgumentException {
//        if (b == 0) {
//            throw new IllegalCallerException();
//        }
//        System.out.println("Result: " + a / b);
//    }
    public static void divide_withThrows(int a, int b) throws IOException {
        Files.list(Paths.get(System.getProperty("user.home")));
        System.out.println("Result: " + a / b);
    }
}
