package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Заданы два одномерных массива с различным количеством элементов и натуральное число k.
Объединить их в один массив, включив второй массив между k-м и (k+1) - м элементами первого,
при этом не используя дополнительный массив.
*/

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите длинну первого массива: ");
        int massive1 = scanner.nextInt();
        System.out.println("Введите длинну второго массива: ");
        int massive2 = scanner.nextInt();

        //Первый способ

       /* int massive2 = scanner.nextInt();
        int[] array1 = new int[massive1];
        int[] array2 = new int[massive2];
        System.out.println("Введите число K: ");
        int K = scanner.nextInt();

        for (int i = 0; i < array1.length; i++) {
            array1[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 20);
        }

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        System.out.println("Итоговая последовательность: ");
        int i = 0;
        int j = 0;
        for (; i < array1.length; i++) {
            if (i+1 <= K || j == array2.length) {
                System.out.print(array1[i] + " ");
            } else {
                for (; j < array2.length; j++) {
                    System.out.print(array2[j] + " ");
                }
            }
        }*/

        //Второй способ
        int[] array1 = new int[massive1 + massive2];
        int[] array2 = new int[massive2];
        System.out.println("Введите число K: ");
        int K = scanner.nextInt();

        for (int i = 0; i < massive1; i++) {
            array1[i] = (int) (Math.random() * 20);
        }
        for (int i = 0; i < array2.length; i++) {
            array2[i] = (int) (Math.random() * 20);
        }

        System.out.println("Первый массив: " + Arrays.toString(array1));
        System.out.println("Второй массив: " + Arrays.toString(array2));

        int i = 0;
        int j = 0;
        for (; i < array1.length; i++) {
            if (i + 1 <= K || j == array2.length) {
                array1[i + j] = array1[i];
            } else {
                int secondI = i;
                for (int a = i + massive2; secondI < massive1; secondI++, a++) {
                    array1[a] = array1[secondI];
                }
                for (; j < array2.length; j++) {
                    array1[i + j] = array2[j];
                }
                break;
            }
        }
        System.out.println("Итоговая последовательность: " + Arrays.toString(array1));
    }
}

