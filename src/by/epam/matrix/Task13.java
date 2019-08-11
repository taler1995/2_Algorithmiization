package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.
*/

public class Task13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер матрицы: ");
        int matrix = scanner.nextInt();
        int[][] array = new int[matrix][matrix];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        System.out.println("Матрица до сортировки: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[j][i] > array[j + 1][i]) {
                        isSorted = false;
                        int temp = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = temp;
                    }
                }
            }
        }
        System.out.println("Строки отсортированные по возрастанию : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            boolean isSorted = false;
            while (!isSorted) {
                isSorted = true;
                for (int j = 0; j < array[i].length - 1; j++) {
                    if (array[j][i] < array[j + 1][i]) {
                        isSorted = false;
                        int temp = array[j][i];
                        array[j][i] = array[j + 1][i];
                        array[j + 1][i] = temp;
                    }
                }
            }
        }
        System.out.println("Строки отсортированные по убыванию : ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
