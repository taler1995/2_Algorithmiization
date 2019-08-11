package by.epam.massive;

import java.util.Arrays;
import java.util.Scanner;

/*
Дана последовательность целых чисел a ,a2, ,an.
Образовать новую последовательность, выбросив из исходной те члены, которые равны min(a1,a2,K,an).
*/

public class massivTask8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Задайте размер  последовательности:");
        int size = scan.nextInt();

        int[] array = new int[size];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10 + 1);
        }
        System.out.println("Массив имеет вид:" + Arrays.toString(array));

        int minValue = array[0];

        for (int i = 0; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("минимальное значение в нашей последовательности: " + minValue);

        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == minValue) {
                count++;
            }
        }

        int newArray[] = new int[size - count];
        int j = 0;   //для итерации нового массива
        for (int i = 0; i < array.length; i++) {
            if (array[i] != minValue) {
                newArray[j] = array[i];
                j++;
            }
        }
        System.out.println("Новый массив имеет вид: " + Arrays.toString(newArray) + " \nДлинна новой последовательности " + newArray.length);
    }
}

