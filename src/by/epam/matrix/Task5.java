package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
*/

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число (размерность массива): ");
        int massive = scanner.nextInt();
        int[][] array = new int[massive][massive];
        int b = 1;
        for (int i = 0; i < array.length; i++, massive--, b++) {
            for (int j = 0; j < massive; j++) {
                array[i][j] = b;
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}
