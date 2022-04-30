package com.company.classes;

public class Triangles {
    final private Triangle[] triangles;
    private int currentTrianglesNumber;

    public Triangles(final int triangleNumber) {
        this.triangles = new Triangle[triangleNumber];
        currentTrianglesNumber = -1;
    }

    public void addTriangle(Triangle triangle) {
        if (++currentTrianglesNumber < triangles.length) {
            triangles[currentTrianglesNumber] = triangle;
        }
    }

    public Triangle findMaxSquareTriangle() {
        Triangle maxTriangle = triangles[0];
        for (int i = 1; i < triangles.length; i++) {
            if (triangles[i].getSquare() >= maxTriangle.getSquare()) {
                maxTriangle = triangles[i];
            }
        }
        return maxTriangle;
    }

    public Triangle findMinSquareTriangle() {
        Triangle minTriangle = triangles[0];
        for (int i = 1; i < triangles.length; i++) {
            if (triangles[i].getSquare() <= minTriangle.getSquare()) {
                minTriangle = triangles[i];
            }
        }
        return minTriangle;
    }

    public String findSameTriangles() {
        String numberSameTriangles = "";
        Triangle sameTriangle = triangles[0];
        int k = 0;
        for (int i = 1; i < triangles.length; i++) {
            if ((triangles[i].getASideSize()) == (sameTriangle.getASideSize()) && ((triangles[i].getBSideSize()) == (sameTriangle.getBSideSize())) && ((triangles[i].getCSideSize()) == (sameTriangle.getCSideSize()))) {
                k += 1;
                if (k == 1) {
                    numberSameTriangles += i + " ";
                }
                numberSameTriangles += i + 1 + " ";
            }
            sameTriangle = triangles[i];
        }
        return numberSameTriangles;
    }

    @Override
    public String toString() {
        String result = "Triangles: " + System.lineSeparator();
        for (int i = 0; i < triangles.length; i++) {
            result += "№" + (i + 1) + " " + triangles[i] + System.lineSeparator();
        }
        return result;
    }

}
