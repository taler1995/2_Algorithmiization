package by.epam.massiveSort;

/*
Пусть даны две неубывающие последовательности действительных чисел a<a2<...<an и b1<b2<...<bm.
Требуется указать те места, на которые нужно вставлять элементы последовательности b1<b2<...<bm в первую последовательность так, чтобы новая последовательность оставалась возрастающей.
*/

public class Task7 {
    public static void main(String[] args) {
        int[] array1 = {1, 3, 4, 5, 8, 9, 11, 21};
        int[] array2 = {2, 3, 6, 7, 9, 13, 22, 25, 38};

        int i = 0;
        int j = 0;
        while (i < array1.length || j < array2.length) {
            if (i < array1.length && j < array2.length) {
                if (array1[i] > array2[j]) {
                    System.out.println("Вставить b[" + j + "]" + " после a[" + i + "]");
                    if (j < array2.length) {
                        j++;
                    }
                } else {
                    if (i < array1.length) {
                        i++;
                    }
                }
            } else if (j < array2.length) {
                System.out.println("Вставить b[" + j + "] - b[" + (array2.length - 1) + "] после последнего элемента A");
                break;
            } else {
                break;
            }
        }

    }
}

