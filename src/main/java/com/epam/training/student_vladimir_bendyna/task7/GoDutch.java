package com.epam.training.student_vladimir_bendyna.task7;

import java.util.Scanner;

public class GoDutch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalPrice = sc.nextInt();
        int numberOfFriends = sc.nextInt();
        int moneyForPay = 0;
        if (totalPrice < 0) {
            System.out.println("Bill total amount cannot be negative");
        } else if (numberOfFriends <= 0) {
            System.out.println("Number of friends cannot be negative or zero");
        } else {
            moneyForPay = (totalPrice*110) / (numberOfFriends*100);
            System.out.println(moneyForPay);
        }
    }
}