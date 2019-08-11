package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Дана матрица. Вывести k-ю строку и p-й столбец матрицы.
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
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

        System.out.println("\nКакой столбец матрицы вывеси?");
        int coloumn = scan.nextInt() - 1;
        System.out.println("Столбец №" + coloumn + ": ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i][coloumn] + ", ");
        }

        System.out.println("\nКакую строку вывести?");
        int line = scan.nextInt() - 1;
        System.out.print("Строка №" + line + ": ");
        for (int i = 0; i < array[line].length; i++) {
            System.out.print(array[line][i] + ", ");
        }
    }
}
