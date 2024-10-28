// Division in C++ based on user input
#include <iostream>
using namespace std;

int main() {
    double a, b;
    cout << "Enter the first number: ";
    cin >> a;
    cout << "Enter the second number: ";
    cin >> b;

    if (b != 0) {
        double result = a / b;
        cout << "Result: " << result << endl;
    } else {
        cout << "Error: Division by zero is not allowed." << endl;
    }
    return 0;
}
