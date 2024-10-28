// Division in Swift based on user input
import Foundation

print("Enter the first number: ", terminator: "")
if let a = Double(readLine() ?? ""), let b = Double(readLine() ?? "") {
    print("Enter the second number: ", terminator: "")
    
    if b != 0 {
        let result = a / b
        print("Result: \(result)")
    } else {
        print("Error: Division by zero is not allowed.")
    }
} else {
    print("Invalid input.")
}
