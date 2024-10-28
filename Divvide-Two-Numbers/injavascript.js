// Division in JavaScript based on user input
let a = parseFloat(prompt("Enter the first number:"));
let b = parseFloat(prompt("Enter the second number:"));
if (b !== 0) {
    let result = a / b;
    console.log("Result:", result);
} else {
    console.log("Error: Division by zero is not allowed.");
}
