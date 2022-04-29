package com.company.classes;

public class Triangles {
    private Triangle[] triangles;
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

    @Override
    public String toString() {
        String result = "Triangles: " + System.lineSeparator();
        for (final Triangle triangle : triangles) {
            result += triangle + System.lineSeparator();
        }
        return result;
    }

}
