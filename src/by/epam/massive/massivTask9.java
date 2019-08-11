package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число.
Если таких чисел несколько, то определить наименьшее из них.
*/

public class massivTask9 {
    public static void main(String[] args) {
        int counter = 0;
        int max = 0;
        int repeatNumber = 0;
        System.out.println("Введие длинну массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1+ Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            if (counter > max) {
                max = counter;
                repeatNumber = array[i];
            }
            if (counter == max) {
                if (repeatNumber > array[i]) {
                    repeatNumber = array[i];
                }
            }
        }
        System.out.println("Минимальное число " + repeatNumber + " его количество повторений " + max);
    }
}
