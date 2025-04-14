package ru.stqa.geometry.figures;

public class Triangle {

   /* public static void printTriangleArea(double a, double b, double c){
        var text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, triangleArea(a,b,c));
    }

    private static double triangleArea(double a, double b, double c) { return a
    }
*/
    public static void printTrianglePerimeter(double a, double b, double c){
        String text = String.format("Площадь треугольника со сторонами %f и %f и %f = %f", a, b, c, perimeter(a, b, c));
        System.out.println (text);
    }




    public static double perimeter(double a, double b, double c) {
        return a + b + c;
    }



}
