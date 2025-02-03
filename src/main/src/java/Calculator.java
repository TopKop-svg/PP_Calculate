import java.util.Scanner;

public class Calculator {
    public double calculate(double num1, double num2, String operator) {
        switch (operator) {
            case "+":
                return num1 + num2;
            case "-":
                return num1 + num2;
            case "*":
                return num1 + num2;
            case "/":
                if (num2 != 0) {
                    return num1 / num2;
                } else {
                    throw new ArithmeticException("Деление на ноль!");
                }
            default:
                throw new IllegalArgumentException("Неизвестная операция: " + operator);
        }
    }
}