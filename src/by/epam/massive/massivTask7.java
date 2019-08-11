package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

public class massivTask7 {

/*
Даны действительные числа а1, ... , а2n, Найти max(a1 + a2n, ... an + an+1)
*/

    public static void main(String[] args) {
        int max = 0;
        int summ = 0;
        System.out.println("Введие длинну массива:");
        Scanner scanner = new Scanner(System.in);
        int size = scanner.nextInt();
        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        System.out.println("Массив: " + Arrays.toString(array));

        for (int i = 0; i < array.length; i++) {
           summ = array[i] + array[array.length - 1 - i];
           if (summ > max) {
               max = summ;
           }
        }
        System.out.println(max);
    }
}
