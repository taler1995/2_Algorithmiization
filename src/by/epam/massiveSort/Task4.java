package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Сортировка обменами. Дана последовательность чисел a1<a2<an.
Требуется переставить числа в порядке возрастания.
Для этого сравниваются два соседних числа ai и ai+1 . Если ai > ai+1, то делается перестановка.
Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
Составить алгоритм сортировки, подсчитывая при этом количества перестановок.
*/

public class Task4 {
    public static void main(String[] args) {
        int changes = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер масива: ");
        int massive = scanner.nextInt();
        int[] array = new int[massive];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }

        System.out.println("Массив до сортировки: " + Arrays.toString(array));
        boolean isSorted = false;
        while (!isSorted) {
            isSorted = true;
            for (int j = 0; j < array.length-1; j++) {
                if (array[j] > array[j+1]) {
                    isSorted = false;
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j + 1] = temp;
                    changes++;

                }
            }
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
        System.out.println("Количество перестановок: " + changes);
    }
}
