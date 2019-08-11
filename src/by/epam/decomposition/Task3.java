package by.epam.decomposition;

import java.util.Scanner;

import static java.lang.Math.*;

/*
Вычислить площадь правильного шестиугольника со стороной а,
используя метод вычисления площади треугольника.
*/

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длинну стороны: ");
        int hexagonSide = scanner.nextInt();

        double hexagoneArea = 6 * equilateralTriangleArea(hexagonSide);
        System.out.println("Площадь шестиугольника равна: " + hexagoneArea);
    }

    public static double equilateralTriangleArea(int hexagonSide) {
        double area = (sqrt(3) / 4) * pow(hexagonSide, 2);
        return area;
    }
}
