package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Dime un número:");
        x = sc.nextInt();
        System.out.println("Dime otro número:");
        y = sc.nextInt();
        System.out.println("El resultado es: " + (x * y));
    }
}
