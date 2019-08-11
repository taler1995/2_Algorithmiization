package by.epam.decomposition;

import java.util.Scanner;

/*
Найти все натуральные n-значные числа, цифры в которых образуют строго возрастающую последовательность (например, 1234, 5789).
Для решения задачи использовать декомпозицию.
*/

public class Task15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите K: ");
        int k = scanner.nextInt();
        System.out.println("Числа с возрастающей поверхностью на отрезке от 1 до " + k);
        armstrongNumbers(k);
    }

    private static void armstrongNumbers(int k) {
        for (int i = 10; i < k; i++) {
            boolean check = true;
            int buffer = i;
            int increasingNumber = 0;
            while (buffer > 0 && check) {
                int number = buffer % 10;
                buffer /= 10;
                int secondNumber = buffer % 10;
                if (number == secondNumber + 1 && secondNumber !=0) {
                    continue;
                } else {
                    check = false;
                }
                if (buffer == 0) {
                    increasingNumber = i;
                    System.out.println(increasingNumber);
                }
            }
        }
    }
}

