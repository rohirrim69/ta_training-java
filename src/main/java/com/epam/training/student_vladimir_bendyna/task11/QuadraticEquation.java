package com.epam.training.student_vladimir_bendyna.task11;

import java.util.Locale;
import java.util.Scanner;

import static java.lang.Math.sqrt;

public class QuadraticEquation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        double D = (b * b) - (4 * a * c);
        if (D < 0) {
            System.out.println("no roots");}
        else if (D == 0) {
            System.out.println(-b / (2 * a));
        } else
            System.out.println((-b - Math.sqrt(D)) / (2 * a) + " " + (-b + Math.sqrt(D)) / (2 * a));
    }
}