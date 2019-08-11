package by.epam.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
Составить программу, которая в массиве A[N] находит второе по величине число
(вывести на печать число, которое меньше максимального элемента массива,
но больше всех других элементов).
*/

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну массива: ");
        int lenght = scanner.nextInt();

        int[] array = new int[lenght];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 15);
        }

        System.out.println(Arrays.toString(array));
        System.out.println("Второе по величине число: " + secondMaxValue(array));
    }

    public static int secondMaxValue(int[] array) {
        int secondValue = 0;
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }

        for (int i = 0; i < array.length; i++) {
            if (array[i] > secondValue && array[i] < maxValue) {
                secondValue = array[i];
            }
        }
        return secondValue;
    }
}
