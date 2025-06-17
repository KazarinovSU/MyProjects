package main.java;

import java.util.Random;

import static main.java.Calculator.SCANNER;
import static main.java.ConsoleProtection.readInt;

public class GuessTheNumber {

    public static Random RANDOM = new Random();

    public static void main(String[] args) {

        System.out.println("Угадай число от 1 до 100");

        int attemptCounter = 0, userNumber;
        int theHiddenNumber = RANDOM.nextInt(100) + 1;

        while (true) {

            System.out.print("Ввод: ");
            userNumber = readInt();

            attemptCounter++;

            if (userNumber == theHiddenNumber) {
                System.out.println("Загаданное число отгадано! Попыток: " + attemptCounter);
                break;
            } else if (userNumber > theHiddenNumber) {
                System.out.println("Загаданное число меньше!");
            } else {
                System.out.println("Загаданное число больше!");
            }
        }
        SCANNER.close();
    }
}
