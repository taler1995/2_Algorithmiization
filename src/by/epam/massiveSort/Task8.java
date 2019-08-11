package by.epam.massiveSort;

import java.util.Arrays;
import java.util.Scanner;

/*
Даны дроби p1/q1,p2/q2,...,pn/qn (p , q - натуральные).
Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.
*/

public class Task8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество дробей:");
        int number = scanner.nextInt();

        int[] numenators = new int[number];
        int[] denumenators = new int[number];

        for (int i = 0; i < numenators.length; i++) {
            numenators[i] = (int) (1 + Math.random() * 10);
        }

        for (int i = 0; i < denumenators.length; i++) {
            denumenators[i] = (int) (1 + Math.random() * 10);
        }

        System.out.print("Дроби: ");
        for (int i = 0; i < numenators.length; i++) {
            System.out.print(numenators[i] + "/" + denumenators[i] + "; ");
        }

        int denumeratorAll = 1;
        for (int i = 0; i < denumenators.length - 1; i++) {
            boolean check =true;
            while (check) {
                if (denumeratorAll % denumenators[0] ==0 && denumeratorAll % denumenators[i+1] ==0) {
                    denumenators[0] = denumeratorAll;
                    check = false;
                }
                else {
                    denumeratorAll++;
                }
            }
        }

        for (int i = 0; i < denumenators.length; i++) {
            denumenators[i] = denumeratorAll;
        }

        for (int i = 0; i < numenators.length; i++) {
            numenators[i] = numenators[i] * denumeratorAll;
        }

        for (int i = 0; i < numenators.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < numenators.length; j++) {
                if (numenators[j] < numenators[min]) {
                    min = j;
                }
            }
            int tmp = numenators[i];
            numenators[i] = numenators[min];
            numenators[min] = tmp;
        }

        System.out.print("\nДроби с общим знаменателем: ");
        for (int i = 0; i < numenators.length; i++) {
            System.out.print(numenators[i] + "/" + denumenators[i] + "; ");
        }

        System.out.print("\nДроби после сортировки: ");
        for (int i = 0; i < numenators.length; i++) {
            System.out.print(numenators[i] + "/" + denumenators[i] + ", ");
        }
    }
}



