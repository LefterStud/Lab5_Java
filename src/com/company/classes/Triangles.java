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
            if (triangles[i].getSquare() > maxTriangle.getSquare()) {
                maxTriangle = triangles[i];
            }
        }
        return maxTriangle;
    }

    public Triangle findMinSquareTriangle() {
        Triangle minTriangle = triangles[0];
        for (int i = 1; i < triangles.length; i++) {
            if (triangles[i].getSquare() < minTriangle.getSquare()) {
                minTriangle = triangles[i];
            }
        }
        return minTriangle;
    }

    public String findSameTriangles() {
        String numberSameTriangles = "";
        for (int i = 0; i < triangles.length; i++) {
            for (int j = 1; j < triangles.length; j++) {
                if ((triangles[i].getASideSize()) == (triangles[j].getASideSize()) && ((triangles[i].getBSideSize()) == (triangles[j].getBSideSize())) && ((triangles[i].getCSideSize()) == (triangles[j].getCSideSize()) && i != j)) {
                    numberSameTriangles+=(i+1)+" ";
                    break;
                }
            }
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
