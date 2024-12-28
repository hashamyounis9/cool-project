package OOP;

public class Calculator {
    private int num1;
    private int num2;

    public Calculator(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public int addition() {
        return num1 + num2;
    }

    public int subtraction() {
        return num1 - num2;
    }

    public int multiplication() {
        return num1 * num2;
    }

    public int division() {
        return num1 / num2;
    }

    public void displayNumbers() {
        System.out.println("The first number is: " + num1);
        System.out.println("The second number is: " + num2);
    }

    // A static function for performing calculation by passing parameters
    public static int performCalculation(int num1, int num2, char op) {
        if (op == '+') {
            return num1 + num2;
        } else if (op == '-') {
            return num1 - num2;
        } else if (op == '*') {
            return num1 * num2;
        } else if (op == '/') {
            return num1 / num2;
        } else {
            return -1;
        }
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

}
