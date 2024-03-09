import java.util.Random;
import java.util.Scanner;

public class GuessTheNumber {
    public static void main(String[] args) {
        Random number = new Random();
        int secretNumber = number.nextInt(10);
        System.out.println("Привіт гравець! Давай зіграємо у гру \"Вгадай число!\"");
        System.out.println("Я загадав число від 0 до 10, тобі необхідно його вгадати і ввести з клавіатури.");
        System.out.println("На це у тебе є лише 3 спроби, гарної гри!");
        System.out.println(secretNumber); //Цей друк у консоль додано для тестування
        System.out.print("Перша спроба: ");

        Scanner scanner = null;
        for (int tryIndex = 0; tryIndex < 3; tryIndex++) {
            scanner = new Scanner(System.in);
            if (scanner.hasNextInt()) {
                int inputNumber = scanner.nextInt();
                if (inputNumber == secretNumber) {
                    System.out.println("Ти вгадав!");
                    break;
                } else {
                    if (tryIndex == 0) {
                        System.out.println("Нажаль це не те число. Спробуй ще!");
                        System.out.print("Спроба 2: ");
                    } else if (tryIndex == 1) {
                        System.out.println("Нажаль це не те число. Залишилася ще одна спроба!");
                        System.out.print("Спроба 3: ");
                    } else {
                        System.out.println("Нажаль ти не вгадав, спроб більше нема.");
                    }
                }
            } else {
                System.out.print("Помилка вводу, ви маєте ввести ціле число. Спробуйте ще раз: ");
                tryIndex--;
            }
        }
        scanner.close();
    }
}