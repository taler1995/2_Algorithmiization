package by.epam.matrix;

import java.util.Arrays;

/*
Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.
*/

public class Task2 {
    public static void main(String[] args) {
        int i = 0;
        int j = 0;
        int[][] array = new int[5][5];
        for (i = 0; i < array.length; i++) {
            for (j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        System.out.println("Матрица: ");
        for (i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Первая диагональ: ");
        for (i = 0, j = 0; i < array.length; i++, j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println("\nВторая диагональ: ");
        for (i = 0, j = (array.length - 1); i < array.length; i++, j--) {
            System.out.print(array[i][j] + " ");
        }
    }
}
