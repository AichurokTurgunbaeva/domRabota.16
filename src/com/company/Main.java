package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Set the radius of cicrle: ");
        Circle circle = new Circle(3.14, scanner.nextDouble());
        Circle.calculateArea();
        Circle.circumference();
    }
}
