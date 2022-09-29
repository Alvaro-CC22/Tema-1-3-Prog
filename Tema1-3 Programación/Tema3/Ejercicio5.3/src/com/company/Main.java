package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double altura, base;

        System.out.println("Dime la altura del rectángulo:");
        altura = sc.nextDouble();
        System.out.println("Dime la base del rectángulo:");
        base = sc.nextDouble();
        System.out.println("El area del rectángulo es: " + (base * altura));
    }
}
