package by.epam.decomposition;

import java.util.Scanner;

/*
Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.
*/

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int one = scanner.nextInt();
        System.out.println("Введите второе число ");
        int two = scanner.nextInt();
        System.out.println("Введите третье число ");
        int three = scanner.nextInt();

        int[] array = {one, two, three};

        int gdc = array[0];
        for (int i = 0; i < array.length-1; i++) {
            gdc = greatestCommonDivisor(gdc,array[i]);
        }
        if (Math.abs(gdc) == 1) {
            System.out.println("Числа взаимно простые.");
        }
        else {
            System.out.println("Числа не взаимно простые.");
        }
    }

    public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int greatestCommonDivisor = 0;
        while (secondNumber != 0) {
            greatestCommonDivisor = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = greatestCommonDivisor;
        }
        return greatestCommonDivisor;
    }
}
