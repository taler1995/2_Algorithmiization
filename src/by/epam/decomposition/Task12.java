package by.epam.decomposition;

import java.util.Arrays;
import java.util.Scanner;

/*
Даны натуральные числа К и N. Написать метод(методы) формирования массива А,
элементами которого являются числа, сумма цифр которых равна К и которые не большее N.
*/

public class Task12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int arraySize = scanner.nextInt();
        System.out.println("Введите K: ");
        int numbersSumm = scanner.nextInt();
        System.out.println("Введите N: ");
        int maxValue = scanner.nextInt();

        System.out.println(Arrays.toString(arrayMaker(arraySize, numbersSumm, maxValue)));
    }

    public static int[] arrayMaker(int arraySize, int sumNumbers, int maxValue) {
        int[] array = new int[arraySize];

        for (int i = 0; i < array.length; i++) {
            int cheakSum = 0;
            array[i] = (int) (Math.random() * maxValue);
            int cheakNum = array[i];
            while (cheakNum > 0) {
                cheakSum += cheakNum % 10;
                cheakNum /= 10;
            }
            if (cheakSum != sumNumbers) {
                i--;
            }
        }
        return array;
    }
}
