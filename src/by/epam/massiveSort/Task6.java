package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
Делается это следующим образом: сравниваются два соседних элемента ai и ai+1 .
Если ai > ai+1 , то продвигаются на один элемент вперед. Если ai > ai+1 , то производится перестановка и сдвигаются на один элемент назад.
Составить алгоритм этой сортировки.
*/

public class Task6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите размер масива: ");
        int massive = scanner.nextInt();
        int[] array = new int[massive];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (1 + Math.random() * 100);
        }
        System.out.println("Массив до сортировки " + Arrays.toString(array));

        int h = 1;
        while (h*3 < array.length) {
            h =h*3 +1;
        }
        while (h>=1) {
            for (int  i = h; i < array.length; i++) {
                for (int j = i; j>=h;j=j-h) {
                    if (array[j] < array[j-h]) {
                        int temp = array[j];
                        array[j]= array[j-h];
                        array[j-h] = temp;
                    }
                    else {
                        break;
                    }
                }
            }
            h = h/3;
        }
        System.out.println("Массив после сортировки: " + Arrays.toString(array));
    }
}
