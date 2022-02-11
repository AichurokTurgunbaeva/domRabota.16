package com.company;

public class Circle {

    private static  double PI;
    private static double radius;

    public Circle() {
    }
    public Circle(double PI, double radius) {
        this.PI = PI;
        this.radius = radius;
    }
    public double getPI() {
        return PI;
    }
    public void setPI(double PI) {
        this.PI = PI;
    }
    public double getRadius() {
        return radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public static void calculateArea() {
        double area = (radius * radius) * PI;
            System.out.println("Area of the circle is: "+area);
    }
    static void circumference() {
        double circumference1 = PI * 2 * radius;
            System.out.println("Circumference of the circle is: "+circumference1);
        }

}
