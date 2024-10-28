// Division in C based on user input
#include <stdio.h>

int main() {
    double a, b, result;
    printf("Enter the first number: ");
    scanf("%lf", &a);
    printf("Enter the second number: ");
    scanf("%lf", &b);
    
    if (b != 0) {
        result = a / b;
        printf("Result: %.2lf\n", result);
    } else {
        printf("Error: Division by zero is not allowed.\n");
    }
    return 0;
}
