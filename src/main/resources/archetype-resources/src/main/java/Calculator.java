import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Приложение Calculate");
        System.out.println("version - 1.0");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        double number1 = scanner.nextDouble();

        System.out.printf("Введите операцию (+, -, *, /): ");
        char operation = scanner.next().charAt(0);

        System.out.println("Введите второе число: ");
        double num2 = scanner.nextDouble();

        double result = 0;

        switch (operation) {
            case '+':
                result = num1 + num2;
                break;
            case '-':
                result = num1 - num2;
                break;
            case '*':
                result = num1 * num2;
                break;
            case '/':
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Ошибка: деление на ноль!");
                    return;
                }
                break;
            default:
                System.out.println("Ошибка: неизвестная операция!");
                return;
        }

        System.out.println("Результат " + result);
}
