package com.company;


import com.company.classes.RightTriangle;
import com.company.classes.Triangle;
import com.company.classes.Triangles;
import com.company.classes.TrianglesList;

import java.util.ArrayList;

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
        final int M = 1;
        int tempX1;
        int tempY1;
        int tempX2;
        int tempY2;
        int tempX3;
        int tempY3;

//        Triangles triangles = new Triangles(N);
//        for (int i = 0; i < N; i++) {
//            while (!Triangle.isExistTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
//            }
//            triangles.addTriangle(new Triangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
//        }
//        System.out.println(triangles);
//
//        Triangles rightTriangles = new Triangles(M + 12);
//
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 8, 8, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 6, 6, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 6, 6, 0));
//        for (int i = 0; i < M; i++) {
//            while (!RightTriangle.isRightTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
//            }
//            rightTriangles.addTriangle(new RightTriangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
//        }
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 6, 6, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 5, 5, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 6, 6, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 8, 8, 0));
//        rightTriangles.addTriangle(new RightTriangle(0, 0, 0, 8, 8, 0));
//
//
//        System.out.println(rightTriangles);
//        System.out.println("-----------------------------------");
//        System.out.println("\nMax of Triangles:");
//        System.out.println(triangles.findMaxSquareTriangle());
//        System.out.println("\nMax of Right Triangles:");
//        System.out.println(rightTriangles.findMaxSquareTriangle());
//        System.out.println("\nMin of Triangles:");
//        System.out.println(triangles.findMinSquareTriangle());
//        System.out.println("\nMin of Right Triangles:");
//        System.out.println(rightTriangles.findMinSquareTriangle());
//        System.out.println("\nNumbers of same Right Triangles:");
//        System.out.println(rightTriangles.findSameTriangles());
//        System.out.println("-----------------------------------");





        TrianglesList trianglesList = new TrianglesList();
        for (int i = 0; i < N; i++) {
            while (!Triangle.isExistTriangle(tempX1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY1 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY2 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempX3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50, tempY3 = (int) (Math.random() * MAX_SIDE_SIZE) - 50)) {
            }
            trianglesList.add(new Triangle(tempX1, tempY1, tempX2, tempY2, tempX3, tempY3));
        }
        TrianglesList rightTrianglesList = new TrianglesList();
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 8, 8, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        rightTrianglesList.add(new Triangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 5, 5, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 6, 6, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 8, 8, 0));
        rightTrianglesList.add(new RightTriangle(0, 0, 0, 8, 8, 0));
        System.out.println(trianglesList);
        System.out.println(rightTrianglesList);
        System.out.println("-----------------------------------");
        System.out.println("\nMax of Triangles:");
        System.out.println(trianglesList.findMaxSquareTriangleList());
        System.out.println("\nMax of Right Triangles:");
        System.out.println(rightTrianglesList.findMaxSquareTriangleList());
        System.out.println("\nMin of Triangles:");
        System.out.println(trianglesList.findMinSquareTriangleList());
        System.out.println("\nMin of Right Triangles:");
        System.out.println(rightTrianglesList.findMinSquareTriangleList());
        System.out.println("\nNumbers of same Right Triangles:");
        System.out.println(rightTrianglesList.findSameTrianglesList());
    }

}
