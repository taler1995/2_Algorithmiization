package by.epam.decomposition;

/*
Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.
*/

public class Task7 {
    public static void main(String[] args) {
        System.out.println(sumOfFactorials());
    }

    public static int sumOfFactorials() {
        int sumOfFactorials = 0;
        for (int i = 1; i <=9 ; i++) {
            sumOfFactorials += factorial(i);
        }
        return sumOfFactorials;
    }

    public static int factorial(int number) {
        int result = 1;
        if (number == 1 || number == 0) {
            return result;
        }
        result = number * factorial(number-1);
        return result;
    }
}
