package com.bridgelabz.workshop1;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = scanner.nextInt();
        int temp = num;
        int lastDigit=1,reversedNo=0;
        while(temp!=0){
            lastDigit = temp % 10;
            reversedNo = reversedNo*10 + lastDigit;
            temp /= 10;
        }
        System.out.println(num + " reversed is " + reversedNo);
    }
}
