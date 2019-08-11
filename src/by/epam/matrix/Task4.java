package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/

public class Task4 {
    public static void main(String[] args) {
        int massive = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число (размерность массива): ");
        boolean check = false;

        while (!check) {
            massive = scanner.nextInt();
            if (massive > 0 && massive % 2 == 0) {
                check = true;
            } else {
                System.out.println("Введите коректное число: ");
            }
        }

        int[][] array = new int[massive][massive];
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = j + 1;
                }
            } else {
                for (int j = 0; j < array[i].length; j++) {
                    array[i][j] = array.length-j;
                }
            }
        }
        System.out.println("Матрица: ");
        for ( int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
