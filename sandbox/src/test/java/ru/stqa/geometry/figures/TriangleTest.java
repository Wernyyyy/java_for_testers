package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void canCalculatePerimeter() {
        var t = new Triangle(3.0, 4.0, 5.0);
        double result = t.perimeter();
        Assertions.assertEquals(12.0, result);

    }

    @Test
    void canCalculateArea() {
        var a = new Triangle(3.0, 4.0, 5.0);
        double result = a.area();
        Assertions.assertEquals(6.0, result);

    }

}
