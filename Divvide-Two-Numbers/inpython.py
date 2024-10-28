# Division in Python based on user input
a = float(input("Enter the first number: "))
b = float(input("Enter the second number: "))
if b != 0:
    result = a / b
    print("Result:", result)
else:
    print("Error: Division by zero is not allowed.")
