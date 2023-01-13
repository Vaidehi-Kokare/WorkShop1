package com.bridgelabz.workshop1;

import java.util.Scanner;

public class PrimeNoInRange {
    static boolean primeNumber(int num) {
        for (int i =2; i<=num; i++) {
            if(num%i!=0){
                break;
            }

        }
        return true;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter lower limit");
        int lower = scanner.nextInt();
        System.out.println("Enter upper limit");
        int upper = scanner.nextInt();
        System.out.println("Prime Numbers between " + lower + " and " + upper);
        for (int i = lower; i <= upper; i++) {
            if (primeNumber(i)== true)
                System.out.println(i);
        }
    }
}
