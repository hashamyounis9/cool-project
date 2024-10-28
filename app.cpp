#include <iostream>
using std::cout;
using std::cin;
using std::endl;

int sum(int n1, int n2)
{
  return n1 + n2;
}

int main()
{
  int n1, n2;
  cin >> n1 >> n2;
  int c = sum(n1, n2);
  cout << "Sum is: " << c << endl;
  return 0; 
}
