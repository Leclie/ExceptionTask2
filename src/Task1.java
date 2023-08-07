import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Вводить через запятую
        float number = readFloatFromUser();
        System.out.println("Вы ввели число: " + number);
    }
    
    public static float readFloatFromUser() {
        Scanner scanner = new Scanner(System.in);
        float result = 0;

        boolean validInput = false;
        while (!validInput) {
            try {
                System.out.print("Введите дробное число: ");
                result = scanner.nextFloat();
                validInput = true;
            } catch (InputMismatchException e) {
                // Если пользователь ввел текст или некорректное число,
                // очищаем входной буфер и повторяем запрос.
                scanner.nextLine();
                System.out.println("Некорректный ввод. Пожалуйста, введите дробное число.");
            }
        }

        scanner.close();
        return result;
    }
}