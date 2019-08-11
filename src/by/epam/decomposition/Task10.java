package by.epam.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
Дано натуральное число N.
Написать метод(методы) для формирования массива, элементами которого являются цифры числа N.
*/

public class Task10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите натуральное число: ");
        int number = scanner.nextInt();

        System.out.println(Arrays.toString(arrayConverter(number)));

    }

    public static int[] arrayConverter(int number) {
        int counter = 0;
        int numberforCount = number;

        while (numberforCount > 0) {
            numberforCount /= 10;
            counter++;
        }

        int[] array = new int[counter];
        for (int i = array.length-1; i >= 0; i--) {
            array[i] = number % 10;
            number /= 10;
        }
        return array;
    }
}
