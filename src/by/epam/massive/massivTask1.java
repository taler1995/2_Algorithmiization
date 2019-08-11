package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
В массив A[N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному K.
*/

public class massivTask1 {
    public static void main(String[] args) {
        int summ = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размер массива:");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];


        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (1 + Math.random() * 200);
            array[i] = randomNumber;
        }

        System.out.println("Массив: " + Arrays.toString(array));
        System.out.println("Введите число K: ");
        int k = input.nextInt();
        System.out.println("Числа которые кратны " + k + ":");

        for (int i = 0; i < array.length; i++) {
            if (array[i] % k == 0) {
                summ += array[i];
                System.out.print(array[i] + "; ");
            }
        }
        System.out.println("\nСумма чисел кратных " + k + " равна " + summ);
    }
}
