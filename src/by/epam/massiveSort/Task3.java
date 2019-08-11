package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Сортировка выбором. Дана последовательность чисел a1<a2<an.
Требуется переставить элементы так, чтобы они были расположены по убыванию.
Для этого в массиве, начиная с первого, выбирается наибольший элемент и ставится на первое место, а первый - на место наибольшего.
Затем, начиная со второго, эта процедура повторяется. Написать алгоритм сортировки выбором.
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int massive = scanner.nextInt();
        int[] array = new int[massive];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }

        System.out.println("Массив до сортировки: " + Arrays.toString(array));

        for (int i = 0; i < array.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min]) {
                    min = j;
                }
            }
            int tmp = array[i];
            array[i] = array[min];
            array[min] = tmp;
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}
