package by.epam.decomposition;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.
*/

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число ");
        int one = scanner.nextInt();
        System.out.println("Введите второе число ");
        int two = scanner.nextInt();
        System.out.println("Введите третье число ");
        int three = scanner.nextInt();
        System.out.println("Введите четвертое число ");
        int four = scanner.nextInt();

        int[] array = {one, two, three, four};

        int gdc = array[0];
        for (int i = 0; i < array.length-1; i++) {
            gdc = greatestCommonDivisor(gdc,array[i]);
        }

        System.out.println("Наибольшее общее кратное четырёх чисел " + Math.abs(gdc));
    }

    private static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int greatestCommonDivisor = 0;
        while (secondNumber != 0) {
            greatestCommonDivisor = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = greatestCommonDivisor;
        }
        return greatestCommonDivisor;
    }
}
