package main.java;

import static main.java.Calculator.SCANNER;

public class ConsoleProtection {
    public static double readDouble() {
        while (true) {
            try {
                return SCANNER.nextDouble();
            } catch (java.util.InputMismatchException e) {
                System.out.println("ОШИБКА: введите корректное число!");
                System.out.print("Введите число: ");
                SCANNER.next();
            }
        }
    }

    public static int readInt() {
        while (true) {
            try {
                return SCANNER.nextInt();
            } catch (java.util.InputMismatchException e) {
                System.out.println("ОШИБКА: Используй только цифры!");
                System.out.print("Ваш выбор: ");
                SCANNER.next();
            }
        }
    }
}
