package by.epam.decomposition;

import java.util.Scanner;

import static java.lang.Math.*;

/*
Даны числа X, Y, Z, Т — длины сторон четырехугольника.
Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.
*/

public class Task9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x, y, z, t;
        while (true) {
            System.out.println("Введите первое число ");
            x = scanner.nextInt();
            System.out.println("Введите второе число ");
            y = scanner.nextInt();
            System.out.println("Введите третье число ");
            z = scanner.nextInt();
            System.out.println("Введите третье число ");
            t = scanner.nextInt();
            if (x > y + z + t || y > x + z + t || z > x + y + t || t > x + y + z) {
                System.out.println("Такого квадрата не сущестыует: ");
            } else {
                break;
            }
        }
        System.out.println(square(x, y, z, t));
        square1(x, y, z, t);
        System.out.println(square2(x, y, z, t));
    }


    public static void square1(int sideOne, int sideTwo, int sideThree, int sideFour) {
        double squareFirstTriangle = sideOne * sideTwo / 2;
        double hepotinuza = Math.sqrt(pow(sideOne, 2) + pow(sideTwo, 2));

        double halfPerimetrOfSecondTriangle = (hepotinuza + sideThree + sideFour) / 2;
        double squareOfSecondTriangle;

        if (sideThree + sideFour > hepotinuza && hepotinuza + sideThree >= sideFour && hepotinuza + sideFour >= sideThree) {
            squareOfSecondTriangle = Math.sqrt(halfPerimetrOfSecondTriangle * (halfPerimetrOfSecondTriangle - hepotinuza) * (halfPerimetrOfSecondTriangle - sideThree) * (halfPerimetrOfSecondTriangle - sideFour));
        } else {
            System.out.println("Quadrilateral with sides like this does not exist.");
            squareOfSecondTriangle = squareFirstTriangle * (-1);
        }
        double square = squareFirstTriangle + squareOfSecondTriangle;
        System.out.println("square of quadrilateral is " + square);
    }

    public static double square(int sideOne, int sideTwo, int sideThree, int sideFour) {
        int p = (sideOne + sideTwo + sideThree + sideFour) / 2;
        double square = sqrt((p - sideOne) * (p - sideTwo) * (p - sideThree) * (p - sideFour));
        return square;
    }

    public static double square2(int sideOne, int sideTwo, int sideThree, int sideFour) {
        double squareFirstTriangle = sideOne * sideTwo / 2;
        double hepotinuza = sqrt(pow(sideOne, 2) + pow(sideTwo, 2));
        double gamma = acos((pow(sideThree, 2) + pow(sideFour, 2) - pow(hepotinuza, 2)) / (2 * sideThree * sideFour));
        int p = (sideOne + sideTwo + sideThree + sideFour) / 2;
        double square = sqrt((p - sideOne) * (p - sideTwo) * (p - sideThree) * (p - sideFour) - (sideOne * sideTwo * sideThree * sideFour * pow(cos((90 + gamma) / 2), 2)));
        return square;
    }
}

