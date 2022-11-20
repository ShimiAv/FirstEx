package com.company;

public class Ex7 {
    public static void main(String[] args) {
        int number;
        int a;
        int sum = 0;

        System.out.println("The narcissistic numbers from 1 to 1000 is:");
        for (int i=1; i<=1000; i++){
            number = i;
            while (number>0){
                a=number%10;
                sum = sum + (a*a*a);
                number = number/10;
            }
            if (sum == i){
                System.out.println(i + " ");
            }
            sum = 0;
        }

    }
}
