package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Задана матрица неотрицательных чисел.
Посчитать сумму элементов в каждом столбце. Определить, какой столбец содержит максимальную сумму.
*/

public class Task9 {
    public static void main(String[] args) {
        int summ = 0;
        int max = 0;
        int numerRow = 0;
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        System.out.println("Матрица до перемещение: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array[i].length; i++) {
            for (int j = 0; j < array.length; j++) {
                summ += array[j][i];
            }
            if (summ > max) {
                max = summ;
                numerRow = i;
            }
            summ = 0;
        }
        System.out.println("Максимальная сумма в столбце равна " + max + " в столбце " + (numerRow + 1));
    }
}