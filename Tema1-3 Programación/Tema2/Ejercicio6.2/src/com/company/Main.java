package com.company;

public class Main {

    public static void main(String[] args) {
	double baseImponible = 100.00;
	double resultado = baseImponible + (baseImponible * 0.21);

        System.out.println("Base Imponible: " + baseImponible + "€");
        System.out.println("IVA: " + (baseImponible * 0.21) + "€");
        System.out.println("Total: " + resultado + "€");
    }
}
