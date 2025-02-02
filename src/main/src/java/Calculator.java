import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Приложение Calculate");
        System.out.println("version - 1.0");

        boolean isRunning = true;
        Scanner scanner = new Scanner(System.in);

        while (isRunning) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Сложение (+)");
            System.out.println("2. Вычитание (-)");
            System.out.println("3. Умножение (*)");
            System.out.println("4. Деление (/)");
            System.out.println("5. Выйти");
            System.out.print("Ваш выбор: ");

            int choice = scanner.nextInt();

            if (choice == 5) {
                isRunning = false;
                System.out.println("Выход из калькулятора. До свидания!");
                continue;
            }

            if (choice < 1 || choice > 4) {
                System.out.println("Ошибка: неверный выбор операции. Попробуйте снова.");
                continue;
            }

            // Запрашиваем числа
            System.out.print("Введите первое число: ");
            double num1 = scanner.nextDouble();

            System.out.print("Введите второе число: ");
            double num2 = scanner.nextDouble();

            double result = 0;
            String operation = "";

            switch (choice) {
                case 1:
                    result = num1 + num2;
                    operation = "+";
                    break;
                case 2:
                    result = num1 - num2;
                    operation = "-";
                    break;
                case 3:
                    result = num1 * num2;
                    operation = "*";
                    break;
                case 4:
                    if (num2 != 0) {
                        result = num1 / num2;
                        operation = "/";
                    } else {
                        System.out.println("Ошибка: деление на ноль!");
                        continue;
                    }
                    break;
            }

            System.out.println("\nРезультат: " + num1 + " " + operation + " " + num2 + " = " + result);
        }

        scanner.close();
    }
}