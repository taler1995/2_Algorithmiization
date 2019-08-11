package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
Задана последовательность N вещественных чисел.
Вычислить сумму чисел, порядковые номера которых являются простыми числами.
*/

public class massivTask6 {
    public static void main(String[] args) {
        int summ = 0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте длинну массива: ");
        int size = scan.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Наш массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
            int cheak = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cheak += j;
                }
            }
            if (cheak < 2) {
                System.out.println("порядковый номер " + i + ", его значение " + array[i]); //убеждаемся что проверка на простые числа работает
                summ += array[i];
            }
        }
        System.out.println("Сумма элементов равна: " + summ);
    }
}
