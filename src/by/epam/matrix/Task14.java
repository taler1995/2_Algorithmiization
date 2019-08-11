package by.epam.matrix;

import java.util.Arrays;

/*
Сформировать случайную матрицу m x n,
состоящую из нулей и единиц, причем в каждом столбце число единиц равно номеру столбца.
*/

public class Task14 {
    public static void main(String[] args) {
        int[][] array = new int[(int) (1 + Math.random() * 15)][(int) (1 + Math.random() * 15)];
        for (int i = 0; i < array.length; i++) {
            for (int j = i; j < array[i].length; j++) {
                array[i][j] = 1;
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
