package by.epam.matrix;

import java.util.Arrays;
import java.util.Scanner;

/*
В числовой матрице поменять местами два столбца любых столбца, т. е. все элементы одного столбца поставить на соответствующие им позиции другого, а его элементы второго переместить в первый.
Номера столбцов вводит пользователь с клавиатуры.
*/

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] array = new int[5][4];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) (1 + Math.random() * 10);
            }
        }
        System.out.println("Матрица до перемещения: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }

        System.out.println("Введите первый заменяемый столбец: ");
        int firstColumn = scanner.nextInt();
        System.out.println("Введите второй заменяемый столбец: ");
        int secondColumn = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            int temp = array[i][firstColumn];
            array[i][firstColumn] = array[i][secondColumn];
            array[i][secondColumn] = temp;
        }
        System.out.println("Матрица после перемещение: ");
        for (int i = 0; i < array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}