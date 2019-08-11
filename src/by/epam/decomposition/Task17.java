package by.epam.decomposition;

import java.util.Scanner;

/*
Из заданного числа вычли сумму его цифр.
Из результата вновь вычли сумму его цифр и т.д.
Сколько таких действий надо произвести, чтобы получился нуль?
Для решения задачи использовать декомпозицию.
*/

public class Task17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        System.out.println(countOfIteration(number,sumOfNumber(number)));

    }

    private static int countOfIteration(int number, int summ) {
        int count = 0;
        while (number > 0) {
            number -= summ;
            count++;
        }
        return count;
    }

    private static int sumOfNumber(int number) {
        int summ = 0;
        while (number > 0) {
            summ += number % 10;
            number /=10;
        }
        return summ;
    }
}
