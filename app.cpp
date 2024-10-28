#include <iostream>
using std::cout;
using std::cin;
using std::endl;

int sum(int n1, int n2)
{
  return n1 + n2;
}

int subtract(int n1, int n2)
{
  return n1 - n2;
}

int main()
{
  int n1, n2;
  cout << "Enter first numbers: ";
  cin >> n1;
  cout << "Enter second numbers: ";
  cin >> n2;
  int operation;
  cout << "1. Add\n";
  cout << "2. Subtract\n";
  cout << "Enter Operation number: ";
  cin >> operation;
  if (operation == 1)
  {
    int c = sum(n1, n2);
    cout << "Sum is: " << c << endl;
    return 0;
  }
  else if (operation == 2)
  {
    int c = subtract(n1, n2);
    cout << "Subtraction is: " << c << endl;
    return 0;
  }
  else
  {
    cout << "Invalid Operation\n";
  }
  return 0; 
}
