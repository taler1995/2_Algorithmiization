package by.epam.matrix;

import java.util.Arrays;

/*
Матрицу 10x20 заполнить случайными числами от 0 до 15.
Вывести на экран саму матрицу и номера строк, в которых число 5 встречается три и более раз.
*/

public class Task11 {
    public static void main(String[] args) {
        int counter = 0;
        int[][] array = new int[15][20];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (Math.random() * 15);
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            counter = 0;
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 5) {
                    counter++;
                }
            }
            if (counter >= 3) {
                System.out.println("Строка " + (i+1));
            }
        }
    }
}
