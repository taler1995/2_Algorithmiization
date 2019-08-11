package by.epam.decomposition;

import java.util.Scanner;

/*
Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.
*/

public class Task11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int one = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int two = scanner.nextInt();

        compareNumbers(one, two);
    }

    public static void compareNumbers(int one, int two) {
        int counterForOne = 0;
        int counterForTwo = 0;

        while (one > 0) {
            one /= 10;
            counterForOne++;
        }
        while (two > 0) {
            two /= 10;
            counterForTwo++;
        }

        if (counterForOne > counterForTwo) {
            System.out.println("Первое число имеют больше цифр.");
        }
        else if (counterForOne < counterForTwo) {
            System.out.println("Второе число имеют больше цифр.");
        }
        else {
            System.out.println("Числа имеют одинаковое количество цифр.");
        }
    }
}
