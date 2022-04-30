package Lesson_13;

import static java.lang.Math.sqrt;

public class TriangleClass {
    public double triangleArea(int a, int b, int c) {
        double p = (a + b + c) / 2;
        double s = sqrt((p * (p - a) * (p - b) * (p - c)));
        return s;
    }
}
