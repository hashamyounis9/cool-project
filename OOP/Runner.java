package OOP;

public class Runner {
    public static void main(String[] args) {
        Calculator c1 = new Calculator(20, 30);

        c1.displayNumbers();
        System.out.println("Addition: " + c1.addition());
        System.out.println("Subtraction: " + c1.subtraction());
        System.out.println("Division: " + c1.division());
        System.out.println("Multiplication: " + c1.multiplication());

        // A general static method to perform operation by passing parametes
        System.out.println(Calculator.performCalculation(20, 30, '*'));

    }
}
