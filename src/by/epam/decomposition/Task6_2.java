package by.epam.decomposition;

import java.util.Scanner;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

public class Task6_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int one = scanner.nextInt();
        System.out.println("Введите второе число ");
        int two = scanner.nextInt();
        System.out.println("Введите третье число ");
        int three = scanner.nextInt();

        relativePrime(one,two,three);

    }

    public static void relativePrime(int firstNumber, int secondNumber, int thirdNumber) {
        if (greatestCommonDivisor(firstNumber,secondNumber) != 1) {
            System.out.println("Первое и второе число не являются взаимо простыми.");
        }
        else if (greatestCommonDivisor(firstNumber,thirdNumber) != 1) {
            System.out.println("Первое и третье число не являются взаимо простыми.");
        }
        else if (greatestCommonDivisor(secondNumber,thirdNumber) != 1) {
            System.out.println("Второе и третье число не являются взаимо простыми.");
        }
        else {
            System.out.println("Числа являются взаимо простыми.");
        }
    }

    public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int greatestCommonDivisor = 0;
        while (secondNumber != 0) {
            greatestCommonDivisor = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = greatestCommonDivisor;
        }
        return Math.abs(greatestCommonDivisor);
    }
}
