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
        boolean[] sameArray = new boolean[triangles.length];
        boolean isFirstEqual;
        for (int i = 0; i < triangles.length; i++) {
            isFirstEqual = true;
            for (int j = i + 1; j < triangles.length; j++) {
                if ((!sameArray[j]) && (triangles[j].getASideSize()) == (triangles[i].getASideSize()) && ((triangles[j].getBSideSize()) == (triangles[i].getBSideSize())) && ((triangles[j].getCSideSize()) == (triangles[i].getCSideSize()))) {
                    sameArray[j] = true;
                    if (isFirstEqual) {
                        isFirstEqual = false;
                        numberSameTriangles += (i + 1) + " ";
                    }
                    numberSameTriangles += (j + 1) + " ";
                }
            }
            numberSameTriangles += "\n";
        }
        return numberSameTriangles;
    }
    //1 2 7 9 10
    //3 12 13
    //4 5 8 11

    @Override
    public String toString() {
        String result = "Triangles: " + System.lineSeparator();
        for (int i = 0; i < triangles.length; i++) {
            result += "№" + (i + 1) + " " + triangles[i] + System.lineSeparator();
        }
        return result;
    }

}
