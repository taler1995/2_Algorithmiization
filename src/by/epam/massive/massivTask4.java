package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.
*/

public class massivTask4 {
    public static void main(String[] args) {
        System.out.println("Введие длинну массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 200);
        }
        System.out.println("Массив до преобразования: " + Arrays.toString(array));
        int max = 0;
        int min = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            } else if (array[i] < min) {
                min = array[i];
            }
        }
        System.out.println("Минимальное число = " + min + "\nМаксимальное число = " + max);

        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                array[i] = min;
            } else if (array[i] == min) {
                array[i] = max;
            }
        }

        System.out.println("Массив после преобразования: " + Arrays.toString(array));
    }
}

