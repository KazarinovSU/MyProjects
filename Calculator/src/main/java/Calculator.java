package main.java;

import java.util.Scanner;

import static main.java.ConsoleProtection.*;
import static main.java.Operations.*;

public class Calculator {

    public static Scanner SCANNER = new Scanner(System.in);

    public static void main(String[] args) {

        boolean menu = true;

        System.out.println("Консольный калькулятор");
        while (menu) {
            System.out.println("\nВыберите операцию:");
            System.out.println("1. Сложение (+)");
            System.out.println("2. Вычитание (-)");
            System.out.println("3. Умножение (*)");
            System.out.println("4. Деление (/)");
            System.out.println("5. Выход");

            int choice = 0;
            while (true) {
                System.out.print("Ваш выбор: ");
                choice = readInt();
                if (choice >= 1 && choice <= 5) {
                    break;
                }
                System.out.println("ОШИБКА: Неверный выбор! Введите число от 1 до 5");
            }

            if (choice == 5) {
                System.out.println("Выход из программы.");
                break;
            }

            System.out.print("Введите первое число: ");
            double numOne = readDouble();
            System.out.print("Введите второе число: ");
            double numTwo = readDouble();

            double result = 0;
            boolean valid = true;

            switch (choice) {
                case 1:
                    result = add(numOne, numTwo);
                    break;
                case 2:
                    result = subtract(numOne, numTwo);
                    break;
                case 3:
                    result = multiply(numOne, numTwo);
                    break;
                case 4:
                    if (numTwo == 0) {
                        System.out.println("ОШИБКА: деление на ноль!");
                        valid = false;
                    } else {
                        result = divide(numOne, numTwo);
                    }
                    break;
                default:
                    System.out.println("ОШИБКА: Неверный выбор.");
                    valid = false;
            }
            if (valid) {
                System.out.println("Результат: " + result);
            }
        }
        SCANNER.close();
    }
}
