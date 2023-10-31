package lesson3.demo2_anonimclasses;

public class MainWithLambdas {
    public static void main(String[] args) {
//        анонімні класи
        CalculatorOperations addOperations = (c, d) -> c + d;
//        анонімні класи
        CalculatorOperations minusOperations = (y, z) -> y - z;
        int addResult = addOperations.doSomething(5, 3);
        int minusResult = minusOperations.doSomething(10, 5);
        System.out.println(addResult); /*8*/
        System.out.println(minusResult); /*5*/
//                       OR
        CalculatorOperations addOperations2 = new AddOperations();
        int addResult1 = addOperations.doSomething(5, 2);
        int minusResult2 = minusOperations.doSomething(10, 4);
        System.out.println(addResult1); /*7*/
        System.out.println(minusResult2); /*6*/
    }
}
