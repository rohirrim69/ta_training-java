package com.epam.training.student_vladimir_bendyna.task5;

import java.io.IOException;
import java.util.Scanner;

public class HelloStrangers {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int numberOfStrangers = sc.nextInt();
        String result = "";
        int k = 0;
        if (numberOfStrangers == 0) {
            System.out.println("Oh, it looks like there is no one here");
        } else if (numberOfStrangers < 0) {
            System.out.println("Seriously? Why so negative?");
        } else {while (k < numberOfStrangers) {
            k++;
            Scanner sc1 = new Scanner(System.in);
            String nameOfGuest = sc1.nextLine();
            result += nameOfGuest + "\n";}
            String[] words = result.split("\n");
            for (String word : words) {
                System.out.println("Hello, " + word);
            }
        }

    }
}