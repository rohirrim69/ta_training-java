package com.epam.training.student_vladimir_bendyna.task6;

import java.util.Scanner;

public class Snail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int h = sc.nextInt();
        int perDay = 0;
        int numberOfDays = 0;
        if (a <= b && a < h) {
            System.out.println("Impossible");
        } else {
            if (a >= h && a <= b) {
                System.out.println(numberOfDays + 1);
            } else {
                while (perDay < h) {
                    numberOfDays++;
                    perDay += a;
                    if (perDay == h) break;
                    perDay -= b;
                }
                System.out.println(numberOfDays);
            }
        }
    }
}