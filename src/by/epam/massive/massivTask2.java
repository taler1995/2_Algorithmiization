package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
Дана последовательность действительных чисел a1,a2...an. Заменить, все её члены, большие данного Z,
этим числом. Подсчитать количество замен.
 */

public class massivTask2 {
    public static void main(String[] args) {
        int counter = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Задайте размер массива:");
        int arraySize = input.nextInt();
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            int randomNumber = (int) (1 + Math.random() * 200);
            array[i] = randomNumber;
        }
        System.out.println("Массив до преобразования: " + Arrays.toString(array));
        System.out.println("Задайте число Z:");

        int z = input.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= z) {
                array[i] = z;
                counter++;
            }
        }
        System.out.println("Количество заменнёных элементов: " + counter);
        System.out.println("Массив после преобразования: " + Arrays.toString(array));
    }
}
