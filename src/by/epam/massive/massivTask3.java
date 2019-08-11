package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
Дан массив действительных чисел, размерность которого N.
Подсчитать, сколько в нем отрицательных, положительных и нулевых элементов.
 */

public class massivTask3 {
    public static void main(String[] args) {
        int pluses = 0;
        int minuses = 0;
        int zeros = 0;
        System.out.println("Задайте длинну массива: ");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) ((Math.random() - 0.5) * 200);
        }
        System.out.println("Your array has view: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0) {
                pluses++;
            } else if (array[i] < 0) {
                minuses++;
            } else {
                zeros++;
            }
        }
        System.out.println("Положительных: " + pluses + "\nОтрицательных: " + minuses + "\nНулей: " + zeros);
    }
}
