package session_1_java_basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Variable declaration and initialization
        int userAge;  // Declare an integer variable to store age
        userAge = 30;  // Assign the value 30 to userAge

        int alternateAge = 30;  // Declare and initialize in one line
        System.out.println("User's age: " + userAge);  // Print the user's age

        // Working with multiple variables
        int num1, num2;  // Declare two integer variables
        num1 = 5;  // Assign 5 to num1
        num2 = 3;  // Assign 3 to num2

        // Arithmetic operations
        int sumResult = num1 + num2;  // Addition
        System.out.println("Sum result: " + sumResult);

        int differenceResult = num2 - num1;  // Subtraction
        System.out.println("Difference result: " + differenceResult);

        int productResult = num1 * num2;  // Multiplication
        System.out.println("Product result: " + productResult);

        int quotientResult = num1 / num2;  // Integer division
        System.out.println("Quotient result: " + quotientResult);

        int remainderResult = num1 % num2;  // Modulus (remainder)
        System.out.println("Remainder result: " + remainderResult);

        // String manipulation
        String firstName = "John";  // Declare and initialize a String variable
        String lastName = "Doe";  // Declare and initialize another String variable
        String fullName = firstName + " " + lastName;  // Concatenate strings
        System.out.println("Full name: " + fullName);

        // Different numeric data types
        double weight = 81.3;  // Declare and initialize a double (decimal) variable
        float height = 12.6f;  // Declare and initialize a float variable (note the 'f' suffix)
        long population = 10000000L;  // Declare and initialize a long variable (note the 'L' suffix)

        // Arithmetic with double
        System.out.println("Half of the weight: " + weight / 2);  // Divide weight by 2 and print

        Scanner inputScanner = new Scanner(System.in);

        // Prompt user for name and read input
        System.out.println("Insert your name: ");
        String userName = inputScanner.nextLine();
        System.out.println("My name is " + userName);

        // Prompt user for two numbers and calculate their sum
        System.out.println("Insert first number: ");
        int firstNumber = inputScanner.nextInt();

        System.out.println("Insert second number: ");
        int secondNumber = inputScanner.nextInt();
        int result = firstNumber + secondNumber;
        System.out.println("Sum of the two numbers: " + result);

        // Close the Scanner to prevent resource leak
        inputScanner.close();

        // Demonstrating increment operators
        int counter = 1;
        System.out.println("counter = " + counter);  // Prints 1
        counter = counter + 1;  // Increment by 1
        System.out.println("counter = " + counter);  // Prints 2
        counter++;  // Post-increment
        System.out.println("counter = " + counter);  // Prints 3

        System.out.println("counter = " + ++counter);  // Pre-increment, prints 4
        System.out.println("counter = " + counter++);  // Post-increment, prints 4
        System.out.println("counter = " + counter);  // Prints 5

        // Demonstrating increment and decrement in expressions
        num1 = 3;
        num2 = 5;

        int sum = num1 + num2++;  // Use num2, then increment it
        System.out.println("sum = " + sum);  // Prints 8
        System.out.println("num2 = " + num2);  // Prints 6
        num1--;  // Decrement num1
        System.out.println("num1 = " + num1);  // Prints 2

        int result2 = ++num1 + num2--;  // Increment num1, use it, use num2, then decrement num2
        System.out.println("result2 = " + result2);  // Prints number 9
    }
}