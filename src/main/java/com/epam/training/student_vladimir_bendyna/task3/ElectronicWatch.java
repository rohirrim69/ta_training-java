package com.epam.training.student_vladimir_bendyna.task3;

import java.util.Scanner;

public class ElectronicWatch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int seconds = scanner.nextInt();
        int h = (seconds % (3600 * 24)) / 3600;
        int m = (seconds % 3600) / 60;
        int s = (seconds % 60);
        if (m < 10) {
            if (s < 10) {
                System.out.println(h + ":0" + m + ":0" + s);
            } else if (s >= 10) {
                System.out.println(h + ":0" + m + ":" + s);
            }

        } else if (m >= 10) {
            if (s < 10) {
                System.out.println(h + ":" + m + ":0" + s);
            } else if (s >= 10) {
                System.out.println(h + ":" + m + ":" + s);
            }

        }
    }
}