package by.epam.matrix;

import java.util.Arrays;

/*
Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.
*/

public class Task1 {
    public static void main(String[] args) {

        int[][] array = new int[5][5];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        System.out.println("Итог: ");
        for (int i = 1; i < array.length; i +=2) {
            if (array[0][i] > array[array.length - 1][i]) {
                System.out.println("Столбец: " + i);
                for (int j = 0; j < array[i].length; j++) {
                    System.out.print(array[j][i] + "\t");
                }
                System.out.println();
            }
        }
    }
}
