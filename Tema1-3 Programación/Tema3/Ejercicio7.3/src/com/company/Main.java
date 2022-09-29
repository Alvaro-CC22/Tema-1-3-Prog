package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double baseImponible;
        System.out.println("Dime el precio de la factura sin IVA");
        baseImponible = sc.nextDouble();
        System.out.println("Base Imponible: " + baseImponible + "€");
        System.out.println("IVA: " + (baseImponible * 0.21) + "€");
        System.out.println("Total: " + (baseImponible + (baseImponible * 0.21)) + "€");
    }
}
