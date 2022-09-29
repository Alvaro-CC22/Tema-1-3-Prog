package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y;

        System.out.println("Dime un número:");
        x = sc.nextInt();
        System.out.println("Dime otro número:");
        y = sc.nextInt();
        System.out.println("Suma: " + x + " + " + y + " = " + (x + y));
        System.out.println("Resta: " + x + " - " + y + " = " + (x - y));
        System.out.println("División: " + x + " / " + y + " = " + ((double) x / (double) y));
        System.out.println("Multiplicación: " + x + " x " + y + " = " + (x * y));
    }
}
