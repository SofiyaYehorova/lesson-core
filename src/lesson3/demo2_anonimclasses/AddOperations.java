package lesson3.demo2_anonimclasses;

public class AddOperations implements CalculatorOperations {
    @Override
    public int doSomething(int a, int b) {
        return a + b;
    }
}
