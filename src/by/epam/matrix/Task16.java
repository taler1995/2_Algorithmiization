package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3, ...,n2 так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между собой.
Построить такой квадрат. Пример магического квадрата порядка 3:
6 1 8
7 5 3
2 9 4
*/

public class Task16 {
    static int counter = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int columns;
        System.out.print("Введите кол-во столбцов:\n> ");
        columns = sc.nextInt();

        int[][] array = new int[columns][columns];
        int[] array2 = new int[columns * columns];

        int start = 1;
        for (int i = 0; i < array2.length; i++) {
            array2[i] = start++;
        }
        int magicNumber = (int) ((array.length * (Math.pow(array.length, 2) + 1)) / 2);

        permute(array2, 0, magicNumber);

    }
    public static void permute(int[] intArray, int start, int magicNumber) {
        // Сортировка массива
        for (int i = start; i < intArray.length; i++) {
            int temp = intArray[start];
            intArray[start] = intArray[i];
            intArray[i] = temp;
            permute(intArray, start + 1, magicNumber);
            intArray[i] = intArray[start];
            intArray[start] = temp;
        }
        // Проверка на магический квадрат
        if (start == intArray.length - 1) {
            boolean check = true;
            int sumString = 0;
            int count = 0;
            int sumColumn = 0;
            int sumFirstDiagonal = 0;
            int sumSecondDiagonal = 0;
            int[][] matrix = new int[(int) Math.sqrt(intArray.length)][(int) Math.sqrt(intArray.length)];
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    matrix[i][j] = intArray[count++];
                }
            }
            for (int i = 0; i < matrix.length; i++) {
                for (int j = 0; j < matrix[i].length; j++) {
                    sumString += matrix[i][j];
                    sumColumn += matrix[j][i];
                }
                if (sumString != magicNumber || sumColumn != magicNumber) {
                    check = false;
                } else {
                    sumColumn = sumString = 0;
                }
                sumFirstDiagonal += matrix[i][i];

            }
            for (int i = matrix.length - 1, j = 0; i >= 0; i--, j++) {
                sumSecondDiagonal += matrix[j][i];
            }
            if (check == true && sumFirstDiagonal == magicNumber && sumSecondDiagonal == magicNumber) {
                counter++;
                System.out.println("Магический квадрат " + counter);
                for (int i = 0; i < matrix.length; i++) {
                    System.out.println(Arrays.toString(matrix[i]));
                }
            }
        }
    }
}
