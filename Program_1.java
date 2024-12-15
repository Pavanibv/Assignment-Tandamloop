import java.util.Scanner;

public class Program_1 {
    public double add(double a, double b) {
        return a + b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }

    public double divide(double a, double b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Program_1 calculator = new Program_1();
        System.out.print("Enter the first number (a): ");
        double a = scanner.nextDouble();
        System.out.print("Enter the second number (b): ");
        double b = scanner.nextDouble();
        System.out.print("Enter the type of operation (add, subtract, multiply, divide): ");
        String operation = scanner.next().toLowerCase();
        try {
            double result;
            switch (operation) {
                case "add":
                    result = calculator.add(a, b);
                    break;
                case "subtract":
                    result = calculator.subtract(a, b);
                    break;
                case "multiply":
                    result = calculator.multiply(a, b);
                    break;
                case "divide":
                    result = calculator.divide(a, b);
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operation type.");
            }
            System.out.println("The result is: " + result);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
