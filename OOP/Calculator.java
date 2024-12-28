package OOP;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void addition() {
        System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
    }

    public void subtraction() {
        System.out.println(num1 + " - " + num2 + " = " + (num1 - num2));
    }

    public void multiplication() {
        System.out.println(num1 + " X " + num2 + " = " + (num1 * num2));
    }

    public void division() {
        System.out.println(num1 + " / " + num2 + " = " + (num1 / num2));
    }

    public void displayNumbers() {
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
    }

    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public static void main(String[] args) {
        Calculator c1 = new Calculator(10,20);
        c1.displayNumbers();
        c1.addition();
        c1.subtraction();
        c1.multiplication();
        c1.division();
    }
}
