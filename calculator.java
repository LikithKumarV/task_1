import java.util.Scanner;

public class calculator {

    public static double add(double a, double b) {
        return a + b;
    }

    public static double subtract(double a, double b) {
        return a - b;
    }

    public static double multiply(double a, double b) {
        return a * b;
    }

    public static double divide(double a, double b) {
        if (b == 0) {
            System.out.println("Error: Division by zero is not allowed.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean continueCalc = true;

        System.out.println("=== Java Console Calculator ===");

        while (continueCalc) {
            System.out.print("Enter first number: ");
            double num1 = scanner.nextDouble();

            System.out.print("Enter second number: ");
            double num2 = scanner.nextDouble();

            System.out.print("Select operation (+, -, *, /): enter operator ");
            String operator = scanner.next();

            double result = 0;
            boolean validOperation = true;

            switch (operator) {
                case "+":
                    result = add(num1, num2);
                    break;
                case "-":
                    result = subtract(num1, num2);
                    break;
                case "*":
                    result = multiply(num1, num2);
                    break;
                case "/":
                    if (num2 == 0) {
                        System.out.println("Error: Division by zero is not allowed.");
                        validOperation = false;
                    } else {
                        result = divide(num1, num2);
                    }
                    break;
                default:
                    System.out.println("Invalid operator! Please use +, -, *, or /.");
                    validOperation = false;
            }

            if (validOperation) {
                System.out.println("Result: " + result);
            }

            System.out.print("Do you want to perform another calculation? (yes/no): ");
            String continueInput = scanner.next();
            if (!continueInput.equalsIgnoreCase("yes")) {
                continueCalc = false;
                System.out.println("Exiting calculator. Goodbye!");
            }
            System.out.println();
        }

        scanner.close();
    }
}
