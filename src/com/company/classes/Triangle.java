package com.company.classes;

public class Triangle {
    private double x1;
    private double x2;
    private double x3;
    private double y1;
    private double y2;
    private double y3;

    public Triangle(double x1, double x2, double x3, double y1, double y2, double y3) {
        this.x1 = x1;
        this.x2 = x2;
        this.x3 = x3;
        this.y1 = y1;
        this.y2 = y2;
        this.y3 = y3;
    }

    public void setX1(double x1) {
        this.x1 = x1;
    }

    public void setX2(double x2) {
        this.x2 = x2;
    }

    public void setX3(double x3) {
        this.x3 = x3;
    }

    public void setY1(double y1) {
        this.y1 = y1;
    }

    public void setY2(double y2) {
        this.y2 = y2;
    }

    public void setY3(double y3) {
        this.y3 = y3;
    }

    public double getX1() {
        return x1;
    }

    public double getX2() {
        return x2;
    }

    public double getX3() {
        return x3;
    }

    public double getY1() {
        return y1;
    }

    public double getY2() {
        return y2;
    }

    public double getY3() {
        return y3;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "x1=" + x1 +
                ", x2=" + x2 +
                ", x3=" + x3 +
                ", y1=" + y1 +
                ", y2=" + y2 +
                ", y3=" + y3 +
                '}';
    }
//    @Override
//    public String toString() {
//        return "Triangle{" +
//                "aSide=" + aSide +
//                ", bSide=" + bSide +
//                ", cSide=" + cSide +
//                '}';
//    }
//
//    private double aSide;
//    private double bSide;
//    private double cSide;
//
//    public Triangle(final double x1, final double x2, final double x3, final double y1, final double y2, final double y3) {
//        this.setASide(x1, y1, x2, y2);
//        this.setBSide(x3, y3, x2, y2);
//        this.setCSide(x1, y1, x3, y3);
//    }
//
//    public void setASide(double x1, double y1, double x2, double y2) {
//        this.aSide = Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
//    }
//
//    public void setBSide(double x3, double y3, double x2, double y2) {
//        this.bSide = Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
//    }
//
//    public void setCSide(double x1, double y1, double x3, double y3) {
//        this.cSide = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
//    }
//
//    public double getASide() {
//        return aSide;
//    }
//
//    public double getBSide() {
//        return bSide;
//    }
//
//    public double getCSide() {
//        return cSide;
//    }
}

