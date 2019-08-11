package by.epam.decomposition;

import java.util.Scanner;

import static java.lang.Math.pow;

/*
Натуральное число, в записи которого n цифр, называется числом Армстронга, если сумма его цифр, возведенная в степень n, равна самому числу.
Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.
*/

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите K: ");
        int k = scanner.nextInt();
        System.out.println("Числа Армстронга на отрезке от 1 до " + k);
        armstrongNumbers(k);
    }

    private static void armstrongNumbers(int k) {
        for (int i = 1; i < k; i++) {
            int buffer = i;
            int armstrongNumber = 0;
            while (buffer > 0) {
                int number = buffer % 10;
                buffer /= 10;
                armstrongNumber += pow(number , counter(i));
            }
            if (i == armstrongNumber) {
                armstrongNumber = i;
            }
            else {
                continue;
            }
            System.out.println(armstrongNumber);
        }
    }

    private static int counter(int k) {
        int counter = 0;
            int counterNumber = k;
            while (counterNumber > 0) {
                counterNumber /= 10;
                counter++;
            }
        return counter;
    }
}

