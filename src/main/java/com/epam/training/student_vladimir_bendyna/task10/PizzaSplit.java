package com.epam.training.student_vladimir_bendyna.task10;

import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numberOfFriends = sc.nextInt();
        int pieces = sc.nextInt();
        int counter = 1;
        int sum;
        sum = pieces;
        while (sum%numberOfFriends !=0) {
            sum +=pieces;
            counter ++;
        }
        System.out.println(counter);
    }
}