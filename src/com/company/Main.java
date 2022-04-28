package com.company;

import com.company.classes.Triangle;

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
     * */
    public static void main(String[] args) {
        double random = (int)(Math.random()*100+1);
        final Triangle triangle1 = new Triangle((int)(Math.random()*100+1), (int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1));
        final Triangle triangle2 = new Triangle((int)(Math.random()*100+1), (int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1));
        final Triangle triangle3 = new Triangle((int)(Math.random()*100+1), (int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1));
        final Triangle triangle4 = new Triangle((int)(Math.random()*100+1), (int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1));
        final Triangle triangle5 = new Triangle((int)(Math.random()*100+1), (int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1),(int)(Math.random()*100+1));
        System.out.println(triangle1);
        System.out.println(triangle2);
        System.out.println(triangle3);
        System.out.println(triangle4);
        System.out.println(triangle5);
        //todo Make array of Triangles

    }
}
