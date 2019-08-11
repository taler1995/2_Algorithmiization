package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
Найти положительные элементы главной диагонали квадратной матрицы.
*/

public class Task10 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите целое положительное число (размерность массива): ");

        int matrixSize = scan.nextInt();

        int [][] matrix = new int[matrixSize][matrixSize];
        for (int i = 0; i < matrix.length; i++ ){
            for (int j = 0; j < matrix[i].length; j++ ){
                matrix[i][j] = (int) (Math.random()*20 - 10);
            }
        }

        System.out.println("Матрица: ");
        for (int i = 0; i < matrix.length; i++){
            System.out.println(Arrays.toString(matrix[i]));
        }

        System.out.println("Положительные элементы в главной диагонали: ");
        for (int i = 0, j = 0; i < matrix.length; i++, j++) {
            if (matrix[i][j] > 0) {
                System.out.print(matrix[i][j] + ", ");
            }
        }
    }
}
