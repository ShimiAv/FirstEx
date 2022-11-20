package com.company;

import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int userInput;
        int modOfNumber;
        int sum = 0;

        System.out.println("Enter a number");
        userInput = scanner.nextInt();

        while (userInput > 0) {
            modOfNumber = userInput % 10;
            sum += modOfNumber;
            userInput = userInput / 10;
        }
        System.out.println("The sum of is " + sum);

    }
}




