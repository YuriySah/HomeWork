package Lesson_13;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void triangleAreaTest() {
        TriangleClass triangle = new TriangleClass();
        double actual = triangle.triangleArea(3,4,5);
        double expected = 6.0;
        assertEquals(actual,expected);
    }
}
