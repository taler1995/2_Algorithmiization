package by.epam.decomposition;

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.*;

/*
На плоскости заданы своими координатами n точек.
Написать метод(методы), определяющие, между какими из пар точек самое большое расстояние.
Указание. Координаты точек занести в массив.
*/

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество точек: ");
        int number = scanner.nextInt();
        int[][] dots = new int[number][2];
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots[i].length; j++) {
                dots[i][j] = (int) (1 + Math.random() * 15);
            }
        }

        for (int i = 0; i < dots.length; i++) {
            System.out.println(Arrays.toString(dots[i]));
        }

        int[] betweenDots = maxLenght(dots);
        int[][] finalDots = new int[2][2];
        for (int i = 0; i < betweenDots.length; i++) {
            for (int j = 0; j < betweenDots.length; j++) {
                finalDots[i][j] = dots[betweenDots[i]][j];
            }
        }
        System.out.println("Максимальное расстояние: ");
        for (int i = 0; i < dots.length; i++) {
            System.out.println(Arrays.toString(finalDots[i]));
        }
    }

    public static int[] maxLenght(int[][] dots) {
        double maxLenght = 0;
        double sigmentLnght = 0;
        int[] betweenDots = new int[2];
        for (int i = 0; i < dots.length; i++) {
            for (int j = 0; j < dots.length; j++) {
                sigmentLnght = sqrt(pow(dots[i][0] - dots[j][0], 2)) + pow(dots[i][1] - dots[j][1], 2);
                if (sigmentLnght > maxLenght) {
                    maxLenght = sigmentLnght;
                    betweenDots[0] = i + 1;
                    betweenDots[1] = j + 1;
                }
            }
        }
        return betweenDots;
    }
}
