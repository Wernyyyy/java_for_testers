package ru.stqa.geometry.figures;

public class Triangle {

    public static void printTriangleArea(double a, double b, double c) {
        String text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, triangleArea(a, b, c));
        System.out.println(text);
    }

    private static double triangleArea(double a, double b, double c) {
        double HalfPerimeter = halfPerimeter(a, b, c);
        return Math.pow(HalfPerimeter * (HalfPerimeter - a) * (HalfPerimeter - b) * (HalfPerimeter - c), 0.5);
    }

    public static void printTrianglePerimeter(double a, double b, double c) {
        String text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", a, b, c, perimeter(a, b, c));
        System.out.println(text);
    }


    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static double halfPerimeter(double a, double b, double c) {
        double Perimeter = perimeter(a, b, c);
        return Perimeter / 2;

    }


}
