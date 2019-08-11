package by.epam.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
Задан массив D. Определить следующие суммы: D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
Пояснение. Составить метод(методы) для вычисления суммы трех последовательно расположенных
элементов массива с номерами от k до m.
*/

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int lenght = scanner.nextInt();
        int from;
        System.out.println("Введите число с какого числа массива счиатать сумму: ");

        while (true) {
            from = scanner.nextInt();
            if (from > lenght || from - 1 + 2 >= lenght) {
                System.out.println("Число за пределами массива.\nВведите новое число: ");
            } else {
                break;
            }
        }

        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 20);
        }
        System.out.println("Массив " + Arrays.toString(array));

        System.out.println("Сумма элементов с " + (from) + " до " + (from + 2) + " равна " + summOfThreElements(array, from));
    }

    private static int summOfThreElements(int[] array, int from) {
        int summ = 0;
        for (int i = from - 1; i <= from + 1; i++) {
            summ += array[i];
        }
        return summ;
    }
}
