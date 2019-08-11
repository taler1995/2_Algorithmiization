package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Сформировать квадратную матрицу порядка N по правилу:
A[I,J] = sin((I^2-J^2)/N) и подсчитать количество положительных элементов в ней.
*/

public class Task7 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое положительное число (размерность массива): ");
        int massive = scanner.nextInt();
        double[][] array = new double[massive][massive];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = Math.sin(Math.pow(i, 2) - Math.pow(j, 2) / massive);
            }
        }
        System.out.println("Матрица: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    counter++;
                }
            }
        }
        System.out.println(counter);
    }
}
