package com.epam.training.student_vladimir_bendyna.task9;

import java.util.Scanner;

public class Average {
    public static int average() {
        Scanner sc = new Scanner(System.in);
        int sum, cur;
        sum = cur = sc.nextInt();
        int counter = 0;
        while (cur != 0) {
            cur = sc.nextInt();
            sum = sum + cur;
            counter ++;
            if (cur == 0) break;
        }
        sum = sum/counter;
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(average());
    }
}