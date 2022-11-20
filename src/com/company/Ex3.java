package com.company;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int userInput;
        int spacing;
        int rows;
        int amount;

        do {
            System.out.println("Enter a number");
            userInput = scanner.nextInt();

        } while (userInput < 3 || userInput % 2 == 0);
        for (rows = 0; rows <= userInput / 2 + 1; rows++) {
            for (spacing = userInput / 2 - rows; spacing >= 0; spacing--) {
                System.out.print(" ");
            }
            for (amount = 1; amount <= rows; amount++) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();
        }
        for (rows = userInput / 2; rows >= 0; rows--) {
            for (spacing = userInput / 2 - rows; spacing >= 0; spacing--) {
                System.out.print(" ");
            }

            for (amount = rows; amount > 0; amount--) {
                System.out.print(" ");
                System.out.print("*");
            }
            System.out.println();


        }
    }
}


