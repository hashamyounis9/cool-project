// Division in C# based on user input
using System;

class Program {
    static void Main() {
        Console.Write("Enter the first number: ");
        double a = Convert.ToDouble(Console.ReadLine());
        Console.Write("Enter the second number: ");
        double b = Convert.ToDouble(Console.ReadLine());

        if (b != 0) {
            double result = a / b;
            Console.WriteLine("Result: " + result);
        } else {
            Console.WriteLine("Error: Division by zero is not allowed.");
        }
    }
}
