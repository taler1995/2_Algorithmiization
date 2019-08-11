package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Даны две последовательности a1<a2<an и b1<b2<bn.
Образовать из них новую последовательность чисел так, чтобы она тоже была неубывающей.
Примечание. Дополнительный массив не использовать.
*/

public class Task2 {
    public static void main(String[] args) {
        //Пример 1
        /*int[] array1 = new int[]{2, 4, 6, 10, 12, 18, 20, 28, 32, 34};
        int[] array2 = new int[]{1, 3, 9, 11, 13, 15, 27, 29, 37, 43};
*/
        //Пример 2
        int[] array1 = new int[]{2, 4, 6, 10, 12, 18, 20, 28, 44, 48};
        int[] array2 = new int[]{1, 3, 9, 11, 13, 15, 27, 29, 37, 43};

        System.out.println("Последовательность 1: " + Arrays.toString(array1));
        System.out.println("Последовательность 2: " + Arrays.toString(array2));


        System.out.println("Новая последовательность: ");
        int i = 0;
        int j = 0;
        while (i <= array1.length && j <= array2.length) {
            if (i < array1.length && j < array2.length) {
                if (array1[i] < array2[j]) {
                    System.out.print(array1[i] + " ");
                    i++;
                } else {
                    System.out.print(array2[j] + " ");
                    j++;
                }
            } else if (i <= array1.length && j >= array2.length) {
                System.out.print(array1[i] + " ");
                i++;
            } else if (i >= array1.length && j <= array2.length) {
                System.out.print(array2[j] + " ");
                j++;
            }
        }
    }
}

