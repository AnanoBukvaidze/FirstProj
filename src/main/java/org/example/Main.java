package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("What color it the sky?");
        String answer_0 = scanner.next();
        String answer = answer_0.toLowerCase(Locale.ROOT);

        String correct_answer = "blue";

        while(answer.compareTo(correct_answer) != 0){

            System.out.println("Try again");
            answer = scanner.next();
        }
        System.out.print("Well Done!");

    }
}