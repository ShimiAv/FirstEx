package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number");
        int firstNumA = scanner.nextInt();
        System.out.println("Enter the second number");
        int secondNumB = scanner.nextInt();
        System.out.println("Enter the third number");
        int thirdNumC = scanner.nextInt();
        double delta = Math.sqrt(secondNumB*secondNumB-4*firstNumA*thirdNumC);
        double x1 = (-secondNumB + delta )/2*firstNumA;
        double x2 = (-secondNumB - delta)/2*firstNumA;



        if (delta>0) {
            System.out.println("There is two routs for your quadratic equation " + x1 + " and " + x2);
        } if (delta==0){
            System.out.println("There is one rout for your quadratic equation " + x1);
        }else {
            System.out.println("There is no any rout for your quadratic equation ");
        }


}}
