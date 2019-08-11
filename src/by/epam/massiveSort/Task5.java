package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Сортировка вставками. Дана последовательность чисел a1,a2,...an.
Требуется переставить числа в порядке возрастания.
Делается это следующим образом. Пусть a1,a2,...ai - упорядоченная последовательность, т. е. a1<a2<...<an.
Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая последовательность была тоже возрастающей.
Процесс производится до тех пор, пока все элементы от i +1 до n не будут перебраны.
Примечание. Место помещения очередного элемента в отсортированную часть производить с помощью двоичного поиска.
Двоичный поиск оформить в виде отдельной функции.
*/

public class Task5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер масива: ");
        int massive = scanner.nextInt();
        int[] array = new int[massive];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println("Массив до сортировки " + Arrays.toString(array));
        search(array);

        for (int i = 0; i < array.length; i++) {
            int value = array[i];
            int j = i - 1;
            for (; j >= 0; j--) {
                if (value < array[j]) {
                    array[j + 1] = array[j];
                } else {
                    break;
                }
            }
            array[j + 1] = value;
        }

        System.out.println("Массив после сортировки " + Arrays.toString(array));
    }

    static void search(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int location = i - 1;
            int insertPlace;

            if (arr[location] > arr[i]) {
                int tmp = arr[i];
                insertPlace = Arrays.binarySearch(arr, 0, location, arr[i]);
                if (insertPlace < 0) {
                    System.arraycopy(arr, ~insertPlace, arr, ~insertPlace + 1, i - ~insertPlace);
                    arr[~insertPlace] = tmp;
                } else {
                    System.arraycopy(arr, insertPlace, arr, insertPlace + 1, i - insertPlace);
                    arr[insertPlace] = tmp;
                }
            }
        }
        System.out.println("Массив после сортировки " + Arrays.toString(arr));
    }
}

