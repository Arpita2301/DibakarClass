package com.application.dibakar.programs;

import java.util.Scanner;

public class Factorials {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int a = scanner.nextInt();
        int b =1;
        for(int i=a; i>0; i--){
            b = b*i;
        }
        System.out.println("Factorial of "+a+" is "+b);
    }
}
