package by.epam.decomposition;

import java.util.Scanner;

/*
Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного
двух натуральных чисел: (HOK(A,B)= A*B/НОД(A,B))
*/

public class Task1 {
    public static int greatestCommonDivisor(int firstNumber, int secondNumber) {
        int greatestCommonDivisor = 0;
        while (secondNumber != 0) {
            greatestCommonDivisor = secondNumber;
            secondNumber = firstNumber % secondNumber;
            firstNumber = greatestCommonDivisor;
        }
        return greatestCommonDivisor;
    }

    public static int leastCommonMultiple(int firstNumber, int secondNumber, int greatestCommonDivisor) {
        return firstNumber * secondNumber / greatestCommonDivisor;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int firstNum = scan.nextInt();
        System.out.println("Введите второе число: ");
        int secondNum = scan.nextInt();

        int greatestCommonDivisor = greatestCommonDivisor(firstNum, secondNum);
        int leastCommonMultiple = leastCommonMultiple(firstNum, secondNum, greatestCommonDivisor);
        System.out.println("Наименьшее общее кратное " + firstNum + " и " + secondNum + " - " + leastCommonMultiple + ".\nНаибольший общий делитель " + greatestCommonDivisor);
    }
}
