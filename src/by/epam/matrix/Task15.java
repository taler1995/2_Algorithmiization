package by.epam.matrix;

import java.util.Arrays;

/*
Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.
*/

public class Task15 {
    public static void main(String[] args) {
        int max = 0;
        int[][] array = new int[(int) (Math.random() * 10)][(int) (Math.random() * 10)];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }

        System.out.println("Матрица до замены на максимальное число: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] % 2 != 0) {
                    array[i][j] = max;
                }
            }
        }

        System.out.println("Матрица после замены нечетных чисел на максимальное число: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
