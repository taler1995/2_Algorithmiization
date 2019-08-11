package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число (размерность массива): ");
        int massive = scanner.nextInt();
        int[][] array = new int[massive][massive];
        for (int i = 0; i < array.length; i++, massive--) {
            if (i < (array.length) / 2) {
                for (int j = i; j < massive; j++) {
                    array[i][j] = 1;
                }
            } else {
                for (int j = array.length - i - 1; j <= i; j++) {
                    array[i][j] = 1;
                }
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}

