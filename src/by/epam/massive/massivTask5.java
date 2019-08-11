package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.
*/

public class massivTask5 {
    public static void main(String[] args) {
        System.out.println("Введие длинну массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * size);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > i) {
                System.out.print(array[i] + " ");
            }
        }
    }
}
