package com.epam.training.student_vladimir_bendyna.task8;

import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner sc = new Scanner(System.in);
        int max, cur;
        max = cur = sc.nextInt();
        while (cur != 0) {
            cur = sc.nextInt();
            if (cur > max && cur != 0) max = cur;
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(max());
    }
}