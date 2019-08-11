package by.epam.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
Два простых числа называются «близнецами», если они отличаются друг от друга на 2 (например, 41 и 43).
Найти и напечатать все пары «близнецов» из отрезка [n,2n],
где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.
*/

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите начальное число: ");
        int startNumber = scanner.nextInt();
        int[] array = arrayMaker(startNumber);
        System.out.println("Получаем отрезое от  " + startNumber + " до " + (startNumber * 2) + " вида : \n" + Arrays.toString(array));
        int[][] twins = twinsMaker(array);
        System.out.println("\nВсе числа \"близнецы\" на данном отрезке : ");
        for (int[] pairs : twins) {
            System.out.print(Arrays.toString(pairs));
        }
    }

    public static int[] arrayMaker(int startNumber) {
        int[] array = new int[startNumber + 1];
        for (int i = 0; i < array.length; i++, startNumber++) {
            array[i] = startNumber;
        }
        return array;
    }

    public static int[][] twinsMaker(int[] section) {
        int[][] twins = new int[section.length - 2][2];

        for (int i = 0; i < section.length; i++) {
            for (int j = 1; j < section.length; j++) {
                if (section[i] + 2 == section[j]) {
                    twins[i][0] = section[i];
                    twins[i][1] = section[j];

                    break;
                }
            }
        }
        return twins;
    }
}
