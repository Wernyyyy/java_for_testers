package ru.stqa.geometry.figures;

public record Triangle(double sideA, double sideB, double sideC) {

    //    Конструктор и описание структуры заменены record.
//    Свойства объекта (side) - описание структуры.
//    double sideA;
//    double sideB;
//    double sideC;
//
//    Параметры функции (side) - конструктор.
//    public Triangle(double sideA, double sideB, double sideC) {
//        this.sideA = sideA;
//        this.sideB = sideB;
//        this.sideC = sideC;
//    }

    public double area() {
        double halfPerimeter = perimeter() / 2;
        return Math.pow(halfPerimeter * (halfPerimeter - sideA) * (halfPerimeter - sideB) * (halfPerimeter - sideC), 0.5);
    }

    public double perimeter() {
        return this.sideA + this.sideB + this.sideC;

    }

    public static void printTriangleArea(Triangle a) {
        String text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a.sideA, a.sideB, a.sideC, a.area());
        System.out.println(text);
    }

    public static void printTrianglePerimeter(Triangle p) {
        String text = String.format("Периметр треугольника со сторонами %f и %f и %f = %f", p.sideA, p.sideB, p.sideC, p.perimeter());
        System.out.println(text);
    }
}
