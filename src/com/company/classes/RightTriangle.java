package com.company.classes;

public class RightTriangle extends Triangle {
    public RightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        super(x1, y1, x2, y2, x3, y3);
    }

    public static boolean isRightTriangle(int x1, int y1, int x2, int y2, int x3, int y3) {
        double A = getSideSize(x1, y1, x2, y2);
        double B = getSideSize(x3, y3, x2, y2);
        double C = getSideSize(x1, y1, x3, y3);
        return (A + B > C) && (B + C > A) && (A + C > B) && (A > 0) && (B > 0) && (C > 0) && ((A * A + B * B == C * C) || (B * B + C * C == A * A) || (A * A + C * C == B * B));
    }

    @Override
    public String toString() {
        return "Right" + super.toString();
    }
}
