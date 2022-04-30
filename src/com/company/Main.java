package com.company;


import com.company.classes.RightTriangle;
import com.company.classes.Triangle;
import com.company.classes.Triangles;

/**
 * Lefter Olexiy, 18
 */
public class Main {
    /**
     * Создать класс треугольник, члены класса – координаты 3-х точек.
     * Предусмотреть в классе методы проверки существования треугольника, вычисления и вывода сведений о фигуре – длины сторон,
     * углы, периметр, площадь. Создать производный класс – прямоугольный треугольник, предусмотреть в классе проверку,
     * является ли треугольник прямоугольным. Написать программу,
     * демонстрирующую работу с классом: дано N треугольников и M прямоугольных треугольников,
     * найти треугольники с максимальной иS минимальной площадью и вывести номера одинаковых прямоугольных треугольников.
     */
    public static void main(String[] args) {
        final int MAX_SIDE_SIZE = 100;
        final int N = 10;
        final int M = 10;

        Triangles triangles = new Triangles(N);
        int tempX1;
        int tempY1;
        int tempX2;
        int tempY2;
        int tempX3;
        int tempY3;
        for (int i = 0; i < N; i++) {
            while (!Triangle.isExistTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
            }
            Triangle triangle = new Triangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3);
            triangles.addTriangle(triangle);
        }
        System.out.println(triangles);

        Triangles rightTriangles = new Triangles(M + 4);
        for (int i = 0; i < M; i++) {
            while (!RightTriangle.isRightTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
            }
            RightTriangle rightTriangle = new RightTriangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3);
            rightTriangles.addTriangle(rightTriangle);
        }
        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));

        System.out.println(rightTriangles);
        System.out.println("-----------------------------------");
        System.out.println("\nMax of Triangles:");
        System.out.println(triangles.findMaxSquareTriangle());
        System.out.println("\nMax of Right Triangles:");
        System.out.println(rightTriangles.findMaxSquareTriangle());
        System.out.println("\nMin of Triangles:");
        System.out.println(triangles.findMinSquareTriangle());
        System.out.println("\nMin of Right Triangles:");
        System.out.println(rightTriangles.findMinSquareTriangle());
        System.out.println("\nNumbers of same Right Triangles:");
        System.out.println(rightTriangles.findSameTriangles());
    }

}
