package com.company.classes;

public class utilClass {
    //todo Make get Sides

    //    public static double getASideSize(double x1, double y1, double x2, double y2){
//        return Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
//    }
//    public static double getBSideSize(double x3, double y3, double x2, double y2){
//        return Math.sqrt(Math.pow((x3-x2),2)+Math.pow((y3-y2),2));
//    }
//    public static double getCSideSize(double x1, double y1, double x3, double y3){
//        return Math.sqrt(Math.pow((x1-x3),2)+Math.pow((y1-y3),2));
//    }
    public static double getPerimeter(double aSide, double bSide, double cSide) {
        return (aSide + bSide + cSide) / 3;
    }
    //todo Make square
    public static double getSquare(double aSide, double bSide, double cSide){

        return Math.sqrt(getPerimeter(aSide,bSide,cSide)/2);
    }
}
