package com.epam.training.student_vladimir_bendyna.task4;

import java.util.Scanner;

public class MeetAnAgent {
    final static int PASSWORD = 133976; //You can change pass, but don't change the type
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int pass = sc.nextInt();
        if (pass == PASSWORD)
        {
            System.out.println("Hello, Agent");}
        else System.out.println("Access denied");

    }
}