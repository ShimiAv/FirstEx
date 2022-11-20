package com.company;

import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int userInput = scanner.nextInt();
        int x1 = 0;
        int x2 = 1;
        int x3 = 0;
     while (x3<userInput){
      x3=x1+x2;
      x1=x2;
      x2=x3;
     }
     if (x3==userInput){
         System.out.println("The number you entered is in fibonacci series");
     }else {
         System.out.println("The number you entered is not in fibonacci series");
    }}}