package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTest {
    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(12.0, Triangle.perimeter());

    }
    @Test

    void canCalculatePerimeterTwo() {
        double sideA = new Triangle(3.0);
        double sideB = new Triangle(4.0);
        double sideC = new Triangle(5.0);
        double result = Triangle.perimeter();
        Assertions.assertEquals(12.0, Triangle.perimeter());

    }

}
